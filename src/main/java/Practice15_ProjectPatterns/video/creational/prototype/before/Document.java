package Practice15_ProjectPatterns.video.creational.prototype.before;

public class Document {
    String text;
    String[] images;

    public Document(String text, String[] images) {
        this.text = text;
        this.images = images; // Поверхностное копирование ссылки на массив
    }

    public Document clone() {
        // поверхностное копирование изображения приводит к тому, что при изменении
        // копии, меняется оригинал
        return new Document(this.text, this.images);
    }
}