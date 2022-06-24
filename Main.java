public class Main {

    public static void main(String[] args) {
        CuttingTools Drill = new Drill(400, 50,0.17,1);
        System.out.println("rpm: " + CuttingTools.rpm());
        System.out.println("Feed: " + CuttingTools.feed());
        Drill.drillInformation();
        System.out.println("----------------------------------------------------------------------------");

        CuttingTools EndMill = new EndMill(90,12,0.08,4);
        System.out.println("rpm: " + CuttingTools.rpm());
        System.out.println("Feed: " + CuttingTools.feed());
        EndMill.endMillInformation();
    }
}