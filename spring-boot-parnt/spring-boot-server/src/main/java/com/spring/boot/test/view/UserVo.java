package com.spring.boot.test.view;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;

/**
 * @author jm.xiao
 * @date 2019/5/9
 */
@Data
@Accessors(chain = true)
public class UserVo {

	@NotBlank(message = "用户信息不能为空")
	@Length(max = 10, message = "用户名太长")
	private String userName;
	@Range(min = 10, max = 100, message = "年龄在10~100之间")
	private int age;
}
