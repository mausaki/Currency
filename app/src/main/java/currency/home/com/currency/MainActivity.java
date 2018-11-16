package currency.home.com.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    private TextView jp;
//    private TextView us;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void currency(View view) {
        EditText editText=findViewById(R.id.ntd);
        TextView jp=findViewById(R.id.jp);
        TextView us=findViewById(R.id.us);

        String ntd = editText.getText().toString();
        float ntd1= Float.parseFloat(ntd);
        float jpC = (float) (ntd1*3.14);
        float usC = (float) (ntd1*5.0);
        Log.d("MainActivity","JP_currency:" +jpC);
        Log.d("MainActivity","US_currency:" +usC);
        jp.setText("" +jpC);
        us.setText("" +usC);

    }
}
