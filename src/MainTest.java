import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created on 10/21/17.
 */
public class MainTest {
    @Test
    public void generateRandom() throws Exception {
    }

    @Test
    public void rad() throws Exception {
        int actul = Main.rad();

        assertTrue(0 <= actul && actul <= 4);

    }


}