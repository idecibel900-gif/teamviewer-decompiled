package coil3.compose.internal;

import kotlin.Metadata;
import o.he;
import o.sb1;
import o.ud5;
import o.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcoil3/compose/internal/SubcomposeContentPainterNode;", "Lo/w0;", "Lo/ud5;", "painter", "Lo/ud5;", "V0", "()Lo/ud5;", "X0", "(Lo/ud5;)V", "io.coil-kt.coil3_coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubcomposeContentPainterNode extends w0 {
    private ud5 painter;

    public SubcomposeContentPainterNode(ud5 ud5Var, he heVar, sb1 sb1Var, float f, boolean z) {
        super(heVar, sb1Var, f, z, null, null);
        this.painter = ud5Var;
    }

    @Override // o.w0
    /* JADX INFO: renamed from: V0, reason: from getter */
    public final ud5 getPainter() {
        return this.painter;
    }

    public final void X0(ud5 ud5Var) {
        this.painter = ud5Var;
    }
}
