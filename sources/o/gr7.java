package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class gr7 implements tk6 {
    public final /* synthetic */ tk6 a;
    public final eo1 b;
    public final eo1 c;

    public gr7(tk6 tk6Var, final hr7 hr7Var) {
        this.a = tk6Var;
        final byte b = 0;
        this.b = d57.b(new Function0() { // from class: o.fr7
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                hr7 hr7Var2 = hr7Var;
                switch (b2) {
                    case 0:
                        return Boolean.valueOf(hr7Var2.a.z() < hr7Var2.b.z());
                    default:
                        return Boolean.valueOf(hr7Var2.a.z() > 0.0f);
                }
            }
        });
        final byte b2 = 1;
        this.c = d57.b(new Function0() { // from class: o.fr7
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                hr7 hr7Var2 = hr7Var;
                switch (b3) {
                    case 0:
                        return Boolean.valueOf(hr7Var2.a.z() < hr7Var2.b.z());
                    default:
                        return Boolean.valueOf(hr7Var2.a.z() > 0.0f);
                }
            }
        });
    }

    @Override // o.tk6
    public final boolean a() {
        return this.a.a();
    }

    @Override // o.tk6
    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // o.tk6
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // o.tk6
    public final float d(float f) {
        return this.a.d(f);
    }

    @Override // o.tk6
    public final Object e(ay4 ay4Var, hw2 hw2Var, jc1 jc1Var) {
        return this.a.e(ay4Var, hw2Var, jc1Var);
    }
}
