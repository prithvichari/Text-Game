package mock;

public class Model extends AbstractClass{

	String name;
	String[] rooms = new String[12];

	boolean shortsword = true;
	boolean mace = false;
	boolean greatsword = false;
	boolean key = false;
	boolean toothpick = false;
	static boolean ending = false;
	

	int currentroom = 0;

	public String AbstractExample()
	{
		return ("Example of an absract method"); //Abstract Method
	}

	public String[] getRoom() 
	{
		return rooms;
	}

	public void RoomBuilder()	//Polymorphism
	{
		rooms[0] = "Entrance";
		rooms[1] = "Hallway1";
		rooms[2] = "Hallway2";
		rooms[3] = "Room1";
		rooms[4] = "Room1B";
		rooms[5] = "Room2";
		rooms[6] = "Room2B";
		rooms[7] = "Room3";
		rooms[8] = "Room3B";
		rooms[9] = "Room4";
		rooms[10] = "Room4B";
		rooms[11] = "Boss";
	}

	public void CreateRooms() {
		for (int i=0; i<11; i++)
		{
			System.out.println(rooms[i]);
		}

		System.out.println("______________________");
	}

	/*Move Forward = 1
	 *Move Back = 2
	 *Move Left = 3
	 *Move Right = 4
	 *Climb = 5
	 *Attack = 6
	 *Examine = 7
	 */
	public void actions(int move) {

		if (currentroom == 0) //Entrance
		{
			if (move == 1)
			{
				System.out.println("You have found yourself within a long hallway; so long that you can't see the other end. \n"
						+ "You could see two doors, one to your left and right. Will you enter one of these doors or continue walking forward?");
				currentroom=1;
			}

			else if(move == 2)
			{
				System.out.println("What are you? A coward?! Scared of a little bit of bones from your fallen comrades who were annihilated by a bunny?? \n"
						+ "Well, I guess any sane person would run away seeing that, yet you musn't give up now! You have a princess to save and a game to finish!");
				currentroom=0;
			}

			else if(move == 3)
			{
				System.out.println("You chose to walk into a wall, I bet that hurt.");
				currentroom=0;
			}

			else if(move == 4)
			{
				System.out.println("You chose to walk into a wall, I bet that hurt.");
				currentroom=0;
			}

			else if(move == 5)
			{
				System.out.println("There is nothing to climb.");
				currentroom=0;
			}

			else if(move == 6)
			{
				System.out.println("There is nobody here to attack in the entrance, only you are here.");
				currentroom=0;
			}

			else if(move == 7)
			{
				System.out.println("You are in the large entrance still with decorations that are trophies that the Malicious Bunny has aquired through his years of murder, \n"
						+ "stealing, and kidnapping. The most prominent 'trophies' being the corpses of your comrades. There is no one in the room to greet you. \n"
						+ "The only way forward is a door in front of you");
				currentroom=0;
			}

		}

		else if (currentroom == 1) //Hallway1
		{
			if (move == 1)
			{
				System.out.println("You walked down the long hallway.  At the end you see a door on your left and right.  In front of you is this grand door decorated with priceless gems.  You look at the lock and notice that it does not use a traditional key.  What would you like to do?");
				currentroom = 2;
			}

			else if (move == 2)
			{
				System.out.println("You are back in the main Entrance. The door to the hallway is in front of you.");
				currentroom = 0;
			}

			else if (move == 3)
			{
				if (key == false)
				{
					System.out.println("You try to open the door but it appears to be locked.");
					currentroom = 3;
				}

				else if (key == true)
				{
					System.out.println("You unlock the door with your key and enter the room.  Inside is an ogre ready to attack.  He is wearing strong plating armor that does not have any kinks in it.  But it does look like the metal is maluable and can dent when hit hard.");
					currentroom = 1;
				}
			}

			else if (move == 4)
			{
				System.out.println("You enter the room on the right.  On a weapon stand you see a greatsword. You pick it up and add it to your collection of weapons.  You notice a ladder in the corner going to a lower level.");
				currentroom = 5;
				greatsword = true;
			}

			else if (move == 5)
			{
				System.out.println("There is nothing the climb.");
				currentroom = 1;
			}

			else if (move == 6)
			{
				System.out.println("There is nothing to attack");
				currentroom = 1;
			}

			else if (move == 7)
			{
				System.out.println("You are in a darkly lit hallway.  You notice the heads of various trophies and banners lining up the ceiling. There are doors to the left and right of you.  The one on the left seems to be locked but the one on the right is unlocked.  You can also continue down the hallway.");
				currentroom = 1;
			}
		}

		else if (currentroom == 2) //Hallway2
		{
			if (move == 1)
			{
				if (toothpick == true)
				{
					System.out.println("You notice that the shape of the lock is the exact same as the Toothpick of Doom.  You place it into the lock and the door starts shaking.  You hear gears vigorously grinding and the door slowly opens.  You see the Malicious Bunny of Malthor sitting on his throne with a peeved look in his face.  In the corner you see the princess in a cage fit for a dog.  What will you do?");
					currentroom = 11;
				}

				else
				{
					System.out.println("You attempt to open the door but it is shut tight.  It seems that there is a large mechanism that keeps it shut so you can't break it down.");
					currentroom = 2;
				}
			}

			else if (move == 2)
			{
				System.out.println("You are back at the beginning of the hallway near the entrance.  Thre is a door to the left and right of you.  You can also move forward back down the hallway.");
				currentroom = 1;
			}

			else if (move == 3)
			{
				System.out.println("You enter the room on your left.  On the wall there is a mace hanging.  You take it off and add it to your collection.  Doing so opens a hole in the corner of a room with a ladder going down.");
				currentroom = 7;
				mace = true;
			}

			else if (move == 4)
			{
				System.out.println("You enter the room on your right.  Inside is a Troll.  It is wearing paper thin armor but his skin is rough and it isn't likely to take damage from blunt force or smaller slices.");
				currentroom = 9;
			}

			else if (move == 5)
			{
				System.out.println("There is nothing to climb.");
				currentroom = 2;
			}

			else if (move == 6)
			{
				System.out.println("There is nothing to attack.");
				currentroom = 2;
			}

			else if (move == 7)
			{
				System.out.println("This end of the hallway is more dimly lit that the beginning.  There is a door to your left and right; both unlocked.  There is a grand door in front of you with a giant lock mechanism.  The keyhole looks oddly round.");
				currentroom = 2;
			}
		}

		else if (currentroom == 3) //Room1
		{
			if (move == 1)
			{
				System.out.println("There is nowhere to go forward.");
				currentroom = 3;
			}

			else if (move == 2)
			{
				System.out.println("You are back in the hallway.  There is a room to the left and right of you.  You can also walk further down the hallway or move back to go back to the entrance.");
				currentroom = 1;
			}

			else if (move == 3)
			{
				System.out.println("There is no room to the left.");
				currentroom = 3;
			}

			else if (move == 4)
			{
				System.out.println("There is no room to the right.");
				currentroom = 3;
			}

			else if (move == 5)
			{
				System.out.println("You climb down the ladder. The basement is filled with piles of garbage.  For some reason you feel inclined to pick up a toothpick with an olive on it.  It has been added to your inventory.");
				currentroom = 4;
			}

			else if (move == 6)
			{
				if (mace == true)
				{
					System.out.println("You swing your mace at the beast.  Its armor crumbles more and more with each hit.  Eventually you do enough blunt damage to kill it.  His death leads to a section of the floor opening revealing a ladder.");
					currentroom = 3;
				}

				else 
				{
					System.out.println("You attack the Ogre with every weapon you have! But unfortunately he does not look to be receiving at all.  He swings his club and it hits you right in the chest killing you.  Due to your failure, the princess will be forever captured.");
					ending = true;
				}
			}

			else if (move == 7)
			{
				System.out.println("The ogre is wearing full armor. It's so thick that slicing at it with any sword will not work. \n"
						+ "Perhaps there is a weapon that can do more of a blunt attack?");
				currentroom = 3;
			}
		}

		else if (currentroom == 4) //Room1A
		{
			if (move == 1)
			{
				System.out.println("There is no room to move forward to.");
				currentroom = 4;
			}

			else if (move == 2)
			{
				System.out.println("There is no room to move backwards to.");
				currentroom = 4;
			}

			else if (move == 3)
			{
				System.out.println("There is no room to move left to.");
				currentroom = 4;
			}

			else if (move == 4)
			{
				System.out.println("There is no room to move right to.");
				currentroom = 4;
			}

			else if (move == 5)
			{
				System.out.println("You climb back up the ladder and stand over the ogre's dead corpse. You can climb the ladder or move back to enter the hallway.");
				currentroom = 3;
			}

			else if (move == 6)
			{
				System.out.println("There is nothing to attack.");
				currentroom = 4;
			}

			else if (move == 7)
			{
				System.out.println("There is nothing but garbage everywhere.  There is a ladder leading back to the room where you fought the ogre.");
				currentroom = 4;
			}
		}

		else if (currentroom == 5) //Room 2
		{
			if (move == 1)
			{
				System.out.println("There is no room to move forward to.");
				currentroom = 5;
			}

			else if (move == 2)
			{
				System.out.println("You are back in the hallway. There is a room to your left and right.  You can also move forward down the hallway or back to the entrance.");
				currentroom = 1;
			}

			else if (move == 3)
			{
				System.out.println("There is no room to the left to move to.");
				currentroom = 5;
			}

			else if (move == 4)
			{
				System.out.println("There is no room to move right to.");
				currentroom = 5;
			}

			else if (move == 5)
			{
				System.out.println("You climb down the ladder.  You step on a pressure tile that closes the entrance to this room.  The walls start rumbling and closing in on you.  You just became a whole lot thinner.");
				ending = true;
			}

			else if (move == 6)
			{
				System.out.println("There is nothing to attack.");
				currentroom = 5;
			}

			else if (move == 7)
			{
				System.out.println("There is a hole with a ladder that leads down to the basement.  You can also move back through the door to go to the hallway.");
				currentroom = 5;
			}
		}

		else if (currentroom == 7) //Room 3
		{
			if (move == 1)
			{
				System.out.println("There is no room to move forward to.");
				currentroom = 7;
			}

			else if (move == 2)
			{
				System.out.println("You go back out into the hallway.  There is a door to your left and right.  There is the grand door in front of you.");
				currentroom = 2;
			}

			else if (move == 3)
			{
				System.out.println("There is no room to move left to.");
				currentroom = 7;
			}

			else if (move == 4)
			{
				System.out.println("There is no room to move right to.");
				currentroom = 7;
			}

			else if (move == 5)
			{
				System.out.println("You climb down the ladder and step on the pressure plate.  The entrance shuts and hundreds of venomous snakes appear out of the holes in the walls. Why did it have to be snakes?");
				ending = true;
			}

			else if (move == 6)
			{
				System.out.println("There is nothing to attack");
				currentroom = 7;
			}

			else if (move == 7)
			{
				System.out.println("The rack is now empty since you took the mace.  There is a ladder that leads to the basement.  You can also go back into the hallway.");
				currentroom = 7;
			}
		}

		else if (currentroom == 9) //Room 4
		{
			if (move == 1)
			{
				System.out.println("There is no room to move forward to.");
				currentroom = 9;
			}

			else if (move == 2)
			{
				System.out.println("You move back out into the hallway.  There is a door to your left and right.  There is also the Grand Door in front of you.");
				currentroom = 2;
			}

			else if (move == 3)
			{
				System.out.println("There is no room to move left to.");
				currentroom = 9;
			}

			else if (move == 4)
			{
				System.out.println("There is no room to move right to.");
				currentroom =  9;
			}

			else if (move == 5)
			{
				System.out.println("You climb down the ladder and enter the basement. You notice a key rack on the wall. You pick up the key it holds.");
				currentroom = 10;
				key = true;
			}

			else if (move == 6)
			{
				if (greatsword == true)
				{
					System.out.println("You swing the greatsword at the troll and cleanly cut its flesh.  It wails in agony and dies from its wounds.");
					currentroom = 9;
				}

				else
				{
					System.out.println("Your weapons don't cut through the troll's flesh.  It swings its sword and connects with your neck.  You have failed to save the Princess.");
					ending = true;
				}
			}

			else if (move == 7)
			{
				System.out.println("The troll has paper thin armor that is surprisingly good at withstanding blunt force.");
				currentroom = 9;
			}
		}

		else if (currentroom == 10)
		{
			if (move == 1)
			{
				System.out.println("There is no room to move forward to.");
				currentroom = 10;
			}

			else if (move == 2)
			{
				System.out.println("There is no room to move back to.");
				currentroom = 10;
			}

			else if (move == 3)
			{
				System.out.println("There is no room to move left to.");
				currentroom = 10;
			}

			else if (move == 4)
			{
				System.out.println("There is no room to move right to.");
				currentroom = 10;
			}

			else if (move == 5)
			{
				System.out.println("You climb up the ladder and enter the troll room.");
				currentroom = 9;
			}

			else if (move == 6)
			{
				System.out.println("There is nothing to attack.");
				currentroom = 10;
			}

			else if (move == 7)
			{
				System.out.println("You picked up the key.  There is not much to the room other than 25 barrels of carrot brewed ale. There is a ladder that can send you up to the troll room.");
				currentroom = 10;
			}
		}

		else if (currentroom == 11)
		{
			if (move == 1)
			{
				System.out.println("You charge straight at the bunny. He sticks out his carrot lance and you impale yourself with it.  You failed to save the princess.");
				ending = true;
			}

			else if (move == 2)
			{
				System.out.println("You try to run back out but its too late. The doors quickly shut before you could make it out.");
				currentroom = 11;
			}

			else if (move == 3)
			{
				System.out.println("You attempt to dodge the bunny's attack. It does not go well");
				ending = true;
			}

			else if (move == 4)
			{
				System.out.println("You attempt to dodge the bunny's attack. It does not go well.");
				ending = true;
			}

			else if (move == 5)
			{
				System.out.println("You attempt to climb onto the throne.  The bunny defends it by stabbing you with carrots.");
				ending = true;
			}

			else if (move == 6)
			{
				System.out.println("You attempt to take out all of your weapons but when you touch them you realize they turned to carrots.  All you have left is the toothpick with an olive on it.  The bunny sees it and you hear his stomach growl.  He hops towards you and snatches it out of your hands and swallows it whole.  The fool did not even take the olive off of the toothpick or even think to take your carrot turned weapons instead.  He chokes on the tootpick and dies an anticlimatic death.  You then free the princess from the cage and escort her home.  The king is pleased with your actions and grants you the title of lord.");
				ending = true;
			}

			else if (move == 7)
			{
				System.out.println("The room is silent. You hear a faint growling and you believe that its comming from the bunny's stomach.");
				currentroom = 11;
			}
		}}}			









