package com.harshan92;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Person> persons=new ArrayList<Person>();

        persons.add(new Person("Kamal", "Male", "Single"));
        persons.add(new Person("Bella", "Female", "Single"));
        persons.add(new Person("Perera", "Female", "Married"));
        persons.add(new Person("Sharma", "Male", "Single"));
        persons.add(new Person("Lee", "Female", "Single"));
        persons.add(new Person("Dloph", "Male", "Married"));
        persons.add(new Person("Bob", "Male", "Single"));
        persons.add(new Person("Bella", "Female", "Single"));

        Criteria male=new CriteriaMale();
        Criteria female=new CriteriaFemale();
        Criteria single=new CriteriaSingle();
        Criteria singleMale=new AndCriteria(single, male);
        Criteria singleOrFemale=new OrCriteria(single, female);

        System.out.println("Males : ");
        printPersons(male.meetCriteria(persons));

        System.out.println("Females : ");
        printPersons(female.meetCriteria(persons));

        System.out.println("Single : ");
        printPersons(single.meetCriteria(persons));

        System.out.println("Single Male: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("Single or Female: ");
        printPersons(singleOrFemale.meetCriteria(persons));

    }

    public static void printPersons(List<Person> persons){
        for(Person person:persons){
            System.out.println(person.toString());
        }
    }
}