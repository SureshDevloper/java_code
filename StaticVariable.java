import java.util.*;
class StaticVariable{
   private int a=10;
    static int b=20;
    // static char c;
    // static float d;
    // static double e;
    // static String f;

    // static boolean g;
    // static byte h;
    // static short i;
    // static long j;
    public static void main (String []args){
         StaticVariable sb=new StaticVariable();
        //  System.out.println(a);
        //  System.out.println(c);
        //  System.out.println(d);
        //  System.out.println(e);
        //  System.out.println(f);
        //  System.out.println(g);
        //  System.out.println(h);
        //  System.out.println(i);
            // System.out.println(j);
    // t1.a=10;
    // t1.b=20;
    // t1.display();
    test t2=new test(20);
    t2.setXy(40);
    System.out.println("xy=="+ t2.getXy());
    // t2.a=30;
    // t2.b=40;
    // t1.display();
    t2.display();
     sb.nonStatic();

    }
    public void nonStatic(){
        System.out.println(a);
    }
}
    class test{
      private  int xy=10; ;
        static int b;
        void display(){
            System.out.println("xy"+ xy);
            System.out.println("b=="+ b);
        }
        test(int xy){
this.xy=xy;
        }
        public int getXy(){
            return xy;
        }
        public void setXy(int xy){
            this.xy=xy;
        }
    
}