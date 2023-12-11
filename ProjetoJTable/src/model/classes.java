package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class classes {
	
	private String nome;//foi
	private Integer quarto;//foi
	private LocalDate data;
    private LocalTime hc;//foi
	private String desc;//foi
	private Integer quantidade;//foi
	private Float unitario;//foi
	private Float total;//foi
	private Float pagom;//foi
	private String metodo;//foi
	private String responsavel;//foi
	private String texto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuarto() {
		return quarto;
	}
	public void setQuarto(Integer quarto) {
		this.quarto = quarto;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Float getUnitario() {
		return unitario;
	}
	public void setUnitario(Float unitario) {
		this.unitario = unitario;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public Float getPagom() {
		return pagom;
	}
	public void setPagom(Float pagom) {
		this.pagom = pagom;
	}
	public String getMetodo() {
		return metodo;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalTime getHc() {
		return hc;
	}
	public void setHc(LocalTime hc) {
		this.hc = hc;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	
	
	
}
