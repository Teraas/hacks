package org.gojek.deeplearning;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;
import org.nd4j.linalg.dataset.DataSet;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.dataset.api.preprocessor.NormalizerStandardize;

public class DataPreprocessing {
    public DataSet preprocessData(String filePath) {
        // Load the dataset from CSV (use libraries like Apache Commons CSV)
        INDArray features = Nd4j.create(new double[][] {
                // Example data: [locator type, enabled, visible, depth]
                {0, 1, 1, 0.3},
                {1, 0, 1, 0.4}
        });
        INDArray labels = Nd4j.create(new double[][] {
                // Example labels
                {1, 0}, // First element is correct
                {0, 1}  // Second element is correct
        });

        // Normalize features
        NormalizerStandardize normalizer = new NormalizerStandardize();
        DataSet dataSet = new DataSet(features, labels);
        normalizer.fit(dataSet);
        normalizer.transform(dataSet);

        return dataSet;
    }
}

