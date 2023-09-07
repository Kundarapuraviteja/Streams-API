package DiffernetClasses;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTerminalMethods {

    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,1,3,4,5,2,6,7,8,7,9,10,9);

        // distinct()
        List<Integer> l2=l1.stream().distinct().collect(Collectors.toList());
        System.out.println("printing distinct values in a list : by various types:");
        System.out.println(l2);
        l1.stream().distinct().forEach(n->System.out.print(n+" "));
        System.out.println("");
        l1.stream().distinct().forEach(System.out::print);

        //terminal methods
        //---------------count() method - count the elements in the stream according to logic
		long c=l1.stream().distinct().count();
		System.out.println("\n--------terminal method - count() :------ \ntotal distinct values in the list: "+c);
		long cc=l1.stream().filter(n->n%2==0).count();
		System.out.println("no of even numbers in the list: "+cc);

       // -----------------limit() method - its like size operator or range for the stream.
        System.out.println("--------terminal - limit() method :---------\n prints the first 4 values in the list :");
        l1.stream().limit(4).forEach(System.out::println);

        //---------------min() method - returns the smallest element in the Stream.
		Optional<Integer> min=l1.stream().min((v1, v2)->{
			return v1.compareTo(v2);
		});
		System.out.println("min method value: "+min.get());

        //---------------max() method - returns the largest element in the Stream.
		Optional<Integer> max=l1.stream().max((v1,v2)->{
			return v1.compareTo(v2);
		});
		System.out.println("max() method value: "+max.get());

        //--------------------------collect() method
        // collects the elements in the stream in a collection or object of some kind.
        List<String> strs=Arrays.asList("hulk","iron man","cap","spide");
        List<String> collectors=strs.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println("converted list to uppercase chars: "+collectors);

        // ---------sorted() method - returns a sorted stream either of the order.
        System.out.println("sorting the list in asc :");
        l1.stream().sorted().forEach(n-> System.out.print(n+" "));
        System.out.println("\n sorting the list in dsc reverse order: ");
        l1.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.print(s+" "));

        Set<String> s1=new HashSet();
        s1.add("one mango");
        s1.add("one apple");
        s1.add("one apple");
        s1.add("two guava");
        s1.add("one papaya");

        //--------------------------anyMatch()
        //method is a terminal operation that accepts one Predicate as an argument,
        // initiates the Stream's internal iteration, and applies the Predicate parameter to each element.
        boolean b=s1.stream().anyMatch(v->{return v.startsWith("one");});
        System.out.println("\n do elements in set starts with string -one- "+b);

        //----------------------------allmatch()
        //returns true if all elements in the stream matches the predicate else return false.
        boolean b2=s1.stream().allMatch(v->{return v.startsWith("one");	});
        System.out.println("\n do all elements in set starts with string -one- "+b2);

        //---------------------------none match
        //The noneMatch() method will return true if no elements are matched by the Predicate, and false if one or more elements are matched.
        boolean b3=s1.stream().noneMatch(v->{return v.startsWith("one");	});
        System.out.println("\n do none of the elements in set starts with string -one- "+b3);

        //-----------findany()- method can find a single element from the Stream.
        // The element found can be from anywhere in the Stream.
        // return any value as an optional class

        Set<String> s2=new HashSet();
        s2.add("one");
        s2.add("two");
        s2.add("three");
        s2.add("two");

        Optional<String> op1=s2.stream().findAny();
        System.out.println(op1.get());

        //-----------------------findfirst()
        //returns first element in the stream if present.
        //returns an optional
        Optional<String> opt2=s2.stream().findFirst();
        System.out.println(opt2.get());

        //------------------------foreach()
        //used for iterating the stream applies consumer to each element in the stream.
        System.out.println("foreach loop iteration: ");
        strs.stream().forEach(e-> {System.out.print(e+" ");});

        System.out.println();

        //--------------reduce() combine into one single collction
		List<String> l22=Arrays.asList("A","B","C","D","E","1", "2");
		Optional<String> opt1=l22.stream().reduce((v,combinedvalue)->{
								return v+" + "+combinedvalue;
												});
		System.out.println("reduce method result : "+opt1.get());



    }
}
