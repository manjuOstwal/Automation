package ProductBuy;

public class TVRemote implements RemoteControl {
	
	public void turnOff()
	{
		System.out.println("turnOff Tv");
	}
	
	public void turnOn()
	{
		System.out.println("turnOn Tv");
	}
	
	public void volumeUp()
	{
		System.out.println("Volume UP");
	}
	
	public void volumeDown()
	{
		System.out.println("Volume Down");
	}
   
	public void ListOfChannels()
	{
		System.out.println("List of channels");
	}
	
	public void favourites()
	{
		System.out.println("favourite channels");
	}
      
	   public static void main(String arg[])
	   {
		   TVRemote obj = new TVRemote();
		obj.turnOn();
		obj.turnOff();
		obj.volumeDown();
		obj.volumeUp();
		obj.ListOfChannels();
		obj.favourites();
	   }

}
