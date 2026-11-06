package o;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class xq2 implements Comparator {
    public final Rect m = new Rect();
    public final Rect n = new Rect();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2544o;
    public final vv p;

    public xq2(boolean z, vv vvVar) {
        this.f2544o = z;
        this.p = vvVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.p.getClass();
        Rect rect = this.m;
        ((g4) obj).f(rect);
        Rect rect2 = this.n;
        ((g4) obj2).f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.f2544o;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
