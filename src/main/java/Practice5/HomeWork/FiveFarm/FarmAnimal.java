package Practice5.HomeWork.FiveFarm;

public class FarmAnimal implements Careable {

    private String name;

    public FarmAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void feed(){
       System.out.print("Питается ");
   }

    public void care() {
        System.out.print("Нужен ");
    }

    public void produce() {
        System.out.print("Производит ");
    }

}
