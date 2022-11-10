public class Dosen extends Elemen {
    private int jumlahHariKerja; 

    public Dosen(String nama, int jumlahHariKerja) {
        super(nama); // memanggil constructor Elemen
        setJumlahHariKerja(jumlahHariKerja); // memanggil setter
    }
    
    @Override
    public int getJamSibuk() { // overriding method
        return jumlahHariKerja * 8; 
    }

    @Override
    public void cekJamSibuk() { // overriding method
        System.out.println(super.toString() + " adalah seorang dosen dengan jam sibuk " + getJamSibuk());
    }

    public void setJumlahHariKerja(int newJumlahHariKerja) { // setter
        if (newJumlahHariKerja < 0) { // validasi
            jumlahHariKerja = 0; // jika kurang dari 0, maka di set 0
        } else { // jika tidak
            jumlahHariKerja = newJumlahHariKerja;  // maka di set sesuai input
        }
    }
    
}