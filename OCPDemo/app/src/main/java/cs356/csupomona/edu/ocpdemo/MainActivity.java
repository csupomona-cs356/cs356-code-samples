package cs356.csupomona.edu.ocpdemo;

import android.app.Activity;
import android.media.Rating;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

import cs356.csupomona.edu.ocpdemo.answer.AnswerType;
import cs356.csupomona.edu.ocpdemo.answer.EditTextAnswer;
import cs356.csupomona.edu.ocpdemo.answer.SeekBarAnswer;

public class MainActivity extends Activity {

    private LinearLayout container;
    private Button submitButton;

    private AnswerType answerType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // answer container
        container = (LinearLayout) this.findViewById(R.id.container);

        // TODO: Add your answer widget here
        //EditText editText = new EditText(this);
        //answerType = new RatingBar(this);
        answerType = new EditTextAnswer(this);




        container.addView((View) answerType);

        // submit button
        submitButton = (Button) this.findViewById(R.id.submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String submitString = answerType.getAnswerAsString();
                Toast.makeText(MainActivity.this, submitString, Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
