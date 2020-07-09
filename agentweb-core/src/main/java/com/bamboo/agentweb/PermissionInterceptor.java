package com.bamboo.agentweb;


public interface PermissionInterceptor {
    boolean intercept(String url, String[] permissions, String action);
}
