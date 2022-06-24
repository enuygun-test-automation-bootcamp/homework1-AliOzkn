public class Drill extends CuttingTools{

    public Drill(double Vc, double D, double Fuc, int Z) {
        super(Vc, D, Fuc, Z);
    }
    @Override
    void drillInformation() {
        System.out.println("Matkaplar, parca uzerinde delik delmek icin kullanilir. Sadece Z yonunde hareket edebilir.");
    }
    @Override
    void endMillInformation() {}
}
