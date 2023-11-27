package AlisverisSepeti;
import javax.swing.JOptionPane;


public class Sepet {

	public static void main(String[] args) {
		
		
		String S[][] = new  String[10][4];
		
		S[0][0] = JOptionPane.showInputDialog("1. Ürün Kodu: ");
		S[0][1] = JOptionPane.showInputDialog("1. Ürün Adı: ");
		S[0][2] = JOptionPane.showInputDialog("1. Ürün Fiyatı: ");
		S[0][3] = JOptionPane.showInputDialog("1. Ürün Adeti: ");

		
		
		
		S[1][0] = JOptionPane.showInputDialog("2. Ürün Kodu: ");
		S[1][1] = JOptionPane.showInputDialog("2. Ürün Adı: ");
		S[1][2] = JOptionPane.showInputDialog("2. Ürün Fiyatı: ");
		S[1][3] = JOptionPane.showInputDialog("2. Ürün Adeti: ");
		
		
		
		S[2][0] = JOptionPane.showInputDialog("3. Ürün Kodu: ");
		S[2][1] = JOptionPane.showInputDialog("3. Ürün Adı: ");
		S[2][2] = JOptionPane.showInputDialog("3. Ürün Fiyatı: ");
		S[2][3] = JOptionPane.showInputDialog("3. Ürün Adeti: ");
		
		
		float Ufiyat = 0, Top = 0;
		
		
		Ufiyat = (Float.valueOf(S[0][2]) * Integer.valueOf(S[0][3]));
		Top += Ufiyat;
		
		Ufiyat = (Float.valueOf(S[1][2]) * Integer.valueOf(S[1][3]));
		Top += Ufiyat;
		
		Ufiyat = (Float.valueOf(S[2][2]) * Integer.valueOf(S[2][3]));
		Top += Ufiyat;
		
		
		JOptionPane.showMessageDialog(null, Top);
		
		
	}

}
