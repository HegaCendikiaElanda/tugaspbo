package tugas;

import java.util.Scanner;

public class Tugas {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Menu tmenu = new Menu();
        GayaGesek ggesek = new GayaGesek();
        GayaBerat gberat = new GayaBerat();
        BeratJenis bjenis = new BeratJenis();
        Tekanan tekanan = new Tekanan();
        TekananHidrostatik thidrostatik = new TekananHidrostatik();
        int menu;
        System.out.println("KELOMPOK 5");
        System.out.println("------------------------------");
        System.out.println("- RIAN PIRNANDI (0619101026)");
        System.out.println("- HEGA CENDIKIA ELANDA (0619101012)");
        System.out.println("- RANDY KURNIAWAN (0619101010)");
        System.out.println("------------------------------");
        do {
            tmenu.tampilMenu();
            System.out.print("SILAHKAN PILIH MENU : ");
            menu = scan.nextInt();
            switch(menu){
                case 1 :
                    ggesek.rumusGayaGesek();
                    break;
                case 2 :
                    gberat.rumusGayaBerat();
                    break;
                case 3 :
                    bjenis.rumusBeratJenis();
                    break;
                case 4 :
                    tekanan.rumusTekanan();
                    break;
                case 5 :
                    thidrostatik.rumusTekananHidrostatik();
                    break;
                case 6 :
                    System.out.println("KELUAR PROGRAM");
                    break;
                default :
                    System.out.println("INPUT YANG ANDA MASUKAN TIDAK VALID");
                    break;
            }
        } while (menu != 6);   
    }
}
