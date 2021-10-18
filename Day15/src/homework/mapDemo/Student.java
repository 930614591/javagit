package homework.mapDemo;

public class Student {
    private Long id;
    private String name;
    private  Integer score;

    public Student(Long id) {
        super();
    }

    public Student(Long id, String name, Integer score) {
        super();
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
