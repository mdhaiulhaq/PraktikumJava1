import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
 public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	String namaDepan = "Muhammad";
	String namaTengah = "Dhaiul";
	String namaBelakang = "Haq";
	int usia = 17;
	int targetTahunKuliah = 2;
	double ipk = 3.99964512;
	char nilaiAbjad = 'A';
	boolean ganteng = true;

	System.out.print("Input Nama Depan : ");
	namaDepan = scanner.nextLine();
	System.out.print("Input Usia : ");
	usia = scanner.nextInt();
	System.out.print("Input IPK : ");
	ipk = scanner.nextDouble();
	System.out.print("");
	System.out.print("Input Nilai Abjad : ");
	nilaiAbjad = scanner.next().charAt(0);
	System.out.print("Ganteng? : ");
	ganteng = scanner.nextBoolean();
	
	System.out.println("========== OUTPUT ==========");
	System.out.println("Nama depan : " + namaDepan);
	System.out.println("Nama tengah : " + namaTengah);
	System.out.println("Nama belakang : " + namaBelakang);
	System.out.println("Usia : " + usia);
	System.out.println("Target Kuliah : " + targetTahunKuliah);
	System.out.println("IPK : " + ipk);
	System.out.println("Nilai PBO : " + nilaiAbjad);
	System.err.println("Ganteng : " + ganteng);

	JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaTengah + namaBelakang);
 }
}