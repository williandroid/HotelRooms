package mvc.model.dao;

import entity.Log;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.controllerview.AbstractForm;
import java.util.Date;

public class LogDAO implements InterfaceDAO
{
    private static List<Log> listLogs = new ArrayList<>();
    private String nomeArquivoDados = "";
    private ObjectOutputStream objectOut;
    private ObjectInputStream objectIn;
    private int index = 0000;
    
    public LogDAO()
    {
        nomeArquivoDados = "log.data";
        atualizarListaComArquivo();
        index = getMaiorIndexDaLista()+ 1;
    }
    
    @Override
    public void inserir(Object o) 
    {
        if (objetoEUmLog(o)) {
            Log logParaInserir = (Log) o;
            /*Garantindo que o código equivale ao index*/
            logParaInserir.setCodigo(String.valueOf(getIndex()));
            listLogs.add(logParaInserir);
            acrescerIndex();
            salvarListaEmArquivo();
        }       
    }

    public void inserir(String mensagem) {
        Date data = new Date();
        Log log = new Log(String.valueOf(getIndex()), AbstractForm.logado, mensagem, data);
        inserir(log);
        acrescerIndex();
        salvarListaEmArquivo();
    }
    
    @Override
    public void remover(Object o) 
    {
        try {
            throw new Exception("Não é possível remover logs!");
        } catch (Exception ex) {
            Logger.getLogger(LogDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        try {
            throw new Exception("Não é possível remover logs!");
        } catch (Exception ex) {
            Logger.getLogger(LogDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        try {
            throw new Exception("Não é possível atualizar logs!");
        } catch (Exception ex) {
            Logger.getLogger(LogDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List buscarTodos() 
    {
        return listLogs;
        
    }

    @Override
    public Log buscar(String codigo) 
    {
        for (Log logDaLista : listLogs) {
                if (logDaLista.getCodigo().equals(codigo)) {
                    return logDaLista;
                    
                }
        }
        return null;       
    }
    public boolean objetoEUmLog(Object o) 
    {
        if (o instanceof Log) {
            return true;
            
        } else {
            try {
                throw new Exception("objetoEUmLog(Object o)"
                        + " recebendo um objeto que não é uma instância"
                        + " de Log");
            } catch (Exception ex) {
                Logger.getLogger(LogDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                return false;
            }
        }
    }

    @Override
    public int getMaiorIndexDaLista() {
        int maiorIndex = 0;
        for (Log logDaLista : listLogs) {
            int codigoDoLogDaLista = Integer.parseInt(logDaLista.getCodigo());
            if (codigoDoLogDaLista > maiorIndex) {
                maiorIndex = codigoDoLogDaLista;
            }
        }
        
        return maiorIndex;
    }
    
    @Override
    public void atualizarListaComArquivo()
    {
        try {
            abrirLeituraDoArquivo();
            listLogs = (ArrayList) objectIn.readObject();
            fecharLeituraDoArquivo();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível atualizar a lista com"
                        + " os dados do arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(LogDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    @Override
    public void salvarListaEmArquivo()
    {
        try {
            abrirArmazenamentoEmArquivo();
            objectOut.writeObject(listLogs); 
            fecharArmazenamentoEmArquivo();
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível salvar os dados no"
                                    + " arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(LogDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

    @Override
    public int getIndex()
    {
        return index;
    }
    
    @Override
    public void acrescerIndex()
    {
        index += 1;
    }
    
    @Override
    public void abrirArmazenamentoEmArquivo() throws IOException
    {
        this.objectOut = new ObjectOutputStream(
                new FileOutputStream(nomeArquivoDados)
                );
    }
    
    @Override
    public void fecharArmazenamentoEmArquivo() throws IOException
    {
        this.objectOut.close();
    }
    
    @Override
    public void abrirLeituraDoArquivo() throws IOException
    {
        this.objectIn = new ObjectInputStream(
                new FileInputStream(nomeArquivoDados)
                );
    }
    
    @Override
    public void fecharLeituraDoArquivo() throws IOException
    {
        this.objectIn.close();
    }
}
