package function;

import java.util.ArrayList;
import input.Input;
import objects.Galpoes;

public class GalpoesFunction{
    public static ArrayList<Galpoes> galpoesLista = new ArrayList<>(); 
    public static int proximoId = 1;

    public static void criarGalpoes(){
        Galpoes galpoes = new Galpoes();

        galpoes.setId(proximoId);
        System.out.println("\nGalpão (ID: " + galpoes.getId() + ") Digite o nome: ");
        String nome = Input.inputString();
        galpoes.setNome(nome);

        galpoesLista.add(galpoes);
        proximoId +=1;
        System.out.println("Galpão cadastrado!");
    }
}