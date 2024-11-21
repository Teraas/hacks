package org.gojek.deeplearning;

import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.conf.layers.DenseLayer;
import org.deeplearning4j.nn.conf.layers.OutputLayer;
import org.deeplearning4j.nn.weights.WeightInit;
import org.nd4j.linalg.activations.Activation;
import org.nd4j.linalg.learning.config.Adam;
import org.nd4j.linalg.lossfunctions.LossFunctions;

public class ModelBuilder {
    public MultiLayerConfiguration buildModel(int inputSize, int outputSize) {
        return new NeuralNetConfiguration.Builder()
                .weightInit(WeightInit.XAVIER)
                .updater(new Adam(0.001)) // Learning rate
                .list()
                .layer(new DenseLayer.Builder()
                        .nIn(inputSize)  // Number of input features
                        .nOut(128)       // Number of neurons in hidden layer
                        .activation(Activation.RELU)
                        .build())
                .layer(new DenseLayer.Builder()
                        .nOut(64)        // Second hidden layer
                        .activation(Activation.RELU)
                        .build())
                .layer(new OutputLayer.Builder(LossFunctions.LossFunction.MCXENT)
                        .nOut(outputSize) // Number of classes (locators)
                        .activation(Activation.SOFTMAX)
                        .build())
                .build();
    }
}

