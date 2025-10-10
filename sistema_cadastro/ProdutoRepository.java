import java.util.ArrayList;

public class ProdutoRepository {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    // CREATE
    public void adicionar(Produto p) {
        produtos.add(p);
    }

    // READ (listar todos)
    public ArrayList<Produto> listar() {
        return produtos; // simples (em produção, prefira devolver cópia)
    }
    
    public Produto buscarPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);         
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }

    // UPDATE
    public boolean atualizar(String nomeAtual,String novoNome, double novoPreco) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getNome().equals(nomeAtual)) { 
                p.setNome(novoNome);
                p.setPreco(novoPreco);
                produtos.set(i, p);
                return true;
            }
        }
            return false;


    }

    // DELETE
    public boolean removerPorNome(int nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(i); // remove pelo índice
                return true;
            }
        }
        return false;
    }
}