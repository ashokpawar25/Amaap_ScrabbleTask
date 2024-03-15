package com.ttp.scrabble.pointAllocator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PointAllocator
{
    Map<Integer, List<String>> pointsTable = new HashMap<Integer,List<String>>();

    public PointAllocator()
    {
        this.pointsTable.put(1,List.of("E","A","I"," O","N","R","T","L","S","U"));
        this.pointsTable.put(2,List.of("D","G"));
        this.pointsTable.put(3,List.of("B","C","M","P"));
        this.pointsTable.put(4,List.of("F","H","V","W","Y"));
        this.pointsTable.put(5,List.of("K"));
        this.pointsTable.put(8,List.of("J", "X"));
        this.pointsTable.put(10,List.of("Q", "Z"));
    }

    public Map<Integer, List<String>> getPointsTable()
    {
        return pointsTable;
    }
}
