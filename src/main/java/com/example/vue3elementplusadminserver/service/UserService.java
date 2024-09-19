package com.example.vue3elementplusadminserver.service;

import com.example.vue3elementplusadminserver.domain.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class UserService {

    private Map<String, User> userMap = new HashMap<>();

    public boolean hasUser(String username) {
        return userMap.containsKey(username);
    }

    public void addUser(User user) {
        userMap.put(user.username(), user);
    }

    public boolean checkPassword(String username, String password) {
        if (!userMap.containsKey(username)) {
            return Objects.equals(userMap.get(username).password(), password);
        }
        return false;
    }
}
