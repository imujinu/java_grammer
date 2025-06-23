package C03Inheritance.ProtectedPackage;

import C03Inheritance.C04ProtectedClass;

public class ProtectedTest extends C04ProtectedClass {
    public static void main(String[] args) {
        C04ProtectedClass p1 = new C04ProtectedClass();
        ProtectedTest p = new ProtectedTest();
        p1.str1 = "hello python";
        p.str4 = "hello";
    }
}
