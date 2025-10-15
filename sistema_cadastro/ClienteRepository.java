import java.util.ArrayList;

public class ClienteRepository {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private int proximoId = 1;

    // Adicionar (CREATE)
    public Cliente adicionar(Cliente c) {
        c.setId(proximoId++);
        clientes.add(c);
        return c;
    }

    // Listar todos (READ)
    public ArrayList<Cliente> listar() {
        return clientes;
    }

    // Buscar por ID
    public Cliente buscarPorId(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                return clientes.get(i);
            }
        }
        return null; // Não encontrado
    }

    // Atualizar (UPDATE)
    public boolean atualizar(int id, String nome, String telefone, String email) {
        Cliente c = buscarPorId(id);
        if (c != null) {
            c.setNome(nome);
            c.setTelefone(telefone);
            c.setEmail(email);
            return true;
        }
        return false;
    }

    // Remover (DELETE)
    public boolean removerPorId(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                clientes.remove(i);
                return true;
            }
        }
        return false;
    }
}