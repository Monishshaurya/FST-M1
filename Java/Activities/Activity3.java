
public class Activity3 {

	public static void main(String[] args)
	{

		double seconds = 1000000000;
	    double earthseconds=31557600;
		double Mercuryseconds=0.2408467;
		double Venusseconds=0.61519726;
		double Marsseconds=1.8808158;
		double Jupiterseconds=11.862615;
		double Saturnseconds=29.447498;
		double Uranusseconds=84.016846;
		double Neptuneseconds=164.79132;
		
		System.out.println("Age of Mercury is  "+seconds/earthseconds/Mercuryseconds);
		System.out.println("Age of Venus is  "+seconds/earthseconds/Venusseconds);
		System.out.println("Age of Mars is  "+seconds/earthseconds/Marsseconds);
		System.out.println("Age of Jupiter is  "+seconds/earthseconds/Jupiterseconds);
		System.out.println("Age of Saturn is  "+seconds/earthseconds/Saturnseconds);
		System.out.println("Age of Uranus is  "+seconds/earthseconds/Uranusseconds);
		System.out.println("Age of Neptune is  "+seconds/earthseconds/Neptuneseconds);
	
	}

}
