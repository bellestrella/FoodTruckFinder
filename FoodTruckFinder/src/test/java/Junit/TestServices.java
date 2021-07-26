package Junit;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;

public class TestServices {

    @Test
    void testEncription(){
        String A = "This is a Test Passphrase";
        String B = A;

        A = services.Security.makeSecure(A);

        assertFalse(A.equalsIgnoreCase(B));
    }
}
