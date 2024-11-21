package org.gojek.models;

//import org.gojek.LocatorModel;
//import org.tensorflow.Tensor;
//import org.tensorflow.SavedModelBundle;
//import org.tensorflow.Tensor;
//import org.tensorflow.ndarray.NdArray;
//import org.tensorflow.ndarray.StdArrays;
//import org.tensorflow.types.TFloat32;

public class TrainLocalModel {
    public static void main(String[] args) {
        // Example input and output data
        float[][] inputs = { {0.5f, 0.8f, 0.3f, 0.1f}, {0.6f, 0.7f, 0.2f, 0.4f} };
        int[] outputs = { 0, 1 }; // Locator types (e.g., 0=id, 1=CSS, 2=XPath)

        // Preprocess inputs
//        Tensor inputTensor = DataProcessing.preprocessInput(inputs);
//
//        // Build model
//        Sequential model = LocatorModel.buildModel();
//
//        // Train model
//        model.fit(inputTensor, Tensor.of(outputs), 10, 32); // Epochs: 10, Batch size: 32
//
//        // Save or evaluate model
//        model.save("locator_model");

        //TensorFlowModel model = new TensorFlowModel("path/to/saved/model");
        String modelPath = "/Users/harishkumar/git/hackathon/AI-Based-UI-Automation/src/main/resources/locator_model_saved";
//        try (SavedModelBundle model = SavedModelBundle.load(modelPath)) {
//
//            // Create input tensor (example: a 1D tensor with three elements)
//            float[] inputData = {1.0f, 2.0f, 3.0f};
//            Tensor<Float> inputImage = null;
//            TFloat32 inputTensor = TFloat32.tensorOf(StdArrays.ndCopyOf(inputData));
//            Tensor<?> inout = Tensor.create(inputTensor);
//
//
//            // Run the model
//            Tensor<?> outputTensor =  model
//                    .session()
//                    .runner()
//                    .feed("input_tensor", inputImage)
//                    .feed("serving_default_input", inout)  // Replace with actual input tensor name
//                    .fetch("StatefulPartitionedCall")           // Replace with actual output tensor name
//                    .run()
//                    .get(0);
//
//            // Extract and print the output
//            float[][] res = outputTensor.copyTo(new float[1][10][4])[0];
//            //NdArray<Float> outputArray = outputTensor; //outputTensor.data();
//            //System.out.println("Model output: " + outputArray);
//        }
    }
}

