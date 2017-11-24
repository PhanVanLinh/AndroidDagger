package toong.vn.androiddagger.screen;

import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import toong.vn.androiddagger.UserScope;
import toong.vn.androiddagger.model.Knife;

/**
 * Created by PhanVanLinh on 08/06/2018.
 * phanvanlinh.94vn@gmail.com
 */
@Module
public class MainModule {

    @Provides
    public Knife provideKnife() {
        return new Knife();
    }

    @Provides
    @Named
    @UserScope
    public String a(){
        return "hello";
    }
}
