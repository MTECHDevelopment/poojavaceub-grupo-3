import java.util.ArrayList;

public class ProdutoRepository {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    // CREATE
    public void adicionarProduto(Produto p) {
        produtos.add(p);
        System.out.printf("Produto %s adicionado com sucesso.\n", p.getNome());
    }

    // READ (listar todos)
    public ArrayList<Produto> listarProdutos() {
        return produtos; // simples (em produção, prefira devolver cópia)
    }
    
    public Produto buscarPorNomeProduto(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);         
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }

    public Produto buscarPorIdProduto(int id) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    // UPDATE
    public boolean atualizarProduto(String nomeAtual,String novoNome, double novoPreco) {
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

    public boolean atualizarPorIdProduto(int id, String novoNome, double novoPreco) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getId() == id) {
                p.setNome(novoNome);
                p.setPreco(novoPreco);
                produtos.set(i, p);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean removerPorNomeProduto(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(i); // remove pelo índice
                return true;
            }
        }
        return false;
    }

    public boolean removerPorIdProduto(int id) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == id) {
                produtos.remove(i); // remove pelo índice
                return true;
            }
        }
        return false;
    }

}