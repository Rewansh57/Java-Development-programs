//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static volatile boolean flag=false;


    public static void main(String[] args) throws InterruptedException {
        Thread.Builder thread=Thread.ofVirtual().name("VirtualThread");
       Thread t1=new Thread(()->{

           System.out.println(Thread.currentThread().getName()+" "+flag);
           try{
               Thread.sleep(2000);
               flag=true;


           }
           catch (InterruptedException e){
               e.printStackTrace();
           }

       });

       Thread t2=new Thread(()->{
           while(!flag){


           }
           System.out.println(Thread.currentThread().getName()+" "+flag);





       });
       t1.start();
       t2.start();
       t1.join();
       t2.join();







}}