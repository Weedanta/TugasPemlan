package ObjekLCD;
import java.util.Scanner;

import KelasLCD.LCD;
public class LCDObjek {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        LCD lcd1 = new LCD();
        lcd1.displayNama();

        // input status LCD
        System.out.print("Masukkan Status LCD (Off/On/Freeze): ");
        lcd1.status(sc.nextLine());
        System.out.println();

        // input set volume
        System.out.print("Masukkan Volume LCD : ");
        lcd1.setVolume(sc.nextInt());
        sc.nextLine();

        // menaikkan atau menurunkan volume
        System.out.print("Mau menurunkan/menaikkan volume?(Iya/Tidak) : ");
        lcd1.upDownVolume(sc.nextLine());
        System.out.println();

        // input set brightness
        System.out.print("Masukkan Indikator Brightness : ");
        lcd1.setBrighthness(sc.nextInt());
        sc.nextLine();

        // menaikkan atau menurunkan volume
        System.out.print("Mau menurunkan/menaikkan brightness? (Iya/Tidak) : ");
        lcd1.upDownBrigthness(sc.nextLine());
        System.out.println();

        // input kabel yang ditampilkan lcd
        System.out.print("1. Kabel VGA\n2. Kabel DVI\n3. Kabel HDMI\n4. Display Port\nInput kabel yang digunakan LCD (1/2/3/4) : ");
        lcd1.setCable(sc.nextLine());
        System.out.println();

        // output tampilkan
        lcd1.display();
    }
}
