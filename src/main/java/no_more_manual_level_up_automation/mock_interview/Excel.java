package no_more_manual_level_up_automation.mock_interview;

public class Excel extends Report {

    public Excel(String title) {
        super(title);
    }

    @Override
    public void generate() {
        System.out.println("Excel report " + getTitle() + " has generated.");
    }
}