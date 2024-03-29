package model;

import java.util.List;

public class Sensor {

	private int sensor_id;
	private String descricao;
	private String unidade;
	private Double bits;
	private Double intervalo;
	private Double shift;
	private Double inicioBits;
	private String dataHoraReferencia;
	private String posicao;
	private String timeStamp;
	private List<Double> valoresSensor;

	public int getSensor_id() {
		return sensor_id;
	}

	public void setSensor_id(int sensor_id) {
		this.sensor_id = sensor_id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public Double getBits() {
		return bits;
	}

	public void setBits(Double bits) {
		this.bits = bits;
	}

	public Double getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(Double intervalo) {
		this.intervalo = intervalo;
	}

	public Double getShift() {
		return shift;
	}

	public void setShift(Double shift) {
		this.shift = shift;
	}

	public Double getInicioBits() {
		return inicioBits;
	}

	public void setInicioBits(Double inicioBits) {
		this.inicioBits = inicioBits;
	}

	public String getDataHoraReferencia() {
		return dataHoraReferencia;
	}

	public void setDataHoraReferencia(String dataHoraReferencia) {
		this.dataHoraReferencia = dataHoraReferencia;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public List<Double> getValoresSensor() {
		return valoresSensor;
	}

	public void setValoresSensor(List<Double> valoresSensor) {
		this.valoresSensor = valoresSensor;
	}

}
