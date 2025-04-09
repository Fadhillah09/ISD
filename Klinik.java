import java.util.LinkedList;
import java.util.Queue;
class Klinik {
    Queue<Pasien> antrian = new LinkedList<>();
    String jenis;

    public Klinik(String jenis) {
        this.jenis = jenis;
    }

    public void ambilNomor(String nomor, String namaPasien, String namaDokter, String jenisDokter) {
        Pasien pasien = new Pasien(nomor, namaPasien, namaDokter, jenisDokter);
        antrian.add(pasien);
        if (jenis.equalsIgnoreCase("Dokter Umum")) {
            System.out.println("Anda adalah pasien dokter umum");
            if (antrian.size() > 1) {
                System.out.println("Anda menunggu " + (antrian.size() - 1) + " orang lagi");
            }
        } else {
            System.out.println("Anda adalah pasien dokter spesialis");
        }
    }

    public void panggilanKlinik() {
        if (antrian.isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian.");
        } else {
            Pasien pasien = antrian.poll();
            System.out.println("Nomor " + pasien.nomor + " dengan nama " + pasien.namaPasien +
                    " untuk dokter " + pasien.namaDokter + " , pasien " + pasien.jenisDokter +
                    " silahkan ke ruang periksa");
        }
    }

    public void hapusSemua() {
        antrian.clear();
        System.out.println("Seluruh antrian " + jenis + " telah dikosongkan.");
    }
}