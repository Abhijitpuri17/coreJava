package multiThreading;
class Test{
    static int counter = 0 ;
    void print(){
        synchronized (this){
            for (int i = 0; i < 10000; i++) {
                counter++ ;
            }
        }
    }
}

public class SynchronizedBlock
{
    public static void main(String[] args) {

        Test t = new Test() ;

        Thread t1 = new Thread(() -> t.print()) ;

        Thread t2 = new Thread(() -> t.print()) ;

        t1.start();
        t2.start();

        try {
            Thread.sleep(5000);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(Test.counter);

    }
}
