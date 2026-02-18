package mentoring.Practice15_ProjectPatterns.video.structural.facade.after;

public class VideoFile {
    public String fileName;

    public VideoFile(String fileName) {
        this.fileName = fileName;
    }

    public void load() {
        System.out.println("Loading audio ...");
    }
}