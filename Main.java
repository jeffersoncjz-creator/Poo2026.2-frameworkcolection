import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main() {

        int TOTAL_ELEMENTOS = 1000000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("--------------- Inserção ---------------");


        System.out.println("ArrayList");
        System.out.println();

        long tempoInsercaoInicial = System.currentTimeMillis();
        for(int i = 0; i < TOTAL_ELEMENTOS; i++){
            arrayList.addFirst(i);
        }

        long tempototal = System.currentTimeMillis() - tempoInsercaoInicial;
        System.out.println("Tempo Inserção ArrayList: " +tempototal +"ms");

//        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.println("LinkedList");
        System.out.println();

        tempoInsercaoInicial = System.currentTimeMillis();
        for (int i = 0; i < TOTAL_ELEMENTOS; i++){
            linkedList.add(i);
        }

        tempototal = System.currentTimeMillis() - tempoInsercaoInicial;
        System.out.println("Tempo Inserção LinkedList: " + tempototal+ "ms");

        System.out.println("-------------------- Leitura -----------------------");
        System.out.println("ArrayList");
        System.out.println();
        long tempoLeituraInicial = System.currentTimeMillis();
        for(int i = 0; i < TOTAL_ELEMENTOS; i++){
            arrayList.get(i);
        }

        long tempoLeitura = System.currentTimeMillis() - tempoLeituraInicial;
        System.out.println("Tempo leitura ArrayList: " +tempoLeitura+ "ms");

        System.out.println();

        System.out.println("LinkedList");
        System.out.println();
        tempoLeituraInicial = System.currentTimeMillis();
        for(int i = 0; i < TOTAL_ELEMENTOS; i++){
            linkedList.get(i);
        }

        tempoLeitura = System.currentTimeMillis() - tempoLeituraInicial;
        System.out.println("Tempo leitura LinkedList: " +tempoLeitura+ "ms");

    }




}
