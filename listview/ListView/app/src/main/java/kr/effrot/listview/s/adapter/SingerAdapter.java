package kr.effrot.listview.s.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import kr.effrot.listview.R;
import kr.effrot.listview.s.item.SingerItem;

/**
 * Created by kimsungwoo on 2017. 11. 27..
 */

public class SingerAdapter extends BaseAdapter {

    private ArrayList<SingerItem> items = new ArrayList<>();
    Context context;

    private LayoutInflater inflater;

    public SingerAdapter(Context context, ArrayList<SingerItem> items) {
        this.context = context;
        this.items = items;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        View view = null;

        Log.d("getView", "호출됨" + position);

        if (convertView == null) {
            Log.d("convertView=", "null");

            view = inflater.inflate(R.layout.singer_item, viewGroup, false);

        } else {
            Log.d("convertView=", "not null");
            view = convertView;
        }


        TextView groupName = view.findViewById(R.id.groupNameText);
        TextView count = view.findViewById(R.id.countText);
        TextView name = view.findViewById(R.id.nameText);

        SingerItem singerItem = items.get(position);

        groupName.setText(singerItem.getGroupName());
        count.setText(singerItem.getCount() + "명");
        name.setText(singerItem.getName());

        Log.d("view", String.valueOf(view));

        return view;
    }
}
