package oracle.sql;

import java.sql.Connection;
import java.sql.SQLException;

public interface ORAData {
	Datum toDatum(Connection paramConnection) throws SQLException;
}
