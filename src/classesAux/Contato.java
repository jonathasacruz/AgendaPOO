package agenda;

public class Contato {
	private String nome;
	private String telefone;
	private String e_mail;
	private String empresa;
	private String setor;
	
	public Contato(String nome, String telefone, String e_mail, String empresa, String setor) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.e_mail = e_mail;
		this.empresa = empresa;
		this.setor = setor;
	}
	public Contato() {
		this.nome = "";
		this.telefone = "";
		this.e_mail = "";
		this.empresa = "";
		this.setor = "";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	

}