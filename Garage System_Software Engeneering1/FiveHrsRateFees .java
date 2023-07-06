public class FiveHrsRateFees implements Calc {
    public double calculateTotalFees(Vehicle v){
        double totalFees;
        totalFees = v.getCarTime().getTotalTime() *5;
        if(totalFees<5){
            totalFees = 5;
        }
        return totalFees;
    }
}
