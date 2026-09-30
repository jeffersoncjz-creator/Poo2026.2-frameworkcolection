import java.util.*;

public class ExemploSet {
    static void main() {

//        Set<String> veiculos = new HashSet<>();
//        veiculos.add("BMW");
//        veiculos.add("Celta");
//        veiculos.add("Ferrari");
//        veiculos.add("Celta");
//        veiculos.forEach(v -> System.out.println(v));

        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(new Pessoa("José", "123",'M', 40));
        pessoas.add(new Pessoa("Maria", "456",'F', 21));
        pessoas.add(new Pessoa("José", "123",'M', 25));
        pessoas.add(new Pessoa("Pedro", "321",'M', 40));
        pessoas.forEach(p -> System.out.println(p));

        System.out.println("-----------------------------------------------------");

        Set<Pessoa> pessoasTreeSet = new TreeSet<>();
        pessoasTreeSet.add(new Pessoa("José", "723",'M', 40));
        pessoasTreeSet.add(new Pessoa("Maria", "456",'F', 21));
        pessoasTreeSet.add(new Pessoa("José", "923",'M', 25));
        pessoasTreeSet.add(new Pessoa("Pedro", "321",'M', 40));
        pessoasTreeSet.forEach(p -> System.out.println(p));



        Map<String, Pessoa> mapPessoa = new HashMap<>();
        mapPessoa.put("123", new Pessoa("José", "123",'M', 40));
        mapPessoa.put("321", new Pessoa("Maria", "321",'F', 20));
        mapPessoa.put("123", new Pessoa("José", "123",'M', 38));
        mapPessoa.entrySet().forEach(c ->{
            System.out.println("Chave: " +c.getKey()+ " - Valor" + c.getValue());
                });



//        pessoas.forEach(p -> System.out.println(p));



    }






}
