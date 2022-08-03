import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int numberOfRow = sc.nextInt();
	int numberOfColumn = sc.nextInt();
	String commandString = sc.next();
	int xi = 0; //xi denotes the initial x-cordinate means column number of robot.
	int yi = 0; //yi denotes the initial y-cordinate means row number of robot.
	char di = 'S'; // di denotes the initial direction in which robot is facing which is initially South.
	for(int i=0;i<commandString.length();i++){
		char c = commandString.charAt(i);
		if(c == 'M'){  // If in command string if there is command for movement which is hera M then this part of code is Executed.
			if(di == 'S' && yi<numberOfRow-1){
				yi++;
			}
			else if(di == 'N' && yi>0){
				yi--;
			}
			else if(di == 'E' && xi<numberOfColumn-1){
				xi++;
			}
			else if(di == 'W' && yi>0){
				xi--;
			}
		}
		else{ // If in command string if there is command for change the direction of robot facing i.e(N,S,E,W) then this part of code Executed.
			if(c == 'S' && di != 'S'){
				di = c;
			}
			else if(c == 'N' && di != 'N'){
				di = c;
			}
			else if(c == 'E' && di != 'E'){
				di = c;
			}
			else if(c == 'W' && di != 'W'){
				di = c;
			}
		}
	}
	/* After all the command of commandString is done then the position of robot i.e xi which denotes column number
		yi which denotes row number and di which is the direction to which robot is facing we have to print*/
	System.out.println("("+yi+","+xi+","+di+")");
    }
}
