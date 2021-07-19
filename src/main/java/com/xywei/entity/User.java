package com.xywei.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel
public class User {
	
	@ApiModelProperty(value = "用户id")
	private Integer id;
	
	@ApiModelProperty("用户名")
	private String username;
	
	@ApiModelProperty(value = "用户密码")
	private String password;

	

}
