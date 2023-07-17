/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsolution;

/**
 *
 * @author Aluno
 */
public class Medico extends Pessoa {
    
    private String crm;
    private String especialidade;
    
    public Medico(String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf, endereco, telefone);
    }

    public Medico(String nome, String cpf, String endereco, String telefone, String crm, String especialidade) {
        super(nome, cpf, endereco, telefone);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public Medico(String nome) {
        super(nome);
    }
    

    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
    
    
}
