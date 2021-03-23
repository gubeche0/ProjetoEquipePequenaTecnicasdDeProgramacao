public class caminhao implements VeiculoInterface{
    private Double preco;
    private String marca;
    private int ano;
    private String modelo;
    private Double consumo;

    private Double capacidadeDeCarga;
    private int NDeEixos;
    
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
    public Void setConsumo(String kmPorLitro){
        this.consumo = Double.parseDouble(kmPorLitro);
        return null;
    }

    public Double getCapacidadeDeCarga(){
        return this.capacidadeDeCarga;
    }
    public Void setCapacidadeDeCarga(Double capacidadeDeCarga){
        this.capacidadeDeCarga = capacidadeDeCarga;
        return null;
    }

    public int getNDeEixos(){
        return this.NDeEixos;
    }
    public Void setNDeEixos(int eixos){
        this.NDeEixos = eixos;
        return null;
    }


}
