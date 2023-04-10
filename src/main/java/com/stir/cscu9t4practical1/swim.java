package com.stir.cscu9t4practical1;

public class swim extends Entry{
    private String place;


    public swim(String n, int d, int m, int y, int h, int min, int s, float dist, String pl){
        super(n, d, m, y, h, min, s, dist);
        this.place = pl;
    }
    

    public String getPlace(){
        return place;
    }



    public String getEntry () {
        String result = getName()+" swam " + getDistance() + " km in "
                  +getHour()+":"+getMin()+":"+ getSec() + " in "+getPlace()+ " on "
                  +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
        return result;
       }
}
