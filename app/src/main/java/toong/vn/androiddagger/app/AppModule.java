package toong.vn.androiddagger.app;

import android.app.Application;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import toong.vn.androiddagger.SoundsRepository;

@Module
public class AppModule {
    private final Application app;

    public AppModule(Application app) {
        this.app = app;
    }

    @Provides
    @Singleton
    SoundsRepository provideSoundsRepository() {
        return new SoundsRepository("hello");
    }
}