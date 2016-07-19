package reusing;

/**
 * Create two classes, A and B, with default constructors (empty argument
 lists) that announce themselves. Inherit a new class called C from A, and create a member of
 class B inside C. Do not create a constructor for C. Create an object of class C and observe
 the results.
 Constructors with a
 Created by alex on 15.07.16.
 */
class A{
    public A(){
    System.out.println("A ");
    }
}
class B{
    public B(){
        System.out.println("B");
    }
}

public class C extends A{
    B b = new B();

    public static void main(String[] args) {
        C c = new C();
    }
}
