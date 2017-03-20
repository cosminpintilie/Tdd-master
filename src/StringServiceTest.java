import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringServiceTest {

    private StringService service;
    @BeforeEach
    public void setUp(){
        service = new StringService();
    }

    @AfterEach
    public void tearDown(){
        service = null;
    }

    @Test
    public void capac_should_return_true() {
        // arrange && act
        boolean result = service.isPalindrome("capac");
        // assert
        assertTrue(result);
    }

    @Test
    public void capac1_should_return_false() {
        // arrange && act
        boolean result = service.isPalindrome("capac1");
        // assert
        assertFalse(result);
    }

    @Test
    public void caiac_should_return_true(){
        // arrange %&& act
        boolean result = service.isPalindrome("caiac");
        // assert
        assertTrue(result);
    }
}
