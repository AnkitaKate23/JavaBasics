package AccessModifierPackage2;

import AccessModifierPackage1.ProtectedAccessModifierP1;
//Different Package Sub Class
public class ProtectedAccessModifierP2 extends ProtectedAccessModifierP1 {
    public static void main(String[] args) {
        ProtectedAccessModifierP2 proP2 = new ProtectedAccessModifierP2();
        proP2.test1();
        proP2.test2();
    }

}

//Different Package Non Sub Class

class AnotherProtectedNonSubClassP2{
    public static void main(String[] args) {
        ProtectedAccessModifierP1 proP2 = new ProtectedAccessModifierP1();
        proP2.test2();
       // proP2.test1(); Protected Method Can not Access

    }
}