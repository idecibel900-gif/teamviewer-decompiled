package com.google.firebase;

import java.util.Objects;
import o.a65;
import o.hk0;
import o.nv1;
import o.sb7;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseOptions {
    private final String apiKey;
    private final String applicationId;
    private final String databaseUrl;
    private final String gaTrackingId;
    private final String gcmSenderId;
    private final String projectId;
    private final String recaptchaSiteKey;
    private final String storageBucket;

    public static final class Builder {
        private String apiKey;
        private String applicationId;
        private String databaseUrl;
        private String gaTrackingId;
        private String gcmSenderId;
        private String projectId;
        private String recaptchaSiteKey;
        private String storageBucket;

        public FirebaseOptions build() {
            return new FirebaseOptions(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.recaptchaSiteKey, this.projectId);
        }

        public Builder setApiKey(String str) {
            nv1.r(str, "ApiKey must be set.");
            this.apiKey = str;
            return this;
        }

        public Builder setApplicationId(String str) {
            nv1.r(str, "ApplicationId must be set.");
            this.applicationId = str;
            return this;
        }

        public Builder setDatabaseUrl(String str) {
            this.databaseUrl = str;
            return this;
        }

        public Builder setProjectId(String str) {
            this.projectId = str;
            return this;
        }

        public Builder setStorageBucket(String str) {
            this.storageBucket = str;
            return this;
        }
    }

    private FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        int i = sb7.a;
        if (str == null || str.trim().isEmpty()) {
            hk0.l("ApplicationId must be set.");
            throw null;
        }
        this.applicationId = str;
        this.apiKey = str2;
        this.databaseUrl = str3;
        this.gaTrackingId = str4;
        this.gcmSenderId = str5;
        this.storageBucket = str6;
        this.recaptchaSiteKey = str7;
        this.projectId = str8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return Objects.equals(this.applicationId, firebaseOptions.applicationId) && Objects.equals(this.apiKey, firebaseOptions.apiKey) && Objects.equals(this.databaseUrl, firebaseOptions.databaseUrl) && Objects.equals(this.gaTrackingId, firebaseOptions.gaTrackingId) && Objects.equals(this.gcmSenderId, firebaseOptions.gcmSenderId) && Objects.equals(this.storageBucket, firebaseOptions.storageBucket) && Objects.equals(this.recaptchaSiteKey, firebaseOptions.recaptchaSiteKey) && Objects.equals(this.projectId, firebaseOptions.projectId);
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getGcmSenderId() {
        return this.gcmSenderId;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public int hashCode() {
        return Objects.hash(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.recaptchaSiteKey, this.projectId);
    }

    public String toString() {
        a65 a65Var = new a65(this, (byte) 1);
        a65Var.P(this.applicationId, "applicationId");
        a65Var.P(this.apiKey, "apiKey");
        a65Var.P(this.databaseUrl, "databaseUrl");
        a65Var.P(this.gcmSenderId, "gcmSenderId");
        a65Var.P(this.storageBucket, "storageBucket");
        a65Var.P(this.recaptchaSiteKey, "recaptchaSiteKey");
        a65Var.P(this.projectId, "projectId");
        return a65Var.toString();
    }
}
