package com.example.testweibo;

public interface Constants {

    // 新浪微博======================================================

    // 官方申请正式的appkey
    String SINA_APP_KEY="2557689284";

    // 回调地址，使用官方默认地址
    String SINA_REDIRECT_URL="https://api.weibo.com/oauth2/default.html";

    String SINA_APP_SECRET="0a5c2535dec7cb47cafa475c2079d969";

    // 新支持scope 支持传入多个scope权限，用逗号分隔，暂时用不上
    // String SINA_SCOPE="email,direct_messages_read,direct_messages_write,"
    // + "friendships_groups_read,friendships_groups_write,statuses_to_me_read," + "follow_app_official_microblog";

    String SINA_SCOPE="";

    /** 认证Code **/
    String SINA_CODE="code";

    String SINA_ACCESS_TOKEN="access_token";

    String SINA_EXPIRES_IN="expires_in";

    String SINA_UID="uid";

    String SINA_DATE_PATTERN="yyyy/MM/dd HH:mm:ss";

    String SINA_BASEURL="https://api.weibo.com/oauth2/";

    String SINA_CLIENT_ID="client_id";

    String SINA_CLIENT_SECRET="client_secret";

    String SINA_GRANT_TYPE="grant_type";

    String SINA_GRANT_TYPE_VALUE="authorization_code";

    String SINA_REDIRECT_URI="redirect_uri";

    // 新浪微博首选项

    String PREF_SINA_ACCESS_TOKEN="sina_access_token";

    String PREF_SINA_EXPIRES_IN="sina_expires_time";

    String PREF_SINA_UID="sina_uid";

    // 腾讯微博======================================================

    String TX_APP_KEY="APP_KEY";

    String TX_APP_KEY_SEC="APP_KEY_SEC";

    // 腾讯微博首选项

    String PREF_TX_ACCESS_TOKEN="TX_ACCESS_TOKEN";

    String PREF_TX_EXPIRES_IN="TX_EXPIRES_IN";

    String PREF_TX_OPEN_ID="TX_OPEN_ID";

    String PREF_TX_OPEN_KEY="TX_OPEN_KEY";

    String PREF_TX_REFRESH_TOKEN="TX_REFRESH_TOKEN";

    String PREF_TX_NAME="TX_NAME";

    String PREF_TX_CLIENT_ID="TX_CLIENT_ID";

    String PREF_TX_EXPIRES_TIME="TX_EXPIRES_TIME";

    String PREF_TX_CLIENT_IP="TX_CLIENT_IP";

    String PREF_TX_UID="TX_UID";

    // TX API请求字段

    String TX_API_APP_KEY="oauth_consumer_key";

    String TX_API_ACCESS_TOKEN="access_token";

    String TX_API_OPEN_ID="openid";

    String TX_API_CLIENT_IP="clientip";

    String TX_API_OAUTH_VERSION="oauth_version";

    String TX_API_SCOPE="scope";

    String TX_API_CONTENT="content";

    String TX_API_FORMAT="format";

    String TX_API_LONGITUDE="longitude";

    String TX_API_LATITUDE="latitude";

    String TX_API_SYNCFLAG="syncflag";

    String TX_API_COMPATIBLEFLAG="compatibleflag";

}
