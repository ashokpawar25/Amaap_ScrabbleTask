package com.ttp.scrabble.manager;

import com.ttp.scrabble.pointAllocator.PointAllocator;

import java.util.List;
import java.util.Map;

public class ScrabbleManager
{
    PointAllocator allocator;
    public ScrabbleManager(PointAllocator allocator)
    {
        this.allocator=allocator;
    }

    public int getScore(String word)
    {
        Map<Integer,List<String>> pointsTable =allocator.getPointsTable();
        int score = 0;
        String [] alphabets = word.split("");
        for(String alphabet:alphabets)
        {
            for(Map.Entry<Integer, List<String>> entry:pointsTable.entrySet())
            {
                if(entry.getValue().contains(alphabet) || entry.getValue().contains(alphabet.toUpperCase()))
                {
                    score = score + entry.getKey();
                }
            }
        }
        return score;
    }
}
