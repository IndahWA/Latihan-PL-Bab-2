package Tugas;

public class Lapangan {
	double pjg;
	double lebar;

	public Lapangan(double pjg, double lebar){
	this.pjg = pjg;
	this.lebar = lebar;
	}

	public double kelilingLapangan(){
	return 2 * (pjg + lebar);
	}
}
