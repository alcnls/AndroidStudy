package kr.effrot.objecttest.data;

import java.io.Serializable;

/**
 * Created by kimsungwoo on 2017. 12. 8..
 */

public class Data implements Serializable {

    private String name;
    private String age;
    private String tel;


    public Data(String name, String age, String tel) {
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    public Data() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
