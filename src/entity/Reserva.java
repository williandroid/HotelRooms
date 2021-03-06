package entity;

import java.io.Serializable;
import java.util.Date;

public class Reserva implements InterfaceEntity, Serializable
{
    
    private int codigo;
    private Cliente cliente;
    private Quarto quarto;
    private Date dataInicio;
    private Date dataTermino;
    private Date dataPedido;
    private Usuario usuario;

    public Reserva(int codigo, Cliente cliente, Quarto quarto, Date dataInicio, Date dataTermino, Date dataPedido, Usuario usuario) 
    {
        this.codigo = codigo;
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.dataPedido = dataPedido;
        this.usuario = usuario;
    }
    
    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public Cliente getCliente() 
    {
        return cliente;
    }

    public void setCliente(Cliente cliente) 
    {
        this.cliente = cliente;
    }

    public Quarto getQuarto() 
    {
        return quarto;
    }

    public void setQuarto(Quarto quarto) 
    {
        this.quarto = quarto;
    }

    public Date getDataInicio() 
    {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) 
    {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() 
    {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) 
    {
        this.dataTermino = dataTermino;
    }

    public Date getDataPedido() 
    {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) 
    {
        this.dataPedido = dataPedido;
    }

    public Usuario getUsuario() 
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
    }

    @Override
    public Object[] getDadosEmVetor() 
    {
        throw new UnsupportedOperationException("Reserva.getDadosEmVetor não "
                + "desenvolvido.");
    }
}
