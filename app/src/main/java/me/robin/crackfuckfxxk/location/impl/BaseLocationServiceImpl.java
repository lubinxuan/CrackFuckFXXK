package me.robin.crackfuckfxxk.location.impl;

import me.robin.crackfuckfxxk.location.LocationService;
import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2017-05-12.
 */
public abstract class BaseLocationServiceImpl implements LocationService {
    protected static final OkHttpClient okHttpClient;

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        okHttpClient = builder.build();
    }
}
