package com.sp.pojo;

public class User {
    private Integer user_id;
    private String name;
    private String psw;
    private String id_m;
    private Integer tim_id;
    private Integer gm;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getId_m() {
        return id_m;
    }

    public void setId_m(String id_m) {
        this.id_m = id_m;
    }

    public Integer getTim_id() {
        return tim_id;
    }

    public void setTim_id(Integer tim_id) {
        this.tim_id = tim_id;
    }

    public Integer getGm() {
        return gm;
    }

    public void setGm(Integer gm) {
        this.gm = gm;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", psw='" + psw + '\'' +
                ", id_m='" + id_m + '\'' +
                ", tim_id=" + tim_id +
                ", gm=" + gm +
                '}';
    }
}
