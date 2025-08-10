package masterJava.com.lesson2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {


    @Test
    public void shouldReturnHelloWorld() {
        Person meisme = new Person();
        assertEquals("Hello World", meisme.helloWorld());
    }

    @Test
    public void shouldReturnHelloMeisme() {
        Person person = new Person();
        assertEquals("Hello Pheak", person.hello("Pheak"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        assertEquals(2, Person.numberOfPersons());
    }
}
