package net.devwiki.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);
        List<String> footList = new ArrayList<>();
        List<String> contentList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            contentList.add("content" + i);
            footList.add("footer" + i);
        }

        ArrayAdapter<String> contentAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contentList);
        listView.setAdapter(contentAdapter);

        ArrayAdapter<String> footerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, footList);
        FootListView footView = new FootListView(this);
        footView.setAdapter(footerAdapter);

        listView.addFooterView(footView);
    }
}
