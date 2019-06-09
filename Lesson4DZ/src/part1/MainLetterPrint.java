/*1. Создать три потока,
 каждый из которых выводит определенную букву (A, B и C) 5 раз (порядок – ABСABСABС).
 Используйте wait/notify/notifyAll.
*/
package part1;

public class MainLetterPrint {
    private final Object mon = new Object();
    private volatile char currentLetter = 'A' ;

    public static void main(String[] args) {
        MainLetterPrint m = new MainLetterPrint();
        Thread t1 = new Thread(() -> m.printA());
        Thread t2 = new Thread(() -> m.printB());
        Thread t3 = new Thread(() -> m.printC());
        t1.start();
        t2.start();
        t3.start();
    }

    private void printA() {
        synchronized (mon){
            try{
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'A'){
                        mon.wait();
                    }
                    System.out.print("A");
                    currentLetter = 'B';
                    mon.notifyAll();
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private void printB() {
        synchronized (mon){
            try{
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'B'){
                        mon.wait();
                    }
                    System.out.print("B");
                    currentLetter = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private void printC() {
        synchronized (mon){
            try{
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'C'){
                        mon.wait();
                    }
                    System.out.print("C");
                    currentLetter = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
