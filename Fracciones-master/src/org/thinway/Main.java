package org.thinway;

public class Main {

    public static void main(String[] args) {

        Fraccion f1 = new Fraccion(1,7);
        Fraccion f2 = new Fraccion(4,5);

        f1.sumar(f2);

        System.out.println(f1);
    }
}
