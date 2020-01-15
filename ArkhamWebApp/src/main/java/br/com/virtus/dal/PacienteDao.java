package br.com.virtus.dal;

import br.com.virtus.classes.Paciente;

public class PacienteDao extends Dao<Paciente>{

    @Override
    public Paciente include(Paciente paciente) {

        connection.prepareStatement();

    }

    @Override
    public Paciente search(Paciente paciente) {
        return null;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    // incluir

    // buscar

    // excluir
}
