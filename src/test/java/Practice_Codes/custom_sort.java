package Practice_Codes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Akshay = 27
//shivam =21
//random = 30
//sort this 1) by age 2) name

class Person {
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName (){
            return name;
        }

        public int getAge(){
            return age;
        }

        public String toString(){
            return "Person{"+name+"\""+", age=" +age + "}";
        }
        

}



public class custom_sort {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Akshay",27));
        people.add(new Person("Shivam", 21));
        people.add(new Person("random", 30));

        people.sort(Comparator.comparing(Person::getAge));
        System.out.println("Sort by Age " + people);

        people.sort(Comparator.comparing(Person::getName));
        System.out.println("Sorting by Name :" + people);

        



    
    }
}
