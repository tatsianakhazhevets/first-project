package mentoring.Practice7;

public class Person {
    private String name;
    private int age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // переопределение toString
    @Override
    public String toString() {
        return "Name: " + this.name + ", age: " + this.age;

    }

    // переопределение equals
    @Override
    public boolean equals(Object obj) {
        // 1. точно ли мы не сравниваем объект с самим с собой?
        if (this == obj) return true;
        // 2. Хотим проверить два крайних случая
        // 2.1 Объект, который передали, равен нулю
        // || - это или
        // 2.2 Если класс объекта, который нам передали, не соответствует классу текущего объекта
        if (obj == null || getClass() != obj.getClass()) return false;
        // Далее безопасно кастуем тип данных object к текущему типу данных
        // До этого мы не знали тип данных obj, а после последней проверки мы точно знаем, что у объекта сравнимаего и текущего два одинаковых значения класса
        // Поэтому мы можем привести объекст к значению класса персон
        Person that = (Person) obj;
        // возьмем обджект и приведем к типу данных персона - в круглых скобках тип данных, к которому приводим
        // финально можем сравнивать их по полям
        // && - в тоже время
        return this.name.equals(that.name) && this.age == that.age;
    }

        @Override
        public int hashCode() {
            // вернуть способ подсчета hashCode
            // рассчитываем хэш код для обоих значений
            int result = name != null ? name.hashCode() : 0;
            // если name не нулл, вызовем хэш код.
            // унарный метод сравнения короткий - если это выполняется name != null ? - идем в эту ветку name.hashCode(), а если условие не выполняется возвращаем ноль
            // посчитать значение с учетом результата, у примитивного типа данных не нужно вызывать хэш код
            return result * 31 * age;
            // 31 - легкая операция сдвига, для исключения коллизий в хэш мапе
    }

    // переопределили значения сравнения переопределя эти два метода

    @Override
    public Person clone() {
        return new Person(this.name, this.age);
    }

}



