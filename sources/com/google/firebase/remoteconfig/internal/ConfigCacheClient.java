package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import io.sentry.o5;
import io.sentry.r0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.bo7;
import o.d85;
import o.f21;
import o.h57;
import o.s75;
import o.x75;
import o.xv;

/* JADX INFO: loaded from: classes.dex */
public class ConfigCacheClient {
    private bo7 cachedContainerTask = null;
    private final Executor executor;
    private final ConfigStorageClient storageClient;
    private static final Map<String, ConfigCacheClient> clientInstances = new HashMap();
    private static final Executor DIRECT_EXECUTOR = new xv((byte) 1);

    public static class AwaitListener<TResult> implements d85, x75, s75 {
        private final CountDownLatch latch;

        private AwaitListener() {
            this.latch = new CountDownLatch(1);
        }

        public boolean await(long j, TimeUnit timeUnit) {
            return this.latch.await(j, timeUnit);
        }

        @Override // o.s75
        public void onCanceled() {
            this.latch.countDown();
        }

        @Override // o.x75
        public void onFailure(Exception exc) {
            this.latch.countDown();
        }

        @Override // o.d85
        public void onSuccess(TResult tresult) {
            this.latch.countDown();
        }
    }

    private ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.executor = executor;
        this.storageClient = configStorageClient;
    }

    private static <TResult> TResult await(bo7 bo7Var, long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        AwaitListener awaitListener = new AwaitListener();
        Executor executor = DIRECT_EXECUTOR;
        bo7Var.e(executor, awaitListener);
        bo7Var.d(executor, awaitListener);
        bo7Var.a(executor, awaitListener);
        if (!awaitListener.await(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (bo7Var.k()) {
            return (TResult) bo7Var.i();
        }
        throw new ExecutionException(bo7Var.h());
    }

    public static synchronized ConfigCacheClient getInstance(Executor executor, ConfigStorageClient configStorageClient) {
        String fileName;
        Map<String, ConfigCacheClient> map;
        try {
            fileName = configStorageClient.getFileName();
            map = clientInstances;
            if (!map.containsKey(fileName)) {
                map.put(fileName, new ConfigCacheClient(executor, configStorageClient));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(fileName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$put$0(ConfigContainer configContainer) {
        return this.storageClient.write(configContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bo7 lambda$put$1(boolean z, ConfigContainer configContainer, Void r3) {
        if (z) {
            updateInMemoryConfigContainer(configContainer);
        }
        return h57.j(configContainer);
    }

    private synchronized void updateInMemoryConfigContainer(ConfigContainer configContainer) {
        this.cachedContainerTask = h57.j(configContainer);
    }

    public void clear() {
        synchronized (this) {
            this.cachedContainerTask = h57.j(null);
        }
        this.storageClient.clear();
    }

    public synchronized bo7 get() {
        try {
            bo7 bo7Var = this.cachedContainerTask;
            if (bo7Var == null || (bo7Var.j() && !this.cachedContainerTask.k())) {
                Executor executor = this.executor;
                ConfigStorageClient configStorageClient = this.storageClient;
                Objects.requireNonNull(configStorageClient);
                this.cachedContainerTask = h57.g(executor, new r0(configStorageClient, (byte) 4));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.cachedContainerTask;
    }

    public ConfigContainer getBlocking(long j) {
        synchronized (this) {
            try {
                bo7 bo7Var = this.cachedContainerTask;
                if (bo7Var != null && bo7Var.k()) {
                    return (ConfigContainer) this.cachedContainerTask.i();
                }
                try {
                    return (ConfigContainer) await(get(), j, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public bo7 put(ConfigContainer configContainer, boolean z) {
        return h57.g(this.executor, new o5(this, configContainer, (byte) 8)).l(this.executor, new f21(this, z, configContainer));
    }

    public bo7 put(ConfigContainer configContainer) {
        return put(configContainer, true);
    }

    public ConfigContainer getBlocking() {
        return getBlocking(5L);
    }
}
