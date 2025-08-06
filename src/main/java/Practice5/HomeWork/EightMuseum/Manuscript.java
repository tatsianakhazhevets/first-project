package Practice5.HomeWork.EightMuseum;

public class Manuscript extends Exhibit{

    public Manuscript(String name) {
        super(name);
    }

    @Override
    public void showHistory(){
        super.showHistory();
        System.out.println("Ватикана");
    }

    public void storeConditions(){
        super.storeConditions();
        System.out.println ("требует контролируемой влажности и температуры");
    }
}
