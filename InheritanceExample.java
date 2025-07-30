class InheritanceExample{
    public static void main(String [] args){
        // System.out.println("inheritance example");
        // Child child=new Child();
        // child.m1();
        // child.m2();
      
        // Parent gc =new GrandChild();
        // gc.m1();
        // gc.m2();
        // gc.m3();
        // Child c=new Parent();
  
    }

}
class Parent{
    void m1(){
        System.out.println("Parent class method m1");
    }
    void m1(int a){
        System.out.println("Parent class method m2");
    }
}
class Child extends Parent{
    void m2(){
        System.out.println("Child class method m2");
    }
}
class GrandChild extends Child{
    void m3(){
        System.out.println("GrandChild called m3");
    }
}