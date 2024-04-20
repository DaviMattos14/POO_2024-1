public class Teste {
    public static void main(String[] args){
        Agenda ag = new Agenda();
        Contato c1 = new Contato("Joao", "+55 21 99999-9999");
        Contato c2 = new Contato("Joao", "+55 21 92222-2222");
        Contato c3 = new Contato("Maria", "+55 21 98888-8888");
        Contato c4 = new Contato("Jose", "+55 21 97777-7777");
        Contato c5 = new Contato("Jose", "+55 21 97777-7777");
        Contato c6 = new Contato("", "+55 21 91111-1111");

        ag.adicionarContato(c1);
        ag.adicionarContato(c2);
        ag.adicionarContato(c3);
        ag.adicionarContato(c4);
        ag.adicionarContato(c5);
        ag.adicionarContato(c6);
        ag.listarContatos();
        ag.removerContato(c6);
        ag.listarContatos();
        
        //String d = (ag.ehDuplicado(c1)) ? "" : " NAO ";
        //System.out.println("\nO contato " + c1.getNome() + d + " eh duplicado.");
        //String e = (ag.ehDuplicado(c4)) ? "" : " NAO ";
        //System.out.println("\nO contato " + c4.getNome() + e + " eh duplicado.");
    }
}
