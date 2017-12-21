package me.shuza.android_learn_ui_testing;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.shuza.android_learn_ui_testing.databinding.ActivitySimpleTestBinding;


public class CounterActivity extends AppCompatActivity {
    ActivitySimpleTestBinding binding;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_test);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_test);
        binding.btnIncreaseCounter.setOnClickListener((v) -> increaseCounter());
    }

    public void increaseCounter() {
        binding.tvCounterResult.setText(String.valueOf(++count));
    }
}
