// Filename: Recording.java
// Author: Guy
// Date: 2/19/2019
// Class that defines a single recording and contains getter and setter methods for each field of data

public class Recording
{
	// private data fields
	private String songTitle;
	private String artist;
	private int playingTime; // playing time in seconds
	
	// mutator methods (setters) for the fields in this class
	
	public void setSongTitle(String song)
	{
		songTitle = song;
	}

	public void setArtist(String a)
	{
		artist = a;
	}

	public void setPlayingTime(int time)
	{
		playingTime = time;
	}
	
	// accessor methods (getters) for each field individually
	
	public String getSongTitle()
	{
		return songTitle;
	}

	public String getArtist()
	{
		return artist;
	}

	public int getPlayingTime()
	{
		return playingTime;
	}
	
}	
