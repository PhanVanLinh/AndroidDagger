package toong.vn.androiddagger.screen.third;

import dagger.Component;
import toong.vn.androiddagger.AppScope;
import toong.vn.androiddagger.app.AppComponent;

/**
 * Created by PhanVanLinh on 24/11/2017.
 * phanvanlinh.94vn@gmail.com
 */

@AppScope
@Component(dependencies = AppComponent.class, modules = ThirdModule.class)
public interface ThirdComponent {

    void inject(ThirdActivity activity);
}
