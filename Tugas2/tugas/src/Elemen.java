public class Elemen {
    private String nama;
    
    public Elemen(String nama) { // constructor
        this.nama = nama; // mengisi variabel nama dengan input
    }
    
    @Override
    public String toString(){ // overriding method
        return nama;
    }
    
    public int getJamSibuk() { 
        return 0; 
    }

    public void cekJamSibuk() { 
        
    }
}




