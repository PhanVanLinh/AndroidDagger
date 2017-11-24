package toong.vn.androiddagger.screen;

import dagger.Component;
import toong.vn.androiddagger.UserScope;

@UserScope
@Component(modules = MainModule.class)
public interface MainComponent {

    String getA();

    void a(MainActivity activity);
}
