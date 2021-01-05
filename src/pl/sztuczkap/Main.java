package pl.sztuczkap;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // łączenie strumieni
        Stream<String> names1 = Stream.of("Ania", "Marek", "Ola");
        Stream<String> names2 = Stream.of("Franek", "Wojtek", "Ola");

//        Stream.concat(names1, names2).skip(2).forEach(System.out::println); // skip przeskakuje o ilosc osob

        // strumien limit
//        Stream.generate(Math::random).limit(10).forEach(System.out::println);

//        Stream.concat(names1, names2).distinct().forEach(System.out::println);  // distinct zwraca bez powtorzen

        // sortowanie strumieni od najmniejszej ilosci znakow
        Stream.concat(names1, names2)
                .distinct()
                .peek(System.out::println) // pokazuje strumien przed sortowniem
                .sorted(Comparator.comparing(String::length))
                .forEachOrdered(System.out::println); // Ordered to gwarancja poprawnej kolejności

    }
}
