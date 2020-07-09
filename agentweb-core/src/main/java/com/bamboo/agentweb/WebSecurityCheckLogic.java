

package com.bamboo.agentweb;

import android.webkit.WebView;

import androidx.collection.ArrayMap;


/**
 * @author cenxiaozhong
 */
public interface WebSecurityCheckLogic {
    void dealHoneyComb(WebView view);
    void dealJsInterface(ArrayMap<String, Object> objects, AgentWeb.SecurityType securityType);
}
