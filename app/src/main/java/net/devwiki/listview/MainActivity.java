package net.devwiki.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Bind(R.id.list_view)
    ListView listView;
    @Bind(R.id.list_params)
    Button listParams;

    NormalAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        listParams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "first:" + listView.getFirstVisiblePosition());
                Log.d(TAG, "last:" + listView.getLastVisiblePosition());
            }
        });

        List<String> dataList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            dataList.add("Item-" + i);
        }
        adapter = new NormalAdapter(this, dataList);
        listView.setAdapter(adapter);

        /**
         * 滚动到该指定位置,尽量将此项滚动到firstVisiblePosition
         * 列表有两种情况: 1.大于一屏:此时设置此项看不到界面上的变化
         *              2.小于等于一屏:此时设置此项看不到界面上的变化
         */
        listView.setSelection(6);
    }
}
