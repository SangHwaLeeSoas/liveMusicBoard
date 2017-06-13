package org.soas.dbTester;


import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class DBTester {

	// 수동 Connection 설정 후 ConnectionTest...
			@Test
			public void connectionTester_1() throws Exception {

				Class.forName("oracle.jdbc.OracleDriver");

				Connection con = DriverManager.getConnection(
						"jdbc:oracle:thin:@127.0.0.1:1521:orcl",
						"SYSTEM",
						"dkfel0608");

				System.out.println(con);

				con.close();
			}
			
			// DataSource Inject.....
			@Autowired
			private DataSource ds;
			
			// root-context에 DataSource 추가 후 ConnectionTest...
			@Test
			public void connectionTester_2() throws Exception {

				Connection con = ds.getConnection();
				System.out.println(con);
				con.close();
			}
}
