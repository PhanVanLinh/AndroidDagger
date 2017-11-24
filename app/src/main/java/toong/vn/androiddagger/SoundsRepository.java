package toong.vn.androiddagger;

import android.util.Log;

/**
 * Created by PhanVanLinh on 24/11/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class SoundsRepository {
    private String mText;

    public SoundsRepository(String text) {
        Log.i("TAG", "create sound");
        mText = text;
    }

    public String getText() {
        return mText;
    }
}
