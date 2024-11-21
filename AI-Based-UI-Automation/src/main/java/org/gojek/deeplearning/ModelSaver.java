package org.gojek.deeplearning;

import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.util.ModelSerializer;
import java.io.File;

public class ModelSaver {
    public void saveModel(MultiLayerNetwork model, String path) throws Exception {
        File modelFile = new File(path);
        ModelSerializer.writeModel(model, modelFile, true);
    }

    public MultiLayerNetwork loadModel(String path) throws Exception {
        return ModelSerializer.restoreMultiLayerNetwork(new File(path));
    }

}

