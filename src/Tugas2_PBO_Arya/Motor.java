package Tugas2_PBO_Arya;

public class Motor extends Kendaraan {
    public Motor() {
        super(15);
    }

    @Override
    public void isiBensin(double jumlah) {
        System.out.println("Mengisi bensin Motor:");
        super.isiBensin(jumlah);
    }
}

