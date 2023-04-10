package com.stir.cscu9t4practical1;

public class Sprint extends Entry {

    private int recovery;
    private int repetition;


    public Sprint(String n, int d, int m, int y, int h, int min, int s, float dist, int rec, int rep){
        super(n, d, m, y, h, min, s, dist);
        this.recovery = rec;
        this.repetition = rep;


    }


    public int getRecovery(){
        return recovery;
    }

    public int getRepetition(){
        return repetition;
    }

    public String getEntry () {
        String result = getName()+" ran " + getDistance() + " km in "
                  +getHour()+":"+getMin()+":"+ getSec() +" with"+getRecovery()+ "min rest for "
                  +getRepetition()+" on "+getDay()+"/"+getMonth()+"/"+getYear()+"\n";
        return result;
       }

}
