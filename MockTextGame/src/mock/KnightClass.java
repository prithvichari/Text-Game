package mock;

public class KnightClass extends Model{

	private String lastname; //Encapsulation
	private String kingdom;
	
	
	public KnightClass()
	{
		this.kingdom = "Rutgers";
		this.lastname = "Pandey";
	}
	
	public String getLastName()
	{
		return lastname;
	}
	
	public void setLastName(String lastname)
	{
		this.lastname = lastname;
	}
	
	public String getKingdom()
	{
		return kingdom;
	}
	
	public void setKingdom(String kingdom)
	{
		this.kingdom = kingdom;
	}
	
	public String toString(String Ts)
	{
		return ("Ser" + lastname +". Brave knight of" + this.kingdom+ ". Please bring my daughter home safe");
	}
}
