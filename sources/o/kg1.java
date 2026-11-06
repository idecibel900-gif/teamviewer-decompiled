package o;

import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class kg1 extends kh {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Serializable i0;

    public kg1(k76 k76Var, Function1 function1) {
        this.g0 = (byte) 1;
        this.i0 = k76Var;
        this.h0 = function1;
    }

    @Override // o.kh
    public void j(Object obj) {
        switch (this.g0) {
            case 1:
                zi0 zi0Var = (zi0) obj;
                zi0Var.getClass();
                k76 k76Var = (k76) this.i0;
                if (k76Var.m == null && ((Boolean) ((Function1) this.h0).invoke(zi0Var)).booleanValue()) {
                    k76Var.m = zi0Var;
                    break;
                }
                break;
        }
    }

    @Override // o.kh
    public final boolean l(Object obj) {
        byte b = this.g0;
        Object obj2 = this.h0;
        Object obj3 = this.i0;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                if (((Boolean) ((Function1) obj2).invoke(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            case 1:
                ((zi0) obj).getClass();
                return ((k76) obj3).m == null;
            default:
                ns4 ns4Var = (ns4) obj;
                k76 k76Var = (k76) obj3;
                ns4Var.getClass();
                String str = (String) obj2;
                String str2 = mo3.a;
                it2 it2VarI = bp1.g(ns4Var).i();
                it2VarI.getClass();
                js0 js0VarG = mo3.g(it2VarI);
                String str3 = (js0VarG != null ? fs3.e(js0VarG) : au8.w(ns4Var, xz2.Y)) + '.' + str;
                if (es3.b.contains(str3)) {
                    k76Var.m = as3.m;
                } else if (es3.d.contains(str3)) {
                    k76Var.m = as3.n;
                } else if (es3.c.contains(str3)) {
                    k76Var.m = as3.f354o;
                } else if (es3.a.contains(str3)) {
                    k76Var.m = as3.q;
                }
                return k76Var.m == null;
        }
    }

    @Override // o.kh
    public final Object z() {
        byte b = this.g0;
        Object obj = this.i0;
        switch (b) {
            case 0:
                return Boolean.valueOf(((boolean[]) obj)[0]);
            case 1:
                return (zi0) ((k76) obj).m;
            default:
                as3 as3Var = (as3) ((k76) obj).m;
                return as3Var == null ? as3.p : as3Var;
        }
    }

    public /* synthetic */ kg1(Object obj, Serializable serializable, byte b) {
        this.g0 = b;
        this.h0 = obj;
        this.i0 = serializable;
    }
}
