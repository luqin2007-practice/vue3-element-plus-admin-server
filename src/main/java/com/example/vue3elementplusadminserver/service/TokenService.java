package com.example.vue3elementplusadminserver.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class TokenService {

    private Map<String, String> userTokenMap = new HashMap<>();
    private Map<String, String> tokenUserMap = new HashMap<>();

    public boolean hasToken(String username) {
        return userTokenMap.containsKey(username);
    }

    public String getToken(String username) {
        return tokenUserMap.get(username);
    }

    public String getUser(String token) {
        return userTokenMap.get(token);
    }

    public String createToken(String username) {
        if (hasToken(username)) {
            getToken(username);
        }
        String token = UUID.randomUUID().toString();
        userTokenMap.put(username, token);
        tokenUserMap.put(token, username);
        return token;
    }

    public void removeToken(String token) {
        String user = tokenUserMap.remove(token);
        userTokenMap.remove(user);
    }
}
