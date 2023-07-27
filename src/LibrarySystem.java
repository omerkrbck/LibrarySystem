import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


// LibrarySystem Class            // MainClass
public class LibrarySystem {

	
	static boolean continue_yes () {
		boolean cont = false;
		Scanner scanner = new Scanner(System.in);   // Scanner Class
		
		try {      // Continue or Stop Program ...  // try-catch
			
			System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
			System.out.println("Do You Want To Continue The Program ? Please Press" + "\n-YES = 1 , -NO = 2");
			int cont_input = scanner.nextInt();
			
			if (cont_input == 1) {
				cont = true;
			}
			else if (cont_input == 2) {
				return cont;
			}
			else {
				System.out.println("You Entered The Wrong Input. The Program Is Closing....");
				return cont;
			}
			
		} catch (Exception e) {
			
			System.out.println("You Entered The Wrong Input. The Program Is Closing....");
		}finally {
			return cont;
		}
	}
	
	
	
	/*static void saveDatabase() {                        // 7-SAVE ALL NEW MEDIA ITEMS TO THE TEXT FILE 
		try {                                          // ERROR DUE TO FILE WAY SO I HAD TO USE COMMENT LINE

		        FileOutputStream fos = new FileOutputStream("C:\\javaiotextfile\\BooksFile.bin");   // YOU MUST CHANGE FILE WAY OR YOU CAN DEFINE A NEW FILE NAMED "javaiotextfile". 
		        ObjectOutputStream oos = new ObjectOutputStream(fos);
		        oos.writeObject(Books.Array_Books);
		        oos.close();
		        boolean databaseIsSaved = true;         
		    }
		catch (IOException e) {
		        e.printStackTrace();
		}
	}
	
	static void loadDatabase() {

		try {           
		        FileInputStream fis = new FileInputStream("C:\\javaiotextfile\\BooksFile.bin");
		        ObjectInputStream ois = new ObjectInputStream(fis);         
		        ois.readObject();
		        ois.close();            
		    }       
		catch (IOException e) {
		        System.out.println("***catch ERROR***");
		        e.printStackTrace();

		    }       
		catch (ClassNotFoundException e) {
		        System.out.println("***catch ERROR***");
		        e.printStackTrace();
		    }   
		}*/
		 
	
	public static void main(String[] args) {     // MAIN METHOD......
		
		/*saveDatabase();
		
		loadDatabase();*/
		
		
		Scanner scanner = new Scanner(System.in);      // Scanner Class
		
		// There Are Four Books In The Beginning. If You Want To Add More Books In The Beginning , You Can Define more b- objects 
		// Let's Add Four Books To The ArrayList Of The Books Class .
		Books b1 = new Books("Absolute Java", "Textbook", "Walter Savitch");
		
		Books b2 = new Books("The Call Of The Wild", "Adventure", "Jack London");
		
		Books b3 = new Books("Metamorphosis", "Fantasy Fiction", "Franz Kafka"); 
		
		Books b4 = new Books("Dune", "Science Fiction", "Frank Herbert");
		
		Books.AddBooks(b1);
		
		Books.AddBooks(b2);
		
		Books.AddBooks(b3);
		
		Books.AddBooks(b4);
		
		
		// There Are Four Music Records In The Beginning. If You Want To Add More Music Records In The Beginning , You Can Define more m- objects. 
		// Let's Add Four Music Records To The ArrayList Of The MusicRecords Class .
        MusicRecords m1 = new MusicRecords("Shape Of You", "Pop", "Ed Sheeran");
		
        MusicRecords m2 = new MusicRecords("Hello", "Soul", "Adele");
		
        MusicRecords m3 = new MusicRecords("Talking To The Moon", "Soft Rock", "Bruno Mars");
		
        MusicRecords m4 = new MusicRecords("Lose Yourself", "Rap", "Eminem");
		
        MusicRecords.AddMusicRecords(m1);
		
        MusicRecords.AddMusicRecords(m2);
		
        MusicRecords.AddMusicRecords(m3);
		
        MusicRecords.AddMusicRecords(m4);
        
        
        // There Are Four Member Names In The Beginning. If You Want To Add More Member Names In The Beginnig , You Can Define more memberName- objects. 
        // Let's Add Four Member Names To The ArrayList Of The LibraryMembers Class.
        LibraryMembers memberName1 = new LibraryMembers("AAAA");
        
        LibraryMembers memberName2 = new LibraryMembers("BBBB");
        
        LibraryMembers memberName3 = new LibraryMembers("CCCC");
        
        LibraryMembers memberName4 = new LibraryMembers("DDDD");
        
        LibraryMembers.AddMemberNames(memberName1);
        
        LibraryMembers.AddMemberNames(memberName2);
        
        LibraryMembers.AddMemberNames(memberName3);
        
        LibraryMembers.AddMemberNames(memberName4);
        
        
		String star = "******************************************************************************************************";
		
		String line = "------------------------------------------------------------------------------------------------------";
		
		String message_library = "**********   HELLO   ***********\n" + "***  WELCOME TO OUR LIBRARY  ***\n"  
		                          + "BOOKS AND MUSIC RECORDS ARE AVAILABLE IN OUR SYSTEM\n" 
		                          + "PLEASE SELECT THE ACTION YOU WANT TO DO\n" + "1-ADD A BOOK\n" + "2-DELETE A BOOK\n" 
		                          + "3-BORROW A BOOK\n" + "4-RETURN A BOOK\n" + "5-ADD A MUSIC RECORD\n" + "6-DELETE A MUSIC RECORD\n" 
		                          + "7-BORROW A MUSIC RECORD\n" + "8-RETURN A MUSIC RECORD\n" 
		                          + "9-WRITE A GENRE, IT WILL DISPLAY ALL MEDIA ITEMS IN THE LIBRARY\n"  
				                  + "10-VIEW THE MOST BORROWED BOOKS AND MUSIC RECORDS\n" 
		                          + "11-WRITE A PERSON, IT WILL INDICATE WHETHER IT IS AN AUTHOR OR A PRODUCER\n"
				                  + "12-SIGN OUT\n";
		
		String warning = "PLEASE PAY ATTENTION TO INPUT TYPES !!!";

		
		System.out.println("Do You Have A Member Account?\n" + "LOGIN      ---  1\n" + "NEW USER   ---  2");   // ADD A NEW MEMBER TO THE LIBRARY SYSTEM..
		int member_yes_no = scanner.nextInt();
		
		if (member_yes_no == 1) {                                        // IF YOU HAVE A MEMBER NAME , YOU WILL USE IN THIS SECTION..
			
			System.out.println("Please Enter Member Name :");
			scanner.nextLine();
			String member_scan=scanner.nextLine();
			
			for (LibraryMembers member_Array : LibraryMembers.Array_LibraryMembers) {
				if (member_scan.equals(member_Array.getMember())) {
					
					System.out.println(line);
					System.out.println("Member Name : " + member_scan + "\nWelcome To The Library  :) ");
					System.out.println(line);
				}
			}
		}
		else if (member_yes_no == 2) {                                    // IF YOU DO NOT HAVE A MEMBER NAME, YOU WILL ADD A NEW MEMBER NAME IN THIS SECTION..
			
			System.out.println("Please Enter A Member Name :");
			scanner.nextLine();
			String new_member_name = scanner.nextLine();
			
			LibraryMembers memberName5 = new LibraryMembers(new_member_name);
			
			memberName1.AddMemberNames(memberName5);
			
			System.out.println("");
			System.out.println("Your New Member Name Has Been Added To The Library System...");
			System.out.println("WELCOME :)" + new_member_name);
		}
		
		try {       // try-catch..
			
			while (true) {              // while loop..
				System.out.println("");
				System.out.println("");
				System.out.println(star);
				System.out.println(star);
				System.out.println(message_library);     // message_library  1-2-3-4-5-6-7-8-9-10-11-12  ....
			    int input=scanner.nextInt();
			    
			    if (input == 1) {     // 1- ADD A BOOK ----
			    	
			    	System.out.println(line);
			    	System.out.println("**********  ALL BOOKS IN OUR LIBRARY  **********");
			    	
			    	for (Books book : Books.Array_Books) {      // foreach loop --  display all books 
			    		
			    		System.out.println(line);
			    		System.out.println(book.bring_information_book(book));
			    		System.out.println(line);
					}
			    	
			    	// Add a book in our system . 
			    		
			        System.out.println("***  Enter Book Information  ***");
			    	scanner.nextLine();
			    	System.out.println("Book Title : ");
			    	String book_title = scanner.nextLine();
			    	System.out.println("Book Genre : ");
			    	String book_genre=scanner.nextLine();
			    	System.out.println("Book Author : ");
			    	String book_author=scanner.nextLine();
			    		
			    	Books b5 = new Books(book_title, book_genre, book_author);
			    	b1.add_book(b5);
			    		
			    	if (continue_yes()) {
			    		continue;
					}
			    	else {
						System.out.println("THE LIBRARY IS CLOSING .....");
						Thread.sleep(2000);
						System.out.println("THE LIBRARY CLOSED  ... SEE YOU SOON !!");
						return;
					}
			    }
			    else if (input == 2) {    // 2- DELETE A BOOK  ---
			    	
					System.out.println(star);
						
			    	if (Books.Array_Books.isEmpty()) {
							
			    		System.out.println("You cannot perform the deletion process because there is no book already in the system\n"
			    					        + "You Are Redirected Out Of The Program ......"); 
			    		Thread.sleep(1000);
			    		continue;
					}
			    	
			    	System.out.println(line);
			    	System.out.println("**********  ALL BOOKS IN OUR LIBRARY  **********");
			    	
			    	for (Books book : Books.Array_Books) {      // foreach loop --  display all books 
			    		
			    		System.out.println(line);
			    		System.out.println(book.bring_information_book(book));
			    		System.out.println(line);
					}
			    		
			    	System.out.println("Which Book Do You Want From The List Above?");
			    	System.out.println("Please Enter The Order Number Of The Book You Want To Delete (The First Number In the Information) : ");
			    	int order_number_book_input = scanner.nextInt();
			    		
			    	if (order_number_book_input>Books.Array_Books.size()) {
							
			    		System.out.println("You Have Entered More Values Than The System! Program Stops ....");
			    		return;
					}
			    	else {
						b1.delete_book(Books.Array_Books.get(order_number_book_input));
					}
			    	
			    	if (continue_yes()) {
			    		continue;
					}
			    	else {
						System.out.println("THE LIBRARY IS CLOSING .....");
						Thread.sleep(2000);
						System.out.println("THE LIBRARY CLOSED  ... SEE YOU SOON !!");
						return;
					}
				}
			    else if (input == 3) {   // 3- BORROW A BOOK  ---
			    	
			    	System.out.println(star);
					
			    	if (Books.Array_Books.isEmpty()) {
							
			    		System.out.println("You cannot perform the borrowing process because there is no book already in the system\n"
			    					        + "You Are Redirected Out Of The Program ......"); 
			    		Thread.sleep(1000);
			    		continue;
					}
			    	
			    	System.out.println(line);
			    	System.out.println("**********  ALL BOOKS IN OUR LIBRARY  **********");
			    	
			    	for (Books book : Books.Array_Books) {      // foreach loop --  display all books 
			    		
			    		System.out.println(line);
			    		System.out.println(book.bring_information_book(book));
			    		System.out.println(line);
					}
                        
                    System.out.println("Which Book Do You Want From The List Above?");
                    System.out.println("Please Enter The Order Number Of The Book You Want To Borrow (The First Number In the Information) : ");
                    int order_number_book_input = scanner.nextInt();
		    		
			    	if (order_number_book_input>Books.Array_Books.size()) {
							
			    		System.out.println("You Have Entered More Values Than The System! Program Stops ....");
			    		return;
					}
			    	else {
						b1.borrow_book(Books.Array_Books.get(order_number_book_input));
					}
			    	
			    	if (continue_yes()) {
			    		continue;
					}
			    	else {
						System.out.println("THE LIBRARY IS CLOSING .....");
						Thread.sleep(2000);
						System.out.println("THE LIBRARY CLOSED  ... SEE YOU SOON !!");
						return;
					}
				}
			    else if (input == 4) {    // 4- RETURN A BOOK  ---
						
			    	System.out.println(star);
			    		
			    		
                    if (Books.Array_Books_borrow.isEmpty()) {
							
			    		System.out.println("You cannot perform the returning process because you did not borrow a book.\n"
			    					            + "You Are Redirected Out Of The Program ......"); 
			    		Thread.sleep(1000);
			    		continue;
					}
                        
                    System.out.println("Books Below  In The System Were Taken By You : ");
                        
                    for (Books book : Books.Array_Books_borrow) {
							
                        System.out.println(line);
                        System.out.println(book.bring_information_book_borrow(book));
					}
                        
                    System.out.println("Which Book Do You Want To Return?");
                    System.out.println("Please Enter The Order Number Of The Book You Want To Return (The First Number In the Information) : ");
                    int order_number_book_input = scanner.nextInt();
                        
                    if (order_number_book_input>Books.Array_Books_borrow.size()) {
							
			    		System.out.println("You Have Entered More Values Than The System! Program Stops ....");
			    		return;
					}
			    	else {
						b1.bring_book(Books.Array_Books_borrow.get(order_number_book_input));
					}
                        
                    if (continue_yes()) {
    			    	continue;
    				}
    			    else {
    					System.out.println("THE LIBRARY IS CLOSING .....");
    					Thread.sleep(2000);
    					System.out.println("THE LIBRARY CLOSED  ... SEE YOU SOON !!");
    					return;
    				}
				}
			    /*******************************        Finished Books Section      **************************************/
			    /*******************************        Start Music Records Section      *********************************/
			    else if (input == 5) {     // 1- ADD A MUSIC RECORD ----
			    	
			    	System.out.println(line);
			    	System.out.println("**********  ALL MUSIC RECORDS IN OUR LIBRARY  **********");
			    	
			    	for (MusicRecords music : MusicRecords.Array_MusicRecords) {      // foreach loop --  display all music records 
			    		
			    		System.out.println(line);
			    		System.out.println(music.bring_information_musicRecord(music));
			    		System.out.println(line);
					}
			    	
			    	// Add a music record in our system . 
			    		
			        System.out.println("***  Enter Music Record Information  ***");
			    	scanner.nextLine();
			    	System.out.println("Music Record Title : ");
			    	String music_record_title = scanner.nextLine();
			    	System.out.println("Music Record Genre : ");
			    	String music_record_genre=scanner.nextLine();
			    	System.out.println("Music Record Producer : ");
			    	String music_record_producer=scanner.nextLine();
			    		
			    	MusicRecords m5 = new MusicRecords(music_record_title, music_record_genre, music_record_producer);
			    	m1.add_musicRecord(m5);
			    		
			    	if (continue_yes()) {
			    		continue;
					}
			    	else {
						System.out.println("THE LIBRARY IS CLOSING .....");
						Thread.sleep(2000);
						System.out.println("THE LIBRARY CLOSED  ... SEE YOU SOON !!");
						return;
					}
			    }
			    else if (input == 6) {    // 2- DELETE A MUSIC RECORD  ---
			    	
					System.out.println(star);
						
			    	if (MusicRecords.Array_MusicRecords.isEmpty()) {
							
			    		System.out.println("You cannot perform the deletion process because there is no music record already in the system\n"
			    					        + "You Are Redirected Out Of The Program ......"); 
			    		Thread.sleep(1000);
			    		continue;
					}
			    	
			    	System.out.println(line);
			    	System.out.println("**********  ALL MUSIC RECORDS IN OUR LIBRARY  **********");
			    	
			    	for (MusicRecords music : MusicRecords.Array_MusicRecords) {      // foreach loop --  display all music records 
			    		
			    		System.out.println(line);
			    		System.out.println(music.bring_information_musicRecord(music));
			    		System.out.println(line);
					}
			    		
			    	System.out.println("Which Music Record Do You Want From The List Above?");
			    	System.out.println("Please Enter The Order Number Of The Music Record You Want To Delete (The First Number In the Information) : ");
			    	int order_number_music_input = scanner.nextInt();
			    		
			    	if (order_number_music_input>MusicRecords.Array_MusicRecords.size()) {
							
			    		System.out.println("You Have Entered More Values Than The System! Program Stops ....");
			    		return;
					}
			    	else {
						m1.delete_musicRecord(MusicRecords.Array_MusicRecords.get(order_number_music_input));
					}
			    	
			    	if (continue_yes()) {
			    		continue;
					}
			    	else {
						System.out.println("THE LIBRARY IS CLOSING .....");
						Thread.sleep(2000);
						System.out.println("THE LIBRARY CLOSED  ... SEE YOU SOON !!");
						return;
					}
				}
			    else if (input == 7) {   // 3- BORROW A MUSIC RECORD  ---
			    	
			    	System.out.println(star);
					
			    	if (MusicRecords.Array_MusicRecords.isEmpty()) {
							
			    		System.out.println("You cannot perform the borrowing process because there is no music record already in the system\n"
			    					        + "You Are Redirected Out Of The Program ......"); 
			    		Thread.sleep(1000);
			    		continue;
					}
			    	
			    	System.out.println(line);
			    	System.out.println("**********  ALL MUSIC RECORDS IN OUR LIBRARY  **********");
			    	
                    for (MusicRecords music : MusicRecords.Array_MusicRecords) {      // foreach loop --  display all music records 
			    		
			    		System.out.println(line);
			    		System.out.println(music.bring_information_musicRecord(music));
			    		System.out.println(line);
					}
                        
                    System.out.println("Which Music Record Do You Want From The List Above?");
                    System.out.println("Please Enter The Order Number Of The Music Record You Want To Borrow (The First Number In the Information) : ");
                    int order_number_music_input = scanner.nextInt();
		    		
			    	if (order_number_music_input>MusicRecords.Array_MusicRecords.size()) {
							
			    		System.out.println("You Have Entered More Values Than The System! Program Stops ....");
			    		return;
					}
			    	else {
						m1.borrow_musicRecord(MusicRecords.Array_MusicRecords.get(order_number_music_input));
					}
			    	
			    	if (continue_yes()) {
			    		continue;
					}
			    	else {
						System.out.println("THE LIBRARY IS CLOSING .....");
						Thread.sleep(2000);
						System.out.println("THE LIBRARY CLOSED  ... SEE YOU SOON !!");
						return;
					}
				}
			    else if (input == 8) {    // 4- BRING A MUSIC RECORD  ---
						
			    	System.out.println(star);
			    		
			    		
                    if (MusicRecords.Array_MusicRecords_borrow.isEmpty()) {
							
			    		System.out.println("You cannot perform the returning process because you did not borrow a music record.\n"
			    					            + "You Are Redirected Out Of The Program ......"); 
			    		Thread.sleep(1000);
			    		continue;
					}
                        
                    System.out.println("Music Records Below  In The System Were Taken By You : ");
                        
                    for (MusicRecords music : MusicRecords.Array_MusicRecords_borrow) {
						
                        System.out.println(line);
                        System.out.println(music.bring_information_musicRecord_borrow(music));
					}
                        
                    System.out.println("Which Music Record Do You Want To Return?");
                    System.out.println("Please Enter The Order Number Of The Music Record You Want To Return (The First Number In the Information) : ");
                    int order_number_music_input = scanner.nextInt();
                        
                    if (order_number_music_input>MusicRecords.Array_MusicRecords_borrow.size()) {
							
			    		System.out.println("You Have Entered More Values Than The System! Program Stops ....");
			    		return;
					}
			    	else {
						m1.bring_musicRecord(MusicRecords.Array_MusicRecords_borrow.get(order_number_music_input));
					}
                        
                    if (continue_yes()) {
    			    	continue;
    				}
    			    else {
    					System.out.println("THE LIBRARY IS CLOSING .....");
    					Thread.sleep(2000);
    					System.out.println("THE LIBRARY CLOSED  ... SEE YOU SOON !!");
    					return;
    				}
				}
			    /*******************************        Finished Music Records Section      *********************************/
			    /*******************************        Start Number 9-10-11-12 Section      *********************************/
			    else if (input == 9) {   // 9- WRITE A GENRE, IT WILL DISPLAY ALL MEDIA ITEMS IN THE LIBRARY  ---
					
			    	System.out.println("Please Select Media For Genre Display : \n" + "Book Genre          --- 1\n" + "Music Record Genre  --- 2\n");
			    	int media_write = scanner.nextInt();
			    	
			    	if (media_write == 1) {    // Book Genre
						
			    		System.out.println(line);
			    		System.out.println("The Followings Are The Books In the Library System");
			    		scanner.nextLine();
			    		
			    		for (Books book : Books.Array_Books) {      // foreach loop --  display all books 
				    		
				    		System.out.println(line);
				    		System.out.println(book.bring_information_book(book));
				    		System.out.println(line);
						}
			    		
			    		System.out.println("Select The Genre Of Book That You Want To Display : ");
			    		String genre_write = scanner.nextLine();
			    		
			    		for (Books book_genre : Books.Array_Books) {
							if (genre_write.equals(book_genre.getGenre())) {
								
								System.out.println(line);
								System.out.println(genre_write + " Genre Book In The Library System");
								System.out.println(line);
								System.out.println(book_genre.bring_information_book(book_genre));
							}
							else {
								System.out.println(line);
								System.out.println("The Book Named " + book_genre.getTitle() + " Is Not In The " + genre_write + " Genre. ");
							}
						}
			    		
			    		if (continue_yes()) {
				    		continue;
						}
				    	else {
							System.out.println("THE LIBRARY IS CLOSING .....");
							Thread.sleep(2000);
							System.out.println("THE LIBRARY CLOSED  ... SEE YOU SOON !!");
							return;
						}
					}
			    	else if (media_write == 2) {    // Music Record Genre
						
			    		System.out.println(line);
			    		System.out.println("The Following Are The Music Records In the Library System");
			    		scanner.nextLine();
			    		
			    		for (MusicRecords music : MusicRecords.Array_MusicRecords) {      // foreach loop --  display all music records 
				    		
				    		System.out.println(line);
				    		System.out.println(music.bring_information_musicRecord(music));
				    		System.out.println(line);
						}
			    		
			    		System.out.println("Select The Genre Of Music Record That You Want To Display : ");
			    		String genre_write = scanner.nextLine();
			    		
			    		for (MusicRecords music_genre : MusicRecords.Array_MusicRecords) {
							if (genre_write.equals(music_genre.getGenre())) {
								
								System.out.println(line);
								System.out.println(genre_write + " Genre Music Record In The Library System");
								System.out.println(line);
								System.out.println(music_genre.bring_information_musicRecord(music_genre));
							}
							else {
								System.out.println(line);
								System.out.println("The Music Record Named " + music_genre.getTitle() + " Is Not In The " + genre_write + " Genre. ");
							}
						}
			    		
			    		if (continue_yes()) {
				    		continue;
						}
				    	else {
							System.out.println("THE LIBRARY IS CLOSING .....");
							Thread.sleep(2000);
							System.out.println("THE LIBRARY CLOSED  ... SEE YOU SOON !!");
							return;
						}
					}
			    	else {
						System.out.println("You Entered The Wrong Input. The Program Is Running Again....");
					}
				}
			    else if (input == 10) {  // 10- VIEW THE MOST BORROWED BOOKS AND MUSIC RECORDS  -- -
					
			    	System.out.println("Display The Borrowed Books Or Music Records.\n" + "1-Books\n" + "2-Music Records\n");
			    	int mostborrowed=scanner.nextInt();
			    	
			    	if (mostborrowed ==1 ) {
			    		
			    		
			    		System.out.println("*****  THE BORROWED BOOKS  *****");
			    		
			    		if (Books.Array_Books_borrow.isEmpty()) {
							
				    		System.out.println("There Is No Borrowed Books In The Library System..."
				    					        + "You Are Redirected Out Of The Program ......"); 
				    		Thread.sleep(1000);
				    		continue;
						}
			    		
			    		for (Books books : Books.Array_Books_borrow) {
							
			    			System.out.println(books.bring_information_book_borrow(books));
						}
						
					}
			    	else if (mostborrowed == 2) {
			    		
			    		    System.out.println("*****  THE BORROWED MUSIC RECORDS  *****");
			    		
			    		
                            if (MusicRecords.Array_MusicRecords_borrow.isEmpty()) {
							
				    		System.out.println("There Is No Borrowed Music Records In The Library System..."
				    					        + "You Are Redirected Out Of The Program ......"); 
				    		Thread.sleep(1000);
				    		continue;
						}
			    		
                         for (MusicRecords music : MusicRecords.Array_MusicRecords_borrow) {
							
			    			System.out.println(music.bring_information_musicRecord_borrow(music));
						}
					}
				}
			    else if (input == 11) {   // 11- WRITE A PERSON, IT WILL INDICATE WHETHER IT IS AN AUTHOR OR A PRODUCER  ---
					
			    	System.out.println(line);
		    		System.out.println("Do You Want To See All Media Items Information ?");
		    		scanner.nextLine();
		    		
		    		System.out.println("YES --- 1\n" + "NO  --- 2");
		    		int all_media = scanner.nextInt();
		    		
		    		if (all_media == 1) {
		    			
						System.out.println("*****  ALL BOOKS  *****");
                         for (Books book : Books.Array_Books) {      // foreach loop --  display all books 
				    		
				    		System.out.println(line);
				    		System.out.println(book.bring_information_book(book));
				    		System.out.println(line);
					    }
                         
                         System.out.println("*****  ALL MUSIC RECORDS  *****");
                         for (MusicRecords music : MusicRecords.Array_MusicRecords) {      // foreach loop --  display all music records 
 				    		
 				    		System.out.println(line);
 				    		System.out.println(music.bring_information_musicRecord(music));
 				    		System.out.println(line);
 						}
					}
		    		else if (all_media == 2) {
						
		    			System.out.println(line);
					}
		    		else {
						
		    			System.out.println("You Entered The Wrong Input. The Program Is Running Again....");
		    			continue;
					}
		    		
		    		System.out.println("Write A Person That You Want To Display : ");
		    		scanner.nextLine();
		    		String person_write = scanner.nextLine();
		    		
		    		
		    		for (Books authorcntrl : Books.Array_Books) {              // IF THE PERSON IS AN AUTHOR , THIS FOREACH LOOP WILL RUN
		    			
		    			if (person_write.equals(authorcntrl.getAuthor())) {
							
		    				
		    				System.out.println(line);
		    				System.out.println(person_write + " Is An Author....");
		    				System.out.println(line);
						}
						
					}
		    		
		    		for (MusicRecords music_person : MusicRecords.Array_MusicRecords) {              // IF THE PERSON IS A PRODUCER , THIS FOREACH LOOP WILL RUN
						if (person_write.equals(music_person.getProducer())) {
							
							System.out.println(line);
							System.out.println(person_write + " Is A Producer...");
							System.out.println(line);
						}
					}
		    		
		    		if (continue_yes()) {
			    		continue;
					}
			    	else {
						System.out.println("THE LIBRARY IS CLOSING .....");
						Thread.sleep(2000);
						System.out.println("THE LIBRARY CLOSED  ... SEE YOU SOON !!");
						return;
					}
			    	
				}
			    else if (input == 12) {   // 12- SIGN OUT  ---
					
			    	System.out.println("HOPE TO SEE YOU AGAIN ....");
			    	System.out.println("THE LIBRARY IS CLOSING .....");
			    	Thread.sleep(1000);
			    	System.out.println("----------  THE LIBRARY CLOSED  ----------");
			    	return;
				}
			    else {
					System.out.println(warning);
					System.out.println("You Have Entered a Different Input Than Expected. Our Library Stops...");
					return;
				}
			}
		} catch (Exception e) {                                      // ERROR
              
			System.out.println("SOMETHING WENT WRONG. " + warning);
			System.out.println("ERROR MESSAGE : " + e );
		}
		
        
	}
}
