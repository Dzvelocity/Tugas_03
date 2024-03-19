package tugas3;

public class Ticket {
    private String[] namaPenumpang;
    private String[] asal;
    private String[] tujuan;
    private int jumlahTersedia;

    public Ticket(int jumlahTersedia) {
        this.jumlahTersedia = jumlahTersedia;
        namaPenumpang = new String[jumlahTersedia];
        asal = new String[jumlahTersedia];
        tujuan = new String[jumlahTersedia];
    }

    public Ticket(String namaKereta, int jumlahTiket) {
        namaPenumpang = new String[jumlahTiket];
        asal = new String[jumlahTiket];
        tujuan = new String[jumlahTiket];
        this.jumlahTersedia = jumlahTiket;
    }

    public void tambahTiket(String namaPenumpang) {
        if (jumlahTersedia > 0) {
            this.namaPenumpang[this.namaPenumpang.length - jumlahTersedia] = namaPenumpang;
            jumlahTersedia--;
            if (jumlahTersedia < 30) {
                System.out.println("=======================================");
                System.out.println("Tiket berhasil dipesan Sisa tiket tersedia: " + jumlahTersedia);
            } else {
            	System.out.println("=======================================");
                System.out.println("Tiket berhasil dipesan");
            }
        } else {
            System.out.println("=======================================");
            System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
            System.out.println("=======================================");
        }
    }

    public void tambahTiket(String namaPenumpang, String asal, String tujuan) {
        if (jumlahTersedia > 0) {
            int index = this.namaPenumpang.length - jumlahTersedia;
            this.namaPenumpang[index] = namaPenumpang;
            this.asal[index] = asal; // Inisialisasi nilai asal
            this.tujuan[index] = tujuan; // Inisialisasi nilai tujuan
            jumlahTersedia--;
            if (jumlahTersedia < 30) {
                System.out.println("=======================================");
                System.out.println("Tiket berhasil dipesan Sisa tiket tersedia: " + jumlahTersedia);
            } else {
            	System.out.println("=======================================");
                System.out.println("Tiket berhasil dipesan");
                System.out.println("=======================================");
            }
        } else {
        	System.out.println("=======================================");
            System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
        }
    }

    public void tampilkanTiket(String namaKereta) {
        if (namaPenumpang.length == 0) {
            System.out.println("Tidak ada penumpang pada kereta api " + namaKereta + ".");
        } else {
            System.out.println("=======================================");
            System.out.println("Daftar penumpang kereta api " + namaKereta + ":");
            System.out.println("---------------------------");
            for (int i = 0; i < namaPenumpang.length; i++) {
                if (namaPenumpang[i] != null) {
                    System.out.println("Nama: " + namaPenumpang[i]);
                    if (asal[i] != null && tujuan[i] != null) {
                        System.out.println("Asal: " + asal[i]);
                        System.out.println("Tujuan: " + tujuan[i]);
                        System.out.println("---------------------------");
                    }
                }
            }
        }
    }
}


