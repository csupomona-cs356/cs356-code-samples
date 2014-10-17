package cs356.csupomona.edu.ocpdemo.answer;

import android.content.Context;

/**
 * Created by yusun on 10/17/14.
 */
public class EditTextAnswer extends android.widget.EditText implements AnswerType {

    public EditTextAnswer(Context context) {
        super(context);
    }

    @Override
    public String getAnswerAsString() {
        return this.getText().toString();
    }
}
