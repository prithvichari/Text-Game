package mock;
import java.util.Scanner;

public class TextAdventure extends Model{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String runagain;
		do {
			System.out.println("You are a well established knight in your kingdom but with very little experience in battle as there has been peace for many decades. \n"
					+ "Suddenly and without warning, a dark force has pushed into the kingdom and threatens the peace! The princess of the kingdom is kidnapped by \n"
					+ "these dark forces where it is discovered to be controlled by the Malicious Bunny of Malathor! This is your call to action! \n"
					+ "Many knights have been sent before you and have not returned, but this is your chance to prove yourself! The king finally calls for \n" 
					+ "you and gives you this fateful task. Travel to the Lands of Malathor, defeat the Malicious Bunny and his henchmen, and return with the princess!");
			System.out.println(" ");
			System.out.println("You step within the Royal Chamber and glance around at the extravagant surroundings before you. \n" 
					+ "The King sits utop his throne before you approach. \n"
					+ "You kneel before your King \n"
					+ "'Who is this brave knight who wishes to save my daughter?' \n"
					+ "It seems he forgot your name ...");
			String Lname = input.nextLine();
			System.out.println("'Oh I see!' The King ruffles through a scroll with several names crossed off until he reaches your name at the bottom, \n"
					+ "in fact all names are crossed off.. except yours... 'Oh yes! Ahem ... Ser " +Lname + "!"  
			+ " Now, which fief do you hail from Ser " + Lname + "?");
			String Home = input.nextLine();
			KnightClass Name = new KnightClass();
			Name.setLastName(Lname);
			KnightClass Homeland = new KnightClass();
			Homeland.setKingdom(Home);

			System.out.println("");

			System.out.println("You leave your home of " + Home + " and travel far and wide for many weeks until you reach your \n"
					+ "final destination deep within the Lands of Malathor. \n"
					+ "Armed with your trusty shortsword, you step forward towards the entrace of the Malicious Bunny's lair. You are set to \n"
					+ "figure out a way to destroy the doors, until they just merely open up to allow you within. You shrug and step inside."); //Write introduction here. Mention that player has a short sword.
			System.out.println("");
			System.out.println("The doors suddenly slam shut behind you! You quiver in your armor as your eyes adjust to the dank dark interior. \n"
					+ "You keep your shortsword at the ready, just in case anything were to hop out at you.");
			System.out.println("");
			System.out.println("As your eyes finally adjust, you could see that the interior is moss ridden, the stench of death makes itself obvious as you could \n"
					+ "see the many corpses hung along the walls around you within the entrace, all of them with nibble marks around their necks and hands. \n"
					+ "It appears they had all fallen victim to the Bunny itself! You must try not to meet the same fate.\n"
					+ "You steel yourself within the entrace, ready at a moments notice for enemies, yet none come... perhaps it's time to advance?"); //description of entrance

			Model gameplay = new Model();
			gameplay.RoomBuilder();
			String navigate;
			int a;


			while (Model.ending == false)
			{
				navigate = "";
				a = 0;

				System.out.println("What would you like to do?");
				navigate = input.nextLine();

				if (navigate.equalsIgnoreCase("Move Forward"))

					a = 1;	

				else if (navigate.equalsIgnoreCase("Move Back"))

					a = 2;	

				else if (navigate.equalsIgnoreCase("Move Left"))

					a = 3;	

				else if (navigate.equalsIgnoreCase("Move Right"))

					a = 4;

				else if (navigate.equalsIgnoreCase("Climb"))

					a = 5;

				else if (navigate.equalsIgnoreCase("Attack"))

					a = 6;

				else if (navigate.equalsIgnoreCase("Examine"))

					a = 7;



				gameplay.actions(a);
				navigate = "";
				System.out.println("");
			}

			System.out.println("Do you want to play again?  Reply Yes or No");
			runagain = input.nextLine();
			
		}

		while (runagain.equalsIgnoreCase("Yes"));
		input.close(); //close scanner

	}

}
