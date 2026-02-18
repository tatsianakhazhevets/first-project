package mentoring.Practice10_multithreads.CallableAndFuture;

import java.util.Random;
import java.util.concurrent.*;

public class CallableFeatureExample {
    // Сложные расчета ДНК
    // Наша задача - дождаться вычисления и получить результат

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Callable - описывает саму таску
        Callable<Integer> dnaResult = () -> {
            System.out.println("Сложное вычисление DNA");
            Thread.sleep(10000);
            int randomDnaResult = new Random().nextInt();
            return randomDnaResult;
        };

        Future<Integer> future = executorService.submit(dnaResult);
        // добавь задачу DNA Result, как вычислишь, верни ее

        System.out.println("Результат DNA: " + future.get());

        executorService.shutdown();
    }
}
