public class Hebra implements Runnable{
    private VariableCompartida c1;
    public Hebra(VariableCompartida c1) {
        this.c1 = c1;
    }
    @Override
    public void run() {
        System.out.println("Hebra"+ Thread.currentThread().getName() + "");
    }

    public VariableCompartida getC1() {
        System.out.println(c1.getVariableV());
        return c1;
    }

    public void setC1(VariableCompartida c1) {
        this.c1 = c1;
    }
}
