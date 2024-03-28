package KelasLCD;

import java.util.Scanner;

public class LCD {
    // Atribut
    private String status = "Off";
    private int volume = 50;
    private int brigthness = 50;
    private String cable = "HDMI";

    // method
    // Deklarasi Scanner
    static Scanner sc = new Scanner(System.in);

    // method status LCD
    public void status(String status) {
        status = status.toLowerCase();
        switch (status) {
            case "off":
                turnOff();
                break;
            case "on":
                turnOn();
                break;
            case "freeze":
                turnFreeze();
                break;
            default:
                System.out.println("Input Status Salah! Coba Lagi");
                System.out.print("Masukkan Status LCD : ");
                status(sc.nextLine());
                break;
        }
    }

    // method memberikan status mati
    public void turnOff() {
        this.status = "Off";
    }

    // method memberikan status lcd
    public void turnOn() {
        this.status = "On";
    }

    // method membuat LCD dalam keadaan Freeze
    public void turnFreeze() {
        this.status = "Freeze";
    }

    // method apakah menaikkan atau menurunkan volume
    public void upDownVolume(String volume) {
        volume = volume.toLowerCase();
        int indikator = 0;
        switch (volume) {
            case "iya":
                System.out.print("(Naik/Turun) : ");
                String naikTurun = sc.nextLine();
                switch (naikTurun) {
                    case "naik":
                        System.out.print("Mau berapa kali meningkat volume : ");
                        indikator = sc.nextInt();
                        sc.nextLine();
                        for (int i = 0; i < indikator; i++) {
                            volumeUp();
                        }
                        break;

                    case "turun":
                        System.out.print("Mau berapa kali menurunkan volume : ");
                        indikator = sc.nextInt();
                        sc.nextLine();
                        for (int i = 0; i < indikator; i++) {
                            volumeDown();
                        }
                        break;

                    default:
                        System.out.print("Input Salah! Coba Lagi");
                        upDownVolume(sc.nextLine());
                        break;
                }
                break;
        }
    }

    // method menaikkan volume sebesar 10
    public void volumeUp() {
        if (this.volume >= 100) {
        } else {
            this.volume += 10;
        }
    }

    // method menurunkan volume sebesar 10
    public void volumeDown() {
        if (this.volume <= 0) {
        } else {
            this.volume -= 10;
        }
    }

    // method untuk set volume secara langsung
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    // method apakah menaikkan atau menurunkan brightness
    public void upDownBrigthness(String brigthness) {
        brigthness = brigthness.toLowerCase();
        int indikator = 0;
        switch (brigthness) {
            case "iya":
                System.out.print("(Naik/Turun) : ");
                String naikTurun = sc.nextLine();
                switch (naikTurun) {
                    case "naik":
                        System.out.print("Mau berapa kali meningkat volume : ");
                        indikator = sc.nextInt();
                        sc.nextLine();
                        for (int i = 0; i < indikator; i++) {
                            brigthnessUp();
                        }
                        break;

                    case "turun":
                        System.out.print("Mau berapa kali menurunkan volume : ");
                        indikator = sc.nextInt();
                        sc.nextLine();
                        for (int i = 0; i < indikator; i++) {
                            brigthnessDown();
                        }
                        break;

                    default:
                        System.out.print("Input Salah! Coba Lagi");
                        upDownBrigthness(sc.nextLine());
                        break;
                }
                break;
        }
    }

    // method untuk menaikkan brightness sebesar 10
    public void brigthnessUp() {
        if (this.brigthness >= 100) {
        } else {
            this.brigthness += 10;
        }
    }

    // method untuk menurunkan brigthness sebesar 10
    public void brigthnessDown() {
        if (this.brigthness <= 0) {
        } else {
            this.brigthness -= 10;
        }
    }

    // method untuk set brightness secara langsung
    public void setBrighthness(int brightness) {
        if (brightness > 100) {
            this.brigthness = 100;
        } else if (brightness < 0) { 
            this.brigthness = 0;
        } else { 
            this.brigthness = brightness;
        }
    }

    // method untuk set kabel yang ditampilkan LCD
    public void setCable(String cable) {
        switch (cable) {
            case "1":
                this.cable = "VGA";
                break;
            case "2":
                this.cable = "DVI";
                break;
            case "3":
                this.cable = "HDMI";
                break;
            case "4":
                this.cable = "DisplayPort";
                break;

            default:
                System.out.print("Input Salah! Coba Lagi");
                setCable(sc.nextLine());
                break;
        }
    }

    public void display() {
        System.out.println("\n");
        System.out.println("LCD Status: " + this.status);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brigthness: " + this.brigthness);
        System.out.println("Cable: " + this.cable);
    }
    public void displayNama() {
        System.out.println("Nama : Ketut Bagus Wedanta Ananda Murti\nNIM : 235150701111027\n\nLCD FILKOM");
    }

}
