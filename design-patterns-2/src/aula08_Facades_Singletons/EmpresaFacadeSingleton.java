package aula08_Facades_Singletons;

public class EmpresaFacadeSingleton {
	
	private static EmpresaFacade instancia;

    public EmpresaFacade getInstancia() {
        if(instancia == null) {
            instancia = new EmpresaFacade();
        }

        return instancia;
    }
}
