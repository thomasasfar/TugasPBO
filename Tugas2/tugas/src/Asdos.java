public class Asdos extends Mahasiswa {
    private int jamNgasdos;
    
    public Asdos(String nama, int SKS, int jamNgasdos) { // constructor
        super(nama, SKS); // memanggil constructor Mahasiswa
        setJamNgasdos(jamNgasdos); // memanggil setter
    }
    
    @Override
    public int getJamSibuk() { // overriding method
        return super.getJamSibuk() + jamNgasdos; // memanggil method getJamSibuk() dari superclass Mahasiswa
    }

    @Override
    public void cekJamSibuk() { // overriding method
        System.out.println(super.toString() + " adalah seorang asdos dengan jam sibuk " + getJamSibuk()); 
    }

    public void setJamNgasdos(int newJamNgasdos) { // setter
        if (newJamNgasdos < 0) { // validasi
            jamNgasdos = 0; // jika kurang dari 0, maka di set 0
        } else { // jika tidak
            jamNgasdos = newJamNgasdos; // maka di set sesuai input
        }
    }

}
