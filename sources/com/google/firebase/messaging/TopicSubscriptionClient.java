package com.google.firebase.messaging;

import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import o.an4;
import o.bo7;
import o.e41;
import o.fx3;
import o.gk0;
import o.h57;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
public class TopicSubscriptionClient {
    private static HttpConnectionFactory connectionFactory = new an4((byte) 21);
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final FirebaseMessaging firebaseMessaging;

    public interface HttpConnectionFactory {
    }

    public TopicSubscriptionClient(FirebaseApp firebaseApp, FirebaseMessaging firebaseMessaging, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.firebaseApp = firebaseApp;
        this.firebaseMessaging = firebaseMessaging;
    }

    private static <T> T awaitTask(bo7 bo7Var) throws IOException {
        try {
            return (T) h57.f(bo7Var, 30L);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e2);
        }
    }

    private static void closeQuietly(HttpURLConnection httpURLConnection) {
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                errorStream.close();
            }
        } catch (IOException unused2) {
        }
    }

    public static boolean isDebugLogEnabled() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private static /* synthetic */ HttpURLConnection lambda$static$0(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    private void performTopicOperation(String str, String str2, String str3, String str4) throws IOException {
        if (str2 == null || str3 == null) {
            gk0.l("FIS auth token or FIS ID is empty");
            return;
        }
        String projectId = this.firebaseApp.getOptions().getProjectId();
        String apiKey = this.firebaseApp.getOptions().getApiKey();
        if (projectId == null) {
            gk0.l("Project ID or API Key is missing");
            return;
        }
        StringBuilder sbO = e41.o("https://fcmregistrations.googleapis.com/v1/projects/", projectId, "/registrations/", str3, "/topicSubscriptions/");
        sbO.append(str);
        sbO.append(":");
        sbO.append(str4);
        URL url = new URL(sbO.toString());
        if (isDebugLogEnabled()) {
            StringBuilder sbO2 = e41.o("Topic ", str4, " for: ", str, " with url: ");
            sbO2.append(url);
            Log.d("FirebaseMessaging", sbO2.toString());
        }
        HttpURLConnection httpURLConnectionCreateConnection = createConnection(url);
        httpURLConnectionCreateConnection.setRequestMethod("POST");
        httpURLConnectionCreateConnection.setRequestProperty("x-goog-api-key", apiKey);
        httpURLConnectionCreateConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
        httpURLConnectionCreateConnection.setDoOutput(false);
        try {
            try {
                int responseCode = httpURLConnectionCreateConnection.getResponseCode();
                String responseMessage = httpURLConnectionCreateConnection.getResponseMessage();
                closeQuietly(httpURLConnectionCreateConnection);
                httpURLConnectionCreateConnection.disconnect();
                if (responseCode >= 200 && responseCode < 300) {
                    if (isDebugLogEnabled()) {
                        Log.d("FirebaseMessaging", fx3.h("Topic ", str4, " for: ", str, " succeeded."));
                        return;
                    }
                    return;
                }
                if (responseCode == 404 || responseCode == 403) {
                    if (isDebugLogEnabled()) {
                        Log.d("FirebaseMessaging", "Topic " + str4 + " failed: " + responseMessage);
                    }
                    gk0.l(to7.k("Topic ", str4, " failed: ", responseMessage));
                    return;
                }
                if (responseCode >= 500) {
                    gk0.l("INTERNAL_SERVER_ERROR");
                    return;
                }
                throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
            } catch (IOException e) {
                throw new IOException("SERVICE_NOT_AVAILABLE", e);
            }
        } catch (Throwable th) {
            closeQuietly(httpURLConnectionCreateConnection);
            httpURLConnectionCreateConnection.disconnect();
            throw th;
        }
    }

    public HttpURLConnection createConnection(URL url) {
        ((an4) connectionFactory).getClass();
        return lambda$static$0(url);
    }

    public void subscribe(String str) throws IOException {
        String token = ((InstallationTokenResult) awaitTask(this.firebaseInstallationsApi.getToken(false))).getToken();
        this.firebaseMessaging.blockingRegister(false);
        performTopicOperation(str, token, (String) awaitTask(this.firebaseInstallationsApi.getId()), "subscribe");
    }

    public void unsubscribe(String str) throws IOException {
        String token = ((InstallationTokenResult) awaitTask(this.firebaseInstallationsApi.getToken(false))).getToken();
        this.firebaseMessaging.blockingRegister(false);
        performTopicOperation(str, token, (String) awaitTask(this.firebaseInstallationsApi.getId()), "unsubscribe");
    }
}
