package br.com.virtus.servlets;

import br.com.virtus.classes.Paciente;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "ServletCadastroPaciente", urlPatterns = "/cadastroPaciente")
public class ServletCadastroPaciente extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String nome = request.getParameter("nome");
            String cpf = request.getParameter("cpf");
            String dataNascimento = request.getParameter("dt_nasc");
            String email = request.getParameter("email");

            SimpleDateFormat datas = new SimpleDateFormat("yyyy/MM/dd");

            Date data = datas.parse(dataNascimento);

            Paciente paciente = new Paciente(nome,cpf, data, email);

            String cadastroJson = new Gson().toJson(paciente);

            PrintWriter out = response.getWriter();
            request.setAttribute("att_cadastro",cadastroJson);
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");

            out.print(cadastroJson);
            out.flush();

            //request.getRequestDispatcher("").forward(request,response);
        }
        catch(Exception e){
            throw e;
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
