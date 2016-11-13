package aula08_Facades_Singletons;

public class Progama {
	public static void main(String[] args) {
		
		//EmpresaFacade facede = new EmpresaFacade();
		EmpresaFacade facede = new EmpresaFacadeSingleton().getInstancia(); //com singleton
		facede.buscaCliente(cpf);
		facede.buscaCliente(cliente,valor);
	}
}
