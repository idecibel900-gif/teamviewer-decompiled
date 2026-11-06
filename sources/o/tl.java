package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tl extends uu0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte f2120o;
    public final /* synthetic */ ViewGroup p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl(ViewGroup viewGroup, byte b) {
        super(1);
        this.f2120o = b;
        this.p = viewGroup;
    }

    @Override // o.uu0
    public final sk8 h(sk8 sk8Var, List list) {
        byte b = this.f2120o;
        ViewGroup viewGroup = this.p;
        switch (b) {
            case 0:
                return ((ge8) viewGroup).j(sk8Var);
            default:
                y02 y02Var = (y02) viewGroup;
                if (y02Var.y) {
                    return sk8Var;
                }
                View childAt = y02Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, y02Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, y02Var.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? sk8Var : sk8Var.a.r(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // o.uu0
    public final lh7 i(xj8 xj8Var, lh7 lh7Var) {
        byte b = this.f2120o;
        ViewGroup viewGroup = this.p;
        switch (b) {
            case 0:
                ti3 ti3Var = (ti3) ((ge8) viewGroup).L.S.d;
                if (!ti3Var.q0.z) {
                    return lh7Var;
                }
                long jO = us1.O(ti3Var.P(0L));
                int i = (int) (jO >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jO & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long j = vt1.s(ti3Var).j();
                int i3 = (int) (j >> 32);
                int i4 = (int) (j & 4294967295L);
                long j2 = ti3Var.f1179o;
                long jO2 = us1.O(ti3Var.P((((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jO2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (jO2 & 4294967295L));
                int i7 = i6 >= 0 ? i6 : 0;
                return (i == 0 && i2 == 0 && i5 == 0 && i7 == 0) ? lh7Var : new lh7(xl.i((nj3) lh7Var.n, i, i2, i5, i7), xl.i((nj3) lh7Var.f1364o, i, i2, i5, i7), (byte) 14);
            default:
                y02 y02Var = (y02) viewGroup;
                if (y02Var.y) {
                    return lh7Var;
                }
                View childAt = y02Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, y02Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, y02Var.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return lh7Var;
                }
                nj3 nj3VarB = nj3.b(iMax, iMax2, iMax3, iMax4);
                int i8 = nj3VarB.a;
                nj3 nj3Var = (nj3) lh7Var.n;
                int i9 = nj3VarB.b;
                int i10 = nj3VarB.c;
                int i11 = nj3VarB.d;
                return new lh7(sk8.e(nj3Var, i8, i9, i10, i11), sk8.e((nj3) lh7Var.f1364o, i8, i9, i10, i11), (byte) 14);
        }
    }
}
