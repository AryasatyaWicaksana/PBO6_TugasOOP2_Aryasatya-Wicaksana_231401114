package Tugas2_PBO_Arya;

public class Mobil extends Kendaraan {
    public Mobil() {
        super(50);
    }

    @Override
    public void isiBensin(double jumlah) {
        System.out.println("Mengisi bensin Mobil:");
        super.isiBensin(jumlah);
    }
}

