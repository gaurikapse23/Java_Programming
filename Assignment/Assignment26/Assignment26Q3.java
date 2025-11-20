//Input :5
//Output :1 * 2 * 3 * 4 * 5 *
//        1 2 3 4 5 6 


import java.util.*;
class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
       
        for(iCnt = 1; iCnt <= iNo ; iCnt ++)
        {    
            System.out.print(iCnt+"\t");
            System.out.print("*\t");
               
        }
        System.out.println();
    }
}
class Assignment26Q3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the Frequency :");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}