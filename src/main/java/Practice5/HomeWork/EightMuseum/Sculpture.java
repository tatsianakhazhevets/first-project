package Practice5.HomeWork.EightMuseum;

public class Sculpture extends Exhibit{

    public Sculpture(String name) {
        super(name);
    }

    @Override
    public void showHistory(){
        super.showHistory();
        System.out.println("Египта");
    }

    public void storeConditions(){
        super.storeConditions();
        System.out.println ("нуждается в регулярной реставрации");
    }
}
