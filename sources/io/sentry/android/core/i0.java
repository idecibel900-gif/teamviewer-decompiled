package io.sentry.android.core;

import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;
import o.iq8;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends CopyOnWriteArrayList {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ i0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.m) {
            case 0:
                h0 h0Var = (h0) obj;
                boolean zAdd = super.add(h0Var);
                if (Boolean.FALSE.equals(((j0) this.n).n.p)) {
                    h0Var.e();
                } else if (Boolean.TRUE.equals(((j0) this.n).n.p)) {
                    h0Var.j();
                }
                return zAdd;
            default:
                io.sentry.android.replay.g gVar = (io.sentry.android.replay.g) obj;
                io.sentry.android.replay.y yVar = (io.sentry.android.replay.y) this.n;
                io.sentry.util.a aVar = yVar.n;
                aVar.e();
                try {
                    for (View view : yVar.p) {
                        if (gVar != null) {
                            gVar.e(view, true);
                        }
                    }
                    iq8.l(aVar, null);
                    return super.add(gVar);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        iq8.l(aVar, th);
                        throw th2;
                    }
                }
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.m) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.g) {
                    return super.contains((io.sentry.android.replay.g) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.m) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.g) {
                    return super.indexOf((io.sentry.android.replay.g) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.m) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.g) {
                    return super.lastIndexOf((io.sentry.android.replay.g) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean remove(Object obj) {
        switch (this.m) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.g) {
                    return super.remove((io.sentry.android.replay.g) obj);
                }
                return false;
            default:
                return super.remove(obj);
        }
    }
}
