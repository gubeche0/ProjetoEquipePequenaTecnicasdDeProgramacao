public class Carro implements VeiculoInterface {
    private Double preco;
	private String marca;
	private int ano;
	private String modelo;
	private Double consumo;
    private int numPortas;
    private boolean tetoSolar;
    private int numAssentos;

    // Construtor
    public Carro(Double preco, String marca, int ano, String modelo, Double consumo, int numPortas, boolean tetoSolar, int numAssentos){
        this.preco = preco;
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.consumo = consumo;
        this.numPortas = numPortas;
        this.tetoSolar = tetoSolar;
        this.numAssentos = numAssentos;
    }
    // Getters
    public Double getPreco(){
        return this.preco;
    }
    public String getMarca(){
		return this.marca;
	}
	public int getAno(){
		return this.ano;
	}
	public String getModelo(){
		return this.modelo;
	}
	public Double getConsumo(){
		return this.consumo;
	}
    public int getNumPortas(){
        return this.numPortas;
    }
    public boolean getTetoSolar(){
        return this.tetoSolar;
    }
    public int getAssentos(){
        return this.numAssentos;
    }

    // Setters
    public void setPreco(Double novoPreco){
		this.preco = novoPreco;
	}
	public void setMarca(String novaMarca){
		this.marca = novaMarca;
	}
	public void setAno(int novoAno){
		this.ano = novoAno;
	}
	public void setModelo(String novoModelo){
		this.modelo = novoModelo;
	}
	public void setConsumo(Double kmPorLitro){
		this.consumo = kmPorLitro;
	}
    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
    public void setTetoSolar(boolean tetoSolar){
        this.tetoSolar = tetoSolar;
    }
    public void setAssentos(int numAssentos){
        this.numAssentos = numAssentos;
    }

    public String toString(){
		return "preco = " + getPreco() + ", marca = " + getMarca() + ", modelo = " + getModelo() + ", ano = " + getAno() + ", consumo = " + getConsumo() + ", portas = " + getNumPortas() + ", teto solar = " + getTetoSolar() + ", assentos = " + getAssentos();
	}

}