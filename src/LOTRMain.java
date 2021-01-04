import java.io.File;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


/**
 * 
 * @author Javier Garcia
 *
 */
public class LOTRMain {
	public static final String FILE_NAME = "Data.txt";
	/**
	 *  main method which calls the classes that execute everything
	 * @param args
	 */
	public static void main(String[] args) {
		LOTR[] myHokeemon = getData();//makes LOTR[]myLOTR = getData
		System.out.println(Arrays.deepToString(myHokeemon));//converts the characters into a String
		System.out.println();
		String bio = getBio();//makes bio = getBio
		System.out.println((bio));//prints bio
		
	}
	/**
	 * converts file into the characters from LOTR
	 * @return
	 */
	public static LOTR[] getData() {
		try {
			//open file
			Scanner fileReader = new Scanner(new File(FILE_NAME));
			//get the number of characters in file
			int count = 0;
			while(fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				if(line.length() > 0) {
					count++;
				}
			}
			
			
			//Read each character from the file into the array
			fileReader = new Scanner(new File(FILE_NAME));//start at beginning
			LOTR[] myLOTR = new LOTR[count];
			for(int i = 0; i < myLOTR.length; i++) {
				String name = fileReader.next();
				
				String type = fileReader.next();
				int age = fileReader.nextInt();
				myLOTR[i] = new LOTR(name, type, age);
				
			}
			fileReader.close();
			
			//return array
			return myLOTR;
		}
		catch(FileNotFoundException e) {
			System.err.println("Cannot read file: " + FILE_NAME);
			return null; //couldn't read, return null
		}
	}
	/**
	 * gets the bio for the characters
	 * @return
	 */
	public static String getBio() {
		try {
			//open file
			Scanner fileReader = new Scanner(new File(FILE_NAME));
			//get the number of characters in file
			int count = 0;
			while(fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				if(line.length() > 0) {
					count++;
				}
			}
			
			
			//Read each character from the file into the array
			fileReader = new Scanner(new File(FILE_NAME));//start at beginning
			LOTR[] myLOTR = new LOTR[count];
			String getit = "";
			for(int i = 0; i < myLOTR.length; i++) {
				String name = fileReader.next();
				String type = fileReader.next();
				int age = fileReader.nextInt();
				
				
				String place = bio(type);
				System.out.println("I am " +name+ " Type: " +type+" Age: " +age +" "+ place);// prints template from prompt with the variables needed filled in
				String bae = friend(name, type, i); 
				System.out.println("My Friends are: "+ bae);
				
			}
			fileReader.close();
			System.out.print(getit);
			//return array
			return "" ;
		}
		catch(FileNotFoundException e) {
			System.err.println("Cannot read file: " + FILE_NAME);
			return null; //couldn't read, return null
		}
	}
	/**
	 * identifies the location of the character
	 * @param type
	 * @return
	 */
	public static String bio(String type) {
		if(type.contentEquals("Dwarf")) {//dwarf lives in mountains
			return "I live in the Mountain.";
		}
		if(type.contentEquals("Hobbit")) {//hobbits lives in the shire
			return "I live in the Shire.";
		}
		if(type.contentEquals("Elf")) {//elves live in the dale
			return "I live in the Dale.";
		}
		if(type.contentEquals("Fairy")) {//fairies live in the forrest
			return " I live in the Forrest.";
		}
		return null;
	}
	/**
	 * gets the friends of each character
	 * @param name
	 * @param type
	 * @param j
	 * @return
	 */
	public static String friend(String name,String type,int j) {
		try {
			//open file
			Scanner fileReader = new Scanner(new File(FILE_NAME));
			//get the number of character in file
			int count = 0;
			while(fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				if(line.length() > 0) {
					count++;
				}
			}
			
			
			//Read each character from the file into the array
			fileReader = new Scanner(new File(FILE_NAME));//start at beginning
			String [] pals = new String[count];
			String getit = "";
			String title = "";//initializations
			String happy = "";
			for(int i = 0; i <= pals.length; i++) {
				title = fileReader.next();
				String quirk = fileReader.next();
				int age = fileReader.nextInt();
				
					if(i == j) {//prevents the characters from listing itself as a friend(sad)
						i++;
					}else if(type.equals(quirk)) {//if their types are the same they are friends
						happy += " " + title;
					}else if(type.contentEquals("Hobbit")) {//hobbits and fairies are friends
						if(quirk.contentEquals("Fairy")) {
							happy += " "+title;
						}
				}else if(type.contentEquals("Fairy")) {//hobbits and fairies are friends
					if(quirk.contentEquals("Hobbit")) {
						happy += " " + title;
					}
				}else if(type.contentEquals("Dwarf")) {//dwarfs and elves are friends
					if(quirk.contentEquals("Elf")) {
						happy += " "+title;
					}
				}else if(type.contentEquals("Elf")) {//dwarfs and elves are friends
				if(quirk.contentEquals("Dwarf")) {
					happy += " "+title;
				}
				
				}
	}
			fileReader.close();
			
			//return array
			return happy ;
		
		
	}
		catch(FileNotFoundException e) {
			System.err.println("Cannot read file: " + FILE_NAME);
			return null; //couldn't read, return null
		}

	}
}
	

