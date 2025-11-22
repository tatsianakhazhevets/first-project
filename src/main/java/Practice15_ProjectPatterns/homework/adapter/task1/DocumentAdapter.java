package Practice15_ProjectPatterns.homework.adapter.task1;

public class DocumentAdapter {

    PDF pdf;

    public DocumentAdapter(PDF pdf) {
        this.pdf = pdf;
    }

    public void convert() {
        System.out.println("Convert DOC to PDF.");
        pdf.openPdfFile();
    }
}