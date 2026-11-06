package coil3.compose.internal;

import kotlin.Metadata;
import o.e41;
import o.es4;
import o.he;
import o.im3;
import o.ls4;
import o.sb1;
import o.to7;
import o.ua5;
import o.ud5;
import o.vn4;
import o.y07;
import o.yo1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/compose/internal/SubcomposeContentPainterElement;", "Lo/ls4;", "Lcoil3/compose/internal/SubcomposeContentPainterNode;", "Lo/ud5;", "painter", "Lo/ud5;", "io.coil-kt.coil3_coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubcomposeContentPainterElement extends ls4 {
    public final he b;
    public final sb1 c;
    public final float d;
    public final boolean e;
    private final ud5 painter;

    public SubcomposeContentPainterElement(ud5 ud5Var, he heVar, sb1 sb1Var, float f, boolean z) {
        this.painter = ud5Var;
        this.b = heVar;
        this.c = sb1Var;
        this.d = f;
        this.e = z;
    }

    @Override // o.ls4
    public final es4 create() {
        return new SubcomposeContentPainterNode(this.painter, this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubcomposeContentPainterElement)) {
            return false;
        }
        SubcomposeContentPainterElement subcomposeContentPainterElement = (SubcomposeContentPainterElement) obj;
        return im3.n(this.painter, subcomposeContentPainterElement.painter) && im3.n(this.b, subcomposeContentPainterElement.b) && im3.n(this.c, subcomposeContentPainterElement.c) && Float.compare(this.d, subcomposeContentPainterElement.d) == 0 && this.e == subcomposeContentPainterElement.e;
    }

    public final int hashCode() {
        return to7.f(e41.e(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.painter.hashCode() * 31)) * 31)) * 31, 961), 31, this.e);
    }

    public final String toString() {
        ud5 ud5Var = this.painter;
        StringBuilder sb = new StringBuilder("SubcomposeContentPainterElement(painter=");
        sb.append(ud5Var);
        sb.append(", alignment=");
        sb.append(this.b);
        sb.append(", contentScale=");
        sb.append(this.c);
        sb.append(", alpha=");
        sb.append(this.d);
        sb.append(", colorFilter=null, clipToBounds=");
        return ua5.n(", contentDescription=null)", sb, this.e);
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        SubcomposeContentPainterNode subcomposeContentPainterNode = (SubcomposeContentPainterNode) es4Var;
        boolean zA = y07.a(subcomposeContentPainterNode.getPainter().i(), this.painter.i());
        subcomposeContentPainterNode.X0(this.painter);
        subcomposeContentPainterNode.A = this.b;
        subcomposeContentPainterNode.B = this.c;
        subcomposeContentPainterNode.C = this.d;
        subcomposeContentPainterNode.D = this.e;
        if (!im3.n(subcomposeContentPainterNode.E, null)) {
            subcomposeContentPainterNode.E = null;
            vn4.p0(subcomposeContentPainterNode).U();
        }
        if (!zA) {
            vn4.p0(subcomposeContentPainterNode).S();
        }
        yo1.H(subcomposeContentPainterNode);
    }
}
