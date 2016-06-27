/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.semadec.dao;

import br.edu.ifrn.semadec.modelo.Inscricao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Hallessandro
 */
public class SemadecDAO extends GeralDAO{
    private final String INSERT = "insert into tbl_inscricoes (matricula, nome, modalidade) values (?,?,?);";
    
    private final String QUERY_INSCRICOES = "select * from tbl_inscricoes"; 
    
    public void inserirInscricao(Inscricao i) throws SQLException{
        executarComando(INSERT, i.getMatricula(), i.getNome(), i.getModalidade());
    }
    
    public List<Inscricao> getInscricao() throws SQLException{
        ResultSet resultado = executarConsulta(QUERY_INSCRICOES);        
        ArrayList<Inscricao> inscricoes = new ArrayList();
        while (resultado.next()){
            Inscricao i = popularInscricao(resultado);
            inscricoes.add(i);
        }
        return inscricoes;        
    }
    
    private Inscricao popularInscricao(ResultSet resultado) throws SQLException{
        Inscricao i = new Inscricao();
        i.setMatricula(resultado.getString("matricula"));
        i.setNome(resultado.getString("nome"));
        i.setModalidade(resultado.getString("modalidade"));
        return i;        
    }
}
