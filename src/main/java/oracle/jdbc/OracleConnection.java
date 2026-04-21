package oracle.jdbc;

public interface OracleConnection {

	oracle.jdbc.internal.OracleConnection physicalConnectionWithin();
	
}
