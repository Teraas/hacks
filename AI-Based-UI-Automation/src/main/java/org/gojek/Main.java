package org.gojek;

import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.gojek.deeplearning.*;
import org.nd4j.linalg.dataset.DataSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DataPreprocessing preprocessor = new DataPreprocessing();
        DataSet dataSet = preprocessor.preprocessData("/Users/harishkumar/git/hackathon/AI-Based-UI-Automation/src/main/resources/data.csv");

        ModelBuilder builder = new ModelBuilder();
        MultiLayerConfiguration config = builder.buildModel(10, 2);
        MultiLayerNetwork model = new MultiLayerNetwork(config);
        model.init();

        ModelTrainer trainer = new ModelTrainer();
        trainer.trainModel(model, dataSet, 10);

        ModelEvaluator evaluator = new ModelEvaluator();
        evaluator.evaluateModel(model, dataSet);

        ModelSaver saver = new ModelSaver();
        try {
            saver.saveModel(model, "self_healing_model.zip");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}