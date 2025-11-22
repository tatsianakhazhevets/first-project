package Practice15_ProjectPatterns.video.structural.facade.before;

public class CodecConverter {

    String filename;

    public void convert(String filename) {
        this.filename = filename;
        System.out.println("Convert audio ...");
    }
}