import java.util.*;

public class day_3 {

	static Scanner scan = new Scanner(System.in);
	
	/* TITLE: Spiral Memory
	 * STATUS: Currently being worked on
	 * 
	 * Spiral Memory is the idea that memory is stored in an infinite spiral
	 * shape like storage. Starting from the center of the spiral memory, and
	 * continues on starting to the right. The Spiral Memory is very similar
	 * to the Manhattan Distance algorithm. The shape of the memory is produced
	 * by input from the user, if the input is an even number, 1 will be added
	 * to let it have a center of the memory.
	 * 
	 * Ex.  17	16	15	14	13
	 * 		18	 5	 4	 3	12
	 * 		19	 6	 1	 2	11
	 * 		20	 7	 8	 9	10
	 * 		21	22	23	24	25	etc...
	 * 
	 * 		Data from memory [1] to memory [1] is carried in 0 steps.
	 * 		Data from memory [1] to memory [12] is carried in 3 steps.
	 * 		Data from memory [1] to memory [23] is carried in 2 steps.	
	 */
	public static void main(String[] args){
		int size = 3;	// Default size of memory
		System.out.print("Enter size of the NxN spiral memory: ");
		size = scan.nextInt();
		produceMem(size);
	}
	
	public static int[][] produceMem(int size){
		/* If size is an even, size+1 to have the spiral memory contain a center */
		if (size % 2 == 1){
			size++;
		}
		
		int[][] spiralMemory = new int[size][size];
		spiralMemory[size/2][size/2] = 1;
		
		//...
		
		return spiralMemory;
	}
}
