package sg.edu.nus.iss;

public class roadBike extends Bicycle {

    public int seatHeight;

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public roadBike(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public roadBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        //return "mountainBike [seatHeight=" + seatHeight + "]";
        return super.toString() + "\nSeat Height= " + seatHeight;
    }
    
}
