public class Drill extends CuttingTools{

    public Drill(double Vc, double D, double Fuc, int Z) {
        super(Vc, D, Fuc, Z);
    }
    @Override
    void drillInformation() {
        System.out.println("Drills are using to drill holes on the part. In coordinate system, they can only move in Z axis.");
    }
    @Override
    void endMillInformation() {}
}
