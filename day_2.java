import java.util.*;

public class day_2 {

	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();

	/* TITLE: Corruption Checksum
	 * STATUS: Completed
	 * 
	 * Corruption Checksum is responsible for calculating the checksum of each
	 * row and adding each checksum together to get a total checksum of the
	 * spreadsheet. It takes in an input of 'N' to determine the size of the
	 * N x N spreadsheet.
	 * 
	 * Note: The '-' is to symbolize no data in that slot, or a 0
	 * 
	 * concerning the checksum.
	 * Ex.  [2, 6, 10] = 2 + 6 + 10 = 18
	 * 		[6, 8, -]  = 6 + 8 + 0  = 14
	 * 		[9, -, 3]  = 9 + 0 + 3  = 12
	 * 		
	 * 		Checksum = 18 + 14 + 12 = 44
	 */
	public static void main(String[] args){
		begin();
	}
	
	/* Begins experiment */
	public static void begin(){
		int input = 3;	// Default size
		int[][] spreadsheet = null;
		System.out.print("Enter the NxN dimensions of the random spreadsheet: ");
		input = scan.nextInt();
		spreadsheet = ranList(input);
		System.out.println("The check sum of the sheet is: " + checkSum(spreadsheet));
	}
	
	/* Calculates the checksum of the spreadsheet */
	public static int checkSum(int[][] spreadsheet){
		int sum = 0;
		for (int i = 0; i < spreadsheet.length; i++){
			for (int j = 0; j < spreadsheet.length; j++){
				sum += spreadsheet[i][j];
			}
		}
		return sum;
	}
	
	/* Generates a random spreadsheet for the experiment, as a test unit */
	public static int[][] ranList(int size){
		int[][] spreadsheet = new int[size][size];
		for (int i = 0; i < size; i++){
			for (int j = 0; j < size; j++){
				spreadsheet[i][j] = rand.nextInt(11);
			}
		}
		return spreadsheet;
	}
}
