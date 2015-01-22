package ca.ualberta.cs.lonelytwitter;


public class Reader extends User
{
	public void setUsername(String x)
	{
		if(x.length() <= 8)
		{
			throw new RuntimeException("Name too short");
		}
		
		//this.username = x;   
		
	}
}
