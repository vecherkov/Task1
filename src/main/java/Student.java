import java.util.Comparator;

public class Student {
    private Long id;
    private Long time;

    public Student(Long id, Long time) {
        this.id = id;
        this.time = time;
    }

    private Long getTime() {
        return time;
    }

    public static Comparator<Student> studentComparator
            = (student1, student2) -> {

        if (student1.getTime() > student2.getTime()) {
            return 1;
        } else if (student1.getTime() == student2.getTime()) {
            return 0;
        } else {
            return -1;
        }
    };

    public Long getId() {
        return id;
    }
}
