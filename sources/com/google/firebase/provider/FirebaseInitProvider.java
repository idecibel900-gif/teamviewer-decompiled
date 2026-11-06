package com.google.firebase.provider;

import android.content.ContentProvider;
import com.google.firebase.StartupTime;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class FirebaseInitProvider extends ContentProvider {
    private static StartupTime startupTime = StartupTime.now();
    private static AtomicBoolean currentlyInitializing = new AtomicBoolean(false);

    public static StartupTime getStartupTime() {
        return startupTime;
    }

    public static boolean isCurrentlyInitializing() {
        return currentlyInitializing.get();
    }
}
