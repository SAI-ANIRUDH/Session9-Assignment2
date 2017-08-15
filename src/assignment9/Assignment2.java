package assignment9; // Package declaration is compulsory.
/*
 *  Program to describe the union of sets
 */
import java.util.*; //Importing the java util package.
import java.lang.*; // Impoting the java Language package.
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet s1 = new HashSet(); // Creating the first hash set S1 and initializing the variables inside it.
s1.add("Apple");
s1.add("Banana");
s1.add("Guava");

Set s2 = new HashSet(); // Creating the second set S2 and initializing the variables inside it.
s2.add("Anirudh");
s2.add("Ram");
s2.add("Seetha");

Set union = new TreeSet(s1); // Declaring the union condition.
union.addAll(s2); //Copying the values of set s2 to s1

System.out.println("union "+union);

	}

}
