package io.sentry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k7 extends l6 {
    public static final List u = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));
    public volatile boolean c;
    public Double d;
    public Double e;
    public j7 f;
    public boolean g;
    public short h;
    public short i;
    public int j;
    public boolean k;
    public io.sentry.protocol.u l;
    public boolean m;
    public x4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f208o;
    public List p;
    public List q;
    public boolean r;
    public List s;
    public List t;

    @Override // io.sentry.l6
    public final void C() {
        if (this.c) {
            return;
        }
        this.c = true;
        io.sentry.util.b.a("ReplayCustomMasking");
    }

    public final void D(ArrayList arrayList) {
        this.p = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void E(ArrayList arrayList) {
        this.q = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void F(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(u);
        linkedHashSet.addAll(arrayList);
        this.s = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void G(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(u);
        linkedHashSet.addAll(arrayList);
        this.t = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void H(Double d) {
        if (io.sentry.util.b.p(d, true)) {
            this.e = d;
        } else {
            h2.g(d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.", "The value ");
        }
    }

    public final void I(Double d) {
        if (io.sentry.util.b.p(d, true)) {
            this.d = d;
        } else {
            h2.g(d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.", "The value ");
        }
    }

    @Override // io.sentry.l6
    public final void v(boolean z) {
        if (!z) {
            C();
        }
        super.v(z);
    }

    @Override // io.sentry.l6
    public final void w(boolean z) {
        if (!z) {
            C();
        }
        super.w(z);
    }
}
