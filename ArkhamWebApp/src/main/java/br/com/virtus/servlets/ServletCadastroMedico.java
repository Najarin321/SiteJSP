package br.com.virtus.servlets;

import br.com.virtus.classes.Medico;
import com.google.gson.Gson;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCadastroMedico", urlPatterns = "/cadastroMedico")

public class ServletCadastroMedico extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try {
            String nome = request.getParameter("nome");
            String crm = request.getParameter("crm");
            String especialidade = request.getParameter("especialidade");

            Medico medico = new Medico(nome,crm,especialidade);

            String cadastroJson = new Gson().toJson(medico);

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

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //use get to open via servlet
        request.getRequestDispatcher("/WEB-INF/views/cadastroMedico.jsp").forward(request,response);
    }
}
