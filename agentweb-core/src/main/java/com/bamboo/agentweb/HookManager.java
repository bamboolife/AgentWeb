package com.bamboo.agentweb;
public class HookManager {

    public static AgentWeb hookAgentWeb(AgentWeb agentWeb, AgentWeb.AgentBuilder agentBuilder) {
        return agentWeb;
    }

    public static boolean permissionHook(String url,String[]permissions){
        return true;
    }
}
