package Beispiel_5;

import javax.lang.model.element.NestingKind;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private String abteilung;

    public Person(String name, String abteilung) {
        this.name = name;
        this.abteilung = abteilung;
    }

    public String getName() {
        return name;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

}


class filter{

    public static  void gruppieren() {
        List<Person> personen = Arrays.asList(
                new Person("Anna", "IT"),
                new Person("Ben", "HR"),
                new Person("Clara", "IT"),
                new Person("David", "Marketing"),
                new Person("Eva", "HR")
        );


        Map<String, List<Person>> gruppiert = personen.stream()
                .collect(Collectors.groupingBy(p -> p.getAbteilung()));

        gruppiert.forEach((abteilung, liste) -> {

            System.out.println("Abteilung: " + abteilung);
            liste.forEach(p-> System.out.println(" - " + p.getName()));
        });


    };

    public static void main(String[] args) {

        gruppieren();
    }


}
