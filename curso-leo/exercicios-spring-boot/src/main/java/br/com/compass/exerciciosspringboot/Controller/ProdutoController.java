package br.com.compass.exerciciosspringboot.Controller;

import br.com.compass.exerciciosspringboot.model.entities.Produto;
import br.com.compass.exerciciosspringboot.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto salvarProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping("/nome/{parteNome}")
    public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome){
        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }


    /**@GetMapping(path = "/pagina/{numeroPagina}")
    public Iterable<Produto> obterProdutosPorPagina(
            @PathVariable int numeroPagina){
        Pageable page = PageRequest.of(0, 3);
        return produtoRepository.findAll(page);
    }**/

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id){
        return produtoRepository.findById(id);
    }

    /**@PutMapping
    public Produto alterarProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }**/

    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }
}
