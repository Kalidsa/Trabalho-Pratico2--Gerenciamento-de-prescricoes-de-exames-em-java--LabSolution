/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsolution;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class PrescricaoExames {
    
    private String data;
    private Paciente paciente;
    private Medico medico;
    private ArrayList<Exame> listaExames = new ArrayList<>();
    private double valorTotal;

    public PrescricaoExames(String data, Paciente paciente, Medico medico, double valorTotal) {
        this.data = data;
        this.paciente = paciente;
        this.medico = medico;
        this.valorTotal = valorTotal;
    }

    public String getData() {
        return data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public ArrayList<Exame> getListaExames() {
        return listaExames;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setListaExames(ArrayList<Exame> listaExames) {
        this.listaExames = listaExames;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
       
    
}
