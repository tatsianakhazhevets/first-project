package mentoring.Practice5.HomeWork.EightMuseum;

public class Exhibit implements Informatible {

    private String name;

    public Exhibit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void showHistory(){
        System.out.print("Экспонат приехал из ");
    }

    public void storeConditions(){
        System.out.print("Условие хранения: ");
    }

}
