/**
 * Tester class for project #8
 * @author Javier Garcia
 *CSC15
 */
/**
 * 
 * 
 *
 */
public class LOTR {//brings variables name, type and age to the LOTR class
	private String name;
	private String type;
	private int age;
	/**
	 * intitializes the characters
	 * @param name
	 * @param type
	 * @param age
	 */
	public LOTR(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	/**
	 * initializes
	 */
	public LOTR() {
		this("", "", 0);
	}
	
	
	/**
	 * converts characters to a string
	 */
	public String toString() {
		
		
		return String.format("Name %s: Type %s: Age %d", name, type, age); //adjusts variables into template provided
	}
	
	

	
}

