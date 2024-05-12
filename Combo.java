public class Combo {
	
	private Burguer burguer;
	private Bebida bebida;
	private Sobremesa sobremesa;
	private int tipo;
	
	public Combo(){
		Burguer carne = new Burguer();
		Bebida coca = new Bebida();
		Sobremesa doce = new Sobremesa();
	}
	
	public void Combo1 () {
		burguer.descricao("Sanduiche de carne");
		burguer.gramas(150);
		burguer.preco(40);
		bebida.descricao("Coquinha gelada");
		bebida.ml(500);
		bebida.preco(15);
		sobremesa.descricao("sorvete de chocolate");
		sobremesa.preco(2);
		sobremesa.tamanho("Medio");
	}
	
	public void exibirCombo1() {
		System.out.println("Seu combo e' um burguer de carne, uma coca de 500ml e uma casquinha de chocolate media, o valor e' R$57,00");
	}
	
	public void Combo2() {
		burguer.descricao("Sanduiche de Frango");
		burguer.gramas(150);
		burguer.preco(30);
		bebida.descricao("Suco");
		bebida.ml(300);
		bebida.preco(7);
		sobremesa.descricao("Petit Gateau");
		sobremesa.preco(15);
		sobremesa.tamanho("Grande");
		}
		
		public void exibirCombo2(){
		System.out.println("Seu combo e' um sanduiche de Frango de 150g, um suco de 300ml e um Petit Gateau, o valor e' R$52,00");
	}
		
		public void CriarCombo(int tipo) {
			if(tipo == 1) {
				exibirCombo1();
			}else
			{
				exibirCombo2();
			}
		}
}
