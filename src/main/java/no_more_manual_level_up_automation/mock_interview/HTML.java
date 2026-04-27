package no_more_manual_level_up_automation.mock_interview;

public class HTML extends Report {

    public HTML(String title) {
        super(title);
    }

    @Override
    public void generate() {
        System.out.println("HTML report " + getTitle() + " has generated.");
    }
}