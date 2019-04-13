package intern.com.prant.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by LENOVO-PC on 29/12/2017.
 */

public class giziSehatActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gizisehat);
    }

    public void launchanemiaActivity(View view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent intent = new Intent(this, anemiaActivity.class);
        startActivity(intent);
    }

    public void launchdbdActivity(View view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent intent = new Intent(this, dbdActivity.class);
        startActivity(intent);
    }

    public void launchdemamThypoidActivity(View view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent intent = new Intent(this, demamThypoidActivity.class);
        startActivity(intent);
    }
    public void launchdiareActivity(View view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent intent = new Intent(this, diareActivity.class);
        startActivity(intent);
    }
    public void launchtbcActivity(View view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent intent = new Intent(this, tbcActivity.class);
        startActivity(intent);
    }
    public void launchhipertensiActivity(View view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent intent = new Intent(this, hipertensiActivity.class);
        startActivity(intent);
    }
    public void launchhipokalemiaActivity(View view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent intent = new Intent(this, hipokalemiaActivity.class);
        startActivity(intent);
    }
    public void launchdispepsiaActivity(View view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent intent = new Intent(this, dispepsiaActivity.class);
        startActivity(intent);
    }
    public void launchpreeklampsiaActivity(View view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent intent = new Intent(this, preeklampsiaActivity.class);
        startActivity(intent);
    }
    public void launchhiperemesisActivity(View view) {
        Log.d(LOG_TAG, "Button	clicked!");
        Intent intent = new Intent(this, hiperemesisActivity.class);
        startActivity(intent);
    }
}
