import javax.xml.crypto.Data;
import java.time.ZonedDateTime;

public class TimeController {
    private float hrsIN;
    private float minIN;
    private float secIN;
    private float hrsOUT;
    private float minOUT;
    private float secOUT;
    private float totalTime;

    public TimeController() {
    }

    public TimeController(ZonedDateTime timeIN, ZonedDateTime timeOut) {
        setTimeInInfo(timeIN);
        setTimeOutInfo(timeOut);
        calculateTotalTime();
    }
    public void setTimeInInfo(ZonedDateTime timeIN){
        String in = String.valueOf(timeIN);
        String hrsIN = in.substring(11,13);
        String minIN = in.substring(14,16);
        String secIN = in.substring(17,19);

        this.hrsIN = Integer.parseInt(hrsIN);
        this.minIN = Integer.parseInt(minIN) ;
        this.secIN = Integer.parseInt(secIN);
    }
    public void setTimeOutInfo(ZonedDateTime timeOut){
        String out = String.valueOf(timeOut);
        String hrsOUT = out.substring(11,13);
        String minOUT = out.substring(14,16);
        String secOUT = out.substring(17,19);

        this.hrsOUT = Integer.parseInt(hrsOUT);
        this.minOUT = Integer.parseInt(minOUT);
        this.secOUT = Integer.parseInt(secOUT);
        calculateTotalTime();
    }
    public void calculateTotalTime(){
        totalTime = 0;
        totalTime += (hrsOUT - hrsIN ) ;
        totalTime += (minOUT - minIN )/(60);
        totalTime += (secOUT - secIN )/(60*60);
    }

    public float getTotalTime(){
        return totalTime;
    }


}
