import java.util.List;

/**
 * Catalogo
 */
public class Catalogo {
    private List<VeiculoInterface> veiculos;

    public void addVeiculo(VeiculoInterface veiculo){}

    public List<VeiculoInterface> listarTodos(){}

    public List<VeiculoInterface> listarCarros(){}
    public List<VeiculoInterface> listarCaminhoes(){}
    public List<VeiculoInterface> listarAvioes(){}

    public List<VeiculoInterface> listarPorMarca(String marca){}
    public List<VeiculoInterface> listarPorAno(int ano){}
    public List<VeiculoInterface> listarPorAno(int anoInicial, int anoFinal){}
    
}