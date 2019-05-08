package com.spring.boot.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spring.boot.test.entity.CashAccount;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jm.xiao
 * @date 2019/4/29
 */
@Repository
public interface CashAccountMapper extends BaseMapper<CashAccount> {

	/**
	 * 自定义查询
	 * @return
	 */
	List<CashAccount> customQuery();


	/**
	 * 注解查询
	 * @return
	 */
	@Select("select * from ttrd_acc_cash")
	List<CashAccount> customQuery2();
}
