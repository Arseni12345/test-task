package com.example.test_tasks.service;

import com.example.test_tasks.domain.SubstringDataBase;
import com.example.test_tasks.repository.SubstringDataBaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class SubstringService {

    private final SubstringDataBaseRepo substringDataBaseRepo;

    @Autowired
    public SubstringService(SubstringDataBaseRepo substringDataBaseRepo){
        this.substringDataBaseRepo = substringDataBaseRepo;
    }

    public List<String> substrings(List<String> substrings, List<String> sourceStrings){
        List<String> resultSubstrings = new LinkedList<>();
        for(String sub: substrings){
            for(String source: sourceStrings){
                if(source.contains(sub)){
                    resultSubstrings.add(sub);
                    resultSubstrings.add(" ");
                    break;
                }
            }
        }
        if(!resultSubstrings.isEmpty()) {
            substringDataBaseRepo.save(new SubstringDataBase(processString(resultSubstrings), processString(substrings), processString(sourceStrings)));
        }
        return resultSubstrings;
    }

    private String processString(List<String> list){
        StringBuilder stringBuilder = new StringBuilder();
        for(String s: list){
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
