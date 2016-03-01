import java.util.*;
public class Blackjack{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);


		int i,num,num2; 
		int [] numbers = new int [10]; 
		String [] color = new String [2]; 
		

		//numbers 
		numbers[0]= 1;
		for( i = 1; i<numbers.length; i++){
			numbers[i] = i; 
		}
		//colors
		color[0] = "Red"; 
		color[1] = "black"; 
		
	 

		//_______________________________________________________Actual Game________________________________________________________//

		System.out.println("***************** Welcome to BlackJack **********************"); 


		System.out.println("Please choose from the menu below: "); 
		System.out.println("1. two players"); 

		int choice = sc.nextInt(); 
		
		//******************Player One**************************
		
		while (choice != 1){
			System.out.println("Invalid choice: "); 

			System.out.println("Please Choose From The Menu Below: "); 
			System.out.println("1. two players"); 
			choice = sc.nextInt(); 

		}
		// First two Cards Drawn
		int value = 0;
		if(choice == 1){
			System.out.println(" first two cards."); 
			System.out.println("Player One" +"\n" );

			for( i= 0; i<2; i++){
				num = gennum(numbers); 
				String col = gencolor(color); 
				


				Cards  card = new Cards(col,num); 
				
				if(card.value == 10){
					System.out.println( "--------");
					System.out.println("|  " + card.color + "  |");  
					System.out.println("|  " + card.value +"  |");
					System.out.println("---------" +"\n");
					
				}else{
					System.out.println( "--------");
					System.out.println("|  " + card.color + "  |"); 
					System.out.println("|  " + card.value + "    |"); 
					System.out.println("---------" +"\n");
					 
				}
				
				value = value + card.value; 
				System.out.println("Value: " + value); 
			}

			// Drawing cards after the first two cards
			while(value != 21){
		
					if(value<21){
						System.out.println("You did not Reach 21 yet, What Do You Want to do?"); 
						System.out.println("1. Hit" + "\n" + "2. Stand" + "\n"); 
						System.out.println("choose 1 or 2");
						int choice2 = sc.nextInt(); 
						//Drawing cards after first two	
						while(choice2 != 1 && choice2 != 2){
							System.out.println("Invalid Input"); 
							System.out.println("You did not Reach 21 yet, What Do You Want to do?"); 
							System.out.println("1. Hit" + "\n" + "2. Stand" + "\n"); 
							System.out.println("choose 1 or 2");
							choice2 = sc.nextInt(); 
						}
						if(choice2 ==1){
							
							num = gennum(numbers); 
							String col = gencolor(color); 
							 
							Cards  card = new Cards(col,num); 
							if(card.value == 10){
								System.out.println( "--------");
								System.out.println("|  " + card.color + "  |"); 
								
								System.out.println("---------" +"\n");

							}else if(card.value == 11){

								 
								System.out.println( "--------");
								System.out.println("|  " + card.color + "  |"); 
								System.out.println("|  " + card.value + "    |"); 
								
								System.out.println("---------" +"\n");
							}else{
								System.out.println( "--------");
								System.out.println("|  " + card.color + "  |"); 
								System.out.println("|  " + card.value + "    |"); 
								System.out.println("---------" +"\n");

								value += card.value; 
								System.out.println("Value: " + value);
							}
						}else if(choice2 == 2){
							break; 
						}
					}else if (value > 21 ){
						System.out.println("You Are Busted, Player Two Won");
							return; 
					}
					if(value == 21){
						System.out.println("You got a BLACKJACK, WOOOHT WOOOHT, YOU WON!"); 
						return; 

					}
			}

			//  ********************* PLAYER TWO ************************//

			int value2 = 0; 
			System.out.println("_____________________________________________________________" + "\n"); 
			System.out.println("Player Two" + "\n"); 


			if(choice == 1){
				System.out.println(" first two cards."); 
				

				for( i= 0; i<2; i++){
					num = gennum(numbers); 
					String col = gencolor(color); 
					


					Cards  card = new Cards(col,num); 
					if(card.value == 10){
						System.out.println( "--------");
						System.out.println("|  " + card.color + "  |"); 
						System.out.println("|  " + card.value + "  |");
						 
						System.out.println("---------" +"\n");

					}else if(card.value == 11){
						 
						System.out.println( "--------");
						System.out.println("|  " + card.color + "  |"); 
						System.out.println("|  " + card.value + "    |"); 
						//System.out.println("|  " + card.suit + " |"); 
						System.out.println("---------" +"\n");
					}else{
						System.out.println( "--------");
						System.out.println("|  " + card.color + "  |"); 
						System.out.println("|  " + card.value + "    |"); 
						System.out.println("---------" +"\n");

					}

					value2 += card.value; 
					System.out.println("Value: " + value2); 
				}

				// Drawing cards after the first two cards
				while(value2 != 21){
					/*if(value2 == 21){
						System.out.println("You got a BLACKJACK, WOOOHT WOOOHT, YOU WON!"); 
						return; 

					}*/
					if( value2 > 21 ){
						System.out.println("Busted, Player One wins"); 
						return; 
					}
					if(value2 < 21){
						System.out.println("you did not reach 21 yet, What Do You Want to do?"); 
					System.out.println("1. Hit" + "\n" + "2. Stand" + "\n"); 
					System.out.println("choose 1 or 2");
					int choice2 = sc.nextInt(); 
					//Drawing cards after first two	
					if(choice2 ==1){
					num = gennum(numbers); 
					String col = gencolor(color); 
					//String suit = gensuit(suits); 
					Cards  card = new Cards(col,num); 
					if(card.value == 10){
						System.out.println( "--------");
						System.out.println("|  " + card.color + "  |"); 
						System.out.println("|  " + card.value + "  |"); 
						//System.out.println("|  " + card.suit + " |"); 
						System.out.println("---------" +"\n");

					}else if(card.value == 11){

						//card.suit = "Ace"; 
						System.out.println( "--------");
						System.out.println("|  " + card.color + "  |"); 
						System.out.println("|  " + card.value + "    |"); 
					//	System.out.println("|  " + card.suit + " |"); 
						System.out.println("---------" +"\n");
					}else{
						System.out.println( "--------");
						System.out.println("|  " + card.color + "  |"); 
						System.out.println("|  " + card.value + "    |"); 
						System.out.println("---------" +"\n");

					}
					value2 += card.value; 
					System.out.println("Value: " + value2);
					}else if(choice2 == 2){
						String result = whowon(value, value2);
						System.out.println(result); 
						return; 
					} 
				}if(value2 == 21){
					System.out.println("You got a BLACKJACK, WOOOHT WOOOHT, YOU WON!"); 
					return;
				}
			}
		}
		}
	}


	public static int gennum(int [] numbers){

		Random genn = new Random (); 
		int num = genn.nextInt(numbers.length) + 1;

		return num; 
	}

	public static String gencolor (String[] color){

		int i = (int) (Math.random()*2);
		String col = color[i]; 
		return col; 
	}
	
	public static String whowon(int value, int value2 ){
		if(value > value2){
			return "Player One Won "; 
		}else if(value2 < value){
			return " Player Two Won"; 
		}else{
			return "Draw, No one Wins" ;
		}
	}
}
