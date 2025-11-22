package Practice15_ProjectPatterns.video.creational.prototype.after;

public class Document implements Clonable {
    String text;
    String[] images;

    public Document(String text, String[] images) {
        this.text = text;
        this.images = images; // Поверхностное копирование ссылки на массив
    }

    // вместо этого Override метода клон
//    public Document clone() {
//        // поверхностное копирование изображения приводит к тому, что при изменении
//        // копии, меняется оригинал
//        return new Document(this.text, this.images);
//    }

    @Override
    public Document clone() {
        // глубокое копирование - для этого нужно создать абсолютно новый массив изображений
        String[] imagesCopy = new String[this.images.length];
        System.arraycopy(this.images, 0, imagesCopy, 0, this.images.length);
        return new Document(this.text, imagesCopy);
    }
}