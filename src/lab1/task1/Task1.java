package lab1.task1;

public class Task1 {
    public static void main(String[] args) {
        Monitor m1 = new Monitor("pink", 69, new int[]{1420, 1080});
        Monitor m2 = new Monitor("white", 61, new int[]{1920, 1080});
        Monitor.compare(m1, m1);
        Monitor.compare(m1, m2);
    }
}
