package kr.effrot.listview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by kimsungwoo on 2017. 11. 27..
 */

public class SingerItemView extends LinearLayout {

    TextView groupName;
    TextView count;
    TextView name;


    public SingerItemView(Context context) {
        super(context);

        init(context);
    }

    public SingerItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.singer_item , this , true);

        groupName = findViewById(R.id.groupNameText);
        count = findViewById(R.id.countText);
        name = findViewById(R.id.nameText);

    }

    public void setGroupName(String groupNameText){
        groupName.setText(groupNameText);

    }

    public void setCount(String countText){
        count.setText(countText);
    }

    public void setName(String nameText){
        name.setText(nameText);
    }



}
