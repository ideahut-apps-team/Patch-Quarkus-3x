package oracle.jdbc.internal;

import java.sql.SQLException;
import java.util.Properties;

public interface OracleConnection extends oracle.jdbc.OracleConnection {

	String getProtocolType();
	Properties getOCIHandles() throws SQLException;
	
}
