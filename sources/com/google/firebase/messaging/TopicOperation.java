package com.google.firebase.messaging;

import android.text.TextUtils;
import io.sentry.android.core.v0;
import java.util.Objects;
import java.util.regex.Pattern;
import o.fx3;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
final class TopicOperation {
    private static final Pattern TOPIC_NAME_REGEXP = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private final String operation;
    private final String serializedString;
    private final String topic;

    private TopicOperation(String str, String str2) {
        this.topic = normalizeTopicOrThrow(str2, str);
        this.operation = str;
        this.serializedString = str + "!" + str2;
    }

    public static TopicOperation from(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new TopicOperation(strArrSplit[0], strArrSplit[1]);
    }

    private static String normalizeTopicOrThrow(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            v0.j("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str2 + ".");
            str = str.substring(8);
        }
        if (str != null && TOPIC_NAME_REGEXP.matcher(str).matches()) {
            return str;
        }
        hk0.g(fx3.g("Invalid topic name: ", str, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TopicOperation)) {
            return false;
        }
        TopicOperation topicOperation = (TopicOperation) obj;
        return this.topic.equals(topicOperation.topic) && this.operation.equals(topicOperation.operation);
    }

    public String getOperation() {
        return this.operation;
    }

    public String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return Objects.hash(this.operation, this.topic);
    }

    public String serialize() {
        return this.serializedString;
    }
}
