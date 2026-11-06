package o;

/* JADX INFO: loaded from: classes2.dex */
public final class h01 extends io.sentry.android.core.u0 {
    public final boolean p;

    public h01(nd ndVar, boolean z) {
        super(ndVar);
        this.p = z;
    }

    @Override // io.sentry.android.core.u0
    public final void h(byte b) {
        if (this.p) {
            m(String.valueOf(b & 255));
            return;
        }
        String strValueOf = String.valueOf(b & 255);
        strValueOf.getClass();
        ((nd) this.f127o).t(strValueOf);
    }

    @Override // io.sentry.android.core.u0
    public final void j(int i) {
        boolean z = this.p;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            m(unsignedString);
        } else {
            unsignedString.getClass();
            ((nd) this.f127o).t(unsignedString);
        }
    }

    @Override // io.sentry.android.core.u0
    public final void k(long j) {
        boolean z = this.p;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            m(unsignedString);
        } else {
            unsignedString.getClass();
            ((nd) this.f127o).t(unsignedString);
        }
    }

    @Override // io.sentry.android.core.u0
    public final void l(short s) {
        if (this.p) {
            m(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((nd) this.f127o).t(strValueOf);
    }
}
