import java.util.Objects;

public class student {
    String name;
    int Roll_No;
    student(String name,int Roll){
        this.name=name;
        this.Roll_No= Roll;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", Roll_No=" + Roll_No +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof student)) return false;
        student student = (student) o;
        return Roll_No == student.Roll_No;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Roll_No);
    }
}
