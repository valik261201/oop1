package lab5.task1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("------Method 1 by using only J------");
        J jClassOnly = new J();
        jClassOnly.a = "a1";
        jClassOnly.b = "b1";
        jClassOnly.c = "c1";
        jClassOnly.d = "d1";
        jClassOnly.e = "e1";
        jClassOnly.f = "f1";
        jClassOnly.g = "g1";
        jClassOnly.h = "h1";
        jClassOnly.i = "i1";
        jClassOnly.j = "j1";

        System.out.println("J.a - " + jClassOnly.a + "\n"
                + "J.b - " + jClassOnly.b + "\n"
                + "J.c - " + jClassOnly.c + "\n"
                + "J.d - " + jClassOnly.d + "\n"
                + "J.e - " + jClassOnly.e + "\n"
                + "J.f - " + jClassOnly.f + "\n"
                + "J.g - " + jClassOnly.g + "\n"
                + "J.h - " + jClassOnly.h + "\n"
                + "J.i - " + jClassOnly.i + "\n"
                + "J.j - " + jClassOnly.j + "\n");

        A aClass = new A();
        aClass.a = "a2";

        B bClass = new B();
        bClass.b = "b2";

        C cClass = new C();
        cClass.c = "c2";

        D dClass = new D();
        dClass.d = "d2";

        E eClass = new E();
        eClass.e = "e2";

        F fClass = new F();
        fClass.f = "f2";

        G gClass = new G();
        gClass.g = "g2";

        H hClass = new H();
        hClass.h = "h2";

        I iClass = new I();
        iClass.i = "i2";

        J jClass = new J();
        jClass.j = "j2";

        System.out.println("------Method 2 by creating a new object of each class------");
        System.out.println("aClass.a - " + aClass.a + "\n"
                + "bClass.b - " + bClass.b + "\n"
                + "cClass.c - " + cClass.c + "\n"
                + "dClass.d - " + dClass.d + "\n"
                + "eClass.e - " + eClass.e + "\n"
                + "fClass.f - " + fClass.f + "\n"
                + "gClass.g - " + gClass.g + "\n"
                + "hClass.h - " + hClass.h + "\n"
                + "iClass.i - " + iClass.i + "\n"
                + "jClass.j - " + jClass.j + "\n");
    }
}
