package AccessModifierPackage1;
//Private Access Modifier
//We can only use this access modifier in same class

public class PrivateAccessModifierP1 {

        private void ShowPrivateP1(){
            System.out.println("This is private method from Private class package P1");
        }
        void DefaultTest(){
            System.out.println("Default for same package subclass");
        }
        public void SampleTest(){
            System.out.println("Sample test for public");
        }

    public static void main(String[] args) {
        PrivateAccessModifierP1 PriP1 = new PrivateAccessModifierP1();
        PriP1.ShowPrivateP1();
        PriP1.DefaultTest();
        PriP1.SampleTest();
    }
    }

// Same Package Sub class

class AnotherPrivateTestP1 extends PrivateAccessModifierP1 {
    public static void main(String[] args) {

        AnotherPrivateTestP1 PriTestP1 = new AnotherPrivateTestP1();
        //PriTestP1.ShowPrivateP1(); ------> The method is private we can not access this
        PriTestP1.DefaultTest(); // ------> We can access the default method in the same package Sub class


    }
}
// Same Package Non Sub class
class AnotherPrivateTestPP1{
    public static void main(String[] args) {
        PrivateAccessModifierP1 PriP2 = new PrivateAccessModifierP1();
        PriP2.DefaultTest(); // -----> We can access the default method in the same package Non Sub class
        //PriP2.ShowPrivateP1(); ------> can Not access
    }
}