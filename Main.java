public class Main {

    public static void main(String[] args) {
        CuttingTools Drill = new Drill(375, 48,0.17,1);
        Drill.showRpm();
        Drill.showFeed();
        Drill.drillInformation();
        System.out.println("----------------------------------------------------------------------------");

        CuttingTools EndMill = new EndMill(90,12,0.08,3);
        EndMill.showRpm();
        EndMill.showFeed();
        EndMill.endMillInformation();

    }
}