package toong.vn.androiddagger.screen.third;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import javax.inject.Inject;
import toong.vn.androiddagger.R;
import toong.vn.androiddagger.SoundsRepository;
import toong.vn.androiddagger.app.Global;

public class ThirdActivity extends AppCompatActivity {

    @Inject
    SoundsRepository mSoundsRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

//        DaggerThirdComponent.builder()
//                .appComponent(((Global) getApplication()).getComponent())
//                .thirdModule(new ThirdModule(this))
//                .build()
//                .inject(this);

        ((Global)getApplication()).getComponent().inject(this);

        Log.i("TAG", "" + mSoundsRepository.getText());
    }
}
