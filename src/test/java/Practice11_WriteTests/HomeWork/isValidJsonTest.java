package Practice11_WriteTests.HomeWork;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isValidJsonTest extends MethodsForUnitTestCasesTest {

    @ParameterizedTest
    @ValueSource(strings = {
            // Happy path
            "{\"key\":\"value\"}",
            // Nested json
            "{\"key\": \"{\\\"key\\\":\\\"value\\\"}\"}",
            // Two links
            "{\"key\":\"value\", \"id\": \"value\"}",
            // Without {
            "\"key\":\"value\"}",
            // Arrays
            "[1, 2, 3]",
            // Object array
            "[{\"key\":\"value\"}, {\"id\": \"value\"}]",
            // String
            "\"Hello\"",
            // Digits
            "\"123456\"",
            // Boolean
            "\"true\"",
            // Empty
            "{}", "[]", "", "[null]"

    })
    public void checkThatMethodReturnsTrue(String json) {
        boolean actualResult = methodsForUnitTestCases.isValidJson(json);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // Without brackets
            "{key:\"value\"}",
            "{\"key\": value}",
            "{\"key\":\"value\"",
            "[1, 2, 3",
            // With/Without coma
            "{\"key\":\"value\", \"id\": \"value\",}",
            "[{\"key\":\"value\"} {\"id\": \"value\"}]",
            // Empty
            "{null}"
    })
    public void checkThatMethodReturnsFalse(String json) {
        boolean actualResult = methodsForUnitTestCases.isValidJson(json);
        assertFalse(actualResult);
    }
}