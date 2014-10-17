package cs356.csupomona.edu.ocpdemo.answer;

import android.content.Context;
import android.widget.SeekBar;

/**
 * Created by yusun on 10/17/14.
 */
public class SeekBarAnswer extends SeekBar implements AnswerType {

    public SeekBarAnswer(Context context) {
        super(context);
    }

    @Override
    public String getAnswerAsString() {
        return this.getProgress() + "";
    }
}
