import java.util.*;

class call {
    synchronized void callvalue(String string) {
        System.out.print("{" + string);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.print("}");

    }
}

class sync implements Runnable {
    String string;
    call b;
    Thread t;

    sync(call a) {
        b = a;
        t = new Thread(this);
        t.start();
    }

    void calling() {
        b.callvalue(string);

    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        string = sc.next();
        calling();

    }

}

class synchron {
    public static void main(String args[]) {
        call a = new call();
        sync b = new sync(a);
        // call c = new call();
        sync d = new sync(a);
        // call e = new call();
        sync f = new sync(a);
        // call g = new call();
        sync h = new sync(a);
        try {
            h.t.join();
            b.t.join();
            d.t.join();
            f.t.join();

        } catch (InterruptedException r) {
            System.out.println("Interrupted");
        }

    }
}
