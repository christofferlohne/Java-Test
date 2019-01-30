package test;

public class Two {
    private int x,y;
    public Two(int x, int y){
        x=x;
    }
    public String toString(){
        return "["+x+","+y+"]";
    }
    public static void main(String []args){
        Two point = new Two(10, 20);
        System.out.println(point);
    }
}
