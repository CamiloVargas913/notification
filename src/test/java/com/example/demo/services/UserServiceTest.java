package com.example.demo.services;

import com.example.demo.models.Category;
import com.example.demo.models.User;
import org.apache.tomcat.util.json.ParseException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void findUserCategory() throws FileNotFoundException, ParseException {
        Category categorySearch = new Category();
        categorySearch.id = 1;

        UserService userService = new UserService();
        final List<User> resultado = userService.FindUserCategory(Arrays.asList(categorySearch));

        var resultdata = resultado.stream().filter(x-> x.subscribed.stream().anyMatch(y->y.id == categorySearch.id)).toList();

        assertTrue(resultdata.size() >= 2);


    }
}