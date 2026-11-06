package com.google.firebase.messaging;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements EventHandler {
    public final /* synthetic */ FirebaseMessaging.AutoInit a;

    public /* synthetic */ d(FirebaseMessaging.AutoInit autoInit) {
        this.a = autoInit;
    }

    public final void a(Event event) {
        this.a.lambda$initialize$0(null);
    }
}
