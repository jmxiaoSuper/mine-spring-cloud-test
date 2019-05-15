package com.spring.boot.test.test.mybatis.plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.spring.boot.test.entity.CashAccount;
import com.spring.boot.test.mapper.CashAccountMapper;
import com.spring.boot.test.server.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jm.xiao
 * @date 2019/4/29
 */
@Rollback
@Transactional
public class TestMybatisPlus extends TestBase {

	@Autowired
	private CashAccountMapper cashAccountMapper;

	@Test
	public void testSelect() {
		List<CashAccount> userList = cashAccountMapper.selectList(null);
		Assert.assertEquals(11, userList.size());
		userList.forEach(System.out::println);
	}

	@Test
	public void testCondition(){
		CashAccount userList22 = cashAccountMapper.selectOne(
				new QueryWrapper<CashAccount>()
						.lambda()
						.eq(CashAccount::getAccId, "33"));

		System.out.println(userList22);

	}

	@Test
	public void testCustom() {
		List<CashAccount> cashAccounts = cashAccountMapper.customQuery();
		Assert.assertNotNull(cashAccounts);
		cashAccounts.forEach(System.out::println);

		System.out.println("=============================================");
		cashAccounts = cashAccountMapper.customQuery2();
		Assert.assertNotNull(cashAccounts);
		cashAccounts.forEach(System.out::println);
	}


	@Test
	public void delete() {
		QueryWrapper<CashAccount> queryWrapper = new QueryWrapper<>();
		queryWrapper.ge("accid", "33");
		int delete = cashAccountMapper.delete(queryWrapper);
		System.out.println("delete return count = " + delete);
	}


	/**
	 * <p>
	 * 根据 entity 条件，查询全部记录（并翻页）
	 * </p>
	 *
	 *  page         分页查询条件（可以为 RowBounds.DEFAULT）
	 *  queryWrapper 实体对象封装操作类（可以为 null）
	 *  分页要增加插件
	 *  @see com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
	 */
	@Test
	public void selectPage() {
		Page<CashAccount> page = new Page<>(1, 5);
		QueryWrapper<CashAccount> queryWrapper = new QueryWrapper<>();

		IPage<CashAccount> userIPage = cashAccountMapper.selectPage(page, queryWrapper);
		userIPage.getRecords().forEach(System.out::println);
	}



	/**
	 * <p>
	 * 根据 whereEntity 条件，更新记录
	 * </p>
	 *
	 *  entity        实体对象 (set 条件值,不能为 null)
	 *  updateWrapper 实体对象封装操作类（可以为 null,里面的 entity 用于生成 where 语句）
	 */
	@Test
	public void update() {

		//修改值
		CashAccount cashAccount = new CashAccount();
		cashAccount.setAccId("33").setRemark("TestTest");

		//修改条件s
		UpdateWrapper<CashAccount> userUpdateWrapper = new UpdateWrapper<>();
		userUpdateWrapper.eq("accid", "33");

		int update = cashAccountMapper.update(cashAccount, userUpdateWrapper);

		System.out.println(update);
	}


}
