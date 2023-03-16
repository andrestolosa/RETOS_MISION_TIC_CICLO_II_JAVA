package reto1_seccion;

public class BecaUniversitaria {
    private int tiempo;
    private double monto;
    private double interes;

    public BecaUniversitaria(){
        tiempo=0;
        monto=0;
        interes=0;
    }

    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres){
        this.tiempo=pTiempo;
        this.monto=pMonto;
        this.interes=pInteres;
    }

    public double calcularInteresSimple( ){
        double inter=monto*(interes/100)*tiempo;
        return Math.round(inter);
    }
    public double calcularInteresCompuesto( ){
        double inter2=monto*(Math.pow(1+interes/100,tiempo)-1);
        return Math.round(inter2);
    }
    public String compararInversion (int pTiempo, double pMonto, double pInteres){
        this.tiempo=pTiempo;
        this.monto=pMonto;
        this.interes=pInteres;

        double resta=calcularInteresCompuesto()-calcularInteresSimple();
        if (resta!=0){
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + resta;
        }
        else{
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }
    public String compararInversion ( ){
        double resta=0;
        resta=calcularInteresCompuesto()-calcularInteresSimple();
        if (resta!=0){
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + resta;
        }
        else{
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
        
    }
}

