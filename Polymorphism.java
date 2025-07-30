public class Polymorphism{
    public static void main(String args[]){
        Polymorphism p=new Polymorphism();
 p.abc(8);
 System.out.println(p.abc(4));
//  System.out.println(p.abc("6"));
    }
      void abc(int a) {
   System.out.println(a);
// return a;
      }
      int abc(int b) {
//    System.out.println(b);
// return "testing polymorphism";
return b;
      }
    
}