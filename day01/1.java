import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/* Advent of Code 2015, Day 1
 * An opening parenthesis, (, means he should go up one floor, and a closing parenthesis, ), means he should go down one floor.
 * To what floor do the instructions take Santa?
 * 
 * Find the position of the first character that causes him to enter the basement (floor -1). 
 * The first character in the instructions has position 1, the second character has position 2, and so on.
 */
public class Day1 {
	public static void main(String[] args) throws FileNotFoundException {
		int floorNum = 0;
		int counter = 0;
		File file = new File("input1.txt");
		Scanner keyboard = new Scanner(file);
		keyboard.useDelimiter("");
		while (keyboard.hasNext()) {
			counter++;
			if (keyboard.next().equals("(")) {
				floorNum++;
			}
			else {
				floorNum--;
			}
			if (floorNum == -1) {
				System.out.println("Counter = " + counter);
			}
		}
		System.out.println(floorNum);
	}
}
