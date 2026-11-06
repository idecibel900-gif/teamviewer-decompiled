package io.sentry.internal.gestures;

import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final WeakReference a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public c(Object obj, String str, String str2, String str3, String str4) {
        this.a = new WeakReference(obj);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (io.sentry.util.b.j(this.b, cVar.b) && io.sentry.util.b.j(this.c, cVar.c) && io.sentry.util.b.j(this.d, cVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.d});
    }
}
