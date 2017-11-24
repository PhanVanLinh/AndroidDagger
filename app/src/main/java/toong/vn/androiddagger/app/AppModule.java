package toong.vn.androiddagger.app;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import toong.vn.androiddagger.SoundsRepository;

@Module
public class AppModule {

    @Provides
    @Singleton
    SoundsRepository provideSoundsRepository() {
        return new SoundsRepository("hello");
    }
}