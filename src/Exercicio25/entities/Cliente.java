package Exercicio25.entities;

public class Cliente {
    private String name;
    private String tel;

    public Cliente(){}

    public Cliente(String name, String tel)throws Exception{
        if(name == null || tel == null)throw new Exception("Campo cliente Nulo");

        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
