
public class Activity6 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		plane p=new plane(10);
		
		p.onboard("mouni");
		p.onboard("ravali");
		p.onboard("lekha");
		p.onboard("seetha");
        System.out.println("Plane took off at: " + p.takeoff());//Print list of people on board
        System.out.println("People on the plane: " + p.getPassesngers());
		
        Thread.sleep(5000);
        p.land();
        //Plane lands
        System.out.println("Plane landed at: " + p.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + p.getPassesngers());
	}

}
