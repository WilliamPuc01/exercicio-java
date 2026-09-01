package Exercicio13;

public class Pensionato {
    private String name;
    private String email;
    private int quarto;

    Pensionato(String name, String email, int quarto){
        this.email = email;
        this.name = name;
        this.quarto = quarto;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public String toString(){
        return "Nome: " + name + " Email: " + email + " Quarto: " + quarto;
    }
}
