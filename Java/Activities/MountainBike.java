
public class MountainBike extends Bicycle
{
    public int seatHeight;

	public MountainBike(int gears, int currentSpeed,int startHeight) {
		super(gears, currentSpeed);
		this.seatHeight=startHeight;
	}

}
