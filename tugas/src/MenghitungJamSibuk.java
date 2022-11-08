public class MenghitungJamSibuk {
    public static void main(String[] args) throws Exception {
        Elemen[] elemen = new Elemen[6];
        elemen[0] = new Asdos("Fairuzkan", 23, 4);
        elemen[1] = new Dosen("Raja OP", 5);
        elemen[2] = new Asdos("Angel Chan", 21, 1);
        elemen[3] = new Mahasiswa("Firman", 20);
        elemen[4] = new Mahasiswa("Nid to pass", 23);
        elemen[5] = new Dosen("Nivotko", 3);

        int totalJamSibuk = 0;

        for (int i = 0; i < elemen.length; i++) {
            elemen[i].cekJamSibuk();
            totalJamSibuk = totalJamSibuk + elemen[i].getJamSibuk();
        }

        System.out.println("Total jam sibuk adalah " + totalJamSibuk);
    }
}
