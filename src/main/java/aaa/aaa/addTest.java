package aaa.aaa;

import org.junit.jupiter.api.Test;

class addTest {

	@Test
	void test() {
		adder add = new adder();
		int num=add.addition(10, 20);
		System.out.println(num);
	}

}