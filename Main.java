public class Main {

    public static void main(String[] args) {
        CuttingTools Drill = new Drill(400, 32,0.17,1);
        Drill.drillInformation();
        Drill.showRpm();
        Drill.showFeed();

        System.out.println("----------------------------------------------------------------------------");

        CuttingTools EndMill = new EndMill(90,12,0.08,4);
        EndMill.endMillInformation();
        EndMill.showRpm();
        EndMill.showFeed();


    }
}