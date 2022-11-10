public class Mahasiswa extends Elemen {
    private int SKS;
    
    public Mahasiswa(String nama, int SKS) { // constructor
        super(nama); // memanggil constructor Elemen
        setSKS(SKS); // memanggil setter
    }
    
    @Override
    public int getJamSibuk() { // overriding method
        return SKS * 3;
    }

    @Override
    public void cekJamSibuk() { // overriding method
        System.out.println(super.toString() + " adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk());
    }

    public void setSKS(int newSKS) { // setter
        if (newSKS < 0) { // validasi
            SKS = 0; // jika kurang dari 0, maka di set 0
        } else { // jika tidak
            SKS = newSKS;   // maka di set sesuai input
        }
    }
    
}
    
