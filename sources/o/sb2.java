package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sb2 extends yz3 implements Function1 {
    public final /* synthetic */ byte n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ dy6 f2002o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb2(dy6 dy6Var, m18 m18Var, m18 m18Var2, m18 m18Var3) {
        super(1);
        this.f2002o = dy6Var;
        this.p = m18Var;
        this.q = m18Var2;
        this.r = m18Var3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        Object obj2 = this.q;
        Object obj3 = this.p;
        dy6 dy6Var = this.f2002o;
        Object obj4 = this.r;
        switch (b) {
            case 0:
                jd6 jd6Var = (jd6) obj;
                i97 i97Var = (i97) obj3;
                float fFloatValue = i97Var != null ? ((Number) i97Var.getValue()).floatValue() : 1.0f;
                cg3 cg3Var = dy6Var.c;
                wf5 wf5Var = (wf5) cg3Var.d;
                float fZ = fFloatValue * ((dy6Var.b() && ((Boolean) ((bg5) cg3Var.a).getValue()).booleanValue()) ? ((wf5) cg3Var.b).z() : 1.0f);
                if (dy6Var.b()) {
                    dy6Var.f = fZ;
                }
                jd6Var.b(fZ);
                i97 i97Var2 = (i97) obj2;
                float fFloatValue2 = i97Var2 != null ? ((Number) i97Var2.getValue()).floatValue() : 1.0f;
                boolean z = dy6Var.b() && ((Boolean) ((bg5) cg3Var.c).getValue()).booleanValue();
                float fZ2 = fFloatValue2 * (z ? wf5Var.z() : 1.0f);
                if (dy6Var.b()) {
                    dy6Var.g = fZ2;
                    if (z) {
                        wf5Var.z();
                    }
                    if (z) {
                        pc8 pc8Var = dy6Var.j;
                        if (pc8Var == null) {
                            pc8Var = new pc8(false);
                            dy6Var.j = pc8Var;
                        }
                        ax5 ax5Var = im1.a;
                        long j = dy6Var.d;
                        long jH = (1 | (j - 1)) == Long.MAX_VALUE ? c72.h(vs1.C(j)) : vs1.U(jt4.a(), j);
                        pc8Var.a(fZ2, ((((int) jH) & 1) != 1 || c72.d(jH)) ? c72.g(jH, g72.MILLISECONDS) : jH >> 1);
                    }
                }
                jd6Var.k(fZ2);
                jd6Var.l(fZ2);
                i97 i97Var3 = (i97) obj4;
                long j2 = i97Var3 != null ? ((d18) i97Var3.getValue()).a : d18.b;
                if (dy6Var.b() && ((Boolean) ((bg5) cg3Var.e).getValue()).booleanValue()) {
                    j2 = ((d18) ((bg5) cg3Var.f).getValue()).a;
                }
                if (dy6Var.b()) {
                    dy6Var.h = j2;
                }
                jd6Var.z(j2);
                return f88.a;
            default:
                hf2 hf2Var = (hf2) obj4;
                int iOrdinal = ((mb2) obj).ordinal();
                d18 d18Var = null;
                if (iOrdinal == 0) {
                    pi6 pi6Var = ((bc2) obj2).a.d;
                    if (pi6Var != null) {
                        d18Var = new d18(pi6Var.b);
                    } else {
                        pi6 pi6Var2 = hf2Var.a.d;
                        if (pi6Var2 != null) {
                            d18Var = new d18(pi6Var2.b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    d18Var = (d18) obj3;
                } else {
                    if (iOrdinal != 2) {
                        gk0.s();
                        return null;
                    }
                    pi6 pi6Var3 = hf2Var.a.d;
                    d18Var = new d18(pi6Var3 != null ? pi6Var3.b : dy6Var.h);
                }
                return new d18(d18Var != null ? d18Var.a : d18.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb2(d18 d18Var, bc2 bc2Var, hf2 hf2Var, dy6 dy6Var) {
        super(1);
        this.p = d18Var;
        this.q = bc2Var;
        this.r = hf2Var;
        this.f2002o = dy6Var;
    }
}
