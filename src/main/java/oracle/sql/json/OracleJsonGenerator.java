package oracle.sql.json;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.Period;

public interface OracleJsonGenerator {
	
	OracleJsonGenerator writeStartArray() throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator writeStartObject() throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(boolean value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(double value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(float value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(int value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(long value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(BigInteger value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(Duration value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(LocalDateTime value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(OffsetDateTime value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(Period value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(OracleJsonValue value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(byte[] value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(String value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator write​(BigDecimal value) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator writeEnd() throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator writeKey​(String name) throws OracleJsonException, OracleJsonGenerationException;
	OracleJsonGenerator writeNull() throws OracleJsonException, OracleJsonGenerationException;
	void close();
	
}
