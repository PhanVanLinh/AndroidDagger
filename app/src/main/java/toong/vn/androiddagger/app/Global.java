package toong.vn.androiddagger.app;

import android.app.Application;

public class Global extends Application {

    protected AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
        appComponent.inject(this);
    }

    public AppComponent getComponent() {
        return appComponent;
    }
}