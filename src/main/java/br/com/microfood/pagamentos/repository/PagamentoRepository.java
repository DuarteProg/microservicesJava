package br.com.microfood.pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.microfood.pagamentos.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
