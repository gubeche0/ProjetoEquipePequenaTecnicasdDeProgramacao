/**
 * VeiculoInterface
 */
public interface VeiculoInterface {
    Double getPreco();
    void setPreco(Double preco);

    String getMarca();
    void setMarca(String marca);

    int getAno();
    void setAno(int ano);

    String getModelo();
    void setModelo(String modelo);

    Double getConsumo();
    void setConsumo(Double kmPorLitro);

}