package com.example.pasca.Fragments;

import com.example.pasca.Notifications.MyResponse;
import com.example.pasca.Notifications.Sender;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAwwRUUTo:APA91bEDD1RdlryZKzeLhNh1jEglrXE3Av8HtCLGeEtMSp3hPWZ2aJ7POu3jhLToIpuBdRbfdR60CnG067Isd3Tw-8SdHcNLBGn8TETIUeKyTNxAut_Mt6Kmtj4sLDagD22CH3V_AyAp"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
