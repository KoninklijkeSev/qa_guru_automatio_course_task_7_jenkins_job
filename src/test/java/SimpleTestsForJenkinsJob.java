import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.is;

public class SimpleTestsForJenkinsJob {
    @Test
    @Tag("positive")
    void successTest() {
        assertEquals(true, true);
//        assertTrue(true);
    }


    @Test
    @Tag("positive")
    void successWithHamcrestTest() {
        assertThat(true, is(true));
    }


