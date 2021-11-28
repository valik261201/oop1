package lab5.task3;

public class D extends C {
    protected String d;

    protected X x = new X("xxx from D");

    public D(String d) {
        super("from D");
        this.d = d;
    }
}
