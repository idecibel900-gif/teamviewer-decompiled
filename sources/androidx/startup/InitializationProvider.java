package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import io.sentry.android.core.performance.f;
import o.f97;
import o.iu;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        f.e(this);
        Context context = getContext();
        if (context == null) {
            f97 f97Var = new f97("Context cannot be null");
            f.f(this);
            throw f97Var;
        }
        if (context.getApplicationContext() != null) {
            iu iuVarA = iu.A(context);
            Class<?> cls = getClass();
            Context context2 = (Context) iuVarA.n;
            try {
                try {
                    Trace.beginSection("Startup");
                    iuVarA.n(context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), 128).metaData);
                    Trace.endSection();
                } catch (PackageManager.NameNotFoundException e) {
                    throw new f97(e);
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        f.f(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
