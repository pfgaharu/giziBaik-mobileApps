package intern.com.prant.intent;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by LENOVO-PC on 29/12/2017.
 */

public class SecondActivity extends AppCompatActivity {

    EditText editTinggiBadan;
    TextView texthasilBBIdeal;
    Button buttonHitung;
    Double x=0d;
    View view = this.getCurrentFocus();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initControls();

    }
    private void initControls()
    {
        editTinggiBadan=(EditText)findViewById(R.id.editTinggiBadan);
        texthasilBBIdeal=(TextView)findViewById(R.id.texthasilBBIdeal);
        buttonHitung=(Button)findViewById(R.id.buttonHitung);
        buttonHitung.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v) {
                calculate();
            }
        });
    }
    private void calculate()
    {
       if(editTinggiBadan.getText() != null && editTinggiBadan.getText().length() != 0){
           BigDecimal tinggiBadan = new BigDecimal(editTinggiBadan.getText().toString());
           // rumus = (tinggibadan-100)*90/100
           BigDecimal resultRumus = (tinggiBadan.subtract(new BigDecimal(100))).multiply(new BigDecimal(90)).divide(new BigDecimal(100));
           DecimalFormat df = new DecimalFormat("#0.00");
           texthasilBBIdeal.setText("Berat badan ideal dengan tinggi badan "+editTinggiBadan.getText().toString()+" cm adalah "+df.format(resultRumus)+" kg.");

               InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
               imm.hideSoftInputFromWindow(editTinggiBadan.getWindowToken(), 0);

       }else{
           texthasilBBIdeal.setText("");
           Toast.makeText(getApplicationContext(), "Silahkan isi tinggi badan.", Toast.LENGTH_LONG).show();
       }
    }

    public void launchSecondActivity(View view) {
    }
}
