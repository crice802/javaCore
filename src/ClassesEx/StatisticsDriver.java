package ClassesEx;

public class StatisticsDriver {
	public static void main(String[] args) {
		double[] values = new double[100];
		for (int i = 0; i < 100; i++) {
			values[i] = Math.random() * 100;
		}
		Statistics stats = new Statistics(values);
		System.out.println(stats.toString());
	}
}
