package Practice15_ProjectPatterns.video.structural.proxy.before;

public class HighResolutionImage {
    public HighResolutionImage(String imageFilePath) {
        // Представим, что загрузка занимает много времени
        System.out.println("Loading image from: " + imageFilePath);
    }

    public void showImage() {
        System.out.println("Displaying image");
    }
}