package me.shuza.android_learn_ui_testing;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.shuza.android_learn_ui_testing.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btnSimpleTestActivity.setOnClickListener((v)-> startSimpleTestActivity());
        binding.btnListViewTestActivity.setOnClickListener((v)-> startListTestActivity());

    }

    private void startListTestActivity() {
        startActivity(new Intent(this, ListUIActivity.class));
    }

    public void startSimpleTestActivity() {
        startActivity(new Intent(this, CounterActivity.class));
    }
}
