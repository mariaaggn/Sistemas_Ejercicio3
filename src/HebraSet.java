public class HebraSet implements Runnable{
    private VariableCompartida c1;
    public HebraSet(VariableCompartida c1) {
        this.c1 = c1;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //Coje la variable compartida que hay en hebra y pilla el set de la Clase Variable compartida y le cambia el valor
            c1.setVariableV(i);
            System.out.println("SET:"+c1.getVariableV());
        }
}
    public void setC1(VariableCompartida c1) {
        this.c1 = c1;
    }
}




