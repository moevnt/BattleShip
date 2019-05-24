import java.util.*;

public class client {

	private static Ship[] myShips= new Ship[5];
	private static Ship[] yourShips= new Ship[5];

	public static void main(String[] args){
		//run();

		Scanner scan = new Scanner(System.in);
		System.out.print( "go");
		int one = scan.nextInt();
		int two = scan.nextInt();
		System.out.print(one+two);
	}

	private static void buildGame(Maps map) {
		Scanner scan =new  Scanner(System.in);

			System.out.println("Where would you like to put your carrier? (x value): ");
			int x = scan.nextInt();
			System.out.println("Where would you like to put your carrier? (y value): ");
			int y = scan.nextInt();
			System.out.println("Which direction would yo ulike to place your carrier? (Cardinal directions): ");
			String direction = scan.next().toUpperCase();
			Ship carrier = new Ship(5,x,y,"carrier");
			carrier.setOrientation(direction);
			map.placeShips(carrier);


			System.out.println("Where would you like to put your battleship? (x value): ");
			int Bx = scan.nextInt();
			System.out.println("Where would you like to put your battleship? (y value): ");
			int By = scan.nextInt();
			System.out.println("Which direction would you like to place your battleship? (Cardinal directions): ");
			String Bdirection = scan.next().toUpperCase();
			Ship battleship = new Ship(4,Bx,By,"battleship");
			battleship.setOrientation(Bdirection);
			map.placeShips(battleship);


			System.out.println("Where would you like to put your cruiser? (x value): ");
			int Cx = scan.nextInt();
			System.out.println("Where would you like to put your cruiser? (y value): ");
			int Cy = scan.nextInt();
			System.out.println("Which direction would you like to place your cruiser? (Cardinal directions): ");
			String Cdirection = scan.next().toUpperCase();
			Ship cruiser = new Ship(3,Cx,Cy,"cruiser");
			cruiser.setOrientation(Cdirection);
			map.placeShips(cruiser);


			System.out.println("Where would you like to put your submarine? (x value): ");
			int Sx = scan.nextInt();
			System.out.println("Where would you like to put your submarine? (y value): ");
			int Sy = scan.nextInt();
			System.out.println("Which direction would you like to place your submarine? (Cardinal directions): ");
			String Sdirection = scan.next().toUpperCase();
			Ship submarine = new Ship(3,Sx,Sy,"submarine");
			submarine.setOrientation(Sdirection);
			map.placeShips(submarine);


			System.out.println("Where would you like to put your destroyer? (x value): ");
			int Dx = scan.nextInt();
			System.out.println("Where would you like to put your destroyer? (y value): ");
			int Dy = scan.nextInt();
			System.out.println("Which direction would you like to place your destroyer? (Cardinal directions): ");
			String Ddirection = scan.next().toUpperCase();
			Ship destroyer = new Ship(2,Dx,Dy,"destroyer");
			destroyer.setOrientation(Ddirection);
			map.placeShips(destroyer);

			map.placeYourShip(yourShips);

	}

	private static void playGame(Maps map){
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("Where would you like to attack first? (x *enter* y): ");
			int x=scan.nextInt();
			int y = scan.nextInt();

			map.attack(x,y,yourShips);

			map.youAttack(myShips);
		}
	}



	public static void run(){

		Maps map = new Maps();
		Scanner scan =new  Scanner(System.in);
		System.out.print("Would you like to play a game?: (y/n) ");
		char play = scan.next().charAt(0);

		if(play == 'y') {
			buildGame(map);
			map.display();
			playGame(map);
		}
	}
}

