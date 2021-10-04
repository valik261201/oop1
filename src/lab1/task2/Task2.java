package lab1.task2;

public class Task2 {
    public static void main(String[] args) {
        Student[] list1 = new Student[3];
        University[] universities;

        Student s1 = new Student("Ion", 20, 7d);
        Student s2 = new Student("Petrea", 10, 3d);
        Student s3 = new Student("Vasea", 20, 9d);
        list1[0] = s1;
        list1[1] = s2;
        list1[2] = s3;
        University u1 = new University("1", 1999, list1);

        s1 = new Student("Sandu", 21, 5d);
        s2 = new Student("Ionita", 21, 7d);
        s3 = new Student("Petrita", 21, 6d);
        list1[0] = s1;
        list1[1] = s2;
        list1[2] = s3;
        University u2 = new University("2", 1999, list1);

        s1 = new Student("Vasilisa", 22, 10d);
        s2 = new Student("Garbus", 22, 9d);
        s3 = new Student("Cacus", 22, 7d);
        list1[0] = s1;
        list1[1] = s2;
        list1[2] = s3;
        University u3 = new University("3", 1999, list1);

        universities = new University[]{u1, u2, u3};

        double avg = 0;
        int count = 0;
        for(University u : universities) {
            for (Student s : u.studentList) {
                avg += s.mark;
                count++;
            }
        }
        System.out.print("Average mark is " + avg/count);
    }
}
