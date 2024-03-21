package com.ttp.scrabble.manager;

import com.ttp.scrabble.exception.InvalideWordException;
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

    public int getScore(String word) throws InvalideWordException {
        if (word == null || word.isEmpty()) throw new InvalideWordException("Word is not valide");
        Map<Integer,List<String>> pointsTable =allocator.getPointsTable();
        int score = 0;
        String [] alphabets = word.toUpperCase().split("");
        for(String alphabet:alphabets)
        {
            for(Map.Entry<Integer, List<String>> entry:pointsTable.entrySet())
            {
                if(entry.getValue().contains(alphabet))
                {
                    score = score + entry.getKey();
                }
            }
        }
        return score;
    }

    public int getScoreForLetterExtension(String word, List<String> lettersToChange, int multiply) throws InvalideWordException {
        if (word == null || word.isEmpty()) throw new InvalideWordException("Word is not valide");
        Map<Integer,List<String>> pointsTable =allocator.getPointsTable();
        int score = 0;
        String [] alphabets = word.toUpperCase().split("");
        for(String alphabet:alphabets)
        {
            for(Map.Entry<Integer, List<String>> entry:pointsTable.entrySet())
            {
                if(entry.getValue().contains(alphabet) && lettersToChange.contains(alphabet))
                {
                    score = score + (entry.getKey()*multiply);
                }
                else if(entry.getValue().contains(alphabet))
                {
                    score = score + entry.getKey();
                }
            }
        }
        return score;
    }
}
