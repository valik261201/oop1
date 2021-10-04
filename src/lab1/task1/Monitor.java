package lab1.task1;

import java.util.Arrays;

public class Monitor {
    public String color;
    public int dimensions;
    public int[] resolution;

    public Monitor(String color, int dimensions, int[] resolution){
        this.color = color;
        this.dimensions = dimensions;
        this.resolution = resolution;
    }

    public static void compare(Monitor m1, Monitor m2){

        System.out.println("equals - " + m1.equals(m2));
        System.out.println("Color is the same - "+m1.color.equals(m2.color));
        System.out.println("Dimensions is the same - "+ (m1.dimensions == m2.dimensions));
        System.out.println("Resolution is the same - "+ Arrays.equals(m1.resolution, m2.resolution)+"\n");
    }
}
