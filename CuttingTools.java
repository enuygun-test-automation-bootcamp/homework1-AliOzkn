public abstract class CuttingTools {

    public static double Vc,D,N,F,Fuc;
    public static int Z;

    public CuttingTools(double Vc, double D, double Fuc, int Z){
        this.Vc = Vc;
        this.D = D;
        this.Fuc = Fuc;
        this.Z = Z;
    }

    static double rpm(){

        return N = ((Vc*1000)/(3.14*D));
    }
    static double feed(){

        return  F = (Fuc*Z*N);
    }
    abstract void drillInformation();
    abstract void endMillInformation();



}
