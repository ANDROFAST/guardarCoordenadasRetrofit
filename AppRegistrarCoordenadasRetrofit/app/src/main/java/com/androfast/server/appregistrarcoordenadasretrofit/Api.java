package com.androfast.server.appregistrarcoordenadasretrofit;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Server on 16/03/2019.
 */

public interface Api {
    @FormUrlEncoded
    @POST("registrar-gps.php")
    Call<JSONObject> coordenadas(@Field("direccion") String direccion,
                                 @Field("lat") String lat,
                                 @Field("lon") String lon);
}
