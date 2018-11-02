import java.util.*;

public class day_1 {
	
	static Scanner scan = new Scanner(System.in);
	
	/* FILE: Inverse Captcha
	 * STATUS: Completed
	 * 
	 * Inverse Captcha problem is when given a list of numbers as input a sum is
	 * calculated by every number that matches the next number in line. This input
	 * is also to be considered a circular list.
	 * Ex.	1122 gives a sum of 3 (1+2)
	 * 		1111 gives a sum of 4 (1+1+1+1)
	 * 		91212129 gives a sum of 9 (list to be considered circular)
	 */
	public static void main(String[] args) {
		begin();
	}
	
	/* Method to begin Inverse Captcha experiment */
	public static void begin(){
		String input = "";
		System.out.print("Enter input sequence: ");
		input = scan.nextLine();
		System.out.print("Captcha Sum: " + evaluate(toList(input)));
	}
	
	/* The toList method is to fill an integer array with the STRING input values */
	public static int[] toList(String seq) {
		int[] list = new int[seq.length()];
		
		for (int i = 0; i < seq.length(); i++) {
			list[i] = Character.getNumericValue(seq.charAt(i));
		}
		
		return list;
	}
	
	/* Method to evaluate the numbers in the list from the toList method,
	 * as well as calculate the sum.
	 */
	public static int evaluate(int[] list) {
		int sum = 0;
		
		if (list[0] == list[list.length-1]) {
			sum = list[0];
		}
		
		for (int i = 0; i < list.length-1; i++) {
			if (list[i] == list[i+1]) {
				sum = sum + list[i];
			}
		}
		
		return sum;
	}
}
