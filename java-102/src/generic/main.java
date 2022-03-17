package generic;

public class main {
    public static void main(String[] args) {
        String str=null;
        Nullable<String> nullable=new Nullable<>(str);

        Integer a=10;
        String b="patika";
        Double d=3.1;

        numberofT<Integer,String,Double> t2=new numberofT<>(a,b,d);
        t2.showInfo();

        String[] stringArray={"java","c","c++"};
        Integer[] integerArrays={1,2,3,4};
        Character[] characterArray={'j','a','v','a'};

        GenericMethodlar.printArray(stringArray);
        GenericMethodlar.printArray(integerArrays);
        GenericMethodlar.printArray(characterArray);
    }
}
