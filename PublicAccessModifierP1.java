package AccessModifierPackage1;
//For Public Access Modifiers
//Same class

public class PublicAccessModifierP1 {
       public void MethodP1(){

           System.out.println("This is the public method1 in same class");

        }
       public void MethodP11(){
           System.out.println("This is the public method2 in same class");
       }

    public static void main(String[] args) {
     PublicAccessModifierP1 PublicP1 = new PublicAccessModifierP1();
     PublicP1.MethodP1();

    }

}
// Same Package Sub(Different) class -----> Is-a RelationShip

class AnotherSubClassP1 extends PublicAccessModifierP1{
    public static void main(String[] args) {

        AnotherSubClassP1 obj1 = new AnotherSubClassP1();
        obj1.MethodP1();
        obj1.MethodP11();

    }

}

//Same Package Non-Sub(Different) class -----> Has-A Relationship

class AnotherClassP1{
    public static void main(String[] args) {
    PublicAccessModifierP1 obj = new PublicAccessModifierP1();
    obj.MethodP1();

    }

}



