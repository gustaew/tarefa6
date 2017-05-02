package model;

public class Empresa {
	private String cnpj;
	private String razaoSocial;
	private int temperatura;
	private String horarioInicio;
	private String horarioFim;
	private String horarioArInicio;
	private String horarioArFim;

	public Empresa(String cnpj, String razaoSocial, int temperatura, String horarioInicio, String horarioFim,
			String horarioArInicio, String horarioArFim) {
		setCNPJ(cnpj);
		setRazaoSocial(razaoSocial);
		setTemperatura(temperatura);
		setHorarioInicio(horarioInicio);
		setHorarioFim(horarioFim);
		setHorarioArInicio(horarioArInicio);
		setHorarioArFim(horarioArFim);
	}

	public String toString() {
		return "[ " + cnpj + " " + razaoSocial + " " + temperatura + " " + horarioInicio + " " + horarioFim + " "
				+ horarioArInicio + " " + horarioArInicio + " ]";

	}

	public Empresa() {
		setCNPJ("");
		setRazaoSocial("");
		setTemperatura(0);
		setHorarioInicio("");
		setHorarioFim("");
		setHorarioArInicio("");
		setHorarioArFim("");
	}

	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public void setHorarioFim(String horarioFim) {
		this.horarioFim = horarioFim;
	}

	public void setHorarioArInicio(String horarioArInicio) {
		this.horarioArInicio = horarioArInicio;
	}

	public void setHorarioArFim(String horarioArFim) {
		this.horarioArFim = horarioArFim;
	}

	public String getCNPJ() {
		return cnpj;
	}

	public String getCNPJNaoEstatico() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public String getHorarioInicio() {
		return horarioInicio;
	}

	public String getHorarioFim() {
		return horarioFim;
	}

	public String getHorarioArInicio() {
		return horarioArInicio;
	}

	public String getHorarioArFim() {
		return horarioArFim;
	}

}
