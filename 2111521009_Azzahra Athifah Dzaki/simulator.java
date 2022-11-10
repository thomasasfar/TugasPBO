package lat;

public class simulator {
        public static void main(String[] args) {
            elemen asdos = new asdos ("Fairuzikum" ,22, 7); 
            elemen as1 = (asdos) asdos; 

            dosen dosen = new dosen("Raja OP Damanik", 5); 
            dosen ds1 = (dosen) dosen;

            elemen as2 = new asdos ("Angel-chan",19, 7);

            mahasiswa mahasiswa = new mahasiswa ("Firman", 20); 
            mahasiswa mh1 = (mahasiswa) mahasiswa;

            elemen mh2 = new mahasiswa ("Nid to pass this sem", 23); 

            elemen ds2 = (elemen) new dosen("Nivotko",3); 
            
            as1.show();
            ds1.show();
            as2.show();
            mh1.show();
            mh2.show();
            ds2.show();
          
            int totaljamsibuk = as1.getjamSibuk()+ds1.getjamSibuk()+as2.getjamSibuk()+mh1.getjamSibuk()+ mh2.getjamSibuk()+ ds2.getjamSibuk();
            
            System.out.println("Total jam sibuk Fasilkom adalah " + totaljamsibuk);
    }
        
    }
