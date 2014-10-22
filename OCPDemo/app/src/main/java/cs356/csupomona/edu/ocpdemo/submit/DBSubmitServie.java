package cs356.csupomona.edu.ocpdemo.submit;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by yusun on 10/21/14.
 */
public class DBSubmitServie implements SubmitService {
    @Override
    public void submitAnswer(Context context, String answer) {
        Toast.makeText(context, "Submit to DB: " + answer, Toast.LENGTH_SHORT).show();
    }
}
