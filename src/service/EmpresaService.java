package service;

import dao.EmpresaDAO;
import model.Empresa;

public class EmpresaService {

	private EmpresaDAO dao = new EmpresaDAO();

	public boolean criarEmpresa(Empresa empresa) {
		return dao.cadastrar(empresa);
	}

	public Empresa ConsultarEmpresa(String cnpj) {
		return dao.consultar(cnpj);
	}

	public boolean atualizarEmpresa(Empresa empresa) {
		return dao.atualizar(empresa);
	}

	public boolean excluirEmpresa(String cnpj) {
		return dao.excluir(cnpj);
	}

}
