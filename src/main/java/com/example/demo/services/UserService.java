package com.example.demo.services;

import com.example.demo.models.Category;
import com.example.demo.models.TypeNotification;
import com.example.demo.models.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service related with user functionalities
 *
 * @version: 02/01/2023
 */
@Service
public class UserService {
    private List<User> userList;

    private List<TypeNotification> chanels;

    private List<Category> subscripts;

    /**
     * Service related with user functionalities
     *
     * @version: 02/01/2023
     */
    public UserService() throws FileNotFoundException, ParseException {

        ObjectMapper mapper = new ObjectMapper();
        userList = new ArrayList<User>();
        try {
            userList = mapper.readValue(new File("src\\main\\resources\\users.json"), new TypeReference<List<User>>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method that search users depending on the incoming categories
     *
     * @return List<User> users list
     * @version: 02/01/2023
     */
    public List<User> FindUserCategory(List<Category> categories) {
        List<User> userList2 = new ArrayList<User>();
        categories.forEach(category -> {
            userList2.addAll(userList.stream().filter(x -> x.subscribed.stream().anyMatch(y -> y.id == category.id)).toList());
        });

        return userList2.stream().distinct().collect(Collectors.toList());
    }
}
