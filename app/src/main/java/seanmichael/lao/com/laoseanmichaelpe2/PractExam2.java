package seanmichael.lao.com.laoseanmichaelpe2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PractExam2 extends AppCompatActivity {
    Button tost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pract_exam2);
        tost = (Button) findViewById(R.id.button);
        tost.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Saving...", Toast.LENGTH_LONG).show();

            }
        });
    }
}
