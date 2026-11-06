package o;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c14 {
    public final me a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public me h;
    public final /* synthetic */ byte j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public c14(me meVar, byte b) {
        this.j = b;
        this.a = meVar;
    }

    public final void a(ie ieVar, int i, e45 e45Var) {
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jL = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (this.j) {
                    case 0:
                        nc5 nc5Var = e45Var.h0;
                        if (nc5Var != null) {
                            o03 o03Var = (o03) nc5Var;
                            float[] fArrB = o03Var.b();
                            if (!o03Var.E) {
                                jL = wn4.b(jL, fArrB);
                            }
                        }
                        jL = us1.L(jL, e45Var.T);
                        break;
                    default:
                        tg4 tg4VarY0 = e45Var.Y0();
                        tg4VarY0.getClass();
                        long j = tg4VarY0.H;
                        jL = t65.e((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jL);
                        break;
                }
                e45Var = e45Var.K;
                e45Var.getClass();
                if (e45Var.equals(this.a.f())) {
                    int iRound = Math.round(ieVar instanceof b63 ? Float.intBitsToFloat((int) (jL & 4294967295L)) : Float.intBitsToFloat((int) (jL >> 32)));
                    HashMap map = this.i;
                    if (map.containsKey(ieVar)) {
                        int iIntValue = ((Number) xm4.P(ieVar, map)).intValue();
                        b63 b63Var = le.a;
                        iRound = ((Number) ieVar.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(ieVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!b(e45Var).containsKey(ieVar));
            float fC = c(e45Var, ieVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(e45 e45Var) {
        switch (this.j) {
            case 0:
                return e45Var.F0().c();
            default:
                tg4 tg4VarY0 = e45Var.Y0();
                tg4VarY0.getClass();
                return tg4VarY0.F0().c();
        }
    }

    public final int c(e45 e45Var, ie ieVar) {
        switch (this.j) {
            case 0:
                return e45Var.W(ieVar);
            default:
                tg4 tg4VarY0 = e45Var.Y0();
                tg4VarY0.getClass();
                return tg4VarY0.W(ieVar);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        me meVar = this.a;
        me meVarG = meVar.g();
        if (meVarG == null) {
            return;
        }
        if (this.c) {
            meVarG.Q();
        } else if (this.e || this.d) {
            meVarG.requestLayout();
        }
        if (this.f) {
            meVar.Q();
        }
        if (this.g) {
            meVar.requestLayout();
        }
        meVarG.c().f();
    }

    public final void g() {
        HashMap map = this.i;
        map.clear();
        q0 q0Var = new q0(this, (byte) 6);
        me meVar = this.a;
        meVar.J(q0Var);
        map.putAll(b(meVar.f()));
        this.b = false;
    }

    public final void h() {
        c14 c14VarC;
        c14 c14VarC2;
        boolean zD = d();
        me meVar = this.a;
        if (!zD) {
            me meVarG = meVar.g();
            if (meVarG == null) {
                return;
            }
            meVar = meVarG.c().h;
            if (meVar == null || !meVar.c().d()) {
                me meVar2 = this.h;
                if (meVar2 == null || meVar2.c().d()) {
                    return;
                }
                me meVarG2 = meVar2.g();
                if (meVarG2 != null && (c14VarC2 = meVarG2.c()) != null) {
                    c14VarC2.h();
                }
                me meVarG3 = meVar2.g();
                meVar = (meVarG3 == null || (c14VarC = meVarG3.c()) == null) ? null : c14VarC.h;
            }
        }
        this.h = meVar;
    }
}
