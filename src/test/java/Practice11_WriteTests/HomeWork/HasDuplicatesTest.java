package Practice11_WriteTests.HomeWork;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HasDuplicatesTest extends MethodsForUnitTestCasesTest {

    public static Stream<Arguments> arraysForTrueScenarios() {
        return Stream.of(
                // Positive numbers + at the begginning
                Arguments.of((Object) new int[] {1, 1, 2, 3, 4, 0}),
                // Positive numbers + at the end
                Arguments.of((Object) new int[] {1, 2, 0, 4, 5, 5}),
                // Positive numbers + at the middle
                Arguments.of((Object) new int[] {1, 0, 3, 3, 4, 5}),
                // Positive numbers + at the begginning and end
                Arguments.of((Object) new int[] {1, 2, 3, 5, 4, 1}),
                // Positive numbers + all equals
                Arguments.of((Object) new int[] {1, 1, 1, 1, 1, 1}),
                // Positive numbers + all 0
                Arguments.of((Object) new int[] {0, 0, 0, 0, 0, 0}),
                // Positive numbers + 2 values
                Arguments.of((Object) new int[] {5, 5}),
                // Negative numbers + 2 values
                Arguments.of((Object) new int[] {-5, -5}),
                // Negative numbers + all equals
                Arguments.of((Object) new int[] {-10, -10, -10, -10, -10, -10}),
                // Negative numbers + at the begginning
                Arguments.of((Object) new int[] {-1, -1, -2, -3, -4, 0}),
                // Negative numbers + at the end
                Arguments.of((Object) new int[] {-1, -2, 0, -4, -5, -5}),
                // Negative numbers + at the middle
                Arguments.of((Object) new int[] {-1, 0, -3, -3, -4, -5}),
                // Negative numbers + at the begginning and end
                Arguments.of((Object) new int[] {-1, -2, -3, -5, -4, -1}),
                // MAX VALUE
                Arguments.of((Object) new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE}),
                // MAX VALUE
                Arguments.of((Object) new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE})
        );
    }

    @ParameterizedTest
    @MethodSource("arraysForTrueScenarios")
    public void checkThatMethodReturnsTrue(int[] numbers) {
        boolean actualResult =  methodsForUnitTestCases.hasDuplicates(numbers);
        assertTrue(actualResult);
    }



    public static Stream<Arguments> arraysForFalseScenarios() {
        return Stream.of(
                // Positive numbers
                Arguments.of((Object) new int[] {1, 2, 3, 4, 5, 6}),
                // Negative numbers
                Arguments.of((Object) new int[] {-1, -2, -3, -4, -5, -6}),
                // Empty
                Arguments.of((Object) new int[] {}),
                // One value positive
                Arguments.of((Object) new int[] {1}),
                // One value positive
                Arguments.of((Object) new int[] {-1}),
                // MAX and MIN Values
                Arguments.of((Object) new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE})
        );
    }

    @ParameterizedTest
    @MethodSource("arraysForFalseScenarios")
    public void checkThatMethodReturnsFalse(int[] numbers) {
        boolean actualResult =  methodsForUnitTestCases.hasDuplicates(numbers);
        assertFalse(actualResult);
    }

}
