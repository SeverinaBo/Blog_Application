package com.severinaBo.Blog_Application;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

	@Test
	public String print(){
		System.out.println("hellooo");
		return "hellooo";
	}

}
