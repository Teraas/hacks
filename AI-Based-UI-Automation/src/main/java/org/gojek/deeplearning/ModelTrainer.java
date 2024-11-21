package org.gojek.deeplearning;

import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.optimize.listeners.ScoreIterationListener;
import org.nd4j.linalg.dataset.DataSet;

public class ModelTrainer {
    public static void trainModel(MultiLayerNetwork model, DataSet trainingData) {
        model.fit(trainingData);
    }

    public void trainModel(MultiLayerNetwork model, DataSet trainingData, int epochs) {
        // Attach a listener to log loss during training
        model.setListeners(new ScoreIterationListener(10));

        // Train the model
        for (int i = 0; i < epochs; i++) {
            model.fit(trainingData);
        }
    }

}

