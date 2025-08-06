package Practice5.HomeWork.EightMuseum;

public class Museum {

    private Exhibit exhibit;

    public void manageExhibit(Exhibit exhibit) {
        System.out.println("Экпонат: " + exhibit.getName());
        exhibit.showHistory();
        exhibit.storeConditions();
    }
}
