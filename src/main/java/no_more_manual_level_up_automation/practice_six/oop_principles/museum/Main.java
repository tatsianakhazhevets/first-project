package no_more_manual_level_up_automation.practice_six.oop_principles.museum;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();
        Exhibit manuscript = new Manuscript("Manuscript");
        Exhibit sculpture = new Sculpture("Sculpture");
        museum.add(manuscript);
        museum.add(sculpture);
        museum.act();
    }
}