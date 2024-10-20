package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionado lanche natural hamburger no balcão");
	}
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionado suco no balcao");
	}
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("Preparando lanche tipo Hamburguer");
	}
	private void prepararVitamina() {
		System.out.println("Preparando suco");
	}
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("Selecionado o pão, salada, ovo e carne");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionado fruta, leite e suco");
	}
	private void lavarIngredientes() {
		System.out.println("Lavando Ingredientes");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("Batendo vitamina liquidificador");
	}
	private void fritarIngredientesLanche() {
		System.out.println("Fritando a carne e ovo para o hamburguer");
	}
	
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
