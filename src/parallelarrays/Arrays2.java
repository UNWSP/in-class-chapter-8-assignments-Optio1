package parallelarrays;

public class Arrays2 {

	public static void main(String[] args) {
		int loopFor = 10;
		double[] powers = {1,2,3,4,5,6,7,8,9,10};
		int[] array = new int[10];
		for ( int i = 10; i - 1; i >= 0; ) {
			powers[(int) Math.round(i)] = Math.pow(2, i + 1);
		}
		for (double i : powers) {
			System.out.println(i);
		}

	}

}
