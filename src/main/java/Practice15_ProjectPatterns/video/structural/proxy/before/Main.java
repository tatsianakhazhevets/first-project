package Practice15_ProjectPatterns.video.structural.proxy.before;

public class Main {
    public static void main(String[] args) {
        // в момент создания изображения происходит загрузка файла
        HighResolutionImage image = new HighResolutionImage("path/to/high/res/image");

        /*
        много времени тратим на загрузку
         */

        // отображения изображения
        image.showImage();
    }
}