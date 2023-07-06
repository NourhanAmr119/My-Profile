import java.time.ZonedDateTime;

public class GarageController {
    private static GarageController GC;
    private GarageController(){}
    public static GarageController getInstance(){
        if(GC==null)
            GC=new GarageController();
        return GC;
    }
    /*public GarageController(Garage g,int numberOfSlots){
        g.carsParkedIn = new Vehicle[numberOfSlots];
        g.slots= new Slot[numberOfSlots];
        g.one = new Slot();
        g.one.setDimensions(1,1);
        for(int i=0; i<g.slots.length; i++ ) g.slots[i] = new Slot();

        for(int i=0; i<g.slots.length; i++ ){
            g.slots[i].setDimensions(g.one.getWidth(),g.one.getDepth());
        }
    }*/
    public void setInfo(Garage g,int numberOfSlots,Slot [] array){
        g.carsParkedIn = new Vehicle[numberOfSlots];
        g.slots= new Slot[numberOfSlots];
        g.one = new Slot();
        g.one.setDimensions(1,1);
        for(int i=0; i<g.slots.length; i++ ) g.slots[i] = new Slot();

        for(int i=0; i<g.slots.length; i++ ){
            g.slots[i].setDimensions(g.one.getWidth(),g.one.getDepth());
        }
        for(int i=0; i<array.length; i++ ){
            g.slots[i].setDimensions(array[i].getWidth(),array[i].getDepth());
        }
    }
    /*public void setInfo(Garage g,Slot [] array){
        for(int i=0; i<array.length; i++ ){
            g.slots[i].setDimensions(array[i].getWidth(),array[i].getDepth());
        }
    }
    /*
    public void getInfo(){
        for(int i = 0 ; i<slots.length; i++) {
            System.out.print("slot"+i+"dimensions are: ("+slots[i].width+", "+slots[i].depth+") and full: "+slots[i].full);
        }
        System.out.println(carsParkedIn);
    }*/
    public double getTotalIncome(Garage g){
        return g.getTotalIncome();
    }
    public void displayTheAvailableParkingSlots(Garage g){
        System.out.print("[ ");
        for (int i =0 ; i< g.slots.length; i++){
            if(g.slots[i].getFull() == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println("]");
        System.out.println("n  width depth status");
        String status;
        for (int i =0 ; i< g.slots.length; i++){
            if(g.slots[i].getFull() == 1){
                status = "full";
            }
            else {
                status ="empty";
            }
            System.out.println(i+"  "+g.slots[i].getWidth()+"     "+g.slots[i].getDepth()+"     "+status);
        }
    }
    public boolean wasThisSlotTaken(Garage g,int theSlotNumber){
        if(theSlotNumber < g.slots.length){
            return g.slots[theSlotNumber].getFull() == 1;
        }
        return false;
    }

    public int parkIn(Vehicle v,Garage g1, Configuration configuration){

        ZonedDateTime timeIn;
        timeIn = ZonedDateTime.now();
        v.getCarTime().setTimeInInfo(timeIn);



        int firstComeFirstServedSlot = 0;
        int bestFitApproachSlot = 0;
        int index = 0;
        index = configuration.config(v,g1);
        /**if(configuration == 1){
         for (int i = 0 ; i< g1.slots.length;i++){
         if(g1.slots[i].getFull() < 1){
         g1.slots[i].setFull(1);
         firstComeFirstServedSlot = i;
         v.setPlace(i);
         break;
         }
         if(i==(g1.slots.length-1)){
         System.out.println("there is no available slot in the garage...");
         }
         }
         index=firstComeFirstServedSlot;
         }
         else if(configuration == 2) {
         for (int i = 0; i < g1.slots.length; i++) {
         int c = 0;
         if(g1.slots[i].getFull()<1){
         if (g1.slots[i].getWidth() >= v.getWidth()) {
         c = c + 1;
         }
         if (g1.slots[i].getDepth() >= v.getDepth()) {
         c = c + 1;
         }
         if (c == 2) {
         g1.slots[i].setFull(1);
         bestFitApproachSlot = i;
         v.setPlace(i);
         break;
         }
         }

         if(i==(g1.slots.length-1)){
         System.out.println("the vehicle dimensions is bigger than the available parking slots...");
         }
         }
         index = bestFitApproachSlot;

         }**/

        g1.theTotalNumberOfVehicles +=1;
        /*Vehicle obj= new Vehicle(v.getModelName(), v.getModelYear(),  v.getId(),  v.getWidth(),  v.getDepth(), v.getCarTime());
        //VehicleController VC = new VehicleController(obj, v.getModelName(), v.getModelYear(),  v.getId(),  v.getWidth(),  v.getDepth(), v.getCarTime());
        obj.setPlace(v.getPlace());*/
        g1.carsParkedIn[v.getPlace()]=v;

        return index;
    }//park-in
    public void parkOut(Vehicle v,Garage g,Calc c){
        ZonedDateTime timeOut;
        timeOut = ZonedDateTime.now();
        v.getCarTime().setTimeOutInfo(timeOut);
        v.setTotalFees(c.calculateTotalFees(v));
        g.totalIncome += v.getTotalFees();
        g.theTotalNumberOfVehicles--;

        g.slots[v.getPlace()].setFull(0);
        v.setPlace(-1);
    }//park-out
}
