package intern.com.prant.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;


public	class	MainActivity extends AppCompatActivity {

    private	static	final	String	LOG_TAG	=	MainActivity.class.getSimpleName();

    @Override
    protected	void	onCreate(Bundle	savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public	void	launchSecondActivity(View	view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent	intent	=	new	Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public	void	launchrumahSehatActivity(View	view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent	intent	=	new	Intent(this, rumahSehatActivity.class);
        startActivity(intent);
    }
    public	void	launchgiziSehatActivity(View	view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent	intent	=	new	Intent(this, giziSehatActivity.class);
        startActivity(intent);
    }
    public	void	launchkabarSehatActivity(View	view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent	intent	=	new	Intent(this, kabarSehatActivity.class);
        startActivity(intent);
    }
}

