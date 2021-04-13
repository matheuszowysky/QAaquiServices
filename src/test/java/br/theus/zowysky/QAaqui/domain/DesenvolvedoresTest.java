package br.theus.zowysky.QAaqui.domain;


import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DesenvolvedoresTest {
	@Test
	public void criar() {
		new Desenvolvedores(
				Short.valueOf("105"), 
				"Arnaldo",
				Short.valueOf("35"), 
				LocalDateTime.of(2021, 01, 10, 17, 54));
	}

}
