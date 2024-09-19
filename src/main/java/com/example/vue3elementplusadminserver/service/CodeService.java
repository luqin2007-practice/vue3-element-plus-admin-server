package com.example.vue3elementplusadminserver.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CodeService {

    private final Map<String, String> codeLoginMap = new HashMap<>();
    private final Map<String, String> codeForgetMap = new HashMap<>();
    private final Set<String> codeRegisterSet = new HashSet<>();
    private final Random random = new Random(System.currentTimeMillis());

    public String generateCode(String username, String module) {
        String code = generateCode();
        return switch (module) {
            case "login" -> {
                codeLoginMap.put(username, code);
                yield code;
            }
            case "forget" -> {
                codeForgetMap.put(username, code);
                yield code;
            }
            case "register" -> {
                codeRegisterSet.add(code);
                yield code;
            }
            default -> null;
        };
    }

    public boolean checkCode(String username, String module, String code) {
        return switch (module) {
            case "login" -> Objects.equals(code, codeLoginMap.get(username));
            case "forget" -> Objects.equals(code, codeForgetMap.get(username));
            case "register" -> codeRegisterSet.contains(code);
            default -> false;
        };
    }

    public void destroyCode(String username, String module, String code) {
        switch (module) {
            case "login" -> codeLoginMap.remove(username);
            case "forget" -> codeForgetMap.remove(username);
            case "register" -> codeRegisterSet.remove(code);
        }
    }

    private String generateCode() {
        char[] codes = new char[6];
        for (int i = 0; i < 6; i++) {
            int c = random.nextInt(36);
            if (c < 26) {
                codes[i] = (char) (c + 'a');
            } else {
                codes[i] = (char) (c - 26 + '0');
            }
        }
        return String.copyValueOf(codes);
    }
}
