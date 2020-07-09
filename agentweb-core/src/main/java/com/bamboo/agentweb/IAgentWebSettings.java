package com.bamboo.agentweb;

import android.webkit.WebView;

public interface IAgentWebSettings<T extends android.webkit.WebSettings> {

    IAgentWebSettings toSetting(WebView webView);

    T getWebSettings();

}
