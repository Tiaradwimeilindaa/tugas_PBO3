class iwak{
    String jenis;
    String warna;
    String kelamin;
    String habitat;

    iwak(String jenis, String warna, String kelamin, String habitat){
        this.jenis = jenis;
        this.warna = warna;
        this.kelamin = kelamin;
        this.habitat = habitat;
    }

    String getJenis(){
        return this.jenis;
    }

    String getwarna(){
        return this.warna;
    }

    String getKelamin(){
        return this.kelamin;
    }

    String getHabitat(){
        return this.habitat;
    }

    void berenang(String move){
        if ((move=="R") || (move=="R")){
            System.out.println("berenang ke kanan");
        } else if ((move=="L")||(move=="L")){
            System.out.println("berenang ke kiri");
        } else {
            System.out.println("command not found");
        }
    }
}

public class ikan{
    public static void main(String[] args) {
        iwak lele = new iwak("lele","hitam","betina","air tawar");
        System.out.println("jenis : " + lele.getJenis());
        System.out.println("warna : "+lele.getwarna());
        System.out.println("kelamin : "+lele.getKelamin());
        System.out.println("habitat : "+lele.getHabitat());

        lele.berenang("R");
        lele.berenang("L");
    }
}