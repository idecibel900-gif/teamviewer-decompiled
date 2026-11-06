package io.sentry.android.core;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s2 implements Comparator {
    public final /* synthetic */ byte m;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                io.sentry.v1 v1Var = (io.sentry.v1) obj;
                io.sentry.v1 v1Var2 = (io.sentry.v1) obj2;
                if (v1Var == v1Var2) {
                    return 0;
                }
                int iCompareTo = v1Var.z().compareTo(v1Var2.z());
                return iCompareTo != 0 ? iCompareTo : v1Var.v().n.a().compareTo(v1Var2.v().n.a());
            case 1:
                io.sentry.android.core.anr.a aVar = (io.sentry.android.core.anr.a) obj;
                io.sentry.android.core.anr.a aVar2 = (io.sentry.android.core.anr.a) obj2;
                return Float.compare((aVar.b + 1.0f) * aVar.f * aVar.a, (aVar2.b + 1.0f) * aVar2.f * aVar2.a);
            default:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
        }
    }
}
