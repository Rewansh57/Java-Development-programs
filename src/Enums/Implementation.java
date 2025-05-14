package Enums;

public class Implementation {
    public enum Level{
        Useless{
            @Override
            public void value(){

            }
        },good{@Override
        public void value(){

        }},Legendary{@Override
        public void value(){

        }};
        public abstract void value();//if a abstract method is defined so we have to provide the
        //abstract method to all the instance variables


    }
    public static void get() {


        Level level = Level.Useless;
        Level level2 = Level.valueOf("Useless");
        System.out.println(level2+" "+level+" "+level2.Useless.toString());
        switch(level){
            case Useless:
                System.out.println("0");
                break;
            case Legendary:
                System.out.println("1000000");
                break;
            case good :
                System.out.println("100");
                break;

        }



    }
    public static void main(String[] args){
        get();

    }
}
