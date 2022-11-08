public class Asdos extends Mahasiswa {
    private int jamNgasdos;
    
    public Asdos(String nama, int SKS, int jamNgasdos) {
        super(nama, SKS);
        this.jamNgasdos = jamNgasdos;
    }
    
    public int getJamSibuk() {
        return super.getJamSibuk() + jamNgasdos;
    }

    public void cekJamSibuk() {
        System.out.println(super.toString() + " adalah seorang asdos dengan jam sibuk " + getJamSibuk());
    }


}
