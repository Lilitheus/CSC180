import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TestMethods {

	Scanner scan = new Scanner(System.in);

	
	//Plans changed and the menu if kind of pointless at this point.
	public void menu() 
	{
		int menuSelection = 0;
		boolean error = false;
		
		System.out.println("Welcome to the testing of my cardinality method.");
		System.out.println("Choose select a method by replying with the number shown.");
		System.out.println("1: Create an list of ints and search the number of times a certain number appears.");
		System.out.println("2: Exit.");
		
		do {
			try	{
				
				menuSelection = scan.nextInt();
				
				if(menuSelection == 1) {
					
					intListMethod();
				} else if(menuSelection == 2) {
					
					System.out.println("Thanks for coming");
					error = true;
				}else if(menuSelection > 2 || menuSelection < 1) {
					
					System.out.println("You have entered a number not shown above, the menu will be prompted again.");
					menu();
				}
				
			} catch(InputMismatchException e) {
				
				
				System.out.println("You have entered in a value that doesnt match with what was asked for, please try again.");
				scan.next();
				
			} catch(Exception e) {
				
				System.out.println("Either you have entered nothing when prompted for a selection or an unexpected error as occured, please try again.");
				scan.next();
			}
		} while(error == false);
		
		
	}
	
	public void intListMethod() 
	{
		List<Integer> list = new ArrayList<>();
		int menuSelection = 0;
		int locateThisNumber = 0;
		int enterThisNumber = 0;
		boolean needToLoop = true;
		
		do {
			
			System.out.println("1: Add numbers into array.");
			System.out.println("2: Search for the ammount of X there are.");
			System.out.println("3: Menu.");
			try	{
				
				menuSelection = scan.nextInt();
				
				if(menuSelection == 1) {
					System.out.println("Enter an int you would like to insert in your list.");
					enterThisNumber = scan.nextInt();
					
					list.add(enterThisNumber);
					
				} else if(menuSelection == 2) {
					System.out.println("Enter the number you want to search for...");
					locateThisNumber = scan.nextInt();
					
					System.out.println(CollectionUtils.cardinality(locateThisNumber, list));
				}else if(menuSelection == 3) {
					
					menu();
					needToLoop = false;
				}else if(menuSelection > 3 || menuSelection < 1) {
					
					System.out.println("You have entered a number not shown above, the menu will be prompted again.");
					
				}
				
			} catch(InputMismatchException e) {
				
				
				System.out.println("You have entered in a value that doesnt match with what was asked for, please try again.");
				scan.next();
				
			} catch(Exception e) {
				
				System.out.println("Either you have entered nothing when prompted for a selection or an unexpected error as occured, please try again.");
				scan.next();
			}
		} while(needToLoop == true);
	}
}
