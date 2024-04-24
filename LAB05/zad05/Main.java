package LAB05.zad05;

class A {
    public void present(String phrase) {
        System.out.println(phrase);
    }
}

class B extends A {
    @Override
    public void present(String phrase) {
        super.present(phrase);
    }
}

class C extends B {
    @Override
    public void present(String phrase) {
        super.present(phrase);
    }
}

class D extends C {
    @Override
    public void present(String phrase) {
        super.present(phrase);
    }
}

class E extends D {
    @Override
    public void present(String phrase) {
        super.present(phrase);
    }
}

public class Main {
    public static void main(String[] args) {
        E e = new E();
        e.present("*Fraza*");
    }
}
