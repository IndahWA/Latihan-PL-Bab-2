package Tugas;

import java.util.Scanner;

public class MahasiswaLapangan {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

	int jumlah_mahasiswa;
	double pjg = 0;
	double lebar = 0;
	
	System.out.print("Jumlah mahasiswa    : ");
	jumlah_mahasiswa = in.nextInt();

	System.out.println();
	
	Lapangan luas = new lapangan(pjg, lebar);
	System.out.print("Masukkan panjang lapangan	: ");
	pjg = in.nextDouble();
	System.out.print("Masukkan lebar lapangan	: ");
	lebar = in.nextDouble();
	luas = new Lapangan (pjg, lebar);
	System.out.println();

	Mahasiswa data [] = new Mahasiswa[jumlah_mahasiswa];
	
	for (int i = 0; i < jumlah_mahasiswa; i++){
		String nim, nama;
		double putaran, menit;
		Scanner input = new Scanner (System.in);

		System.out.println("Silahkan masukkan dengan format berikut: ");
            	System.out.println(" nim, nama, jumlah putaran, waktu(menit)");

		nim = input.nextLine();
		nama = input.nextLine();
		putaran = input.nextDouble();
		menit = input.nextDouble();
		data [i] = new Mahasiswa (nim, nama, putaran, menit);
		System.out.println();
	}


    }
}