package kr.effrot.listview.s;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import kr.effrot.listview.R;
import kr.effrot.listview.s.adapter.SingerAdapter;
import kr.effrot.listview.s.item.SingerItem;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    SingerAdapter singerAdapter;

    ArrayList<SingerItem> singerItems;

    String[] groupName = {"트와이스", "소녀시대", "마마무", "여자친구", "레드벨벳", "블랙핑크", "에이핑크", "걸스데이", "AOA", "EXID", "빅뱅"};
    String[] count = {"9", "8", "4", "6", "5", "4", "6", "4", "7", "5", "5"};
    String[] name = {
            "나연, 정연, 모모, 사나, 지효, 미나, 다현, 채영, 쯔위",
            "태연, 써니, 티파니, 효연, 유리, 수영, 윤아, 서현",
            "솔라, 문별, 휘인, 화사",
            "소원, 예린, 은하, 유주, 신비, 엄지",
            "소원, 예린, 은하, 유주, 신비, 엄지",
            "지수, 제니, 로제, 리사",
            "박초롱, 윤보미, 정은지, 손나은, 김남주, 오하영",
            "소진, 유라, 민아, 혜리",
            "지민, 초아, 유나, 혜정, 민아, 설현, 찬미",
            "LE, 정화, 하니, 솔지, 혜린",
            "G-DRAGON, 태양, T.O.P, 대성, 승리"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        itemInit();

        singerAdapter = new SingerAdapter(this, singerItems);

        listView.setAdapter(singerAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Log.d("ListViewItemClick", String.valueOf(position));
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);


                intent.putExtra("groupName", singerItems.get(position).getGroupName());
                intent.putExtra("count", singerItems.get(position).getCount());
                intent.putExtra("name", singerItems.get(position).getName());
                startActivity(intent);
            }
        });

    }

    private void itemInit() {
        singerItems = new ArrayList<>();

        for (int i = 0; i < groupName.length; i++) {
            singerItems.add(new SingerItem(groupName[i], count[i], name[i]));
        }
    }

}
