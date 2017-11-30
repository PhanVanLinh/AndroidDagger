package toong.vn.androiddagger.screen.second;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import javax.inject.Inject;
import toong.vn.androiddagger.R;
import toong.vn.androiddagger.SoundsRepository;
import toong.vn.androiddagger.app.Global;
import toong.vn.androiddagger.screen.third.ThirdActivity;

public class SecondActivity extends AppCompatActivity {

    @Inject
    SoundsRepository mSoundsRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ((Global)getApplication()).getComponent().inject(this);

        Log.i("TAG", "" + mSoundsRepository.getText());
        Log.i("TAG", "test");

        findViewById(R.id.start_third_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
            }
        });
    }
}
