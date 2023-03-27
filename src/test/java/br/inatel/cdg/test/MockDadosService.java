package br.inatel.cdg.test;

import br.inatel.cdg.DadosService;
import java.util.ArrayList;


public class MockDadosService implements DadosService {
    @Override
    public String busca(double sala) {

        if (sala == 1){
            return DadosConst.Renzo;
        }else if (sala == 2){
            return DadosConst.Marcelo;
        }else if (sala == 3){
            return DadosConst.Chris;
        }
        else if (sala == 4){
            return DadosConst.Joao;
        }
        else if (sala == 5){
            return DadosConst.Maria;
        }
        else if (sala == 6){
            return DadosConst.Joana;
        }
        else if (sala == 7){
            return DadosConst.Carol;
        }
        else if (sala == 8){
            return DadosConst.Flavia;
        }
        else if (sala == 9){
            return DadosConst.MJ;
        }
        else if (sala == 10) {
            return DadosConst.Joaquim;
        }
        else{
            return DadosConst.INEXISTENTE;
        }
    }

    @Override
    public boolean predio(double sala) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        for (int i=0; i < list.size(); i++){
            if (list.get(i).equals(sala) || list.get(i).equals(sala)){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }

}
