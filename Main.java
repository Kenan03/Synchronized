package suai.laba9;


public class Main {

    public static void main(String[] args) {


        Synchronized obj = new Synchronized();
          obj.t1.start();


          obj.t2.start();

      //  String[] r = {"inputFile1.txt", "inputFile2.txt", "inputFile3.txt"};
//        Words wordCounter = new Words();
//        wordCounter.calculateAmountOfWords(args);
//        System.out.println(wordCounter);

    }

}





















//        Synchronized job = new Synchronized();
//        Thread masha = new Thread(job, "Маша");
//        Thread dasha = new Thread(job, "Даша");
//        masha.start();
//        //masha.wait(10);
//        dasha.start();

//        Synchronized job1 = new Synchronized();
//        Synchronized job2 = new Synchronized();
//        Thread masha = new Thread(job1, "Маша");
//        Thread dasha = new Thread(job2, "Даша");
//        masha.start();
//        //masha.wait(10);
//        dasha.start();

//        Object lock1 = new Object();
//        Object lock2 = new Object();
//
//        Thread thread1 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName() + " start");
//            synchronized (lock1) {
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                synchronized (lock2) {
//
//                }
//            }
//            System.out.println(Thread.currentThread().getName() + " end");
//        }, "Thread1");
//
//        Thread thread2 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName() + " start");
//            synchronized (lock2) {
//                synchronized (lock1) {
//
//                }
//            }
//            System.out.println(Thread.currentThread().getName() + " end");
//        }, "Thread2");
//
//        thread1.start();
//        thread2.start();

//public class Main {
//
//    public static void main(String[] args) {
//          Synchronized obj = new Synchronized();
//          obj.t1.start();
//          obj.t2.start();
//    }
//}