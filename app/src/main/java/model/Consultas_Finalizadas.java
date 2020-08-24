package model;

public class Consultas_Finalizadas {

    private String day;
    private String description;
    private String doctor;
    private String locau;

    public Consultas_Finalizadas() {
    }

    public Consultas_Finalizadas(String day, String description, String doctor, String locau) {
        this.day = day;
        this.description = description;
        this.doctor = doctor;
        this.locau = locau;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getLocau() {
        return locau;
    }

    public void setLocau(String locau) {
        this.locau = locau;
    }
}
