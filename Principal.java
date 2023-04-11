public class Principal {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Guza");
        System.out.println(pessoa.getNome());

        pessoa.setIdade(17);
        System.out.println(pessoa.getIdade());

        pessoa.setCelular("14 997828933");
        System.out.println(pessoa.getCelular());

        pessoa.setCpf("495.714.368.44");
        System.out.println(pessoa.getCpf());
    }
    
}