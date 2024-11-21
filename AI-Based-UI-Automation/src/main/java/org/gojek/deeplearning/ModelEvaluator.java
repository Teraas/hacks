package org.gojek.deeplearning;

import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.linalg.dataset.DataSet;
import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;

public class ModelEvaluator {
    public void evaluateModel(MultiLayerNetwork model, DataSet testData) {
        double accuracy = model.evaluate((DataSetIterator) testData).accuracy();
        System.out.println("Model Accuracy: " + accuracy);
    }
}

