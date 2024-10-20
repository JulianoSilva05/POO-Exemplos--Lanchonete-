package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//Ações que não precisam estarem disponíveis para toda a aplicação
		//cozinheiro.lavarIngredientes();
		//cozinheiro.baterVitaminaLiquidificador();
		//cozinheiro.selecionarIngredientesVitamina();
		//cozinheiro.prepararLanche();
		//cozinheiro.prepararVitamina();
		
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		//Ações que não precisam estarem disponíveis para toda a aplicação
		//almoxarife.controlarEntrada();
		//almoxarife.controlarSaida();
		
		
		
		Atendente atendente = new Atendente();
		//atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento 
		//ainda não definiu normas de atendimento
	
		
		//esta ação é muito sigilosa, que tal ser privada?
		//cliente.consultarSaldoAplicativo();
		
		//já pensou os cliente ouvindo que o gás acabou?
		//cozinheiro.pedirParaTrocarGas(atendente);
		//cozinheiro.pedirParaTrocarGas(almoxarife);
		
		
	}
}
