package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


public class TweetList
{
	private ArrayList<LonelyTweetModel> tweetList;
	private int count;
	
	
	public TweetList(){
		tweetList = new ArrayList<LonelyTweetModel>();
		count = 0;
	}
	public ArrayList<LonelyTweetModel> getTweets(){
	
		return tweetList;

	}
	public int  getCounts(){
		return count;
	}
	public void addTweet(LonelyTweetModel tweet) throws IllegalArgumentException
	{
		count++;
		if(tweetList.indexOf(tweet)==-1)
		{
			
		tweetList.add(tweet);
		}else
		{
			throw new IllegalArgumentException("the element is already in the list");
			
		}
		
	}
}
