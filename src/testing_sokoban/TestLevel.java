package testing_sokoban;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sokoban.Level;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestLevel {

	Level level;
	
	@BeforeEach
	void setUp() {
		this.level = new Level("Level1", 6, 5, 
				"######" +
				"#+x..#" + 
				"#..w.#" + 
				"#....#" +
				"######" );
	}


	@Test
	void testLevelWidth() {
		assertEquals(6, level.width);
	}
	
	@Test
	void testLevelHeight() {
		assertEquals(5, level.height);
	}
	
	@Test
	void testLevelMoveCount() {
		assertEquals(0, level.moveCount);
	}

	@Test
	void testLevelName() {
		assertEquals("Level1", level.name);
	}
	
	@Test
	void testLevelCompletedCount() {
		assertEquals(0, level.completedCount);
	}
	
	@Test
	void testLevelTargetCount() {
		assertEquals(1, level.targetCount);
	}
	
	@Test
	void testLevel_toString() {
		String expected = "Leval1" + "\n"
				+ "######" +"\n"
				+ "#+x..#" + "\n"
				+ "#..w.#" + "\n"
				+ "#....#" + "\n"
				+ "######" + "\n"
				+ "move 0" + "\n"
				+ "completed 0 of 1" + "\n"
				; 
		assertEquals(expected, level.toString());}

	

}
