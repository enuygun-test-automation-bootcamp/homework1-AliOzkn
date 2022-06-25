import java.util.Scanner;

public abstract class CuttingTools {
    /*
    Vc:Kesme Hizi(m/min)
    D: Kesici takim capi (mm)
    S: Devir (rev/min)
    F:Ilerleme (mm/min)
    Fuc: 1 uc basina ilerleme (mm)
    Z: Uc Sayisi
    */
    private static double Vc,D,S,F,Fuc;
    private static int Z;

    public CuttingTools(double Vc, double D, double Fuc, int Z){
        this.Vc = Vc;
        this.D = D;
        this.Fuc = Fuc;
        this.Z = Z;
    }
    private static double rpm(){
        return S = ((Vc*1000)/(3.14*D)); //Devir Formulu

    }
    void showRpm() {
        if (Vc <= 0 || D <= 0) {
            System.out.println("rpm: " + "You entered an incorrect value for rpm. (Vc or D)");
        } else {
            System.out.println("rpm: " + rpm());
        }
    }
    private static double feed(){
        return  F = (Fuc*Z*S);    // Ilerleme Formulu
    }
    void showFeed(){
        if (Fuc <=0 || Z <= 0) {
            System.out.println("Feed: " + "You entered an incorrect value for feed. (Fuc or Z)");
        } else {
            System.out.println("Feed: " + feed());
        }
    }
    abstract void drillInformation();
    abstract void endMillInformation();



}
