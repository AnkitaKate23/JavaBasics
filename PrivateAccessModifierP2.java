package AccessModifierPackage2;

import AccessModifierPackage1.PrivateAccessModifierP1;

// Different Package Sub class
public class PrivateAccessModifierP2 extends PrivateAccessModifierP1 {
    public static void main(String[] args) {

        PrivateAccessModifierP2 PriPP2 = new PrivateAccessModifierP2();
        PriPP2.SampleTest(); // -------> This is public
        //PriPP2.ShowPrivateP1(); ----> Can Not access Private Method
        //PriPP2.DefaultTest(); ------> Can not access Default Method
    }
}

class AnotherPrivateNonSubClass{
    public static void main(String[] args) {
        PrivateAccessModifierP2 PriP1 = new PrivateAccessModifierP2();
        PriP1.SampleTest();
        //PriPP2.ShowPrivateP1(); ----> Can Not access Private Method
        //PriPP2.DefaultTest(); ------> Can not access Default Method
    }
}