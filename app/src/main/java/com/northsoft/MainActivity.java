package com.northsoft;

import android.app.Activity;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.northsoft.iotProject.joinUp.commongen.ProtoCommon;
import com.northsoft.iotProject.joinUp.servicegen.AccessService;
import com.northsoft.iotProject.joinUp.servicegen.AccountServiceGrpc;
import com.northsoft.iotProject.joinUp.servicegen.AirCleanBuzServiceGrpc;

import java.lang.ref.WeakReference;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        new GrpcTask(this).execute();
    }

    private static class GrpcTask extends AsyncTask<String, Void, String>{

        private final WeakReference<Activity> activityWeakReference;
//        private AirCleanBuzServiceGrpc.AirCleanBuzServiceBlockingStub stub;
        private AccountServiceGrpc.AccountServiceBlockingStub stub;
        private ManagedChannel channel;

        private GrpcTask(Activity activity) {
            this.activityWeakReference = new WeakReference<>(activity);
        }

        @Override
        protected String doInBackground(String... strings) {
//            try{
//                AccessService.UserInfo userInfo = AccessService.UserInfo.newBuilder()
//                        .build();
//
//                channel = ManagedChannelBuilder.forAddress("192.168.2.246", 10001).usePlaintext().build();
////                stub = AirCleanBuzServiceGrpc.newBlockingStub(channel);
//                stub = AccountServiceGrpc.newBlockingStub(channel);
//                AirCleanBuzServiceGrpc.newStub(channel);
//
//                ProtoCommon.Response response = stub.accessToken(userInfo);
//                Log.i(TAG, "服务端返回应答："  + response.getDesc());
//            } catch (StatusRuntimeException ex){
//                Log.e(TAG, "doInBackground: ", ex);
//                return null;
//            }
            return null;
        }
    }
}
