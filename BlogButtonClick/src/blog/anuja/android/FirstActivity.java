package blog.anuja.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends Activity implements OnClickListener {
	
	// Declare UI elements
	private TextView changingTextView;
	private Button firstButton;
	private Button secondButton;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main); // Our only layout for this app is main.xml
        
        // Initialize the UI components
        changingTextView = (TextView) findViewById(R.id.changingTextView);
        firstButton = (Button) findViewById(R.id.leftButton);
        // When we creating a button and if we expect that to use for event handling we have to set the listener
        firstButton.setOnClickListener(this);
        secondButton = (Button) findViewById(R.id.rightButton);
        secondButton.setOnClickListener(this);
    }

    // Have to implement with the OnClickListner
    // onClick is called when a view has been clicked.
	@Override
	public void onClick(View v) { // Parameter v stands for the view that was clicked.  

		// getId() returns this view's identifier.
		if(v.getId() == R.id.leftButton){
			// setText() sets the string value of the TextView
			changingTextView.setText("You clicked First");
		}else if(v.getId() == R.id.rightButton){
			changingTextView.setText("You clicked Second");
		}
	}
}