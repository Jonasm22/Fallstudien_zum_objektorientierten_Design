package H_HashMap;

import java.util.HashMap;
import java.util.Objects;

public class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // override equals
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        // override hashCode
        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return name + "(" + age + ")";
        }
    }

    class HashMapPersonExample {
        public static void main(String[] args) {
            HashMap<Person, String> map = new HashMap<>();

            Person p1 = new Person("Alice", 30);
            Person p2 = new Person("Bob", 25);
            Person p3 = new Person("Charlie", 35);

            map.put(p1, "Engineer");
            map.put(p2, "Designer");
            map.put(p3, "Manager");

            System.out.println("Initial map: " + map);

            // duplicate key (same name and age), replaces value
            Person p4 = new Person("Alice", 30);
            map.put(p4, "Architect");
            System.out.println("After updating 'Alice': " + map);

            // check if key exists
            boolean hasAlice = map.containsKey(p1);
            boolean hasEve = map.containsKey(new Person("Eve", 28));
            System.out.println("Map contains 'Alice'? " + hasAlice);
            System.out.println("Map contains 'Eve'? " + hasEve);

            // check if value exists
            boolean hasManager = map.containsValue("Manager");
            System.out.println("Map contains value 'Manager'? " + hasManager);
        }
    }



