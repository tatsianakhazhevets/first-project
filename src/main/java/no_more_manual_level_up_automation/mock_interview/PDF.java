package no_more_manual_level_up_automation.mock_interview;

public class PDF extends Report {

    public PDF(String title) {
        super(title);
    }

    @Override
    public void generate() {
        System.out.println("PDF report " + getTitle() + " has generated.");
    }
}