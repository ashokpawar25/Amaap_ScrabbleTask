package com.ttp.scrabble.pointAllocator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PointAllocatorTest {
    @Test
    void shouldAbleToAllocatePointsToVariables() {
        //Arrange
        Map<Integer, List<String>> expected = new HashMap<Integer, List<String>>();
        expected.put(2, List.of("D", "G"));
        expected.put(3, List.of("B", "C", "M", "P"));
        expected.put(4, List.of("F", "H", "V", "W", "Y"));
        expected.put(1, List.of("E", "A", "I", " O", "N", "R", "T", "L", "S", "U"));
        expected.put(5, List.of("K"));
        expected.put(8, List.of("J", "X"));
        expected.put(10, List.of("Q", "Z"));

        //Act
        PointAllocator allocator = new PointAllocator();
        Map<Integer, List<String>> actual = allocator.getPointsTable();

        //Asert
        Assertions.assertEquals(expected, actual);
    }
}
