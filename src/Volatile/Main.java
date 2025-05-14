package Volatile;

import Records.Boiler;

public class Main {
    public static volatile boolean flag=false;
    static {
        System.out.println("A static block");

    }
    static {
        int val=10;

        System.out.println("A static block 2");

    }{
         int value=10;

        System.out.println("A block");

    }


    public static void main(String[] args) throws InterruptedException {
        Boiler boil=new Boiler("Porche",(10000000L));

        System.out.println(boil.company());
        System.out.println(boil.price());
       System.out.println( boil.toString());



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