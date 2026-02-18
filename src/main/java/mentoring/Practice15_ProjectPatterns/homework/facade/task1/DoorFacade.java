package mentoring.Practice15_ProjectPatterns.homework.facade.task1;

public class DoorFacade {
    private DoorOpener doorOpener;
    private DoorCloser doorCloser;
    private DoorLocker doorLocker;

    public DoorFacade(DoorOpener doorOpener, DoorCloser doorCloser, DoorLocker doorLocker) {
        this.doorOpener = doorOpener;
        this.doorCloser = doorCloser;
        this.doorLocker = doorLocker;
    }

    public void manageDoor() {
        doorOpener.openDoor();
        doorCloser.closeDoor();
        doorLocker.lockDoor();
    }
}