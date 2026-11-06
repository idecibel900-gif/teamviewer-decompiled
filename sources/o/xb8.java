package o;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class xb8 extends bb8 {
    public final k13 b;
    public String c;
    public boolean d;
    public final q52 e;
    public Function0 f;
    public final bg5 g;
    public t70 h;
    public final bg5 i;
    public long j;
    public float k;
    public float l;
    public final wb8 m;

    public xb8(k13 k13Var) {
        this.b = k13Var;
        k13Var.i = new wb8(this, (byte) 0);
        this.c = "";
        this.d = true;
        this.e = new q52();
        this.f = new j68((byte) 2);
        this.g = h57.p(null);
        this.i = h57.p(new y07(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new wb8(this, (byte) 1);
    }

    @Override // o.bb8
    public final void a(u52 u52Var) {
        e(u52Var, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    public final void e(u52 u52Var, float f, tv0 tv0Var) {
        int i;
        t70 t70Var;
        vi viVarQ;
        char c;
        long j;
        long jB;
        tv0 tv0Var2;
        int i2;
        int i3;
        k13 k13Var = this.b;
        boolean z = k13Var.d;
        bg5 bg5Var = this.g;
        if (!z || k13Var.e == 16) {
            i = 0;
        } else {
            tv0 tv0Var3 = (tv0) bg5Var.getValue();
            int i4 = bc8.a;
            if (!(tv0Var3 instanceof t70) ? tv0Var3 == null : (i3 = ((t70) tv0Var3).c) == 5 || i3 == 3) {
                i = 0;
            } else if (!(tv0Var instanceof t70) ? tv0Var == null : (i2 = ((t70) tv0Var).c) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.d;
        q52 q52Var = this.e;
        if (z2 || !y07.a(this.j, u52Var.d())) {
            if (i == 1) {
                jB = k13Var.e;
                int i5 = bc8.a;
                if (rv0.c(jB) != 1.0f) {
                    jB = rv0.b(1.0f, jB);
                }
                t70Var = new t70(5, jB);
            } else {
                t70Var = null;
            }
            this.h = t70Var;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (u52Var.d() >> 32));
            bg5 bg5Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((y07) bg5Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)) / Float.intBitsToFloat((int) (((y07) bg5Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (u52Var.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (u52Var.d() & 4294967295L))))) & 4294967295L);
            j04 layoutDirection = u52Var.getLayoutDirection();
            viVarQ = q52Var.a;
            cg cgVarA = q52Var.b;
            if (viVarQ != null || cgVarA == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = viVarQ.a;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || q52Var.d != i) {
                }
                q52Var.c = jCeil;
                nl0 nl0Var = q52Var.e;
                ml0 ml0Var = nl0Var.m;
                long jA0 = xs1.a0(jCeil);
                in1 in1Var = ml0Var.a;
                j04 j04Var = ml0Var.b;
                ll0 ll0Var = ml0Var.c;
                cg cgVar = cgVarA;
                long j2 = ml0Var.d;
                ml0Var.a = u52Var;
                ml0Var.b = layoutDirection;
                ml0Var.c = cgVar;
                ml0Var.d = jA0;
                cgVar.g();
                u52.k0(nl0Var, rv0.b, 0L, 0.0f, 62);
                this.m.invoke(nl0Var);
                cgVar.p();
                ml0Var.a = in1Var;
                ml0Var.b = j04Var;
                ml0Var.c = ll0Var;
                ml0Var.d = j2;
                viVarQ.a.prepareToDraw();
                this.d = false;
                this.j = u52Var.d();
            }
            viVarQ = ds1.q((int) (jCeil >> c), (int) (jCeil & j), i, 24);
            cgVarA = dg.a(viVarQ);
            q52Var.a = viVarQ;
            q52Var.b = cgVarA;
            q52Var.d = i;
            q52Var.c = jCeil;
            nl0 nl0Var2 = q52Var.e;
            ml0 ml0Var2 = nl0Var2.m;
            long jA1 = xs1.a0(jCeil);
            in1 in1Var2 = ml0Var2.a;
            j04 j04Var2 = ml0Var2.b;
            ll0 ll0Var2 = ml0Var2.c;
            cg cgVar2 = cgVarA;
            long j3 = ml0Var2.d;
            ml0Var2.a = u52Var;
            ml0Var2.b = layoutDirection;
            ml0Var2.c = cgVar2;
            ml0Var2.d = jA1;
            cgVar2.g();
            u52.k0(nl0Var2, rv0.b, 0L, 0.0f, 62);
            this.m.invoke(nl0Var2);
            cgVar2.p();
            ml0Var2.a = in1Var2;
            ml0Var2.b = j04Var2;
            ml0Var2.c = ll0Var2;
            ml0Var2.d = j3;
            viVarQ.a.prepareToDraw();
            this.d = false;
            this.j = u52Var.d();
        } else {
            vi viVar = q52Var.a;
            if (i != (viVar != null ? viVar.a() : 0)) {
                if (i == 1) {
                    jB = k13Var.e;
                    int i7 = bc8.a;
                    if (rv0.c(jB) != 1.0f) {
                        jB = rv0.b(1.0f, jB);
                    }
                    t70Var = new t70(5, jB);
                } else {
                    t70Var = null;
                }
                this.h = t70Var;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (u52Var.d() >> 32));
                bg5 bg5Var3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((y07) bg5Var3.getValue()).a >> 32));
                this.l = Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)) / Float.intBitsToFloat((int) (((y07) bg5Var3.getValue()).a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (u52Var.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (u52Var.d() & 4294967295L))))) & 4294967295L);
                j04 layoutDirection2 = u52Var.getLayoutDirection();
                viVarQ = q52Var.a;
                cg cgVarA2 = q52Var.b;
                if (viVarQ != null) {
                    c = ' ';
                    j = 4294967295L;
                    viVarQ = ds1.q((int) (jCeil2 >> c), (int) (jCeil2 & j), i, 24);
                    cgVarA2 = dg.a(viVarQ);
                    q52Var.a = viVarQ;
                    q52Var.b = cgVarA2;
                    q52Var.d = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    viVarQ = ds1.q((int) (jCeil2 >> c), (int) (jCeil2 & j), i, 24);
                    cgVarA2 = dg.a(viVarQ);
                    q52Var.a = viVarQ;
                    q52Var.b = cgVarA2;
                    q52Var.d = i;
                }
                q52Var.c = jCeil2;
                nl0 nl0Var3 = q52Var.e;
                ml0 ml0Var3 = nl0Var3.m;
                long jA2 = xs1.a0(jCeil2);
                in1 in1Var3 = ml0Var3.a;
                j04 j04Var3 = ml0Var3.b;
                ll0 ll0Var3 = ml0Var3.c;
                cg cgVar3 = cgVarA2;
                long j4 = ml0Var3.d;
                ml0Var3.a = u52Var;
                ml0Var3.b = layoutDirection2;
                ml0Var3.c = cgVar3;
                ml0Var3.d = jA2;
                cgVar3.g();
                u52.k0(nl0Var3, rv0.b, 0L, 0.0f, 62);
                this.m.invoke(nl0Var3);
                cgVar3.p();
                ml0Var3.a = in1Var3;
                ml0Var3.b = j04Var3;
                ml0Var3.c = ll0Var3;
                ml0Var3.d = j4;
                viVarQ.a.prepareToDraw();
                this.d = false;
                this.j = u52Var.d();
            }
        }
        if (tv0Var != null) {
            tv0Var2 = tv0Var;
        } else {
            tv0Var2 = ((tv0) bg5Var.getValue()) != null ? (tv0) bg5Var.getValue() : this.h;
        }
        vi viVar2 = q52Var.a;
        if (viVar2 == null) {
            ki3.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        u52.C0(u52Var, viVar2, q52Var.c, 0L, f, tv0Var2, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        bg5 bg5Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((y07) bg5Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((y07) bg5Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
