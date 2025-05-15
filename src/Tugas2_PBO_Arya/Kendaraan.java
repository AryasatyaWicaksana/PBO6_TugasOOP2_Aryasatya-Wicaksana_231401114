package Tugas2_PBO_Arya;

public class Kendaraan {
    private double bahanBakar;
    private double kapasitasTanki;

    public Kendaraan(double kapasitasTanki) {
        this.kapasitasTanki = kapasitasTanki;
        this.bahanBakar = 0;
    }

    public double getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(double jumlah) {
        if (jumlah >= 0 && jumlah <= kapasitasTanki) {
            this.bahanBakar = jumlah;
        } else {
            System.out.println("Jumlah bahan bakar tidak valid.");
        }
    }

    public void isiBensin(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pengisian harus lebih dari 0 liter.");
        } else if (bahanBakar + jumlah > kapasitasTanki) {
            System.out.println("Tidak dapat mengisi. Kapasitas tanki akan meluap.");
        } else {
            bahanBakar += jumlah;
            System.out.println("Berhasil mengisi " + jumlah + " liter. Total sekarang: " + bahanBakar + " liter.");
        }
    }
}

