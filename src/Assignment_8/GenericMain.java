package Assignment_8;

public class GenericMain {
    public static void main(String[] args) {

        System.out.println("=========Non Generic=========");
        String_Test obj1= new String_Test("Hello World");
        System.out.println(obj1.getStr());

        Integer_Test obj2= new Integer_Test(1000);
        System.out.println(obj2.getInteger());

        Long_Test obj3= new Long_Test(1000L);
        System.out.println(obj3.getaLong());

        Double_Test obj4= new Double_Test(100.0);
        System.out.println(obj4.equals());

        System.out.println("=========Generic=========");

        Generic<String> StringGeneric= new Generic<>("Anas");
        System.out.println(StringGeneric.getObj());

        Generic<Integer> IntegerGeneric= new Generic<>(100);
        System.out.println(IntegerGeneric.getObj());

        Generic<Long> LongGeneric= new Generic<>(100L);
        System.out.println(LongGeneric.getObj());

        Generic<Double> DoubleGeneric= new Generic<>(100.0);
        System.out.println(DoubleGeneric.getObj());

        Generic<Float> FloatGeneric= new Generic<>(100.0f);
        System.out.println(FloatGeneric.getObj());

    }
}
