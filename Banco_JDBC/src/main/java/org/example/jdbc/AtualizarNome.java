package org.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarNome {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ID da pessoa que você quer substituir: ");
        int codigo = sc.nextInt();

        String selectSQL = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        Connection conexao = FabricaConexao.getConexao();

        PreparedStatement stmt = conexao.prepareStatement(selectSQL);
        stmt.setInt(1, codigo);
        ResultSet resultado = stmt.executeQuery();

        if (resultado.next()){
            Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));

            System.out.println("O nome atual é " + p.getNome());
            sc.nextLine();

            System.out.print("Informe o novo nome: ");
            String novoNome = sc.nextLine();

            stmt.close();

            stmt = conexao.prepareStatement(updateSQL);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            stmt.execute();

            System.out.println("Pessoa alterada com sucesso! ");
        } else {
            System.out.println("Pessoa não encontrada!");
        }
    }
}
