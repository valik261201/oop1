package lab5.task3;

public class J extends I {
    protected String j;

    public J(String j) {
        super("from J");
        this.j = j;
    }

    @Override
    public String toString() {
        return "J {" +
                "a='" + a + '\'' +
                "\n, " + new D("fix the private").x +
                "\n, b='" + b + '\'' +
                "\n, c='" + c + '\'' +
                "\n, d='" + d + '\'' +
                "\n, e='" + e + '\'' +
                "\n, f='" + f + '\'' +
                "\n, g='" + g + '\'' +
                "\n, h='" + h + '\'' +
                "\n, i='" + i + '\'' +
                "\n, j='" + j + '\'' +
                '}';
    }
}
