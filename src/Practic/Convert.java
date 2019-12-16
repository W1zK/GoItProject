package Practic;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Convert {
    Employee sara1 = new Employee("Sara", 19);
    Employee viktor1 = new Employee("Viktor", 40);
    Employee eva1 = new Employee("Eva", 42);
    Employee anna1 = new Employee("Anna", 20);
    List<Employee> collectionMin = asList(sara1, eva1, viktor1, anna1);


    Employee sara2 = new Employee("Sara", 4, "Norwegian");
    Employee viktor2 = new Employee("Viktor", 40, "Serbian");
    Employee eva2 = new Employee("Eva", 42, "Norwegian");
    List<Employee> collectionGroup = asList(sara2, eva2, viktor2);

    Employee sara = new Employee("Sara", 45);
    Employee viktor = new Employee("Viktor", 40);
    Employee eva = new Employee("Eva", 42);
    List<Employee> collectionEmployee = asList(sara, eva, viktor);
    List<Integer> numbers = asList(1, 2, 3, 4, 5);

    List<String> collection = asList("My", "name", "is", "John", "Doe");

    List<List<String>> collectionDual = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));

    List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");

    List<String> result = collection.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

    List<String> result1 = collection.stream()
            .filter(x -> x.length() < 4).collect(Collectors.toList());


    Stream<String> combinedStream = collectionDual.stream()
            .flatMap(List::stream);
    List<String> getCollectionDual = combinedStream.collect(Collectors.toList());


    int maxAge = collectionEmployee.stream()
            .max(Comparator.comparing(Employee::getAge)).get().getAge();


    Integer sum = numbers.stream()
            .reduce((left, right) -> left + right).get();


    List<Employee> minAge = collectionMin.stream()
            .filter(x -> x.getAge() <25).collect(Collectors.toList());



    IntSummaryStatistics statistic = collectionEmployee.stream()
            .mapToInt(Employee::getAge).summaryStatistics();



    //Map<String, Long> group = collectionGroup.stream()
            //.collect(Collectors.groupingBy();
}








