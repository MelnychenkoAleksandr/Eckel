package reusing;

/**Exercise 15: (2) Create a class inside a package. Your class should contain a protected
 method. Outside of the package, try to call the protected method and explain the results.
 Now inherit from your class and call the protected method from inside a method of your
 derived class.
 * Created by alex on 19.07.16.
 */
public class MyClass {
    protected void myMethod(){
        System.out.println("My method protected started");
    }
}
