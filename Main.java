import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean possible = true;
		System.out.println("Enter List of Letters: ");
		String firstString = input.nextLine();
		System.out.println("Enter the sentence to be Form: ");
		String secondString = input.nextLine();
		
		ArrayList<Character> charArray = new ArrayList<>();
		ArrayList<Character> charArray1 = new ArrayList<>();
		ArrayList<Character> charArray2 = new ArrayList<>();
		
		int len1 = firstString.length();
		int len2 = secondString.length();
		
		char[] firstStringChar = new char[len1];
		char[] secondStringChar = new char[len2];
		firstString.getChars(0, len1, firstStringChar, 0);
		secondString.getChars(0, len2, secondStringChar, 0);
		
		
		for(int i = 0; i < len1; i++) {
			if(firstStringChar[i] != ' ') {
			charArray.add(firstStringChar[i]);
			}
		}
		for(int i = 0; i < len2; i++) {
			if(secondStringChar[i] != ' ') {
			charArray1.add(secondStringChar[i]);
			charArray2.add(secondStringChar[i]);
			}
		}
		charArray1.retainAll(charArray);
		Collections.sort(charArray1);
		Collections.sort(charArray);
		Collections.sort(charArray2);	
		if(!charArray1.equals(charArray2)) {
			possible = false; 
		}
		
		if(possible) {
			System.out.println("Possible");
		}
		else {
			System.out.println("Not Possible");
		}
		input.close();

	}

}
