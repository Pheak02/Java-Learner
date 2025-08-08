package masterJava.com.lesson2; //must unique, consist of domain name

import masterJava.com.lesson3.Name;//import from other module/package
public class Person {

    private Name personName;
//    private static Name personName; //static class here will change all other instance(personName) as well.
    public Person(Name personName) {
        this.personName = personName;
    }

    public Person() {
    /*
    empty on purpose - default constructor
    */
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name){
    return "Hello " + name;
    }
}
