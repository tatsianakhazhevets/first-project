package mentoring.Practice7;

public class Main {
    public static void main(String[] args) {
        Person nikita = new Person("Никита", 25);

        // Значение toString по умолчанию
        System.out.println(nikita.toString());

        // сравнение двух объектов (примитивные типа данных сравниваются через ==, а ссылочные сравниваются через equals)
        Person nikita2 = new Person("Никита", 25);

       System.out.println(nikita.equals(nikita2));
       // возвращает тру при сравнении двух переменных
       nikita.hashCode();


       // System.out.println(nikita.equals(nikita)); - одинаковые объекты или нет
        // System.out.println(nikita == nikita2); - так не сравнить

        // Клонирование, у метода нет дефолтной реализации, делаем сами только там, где необходимо
        Person cloneNikita = nikita.clone();
        System.out.println(cloneNikita.toString());

        System.out.println(nikita.getClass());
        // возвращает сам класс
    }

    // итого основные hashCode, clone, equals, toString, getClass
}
