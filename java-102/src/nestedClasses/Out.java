package nestedClasses;

public class Out {
    public int a=5;

    public static class In{
        public int a=10;

        public static void run(){
            int a=1;
            System.out.println(a);
            //System.out.println(this.a);
            //System.out.println(Out.this.a);
        }
    }

    public void run(){
        In.run();
    }
}
