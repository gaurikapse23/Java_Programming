//Input :4
//Output :# 1 * # 2 * # 3 * # 4 *
//        1 2 3 4 5 6 


import java.util.*;
class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
       
        for(iCnt = 1; iCnt <= iNo ; iCnt ++)
        {    
            
            System.out.print((iCnt*2)+"\t");  
            
        }
        System.out.println();
    }
}
class Assignment26Q5
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