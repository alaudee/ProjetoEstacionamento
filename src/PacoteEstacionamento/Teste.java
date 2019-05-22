package PacoteEstacionamento;

import java.sql.*;
import java.util.*;

public class Teste {
    
    public static void main(String[] args) {
        
        Connection con = Conexao.abrirConexao();
        
        CarroBean cb = new CarroBean();
        
        CarroDAO cd = new CarroDAO(con);
        
        cb.setPlaca("JKK1901");
        cb.setCor("Amarelo");
        cb.setDescricao("Carro 1");
        
        cb.setPlaca("XYZ2000");
        cb.setCor("Verde");
        cb.setDescricao("Carro 2");
        
        cb.setPlaca("FRG4500");
        cb.setCor("Azul");
        cb.setDescricao("Carro 3");
        
        System.out.println(cd.inserir(cb));   
    }
    
}
