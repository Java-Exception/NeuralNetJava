package com.MichaelSuder.Math;

import java.util.Arrays;
import java.lang.Math;
public class MyMath {

	public static double Dot(double[] inputs, double[] weights, double bias) {
    double result = 0;
    if(inputs.length == weights.length) {
      for(int i = 0; i < inputs.length; i++) {
          result += inputs[i] * weights[i];
      }
      return result + bias;
    } else {
      return -1;

    }
  }

  public static double[] Dot(double[] inputs, double[][] weights, double[] biases) {
    double[] results = new double[weights.length];
    for(int i = 0; i < weights.length; i++) {
      System.out.println();
      if(inputs.length == weights[i].length) {
        for(int k = 0; k < inputs.length; k++) {
          System.out.print(inputs[k] + " * " + weights[i][k] + " = " + inputs[k] * weights[i][k] + " | ");
          results[i] += inputs[k] * weights[i][k];
        }
        System.out.println(" Sum = " + results[i]);
      } else {
        System.out.println("Arrays not homologous");
        return results;
      }
    }
    System.out.println("Biases: "+Arrays.toString(biases));
    for(int i = 0; i < results.length; i++) {
      results[i] += biases[i];
    }
    return results;
  }

  public static double[][] MatrixProduct(double[][] inputs, double[][] weights, double[] biases) {
    double[][] results = new double[inputs.length][inputs.length];
    if (inputs[1].length == weights.length) {
      for (int i = 0; i < inputs.length; i++) {
        for (int k = 0; k < inputs.length; k++) {
          for (int w = 0; w < weights.length; w++) {
            //System.out.println(inputs[i][w] + " * " + weights[w][k] + " = " + inputs[i][w] * weights[w][k]);
            results[i][k] += inputs[i][w] * weights[w][k];
          }
        }
      }
      for (int i = 0; i < results.length; i++) {
        for (int k = 0; k < results[i].length; k++) {
          results[i][k] += biases[k];
        }
      }
      return results;
    } else {
      System.out.println("Arrays not homologous");
      return results;
    }
  }

  public static double[][] Round(double[][] input, double dec) {
    for (int i = 0; i < input.length; i++) {
      for (int k = 0; k < input.length; k++) {
        input[i][k] = Math.floor(input[i][k] * dec) / dec;
      }
    }
    return input;
  }

  public static double[][] Transpose(double[][] input) {
    double[][] outputs = new double[input[0].length][input.length];
      for (int i = 0; i < input.length; i++) {
        for (int o = 0; o < input[i].length; o++) {
          outputs[o][i] = input[i][o];
        }
      }
    return outputs;
  }

  public static String PrintArray2D(double[][] input) {
    String output = "";
    for (int i = 0; i < input.length; i++) {
      output += Arrays.toString(input[i]).concat("\n");
    }
    return output;
  }
}
