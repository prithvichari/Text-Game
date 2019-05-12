package mock;
import java.util.Scanner;

public class TextAdventure extends Model{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String runagain;
		do {
			System.out.println("Story Story Story...");
			System.out.println(" ");
			System.out.println("Who is this brave knight who wishes to save my daughter?");
			String Lname = input.nextLine();
			System.out.println("What kingdom do you hail from, Ser " + Lname + "?");
			String Home = input.nextLine();
			KnightClass Name = new KnightClass();
			Name.setLastName(Lname);
			KnightClass Homeland = new KnightClass();
			Homeland.setKingdom(Home);

			System.out.println("");

			System.out.println("Introduction"); //Write introduction here. Mention that player has a short sword.

			System.out.println("...Enters the lair");

			System.out.println("Entrance Description"); //description of entrance

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
