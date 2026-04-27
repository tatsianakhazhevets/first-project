package no_more_manual_level_up_automation.mock_interview;

public abstract class Report {

    private String title;

    public Report(String title) {
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public abstract void generate();
}