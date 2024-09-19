package com.example.vue3elementplusadminserver.responseData;

public record Response<T>(String message, int resCode, T data) {
}
