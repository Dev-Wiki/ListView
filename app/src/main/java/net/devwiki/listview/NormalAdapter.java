package net.devwiki.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 普通的ListView的适配器
 * Created by Administrator on 2016/1/3 0003.
 */
public class NormalAdapter extends BaseAdapter {

    private List<String> dataList;
    private LayoutInflater inflater;

    public NormalAdapter(Context context, List<String> dataList) {
        this.dataList = dataList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public String getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_normal, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.normalItemText.setText(getItem(position));
        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.normal_item_text)
        TextView normalItemText;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
