package parallelarrays;

public class Arrays1 {

	public static void main(String[] args) {
		int[] sixIntArray = {10,20,30,40,50,60};
		for (int i : sixIntArray) {
			System.out.println(i);
		}
		for (int i = sixIntArray.length; i-- > 0; )
				{
			System.out.println(sixIntArray[i]);
		}
		int total = 0;
		for (int i : sixIntArray) {
			total += i;
		}
		System.out.println(total);
		System.out.println((total/6));
	}

}
