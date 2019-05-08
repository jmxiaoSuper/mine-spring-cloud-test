package com.spring.boot.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author jm.xiao
 * @date 2019/4/29
 */
@Data
@Accessors(chain = true)
@TableName("TTRD_ACC_CASH")
public class CashAccount {
	@TableField("accid")
	@TableId(value = "accid", type = IdType.NONE)
	private String accId;
	@TableField("accname")
	private String accName;
	private Integer status;
	private String remark;
	private String pc1;
	private String pc2;
	private String pc3;
	private String pc4;
	private String currency;
	private String investType;
	private String iId;
	private String ppEnvCode;
}
