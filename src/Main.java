public class Main   {
    public static void main(String[] args) throws InterruptedException {
        VariableCompartida c1 = new VariableCompartida();
        HebraSet h1 = new HebraSet(c1);
        HebraGet h2 = new HebraGet(c1);

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        h2.getC1().getVariableV();
        }
    }

