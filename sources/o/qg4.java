package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qg4 implements in1 {
    public boolean m;
    public long n = 9223372034707292159L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1829o = 0;
    public final /* synthetic */ rg4 p;

    public qg4(rg4 rg4Var) {
        this.p = rg4Var;
    }

    @Override // o.in1
    public final float Z() {
        return this.p.Z();
    }

    public final i04 a() {
        this.m = true;
        rg4 rg4Var = this.p;
        i04 i04VarX0 = rg4Var.x0();
        if (vk3.a(this.n, 9223372034707292159L)) {
            this.n = us1.O(i04VarX0.A(0L));
            this.f1829o = i04VarX0.j();
        }
        rg4Var.D0().getLayoutDelegate().b();
        return i04VarX0;
    }

    public final void b(e63 e63Var, float f) {
        rg4 rg4Var = this.p;
        r8 r8Var = rg4Var.C;
        if (r8Var == null) {
            r8Var = new r8();
            rg4Var.C = r8Var;
        }
        int iW0 = cx.W0(e63Var, (e63[]) r8Var.c);
        if (iW0 >= 0) {
            float[] fArr = (float[]) r8Var.d;
            if (fArr[iW0] != f) {
                fArr[iW0] = f;
                ((byte[]) r8Var.e)[iW0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) r8Var.e;
                if (bArr[iW0] == 2) {
                    bArr[iW0] = 0;
                    return;
                }
                return;
            }
        }
        int i = r8Var.b;
        e63[] e63VarArr = (e63[]) r8Var.c;
        if (i == e63VarArr.length) {
            int i2 = i * 2;
            r8Var.c = (e63[]) Arrays.copyOf(e63VarArr, i2);
            r8Var.d = Arrays.copyOf((float[]) r8Var.d, i2);
            r8Var.e = Arrays.copyOf((byte[]) r8Var.e, i2);
        }
        ((e63[]) r8Var.c)[i] = e63Var;
        ((byte[]) r8Var.e)[i] = 3;
        ((float[]) r8Var.d)[i] = f;
        r8Var.b++;
    }

    @Override // o.in1
    public final float getDensity() {
        return this.p.getDensity();
    }
}
