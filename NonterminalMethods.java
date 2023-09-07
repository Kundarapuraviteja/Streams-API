package DiffernetClasses;

import Queues.UsingLinkedList.LinearQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NonterminalMethods {

    public static void main(String[] args) {
        List<Integer> l11= Arrays.asList(1,2,1,3,4,5,2,6,7,8,7,9,10,9);

        // -------------------- distinct() - returns a stream of unique or distinct values from the stream
        List<Integer> l22=l11.stream().distinct().collect(Collectors.toList());
        System.out.println("printing distinct values in a list : by various types:");
        System.out.println(l22);
        l11.stream().distinct().forEach(n->System.out.print(n+" "));
        System.out.println("");
        l11.stream().distinct().forEach(System.out::print);

        // -----------------limit() method - its like size operator or range for the stream.
        System.out.println("-------- limit() method :---------\n prints the first 4 values in the list :");
        l11.stream().limit(4).forEach(System.out::println);

        //-------------------------------- flatmap() - method applies operation as a mapper function and provides a stream of element values.
        //It means that in each iteration of each element the map() method creates a separate new stream.
        List<List<Integer>> l1=new ArrayList();
        List<Integer> l2=new ArrayList();
        l1.add(Arrays.asList(1,2));
        l1.add(Arrays.asList(3,4));
        l1.add(Arrays.asList(5,6));

        System.out.println("before applying flatmap: "+l1);

        l2=l1.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println("after applying flatmap: "+l2);

        List<String> ta=Arrays.asList("arun","nivi","virat");
        List<String> tb=Arrays.asList("raina","thomas","cheeku");
        List<String> tc=Arrays.asList("ms","king","kohli");

        List<List<String>> p=new ArrayList();
        p.add(ta);
        p.add(tb);
        p.add(tc);
        List<String> l3=p.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(l3);

        //-------------- peek() - to peek at the elements in the stream, not to transform them.
        // The peek() method returns a new Stream which contains all the elements in the original stream.
        System.out.println("peek method");

        IntStream.range(1, 6)
                .peek(i -> System.out.println("Before map: " + i))
                .map(i -> i * i)
                .peek(i -> System.out.println("After map: " + i))
                .sum();



    }
}
