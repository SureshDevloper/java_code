class polyMorphism1{

    public static void main(String[] args) {
       test t = new test();
        t.m1(10,10); 
       t.m1(11);
       t.m1();
      
    } 
}  
class test{
   
    void m1(int a){
        System.out.println("general method called" + a );
    }
    void m1(int...a){
        System.out.println("var arg called" + a);
        
    }
}
    // class test2 extends test{
    //     int m1(int a){
    //         System.out.println("a in test2: " + a);
    //         return a;
    //     }
    // }

