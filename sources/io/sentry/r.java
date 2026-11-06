package io.sentry;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public Boolean a;
    public w2 b;
    public w2 c;
    public Set d;
    public Boolean e;
    public Boolean f;
    public final io.sentry.internal.debugmeta.c g = new io.sentry.internal.debugmeta.c((byte) 2);
    public final io.sentry.internal.debugmeta.c h = new io.sentry.internal.debugmeta.c((byte) 1);

    public final boolean a() {
        if (this.a != null || this.b != null || this.c != null || this.d != null || this.e != null || this.f != null) {
            return true;
        }
        io.sentry.internal.debugmeta.c cVar = this.g;
        if (((w2) cVar.n) != null || ((w2) cVar.f205o) != null) {
            return true;
        }
        io.sentry.internal.debugmeta.c cVar2 = this.h;
        return (((Boolean) cVar2.n) == null && ((Boolean) cVar2.f205o) == null) ? false : true;
    }

    public final void b(Set set) {
        Set setUnmodifiableSet;
        if (set == null) {
            setUnmodifiableSet = null;
        } else {
            setUnmodifiableSet = set.isEmpty() ? Collections.EMPTY_SET : Collections.unmodifiableSet(EnumSet.copyOf((Collection) set));
        }
        this.d = setUnmodifiableSet;
    }
}
