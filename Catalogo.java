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
        addVeiculo((new Carro(100000.0, "Volkswagen", 2019, "Gol", 12.7, 4, false, 5)));
        addVeiculo((new Carro(163490.0, "Ford", 2021, "Ford Ranger", 10.3, 2, false, 2)));
        addVeiculo((new Carro(183290.0, "Toyota", 2021, "Corolla cross", 10.3, 2, true, 5)));

        addVeiculo((new Caminhao(400000.0, "Ford", 2017, "Ford Cargo 2429", null, 15935.0, 6)));
        addVeiculo((new Caminhao(139000.0, "Volkswagen", 2012, "Vw 8.159 TVB-IC 4x2", null, 8000.0, 4)));
        addVeiculo((new Caminhao(199300.0, "Ford", 2019, "F 4000", null, 3949.0, 4)));

        addVeiculo((new Aviao(20000000.0, "Boeing", 1967, "737", 45.0, 12500, 215, 49190, "turbojato")));
        addVeiculo((new Aviao(2500000.0, "Beechcraft", 2018, "King AIR 350i", 45.0, 2750, 11, 2334, "turboélice")));
    }
    
}