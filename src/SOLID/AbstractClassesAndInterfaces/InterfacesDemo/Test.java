package SOLID.AbstractClassesAndInterfaces.InterfacesDemo;

import java.sql.SQLOutput;

interface A {
    default void doSome() {
        System.out.println("A");
    }
}

interface B {
    default void doSome() {
        System.out.println("B");
    }
}

class C implements A,B {
    @Override
    public void doSome() {
        A.super.doSome();
        B.super.doSome();
        System.out.println("Do Some");
    }
}

public class Test {
    public static void main(String[] args) {
        C c = new C();
        c.doSome();
    }
}
