package model;


import java.sql.Date;

public class cadastro_cliente {
    private int id_cli;
    private int id_logcli;
    private String nome_cli;
    private String senha_cli;
    private String cpf_cli;
    private String tel_cli;
    private String cep_cli;
    private String num_cli;
    private String comp_cli;
    private String email_cli;
    private String dtnasc_cli;
    private String gen_cli;

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public int getId_logcli() {
        return id_logcli;
    }

    public void setId_logcli(int id_logcli) {
        this.id_logcli = id_logcli;
    }

    public String getNome_cli() {
        return nome_cli;
    }

    public void setNome_cli(String nome_cli) {
        this.nome_cli = nome_cli;
    }

    public String getSenha_cli() {
        return senha_cli;
    }

    public void setSenha_cli(String senha_cli) {
        this.senha_cli = senha_cli;
    }

    public String getCpf_cli() {
        return cpf_cli;
    }

    public void setCpf_cli(String cpf_cli) {
        this.cpf_cli = cpf_cli;
    }

    public String getTel_cli() {
        return tel_cli;
    }

    public void setTel_cli(String tel_cli) {
        this.tel_cli = tel_cli;
    }

    public String getCep_cli() {
        return cep_cli;
    }

    public void setCep_cli(String cep_cli) {
        this.cep_cli = cep_cli;
    }

    public String getNum_cli() {
        return num_cli;
    }

    public void setNum_cli(String num_cli) {
        this.num_cli = num_cli;
    }

    public String getComp_cli() {
        return comp_cli;
    }

    public void setComp_cli(String comp_cli) {
        this.comp_cli = comp_cli;
    }

    public String getEmail_cli() {
        return email_cli;
    }

    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }

    public String getGen_cli() {
        return gen_cli;
    }

    public void setGen_cli(String gen_cli) {
        this.gen_cli = gen_cli;
    }

    public String getDtnasc_cli() {
        return dtnasc_cli;
    }

    public void setDtnasc_cli(String dtnasc_cli) {
        this.dtnasc_cli = dtnasc_cli;
    }
}