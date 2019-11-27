package com.cy;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.pi.goods.dao.GoodsDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsDaoTest {
 @Autowired
private GoodsDao goodsDao;
 @Test
 public void testDeleteById() {
	 int rows=goodsDao.deleteById(10);
	 System.out.println("rows="+rows);
	 
 }
 @Test
 public void testDeleteObjects() {
	 int rows=goodsDao.deleteObjects(14,16);
	 System.out.println(rows);
 }
 
}
