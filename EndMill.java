public class EndMill extends CuttingTools{

    public EndMill(double Vc, double D, double Fuc, int Z) {
        super(Vc, D, Fuc, Z);
    }
    @Override
    void endMillInformation() {
        System.out.println("End mills are using to give form (shape) to the part. In coordinate system, they can move in X, Y and Z axis.");
    }
    @Override
    void drillInformation() {}
}
