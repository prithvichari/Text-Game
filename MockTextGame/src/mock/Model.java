package mock;

public class Model extends AbstractClass{

	String name;
	String[] rooms = new String[12];

	boolean shortsword = true;
	boolean mace = false;
	boolean greatsword = false;
	boolean key = false;
	boolean toothpick = false;
	boolean troll = true;
	boolean ogre = true;
	static boolean ending = false;
	
	// Require Enemy boolean

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
				System.out.println("You walked down the long hallway. At the end you see a door on your left and right. \n"
						+ "In front of you is this grand door decorated with priceless gems. This has to be the Bunnys Lair for sure!");
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
					currentroom = 1;
				}

				else if (key == true)
				{
					System.out.println("You unlock the door with your key and enter the room.  Inside is an ogre ready to attack!");
					currentroom = 3;
				}
			}

			else if (move == 4)
			{
				if (greatsword == false)
				{ 
				System.out.println("You enter the room on the right.  On a weapon stand you see a greatsword. You pick it up and add it to your collection of weapons. \n"
						+ "You notice a ladder in the corner going to a lower level, maybe it is time to explore?");
				currentroom = 5;
				greatsword = true;
			    }
				else
				System.out.println("You enter the room on the right. The weapon stand is now empty. \n"
						+ "There is a ladder in the corner of the room going to a lower level, maybe it is time to explore?"); 
				currentroom = 5; 
			}

			else if (move == 5)
			{
				System.out.println("There is nothing the climb here, unless you want to climb the moss but there is doubt it could hold your weight.");
				currentroom = 1;
			}

			else if (move == 6)
			{
				System.out.println("There is nothing to attack in the hallway.");
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
					System.out.println("You hear gears vigorously grinding as the door slowly opens. \n"
							+ "You walk right in and see the Malicious Bunny of Malthor sitting on his throne with a peeved yet expectant look in his face. \n"
							+ "In the corner you see the princess in a cage fit for a dog. You ready your weapons, but then think about the toothpick with the olive...");
					currentroom = 11;
				}

				else
				{
					System.out.println("You hear gears vigorously grinding as the door slowly opens. \n"
							+ "You walk right in and see the Malicious Bunny of Malthor sitting on his throne with a peeved yet expectant look in his face. \n"
							+ "In the corner you see the princess in a cage fit for a dog. You ready your weapons.");
					currentroom = 11;
				}
			}

			else if (move == 2)
			{
				System.out.println("You are back at the beginning of the hallway near the entrance. There is a door to the left and right of you.  You can also move forward back down the hallway.");
				currentroom = 1;
			}

			else if (move == 3)
			{
				if (mace == false)
				{
				System.out.println("You enter the room on your left. On the wall there is a mace hanging. You take it off and add it to your collection. \n"
						+ "Doing so opens a trapdoor in the corner of the room with a ladder going down. Maybe something is down there?");
				currentroom = 7;
				mace = true;
				}
				else
					System.out.println("You enter the room on your left. On the wall is the hook the mace hung from. \n"
							+ "There is a ladder in the corner of the room going down.");
				currentroom = 7;
			}

			else if (move == 4)
			{
				System.out.println("You enter the room on your right. Inside is a Troll standing there picking its nose.");
				currentroom = 9;
			}

			else if (move == 5)
			{
				System.out.println("You make an attempt to climb a statue in the room, instead you fall over.");
				currentroom = 2;
			}

			else if (move == 6)
			{
				System.out.println("You attack a bunny statue trying to practice! I guess it makes you feel better?");
				currentroom = 2;
			}

			else if (move == 7)
			{
				System.out.println("This end of the hallway is more dimly lit than the beginning. Statues of the bunny line the sides. \n"
						+ "There is a door to your left and right; both unlocked.  \n"
						+ "There is a grand door in front of you, likely the Bunnys Lair...");
				currentroom = 2;
			}
		}

		else if (currentroom == 3) //Room1
		{
			if (move == 1)
			{
				if (ogre == true)
				{
				System.out.println("You walk right into the Ogre. It didn't like that very much. \n"
						+ "So it bashes your head in with it's giant club. That was the end of you.");
				ending = true;
				}
				else
				{
					System.out.println("You walk over the corpse of the Ogre. Yet that gets you nowhere.");
				currentroom = 3;
				}
			}

			else if (move == 2)
			{
				if (ogre == true)
				{
				System.out.println("The Ogre did not think it was time for you to leave yet, it grabs you and screams before pummeling you with its club. \n"
						+ "Apparently it is very rude to try to walk away from an Ogre ready for battle! You should remember that next time!");
				ending = true;
				}
				else
				{
				System.out.println("You are back in the hallway. There is a room to the left and right of you. \n"
						+ "You can also walk further down the hallway or move back to go back to the entrance.");
				currentroom = 1;
				}

			}

			else if (move == 3)
			{
				if (ogre == true)
				{
				System.out.println("You think maybe you can dodge to the left! But that only delays the inevitable. \n"
						+ "The Ogre isn't happy that you did that, and smashes you into the ground with its club! \n"
						+ "Looks like you'll be pushing up the daisies from now on.");
				ending = true;
				}
				else
				{
				System.out.println("You walk to the left and stare at a wall, then think to yourself, why?");
				currentroom = 3;
				}

			}

			else if (move == 4)
			{
				if (ogre == true)
				{
				System.out.println("You think maybe you can dodge to the right! But that only delays the inevitable. \n"
						+ "The Ogre isn't happy that you did that, and smashes you into the ground with its club! \n"
						+ "Looks like you'll be pushing up the daisies from now on.");
				ending = true;
				}
				else
				System.out.println("You thought that maybe there could be a room to the right if you thought hard enough!\n"
						+ "But it didn't work.");
				currentroom = 3;

			}

			else if (move == 5)
			{
				if (ogre == true)
				{
					System.out.println("You pretend the Ogre just didn't exist and wanted to climb the ladder. \n"
							+ "The Ogre isn't happy that you ignored its presense and is highly offended! \n"
							+ "You don't last long against its multitude of attacks, don't be such a jerk next time!");
					ending = true;
					}
				else
					if (toothpick == false)
				{
				System.out.println("You climb down the ladder into the basement below the Ogre's room. The basement is filled with piles of trash, yet there is something else here. \n"
						+ "For some reason you feel inclined to pick up a toothpick with an olive on it. It has been added to your inventory.");
				toothpick = true;
				currentroom = 4;
				}
					else
					{
						System.out.println("You climb down the ladder and enter the trash basement again.");
						currentroom = 4;
					}
			}

			else if (move == 6)
			{
				if (mace == true)
				{
					System.out.println("You deftly attack the Ogre with your mace! Its armor crumbles more and more with each hit until it's nearly naked! \n"
							+ "Eventually you do enough blunt damage to kill it, or it dies of complete embarrassment. \n"
							+ "Either way, his death allows you to access the ladder he was guarding.");
					ogre = false;
					currentroom = 3;

				}

				else 
				{
					System.out.println("You attack the Ogre with every weapon you have! But unfortunately he does not look to be receiving any damage at all. \n"
							+ "He swings his club and it hits you right in the chest killing you. You become a nice mantlepiece over the Ogre's fireplace. \n"
							+ "Due to your failure, the Princess was forced to marry the Bunny!.");
					ending = true;
				}
			}

			else if (move == 7)
			{
				System.out.println("Why, it's the Beastly Ogre of Matidaconk Swap! He's is wearing full armor. \n"
						+ "It's so thick that slicing at it with any sword will not work. \n"
						+ "Perhaps there is a weapon that can do more of a blunt attack?");
				currentroom = 3;
			}
		}

		else if (currentroom == 4) //Room1A
		{
			if (move == 1)
			{
				System.out.println("You climb over the trash and only encounter a wall in front of you.");
				currentroom = 4;
			}

			else if (move == 2)
			{
				System.out.println("You climb over garbage and end up facing a wall to your behind you.");
				currentroom = 4;
			}

			else if (move == 3)
			{
				System.out.println("You climb over trash to your left, and only end up smelling bad.");
				currentroom = 4;
			}

			else if (move == 4)
			{
				System.out.println("Climbing over trash must be fun, because that is all you accomplish.");
				currentroom = 4;
			}

			else if (move == 5)
			{
				System.out.println("You climb back up the ladder and stand over the ogre's dead corpse. You can climb the ladder or move back to enter the hallway.");
				currentroom = 3;
			}

			else if (move == 6)
			{
				System.out.println("You could attack the trash if you wanted to, but you'd get nothing done!");
				currentroom = 4;
			}

			else if (move == 7)
			{
				System.out.println("There is nothing but garbage everywhere. There is a ladder leading back to the room where you fought the ogre.");
				currentroom = 4;
			}
		}

		else if (currentroom == 5) //Room 2
		{
			if (move == 1)
			{
				System.out.println("There is no room to move forward to, so you walk into a wall. Good going champ!");
				currentroom = 5;
			}

			else if (move == 2)
			{
				System.out.println("You are back in the hallway. There is a room to your left and right.  You can also move forward down the hallway or back to the entrance.");
				currentroom = 1;
			}

			else if (move == 3)
			{
				System.out.println("You decide the wall to your left was not there, and bash yourself into it. The spiders on the wall question your intelligence.");
				currentroom = 5;
			}

			else if (move == 4)
			{
				System.out.println("Since there was no room to your right, you leave an impression of yourself in the moss where you walked into the wall.");
				currentroom = 5;
			}

			else if (move == 5)
			{
				System.out.println("You climb down the ladder, it breaks as you climb down! You walk into the dark dank room until you step on a pressure plate. \n"
						+ "The walls then start rumbling and closing in on you! You desparately claw at the walls and wail in horror! \n"
						+ "As you became a lot more thinner, the last thought that runs through your mind is, \n"
						+ "'Drats! I don't think the armoror is going to accept the warranty on my armor anymore.'\n"
						+ "The walls finish closing in and that's the closing of your story.");
				ending = true;
			}

			else if (move == 6)
			{
				System.out.println("You swing your weapon madly into the air! That'll teach that air who is boss.");
				currentroom = 5;
			}

			else if (move == 7)
			{
				System.out.println("There is a hole with a ladder that leads down to the basement. You can also move back through the door to go to the hallway.");
				currentroom = 5;
			}
		}

		else if (currentroom == 7) //Room 3
		{
			if (move == 1)
			{
				System.out.println("You walk into a wall, some would question your intelligence for doing this.");
				currentroom = 7;
			}

			else if (move == 2)
			{
				System.out.println("You go back out into the hallway.  There is a door to your left and right.  There is the grand door in front of you.");
				currentroom = 2;
			}

			else if (move == 3)
			{
				System.out.println("You attempt to walk to your left into the wall, but somehow you stop yourself from doing so.");
				currentroom = 7;
			}

			else if (move == 4)
			{
				System.out.println("To your right is a wall, the wall practically glares at you as you almost walk into it...");
				currentroom = 7;
			}

			else if (move == 5)
			{
				System.out.println("You climb down the unassuming ladder and step onto the pressure plate. \n"
						+ "The entrance shuts and hundreds of venomous bunnies appear out of the holes in the walls! \n"
						+ "Why did it have to be venomous bunnies!? \n"
						+ "Your cries of agony are drowned out by hundreds of squeaking bunnies as they continuously attack you. \n"
						+ "What a way to go.");
				ending = true;
			}

			else if (move == 6)
			{
				System.out.println("You swing the mace around at enemies you pretend to exist! Ha! Take that imaginary enemies! \n"
						+ "The Kingdom of Nalastor is really scraping the barrel when it comes to knights these days...");
				currentroom = 7;
			}

			else if (move == 7)
			{
				System.out.println("The rack is now empty since you took the mace. There is a ladder that leads to the basement. You can also go back into the hallway.");
				currentroom = 7;
			}
		}

		else if (currentroom == 9) //Room 4
		{
			if (move == 1)
			{
				if (troll == true)
				{
					System.out.println("You walk forward, the troll just lazily sticks out its spear as you walk right into it. \n"
							+ "As you impale yourself on the spear, you realize that maybe you should make better decisions. \n"
							+ "Unforunately, that was the last decision you'll ever make!");
					ending = true;
					}
				else
				{
				System.out.println("You walk into the wall behind the dead troll, it was highly productive! \n"
						+ "Not.");
				currentroom = 9;
				}
			}

			else if (move == 2)
			{
				if (troll == true)
				{
					System.out.println("Normally, a troll wouldn't like it's enemy just walking away from him. \n"
							+ "But in this instance he is being lazy and just lets you walk back into the hallway.");
					currentroom = 2;
					}
				else
				{
				System.out.println("You move back out into the hallway. There is a door to your left and right. There is also that Grand Door in front of you.");
				currentroom = 2;
				}
			}

			else if (move == 3)
			{
				if (troll == true)
				{
					System.out.println("You try to walk to the left of the troll. \n"
							+ "But this enrages it! \n"
							+ "It is apparently the greatest offense ever to walk to the left of a troll in its culture! \n"
							+ "It stabs you several times with its spear! It grunts at you before you expire, thus ending your quest.");
					ending = true;
				}
				else
				{
				System.out.println("Perhaps you wanted to walk left into that wall, but you aren't intangible, therefore you bump into it.");
				currentroom = 9;
				}
			}

			else if (move == 4)
			{
				if (troll == true)
				{
					System.out.println("You walk to the right of the troll, but it merely stops you from going any further by pushing you away with its spear.");
					currentroom =  9;
				}
				else
				{
				System.out.println("The right wall doesn't quite like that you walked into it, but there was nothing it could do about it.");
				currentroom =  9;
				}
			}

			else if (move == 5)
			{
				
				if (troll == true)
				{
					System.out.println("Any attempts to climb the ladder behind the troll are met wish pushes and shoves. \n"
							+ "Apparently it does not want you to go down there.");
				currentroom =  9;
				}
				else
					if (key == false)
				{
				System.out.println("You climb down the ladder and enter the basement. You notice a key rack on the wall. You pick up the key it holds.");
				currentroom = 10;
				key = true;}
					else 
					{
						System.out.println("You climb down the ladder and enter the basement again.");
						currentroom = 10;
					}
			}

			else if (move == 6)
			{
				if (greatsword == true)
				{
					System.out.println("You swing the greatsword at the troll and break its spear! You cleanly cut into its flesh! \n"
							+ "The Troll wails in agony and dies from its wounds, leaving you alone in the room.");
					troll = false;
					currentroom = 9;				
				}
				else
				{
					System.out.println("You can't seem to get close enough to the troll! \n"
							+ "It manages to find a weak spot in your armor between your head and chest and stabs you in the neck! \n"
							+ "It appears your journey ends here and your head becomes the trolls trophy for its home. \n"
							+ "You have failed to save the Princess.");
					ending = true;
				}
			}

			else if (move == 7)
			{
				System.out.println("Great Scott! It's the Grand Troll of Enkingdon! It has paper thin armor, yet he seems quite agile and has a spear. \n"
						+ "Perhaps a longer weapon would be useful here?");
				currentroom = 9;
			}
		}

		else if (currentroom == 10)
		{
			if (move == 1)
			{
				System.out.println("You forget that this is a basement with a ladder and walk into the wall in front of you.");
				currentroom = 10;
			}

			else if (move == 2)
			{
				System.out.println("You trip and fall backwards over a barrel of carrot ale!");
				currentroom = 10;
			}

			else if (move == 3)
			{
				System.out.println("Are you sure you want to move to the left? There is a wall there.");
				currentroom = 10;
			}

			else if (move == 4)
			{
				System.out.println("While it would be nice if there was something to your right to move into besides a wall, there appears to be only a wall.");
				currentroom = 10;
			}

			else if (move == 5)
			{
				System.out.println("You climb up the ladder and enter the deceased troll room.");
				currentroom = 9;
			}

			else if (move == 6)
			{
				System.out.println("You arm yourself with the key and swing it around! This accomplishes nothing.");
				currentroom = 10;
			}

			else if (move == 7)
			{
				System.out.println("You picked up the key.  There is not much to the room other than 25 barrels of carrot brewed ale. \n"
						+ "There is a ladder that can send you up to the troll room.");
				currentroom = 10;
			}
		}

		else if (currentroom == 11)
		{
			if (move == 1)
			{
				System.out.println("You charge straight at the bunny! It doesn't appreciate that very much and does the same to you! Except, it is much faster. \n"
						+ "It instantly grabs at your neck and cuts your juggular with much skill. You would comment on how well \n"
						+ "the rabbit has fought, except that you instantly bleed to death! You failed to save the princess in this instance. \n"
						+ "Your corpse is hung up at the entrance with the rest of your comrades.");
				ending = true;
			}

			else if (move == 2)
			{
				System.out.println("You try to run back out but its too late. The doors quickly shut before you could make it out! \n"
						+ "The bunny laughs at you with high pitched squeaking.");
				currentroom = 11;
			}

			else if (move == 3)
			{
				System.out.println("You attempt to dodge the bunny's attack to the left!!! It does not go well for you. \n"
						+ "As you are nibbled upon by the bunnys quick attacks, you eventually succumb to your wounds. \n"
						+ "The bunny has Human Stew tonight.");
				ending = true;
			}

			else if (move == 4)
			{
				
				System.out.println("You attempt to dodge the bunny's attack to the right!!! It does not go very well as you trip on someones bone! \n"
						+ "The bunny bears down upon you as you shriek like a little girl. Luckily for you, your humiliation is quickly put \n"
						+ "to an end by the Maliciuous Bunny. ");
				ending = true;
			}

			else if (move == 5)
			{
				System.out.println("You attempt to climb onto the throne like some maniac. The bunny is quite perturbed by your strange behavior and \n"
						+ "decides that you shouldn't exist anymore, you are dispatched and destroyed by the Malicious Bunny like some pest.");
				ending = true;
			}

			else if (move == 6)
			{
				if (toothpick == true)
				{
				System.out.println("You attempt to take out all of your weapons but when you touch them you realize they turned to carrots. \n"
						+ "All you have left is the toothpick with an olive on it! You toss it out there in a last ditch effort! \n"
						+ "The bunny sees it and you hear his stomach growl. Apparently it was his favorite brand of olive! \n"
						+ "He hops towards you and snatches it from the ground! \n"
						+ "The foolish bunny did not even take the olive off of the toothpick or even think to take your carrot turned weapons instead. \n"
						+ "He chokes on the tootpick and dies a rather anticlimatic death. \n"
						+ "You then free the princess from the cage and escort her home. \n"
						+ "The king is pleased with your actions and grants you the Title of Lord for your Lands.");
				
				System.out.println(" ");
				System.out.println("You won! You defeated the Malicious Bunny of Malathor and saved the Princess!");
				ending = true;
				}
				if (toothpick == false)
				System.out.println("You attempt to take out all of your weapons but when you touch them you realize they turned to carrots. \n"
						+ "By the time your attack is finished, the Malicious Bunny is already nibbling on the bones of your corpse.");
				ending = true;
			}

			else if (move == 7)
			{
				System.out.println("The room is silent. All you can see is the Princess and the Malicious Bunny of Malathor. \n"
						+ "You hear a faint growling and you believe that its coming from the bunny's stomach.");
				currentroom = 11;
			}
		}}}			









