package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class hk6 implements tk6 {
    public static final a65 k = new a65((byte) 20, (Object) new fi6(26), (Object) new fk6((byte) 0), false);
    public final yf5 a;
    public float g;
    public final eo1 i;
    public final eo1 j;
    public final yf5 b = new yf5(0);
    public final yf5 c = new yf5(0);
    public final bg5 d = h57.p(Boolean.FALSE);
    public final mw4 e = new mw4();
    public final yf5 f = new yf5(Integer.MAX_VALUE);
    public final wk1 h = new wk1(new y46((Object) this, (byte) 8));

    public hk6(int i) {
        this.a = new yf5(i);
        final byte b = 0;
        this.i = d57.b(new Function0(this) { // from class: o.ek6
            public final /* synthetic */ hk6 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                hk6 hk6Var = this.n;
                switch (b2) {
                    case 0:
                        return Boolean.valueOf(hk6Var.a.z() < hk6Var.f.z());
                    default:
                        return Boolean.valueOf(hk6Var.a.z() > 0);
                }
            }
        });
        final byte b2 = 1;
        this.j = d57.b(new Function0(this) { // from class: o.ek6
            public final /* synthetic */ hk6 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                hk6 hk6Var = this.n;
                switch (b3) {
                    case 0:
                        return Boolean.valueOf(hk6Var.a.z() < hk6Var.f.z());
                    default:
                        return Boolean.valueOf(hk6Var.a.z() > 0);
                }
            }
        });
    }

    @Override // o.tk6
    public final boolean a() {
        return this.h.a();
    }

    @Override // o.tk6
    public final boolean b() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    @Override // o.tk6
    public final boolean c() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // o.tk6
    public final float d(float f) {
        return this.h.d(f);
    }

    @Override // o.tk6
    public final Object e(ay4 ay4Var, hw2 hw2Var, jc1 jc1Var) {
        Object objE = this.h.e(ay4Var, hw2Var, jc1Var);
        return objE == ne1.m ? objE : f88.a;
    }
}
