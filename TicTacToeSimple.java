import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class TicTacToeSimple {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Willkommen bei TicTacToeSimple.");
		System.out.println("Es handelt sich um ein Spiel für 2 Spieler.");
		System.out.println("Ziel ist, in einem 3x3-Feld in einer Reihe, einer Spalte oder"
				+ "\n einer Diagonale das eigene Zeichen gesetzt zu haben.");
		System.out.println("Spieler 1 bekommt Symbol X, Spieler 2 das Symbol O."); 
		System.out.println();
		System.out.println("Das Spielfeld sieht aktuell wie folgt aus:\n\n");
		
		String[][] arr = new String[][] {{"*","*" ,"*"}, {"*", "*", "*"}, {"*", "*", "*"}};
		

		for(String[] str : arr) {
			for(String s  : str) {
				System.out.print(s + " ");
			}
			System.out.println("");
		}
		
		
		// Erster Zug Spieler X
		
		System.out.println("\n");
		System.out.println("Spieler X ist an der Reihe.");
		System.out.println("Wähle eine Reihe aus (oben= 0, mitte = 1 und unten= 2).");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String reihe = br.readLine();
		System.out.println("Wähle eine Spalte aus (links = 0, mitte = 1 und rechts= 2");
		String spalte = br.readLine();
		
		try {
			int rh = Integer.parseInt(reihe);
			int sp = Integer.parseInt(spalte);
			
			if(rh>=0 && rh<=2 && sp>=0 && sp<=2) {
				if(arr[rh][sp].equals("*")) {
					arr[rh][sp] = "X";
				}
			} else {
				System.out.println("Falsche Eingabe!");
			}
			
		} catch (Exception e){
			System.out.println("Falsche Eingabe");
		}
		
		for(String[] str : arr) {
			for(String s  : str) {
				System.out.print(s + " ");
			}
			System.out.println("");
		}
		

		//Die restlichen Züge von Spieler O und Spieler X
		
		//pro folgendem Durchgang darf jeder Spieler einmal setzen.
		int durchgang = 4;
		
		while(durchgang > 0) {
			
			durchgang--;
			System.out.println("\n");
			System.out.println("Spieler O ist an der Reihe.");
			System.out.println("Wähle eine Reihe aus (oben= 0, mitte = 1 und unten= 2).");
			
			reihe = br.readLine();
			System.out.println("Wähle eine Spalte aus (links = 0, mitte = 1 und rechts= 2");
			spalte = br.readLine();
			
			try {
				int rh = Integer.parseInt(reihe);
				int sp = Integer.parseInt(spalte);
				
				if(rh>=0 && rh<=2 && sp>=0 && sp<=2) {
					if(arr[rh][sp].equals("*")) {
						arr[rh][sp] = "O";
					}
				} else {
					System.out.println("Falsche Eingabe!");
				}
				
			} catch (Exception e){
				System.out.println("Falsche Eingabe");
			}
			
			for(String[] str : arr) {
				for(String s  : str) {
					System.out.print(s + " ");
				}
				System.out.println("");
			}
			
			if(arr[0][0].equals(arr[0][1]) && arr[0][0].equals(arr[0][2]) && !arr[0][0].equals("*")) {
				System.out.println("\nSpieler " + arr[0][0] + " hat gewonnen.");
				break;
			} else if(arr[1][0].equals(arr[1][1]) && arr[1][0].equals(arr[1][2]) && !arr[1][0].equals("*")) {
				System.out.println("\nSpieler " + arr[1][0] + " hat gewonnen.");
				break;
			} else if(arr[2][0].equals(arr[2][1]) && arr[2][0].equals(arr[2][2]) && !arr[2][0].equals("*")) {
				System.out.println("\nSpieler " + arr[2][0] + " hat gewonnen.");
				break;
			} else if(arr[0][0].equals(arr[1][0]) && arr[0][0].equals(arr[2][0]) && !arr[0][0].equals("*")) {
				System.out.println("\nSpieler " + arr[0][0] + " hat gewonnen.");
				break;
			} else if(arr[0][1].equals(arr[1][1]) && arr[0][1].equals(arr[0][2]) && !arr[0][1].equals("*")) {
				System.out.println("\nSpieler " + arr[0][1] + " hat gewonnen.");
				break;
			} else if(arr[0][2].equals(arr[1][2]) && arr[0][2].equals(arr[2][2]) && !arr[0][2].equals("*")) {
				System.out.println("\nSpieler " + arr[0][2] + " hat gewonnen.");
				break;
			} else if(arr[0][0].equals(arr[1][1]) && arr[0][0].equals(arr[2][2]) && !arr[0][0].equals("*")) {
				System.out.println("\nSpieler " + arr[0][0] + " hat gewonnen.");
				break;
			} else if(arr[0][2].equals(arr[1][1]) && arr[0][2].equals(arr[2][0]) && !arr[0][2].equals("*")) {
				System.out.println("\nSpieler " + arr[0][2] + " hat gewonnen.");
				break;
			} 
			
			
			System.out.println("\n");
			System.out.println("Spieler X ist an der Reihe.");
			System.out.println("Wähle eine Reihe aus (oben= 0, mitte = 1 und unten= 2).");
			
			reihe = br.readLine();
			System.out.println("Wähle eine Spalte aus (links = 0, mitte = 1 und rechts= 2");
			spalte = br.readLine();
			
			try {
				int rh = Integer.parseInt(reihe);
				int sp = Integer.parseInt(spalte);
				
				if(rh>=0 && rh<=2 && sp>=0 && sp<=2) {
					if(arr[rh][sp].equals("*")) {
						arr[rh][sp] = "X";
					}
				} else {
					System.out.println("Falsche Eingabe!");
				}
				
			} catch (Exception e){
				System.out.println("Falsche Eingabe!");
			}
			
			for(String[] str : arr) {
				for(String s  : str) {
					System.out.print(s + " ");
				}
				System.out.println("");
			}

			if(arr[0][0].equals(arr[0][1]) && arr[0][0].equals(arr[0][2]) && !arr[0][0].equals("*")) {
				System.out.println("\nSpieler " + arr[0][0] + " hat gewonnen.");
				break;
			} else if(arr[1][0].equals(arr[1][1]) && arr[1][0].equals(arr[1][2]) && !arr[1][0].equals("*")) {
				System.out.println("\nSpieler " + arr[1][0] + " hat gewonnen.");
				break;
			} else if(arr[2][0].equals(arr[2][1]) && arr[2][0].equals(arr[2][2]) && !arr[2][0].equals("*")) {
				System.out.println("\nSpieler " + arr[2][0] + " hat gewonnen.");
				break;
			} else if(arr[0][0].equals(arr[1][0]) && arr[0][0].equals(arr[2][0]) && !arr[0][0].equals("*")) {
				System.out.println("\nSpieler " + arr[0][0] + " hat gewonnen.");
				break;
			} else if(arr[0][1].equals(arr[1][1]) && arr[0][1].equals(arr[0][2]) && !arr[0][1].equals("*")) {
				System.out.println("\nSpieler " + arr[0][1] + " hat gewonnen.");
				break;
			} else if(arr[0][2].equals(arr[1][2]) && arr[0][2].equals(arr[2][2]) && !arr[0][2].equals("*")) {
				System.out.println("\nSpieler " + arr[0][2] + " hat gewonnen.");
				break;
			} else if(arr[0][0].equals(arr[1][1]) && arr[0][0].equals(arr[2][2]) && !arr[0][0].equals("*")) {
				System.out.println("\nSpieler " + arr[0][0] + " hat gewonnen.");
				break;
			} else if(arr[0][2].equals(arr[1][1]) && arr[0][2].equals(arr[2][0]) && !arr[0][2].equals("*")) {
				System.out.println("\nSpieler " + arr[0][2] + " hat gewonnen.");
				break;
			} 
			
			if(durchgang == 0) {
				System.out.println("Unentschieden.");
			}
			
		}
		
		
		
		
		System.out.println("\n ***Ende des Spiels***");
		
	}

}
