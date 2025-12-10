package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //transforma uma classe em uma entidade do DB
@Table(name = "tb_cadastro") // nome da tabela
@NoArgsConstructor
@AllArgsConstructor
@Data // cria todos os get e set
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gerar automaticamente
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true) // coluna unica no banco de dados
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    // @ManyToOne -> Um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira -> cria uma nova coluna
    private MissoesModel missoes;

}
