package ClassesEx;

public class Statistics {
	private int nSamples;
	private double min = Double.MAX_VALUE, max = Double.MIN_VALUE, sum;

	public Statistics(double[] values) {
		for (int i = 0; i < values.length; i++) {
			double v = values[i];
			if (v < min)
				min = v;
			if (v < max)
				max = v;
			sum += v;
			nSamples++;

		}
	}

	// getters:
	public int getSampleCount() {
		return nSamples;
	}

	public double getMinimum() {
		return min;
	}

	public double getMaximum() {
		return max;
	}

	public double average() {
		return (nSamples == 0) ? Double.NaN : sum / nSamples;
	}

	// Overrides toString method
	public String toString() {
		return "There are " + nSamples + " samples.\n" + min + " is the minimum value from the samples.\n" + max
				+ " is the maximum value from the samples.";
	}

}
