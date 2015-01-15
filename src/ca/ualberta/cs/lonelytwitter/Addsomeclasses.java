package ca.ualberta.cs.lonelytwitter;


public abstract class Addsomeclasses
{

	protected String friend;

	
	public String getFriend()
	{
	
		return friend;
	}

	
	public abstract void setFriend(String name);
	/*
	{
	
		this.friend = friend;
	}
    */

	public Addsomeclasses(String friend)
	{

		super();
		this.friend = friend;
	}
	
	
	
}
