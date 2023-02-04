import java.util.*;
public class SearchEngine
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n,i,s,t=1;
        int arr[]=new int[5];
        System.out.print("Enter n:");
        n=scanner.nextInt();
        for(i=0;i<n;i++)
            {
                System.out.print("Enter "+(i+1)+" :");
                arr[i]=scanner.nextInt();
            }
            while(t==1)
            {
                System.out.print("Enter element to be searched:");
                s=scanner.nextInt();
                int flag=0;
                for(i=0;i<n;i++)
                {
                    if(arr[i]==s)
                   {
                    flag=1;
                    break;
                   }
                }
                if(flag==1)
                    System.out.println("Element Found");
                else
                    System.out.println("Element Not Found");
                System.out.print("Do you want to continue searching(1 to continue):");
                t=scanner.nextInt();
            }
            //for(i=0;i<n;i++)
           // {
            //    System.out.print("arr[] "+(i+1)+" :");
            //    System.out.println(arr[i]);
            //}
            scanner.close();
    }
}