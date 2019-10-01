package model;

public class Pedido {
	

	private String matricula;
	private String tamanho;
	private String cor_CMYK;
	private int qtd_camisas;
	
		
	public Pedido(String m, String t, String c, int q) {
		this.matricula = m;
		this.tamanho = t;
		this.cor_CMYK = c;
		this.qtd_camisas = q;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor_CMYK() {
		return cor_CMYK;
	}
	public void setCor_CMYK(String cor_CMYK) {
		this.cor_CMYK = cor_CMYK;
	}
	public int getQtd_camisas() {
		return qtd_camisas;
	}
	public void setQtd_camisas(int qtd_camisas) {
		this.qtd_camisas = qtd_camisas;
	}
		

}
