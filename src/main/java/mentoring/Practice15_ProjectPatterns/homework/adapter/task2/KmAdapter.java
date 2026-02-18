package mentoring.Practice15_ProjectPatterns.homework.adapter.task2;

public class KmAdapter {

    KM km;

    public KmAdapter(KM km) {
        this.km = km;
    }

    public void convert() {
        System.out.println("Convert Miles into km.");
        km.measureKm();
    }
}