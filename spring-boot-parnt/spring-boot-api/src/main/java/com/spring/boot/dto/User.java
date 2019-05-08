package com.spring.boot.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author jm.xiao
 * @date 2019/4/24
 */
@Data
@Accessors(chain = true)
public class User {
	private String name;
	private String address;
}
