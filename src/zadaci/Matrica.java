package zadaci;

import javax.swing.JOptionPane;

public class Matrica {

	//popunjava matricu brojevima iz dolje desnog kuta
	
	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite dubinu matrice."));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite širinu matrice."));
		
		//int a=4;
		//int b=5;
		int ukupno = a*b;
		int[][] matrica = new int [a][b];
		
		//int m1 = a - 1;
		//int m2 = b -1;
		
		int m1Max = a-1;
		int m2Max = b-1;
		int m1Min = 0;
		int m2Min = 0;
			
		int brojac = 1;
		int lop=0;
		
		while(brojac<=ukupno) {
			//lop++;                //za debug
			//dolje
			for(int i = m2Max; i >= m2Min; i--) {
				matrica[m1Max][i]=brojac;
				brojac++;
			}
			//if (lop > 1) {break;};   //za debug
			if (brojac > ukupno) {break;}           //izađi ako je kraj
			
			//lijevo
			m1Max--;
			for(int i = m1Max; i >= m1Min; i--) {
				matrica[i][m2Min]=brojac;
				brojac++;
			}	
			//if (lop > 2) {break;};                  //  za debug
			if (brojac > ukupno) {break;}
			
			//gore
			m2Min++;
			for(int i = m2Min; i <= m2Max; i++) {
				matrica[m1Min][i]=brojac;
				brojac++;
			}	
			//if (lop > 1) {break;};                          //za debug
			if (brojac > ukupno) {break;}
			         
			
			//desno
			m1Min++;
			for(int i = m1Min; i <= m1Max; i++) {
				matrica[i][m2Max]=brojac;
				brojac++;
			}
			//if (lop > 1) {break;};
			m2Max--;
			
			
		}
		//ispisuje cijelu matricu
				for (int i = 0; i < a; i++)   {
			        for (int j = 0; j < b; j++)
			        {
			            System.out.print(matrica[i][j]+ "\t");
			        }
			        System.out.println();
			    }
				System.out.println();
	}

}
