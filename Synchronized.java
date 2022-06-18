package suai.laba9;
import java.util.Date;

public class Synchronized {


    Object s1 = new Object();
    Object s2 = new Object();

    Thread t1 = new Thread() {
        public void run() {
            synchronized (s1) {
                  try {
                      System.out.println(Thread.currentThread().getName()+ " Locked " + "object 0" + " and waiting for next object 1 ");
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  synchronized (s2) {
                      System.out.println(Thread.currentThread().getName()+ " Locked " + "object 1");
                      System.out.println(s1 + " -> " + s2);
                  }
            }
        }
    };

    Thread t2 = new Thread() {

        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                synchronized (s2) {
                    System.out.println(Thread.currentThread().getName()+ " Locked " + "object 1" + " and waiting for next object 0");
                    synchronized (s1) {
                        System.out.println(Thread.currentThread().getName()+ " Locked " + "object 0");
                        System.out.println(s2 + " -> " + s1);
                    }
                }
        }
    };
}



