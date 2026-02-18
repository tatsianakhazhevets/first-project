package mentoring.Practice15_ProjectPatterns.homework.adapter.task2;

public class Main {
    public static void main(String[] args) {
        MeasurementSystem mile = new Mile();
        mile. measureMile();

        KmAdapter km = new KmAdapter(new KM());
        km.convert();
    }
}
