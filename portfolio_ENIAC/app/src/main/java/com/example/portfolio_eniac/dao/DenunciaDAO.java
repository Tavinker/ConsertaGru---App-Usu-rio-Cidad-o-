package com.example.portfolio_eniac.dao;

import com.example.portfolio_eniac.conexao.Conexao;
import com.example.portfolio_eniac.model.Denuncia;
import com.example.portfolio_eniac.model.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DenunciaDAO {

    public List<Denuncia> getAll(){
        List<Denuncia> lists = new ArrayList<Denuncia>();
        try {
            Connection conn = Conexao.conectar();
            if(conn != null){
                String sql = "select * from tbDenuncia";
                Statement st = null;
                st = conn.createStatement();

                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    Denuncia denun = new Denuncia();
                    denun.setId(rs.getInt(1));
                    denun.setNome(rs.getString(2));
                    denun.setDescricao(rs.getString(3));
                    denun.setBairro(rs.getString(4));
                    denun.setRua(rs.getString(5));

                    lists.add(denun);
                }
                conn.close();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return lists;

    }

}
