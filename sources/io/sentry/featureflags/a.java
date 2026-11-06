package io.sentry.featureflags;

import io.sentry.h2;
import io.sentry.protocol.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    public volatile List m;
    public final io.sentry.util.a n = new io.sentry.util.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f194o;

    public a(int i, List list) {
        this.f194o = i;
        this.m = list;
    }

    @Override // io.sentry.featureflags.b
    public final void clear() {
        io.sentry.util.a aVar = this.n;
        aVar.e();
        try {
            this.m = Collections.EMPTY_LIST;
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.featureflags.b
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final b m23clone() {
        return new a(this.f194o, this.m);
    }

    @Override // io.sentry.featureflags.b
    public final j h() {
        List list = this.m;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return new j(arrayList);
        }
        it.next().getClass();
        h2.f();
        return null;
    }
}
