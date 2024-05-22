package Assignment_2;

public class Variables {
    int RegNum;
    static String  DepartmentName="CSE";

    public void Department()
    {
        String StudentName= "Shihab Ahmed";
        System.out.println(StudentName + RegNum);
    }
    public void StudentID()
    {
        int StudentID= 15;
        System.out.println("Student ID "+ StudentID);
    }

    public static void main(String[] args) {

        System.out.println(Variables.DepartmentName); //For Static variable

        //This object create for instance variable
        Variables v = new Variables();
        v.RegNum = 141119;
        v.Department();
        v.StudentID();
        //Reg num not print need to ask question

    }
}
