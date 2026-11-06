package org.jetbrains.compose.resources;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import io.sentry.android.core.performance.f;
import o.hk0;
import o.yq4;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidContextProvider extends ContentProvider {
    public static Context m;

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        context.getClass();
        if (providerInfo == null) {
            yq4.l("AndroidContextProvider ProviderInfo cannot be null.");
        } else if ("org.jetbrains.compose.components.resources.resources.AndroidContextProvider".equals(providerInfo.authority)) {
            hk0.l("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable your application's build.gradle.");
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        f.e(this);
        m = getContext();
        f.f(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }
}
