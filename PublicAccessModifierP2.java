package AccessModifierPackage2;
// Different Package Sub Class

import AccessModifierPackage1.PublicAccessModifierP1;

public class PublicAccessModifierP2 extends PublicAccessModifierP1 {
    public static void main(String[] args) {

        PublicAccessModifierP2 pp2 = new PublicAccessModifierP2();
        pp2.MethodP1();
        pp2.MethodP11();
}
}

// Different Package Non Sub Class

class AnotherNonSubClassP2{
    public static void main(String[] args) {

        PublicAccessModifierP1 pp2 = new PublicAccessModifierP1();
        pp2.MethodP11();
        pp2.MethodP1();
    }
}