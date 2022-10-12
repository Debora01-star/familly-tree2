import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToolTest {

    @Test
    void shouldReverseString() {
        //arrange
        String s = "Hello Novi";

        //act
        String result = StringTool.reverse(s);

        //assert
        assertEquals("ivoN olleH", result );


    }
}