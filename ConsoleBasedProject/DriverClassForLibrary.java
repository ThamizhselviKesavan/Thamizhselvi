package ConsoleBasedProject;

import java.util.Scanner;

public class DriverClassForLibrary {

	//method to perform the operations like add,display,search and update according to user choice
	static void toCheckCases() {
		LibraryManagement  obj=new LibraryManagement (); // creating object for Library class
		Scanner scan=new Scanner(System.in);  // Scanner Class object to get the user input
		int choice;

		do {
			choice=scan.nextInt();
			switch(choice) {
			case 1:
				obj.toaddBooks(scan); // method call -> toaddBooks
				break;
			case 2:
				obj.todisplayAll(); // method call -> to displayAll
				break;
			case 3:
				obj.tosearchByBookId(scan); // method call -> toSearch
				break;
			case 4:
				obj.toupdateByBookId(scan); // method call -> toUpdate
				break;
			case 5:
				LibraryManagement.toLogout();

			}
		}
		while(choice!=5);
	}

public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter the Login UserName: ");
		String username=scan.nextLine();
		System.out.println("Enter the Login Password: ");
		String password=scan.nextLine();
		//passing username and password to the method toCheckLogin()
		LibraryManagement .toCheckLogin(username, password);
		scan.close();
	}

}