package Practice15_ProjectPatterns.homework.adapter.task1;

public class Main {
    public static void main(String[] args) {
        DocumentSystem doc = new DOC();
        doc.openDocFile();

        DocumentAdapter adapter = new DocumentAdapter(new PDF());
        adapter.convert();
    }
}