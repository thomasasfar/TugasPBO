package lat;

public class dosen extends elemen{
        private int jumlahHariKerja;
        
        public dosen(String nama,int jumlahHariKerja){
            super(nama); //
            this.jumlahHariKerja = jumlahHariKerja; 
        }
        public int jumlahHariKerja(){
            return jumlahHariKerja;
        }
        
        @Override
        public void show(){ 
            System.out.println(super.toString() + " Adalah seorang dosen dengan jam sibuk "+ getjamSibuk());
        }
    
        @Override// Menggunakan method dari superclass 
        public int getjamSibuk(){
            return jumlahHariKerja*8 ;
            
        }
    }
