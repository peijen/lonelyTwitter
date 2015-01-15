package ca.ualberta.cs.lonelytwitter;


public abstract class User extends Object implements UserLike  //with or without extends Object doesn't matter  wont change anything
{
	protected String username;  //attribute called username  contain a string

	
	public String getUsername() // must return a string
	{
	
		return username;
	}

	
	public abstract void setUsername(String x) throws IOException; //now this funcion must be defined in all sub classes  
	/*                                        
	{
	
		this.username = x;   //this.username is the attribute ; this.  is often implied
		
	}
*/

	public User(String username)       //added a method to user class; constructor: has the same name as class
	{

		super();
		this.username = username;
	} 
	
	
	public User()       //default constructor  , second constructor
	{

		super();
		this.username = "anonymous";
	} 

	
}
