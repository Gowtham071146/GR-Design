import java.util.*;
public class SearchString
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n,k=1,t,i,p;
        String l;
        System.out.print("Enter n:");
        n=scanner.nextInt();
        String arr[]=new String[10];
        for(i=0;i<n;i++)
            {
                System.out.print("Enter "+(i+1)+" :");
                arr[i]=scanner.next();
            }
        while(k==1)
        {
            System.out.println("*********************");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Display");
            System.out.println("4. Delete");
            System.out.print("Enter your choice:");
            t=scanner.nextInt();
            switch(t)
            {
                case 1: 
                        System.out.print("Enter insert element:");
                        l=scanner.next();
                        arr[n]=l;
                        n=n+1;
                        break;
                case 2: System.out.print("Enter element to be searched:");
                        l=scanner.next(); 
                        int flag=1;
                        for(i=0;i<n;i++)
                        {
                            if(arr[i].compareToIgnoreCase(l)==0)
                                {
                                    flag=0;
                                    p=i;
                                    break;
                                }
                        }  
                        if(flag==0)
                            System.out.println("Element Found in index "+i);
                        else
                            System.out.println("Element not found");
                        break;
                case 3: for(i=0;i<n;i++)
                            {
                                System.out.print("\n arr[]="+arr[i]);
                            }
                            break;
                case 4:     System.out.print("Enter index to be deleted:");
                            int g=scanner.nextInt();
                            if(g<n)
                            {
                                for(i=(g-1);i<n;i++)
                                    arr[i]=arr[i+1];
                                n=n-1;
                            }
            }
            System.out.print("\n Do you want to continue press 1:");
            k=scanner.nextInt();
        }
    }
}
