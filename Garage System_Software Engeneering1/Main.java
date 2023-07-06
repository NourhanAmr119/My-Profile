
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfSlots;
        do{
        System.out.println("input the garage slots number...");
        numberOfSlots = scanner.nextInt();
        }while (numberOfSlots < 0);

        Slot[] slots= new Slot[numberOfSlots];
        for(int i = 0 ; i< numberOfSlots; i++ ){
            /*System.out.println("input the slot number"+i+"dimensions as (width,depth)...");
            int width = scanner.nextInt();
            int depth = scanner.nextInt();
            slots[i]= new Slot();
            slots[i].setDimensions(width,depth);*/

            slots[i]= new Slot();
            slots[i].setDimensions(1+i,1+i);
        }

        Garage garage = new Garage();
        GarageController.getInstance().setInfo(garage,numberOfSlots,slots);

        AtomicInteger choice = new AtomicInteger(10);

        do{

            System.out.println("1- enter ur car info and Park in...");
            System.out.println("2- Park out and know ur fees...");
            System.out.println("3- calculate total income...");
            System.out.println("4- calculate total number of vehicles in the garage...");
            System.out.println("5- Display the available parking slots...");
            System.out.println("0- Exit...");
            choice.set(scanner.nextInt());

            if(choice.get() == 1 ){



                Vehicle car = new Vehicle();
                car.setInfo();
                //VehicleController VC = new VehicleController(car,modelName,modelYear,identificationNumber,width,depth);

                int configuration ;
                do{
                    System.out.println("please select ur configuration...");
                    System.out.println("1- first come first served slots...");
                    System.out.println("2- best-fit approach...");
                    configuration = scanner.nextInt();
                }while(configuration != 1 && configuration!= 2);
                
                Configuration con = null;
                if(configuration==1){
                    con= new FistComeApproach();
                } else if (configuration==2) {
                    con= new BestFitApproach();
                }
                
                int parkingSlotNumber=GarageController.getInstance().parkIn(car,garage,con);
                System.out.println("your parking slot is slot number "+parkingSlotNumber);
            }
            if(choice.get() == 2 ){
                System.out.println("enter your parking slot number to know you fees..");
                int parkingSlotNumber= scanner.nextInt();
                if(GarageController.getInstance().wasThisSlotTaken(garage,parkingSlotNumber)){

                    //VehicleController VC = new VehicleController(garage.carsParkedIn[parkingSlotNumber],garage.carsParkedIn[parkingSlotNumber].getModelName(),garage.carsParkedIn[parkingSlotNumber].getModelYear(),garage.carsParkedIn[parkingSlotNumber].getId(),garage.carsParkedIn[parkingSlotNumber].getWidth(),garage.carsParkedIn[parkingSlotNumber].getDepth());
                    Calc c;
                    c = new FiveHrsRateFees();
                    GarageController.getInstance().parkOut(garage.carsParkedIn[parkingSlotNumber],garage,c);
                    System.out.println("your parking fees are: "+c.calculateTotalFees(garage.carsParkedIn[parkingSlotNumber]));
                    System.out.println("thanks for using our program...:)");
                }
                else
                    System.out.println("bad input..please ty again...:(");
            }
            if(choice.get() == 3 ){
                System.out.println("your garage total income is: "+GarageController.getInstance().getTotalIncome(garage));
            }
            if(choice.get() == 4 ){
                System.out.println("the total number of vehicles in the garage now is: "+garage.theTotalNumberOfVehicles);
            }
            if(choice.get() == 5 ){
                System.out.println("the slots available are the slots number:");
                GarageController.getInstance().displayTheAvailableParkingSlots(garage);
            }
            System.out.println();

        }while (choice.get() != 0);
    }
}
