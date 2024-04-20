public class Agenda {
    private Contato[] meusContatos;
    private final int MAX = 100;
    private int total = 0;

    //Construtor:
    public Agenda(){
    meusContatos = new Contato[MAX];
    }
    public boolean ehDuplicado(Contato c) {
        for (int i = 0; i < total; ++i) {
            if (c.equals(meusContatos[i]) && (c.getTel() == meusContatos[i].getTel())) { // Chama o nosso "equals()"
                return true;
            }
        }
        return false;
    }


    public void listarContatos(){
        for (int i = 0; i < total; ++i) {
            System.out.println(meusContatos[i].getNome());
        }
    System.out.println("Total de " + total + " contatos listados.\n");
    }

    public boolean adicionarContato(Contato c){
        if(total == MAX) //Agenda lotada?
            return false;
        if(ehDuplicado(c) == false) {    
            meusContatos[total] = c;
            ++total;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removerContato(Contato c){
        Contato[] copia_contatos = new Contato[MAX];
        int temp = 0;
        for (int i = 0; i < total; i++) {
            if ((c.getNome() != meusContatos[i].getNome()) && (c.getTel() != meusContatos[i].getTel())) {
                copia_contatos[i] = meusContatos[i];
                temp++;
            }
        }
        if(temp < total){
            meusContatos = copia_contatos;
            total--;
            return true;
        }
        else{
            return false;
        }
    }
}