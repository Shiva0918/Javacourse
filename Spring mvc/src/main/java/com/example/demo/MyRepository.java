package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class MyRepository {
    public List<String> getNames() {
        return Arrays.asList("Arvind", "Goutham", "Shiva", "Rahul");
    }
}
