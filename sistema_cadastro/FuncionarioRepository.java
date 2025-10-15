import java.util.ArrayList;

public class FuncionarioRepository {
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private int proximoId = 1; // Contador de IDs

    public Funcionario adicionar(Funcionario f) {
        f.setId(proximoId);      // Define o ID
        proximoId++;             // Incrementa para o próximo
        funcionarios.add(f);
        return f;                // Retorna o objeto com ID
    }

    // private int proximoId = 1; // Contador de IDs
    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
        System.out.printf("Funcionário %s adicionado com sucesso.\n", f.getNome());
    }

    // READ (listar todos)
    public ArrayList<Funcionario> listarFuncionarios() {
        return funcionarios; // simples (em produção, prefira devolver cópia)
    }

    public Funcionario buscarPorNomeFuncionario(String nome) {
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            if (f.getNome().equals(nome)) {
                return f;
            }
        }
        return null;
    }

    public Funcionario buscarPorIdFuncionario(int id) {
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    // UPDATE
    public boolean atualizarFuncionario(String nomeAtual,String novoNome, double novoSalario) {
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            if (f.getNome().equals(nomeAtual)) {
                f.setNome(novoNome);
                f.setSalario(novoSalario);
                funcionarios.set(i, f);
                return true;
            }
        }
            return false;


    }

    public boolean atualizarPorIdFuncionario(int id, String novoNome, double novoSalario) {
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            if (f.getId() == id) {
                f.setNome(novoNome);
                f.setSalario(novoSalario);
                funcionarios.set(i, f);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean removerPorNomeFuncionario(String nome) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNome().equals(nome)) {
                funcionarios.remove(i); // remove pelo índice
                return true;
            }
        }
        return false;
    }

    public boolean removerPorIdFuncionario(int id) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == id) {
                funcionarios.remove(i); // remove pelo índice
                return true;
            }
        }
        return false;
    }

}