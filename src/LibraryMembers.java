import java.util.ArrayList;

// LibraryMember Class
public class LibraryMembers extends Media {

	// Generate a new ArrayList to hold the library members in the system.
	static ArrayList<LibraryMembers> Array_LibraryMembers = new ArrayList<LibraryMembers>(); 
	
	public LibraryMembers(String member) {
		super(member);
	}
	
	// AddMemberNames method to add a library member.
	static void AddMemberNames(LibraryMembers member) {   
		  	Array_LibraryMembers.add(member);
	}
}
