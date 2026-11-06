package androidx.compose.ui.draw;

import kotlin.Metadata;
import o.e41;
import o.es4;
import o.he;
import o.im3;
import o.ls4;
import o.sb1;
import o.to7;
import o.tv0;
import o.ud5;
import o.vn4;
import o.y07;
import o.yo1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Lo/ls4;", "Landroidx/compose/ui/draw/PainterNode;", "Lo/ud5;", "painter", "Lo/ud5;", "getPainter", "()Lo/ud5;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class PainterElement extends ls4 {
    public final he b;
    public final sb1 c;
    public final float d;
    public final tv0 e;
    private final ud5 painter;

    public PainterElement(ud5 ud5Var, he heVar, sb1 sb1Var, float f, tv0 tv0Var) {
        this.painter = ud5Var;
        this.b = heVar;
        this.c = sb1Var;
        this.d = f;
        this.e = tv0Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new PainterNode(this.painter, this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return im3.n(this.painter, painterElement.painter) && im3.n(this.b, painterElement.b) && im3.n(this.c, painterElement.c) && Float.compare(this.d, painterElement.d) == 0 && im3.n(this.e, painterElement.e);
    }

    public final int hashCode() {
        int iE = e41.e(this.d, (this.c.hashCode() + ((this.b.hashCode() + to7.f(this.painter.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        tv0 tv0Var = this.e;
        return iE + (tv0Var == null ? 0 : tv0Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        PainterNode painterNode = (PainterNode) es4Var;
        painterNode.getClass();
        boolean zA = y07.a(painterNode.getPainter().i(), this.painter.i());
        painterNode.Z0(this.painter);
        painterNode.A = this.b;
        painterNode.B = this.c;
        painterNode.C = this.d;
        painterNode.D = this.e;
        if (!zA) {
            vn4.p0(painterNode).S();
        }
        yo1.H(painterNode);
    }
}
