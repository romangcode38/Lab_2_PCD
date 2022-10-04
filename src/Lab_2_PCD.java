public class  Lab_2_PCD{
    public static void main(String[] args) {
        ThreadGroup sys = Thread.currentThread().getThreadGroup();
        sys.list();
        ThreadGroup G4 = new ThreadGroup("G4");
        ThreadGroup G3 = new ThreadGroup(G4, "G3");
        Thread curr = Thread.currentThread();
        curr.setPriority(curr.getPriority() + 5);

        Thread Tha1 = new Thread(G3,"Tha2");
        Tha1.setPriority(2);
        Tha1.start();

        Thread Thb8 = new Thread(G3,"Thb8");
        Thb8.setPriority(8);
        Thb8.start();

        Thread Thc3 = new Thread(G3,"Thc3");
        Thc3.setPriority(3);
        Thc3.start();

        Thread Thd3 = new Thread(G3,"Thd3");
        Thd3.setPriority(3);
        Thd3.start();

        ThreadGroup G2 = new ThreadGroup(G3, "G2");
        sys.setMaxPriority(3);

        Thread Th13 = new Thread(G2,"Th13");
        Th13.start();

        Thread Th23 = new Thread(G2,"Th23");
        Th23.start();

        Thread Th33 = new Thread(G2,"Th33");
        Th33.start();

        Thread ThA3 = new Thread(G2,"ThA3");
        ThA3.start();
        G2.list();

        Thread Th18 = new Thread(G3,"ThA3");
        Th18.setPriority(8);
        Th18.start();
        G3.list();

    }
}
