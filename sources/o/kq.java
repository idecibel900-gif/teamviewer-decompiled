package o;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
public final class kq extends SegmentFinder {
    public final /* synthetic */ lh7 a;

    public kq(lh7 lh7Var) {
        this.a = lh7Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.d(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.a(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.c(i);
    }
}
