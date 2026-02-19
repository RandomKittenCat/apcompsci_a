package BusRoute;

public class Bus {
    int stops;
    int curr = 1;
    boolean increasing = true;

    public Bus(int nstops){
        stops = nstops;
    }

    public void move(){
        if(curr == stops){
            increasing = false;
            curr--;
        }else if(curr == 1){
            increasing = true;
            curr++;
        }else{
            if(increasing) curr++;
            if(!increasing) curr--;
        }
    }

    public int getCurrentStop(){
        return curr;
    }
}