package suai.laba9;
import java.util.Date;

public class Synchronized {


//    String s1 = "kenan";
//    String s2 = "nikita";

    Object s1 = new Object();
    Object s2 = new Object();

    Thread t1 = new Thread() {
        public void run() {
//          while(true) {
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
//          }
        }
    };

    Thread t2 = new Thread() {

        public void run() {
            try {
                //System.out.println(Thread.currentThread().getName()+ " Locked " + "object 0" + " waiting for object 1");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            while(true) {
                synchronized (s2) {
                    System.out.println(Thread.currentThread().getName()+ " Locked " + "object 1" + " and waiting for next object 0");
                    synchronized (s1) {
                        System.out.println(Thread.currentThread().getName()+ " Locked " + "object 0");
                        System.out.println(s2 + " -> " + s1);
                    }
                }
//            }
        }
    };
}






//    private static class Resource {
//    }
//
//    private final Resource scissors = new Resource();
//    private final Resource paper = new Resource();
//
//    public void doSun() {
//        synchronized (scissors) {
//            System.out.println(Thread.currentThread().getName() + " Взяла ножницы");
//            synchronized (paper) {
//                System.out.println(Thread.currentThread().getName() + " Взяла бумагу и начинает резать солнышко");
//            }
//        }
//    }
//
//    public void doCloud() {
//        synchronized(paper) {
//            System.out.println(Thread.currentThread().getName() + " Взяла бумагу");
//            synchronized (scissors) {
//                System.out.println(Thread.currentThread().getName() + " Взяла ножницы и вырезает облачко");
//
//            }
//        }
//    }


//
//    private static class Resource {
//
//    }
//    private final Resource job1 = new Resource();
//    private final Resource job2 = new Resource();
//
//    public void doSun() {
//        System.out.println(Thread.currentThread().getName() + " start");
//        synchronized (job2) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            synchronized (job1) {
//
//            }
//        }
//        System.out.println(Thread.currentThread().getName() + " end");
//    }
//    public void doCloud() {
//        System.out.println(Thread.currentThread().getName() + " start");
//        synchronized (job1) {
//            synchronized (job2) {
//
//            }
//        }
//        System.out.println(Thread.currentThread().getName() + " end");
//    }
//
//
//    public void run() {
//        doSun();
//        doCloud();
//    }