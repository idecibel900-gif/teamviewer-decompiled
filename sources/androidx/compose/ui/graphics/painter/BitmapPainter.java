package androidx.compose.ui.graphics.painter;

import kotlin.Metadata;
import o.dl3;
import o.e41;
import o.fx3;
import o.hk0;
import o.im3;
import o.tv0;
import o.u52;
import o.ud5;
import o.vi;
import o.vk3;
import o.xs1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Lo/ud5;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BitmapPainter extends ud5 {
    public final vi r;
    public final long s;
    public boolean t;
    public final long u;
    public float v;
    public tv0 w;

    public BitmapPainter(vi viVar, long j) {
        int i;
        this.r = viVar;
        this.s = j;
        this.t = true;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > viVar.a.getWidth() || i > viVar.a.getHeight()) {
            hk0.g("Failed requirement.");
            throw null;
        }
        this.u = j;
        this.v = 1.0f;
    }

    @Override // o.ud5
    public final boolean d(float f) {
        this.v = f;
        return true;
    }

    @Override // o.ud5
    public final boolean e(tv0 tv0Var) {
        this.w = tv0Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return im3.n(this.r, bitmapPainter.r) && vk3.a(0L, 0L) && dl3.b(this.s, bitmapPainter.s) && this.t == bitmapPainter.t;
    }

    public final int hashCode() {
        return Integer.hashCode(this.t ? 1 : 0) + fx3.c(fx3.c(this.r.hashCode() * 31, 31, 0L), 31, this.s);
    }

    @Override // o.ud5
    public final long i() {
        return xs1.a0(this.u);
    }

    @Override // o.ud5
    public final void j(u52 u52Var) {
        int iRound = Math.round(Float.intBitsToFloat((int) (u52Var.d() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)));
        float f = this.v;
        tv0 tv0Var = this.w;
        boolean z = this.t;
        u52.C0(u52Var, this.r, this.s, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, tv0Var, z ? 1 : 0, 328);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String strD = vk3.d(0L);
        String strC = dl3.c(this.s);
        boolean z = this.t;
        if (z == 0) {
            str = "None";
        } else if (z == 1) {
            str = "Low";
        } else if (z == 2) {
            str = "Medium";
        } else {
            str = z == 3 ? "High" : "Unknown";
        }
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.r);
        sb.append(", srcOffset=");
        sb.append(strD);
        sb.append(", srcSize=");
        return e41.m(sb, strC, ", filterQuality=", str, ")");
    }

    public BitmapPainter(vi viVar) {
        this(viVar, (((long) viVar.a.getHeight()) & 4294967295L) | (((long) viVar.a.getWidth()) << 32));
    }
}
