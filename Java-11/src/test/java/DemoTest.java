import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DemoTest {

    @Test
    public void newStringMethodsTest() {
        assertTrue(Demo.newStringMethods().equals(Arrays.asList("All Algeria", "Java", "Community.")));
    }

    @Test
    public void newFileMethodsTest() {
        assertTrue(Demo.newFileMethods().equals("Hello World !!"));
    }

    @Test
    public void collectiontoArrayTest() {
        assertTrue(Arrays.equals(Demo.collectiontoArray(), new String[]{"Algiers", "Setif"}));
    }

    @Test
    public void httpClient() {
        assertTrue(Demo.httpClient().contains("\"id\": 1,"));
    }
}

