package swagger3;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;



/**
 * Unit tests for {@link Optional} in Java 11.
 */
public class OptionalUnitTest {

    @Test
    public void givenAnEmptyOptional_isEmpty_thenBehavesAsExpected() {
        Optional<String> opt = Optional.of("Baeldung");
        assertFalse(opt.isEmpty());

        opt = Optional.ofNullable(null);
        assertTrue(opt.isEmpty());
        assertFalse(opt.isPresent());
    }
}