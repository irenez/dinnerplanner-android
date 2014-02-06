package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.R;
import android.view.View;
import android.widget.TextView;

public class StartupView {
	
	View view;

	public StartupView(View view) {
		// store in the class the reference to the Android View
		this.view = view;

		TextView message = (TextView) view.findViewById(R.id.message_text);
		message.setText("Welcome to Dinner Planner! \n \nHere you will be able to easily plan your dinner. \n\nOn the next page start by selecting number of participants. Then select your courses. \n\nWatch Magic Happen!");

		// Setup the rest of the view layout

	}
}
