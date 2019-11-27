package com.cy;



import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.py.common.cache.DefaultCache;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultCacheTest {
@Autowired
private DefaultCache defaultCache;
@Test
public void testCache() {
	System.out.println("defaultCache");
}
@Autowired
private DataSource dataSource;
@Test
public void testDataSource() throws Exception {
	System.out.println( dataSource.getConnection());
	System.out.println(dataSource.getClass());
	
}


	
}
