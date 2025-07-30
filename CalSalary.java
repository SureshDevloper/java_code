import java.util.*;
 class CalSalary{
    public static void main(String args[]){
        Salary s=new Salary();
   Scanner sc=new Scanner(System.in);
       int salary=sc.nextInt();
    
    s.calSalary(salary);
    }
}
class Salary{
  void calSalary(int basesalary){
    float totalSalary=basesalary*0.9f+basesalary*0.1f;
    System.out.println("total salary=="+ totalSalary);
   }

}