import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void aaa() {
         assertTrue(Demo.newStringMethods().equals(Arrays.asList("All Algeria", "Java", "Community.")));
    }
}
