package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Person> pirates = new ArrayList<>();

        pirates.add(new Person("Monkey D.", "Luffy", 19));
        pirates.add(new Person("Roronoa", "Zoro", 21));
        pirates.add(new Person("Nami", "", 20));
        pirates.add(new Person("Usopp", "", 19));
        pirates.add(new Person("Vinsmoke", "Sanji", 21));
        pirates.add(new Person("Tony Tony", "Chopper", 17));
        pirates.add(new Person("Nico", "Robin", 30));
        pirates.add(new Person("Franky", "", 36));
        pirates.add(new Person("Brook", "", 90));
        pirates.add(new Person("Jinbe", "", 46));

        //test if names were added to the list
        for (Person p : pirates) {
            System.out.printf("%s %s, %d\n",p.getFirstName(), p.getLastName(), p.getAge());
        }

        //look for the name zoro
        System.out.println("=========== Looking for Zoro ===========");
        ArrayList<Person> lookForZoro = new ArrayList<>();
        for(Person p : pirates){
            if(p.getLastName().equalsIgnoreCase("zoro")){
                lookForZoro.add(p);
                System.out.println(p.getLastName());
            }
        }

        //calculate the average age of all people in the original list
        System.out.println("=========== Average Age ===========");
        ArrayList<Person> averageAge = new ArrayList<>();
        int totalAge = 0;
        for(Person p : pirates){
            totalAge += p.getAge();
        }
        int average = totalAge/pirates.size();
        System.out.println("The average age is " + average);

        //display the age of the oldest person
        System.out.println("=========== Oldest Person ===========");
        ArrayList<Person> oldest = new ArrayList<>();
        int oldestAge = pirates.get(0).getAge();
        for(Person p : pirates){
            if(oldestAge < p.getAge()){
                oldestAge = p.getAge();
            }
        }
        System.out.println(oldestAge);

        //display the age of the youngest person
        System.out.println("=========== Youngest Person ===========");
        ArrayList<Person> youngest = new ArrayList<>();
        int youngestAge = pirates.get(0).getAge();
        for(Person p : pirates){
            if(youngestAge > p.getAge()){
                youngestAge = p.getAge();
            }
        }
        System.out.println(youngestAge);
    }
}
