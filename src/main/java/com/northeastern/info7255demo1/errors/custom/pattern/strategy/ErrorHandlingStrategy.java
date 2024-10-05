package com.northeastern.info7255demo1.errors.custom.pattern.strategy;

import com.northeastern.info7255demo1.errors.custom.pattern.factory.ApiResponse;

public interface ErrorHandlingStrategy {
    ApiResponse handle(ApiResponse apiError);
}