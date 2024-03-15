package com.ttp.scrabble.manager;

import com.ttp.scrabble.pointAllocator.PointAllocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScrabbleManagerTest {
    @Test
    void shouldAbleToCalculateScoreForWord() {
        //Arrange
        PointAllocator allocator = new PointAllocator();
        ScrabbleManager scrabbleManager = new ScrabbleManager(allocator);

        //Act
        String word = "GUARDIAN";
        int score = scrabbleManager.getScore(word);

        //Assert
        Assertions.assertEquals(10, score);
    }
}
