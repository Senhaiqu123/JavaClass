/**
 * This is HW2, Song class
 * @author senhai
 * @version "1.8.0_162"
 * 
 */
public class Song {
	
	private String title;
	private String artist;
	private String genre;
	
	/**
	 * This constructs a song with a specific value of tile, artist and genre
	 * @param title set the value of the song's title
	 * @param artist set the value of the song's artist
	 * @param genre set the value of the song's genre
	 */
	public Song(String title, String artist, String genre) {
		this.title=title;
		this.artist=artist;
		this.genre=genre;
	}
	
	/**
	 * This constructs a song with a specific value of tile, artist and set genre's value "unknown".
	 * @param title
	 * @param artist
	 */
	public Song(String title, String artist) {
		this.title=title;
		this.artist=artist;
		this.genre="unknown";
	}
	
	/**
	 * This return the tile of the song
	 * @return this song's title
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * This return the artist of the song
	 * @return this song's artist
	 */
	public String getArtist() {
		return this.artist;
	}
	
	/**
	 * This return the genre of the song
	 * @return this song's genre
	 */
	public String getGenre() {
		return this.genre;
	}
	
	/**
	 * This set the song's  value of title
	 * @param title set a title value of this song 
	 */
	public void setTitle(String title) {
		this.title=title;
	}
	
	/**
	 * This set the song's value of artist
	 * @param artist set a artist value of this song
	 */
	public void setArtist(String artist) {
		this.artist=artist;
	}
	
	/**
	 * This set the song's value of genre
	 * @param genre set a genre value of this song
	 */
	public void setGenre(String genre) {
		this.genre=genre;
	}
	
	/**
	 * This return the song's tile, artist, genre information 
	 * @return a string states this song's tile, artist, genre information
	 */
	public String toString() {
		return  "artist: "+this.artist+" title: "+this.title+" genre: "+this.genre;
	}



}


