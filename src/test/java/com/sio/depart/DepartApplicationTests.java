package com.sio.depart;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DepartApplicationTests {

	@Test
	void contextLoads() {
	}

	public static void main(String args[]) {
		String[] house = {"A","c","e","r","Y","F","R","Z","G","a"};
		System.out.println(house.length);
		house[1] = "";
		house[2] = "";
		house[5] = "";

	}
}
