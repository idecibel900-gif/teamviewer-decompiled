package androidx.compose.material3;

import kotlin.Metadata;
import o.ae6;
import o.bt1;
import o.le6;
import o.mw4;
import o.o65;
import o.pw6;
import o.v01;
import o.vm1;
import o.xv0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/DelegatingThemeAwareRippleNode;", "Lo/vm1;", "Lo/v01;", "Lo/o65;", "Lo/xv0;", "color", "Lo/xv0;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DelegatingThemeAwareRippleNode extends vm1 implements v01, o65 {
    public final mw4 C;
    public final boolean D;
    public final float E;
    public final boolean G;
    public ae6 J;
    private final xv0 color;
    public final boolean F = true;
    public final boolean H = true;
    public final boolean I = true;

    public DelegatingThemeAwareRippleNode(mw4 mw4Var, boolean z, float f, le6 le6Var, pw6 pw6Var, boolean z2) {
        this.C = mw4Var;
        this.D = z;
        this.E = f;
        this.color = le6Var;
        this.G = z2;
    }

    @Override // o.es4
    public final void M0() {
        bt1.J(this, new a(this));
    }

    @Override // o.o65
    public final void n0() {
        bt1.J(this, new a(this));
    }
}
