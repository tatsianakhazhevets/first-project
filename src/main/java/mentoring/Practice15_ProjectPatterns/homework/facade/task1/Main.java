package mentoring.Practice15_ProjectPatterns.homework.facade.task1;

public class Main {
    public static void main(String[] args) {
        DoorOpener doorOpener = new DoorOpener();
        DoorCloser doorCloser = new DoorCloser();
        DoorLocker doorLocker = new DoorLocker();

        DoorFacade facade = new DoorFacade(doorOpener, doorCloser, doorLocker);
        facade.manageDoor();
    }
}