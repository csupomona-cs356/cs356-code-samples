package cs356.csupomona.edu.ocpdemo;

import android.app.Application;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

/**
 * Created by yusun on 10/21/14.
 */
public class DemoApplication extends Application {

    private ObjectGraph graph;

    @Override public void onCreate() {
        super.onCreate();

        graph = ObjectGraph.create(new DemoModule());
    }

    protected List<Object> getModules() {
        return Arrays.asList(
                (Object) new DemoModule()
        );
    }

    public void inject(Object object) {
        graph.inject(object);
    }
}
