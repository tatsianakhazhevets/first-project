package mentoring.Practice15_ProjectPatterns.video.creational.singleton.after;

public class DatabaseConfig {
    // задача -> рансформировать DatabaseConfig в единственный экземпляр конфига в программе

    public String config = "Default Config";
    // единственный экземпляр DatabaseConfig
    private static DatabaseConfig databaseConfig; // -> он должен создаться, и где? в методе


    // написали конструктор, чтобы он был видимы
    // за доступ отвечают модификаторы доступа, то есть меняем на private - закрыли возможность закрывать конструктор
    // и где хранить единственный экземпляр? в поле
    private DatabaseConfig() {

    }


    //создание ЕДИНСТВЕННОГО экземпляра DatabaseConfig
    public static DatabaseConfig getInstance() {          //обычно название метода getInstance() в рамках паттерна
        // у кого должен быть доступ к этому методу? Доступ должен быть от вызова класса, а не метода
        // то есть метод должен быть статическим, чтобы обращаться к нему без создания экземпляра
        // и перменную private DatabaseConfig databaseConfig; тоже нужно делать статической, чтобы смочь обратиться внутри метода
        if (databaseConfig == null) { // то есть экземпляр еще не создан
            databaseConfig = new DatabaseConfig();  // обращаемся к конструктору, это единственное место обращение
        }
        return databaseConfig;
    }


    public void displayConfig() {
        System.out.println(config);
    }
}