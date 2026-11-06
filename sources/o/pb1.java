package o;

import coil3.compose.AsyncImagePainter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/pb1;", "Lo/ls4;", "Lo/qb1;", "io.coil-kt.coil3_coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class pb1 extends ls4 {
    public final ke3 b;
    public final i46 c;
    public final ox d;
    public final Function1 e;
    public final he f;
    public final sb1 g;
    public final vx h;
    public final String i;

    public pb1(ke3 ke3Var, i46 i46Var, ox oxVar, Function1 function1, he heVar, sb1 sb1Var, vx vxVar, String str) {
        this.b = ke3Var;
        this.c = i46Var;
        this.d = oxVar;
        this.e = function1;
        this.f = heVar;
        this.g = sb1Var;
        this.h = vxVar;
        this.i = str;
    }

    @Override // o.ls4
    public final es4 create() {
        ox oxVar = this.d;
        i46 i46Var = this.c;
        ke3 ke3Var = this.b;
        qx qxVar = new qx(i46Var, ke3Var, oxVar);
        AsyncImagePainter asyncImagePainter = new AsyncImagePainter(qxVar);
        asyncImagePainter.y = this.e;
        asyncImagePainter.z = this.g;
        asyncImagePainter.A = true;
        asyncImagePainter.B = this.h;
        asyncImagePainter.m(qxVar);
        a17 a17Var = ke3Var.p;
        return new qb1(asyncImagePainter, this.f, this.g, this.i, a17Var instanceof v61 ? (v61) a17Var : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pb1) {
            pb1 pb1Var = (pb1) obj;
            if (this.b.equals(pb1Var.b) && this.c == pb1Var.c && im3.n(this.d, pb1Var.d) && im3.n(this.e, pb1Var.e) && im3.n(this.f, pb1Var.f) && im3.n(this.g, pb1Var.g) && Float.compare(1.0f, 1.0f) == 0 && im3.n(this.h, pb1Var.h) && this.i.equals(pb1Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = to7.f(e41.e(1.0f, (this.g.hashCode() + ((this.f.hashCode() + fx3.a(1, ua5.d((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 961, this.e), 31)) * 31)) * 31, 961), 31, true);
        vx vxVar = this.h;
        return this.i.hashCode() + ((iF + (vxVar == null ? 0 : vxVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ContentPainterElement(request=" + this.b + ", imageLoader=" + this.c + ", modelEqualityDelegate=" + this.d + ", transform=" + this.e + ", onState=null, filterQuality=Low, alignment=" + this.f + ", contentScale=" + this.g + ", alpha=1.0, colorFilter=null, clipToBounds=true, previewHandler=" + this.h + ", contentDescription=" + this.i + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        qb1 qb1Var = (qb1) es4Var;
        long jI = qb1Var.G.i();
        v61 v61Var = qb1Var.F;
        ox oxVar = this.d;
        i46 i46Var = this.c;
        ke3 ke3Var = this.b;
        qx qxVar = new qx(i46Var, ke3Var, oxVar);
        AsyncImagePainter asyncImagePainter = qb1Var.G;
        asyncImagePainter.y = this.e;
        sb1 sb1Var = this.g;
        asyncImagePainter.z = sb1Var;
        asyncImagePainter.A = true;
        asyncImagePainter.B = this.h;
        asyncImagePainter.m(qxVar);
        boolean zA = y07.a(jI, asyncImagePainter.i());
        qb1Var.A = this.f;
        a17 a17Var = ke3Var.p;
        qb1Var.F = a17Var instanceof v61 ? (v61) a17Var : null;
        qb1Var.B = sb1Var;
        qb1Var.C = 1.0f;
        qb1Var.D = true;
        String str = qb1Var.E;
        String str2 = this.i;
        if (!im3.n(str, str2)) {
            qb1Var.E = str2;
            vn4.p0(qb1Var).U();
        }
        boolean zN = im3.n(v61Var, qb1Var.F);
        if (!zA || !zN) {
            vn4.p0(qb1Var).S();
        }
        yo1.H(qb1Var);
    }
}
