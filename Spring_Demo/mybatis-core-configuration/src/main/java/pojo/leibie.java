package pojo;

public class leibie {
    Integer id;
    String 名称;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String get名称() {
        return 名称;
    }

    public void set名称(String 名称) {
        this.名称 = 名称;
    }

    @Override
    public String toString() {
        return "leibie{" +
                "id=" + id +
                ", 名称='" + 名称 + '\'' +
                '}';
    }
}
