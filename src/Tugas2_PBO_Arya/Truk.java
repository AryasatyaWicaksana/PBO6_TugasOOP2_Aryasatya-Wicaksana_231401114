package Tugas2_PBO_Arya;

public class Truk extends Kendaraan {
    public Truk() {
        super(150);
    }

    @Override
    public void isiBensin(double jumlah) {
        System.out.println("Mengisi bensin Truk:");
        super.isiBensin(jumlah);
    }
}

