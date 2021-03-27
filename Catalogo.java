import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Catalogo
 */
public class Catalogo {
    private List<VeiculoInterface> veiculos;

    public Catalogo() {
        veiculos = new ArrayList<VeiculoInterface>();
        populateVeiculos();
    }

    public void addVeiculo(VeiculoInterface veiculo){
        veiculos.add(veiculo);
    }

    public List<VeiculoInterface> listarTodos(){
        return veiculos;
    }

    public List<VeiculoInterface> listarCarros(){
        return veiculos.stream().filter(v -> v instanceof Carro).collect(Collectors.toList());
    }
    public List<VeiculoInterface> listarCaminhoes(){
        return veiculos.stream().filter(v -> v instanceof Caminhao).collect(Collectors.toList());
    }
    public List<VeiculoInterface> listarAvioes(){
        return veiculos.stream().filter(v -> v instanceof Aviao).collect(Collectors.toList());
    }

    public List<VeiculoInterface> listarPorMarca(String marca){
        return veiculos.stream().filter(v -> v.getMarca().equals(marca)).collect(Collectors.toList());
    }
    public List<VeiculoInterface> listarPorAno(int ano){
        return veiculos.stream().filter(v -> v.getAno() == ano).collect(Collectors.toList());

    }
    public List<VeiculoInterface> listarPorAno(int anoInicial, int anoFinal){
        return veiculos.stream().filter(v -> v.getAno() >= anoInicial && v.getAno() <= anoFinal).collect(Collectors.toList());
    }

    private void populateVeiculos() {
        addVeiculo((new Carro(100000.0, "Tesla", 2020, "series x", 0.0, 4, false, 7)));
    }
    
}