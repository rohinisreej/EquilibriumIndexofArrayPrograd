import java.util.Scanner;
class Equilibrium{
    public static int equilibiriyamarray(int[] array)
    {
        int size=array.length;
        int index=Integer.MAX_VALUE;
        int count=0;
        int p[]=new int[size];
        p[0]=array[0];
        for(int i=1;i<size;i++)
        {
            p[i]=p[i-1]+array[i];
        }
        for(int i=1;i<size;i++)
        {
            if(p[i-1]==(p[size-1]-p[i]))
            {
                count++;
                if(index>i) {
                    index = i;
                }
            }
        }
        if(count==0) {
            return -1;
        }
        return index;


    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=scanner.nextInt();
        System.out.println("Enter the array values: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        Equilibrium equilibrium=new Equilibrium();
        System.out.println(equilibrium.equilibiriyamarray(arr));


    }
}