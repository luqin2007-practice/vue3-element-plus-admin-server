package com.example.vue3elementplusadminserver.controller;

import com.example.vue3elementplusadminserver.domain.User;
import com.example.vue3elementplusadminserver.requestData.AccountGetCode;
import com.example.vue3elementplusadminserver.requestData.AccountLoginBody;
import com.example.vue3elementplusadminserver.requestData.AccountRegisterBody;
import com.example.vue3elementplusadminserver.service.CodeService;
import com.example.vue3elementplusadminserver.service.TokenService;
import com.example.vue3elementplusadminserver.service.UserService;
import com.example.vue3elementplusadminserver.responseData.AccountCheckUser;
import com.example.vue3elementplusadminserver.responseData.AccountLogin;
import com.example.vue3elementplusadminserver.responseData.AccountRegister;
import com.example.vue3elementplusadminserver.responseData.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class AccountController {

    @Autowired
    private TokenService tokenService;
    @Autowired
    private UserService userService;
    @Autowired
    private CodeService codeService;

    @GetMapping("/error")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Response<?> error() {
        return new Response<>("失败", 1649, null);
    }

    @PostMapping("/login")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Response<AccountLogin> login(@RequestBody AccountLoginBody body) {
        String token;
        String username = body.username();
        if (tokenService.hasToken(username)) {
            token = tokenService.getToken(username);
        } else {
            token = tokenService.createToken(username);
        }
        return new Response<>("登陆成功", 0, new AccountLogin(username, token));
    }

    @PostMapping("/register")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Response<AccountRegister> register(@RequestBody AccountRegisterBody body) {
        AccountRegister data;
        String username = body.username();
        String message;
        if (userService.hasUser(username)) {
            // 用户名已存在
            data = new AccountRegister(username, "", true, false);
            message = "用户名已存在";
        } else if (!codeService.checkCode(username, "register", body.code())) {
            // 验证码错误
            data = new AccountRegister(username, "", false, true);
            message = "验证码错误";
        } else {
            String token = tokenService.createToken(username);
            User user = new User(username, body.password(), token);
            userService.addUser(user);
            data = new AccountRegister(username, token, false, false);
            message = "登录成功";
            codeService.destroyCode(username, "register", body.code());
        }
        return new Response<>(message, 0, data);
    }

    @GetMapping("/account/check")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Response<AccountCheckUser> check(@RequestParam("username") String username) {
        boolean hasUser = userService.hasUser(username);
        return new Response<>("成功", 0, new AccountCheckUser(hasUser));
    }

    @PostMapping("/getCode")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Response<String> getCode(@RequestBody AccountGetCode param) {
        String code = codeService.generateCode(param.username(), param.module());
        if (code == null) {
            return new Response<>("无效类型", 1024, "");
        }
        return new Response<>("验证码发送成功。验证码 " + code, 0, code);
    }
}
