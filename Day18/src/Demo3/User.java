package Demo3;
/*
* 用户实体类
* */
public class User {
    private Long id;
    private String uname;
    private String pwd;
    public static long num=0;

    public User() {
    }

    public User(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }

    public User(Long id, String uname, String pwd) {
        this.id = id;
        this.uname = uname;
        this.pwd = pwd;
        num++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
