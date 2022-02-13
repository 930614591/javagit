package array.ListDemo;

public class StuDent {
    private long sno;
    private String name;
    private float score;
    public StuDent(){
        super();
    }

    public long getSno() {
        return sno;
    }
    public boolean stu(){
        System.out.println(this.getName()+this.getScore()+this.getSno());
        return false;
    }
    public StuDent(long sno, String name, float score) {
        this.sno = sno;
        this.name = name;
        this.score = score;
    }

    public void setSno(long sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
