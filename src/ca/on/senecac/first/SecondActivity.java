package ca.on.senecac.first;
import android.widget.Toast; // lab2:3

import android.app.Activity;
import android.content.Context; // lab2:3
import android.os.Bundle;

public class SecondActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.secondary);
    	
    	// lab2:3 --- start
    	Context context = getApplicationContext();
    	CharSequence text = "Hello toast!";
    	int duration = Toast.LENGTH_LONG;

    	Toast toast = Toast.makeText(context, text, duration);
    	toast.show();
    	// lab2:3 --- finish   	
    	
	}
}