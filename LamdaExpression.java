import java.util.*;
// import java.util.stream.Stream;
class LamdaExpression {
public static void main(String args[]){
    List<Integer> list=new ArrayList<>();
    list.add(9);
    list.add(8);
    list.add(4);
    list.add(7);
    // for(int i:list){
    //     if(i%2==0){
    //         int sequire=i*i;
    //         System.out.println(sequire);
    //     }
    // }
    // for(int i=0;i<list.size();i++){
    //     System.out.println(list.get(i));
    // }
    // for(int i:list){
    //     System.out.println(i);
    // }
//     list.forEach(i->
//         System.out.println(i));
// }
// list.forEach(i->System.out.println(i*2));
// Stream<Integer> stream=list.stream();
// int sum=list.stream().filter(i->i%2==0).map(i->(i*i)).reduce(1,(a,b)->a*b);
// System.out.println("Sum of squares of even numbers: " + sum);
// forEach(i->System.out.println(i));
// int max_value=list.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
// System.out.println("Max value=="+ max_value);
list.stream().map(x -> x * x).forEach(System.out::println);
}
}