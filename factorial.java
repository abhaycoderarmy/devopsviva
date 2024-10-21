import java.util.*;
class factorial
{
    public static void main (String args[])
    {
        Scanner ab= new Scanner(System.in);
        int a=ab.nextInt();
        int fact=1;
        for(int i=1;i<a;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        ab.close();
    }
}