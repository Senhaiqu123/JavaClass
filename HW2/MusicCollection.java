import java.util.Scanner;

/**
 * This is HW2, MusicCollection
 * @author senhai
 * @version "1.8.0_162"
 *
 */
public class MusicCollection {
	
	public static Scanner scan=new Scanner(System.in);
	
	
	/**
	 * This method  print out the Album information
	 * Allow the user to pick from the following options:
	 * 1. Get Favorite Track: prints out the song information
	 * 2. Change Genre:
	 * 0. Return:
	 * @param variableName pass this method with a Album parameter 
	 */
	public static void albumOptions(Album variableName) {
		
		//Display Options for user
		System.out.println(variableName.toString());
		System.out.println("[1] Get Favorite Track");
		System.out.println("[2] Change genre");
		System.out.println("[0] return" );
		
		//take a action from user
		int action;
		action=scan.nextInt();
		
		//if user input 1, print the Album information
		if(action==1) {
			System.out.println("Track No."+variableName.getTrackNumber()+" :"+variableName.toString()+"\n");
		}
		
		//if user input 2, update the genre
		if(action==2) {
			Scanner s=new Scanner(System.in);
			System.out.println("Please enter new genre: ");
			String update_genre=s.next();
			variableName.setGenre(update_genre);
			
		//if user input 0, return	
		if(action==0) {
			return ;
		}
		}
	}
	
	/**
	 * Main method
	 * Create 3 Songs and create an Album for each of the songs
	 * With a loop performs as:
	 * Prints out a numbered ordering of all the album
	 * Allows you to select which Album you would like to use and make a following decision
	 * The loop should terminate if the user enters 0 for the album selection
	 * Continues to loop otherwise
	 * @param args
	 */
	public static void main(String args[]) {
		//create 5 songs
		Song song_1=new Song("title_1","artist_1","genre_1");
		Song song_2=new Song("title_2","artist_2","genre_2");
		Song song_3=new Song("title_3","artist_3","genre_3");
		Song song_4=new Song("title_4","artist_4","genre_4");
		Song song_5=new Song("title_5","artist_5","genre_5");
		
		// for each song create an album and store them in the array album
		Album[] album=new Album[5];
		album[0]=new Album("Album_title_1",song_1,1); 
		album[1]=new Album("Alubm_title_2",song_2,2);
		album[2]=new Album("Alubm_title_3",song_3,3);
		album[3]=new Album("Alubm_title_4",song_4,4);
		album[4]=new Album("Alubm_title_5",song_5,5);
		
		
		while(true) {
			//Display the list option for user from array album
			System.out.println("Music Collection :");
			for(int i=0;i<album.length;i++) {
				System.out.println("["+(i+1)+"]"+album[i].getTitle());
			}
			System.out.println("[0] return");
			System.out.println("Plese select a album from up list: ");
			
			//if user input 0 return, else provide options for the selected album
			int select=scan.nextInt();
			if(select==0) return;
			albumOptions(album[select-1]);
		}
		
		
	}
}
