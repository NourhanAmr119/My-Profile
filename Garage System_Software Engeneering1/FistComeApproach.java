public class FistComeApproach implements Configuration{
    public int config(Vehicle v,Garage g1){
        int firstComeFirstServedSlot=0;
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

     return firstComeFirstServedSlot;
    }
}
