package intern.com.prant.intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by LENOVO-PC on 29/12/2017.
 */

public class rumahSehatActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumahsehat);


    }
    public void launchrumahSehatActivity(View view) {
    }

    public	void	launchalamatGMaps(View	view) {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/place/Rumah+Sakit+Umum+Daerah+Pademangan/@-6.1327593,106.8401266,15z/data=!4m2!3m1!1s0x0:0xb76eef2ff179aa22?sa=X&ved=0ahUKEwiWld3dnrDaAhWBtI8KHT0OBxoQ_BIIhQEwEQ&hl=id"));
        startActivity(intent);
    }
}
