public class HebraGet implements Runnable {
    private VariableCompartida c1;
    public HebraGet(VariableCompartida c1) {
        this.c1 = c1;
    }
    @Override
    public void run() {
        for (int i=0; i < 100; i++) {
            System.out.println("GET: "+c1.getVariableV());
        }
    }

    public VariableCompartida getC1() {
        System.out.println(c1.getVariableV());
        return c1;
    }
}
