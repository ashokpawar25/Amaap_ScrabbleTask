package com.ttp.scrabble.manager;

import com.ttp.scrabble.exception.InvalideWordException;
import com.ttp.scrabble.pointAllocator.PointAllocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScrabbleManagerTest {
    @Test
    void shouldAbleToCalculateScoreForWord() throws InvalideWordException {
        //Arrange
        PointAllocator allocator = new PointAllocator();
        ScrabbleManager scrabbleManager = new ScrabbleManager(allocator);

        //Assert
        Assertions.assertEquals(10, scrabbleManager.getScore("GUARDIAN"));
        Assertions.assertEquals(10, scrabbleManager.getScore("GuArDiAn"));
        Assertions.assertEquals(16, scrabbleManager.getScore("ZEBRA"));
        Assertions.assertEquals(16, scrabbleManager.getScore("ZeBrA"));
    }

    @Test
    void shouldThrowExceptionWhenWordIsNullOrEmpty() {
        //Arrange
        PointAllocator allocator = new PointAllocator();
        ScrabbleManager scrabbleManager = new ScrabbleManager(allocator);

        //Assert
        Assertions.assertThrows(InvalideWordException.class, () -> scrabbleManager.getScore(""));
        Assertions.assertThrows(InvalideWordException.class, () -> scrabbleManager.getScore(null));
    }
}
