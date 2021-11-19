package NeuralNetJava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.MichaelSuder.Layers.Layer;
import com.MichaelSuder.Math.MyMath;

class NeuralNetTest {
	
	double[][] inputs = {  {1.0, 2.0, 3.0, 2.5},
			               {2.0, 5.0, -1.0, 2.0},
			               {-1.5, 2.7, 3.3, -0.8} };
	double[][] weights = { {0.2, 0.8, -0.5, 1.0},
						   {0.5, -0.91, 0.26, -0.5},
						   {-0.26, -0.27, 0.17, 0.87} };
	double[][] weights2 = { {0.1, -0.14, 0.5},
							{-0.5, 0.12, -0.33},
							{-0.44, 0.73, -0.13} };
	double[] biases =       {2.0, 3.0, 0.5};
	double[] biases2 =      {-1.0, 2.0, -0.5};
	Layer l1 = new Layer(inputs, weights, biases);
	double[][] layerOneOutputs = l1.forward(inputs);
	Layer l2 = new Layer(layerOneOutputs, weights2, biases2);
	private double[][] finalOutput = { {0.503, -1.0419, -2.0388},
									   {0.2434, -2.7332, -5.7633},
									   {-0.9932, 1.4125, -0.3566} };
	private double[][] finalOutputFromMethodCall = MyMath.Round(l2.forward(layerOneOutputs), 10000);
	@Test
	void testOutputOfTwoLayers() {
		assertArrayEquals(finalOutput, finalOutputFromMethodCall);
	}

}
