public class Caminhao implements VeiculoInterface{
    private Double preco;
    private String marca;
    private int ano;
    private String modelo;
    private Double consumo;
    private Double capacidadeDeCarga;
    private int NDeEixos;

    public Caminhao(Double preco, String marca, int ano, String modelo, Double consumo, Double capacidadeDeCarga, int NDeEixos){
		this.preco = preco;
		this.marca = marca;
		this.ano = ano;
		this.modelo = modelo;
		this.consumo = consumo;
		this.capacidadeDeCarga = capacidadeDeCarga;
        this.NDeEixos = NDeEixos;
	}
    
    public Double getPreco(){
        return this.preco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Double getConsumo(){
        return this.consumo;
    }
    public void setConsumo(Double kmPorLitro){
        this.consumo = kmPorLitro;
    }

    public Double getCapacidadeDeCarga(){
        return this.capacidadeDeCarga;
    }
    public void setCapacidadeDeCarga(Double capacidadeDeCarga){
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getNDeEixos(){
        return this.NDeEixos;
    }
    public void setNDeEixos(int eixos){
        this.NDeEixos = eixos;
    }

    @Override
    public String toString() {
        return "Caminhao:" +
                "preco='" + this.preco +
                ", marca=" + this.marca +
                ", modelo=" + this.modelo +
                ", ano=" + this.ano +
                ", consumo=" + this.consumo +
                ", capacidade de carga=" + this.capacidadeDeCarga +
                ", Numero de eixos=" + this.NDeEixos;
    }
}
