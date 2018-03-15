import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumPerformerTest {
	public SumPerformer sumPerformer = new SumPerformer();
	
	@Test
	void testUniqueSumUnique() {
		int x = 1;
		int y = 2;
		int z = 3;
		
		int expectedResult = 6;
		
		assertEquals(expectedResult, sumPerformer.uniqueSum(x, y, z));
	}
	
	@Test
	void testUniqueSumFirstTwoSame() {
		int x = 2;
		int y = 2;
		int z = 1;
		
		int expectedResult = 1;
		
		assertEquals(expectedResult, sumPerformer.uniqueSum(x, y, z));
	}

	@Test
	void testUniqueSumSecondTwoSame() {
		int x = 1;
		int y = 2;
		int z = 2;
		
		int expectedResult = 1;
		
		assertEquals(expectedResult, sumPerformer.uniqueSum(x, y, z));
	}
	
	@Test
	void testUniqueSumFirstLastSame() {
		int x = 2;
		int y = 1;
		int z = 2;
		
		int expectedResult = 1;
		
		assertEquals(expectedResult, sumPerformer.uniqueSum(x, y, z));
	}
	
	@Test
	void testUniqueSumAllSame() {
		int x = 2;
		int y = 2;
		int z = 2;
		
		int expectedResult = 0;
		
		assertEquals(expectedResult, sumPerformer.uniqueSum(x, y, z));
	}
	
	
}
