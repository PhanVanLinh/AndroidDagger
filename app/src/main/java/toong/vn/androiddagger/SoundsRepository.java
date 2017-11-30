package toong.vn.androiddagger;

import android.util.Log;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by PhanVanLinh on 24/11/2017.
 * phanvanlinh.94vn@gmail.com
 */
@Singleton
public class SoundsRepository {
    private String mText;

    @Inject
    public SoundsRepository(String text) {
        Log.i("TAG", "create sound");
        mText = text;
    }

    public String getText() {
        return mText;
    }
}
