package entity;

public interface InterfaceEntity{
    /**
     * Método criado para captura de todas as informações
     * da entidade em formato de vetor de Objects.
     * Pode ser usado para inserir os dados de uma entidade
     * diretamente em uma linha em uma JTable.
     * @return Object[]
     */
    public Object[] getDadosEmVetor();
}
