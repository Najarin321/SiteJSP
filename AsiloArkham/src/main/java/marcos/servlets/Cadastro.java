package marcos.servlets;

import br.com.marcos.classes.Sec;
import br.com.marcos.classes.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import com.google.protobuf.TextFormat.ParseException;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/cadastro")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Cadastro()
	{
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("erro");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		try {
			
			String nome = request.getParameter("nome");
			String cpf = request.getParameter("cpf");
			String data_text = request.getParameter("data_nasc");
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			String senhaCheck = request.getParameter("senhaRepetir");
			
			if (nome == null || nome.equals("")) {
				request.setAttribute("atr_nome", nome);
				
				request.getRequestDispatcher("erro.jsp").forward(request, response);
			}
			
			if (!senha.equals(senhaCheck)) {
				request.setAttribute("atr_senhaDiferente", nome);
				request.getRequestDispatcher("erro.jsp").forward(request, response);
			}

			Sec gerasenha = new Sec(senha);
			
			out.print(gerasenha.getMessageDigest());
			
			//if(!senha.matches("")) {
			//	out.print("Senha n�o atende aos crit�rios");
			//}
			
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(data_text);
			
			Usuario u1 = new Usuario(nome, cpf, data, email, gerasenha);
			
			request.setAttribute("atr_cadastro", u1);
			request.getRequestDispatcher("cadastroUsuario.jsp").forward(request, response);
			
		
		}
		catch (ParseException e) {
			out.print("Erro: " + e.getMessage());
		}
		
		catch (Exception e) {
			out.print("Erro: " + e.getMessage());
		}
		
		
		
	}

}