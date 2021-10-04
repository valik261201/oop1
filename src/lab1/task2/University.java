package lab1.task2;

public class University {
    public String name;
    public int foundationYear;
    public Student[] studentList;

    public University(String name, int foundationYear, Student[] studentList){
        this.name = name;
        this.foundationYear = foundationYear;
        this.studentList = studentList;
    }
}
