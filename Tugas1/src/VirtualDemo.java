public class VirtualDemo {
    public static void main(String[] args) {
        Gaji s = new Gaji("Wahyu", "Kubar", 3, 5000.00); // membuat objek Gaji
        
        Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00); //upcasting
        // Polymorphism dari kelas Pegawai

        // Polymorphism: kemampuan untuk merujuk ke objek kelas turunan dari kelas dasar
        // upcasting: mengubah objek kelas turunan menjadi objek kelas dasar

        /* Output Menyusun Pegawai muncul 2 kali karena  dalam konstruktor gaji terdapat kode super 
        yang mengakses konstruktor pada parent class */

        System.out.println("Memanggil mailCheck menggunakan referensi Gaji --"); 
        s.mailCheck(); 
        System.out.println("\nMemanggil mailCheck menggunakan referensi Pegawai --");
        e.mailCheck();
    }
}
