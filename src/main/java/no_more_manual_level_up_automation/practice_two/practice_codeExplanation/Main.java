package no_more_manual_level_up_automation.practice_two.practice_codeExplanation;

public class Main {    // объявили класс (модификатор доступа, ключевое слово class, имя класса)
    // class declaration

    public static void main(String[] args) { // сигнатура метода, объявление метода main
        // method signature
        // модификатор доступа
        // модификатор static (main принадлежит классу, а не объекту)
        // тип возвращаемых данных void
        // имя метода main
        // аргументы - тип массив строк, имя параметра
        // тело метода, где реализуется задача

        // объявление переменной - объявление типа и имени
        // variable declaration
        int count;
        // инициализация - первое присваивания значения
        // variable initialization
        count = 0;
        // объявляем переменную и инициализируем ее нулем
        // we declared variable and initialized it with ziro value
        int count2 = 0;
        // присвоим новое значение переменной или обновим значение переменной
        // we assign new value to count1 variable
        count2 = 2;

        //вызов метода по рассспечатыванию, в нем вызывается метод square
        // вызов метода с контекстным значением параметра = аргумента
        // here we call the method square with argument 4 and we printed out the result to te console with new line
        System.out.println(square(4));
    }
// we defined a method signature square, which has public access modifier,
// which has special modification static, which has return type primitive integer
// and the name square. With parameter: type integet name x
    // declared the body of the method
    public static int square(int x) {  //сигнатура метода
        // тело метода
        return x * x;
    }

}
