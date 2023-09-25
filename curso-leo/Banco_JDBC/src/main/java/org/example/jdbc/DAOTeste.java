package org.example.jdbc;

public class DAOTeste {

    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
        System.out.println(dao.incluir(sql, "Elestão Diolhoemnos da Silva", 1000));
        System.out.println(dao.incluir(sql, "Mepega Ram da Silva", 1001));
        System.out.println(dao.incluir(sql, "Usar ao Demim da Silva", 1002));

        dao.close();
    }
}
