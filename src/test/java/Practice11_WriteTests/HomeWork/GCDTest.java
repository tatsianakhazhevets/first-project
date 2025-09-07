package Practice11_WriteTests.HomeWork;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCDTest extends MethodsForUnitTestCasesTest {

    public static Stream<Arguments> dataForMethodTest() {
        return Stream.of(
                // With multiple division
                Arguments.of(48, 18, 6),
                // With division
                Arguments.of(20, 8, 4),
                // Prime numbers
                Arguments.of(7, 3, 1),
                // 100
                Arguments.of(100, 10, 10),
                // Same numbers
                Arguments.of(7, 7, 7),
                // a = 0
                Arguments.of(0, 7, 7),
                // b = 0
                Arguments.of(5, 0, 5),
                // 0
                Arguments.of(0, 0, 0),
                // a = 1
                Arguments.of(1, 7, 1),
                // b = 1
                Arguments.of(5, 1, 1),
                // 1
                Arguments.of(1, 1, 1),
                // a = negative
                Arguments.of(-20, 8, -4),
                // b = negative
                Arguments.of(20, -8, 4),
                // both negative
                Arguments.of(-20, -8, -4),
                // MAX and MIN
                Arguments.of(Integer.MAX_VALUE, Integer.MIN_VALUE, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForMethodTest")
    public void checkThatMethodReturnsGCD (int a, int b, int expectedResult) {
        int actualResult = methodsForUnitTestCases.gcd(a, b);
        assertEquals(expectedResult, actualResult);
    }
}