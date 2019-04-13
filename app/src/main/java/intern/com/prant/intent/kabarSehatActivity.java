package intern.com.prant.intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by LENOVO-PC on 29/12/2017.
 */

public class kabarSehatActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kabarsehat);

        TextView text1 = (TextView) findViewById(R.id.textKabar1);
        text1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text2 = (TextView) findViewById(R.id.textKabar2);
        text2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text3 = (TextView) findViewById(R.id.textKabar3);
        text3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text4 = (TextView) findViewById(R.id.textKabar4);
        text4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text5 = (TextView) findViewById(R.id.textKabar5);
        text5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text6 = (TextView) findViewById(R.id.textKabar6);
        text6.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text7 = (TextView) findViewById(R.id.textKabar7);
        text7.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text8 = (TextView) findViewById(R.id.textKabar8);
        text8.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text9 = (TextView) findViewById(R.id.textKabar9);
        text9.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text10 = (TextView) findViewById(R.id.textKabar10);
        text10.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text11 = (TextView) findViewById(R.id.textKabar11);
        text11.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text12 = (TextView) findViewById(R.id.textKabar12);
        text12.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
