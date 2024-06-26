import java.util.Scanner;
import java.util.Arrays;

public class unique
{
    public static void main(String []args)
    { 
        int[] nums = new int[5];
        int i, upto = 0,j,k,num;
        boolean found;
        Scanner in = new Scanner (System.in);

    System.out.println("This array takes in 5 numbers");

    for(i = 0; i < 5; i++)
    {
        System.out.println("Enter a number between 10 and 100: ");
    
        num = in.nextInt();
        found = false;

        for(j = 0; j < upto; j++)
            if(num == nums[j])
            {
                found = true;
                j = 10;
            }
        
            if(!found)
            {
                nums[upto++] = num;
                System.out.println("New Number: " + num);
            }

            System.out.println("Current numbers in the array: ");

            for(k = 0; k < upto; k++)
                System.out.print(nums[k] + " ");
                System.out.println();
    }
}
}
