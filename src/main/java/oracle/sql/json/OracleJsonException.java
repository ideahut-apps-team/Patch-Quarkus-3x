package oracle.sql.json;

public class OracleJsonException extends RuntimeException {
	private static final long serialVersionUID = 7077356231179449712L;

	public OracleJsonException(String message, Throwable cause) {
		super(message, cause);
	}

	public OracleJsonException(String message) {
		super(message);
	}	
	
}
