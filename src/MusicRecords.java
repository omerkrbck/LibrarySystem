import java.util.ArrayList;

// MusicRecords Class
public class MusicRecords extends Media implements IMusicRecords {

	// Generate a new ArrayList to hold the music records in the system.
	static ArrayList<MusicRecords> Array_MusicRecords = new ArrayList<MusicRecords>();   
		
	// Generate a new ArrayList to hold the borrowed music records in the system.
	static ArrayList<MusicRecords> Array_MusicRecords_borrow = new ArrayList<MusicRecords>(); 
	
	private String producer;  // A music recording has a producer.
	
	// Add Constructor MusicRecords(String title, String genre, String producer).
	public MusicRecords(String title, String genre, String producer) {
		super(title, genre);
		this.producer=producer;
	}
	
	// Generate Getters and Setters for producer --- ALT+SHIFT+S --- Generate Getters and Setters
	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	// AddMusicRecords method to add a book.
	static void AddMusicRecords(MusicRecords music) {   
	   	 Array_MusicRecords.add(music);
	}

	// bring_information_musicRecord method for info
    String bring_information_musicRecord(MusicRecords music) {
   	 
   	 String music_info="------  MUSIC RECORD  ------\n" + "The Order Of The Music Record In Our System(This number is important when choosing the music)-PLEASE ENTER THIS NUMBER: " 
   	                                            + Array_MusicRecords.indexOf(music) + "\nMusic Record ID : " + music.getID() + "\nMusic Record Title : " + music.getTitle() 
   	                                            + "\nMusic Record Genre : " + music.getGenre() + "\nProducer : " + music.getProducer();   
   	                              
   	    return bring_information(music_info);
    }
	
     // bring_information_musicRecord_borrow method for info
    String bring_information_musicRecord_borrow(MusicRecords music) {
   	 
   	 String music_info="------  MUSIC RECORD  ------\n" + "The Order Of The Music Record In Our System(This number is important when choosing the book)-PLEASE ENTER THIS NUMBER: " 
                                                + Array_MusicRecords_borrow.indexOf(music) + "\nMusic Record ID : " + music.getID() + "\nMusic Record Title : " + music.getTitle() 
                                                + "\nMusic Record Genre : " + music.getGenre() + "\nProducer : " + music.getProducer();
   	    return bring_information(music_info);
    }
	
	/* INTERFACE OVERRIDE
	 * Add unimplemented methods (IMusicRecords) -------- add_musicRecord(), delete_musicRecord(), borrow_musicRecord(), bring_musicRecord() --------
	 * @Override   */
	public void add_musicRecord(MusicRecords music) {
		
		Array_MusicRecords.add(music);
		System.out.println("The Music Record Named " + music.getTitle() + " Has Been Added To The System..");
	}

	public void delete_musicRecord(MusicRecords music) {

		try {
			for (MusicRecords music_for_each : Array_MusicRecords) {
				if (music.getID() == music_for_each.getID()) {
					Array_MusicRecords.remove(Array_MusicRecords.indexOf(music));
				}
			}
			System.out.println("The Music Record Named " + music.getTitle() + " Has Been Deleted From The System..");
		} catch (Exception e) {
			System.out.println("The Music Record Named " + music.getTitle() + " Has Been Deleted From The System..");
		}
	}

	public void borrow_musicRecord(MusicRecords music) {

		Array_MusicRecords_borrow.add(music);
		Array_MusicRecords.remove(Array_MusicRecords.indexOf(music));
		System.out.println("The Music Record Named " + music.getTitle() + " Has Been Deleted From The System And Transferred To The Loan Music Records Section."       
		                    + "\nPlease Do Not Forget To Bring It Back Within The Allotted Time  ...  Have A Good Listening  ..." );
	}

	public void bring_musicRecord(MusicRecords music) {

		Array_MusicRecords.add(music);
		Array_MusicRecords_borrow.remove(Array_MusicRecords_borrow.indexOf(music));
		System.out.println("The Music Record Named " + music.getTitle() + " Has Been Restored To The System."
				            + "\nThank You For Bringing It Within The Allotted Time...");
	}  
}
