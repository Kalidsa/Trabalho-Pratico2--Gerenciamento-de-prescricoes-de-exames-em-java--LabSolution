/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsolution;

/**
 *
 * @author Aluno
 */
public class Exame {
    
    private String codigo;
    private String descricao;
    private String materialColeta;
    private String horasJejum;
    private double valor;

    public Exame(String codigo, String descricao, String materialColeta, String horasJejum, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.materialColeta = materialColeta;
        this.horasJejum = horasJejum;
        this.valor = valor;
    }

    public Exame(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    

    public Exame() {
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMaterialColeta() {
        return materialColeta;
    }

    public String getHorasJejum() {
        return horasJejum;
    }

    public double getValor() {
        return valor;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMaterialColeta(String materialColeta) {
        this.materialColeta = materialColeta;
    }

    public void setHorasJejum(String horasJejum) {
        this.horasJejum = horasJejum;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
