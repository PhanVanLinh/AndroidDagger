package toong.vn.androiddagger.screen.third;

import android.app.Activity;
import dagger.Module;

/**
 * Created by PhanVanLinh on 24/11/2017.
 * phanvanlinh.94vn@gmail.com
 */

@Module
public class ThirdModule {
    private Activity mActivity;

    public ThirdModule(Activity activity) {
        mActivity = activity;
    }

}
