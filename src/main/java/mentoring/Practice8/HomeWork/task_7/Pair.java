package mentoring.Practice8.HomeWork.task_7;

public class Pair<T, G> {

    private T fistType;
    private G secondType;

    public Pair(T fistType, G secondType) {
        this.fistType = fistType;
        this.secondType = secondType;
    }

    public T getFistType() {
        return fistType;
    }

    public G getSecondType(){
        return secondType;
    }

    public void setFistType(T newFistType) {
        this.fistType = newFistType;
    }

    public void setSecondType(G newSecondType) {
        this.secondType = newSecondType;
    }

    public void printPair() {
        System.out.println(fistType);
        System.out.println(secondType);
    }


}
