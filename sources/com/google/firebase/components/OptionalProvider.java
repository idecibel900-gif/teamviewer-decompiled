package com.google.firebase.components;

import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;
import o.an4;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
class OptionalProvider<T> implements Provider<T> {
    private volatile Provider<T> delegate;
    private Deferred$DeferredHandler<T> handler;
    private static final Deferred$DeferredHandler<Object> NOOP_HANDLER = new an4(5);
    private static final Provider<Object> EMPTY_PROVIDER = new c();

    private OptionalProvider(Deferred$DeferredHandler<T> deferred$DeferredHandler, Provider<T> provider) {
        this.handler = deferred$DeferredHandler;
        this.delegate = provider;
    }

    public static <T> OptionalProvider<T> empty() {
        return new OptionalProvider<>(NOOP_HANDLER, EMPTY_PROVIDER);
    }

    private static /* synthetic */ void lambda$static$0(Provider provider) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$1() {
        return null;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return this.delegate.get();
    }

    public void set(Provider<T> provider) {
        Deferred$DeferredHandler<T> deferred$DeferredHandler;
        if (this.delegate != EMPTY_PROVIDER) {
            hk0.l("provide() can be called only once.");
            return;
        }
        synchronized (this) {
            deferred$DeferredHandler = this.handler;
            this.handler = null;
            this.delegate = provider;
        }
        ((an4) deferred$DeferredHandler).getClass();
        lambda$static$0(provider);
    }
}
