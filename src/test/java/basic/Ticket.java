package basic;

public class Ticket implements Runnable{
    public int number= 100;
    private ThreadLocal tl;
    //不能在这里赋值，因为ThreadLocal在堆中创建，
    public Ticket(ThreadLocal tl){
        this.tl = tl;
        this.tl.set(number);
    }
    @Override
    public void run(){
        while(true){
            int i = (Integer)(tl.get());
            if(i>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"==="+i);
                tl.set(i--);
            }
        }
    }
}
