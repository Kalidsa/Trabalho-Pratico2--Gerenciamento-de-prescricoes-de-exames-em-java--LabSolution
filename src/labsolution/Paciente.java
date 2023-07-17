/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsolution;

/**
 *
 * @author Aluno
 */
public class Paciente extends Pessoa {
    
    private String dataDeNascimento;
    private String planoDeSaude;
    
    public Paciente(String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf, endereco, telefone);
    }

    public Paciente(String nome, String cpf, String endereco, String telefone, String dataDeNascimento, String planoDeSaude) {
        super(nome, cpf, endereco, telefone);
        this.dataDeNascimento = dataDeNascimento;
        this.planoDeSaude = planoDeSaude;
    }

    public Paciente(String nome) {
        super(nome);
    }
    
    

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setPlanoDeSaude(String planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }
    
    
    
    
    
}
