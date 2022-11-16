package com.javassem.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Data
// 생성자함수를 사용할경우 아래와 같이 선언 Data에는 @AllArgsConstructor가 포함되지않는다.
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SampleVO {
	
	private String name;
	private Integer age;
	private String message;

}
