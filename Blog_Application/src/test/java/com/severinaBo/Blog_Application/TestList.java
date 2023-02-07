package com.severinaBo.Blog_Application;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TestList {


        @Test
        public void givenArraysAsList_thenInitialiseList() {
            List<String> list = Arrays.asList("Food & Lifestyle", "News in World");

            assertTrue(list.contains("Food & Lifestyle"));
        }
    }

