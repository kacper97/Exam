import java.io.IOException;
import java.util.Scanner;
public class Driver {
	private Scanner input;
	DecisionTree tree;
	
	public Driver(){
			input = new Scanner(System.in);
			tree = new DecisionTree(0);
	}
	
	public static void main(String args[]) throws IOException{
		Driver app = new Driver();
		ReadIn.readFile(); // reads in the rules file
		app.run(); // runs the app
	}
	// main menu
	// here if a user pressed 1, i.e yes, the tree should go down the left branch 
	// if a user pressed 2, i.e. no, the tree should go down the right branch
	private int mainMenu(){
		System.out.println("Decision Tree for Vanity Number");
		System.out.println("Question: rules.txt");
		System.out.println("1) Yes");
		System.out.println("2) No");
		System.out.println("----");
		System.out.println(" 0) Exit");
		int option = input.nextInt();
		return option;
	}
	// Did not implement the yes no options, by default the program exits
	private void run() {
		int option = mainMenu();
				while (option !=0){
					System.out.println("Exiting... bye");
					}
	}
}

