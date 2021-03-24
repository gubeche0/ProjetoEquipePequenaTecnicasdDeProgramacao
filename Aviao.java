/**
 * Classe Aviao
 */
public class Aviao implements VeiculoInterface {

	private double preco;
	private String marca;
	private int ano;
	private String modelo;
	private Double consumo;
	private int alturaMaxima;
	private int capacidadePassageiros;
	private int capacidadeCarga;
	private String tipo;

	// Construtor
	public Aviao(Double preco, String marca, int ano, String modelo, Double consumo, int alturaMaxima, int capacidadePassageiros, int capacidadeCarga, String tipo){
		this.preco = preco;
		this.marca = marca;
		this.ano = ano;
		this.modelo = modelo;
		this.consumo = consumo;
		this.alturaMaxima = alturaMaxima;
		this.capacidadePassageiros = capacidadePassageiros;
		this.capacidadeCarga = capacidadeCarga;
		this.tipo = tipo;
	}

	// Getters e setters
	public Double getPreco(){
		return this.preco;
	}
	public void setPreco(Double novoPreco){
		this.preco = novoPreco;
	}

	public String getMarca(){
		return this.marca;
	}
	public void setMarca(String novaMarca){
		this.marca = novaMarca;
	}

	public int getAno(){
		return this.ano;
	}
	public void setAno(int novoAno){
		this.ano = novoAno;
	}

	public String getModelo(){
		return this.modelo;
	}
	public void setModelo(String novoModelo){
		this.modelo = novoModelo;
	}

	public Double getConsumo(){
		return this.consumo;
	}
	public void setConsumo(Double kmPorLitro){
		this.consumo = kmPorLitro;
	}


	public int getAlturaMaxima(){
		return this.alturaMaxima;
	}
	public void setAlturaMaxima(int nova){
		this.alturaMaxima = nova;
	}

	public int getCapacidadePassageiros(){
		return this.capacidadePassageiros;
	}
	public void setCapacidadePassageiros(int nova){
		this.capacidadePassageiros = nova;
	}

	public int getCapacidadeCarga(){
		return this.capacidadeCarga;
	}
	public void setCapacidadeCarga(int nova){
		this.capacidadeCarga = nova;
	}

	public String getTipo(){
		return this.tipo;
	}
	public void setTipo(String novoTipo){
		this.tipo = novoTipo;
	}

}
