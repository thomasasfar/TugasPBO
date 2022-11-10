package lat;

public class asdos extends mahasiswa {
        private int jamNgasdos;
    
        public asdos(String nama, int sks, int jamNgasdos){
            super(nama, sks);
            this.jamNgasdos=jamNgasdos;
        }
        public int jamNgasdos(){
            return jamNgasdos;
        }
    
        @Override// Menggunakan method dari kelas induk abstrak
        public int getjamSibuk(){
            return super.getjamSibuk() + jamNgasdos;
        }
        
        @Override// Menggunakan method dari kelas induk abstrak
        public void show(){
            System.out.println(super.toString()+ " Adalah seorang asdos dengan jam sibuk "+ getjamSibuk());
        }
    
    }
