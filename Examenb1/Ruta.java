package Examenb1;

public class Ruta extends Pasajero{
    double rutaQG;
    double rutaQP;
    double rutaQT;
    double rutaQR;

    public Ruta(String cliente, double rutaQG, double rutaQP, double rutaQT, double rutaQR){
        super(cliente);
        this.rutaQG=20.00;
        this.rutaQP=15.00;
        this.rutaQT=17.50;
        this.rutaQR=17.50;
    }

}