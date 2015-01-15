package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class LonelyTweetModel {
	private String text;
	private Date timestamp;
	public String getText() {   // a method that return a string  text, takes no argument, doesnt throw any exception
		return text;
	}
	
	public LonelyTweetModel(String text) {   // constructor
		super();   // trigger the constructor in the class object
		this.text = text;
		timestamp = new Date();
	}
	
	public LonelyTweetModel(String text, Date timestamp) {
		super();
		this.text = text;
		this.timestamp = timestamp;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public abstract Date getTimestamp();
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
