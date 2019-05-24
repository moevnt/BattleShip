
public class Maps<AnyType extends Comparable>{ //creates the maps used to play the game

	public static boolean  myShip[][]=new boolean[10][10]; //where player ships are
	public static boolean yourShip[][] = new boolean[10][10]; //where computer ships are
	public static boolean myHits[][] = new boolean[10][10]; //where player attacks
	public boolean opponentHits[][] = new boolean[10][10]; //where computer attacks

	public Maps(){
	}

	public void placeShips(Ship currentShip){
		placeShips(currentShip,myShip);
	}

	public static void placeShips(Ship currentShip,boolean[][] shipMap){ //used for direct path for computer to build
		int positionX = currentShip.getPositionX();
		int positionY = currentShip.getPositionY();
		int size = currentShip.Size();

		if(!shipMap[positionY][positionX]){ //if false
			String orientation = currentShip.getOrientation();

			switch(orientation){
				case "NORTH":
					for(int i=0;i<size;i++)
						shipMap[positionX][positionY-i]=true;
					break;
				case "SOUTH":
					for(int i=0;i<size;i++)
						shipMap[positionX][positionY+i]=true;
					break;
				case "EAST":
					for(int i=0;i<size;i++)
						shipMap[positionX+i][positionY]=true;
					break;
				case "WEST":
					for(int i=0;i<size;i++)
						shipMap[positionX-i][positionY]=true;
					break;
			}

		}


	}

	public static Ship[] placeYourShip(Ship[] ships){
		int ran = (int) (Math.random());

		switch (ran){ //10 different ship combinations for the computer to randomly choose
			case 0: {
				Ship carrier = new Ship(5,4,2,"");
				carrier.setOrientation("SOUTH");
				ships[0] = carrier;
				Ship battleship = new Ship(4,3,0,"battleship");
				battleship.setOrientation("EAST");
				ships[1] = battleship;
				Ship cruiser = new Ship(3,5,3);
				cruiser.setOrientation("EAST");
				ships[2] = cruiser;
				Ship submarine = new Ship(3,1,5);
				submarine.setOrientation("SOUTH");
				ships[3] = submarine;
				Ship destroyer = new Ship(2,1,1);
				destroyer.setOrientation("SOUTH");
				ships[4] = destroyer;

				placeShips(carrier,yourShip);
				placeShips(battleship,yourShip);
				placeShips(cruiser,yourShip);
				placeShips(submarine,yourShip);
				placeShips(destroyer,yourShip);
			}



		}

	}

	public boolean attack(int x,int y,Ship[] ship){
		if(yourShip[x][y]){
			myHits[x][y]=true;

			/*increase ship hit
			*how to figure out which ship was hit
			* check if(sunk)
			*/
		}
	}

	public boolean youAttack(Ship[] ships){

	}

	public void display(){
		display(myShip);
	}

	private void display(boolean[][] shipMap){
		System.out.print("  0  1  2  3  4  5  6  7  8  9\n");
		for(int c=0;c<10;c++){
			System.out.print(c);
			for(int r=0;r<10;r++){
				boolean printShip =shipMap[r][c];
				boolean printHit = shipMap[r][c];
				if(printShip) {
					if (printHit)
						System.out.printf("|*|");
					else
						System.out.printf("|+|");
				}
				else
					System.out.printf("| |");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){

	}

}
