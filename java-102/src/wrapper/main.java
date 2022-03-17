package wrapper;

public class main {
    public static void main(String[] args) {
        //Byte,Short,Integer,Long,Float,Double,Boolean,Character
        Integer a=2;
        String str=a.toString();
        System.out.println(str);

        String abc="10";
        int c=Integer.parseInt(abc);
        System.out.println(c);

        //Autoboxing
        int ilkel=10;
        int ilkel1=5;
        Integer integer=ilkel;//Integer.valueof(ilkel)
        Integer integer1=Integer.valueOf(ilkel1);//bu işlemi kendi yaptığı için gereksiz görüyor.

        //AutoUnboxing
        int d=integer;
        System.out.println(d);

        //Unboxing
        int unboxing=integer.intValue();
    }
}
