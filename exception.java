import java.util.*;
class Nesttry
{
    public static void main(String args[])
    {
        int a = args.length;
        try{
            if(a==0)
            {
                throw new ArithmeticException();
            }
            try{
                if(a==1)
            {
                throw new ArithmeticException();
            }
            if(a==2)
            {
                throw new ArrayIndexOutOfBoundsException();
            }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            
        }
        catch(ArithmeticException e)
            {
                System.out.println(e);
            }
    }
}
