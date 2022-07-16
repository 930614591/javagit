package pojo;

public class sjj {
    private Integer id;
    private String name;
    private String 作者;
    private String 类别;
    private String 简介;
    private String 时间;
    private Integer 章节;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get作者() {
        return 作者;
    }

    public void set作者(String 作者) {
        this.作者 = 作者;
    }

    public String get类别() {
        return 类别;
    }

    public void set类别(String 类别) {
        this.类别 = 类别;
    }

    public String get简介() {
        return 简介;
    }

    public void set简介(String 简介) {
        this.简介 = 简介;
    }

    public String get时间() {
        return 时间;
    }

    public void set时间(String 时间) {
        this.时间 = 时间;
    }

    public Integer get章节() {
        return 章节;
    }

    public void set章节(Integer 章节) {
        this.章节 = 章节;
    }

    @Override
    public String toString() {
        return "sjj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", 作者='" + 作者 + '\'' +
                ", 类别='" + 类别 + '\'' +
                ", 简介='" + 简介 + '\'' +
                ", 时间='" + 时间 + '\'' +
                ", 章节=" + 章节 +
                '}';
    }
}
