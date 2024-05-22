package Assignment_2;

public class Logical_Operator {

    public static void main(String[] args) {
        int a= 20, b=40;

        System.out.println(a==b);//Fales
        System.out.println(a>b);//False
        System.out.println(a<b);//True
        System.out.println(a!=b);//True
        System.out.println(a>=b);//False
        System.out.println(a<=b);//True

        System.out.println("=================");


        System.out.println( (a==b) &&  (a>b));//False
        System.out.println( (a<b) &&  (a<=b));//True
        System.out.println( (a>b) || (a>=b));//False
        System.out.println( (a<b) ||  (a<=b));//True



    }
}
