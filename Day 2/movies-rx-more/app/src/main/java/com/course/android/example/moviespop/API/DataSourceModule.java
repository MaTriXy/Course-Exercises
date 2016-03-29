package com.course.android.example.moviespop.API;

import com.course.android.example.moviespop.Utilities.ConstantValues;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static java.util.concurrent.TimeUnit.SECONDS;

@Module
public class DataSourceModule {

    @Provides
    Gson provideGson() {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    @Provides
    OkHttpClient provideOkHttpClient() {
        return createOkHttpClient();
    }

    static OkHttpClient createOkHttpClient() {
        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(12, SECONDS).
                readTimeout(12, SECONDS).
                writeTimeout(12, SECONDS).
                build();
        return client;
    }

    @Provides
    @Named("Api")
    OkHttpClient.Builder provideApiClient(OkHttpClient client) {
        return client.newBuilder();
    }


    @Provides
    Retrofit provideRestAdapter() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.NONE);

        return new Retrofit.Builder()
                .baseUrl(ConstantValues.ENDPOINT_URL).client(provideApiClient(provideOkHttpClient())
                        .addInterceptor(logging).build()).addConverterFactory(GsonConverterFactory.create())
//        .setRequestInterceptor(request -> request.addQueryParam("api_key", ConstantValues.TMDB_API_KEY))
                .build();
    }

    @Provides
    TMDbAPI provideMoviesApi() {
        return provideRestAdapter().create(TMDbAPI.class);
    }

}