//Input :5
//Output :A B C D E


import java.util.*;
class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'A';

        for(iCnt = 1; iCnt <= iNo ; iCnt ++)
        {
            
                System.out.printf("%c\t",ch);
                ch++;
              
        }
        System.out.println();
    }
}
class Assignment26Q1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number of elements :");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}