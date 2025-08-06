package Practice5.HomeWork.EightMuseum;

public class Main {
    public static void main(String[] args) {

        Exhibit manuscript = new Manuscript("Манускрипт");
        Exhibit sculpture = new Sculpture("Скульптура");

        Museum museum = new Museum();

        museum.manageExhibit(manuscript);
        museum.manageExhibit(sculpture);
    }
}
