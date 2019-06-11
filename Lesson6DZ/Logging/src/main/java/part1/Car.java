package part1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private static boolean win = true;
    //Флаг, отвечающий за приход победителя к финишу
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;
    private CyclicBarrier cbReady;
    private Semaphore semWin;
    private CountDownLatch cdFinish;

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed, CyclicBarrier cbReady, Semaphore semWin, CountDownLatch cdFinish) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.cbReady = cbReady;
        this.semWin = semWin;
        this.cdFinish = cdFinish;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            MainClass.LOGGER.info(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            MainClass.LOGGER.info(this.name + " готов");
            cbReady.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        try {
            semWin.acquire();
            if (win){
                System.out.println(this.name + " - WIN");
                MainClass.LOGGER.info(this.name + " - WIN");
                win = false;
            }
            semWin.release();
            cdFinish.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
