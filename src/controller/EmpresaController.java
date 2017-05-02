package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Empresa;
import service.EmpresaService;

@WebServlet("/empresa")
public class EmpresaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpresaController() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String funcao = request.getParameter("opcao");

		switch (funcao) {

		case "Salvar Empresa": {

			try {
				String cnpj = request.getParameter("cnpj");
				String razaoSocial = request.getParameter("razao_social");
				String horarioInicio = request.getParameter("horario_Inicio");
				String horarioFim = request.getParameter("horario_Fim");
				String horarioArInicio = request.getParameter("horario_ArInicio");
				String horarioArFim = request.getParameter("horario_ArFim");
				int temperatura = Integer.parseInt(request.getParameter("Artemperatura"));

				EmpresaService servico = new EmpresaService();
				Empresa empresa = new Empresa(cnpj, razaoSocial, temperatura, horarioInicio, horarioFim,
						horarioArInicio, horarioArFim);

				if (servico.criarEmpresa(empresa)) {

					request.setAttribute("empresa", empresa);
					RequestDispatcher view = request.getRequestDispatcher("EmpresaCadastrada.jsp");
					view.forward(request, response);

				}
			} catch (Exception e) {
				RequestDispatcher view = request.getRequestDispatcher("EmpresaCadastradaErro.jsp");
				view.forward(request, response);
			}

		}
			break;
		case "Consultar Empresa": {

			String cnpj = request.getParameter("cnpj");
			EmpresaService servico = new EmpresaService();
			Empresa empresa = servico.ConsultarEmpresa(cnpj);

			if (!empresa.getCNPJ().isEmpty()) {

				request.setAttribute("empresa", empresa);
				RequestDispatcher view = request.getRequestDispatcher("ConsultarEmpresa.jsp");
				view.forward(request, response);

			} else {
				RequestDispatcher view = request.getRequestDispatcher("ConsultarEmpresaErro.jsp");
				view.forward(request, response);
			}

		}
			break;
		case "Salvar Alterações": {

			try {
				String cnpj = request.getParameter("cnpj");
				String razaoSocial = request.getParameter("razao_social");
				String horarioInicio = request.getParameter("horario_Inicio");
				String horarioFim = request.getParameter("horario_Fim");
				String horarioArInicio = request.getParameter("horario_ArInicio");
				String horarioArFim = request.getParameter("horario_ArFim");
				int temperatura = Integer.parseInt(request.getParameter("Artemperatura"));

				Empresa empresa = new Empresa(cnpj, razaoSocial, temperatura, horarioInicio, horarioFim,
						horarioArInicio, horarioArFim);

				EmpresaService servico = new EmpresaService();

				if (servico.atualizarEmpresa(empresa)) {

					empresa = servico.ConsultarEmpresa(cnpj);
					request.setAttribute("empresa", empresa);
					RequestDispatcher view = request.getRequestDispatcher("ConsultarEmpresa.jsp");
					view.forward(request, response);
				}

			} catch (Exception e) {
				RequestDispatcher view = request.getRequestDispatcher("AtualizarEmpresaErro.jsp");
				view.forward(request, response);
			}

		}
			break;

		case "Excluir Empresa": {

			String cnpj = request.getParameter("cnpj");
			Empresa empresa = new Empresa();
			empresa.setCNPJ(cnpj);

			EmpresaService servico = new EmpresaService();

			if (servico.excluirEmpresa(empresa.getCNPJ())) {

				request.setAttribute("empresa", empresa);
				RequestDispatcher view = request.getRequestDispatcher("ExcluirEmpresa.jsp");
				view.forward(request, response);

			} else {

				RequestDispatcher view = request.getRequestDispatcher("ExcluirEmpresaErro.jsp");
				view.forward(request, response);
			}

		}
			break;

		}
	}

}
