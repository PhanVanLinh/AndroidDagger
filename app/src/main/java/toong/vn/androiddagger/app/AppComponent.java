package toong.vn.androiddagger.app;

import dagger.Component;
import javax.inject.Singleton;
import toong.vn.androiddagger.screen.second.SecondActivity;
import toong.vn.androiddagger.screen.third.ThirdActivity;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(Global global);

    void inject(SecondActivity secondActivity);

    void inject(ThirdActivity thirdActivity);
}