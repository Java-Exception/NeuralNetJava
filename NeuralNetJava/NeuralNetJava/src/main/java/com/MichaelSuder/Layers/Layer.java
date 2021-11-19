package com.MichaelSuder.Layers;
import com.MichaelSuder.Math.MyMath;
public class Layer {


	  private double[] inputs_1d;
	  private double[][] inputs_2d;
	  private double[] weights_1d;
	  private double[][] weights_2d;
	  private double bias;
	  private double[] biases;

	  public Layer(double[] inputs_1d, double[] weights_1d, double bias) {
	    this.inputs_1d = inputs_1d;
	    this.weights_1d = weights_1d;
	    this.bias = bias;
	  }

	  public Layer(double[][] inputs_2d, double[][] weights_2d, double[] biases) {
	    this.inputs_2d = inputs_2d;
	    this.weights_2d = weights_2d;
	    this.biases = biases;
	  }


	  // public double forward(double[] inputs) {
	  //   return MyMath.Dot(inputs, this.weights_1d, this.bias);
	  // }

	  public double[] forward(double[] inputs) {
	    return MyMath.Dot(inputs, this.weights_2d, this.biases);
	  }

	  public double[][] forward(double[][] inputs2D) {
	    return MyMath.MatrixProduct(inputs2D, MyMath.Transpose(this.weights_2d), this.biases);
	  }

	  // Getters and setters, may be removed later
	  public double[]   getInput1D() { return this.inputs_1d; }
	  public double[][] getInput2D() { return this.inputs_2d; }
	  public double[]   getWeights1D() { return this.weights_1d; }
	  public double[][] getWeights2D() { return this.weights_2d; }
	  public double     getBias() { return this.bias; }
	  public double[]   getBiases() { return this.biases; }
	  public void setInput1D(double[] inputs_1dIn) { this.inputs_1d = inputs_1dIn; }
	  public void setInput2D(double[][] inputs_2dIn) { this.inputs_2d = inputs_2dIn; }
	  public void setWeights1D(double[] weights_1dIn) { this.weights_1d = weights_1dIn; }
	  public void setWeights2D(double[][] weights_2dIn) { this.weights_2d = weights_2dIn; }
	  public void setBias(double biasIn) { this.bias = biasIn; }
	  public void setBiases(double[] biasesIn) { this.biases = biasesIn; }

	}
