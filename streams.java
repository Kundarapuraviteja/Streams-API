package DiffernetClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streams {

    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        List<Integer> ar= Arrays.asList(10,20,30,40,50,11,13);
        List<Integer> a1=new ArrayList();


        //--------------------filter method-----
        System.out.println("filter method operations \n printing odd numbers");
		a1=a.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println(a1);
        System.out.println("printing even numbers ");
		a.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
        List<String> names=Arrays.asList("virat","msd","sky","smriti");
        List<String> dup1=new ArrayList();
        dup1=names.stream().filter(n->n.length()>4 &&  n.length()<7).collect(Collectors.toList());
        System.out.println("\n printing strings of length greater than 4 and less than 7 \n"+dup1);

        //----------------- map method ------------------
        List<String> l1=Arrays.asList("car","bike","bus","flight","train");
        List<String> l2=new ArrayList();
        System.out.println("\n map method operations");
        System.out.println("length of each string in list l1 : ");
        l1.stream().map(v->v.length()).forEach(n-> System.out.print(n+" "));

    }
}
