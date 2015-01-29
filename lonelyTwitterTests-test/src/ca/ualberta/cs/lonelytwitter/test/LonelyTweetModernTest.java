package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;


public class LonelyTweetModernTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public LonelyTweetModernTest()
	{

		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception
	{

		super.setUp();
	}

	public void testSample()
	{
		//fail("this is a failing test");
		//assertFalse("this is false ", isGreaterThan(5,6));
		assertEquals("5 is equal to 5",5,5);
		
	}
	public void testEquals(){
		Date date = new Date();
		
		NormalTweetModel tweet1 = new NormalTweetModel("Hello",new Date(123));
		NormalTweetModel tweet2 = new NormalTweetModel("Ha",new Date(123));
		ImportantTweetModel tweet3 = new ImportantTweetModel("Hello",new Date(123));
		assertFalse("different tweets are equal", tweet3.equals(tweet1));
		
	}
	private boolean isGreaterThan(int i, int j){
		
		if(i>j)		
			return true;		
		else
			return false;
			
					
		
		}
	
}
