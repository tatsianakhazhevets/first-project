package Practice4.Solvers;

public class SwitchTaskSolver {
    public static void main(String[] args) {
    // Проверка метода, возвращающего день по числу
    System.out.println(dayOfWeek(5));
    System.out.println(dayOfWeek(8));

    // Проверка метода, возвращающего сезоны
    System.out.println(describeSeason(Season.WINTER));
    System.out.println(describeSeason(Season.SUMMER));
    }


    public static String dayOfWeek(int day){
        String dayOfWeek = "";
        switch (day){
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = ("Несуществующий день недели");
        }
        return dayOfWeek;
    }


    // C ENUM

    public static String describeSeason(Season season){
        String description = "";
        switch (season){
            case WINTER -> description = "Зима - холодно и снежно.";
            case SUMMER -> description = "Лето - жарко.";
            case SPRING -> description = "Весна - все цветет";
            case AUTUMN -> description = "Осень - листья";
        }
        return description;
    }


}
