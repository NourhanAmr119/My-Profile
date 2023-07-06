public class Slot {
    private int width;
    private int depth;
    private int full =0;
    public void setDimensions(int w, int d){
        width = w;
        depth = d;
    }
    public int getWidth(){
        return width;
    }
    public int getDepth(){
        return depth;
    }
    public void setFull(int x){
        full =x;
    }
    public int getFull(){
        return full;
    }

}
