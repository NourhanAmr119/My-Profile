import java.time.ZonedDateTime;
import java.util.Random;
import java.util.Scanner;

public class Vehicle {
    private String modelName;
    private int modelYear;
    private String id;
    private int width;
    private int depth;
    private TimeController carTime = new TimeController();
    private int place;
    private double totalFees ;

    public void setInfo(){
        System.out.println("log in with ur car info to park in...");

        System.out.println("enter the coming info...");
        System.out.print("model name = ");
        Scanner scanner= new Scanner(System.in);
        String modelName = scanner.next();
        this.modelName = modelName;
        System.out.println();
        System.out.print("model year = ");
        int modelYear = scanner.nextInt();
        this.modelYear= modelYear;
        System.out.println();
        System.out.print("identification number = ");
        String identificationNumber = scanner.next();
        id= identificationNumber;
        System.out.println();
        System.out.print("car width = ");
        int width = scanner.nextInt();
        this.width= width;
        System.out.println();
        System.out.print("car depth = ");
        int depth = scanner.nextInt();
        this.depth= depth;
    }

   /* public Vehicle(Vehicle v) {
        setModelName(v.getModelName());
        setModelYear(v.getModelYear());
        setId(v.getId());
        setWidth(v.getWidth());
        setDepth(v.getDepth());
    }*/
    public Vehicle() {}
    public Vehicle(String modelName, int modelYear, String id, int width, int depth,TimeController carTime) {
        setModelName(modelName);
        setModelYear(modelYear);
        setId(id);
        setWidth(width);
        setDepth(depth);
        setCarTime(carTime);
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setCarTime(TimeController carTime) {
        this.carTime = carTime;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }

    public String getModelName() {
        return modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getId() {
        return id;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public TimeController getCarTime() {
        return carTime;
    }

    public int getPlace() {
        return place;
    }

    public double getTotalFees() {
        return totalFees;
    }

    /**public Vehicle(String modelName, int modelYear, String id, int width, int depth) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.id = id;
        this.width = width;
        this.depth = depth;
    }
    public Vehicle(String modelName, int modelYear, String id, int width, int depth,TimeController carTime) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.id = id;
        this.width = width;
        this.depth = depth;
        this.carTime = carTime;
    }/**
    public int parkIn(Garage g1, int configuration){

        ZonedDateTime timeIn;
        timeIn = ZonedDateTime.now();
        carTime.setTimeInInfo(timeIn);



        int firstComeFirstServedSlot = 0;
        int bestFitApproachSlot = 0;
        int index = 0;
        if(configuration == 1){
            for (int i = 0 ; i< g1.slots.length;i++){
                if(g1.slots[i].full < 1){
                    g1.slots[i].full=1;
                    firstComeFirstServedSlot = i;
                    place = i;
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
                if(g1.slots[i].full<1){
                    if (g1.slots[i].width >= width) {
                        c = c + 1;
                    }
                    if (g1.slots[i].depth >= depth) {
                        c = c + 1;
                    }
                    if (c == 2) {
                        g1.slots[i].full=1;
                        bestFitApproachSlot = i;
                        place = i;
                        break;
                    }
                }

                if(i==(g1.slots.length-1)){
                    System.out.println("the vehicle dimensions is bigger than the available parking slots...");
                }
            }
            index = bestFitApproachSlot;

        }

        g1.theTotalNumberOfVehicles +=1;
        Vehicle obj= new Vehicle(modelName,  modelYear,  id,  width,  depth,carTime);
        obj.place= place;
        g1.carsParkedIn[place]=obj;

        return index;
    }//park-in

    public void parkOut(Garage g){
        ZonedDateTime timeOut;
        timeOut = ZonedDateTime.now();
        carTime.setTimeOutInfo(timeOut);
        totalFees=calculateTotalFees();
        g.totalIncome += totalFees;

        /*for(int i = 0 ; i< g.carsParkedIn.length; i++){
            if(id == g.carsParkedIn[i].id){
                g.carsParkedIn[i]=new Vehicle();
            }
        }
        g.slots[place].full=0;
        place = -1;
    }
    public double calculateTotalFees(){
        double totalFees = 0;
        totalFees = carTime.totalTime *5;
        return totalFees;
    }*/


}
