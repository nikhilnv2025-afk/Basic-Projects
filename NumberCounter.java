public class NumberCounter extends Thread{
    @Override
    public void run(){
        int coutner = 0;
        for (int i = 0; i < 100000; i++) {
            coutner++;
        }
        System.out.println("Counter: " + coutner);
    }

}