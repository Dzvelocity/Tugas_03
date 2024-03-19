package tugas3;

public class Kereta {
 private Ticket tiket;
 private String namaKereta;

 public Kereta() {
     tiket = new Ticket(1000);
     this.namaKereta = "Komuter";
 }

 public Kereta(String namaKereta, int jumlahTiket) {
     tiket = new Ticket(namaKereta, jumlahTiket);
     this.namaKereta = namaKereta;
 }

 public void tambahTiket(String namaPenumpang) {
     tiket.tambahTiket(namaPenumpang);
 }

 public void tambahTiket(String namaPenumpang, String asal, String tujuan) {
     tiket.tambahTiket(namaPenumpang, asal, tujuan);
 }

 public void tampilkanTiket() {
     tiket.tampilkanTiket(namaKereta);
 }
}


