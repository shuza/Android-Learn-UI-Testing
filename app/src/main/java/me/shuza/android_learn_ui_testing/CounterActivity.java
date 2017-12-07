package me.shuza.android_learn_ui_testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CounterActivity extends AppCompatActivity {
    @BindView(R.id.tvCounterResult)
    TextView tvCounterResult;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_test);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnIncreaseCounter)
    public void increaseCounter(View view) {
        tvCounterResult.setText(String.valueOf(++count));
    }
}
