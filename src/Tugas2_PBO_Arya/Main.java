package Tugas2_PBO_Arya;

public class Main {
    public static void main(String[] args) {
        Kendaraan[] kendaraan = {
                new Mobil(),
                new Motor(),
                new Truk()
        };

        for (Kendaraan k : kendaraan) {
            k.isiBensin(20); // uji polymorphism
        }
    }
}

