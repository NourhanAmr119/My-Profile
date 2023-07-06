

public class Garage {
    public Slot[] slots;
    public Slot one;
    public int theTotalNumberOfVehicles =0;
    public double totalIncome;
    public Vehicle[] carsParkedIn ;

    public double getTotalIncome() {
        return totalIncome;
    }


    /**public void setSlots(Slot[] slots) {
        this.slots = slots;
    }

    public void setOne(Slot one) {
        this.one = one;
    }

    public void setTheTotalNumberOfVehicles(int theTotalNumberOfVehicles) {
        this.theTotalNumberOfVehicles = theTotalNumberOfVehicles;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public void setCarsParkedIn(Vehicle[] carsParkedIn) {
        this.carsParkedIn = carsParkedIn;
    }

    public Slot[] getSlots() {
        return slots;
    }

    public Slot getOne() {
        return one;
    }

    public int getTheTotalNumberOfVehicles() {
        return theTotalNumberOfVehicles;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public Vehicle[] getCarsParkedIn() {
        return carsParkedIn;
    }

    /**public Garage(int numberOfSlots){
        carsParkedIn = new Vehicle[numberOfSlots];
        slots= new Slot[numberOfSlots];
        one = new Slot();
        one.setDimensions(1,1);
        for(int i=0; i<slots.length; i++ ) slots[i] = new Slot();

        for(int i=0; i<slots.length; i++ ){
            slots[i].width=one.width;
            slots[i].depth=one.depth;
        }
    }
    public void setInfo(Slot [] array){
        for(int i=0; i<array.length; i++ ){
            slots[i].depth=array[i].depth;
            slots[i].width=array[i].width;
        }
    }
    /*
    public void getInfo(){
        for(int i = 0 ; i<slots.length; i++) {
            System.out.print("slot"+i+"dimensions are: ("+slots[i].width+", "+slots[i].depth+") and full: "+slots[i].full);
        }
        System.out.println(carsParkedIn);
    }
    public double getTotalIncome(){
        return totalIncome;
    }
    public void displayTheAvailableParkingSlots(){
        System.out.print("[ ");
        for (int i =0 ; i< slots.length; i++){
            if(slots[i].full == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println("]");
    }**/
}
