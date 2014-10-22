package cs356.csupomona.edu.ocpdemo;

import cs356.csupomona.edu.ocpdemo.submit.DBSubmitServie;
import cs356.csupomona.edu.ocpdemo.submit.SubmitService;
import dagger.Module;
import dagger.Provides;

/**
 * Created by yusun on 10/21/14.
 */
@Module(
        injects = MainActivity.class
)
public class DemoModule {

    @Provides
    SubmitService provideSubmitServie() {
        return new DBSubmitServie();
    }
}
