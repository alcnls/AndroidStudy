package kr.effrot.listview.s.item;

/**
 * Created by kimsungwoo on 2017. 11. 27..
 */

public class SingerItem {

    String groupName;
    String count;
    String name;


    public SingerItem(String groupName, String count, String name) {
        this.groupName = groupName;
        this.count = count;
        this.name = name;
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
