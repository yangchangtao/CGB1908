package com.cy.pi.goods.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface GoodsDao {
	//删除一条数据。
    @Delete("delete from tb_goods where id=#{id}")
    int deleteById(Integer id);
    //删除许多数据。
	int deleteObjects(@Param("ids")Integer...ids);
	
}
