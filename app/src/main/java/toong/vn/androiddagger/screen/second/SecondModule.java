package toong.vn.androiddagger.screen.second;

import android.app.Activity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by PhanVanLinh on 24/11/2017.
 * phanvanlinh.94vn@gmail.com
 */

@Module
public class SecondModule {
    private Activity mActivity;

    public SecondModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    Book provideBookTest() {
        return new Book();
    }
}
