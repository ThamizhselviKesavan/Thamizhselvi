package ConsoleBasedProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LibraryManagement {

	// Private attributes for library management system
	private byte bookId;
	private String bookName;
	private String journal;
	private String authorName;
	private long edition;
	private byte noOfCopies;
	
	// creating list (Arraylist) 
	List<LibraryManagement> Librarylist=new ArrayList<LibraryManagement>();
	Scanner scan=new Scanner(System.in);

	// non parameterized constructor of library class
	LibraryManagement() {
		System.out.println("Enter a number from the below options");
		System.out.print("1.Add the books"+ '\n'+"2.Display all books" +'\n'+ "3.Search a book"+'\n'+"4.Update book" +'\n'+"5.Exit" );

	}

	// parameterized constructor of library class
	LibraryManagement(byte bookId,String bookName,String journal,String authorName,long edition,byte noOfCopies) {
		this.bookId=bookId;
		this.bookName=bookName; 
		this.journal=journal;
		this.authorName=authorName;
		this.edition=edition;
		this.noOfCopies=noOfCopies;
	}


	// Public getter and setter methods for the above mentioned attributes
	public int getbookId() { // only to read the values
		return bookId;
	}
	public void setbookId(byte bookId) { //only to write(set) the values
		this.bookId=bookId;
	}


	public String getbookName() {
		return bookName;
	}
	public void setbookName(String bookName) {
		this.bookName=bookName;
	}

	public String getjournal() {
		return journal;
	}
	public void setjournal(String journal) {
		this.journal=journal;
	}
	
	public String getauthorName() {
		return authorName;
	}
	public void setauthorName(String authorName) {
		this.authorName=authorName;
	}


	public long getedition() {
		return edition;
	}
	public void setedition(int edition) {
		this.edition=edition;
	}


	public int getnoOfCopies() {
		return noOfCopies;
	}
	public void setnoOfCopies(byte noOfCopies) {
		this.noOfCopies=noOfCopies;
	}


	// toString() is built-in-method of Object Class in Java ---> to return values
	public String toString() {
		return "BookID: " +bookId + "   "+"BookName: " + bookName +"   "+"Journal: "+ journal +"   "+"AuthorName: " +authorName+"   "+"Edition: " +edition+"   "+"NoOfCopies: " +noOfCopies; 
	}  

	//method to check login details
	public static void toCheckLogin(String username,String password) {
		if(username.equals("LibraryManagement") && password.equals("library@123")) {
			System.out.println("Logged In Successfully");
			DriverClassForLibrary.toCheckCases();
		}
		else {
			System.out.println("Please Enter the correct Login Credentials!");
		}}

	//method to logout
	public static void toLogout() {
		System.out.println("Logged Out Successfully ");
		System.out.println("Thank you for visiting");
	}

	//method to add objects(Books) to the list
	public void toaddBooks(Scanner scan) {
		System.out.print("Enter the BookId");
		byte bookId=scan.nextByte();

		System.out.print("Enter the Book Name");
		String bookName=scan.next();

		System.out.print("Enter the Journal");
		String journal=scan.next();

		System.out.print("Enter the Author Name");
		String authorName=scan.next();

		System.out.print("Enter the Edition");
		long edition=scan.nextLong();

		System.out.print("Enter the Number Of copies");
		byte noOfCopies=scan.nextByte();

		Librarylist.add(new LibraryManagement(bookId,bookName,journal,authorName,edition,noOfCopies));
	}

	// method to display the list of books added to the arraylist
	public void todisplayAll() {
		for(LibraryManagement value: Librarylist) 
			System.out.println(value);
	}

	// method to search a book by BookId
	public void tosearchByBookId(Scanner scan) {
		boolean flag=false;
		System.out.println("Enter the BookID you want to search");
		int BookId1=scan.nextInt();
		Iterator<LibraryManagement> obj1=Librarylist.iterator();
		while(obj1.hasNext()) {
			LibraryManagement obj = obj1.next();
			if(obj.getbookId()==BookId1) {
				flag=true;
				System.out.print("Book found");
				break;
			}
		}
		if(flag==false) {
			System.out.print("Book not Found");
		}

	}


	// method to update the details of book by BookId
	public void toupdateByBookId(Scanner scan) {
		boolean flag1=false;

		System.out.println("Enter the BookId to which you need to update");
		int BookId2=scan.nextInt();
		Iterator<LibraryManagement> obj2=Librarylist.iterator();
		int ctr=-1;
		while(obj2.hasNext()) {
			ctr++;
			LibraryManagement obj=obj2.next();
			if(obj.getbookId() == BookId2) {
				flag1=true;
				System.out.println("Book Found");
				System.out.print("Enter the updated number of copies");
				byte noOfCopies=scan.nextByte();
				System.out.print("Enter the BookId");
				byte bookId=scan.nextByte();
				System.out.print("Enter the BookName");
				String bookName=scan.next();
				System.out.print("Enter the Journal");
				String journal=scan.next();
				System.out.print("Enter the Authorname");
				String authorName=scan.next();
				System.out.print("Enter the Edition");
				int edition=scan.nextInt();
				
				Librarylist.set(ctr,new LibraryManagement(bookId,bookName,journal,authorName,edition,noOfCopies));
				break;
			}
			if(flag1==false) {
				System.out.println("BookId not found");
				break;
			}
		}

	}}









