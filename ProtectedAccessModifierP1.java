package AccessModifierPackage1;
//Protected Access Modifier
//Same class
public class ProtectedAccessModifierP1 {
    protected void test1(){
        System.out.println("This is the protected method test from packageP1");
    }
    public void test2(){
        System.out.println("This is the public method test2 from packageP1");

    }

    public static void main(String[] args) {
        ProtectedAccessModifierP1 pp1 = new ProtectedAccessModifierP1();
        pp1.test1();
        pp1.test2();
    }
}
// Same package Sub class

class AnotherProtectedSubClassP1 extends ProtectedAccessModifierP1{

    public static void main(String[] args) {
        AnotherProtectedSubClassP1 proP1 = new AnotherProtectedSubClassP1();
        proP1.test1();
        proP1.test2();
    }

}

//Same Package non Sub class

class AnotherProtectedNonSubClassP1{
    public static void main(String[] args) {
        ProtectedAccessModifierP1 proPP1 = new ProtectedAccessModifierP1();
        proPP1.test2();
        proPP1.test1();
    }
}
