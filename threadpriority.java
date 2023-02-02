import java.util.*;
class thread1 extends Thread
{
    public void run()
    {
        for(int i = 0;i<5;i++)
    {
        System.out.println("This is of Thread 1   " + i);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    }
    
}
class thread2 extends Thread
{
    public void run()
    {
        for(int i = 0;i<5;i++)
    {
        System.out.println("This is of Thread 2   " + i);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    }
    
}
class thread3 extends Thread
{
    public void run()
    {
        for(int i = 0;i<5;i++)
    {
        System.out.println("This is of Thread 3   " + i);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    }
    
}

class priority
{
    public static void main(String args[])
    {
        thread1 a = new thread1();
        thread2 b = new thread2();
        thread3 c = new thread3();
        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);
        c.setPriority(Thread.NORM_PRIORITY);
        a.start();
        b.start();
        c.start();

    }
}


