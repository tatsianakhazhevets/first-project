package mentoring.Practice15_ProjectPatterns.video.structural.proxy.after;

public class ImageProxy implements Showable {
    private HighResolutionImage image;
    private String imageFilePath;

    // при создании прокси изображения мы не загружаем само изображение
    public ImageProxy(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    // ленивая загрузка - только в момент явного вызова метода show()
    @Override
    public void show() {
        // мы хотим произвести загрузку изобрадения только один раз
        if(this.image == null) {
            this.image = new HighResolutionImage(imageFilePath);
        }
        image.showImage();
    }}