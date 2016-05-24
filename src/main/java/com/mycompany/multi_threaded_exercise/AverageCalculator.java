package com.mycompany.multi_threaded_exercise;

/**
 *
 * @author tony.ye
 */
public class AverageCalculator {

	public double calculateAverage(double[] list) {
		double total = 0;
		int count = list.length;
		for (double num : list) {
			total += num;
		}
		return total/count;
	}
}