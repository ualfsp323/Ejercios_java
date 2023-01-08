package org.ip.sesion05;

public class PixelArt {

	public static void main(String[] args) {
		final String PIXEL = " "; 
		// Background
		 final String BLACK_BACKGROUND = "\033[40m"; // BLACK
		 final String RED_BACKGROUND = "\033[41m"; // RED
		 final String GREEN_BACKGROUND = "\033[42m"; // GREEN
		 final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
		 final String BLUE_BACKGROUND = "\033[44m"; // BLUE
		 final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
		 final String CYAN_BACKGROUND = "\033[46m"; // CYAN
		 final String WHITE_BACKGROUND = "\033[47m"; // WHITE
		 final String ORANGE = "\033[48m"; // WHITE
		 // High Intensity backgrounds
		 final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
		 final String RED_BACKGROUND_BRIGHT = "\033[0;101m"; // RED
		 final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
		 final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
		 final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
		 final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
		 final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m"; // CYAN
		 final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m"; // WHITE
		 final int Tamaño = 15; // Máximo 40
		 String [][] emoji = new String[Tamaño][Tamaño];
		// Mostrar emoji

			for (int i=0; i < emoji.length; i++) {
				  for (int j=0; j < emoji[i].length; j++) {	 
					  if (i == 12 && j == 0||(i == 12  && j == 14) ||(i == 13  && j == 1)||(i == 13  && j == 2)||(i == 13  && j == 12)||(i == 13  && j == 13)|| (i == 14  && j == 3) || (i == 14  && j == 4)|| (i == 14  && j == 5)|| (i == 14  && j == 6)|| (i == 14  && j == 7)|| (i == 14  && j == 8)|| (i == 14  && j == 9)|| (i == 14  && j == 10) || (i == 14  && j == 11)|| (i == 11  && j == 1) || (i == 11  && j == 13)  || (i == 11  && j == 7)|| (i == 10  && j == 1) || (i == 10  && j == 13) || (i == 10  && j == 6) || (i == 10  && j == 7) || (i == 10  && j == 8) || (i == 10  && j == 4) || (i == 10  && j == 10)|| (i == 9  && j == 2) || (i == 9  && j == 4) || (i == 9  && j == 10)|| (i == 9  && j == 12) ||(i == 8  && j == 12)||(i == 8  && j == 2)||(i == 7  && j == 2)||(i == 7  && j == 3)||(i == 7  && j == 12)||(i == 7  && j == 11)||(i == 6  && j == 2)||(i == 6  && j == 4)||(i == 6  && j == 5)||(i == 6  && j == 9)||(i == 6  && j == 10)||(i == 6  && j == 12)||(i == 5  && j == 2)||(i == 5  && j == 6)||(i == 5  && j == 7)||(i == 5  && j == 8)||(i == 5  && j == 12)||(i == 4  && j == 2)||(i == 4  && j == 5)||(i == 4  && j == 9)||(i == 4  && j == 12)||(i == 3  && j == 12)||(i == 3  && j == 2)||(i == 3  && j == 4)||(i == 3  && j == 10)||(i == 2  && j == 3)||(i == 2  && j == 11)) {
					  emoji[i][j] = BLACK_BACKGROUND + PIXEL;
					  }else if ((i == 13  && j == 3)||(i == 13  && j == 4)|| (i == 13  && j == 5)|| (i == 13  && j == 6)|| (i == 13  && j == 7)|| (i == 13  && j == 8)|| (i == 13  && j == 9)|| (i == 13  && j == 10) || (i == 13  && j == 11) || (i == 12  && j == 5)|| (i == 12  && j == 5)|| (i == 12  && j == 6)|| (i == 12  && j == 7)|| (i == 12  && j == 8)|| (i == 12  && j == 9)|| (i == 6  && j == 3)|| (i == 6  && j == 11)|| (i == 5  && j == 3)|| (i == 5  && j == 11)|| (i == 4  && j == 3)|| (i == 4  && j == 11)|| (i == 3  && j == 3)|| (i == 3  && j == 11)) {
						  emoji[i][j] = WHITE_BACKGROUND + PIXEL;
					  } else if ((i == 12 && j == 1)||(i == 12  && j == 2) || (i == 12 && j == 3)||(i == 12  && j == 4) || (i == 12 && j == 10) || (i == 12 && j == 11) || (i == 12 && j == 12) || (i == 12 && j == 13)|| (i == 11 && j == 2)|| (i == 11 && j == 3)|| (i == 11 && j == 4)|| (i == 11 && j == 5)|| (i == 11 && j == 6)|| (i == 11 && j == 8)|| (i == 11 && j == 9)|| (i == 11 && j == 10)|| (i == 11 && j == 11)|| (i == 11 && j == 12)|| (i == 10 && j == 2)|| (i == 10 && j == 3)|| (i == 10 && j == 5)|| (i == 10 && j == 9)|| (i == 10 && j == 11)|| (i == 10 && j == 12)||(i == 9 && j == 3)|| (i == 9 && j == 5)||(i == 9 && j == 6)|| (i == 9 && j == 7)||(i == 9 && j == 8)|| (i == 9 && j == 9)|| (i == 9 && j == 11)||(i == 8 && j == 3)|| (i == 8 && j == 5)||(i == 8 && j == 6)|| (i == 8 && j == 7)||(i == 8 && j == 8)|| (i == 8 && j == 9)|| (i == 8 && j == 11)|| (i == 8 && j == 4)|| (i == 8 && j == 10)|| (i == 7 && j == 5)||(i == 7 && j == 6)|| (i == 7 && j == 7)||(i == 7 && j == 8)|| (i == 7 && j == 9)|| (i == 7 && j == 4)|| (i == 7 && j == 10)|| (i == 6 && j == 6)|| (i == 6 && j == 7)|| (i == 6 && j == 8)|| (i == 5 && j == 4)|| (i == 5 && j == 5)|| (i == 5 && j == 9)|| (i == 5 && j == 10)|| (i == 4 && j == 4)|| (i == 4 && j == 10)) {
						  emoji[i][j] = BLUE_BACKGROUND+ PIXEL;
					  }else {
						  emoji[i][j] = 	CYAN_BACKGROUND_BRIGHT + PIXEL;

					  }
					  
				  System.out.print(emoji[i][j]+" ");
				    if (j!=emoji[i].length-1) System.out.printf("") ;
				  }
				  System.out.println();
				}
			 System.out.println("");
			
	
		

	}
}


