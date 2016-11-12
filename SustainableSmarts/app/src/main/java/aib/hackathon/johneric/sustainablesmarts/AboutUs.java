package aib.hackathon.johneric.sustainablesmarts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AboutUs extends AppCompatActivity
{
    private TextView messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

            messageView = (TextView) findViewById(R.id.messageView);

            messageView.setMovementMethod(new ScrollingMovementMethod());

    }
}
