package exceptions;

public class ExcecaoNegocios  extends RuntimeException  {
	private static final  long serialVersionUID = 1L;

	public void ExcecaoNegocios() {
	}
	public ExcecaoNegocios(String msg) {
		super(msg);
	}

}
