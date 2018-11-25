import java.util.*;

public class day_4 {
	
	static Scanner scan = new Scanner(System.in);
	
	/* TITLE: High-Entropy Passphrases
	 * STATUS: Currently being worked on
	 * 
	 * High-Entropy Passphrases is responsible for calculating a passphrase string
	 * and deem it valid or invalid by given constraints.
	 * 
	 * Constraints: No two or more words in the passphrase can be repeated.
	 * 
	 * Ex.	'aa bb cc dd ee' - Valid
	 * 		'aa bb cc aa' 	 - Invalid
	 * 		'aa bb cc aaa' 	 - Valid, 'aa' and 'aaa' are considered different words
	 */
	public static void main (String[] args) {
		begin();
	}
	
	/* Begins experiment */
	public static void begin() {
		String input = "";
		System.out.print("Enter the Passphrase: ");
		input = scan.nextLine();
		if (phraseCheck(input) == true) {
			System.out.println("Passphrase is valid. Access granted!");
		} else {
			System.out.println("Passphrase is invalid. Access denied!");
		}
	}
	
	public static boolean phraseCheck(String passphrase) {
		ArrayList<String> phrases = new ArrayList<>();
		String temp = "";
		for (int i = 0; i < passphrase.length(); i++) {
			System.out.println("index:"+passphrase.charAt(i));
			if (passphrase.charAt(i) == ' ') {
				if (phrases.contains(temp) == false) {
					phrases.add(temp);
					temp = "";
				} else {
					return false;
				}
			} else {
				System.out.println("temp:"+temp);
				temp = temp + passphrase.charAt(i);
			}
		}
		return true;
	}
}