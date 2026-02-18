package mentoring.Practice15_ProjectPatterns.homework.adapter.task1;

public class DOC implements DocumentSystem {
    @Override
    public void openDocFile() {
        System.out.println("Open DOC file.");
    }
}