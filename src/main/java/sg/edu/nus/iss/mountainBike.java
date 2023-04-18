package sg.edu.nus.iss;

public class mountainBike extends Bicycle {

    public int seatHeight;

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public mountainBike(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public mountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        //return "mountainBike [seatHeight=" + seatHeight + "]";
        return super.toString() + "\nSeat Height= " + seatHeight;
    }
    
    
}
