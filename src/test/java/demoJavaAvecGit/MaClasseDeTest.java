package demoJavaAvecGit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaClasseDeTest {
	
	FonctionMathematiques fct;
	
	@BeforeEach
	void avantChaqueTest() {
		fct=new FonctionMathematiques();
	}

	@AfterEach
	void apresChaqueTest() {
		fct=null;
	}
	
	@BeforeAll
	static void apresLeDernierTest1() {
		//excecute 1 fois avant le premier Test
	}
	
	@AfterAll
	static void apresLeDernierTest() {
		//excecute 1 fois après le dernier Test
	}

	@Test
	void additionTest() {
		assertEquals(10, fct.addition(2,8));

		assertEquals(15, fct.addition(10,5));
	}
	
	@Test
	void factorielleTest() {
		
		assertEquals(6, fct.factorielle(3));
	}
	
	@Test
	void factorielleExceptionTest() {
		// est ce qu'un traitemment déclenche bien une exception
		
		assertThrows(FactorielleException.class,()->{
			fct.factorielle(-1);
		});
	}
	
}
