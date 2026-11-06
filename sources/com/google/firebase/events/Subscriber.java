package com.google.firebase.events;

/* JADX INFO: loaded from: classes.dex */
public interface Subscriber {
    <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler);
}
