package takeatenminuteswalk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TenMinWalkTest {

    public static Stream<Arguments> walks() {
        return Stream.of(
                Arguments.of(true, new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}),
                Arguments.of(false, new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}),
                Arguments.of(false, new char[]{'w'}),
                Arguments.of(false, new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

    @ParameterizedTest
    @MethodSource("walks")
    void isValid(boolean expected, char[] walk) {
        assertEquals(expected, TenMinWalk.isValid(walk));
    }
}