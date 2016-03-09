package Tugas;

public class Mahasiswa {
    
	String nim;
	String nama_mahasiswa;
	double jumlahPutaran;
	double jumlah_waktu;

	public Mahasiswa(String nim, String nama_mahasiswa, double jumlahPutaran, double jumlah_waktu){
	this.nim = nim;
	this.nama_mahasiswa = nama_mahasiswa;
	this.jumlahPutaran;
	this.jumlah_waktu;
	}

	public double hitungLintasan(Lapangan panggil){
	return panggil.kelilingLapangan() * jumlahPutaran;
	}
}