package mentoring.Practice5.HomeWork.ThreeDish;

public class Dish implements Descriptionable {
    private String name;

    public Dish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getDescription() {
        System.out.println("Блюдо: " + this.name);
    }
}

