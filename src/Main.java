public class Main {
    public static void main(String[] args) {


        //----------------------Wrapper Class--------------//

        int x =10;

        Integer i = Integer.valueOf(x); //boxing
        Integer z = x; //auto boxing

        System.out.println(x);
        System.out.println(i);
        System.out.println(z);

        Integer v =new Integer(20);

        int q = v.intValue(); // unboxing
        int p = v; // auto unboxing

        System.out.println(v);
        System.out.println(q);
        System.out.println(p);

    }
}
