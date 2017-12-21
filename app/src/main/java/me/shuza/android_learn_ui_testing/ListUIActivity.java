package me.shuza.android_learn_ui_testing;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import me.shuza.android_learn_ui_testing.databinding.ActivityListUiBinding;
import me.shuza.android_learn_ui_testing.databinding.ListItemTestBinding;

public class ListUIActivity extends AppCompatActivity {
    ActivityListUiBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ui);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_list_ui);
        List<String> data = new ArrayList<>(Arrays.asList(new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen"}));
        MyAdapter adapter = new MyAdapter(data);
        binding.rvList.setLayoutManager(new LinearLayoutManager(this));
        binding.rvList.setAdapter(adapter);
    }


    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
        List<String> names;

        public MyAdapter(List<String> names) {
            this.names = names;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_test, parent, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.binding.tvListItemName.setText(names.get(position));
        }

        @Override
        public int getItemCount() {
            return names.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder {
            public ListItemTestBinding binding;

            public MyViewHolder(View itemView) {
                super(itemView);
                binding = ListItemTestBinding.bind(itemView);
            }
        }
    }
}
