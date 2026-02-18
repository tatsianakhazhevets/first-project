package mentoring.Practice2;

public class Student {
int age;
String name;

// конструктор
Student(int someAge, String someName){
    this.age = someAge;
    this.name = someName;
}
    //геттер
int getAge(){
    return this.age;
}
String getName() {
    return this.name;
}
//сеттеры
    void setAge(int newAge){
    this.age = newAge;
    }
void setName(String newName){
    this.name = newName;
}
void print(){
    System.out.println("Возраст: " + this.age +  ", имя: " + this.name);
}
}
