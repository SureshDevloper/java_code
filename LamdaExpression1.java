class LamdaExpression1{
public static void main(String[] args){
    // System.out.println("hello world");
    // a obj=()->  System.out.println("hello1 from  m1");
    // obj.m1();
    Runnable r=()-> System.out.println("running thread");
    r.run();
}


}
@FunctionalInterface
 interface a {
    void m1();
    // void m2();
 }
//  class b implements a{
//     public void m1(){
//         System.out.println("hello from m1");
//     }
//  }