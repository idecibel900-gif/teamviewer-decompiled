package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import io.sentry.android.core.v0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.bo7;
import o.do7;
import o.h57;
import o.vw;

/* JADX INFO: loaded from: classes.dex */
class TopicsSubscriber {
    private static final long MAX_DELAY_SEC = 28800;
    private final Context context;
    private final Metadata metadata;
    private final TopicsStore store;
    private final ScheduledExecutorService syncExecutor;
    private final TopicSubscriptionClient topicSubscriptionClient;
    private final Map<String, ArrayDeque<do7>> pendingOperations = new vw(0);
    private boolean syncScheduledOrRunning = false;

    public TopicsSubscriber(Metadata metadata, TopicsStore topicsStore, TopicSubscriptionClient topicSubscriptionClient, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.metadata = metadata;
        this.store = topicsStore;
        this.topicSubscriptionClient = topicSubscriptionClient;
        this.context = context;
        this.syncExecutor = scheduledExecutorService;
    }

    private void blockingSubscribeToTopic(String str) throws IOException {
        this.topicSubscriptionClient.subscribe(str);
    }

    private void blockingUnsubscribeFromTopic(String str) throws IOException {
        this.topicSubscriptionClient.unsubscribe(str);
    }

    public static bo7 createInstance(final FirebaseApp firebaseApp, final FirebaseMessaging firebaseMessaging, final FirebaseInstallationsApi firebaseInstallationsApi, final Metadata metadata, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return h57.g(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TopicsSubscriber.lambda$createInstance$0(context, scheduledExecutorService, metadata, firebaseApp, firebaseMessaging, firebaseInstallationsApi);
            }
        });
    }

    public static boolean isDebugLogEnabled() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TopicsSubscriber lambda$createInstance$0(Context context, ScheduledExecutorService scheduledExecutorService, Metadata metadata, FirebaseApp firebaseApp, FirebaseMessaging firebaseMessaging, FirebaseInstallationsApi firebaseInstallationsApi) {
        return new TopicsSubscriber(metadata, TopicsStore.getInstance(context, scheduledExecutorService), new TopicSubscriptionClient(firebaseApp, firebaseMessaging, firebaseInstallationsApi), context, scheduledExecutorService);
    }

    private void markCompletePendingOperation(TopicOperation topicOperation) {
        synchronized (this.pendingOperations) {
            try {
                String strSerialize = topicOperation.serialize();
                if (this.pendingOperations.containsKey(strSerialize)) {
                    ArrayDeque<do7> arrayDeque = this.pendingOperations.get(strSerialize);
                    do7 do7VarPoll = arrayDeque.poll();
                    if (do7VarPoll != null) {
                        do7VarPoll.a(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.pendingOperations.remove(strSerialize);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void startSync() {
        if (isSyncScheduledOrRunning()) {
            return;
        }
        syncWithDelaySecondsInternal(0L);
    }

    public boolean hasPendingOperation() {
        return this.store.getNextTopicOperation() != null;
    }

    public synchronized boolean isSyncScheduledOrRunning() {
        return this.syncScheduledOrRunning;
    }

    public boolean performTopicOperation(TopicOperation topicOperation) throws IOException {
        try {
            String operation = topicOperation.getOperation();
            int iHashCode = operation.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && operation.equals("U")) {
                    blockingUnsubscribeFromTopic(topicOperation.getTopic());
                    if (!isDebugLogEnabled()) {
                        return true;
                    }
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + topicOperation.getTopic() + " succeeded.");
                    return true;
                }
            } else if (operation.equals("S")) {
                blockingSubscribeToTopic(topicOperation.getTopic());
                if (!isDebugLogEnabled()) {
                    return true;
                }
                Log.d("FirebaseMessaging", "Subscribe to topic: " + topicOperation.getTopic() + " succeeded.");
                return true;
            }
            if (!isDebugLogEnabled()) {
                return true;
            }
            Log.d("FirebaseMessaging", "Unknown topic operation" + topicOperation + ".");
            return true;
        } catch (IOException e) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                if (e.getMessage() != null) {
                    throw e;
                }
                v0.c("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            v0.c("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    public void scheduleSyncTaskWithDelaySeconds(Runnable runnable, long j) {
        this.syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
    }

    public synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    public void startTopicsSyncIfNecessary() {
        if (hasPendingOperation()) {
            startSync();
        }
    }

    public boolean syncTopics() {
        while (true) {
            synchronized (this) {
                try {
                    TopicOperation nextTopicOperation = this.store.getNextTopicOperation();
                    if (nextTopicOperation == null) {
                        if (isDebugLogEnabled()) {
                            Log.d("FirebaseMessaging", "topic sync succeeded");
                        }
                        return true;
                    }
                    if (!performTopicOperation(nextTopicOperation)) {
                        return false;
                    }
                    this.store.removeTopicOperation(nextTopicOperation);
                    markCompletePendingOperation(nextTopicOperation);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void syncWithDelaySecondsInternal(long j) {
        scheduleSyncTaskWithDelaySeconds(new TopicsSyncTask(this, this.context, this.metadata, Math.min(Math.max(30L, 2 * j), MAX_DELAY_SEC)), j);
        setSyncScheduledOrRunning(true);
    }
}
