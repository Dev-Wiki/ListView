package net.devwiki.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NormalListViewActivity extends AppCompatActivity {

    @Bind(R.id.normal_list_view)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_list_view);
        ButterKnife.bind(this);
    }
}
