public class EndMill extends CuttingTools{

    public EndMill(double Vc, double D, double Fuc, int Z) {
        super(Vc, D, Fuc, Z);
    }
    @Override
    void endMillInformation() {
        System.out.println("Parmak Frezeler, parcaya form vermek icin kullanilir. X,Y ve Z yonlerinde hareket edebilir.");
    }
    @Override
    void drillInformation() {}
}
