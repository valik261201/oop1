package lab5.task3;

public class A {
    protected String a;

    protected X x = new X("xxx");

    public A() {
        this.a = "blabla";
        this.x = new X("default X from A");
    }
}
