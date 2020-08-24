package model;

public class Consultas_Agendadas {
    private String dia;
    private String desc;
    private String doutt;
    private String loc;

    public Consultas_Agendadas() {
    }

    public Consultas_Agendadas(String dia, String desc, String doutt, String loc) {
        this.dia = dia;
        this.desc = desc;
        this.doutt = doutt;
        this.loc = loc;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDoutt() {
        return doutt;
    }

    public void setDoutt(String doutt) {
        this.doutt = doutt;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
