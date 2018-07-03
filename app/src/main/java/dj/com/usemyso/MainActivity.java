package dj.com.usemyso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import dj.com.jni.demo2;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textV1);
        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dj.com.testso2.MainActivity main = new dj.com.testso2.MainActivity();
                tv.setText(main.showResult());
                demo2 do2 = new demo2();
                do2.getIntFromC();
                do2.getStringFromC();
            }
        });
    }

}
