package lab5.task3;

public class H extends G {
    protected String h;

    private X x = new X("xxx from H");

    public H(String h) {
        super("from H");
        this.h = h;
    }
}
