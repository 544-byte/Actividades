package Actividad5;

import java.time.LocalDateTime;

public class Cita {
    private String nombrePaciente;
    private String apellidosPaciente;
    private String medico;
    private LocalDateTime fechaCita;

    public Cita() {
        nombrePaciente = "Jhon";
        apellidosPaciente = "Doe";
        medico = "generalista";
        fechaCita = LocalDateTime.MAX;
    }

    public String getNombrePaciente() {return nombrePaciente;}
    public String getApellidosPaciente() {return apellidosPaciente;}
    public String getMedico() {return medico;}
    public LocalDateTime getFechaCita() {return fechaCita;}

    public void setNombrePaciente(String nombrePaciente) {
        if (nombrePaciente.length() >= 3) {
            this.nombrePaciente = nombrePaciente;
        }
    }

    public void setApellidosPaciente(String apellidosPaciente) {
        this.apellidosPaciente = apellidosPaciente.trim().replace(" ", "_");
    }

    public void setMedico(String medico) {
        switch (medico.trim().toLowerCase()){
            case "generalista": this.medico = medico;return;
            case "traumatólogo":
        }
    }

    public void setFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
    }
}
