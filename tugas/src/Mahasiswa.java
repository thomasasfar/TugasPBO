public class Mahasiswa extends Elemen {
    private int jumlahSKS;
    
    public Mahasiswa(String nama, int jumlahSKS) {
        super(nama);
        this.jumlahSKS = jumlahSKS;
    }

    public int getJamSibuk() {
        return jumlahSKS * 3;
    }

    public void cekJamSibuk() {
        System.out.println(super.toString() + " adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk());
    }


    
}
    
