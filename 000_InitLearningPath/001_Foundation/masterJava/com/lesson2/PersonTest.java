package masterJava.com.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void shouldReturn() {
        Person meisme = new Person();
        assertEquals("Hello World", meisme.helloWorld());
    }

    @Test
    public void shouldReturnHelloMeisme() {
        Person person = new Person();
        assertEquals("Hello Meisme", person.hello("Meisme"));
    }
}
