package toong.vn.androiddagger.app;

import android.support.multidex.MultiDexApplication;

public class Global extends MultiDexApplication {

    protected AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.inject(this);
    }

    public AppComponent getComponent() {
        return appComponent;
    }
}