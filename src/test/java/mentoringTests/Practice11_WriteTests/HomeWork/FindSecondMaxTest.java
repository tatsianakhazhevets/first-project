package mentoringTests.Practice11_WriteTests.HomeWork;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTest extends MethodsForUnitTestCasesTest {

   public static Stream<Arguments> arraySetForPositiveAndCornerCases() {
        return Stream.of(
                // positive + negative numbers
                Arguments.of(new int[] {25, -5, 6, 0, -9}, 6),
                // positive numbers, second max last
                Arguments.of(new int[] {25, 5, 6, 0, 9}, 9),
                // positive numbers, second max first
                Arguments.of(new int[] {9, 25, 5, 6, 0}, 9),
                // negative numbers, second max last
                Arguments.of(new int[] {-9, -25, -6, 0, -5}, -5),
                // negative numbers, second max first
                Arguments.of(new int[] {-5, -25, -6, 0, -9}, -5),
                // Corner Cases
                // positive + 0
                Arguments.of(new int[] {0, 69}, 0),
                // negative + 0
                Arguments.of(new int[] {-5, 0}, -5),
                // positive + negative numbers, 2 values
                Arguments.of(new int[] {-5, 69}, -5)
        );
    }

    @ParameterizedTest
    @MethodSource("arraySetForPositiveAndCornerCases")
    public void checkThatMethodCanFindTheSecondMax(int[] numbers, int expectedResult) {
      int actualResult =  methodsForUnitTestCases.findSecondMax(numbers);
      assertEquals(expectedResult, actualResult);
    }


    public static Stream<Arguments> arraySetForAgeCases() {
        return Stream.of(
                // positive + negative numbers + 2 same values
                Arguments.of(new int[] {25, -5, 6, 6, 0, -9}, 25) // 6?
        );
    }

    @ParameterizedTest
    @MethodSource("arraySetForAgeCases")
    public void checkThatMethodCanGiveValueWithOnlyOne(int[] numbers, int expectedResult) {
        int actualResult =  methodsForUnitTestCases.findSecondMax(numbers);
        assertEquals(expectedResult, actualResult);
    }



    public static Stream<Arguments> arraySetForNegativeCases() {
        return Stream.of(
                // positive + negative numbers + same numbers 3 times
                Arguments.of(new int[] {25, -5, 6, 6, 6, 0, -9}, 6),
                // Same Numbers
                // positive numbers
                Arguments.of((Object)new int[] {25, 25, 25, 25, 25}, 9),
                // negative numbers
                Arguments.of((Object)new int[] {-9, -9, -9, -9, -9}),
                // 0
                Arguments.of((Object)new int[] {0, 0, 0, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("arraySetForNegativeCases")
    public void checkThatMethodThrowsException(int[] numbers) {
        assertThrows(NoSuchElementException.class, () -> {
            methodsForUnitTestCases.findSecondMax(numbers);
        });
    }


    public static Stream<Arguments> arraySetForNegativeCasesIllegalArgumentException() {
        return Stream.of(
                 // One value in array
                // positive
                Arguments.of((Object)new int[] {69}),
                // negative
                Arguments.of((Object)new int[] {-5}),
                // 0
                Arguments.of((Object)new int[] {0}),
                // Empty
                Arguments.of((Object)new int[] {})
        );
    }

    @ParameterizedTest
    @MethodSource("arraySetForNegativeCasesIllegalArgumentException")
    public void checkThatMethodThrowsIllegalArgumentException(int[] numbers) {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsForUnitTestCases.findSecondMax(numbers);
        });
    }
}