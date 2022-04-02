package br.com.quintinodigital.massariapi.entity;

import java.io.Serializable;

public class PessoaEntity implements Serializable {

    private Long codigo;

    private String nome;

    private Boolean eAtivo;

    public PessoaEntity() { }

    public PessoaEntity(PessoaEntity pessoaEntity) {
        this.codigo = pessoaEntity.getCodigo();
        this.nome = pessoaEntity.getNome();
        this.eAtivo = true;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean geteAtivo() {
        return eAtivo;
    }

    public void seteAtivo(Boolean eAtivo) {
        this.eAtivo = eAtivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PessoaEntity)) return false;

        PessoaEntity that = (PessoaEntity) o;

        if (!codigo.equals(that.codigo)) return false;
        if (!nome.equals(that.nome)) return false;
        return eAtivo.equals(that.eAtivo);
    }

    @Override
    public int hashCode() {
        int result = codigo.hashCode();
        result = 31 * result + nome.hashCode();
        result = 31 * result + eAtivo.hashCode();
        return result;
    }

}
