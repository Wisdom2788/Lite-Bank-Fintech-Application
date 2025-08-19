package dev.litebank;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LiteBankApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	void testCanConnectToDatabase(){
		try(HikariDataSource hikariDataSource = new HikariDataSource()){
			hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/LiteBank");
			hikariDataSource.setUsername("root");
			hikariDataSource.setPassword("Donwizzy2788");
			Connection connection = hikariDataSource.getConnection();

			assertNotNull(connection);
		}catch (Exception exception){
			assertNull(exception);
		}
	}

}