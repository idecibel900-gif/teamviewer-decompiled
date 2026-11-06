package com.google.firebase.messaging;

import com.google.firebase.messaging.threads.PoolableExecutors;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.wy4;

/* JADX INFO: loaded from: classes.dex */
abstract class FcmExecutors {
    private static Executor newCachedSingleThreadExecutor(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new wy4(str));
    }

    public static Executor newFileIOExecutor() {
        return newCachedSingleThreadExecutor("Firebase-Messaging-File-Io");
    }

    public static ScheduledExecutorService newInitExecutor() {
        return new ScheduledThreadPoolExecutor(1, new wy4("Firebase-Messaging-Init"));
    }

    public static ExecutorService newIntentHandleExecutor() {
        return PoolableExecutors.factory().newSingleThreadExecutor(new wy4("Firebase-Messaging-Intent-Handle"), ThreadPriority.HIGH_SPEED);
    }

    public static ExecutorService newNetworkIOExecutor() {
        return Executors.newSingleThreadExecutor(new wy4("Firebase-Messaging-Network-Io"));
    }

    public static ExecutorService newTaskExecutor() {
        return Executors.newSingleThreadExecutor(new wy4("Firebase-Messaging-Task"));
    }

    public static ScheduledExecutorService newTopicsSyncExecutor() {
        return new ScheduledThreadPoolExecutor(1, new wy4("Firebase-Messaging-Topics-Io"));
    }
}
