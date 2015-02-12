package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.R;

public class IntentReaderActivityTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity>
{

	public IntentReaderActivityTest()
	{

		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception
	{

		super.setUp();
	}
	
	public void testSendText()
	{
		String text = "Hello World!";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		assertEquals("got the text?", text, activity.getText());
	}
	
	public void testDoubleText()
	{
		String text = "Hello World!";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.DOUBLE);
		assertEquals("double text ?", text+text, activity.getText());
	}
	
	public void testDisplayText(){
		String text = "Hello";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("Correct text?",text, view.getText());
		
	}
	public void testDisplayNoText(){
		String text = "";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("Correct text?",text, view.getText());
		
	}
	
	public void testReverseText(){
		String text = "Hello";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.REVERSE);
		assertEquals("Correct text?","olleH", activity.getText());
	}
	
	
	private IntentReaderActivity startWithText(String text, int mode){
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, mode);
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();
	}

}
