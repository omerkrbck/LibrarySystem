import java.util.ArrayList;

// Books Class 
public class Books extends Media implements IBooks {

	// Generate a new ArrayList to hold the books in the system.
	static ArrayList<Books> Array_Books = new ArrayList<Books>();   
		
	// Generate a new ArrayList to hold the borrowed books in the system.
	static ArrayList<Books> Array_Books_borrow = new ArrayList<Books>(); 
	
	private String author;  // A book has an author.
	
	// Add Constructor Books(String title, String genre, String author).
	public Books(String title, String genre, String author) {
		super(title, genre);
		this.author=author;
	}
	
	// Generate Getters and Setters for author --- ALT+SHIFT+S --- Generate Getters and Setters
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	// AddBooks method to add a book.
	static void AddBooks(Books book) {   
	   	 Array_Books.add(book);
	}
	
	// bring_information_book method for info
    String bring_information_book(Books book) {
   	 
   	 String book_info="------  BOOK  ------\n" + "The Order Of The Book In Our System(This number is important when choosing the book)-PLEASE ENTER THIS NUMBER: " 
   	                                            + Array_Books.indexOf(book) + "\nBook ID : " + book.getID() + "\nBook Title : " + book.getTitle() 
   	                                            + "\nBook Genre : " + book.getGenre() + "\nAuthor : " + book.getAuthor();   
   	                              
   	    return bring_information(book_info);
    }
	
     // bring_information_book_borrow method for info
    String bring_information_book_borrow(Books book) {
   	 
   	 String book_info="------  BOOK  ------\n" + "The Order Of The Book In Our System(This number is important when choosing the book)-PLEASE ENTER THIS NUMBER: " 
                                                + Array_Books_borrow.indexOf(book) + "\nBook ID : " + book.getID() + "\nBook Title : " + book.getTitle() 
                                                + "\nBook Genre : " + book.getGenre() + "\nAuthor : " + book.getAuthor();
   	    return bring_information(book_info);
    }
	
	/* INTERFACE OVERRIDE
	 * Add unimplemented methods (IBooks) -------- add_book(), delete_book(), borrow_book(), bring_book() --------
	 * @Override   */
	public void add_book(Books book) {
		
		Array_Books.add(book);
		System.out.println("The Book Named " + book.getTitle() + " Has Been Added To The System..");
	}

	public void delete_book(Books book) {

		try {
			for (Books book_for_each : Array_Books) {
				if (book.getID() == book_for_each.getID()) {
					Array_Books.remove(Array_Books.indexOf(book));
				}
			}
			System.out.println("The Book Named " + book.getTitle() + " Has Been Deleted From The System..");
		} catch (Exception e) {
			System.out.println("The Book Named " + book.getTitle() + " Has Been Deleted From The System..");
		}
	}

	public void borrow_book(Books book) {

		Array_Books_borrow.add(book);
		Array_Books.remove(Array_Books.indexOf(book));
		System.out.println("The Book Named " + book.getTitle() + " Has Been Deleted From The System And Transferred To The Loan Books Section."       
		                    + "\nPlease Do Not Forget To Bring It Back Within The Allotted Time  ...  Have A Good Reading  ..." );
	}

	public void bring_book(Books book) {

		Array_Books.add(book);
		Array_Books_borrow.remove(Array_Books_borrow.indexOf(book));
		System.out.println("The Book Named " + book.getTitle() + " Has Been Restored To The System."
				            + "\nThank You For Bringing It Within The Allotted Time...");
	}  
}
