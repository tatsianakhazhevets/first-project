package no_more_manual_level_up_automation.mock_interview;

/*
method - isSimple
 */


public class MockInterview {

    public static void main(String[] args) {

        System.out.println(isSimple(15));

    }

    public static boolean isSimple(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}