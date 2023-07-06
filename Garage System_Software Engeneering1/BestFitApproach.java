public class BestFitApproach implements Configuration {
    public int config(Vehicle v,Garage g1){
        int bestFitApproachSlot=0;
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

        return bestFitApproachSlot;
    }
}
