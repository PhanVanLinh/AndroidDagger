package toong.vn.androiddagger.screen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import javax.inject.Inject;
import toong.vn.androiddagger.R;
import toong.vn.androiddagger.model.Knife;

public class MainActivity extends AppCompatActivity {

    @Inject
    Knife knife;

    @Inject
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder().mainModule(new MainModule()).build().a(this);

//        knife = mainComponent.getKnife();
    }
}
