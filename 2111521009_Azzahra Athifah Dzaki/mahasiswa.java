package lat;

public class mahasiswa extends elemen{
        private int sks;
    
       public mahasiswa(String nama, int sks) {
            super(nama); 
            this.sks=sks;     
        }
     
        @Override// Menggunakan method dari parent class yaitu class Elemen 
       public void show(){
          System.out.println(super.toString()+" Adalah seorang mahasiswa dengan jam sibuk "+getjamSibuk());
        }
    
        @Override// Menggunakan method dari kelas induk 
         public int getjamSibuk(){
            return sks*3;
         }
    }

