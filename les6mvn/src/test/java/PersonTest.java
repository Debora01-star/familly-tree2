import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void nammeShouldBeNotChangedDuringCreation() {
        //arrange & act
        Person p = new Person("Pietje Puk");

        //assert
        assertEquals("Pietje Puk", p.getName());
        

    }
}