package Assignment_2;

public class Unary_Operator {

    public static void main(String[] args) {
        int Num= 80;
        System.out.println(Num++); //Printed by 80 (First print then increment)
        System.out.println(Num);//Printed by 81
        System.out.println(Num--);//Printed by 81
        System.out.println(Num++);//Printed by 80
        System.out.println(Num);//Printed by 81
        Num = Num+2;
        System.out.println(--Num);//Printed by 82
        System.out.println(++Num);//Printed by 83
        System.out.println(Num--);//Printed by 83
        System.out.println(Num);//Printed by 82
    }
}
