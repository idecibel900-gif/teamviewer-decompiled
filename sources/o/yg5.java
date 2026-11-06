package o;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yg5 extends bb8 {
    public sb0 b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public sb0 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2606o;
    public boolean p;
    public cc7 q;
    public final rj r;
    public rj s;
    public rj t;
    public final u14 u;

    public yg5() {
        int i = bc8.a;
        this.d = ea2.m;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.f2606o = true;
        rj rjVarA = tj.a();
        this.r = rjVarA;
        this.s = rjVarA;
        this.u = ds1.X(l54.n, new x85((byte) 9));
    }

    @Override // o.bb8
    public final void a(u52 u52Var) {
        cc7 cc7Var;
        if (this.n) {
            vs1.V(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        sb0 sb0Var = this.b;
        if (sb0Var != null) {
            u52.H0(u52Var, this.s, sb0Var, this.c, null, null, 56);
        }
        sb0 sb0Var2 = this.g;
        if (sb0Var2 != null) {
            cc7 cc7Var2 = this.q;
            if (this.f2606o || cc7Var2 == null) {
                cc7 cc7Var3 = new cc7(this.f, this.j, this.h, this.i, 16);
                this.q = cc7Var3;
                this.f2606o = false;
                cc7Var = cc7Var3;
            } else {
                cc7Var = cc7Var2;
            }
            u52.H0(u52Var, this.s, sb0Var2, this.e, cc7Var, null, 48);
        }
    }

    public final void e() {
        float f = this.k;
        rj rjVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = rjVar;
            return;
        }
        rj rjVar2 = this.s;
        if (rjVar2 != rjVar) {
            Path.FillType fillType = rjVar2.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.a.rewind();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        } else {
            this.s = tj.a();
        }
        u14 u14Var = this.u;
        ((sj) u14Var.getValue()).a.setPath(rjVar.a, false);
        float length = ((sj) u14Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((sj) u14Var.getValue()).a(f4, f5, this.s);
            return;
        }
        rj rjVarA = this.t;
        if (rjVarA == null) {
            rjVarA = tj.a();
            this.t = rjVarA;
        }
        rjVarA.g();
        ((sj) u14Var.getValue()).a(f4, length, rjVarA);
        rj.a(this.s, rjVarA);
        rjVarA.g();
        ((sj) u14Var.getValue()).a(0.0f, f5, rjVarA);
        rj.a(this.s, rjVarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}
