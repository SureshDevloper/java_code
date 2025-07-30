import java.util.*;
class Comparable{

    public static void main(String args[]){
        // System.out.println("welcome to java programm");
        List<String> list= new  ArrayList<>();
        list.add("java");
        list.add("paython");
        list.add("javascript");
        Collections.sort(list);
        System.out.println(list);

        Comparator<Integer> com = new Comparator<Integer>(){
            @Override
            public int compare(Integer t1,Integer t2){
                if(t1%10 > t2%10)
                    return 1;
                
                else 
                return -1;
                
            }
        };

        List<Integer> list1= new ArrayList<>();
        list1.add(43);
        list1.add(31);
        list1.add(22);
        Collections.sort(list1,com);
        System.out.println(list1);
    }
}