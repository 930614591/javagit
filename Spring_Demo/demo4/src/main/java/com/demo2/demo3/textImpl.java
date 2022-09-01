package com.demo2.demo3;

public class textImpl implements text   {
    private String username;
    private Integer id;

    private text2 text2;

    public void setText2(com.demo2.demo3.text2 text2) {
        this.text2 = text2;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void save() {
        System.out.println(username+id);
        text2.t();
    }
}
