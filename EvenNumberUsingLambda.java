import java.util.Arrays;
import java.util.List;
class EvenNumberUsingLambda{
    public static void main (String [] args){
      List<Integer> num= Arrays.asList(1,2,4,3,5,6,7,89010,14,16,18,30); 
      num.stream().filter(n->n%2==0).
      forEach(i->System.out.println(i));
    }
}