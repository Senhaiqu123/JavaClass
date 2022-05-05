/**
 * This is HW2, Album class
 * @author senhai
 * @version "1.8.0_162"
 */
public class Album {
	
	private String title;
	private String artist;
	private String genre;
	private Song favoriteTrack;
	private int trackNumber;
	public static int numAlbums;
	
	/**
	 * This constructs a album with a specific value of tile, song and trackNumber
	 * @param title set the title value of this album
	 * @param favoriteTrack set the song value of this album
	 * @param trackNumber set the trackNumber of this album
	 */
	public Album(String title, Song favoriteTrack, int trackNumber) {
		this.title=title;
		this.favoriteTrack=favoriteTrack;
		this.trackNumber=trackNumber;
		this.genre=favoriteTrack.getGenre();
		numAlbums++;
	}
	
	/**
	 * This constructs a album with a specific value of tile, favorriteTrack, trackNumber, genre of this song, and increment numAlbums by 1
	 * @param title set the title value of this album
	 * @param favoriteTrack set the favoriteTrack of this album
	 */
	public Album(String title, Song favoriteTrack) {
		this(title, favoriteTrack, 1);
	}
	
	/**
	 * This return title value of this album
	 * @return this album's title value
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * 	This return favoriteTrack of this album
	 *  @return this album's favoriteTrack;
	 */
	public Song getFavoriteTrack() {
		return this.favoriteTrack;
	}
	
	/**
	 * This return trackNumber of this album 
	 * @return this album's trackNumber
	 */
	public int getTrackNumber() {
		return this.trackNumber;
	}
	
	/**
	 * This set the title value of this album
	 * @param title set this album's title value
	 */
	public void setTitle(String title) {
		this.title=title;
	}
	
	/**
	 * This set the artist value of this album
	 * @param artist set this album's artist
	 */
	public void setArtist(String artist) {
		this.artist=artist;
	}
	/**
	 * This set the genre value of this album and update the genre of that song as well
	 * @param genre set this album's genre
	 */
	public void setGenre(String genre) {
		this.genre=genre;
		this.favoriteTrack.setGenre(genre);
	}
	
	/**
	 * This return This return the album's tile, artist, genre information 
	 * @return a string state this album's tile, artist, genre information
	 */
	public String toString() {
		return "Title: "+this.title+ "     Artist: "+this.favoriteTrack.getArtist()+"     Genre: "+this.genre;
	}

}
