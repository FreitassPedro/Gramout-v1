package com.pedro.Gramout;

import com.pedro.Gramout.entity.Produto;
import com.pedro.Gramout.entity.Restaurante;
import com.pedro.Gramout.entity.enums.CategoriaPrato;
import com.pedro.Gramout.repository.ProdutoRepository;
import com.pedro.Gramout.repository.RestauranteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class RestauranteRepositoryTest {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
    public void testsSalvarRestauranteComProdutos() {
        Restaurante restaurante1 = new Restaurante();
        restaurante1.setName("Restaurante 1");
        restaurante1.setPhone("123456789");
        restaurante1.setAddress("Rua 1");

        Produto produto1 = new Produto();
        produto1.setName("Prato 1");
        produto1.setPrice(10.0);
        produto1.setDescription("Prato Delicioso");
        produto1.setCategoriaPrato(CategoriaPrato.PRATO_PRINCIPAL);
        produto1.setRestaurante(restaurante1);
        produtoRepository.save(produto1);

        restaurante1.addProduto(produto1);
        restauranteRepository.save(restaurante1);

        Restaurante restauranteSalvo = restauranteRepository.findById(restaurante1.getId()).orElse(null);

        // Verifica se os produtos foram salvos corretamente
        Produto produtoSalvo1 = restauranteSalvo.getProdutos().get(0);
        assertThat(produtoSalvo1.getName()).isEqualTo("Prato 1");
        assertThat(produtoSalvo1.getPrice()).isEqualTo(10.0);
        assertThat(produtoSalvo1.getDescription()).isEqualTo("Prato Delicioso");
    }
}
