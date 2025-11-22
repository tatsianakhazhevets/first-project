package Practice15_ProjectPatterns.video.structural.proxy.after;

public class Main {
    public static void main(String[] args) {
        // в момент создания изображения происходит загрузка файла
        //HighResolutionImage image = new HighResolutionImage("path/to/high/res/image"); -> теперь не работаем с эти имэдж

        // в момент создания прокси изображение не загружается
        ImageProxy imageProxy = new ImageProxy("path/to/high/res/image");

        /*
        много времени тратим на загрузку
         */

        // отображения изображения
        //image.showImage();

        //изобрадение будет отображаться при вызове шоу()
        imageProxy.show();

        /*
        много времени тратим на загрузку
         */

        // Важно, что изображение не загрузится повторно
        imageProxy.show();
    }
}