package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jb implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    public /* synthetic */ jb(Function1 function1, byte b) {
        this.m = b;
        this.n = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                zr7 zr7Var = (zr7) obj;
                zr7Var.getClass();
                function1.invoke(zr7Var.a.n);
                return f88.a;
            case 1:
                h71 h71Var = (h71) obj;
                h71Var.getClass();
                function1.invoke(h71Var);
                return f88.a;
            case 2:
                l28 l28Var = (l28) obj;
                if (l28Var instanceof az2) {
                    return Boolean.valueOf(((Boolean) function1.invoke(((az2) l28Var).A)).booleanValue());
                }
                hk0.l("Node is not a GestureNode instance");
                return null;
            case 3:
                Throwable th = (Throwable) obj;
                th.getClass();
                if (function1 != null) {
                    function1.invoke(th);
                }
                e41.s("device search failed: ", th.getMessage(), "GroupDevicesPagerLoader");
                return f88.a;
            case 4:
                vv6 vv6Var = (vv6) obj;
                vv6Var.getClass();
                ew6 ew6Var = vv6Var.c;
                if (ew6Var != null) {
                    ga7.a(ew6Var);
                }
                function1.invoke(vv6Var.a);
                return f88.a;
            case 5:
                vv6 vv6Var2 = (vv6) obj;
                vv6Var2.getClass();
                ew6 ew6Var2 = vv6Var2.c;
                if (ew6Var2 != null) {
                    ga7.a(ew6Var2);
                }
                function1.invoke(vv6Var2.a);
                return f88.a;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                function1.invoke(bool);
                return f88.a;
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                function1.invoke(bool2);
                return f88.a;
            case 8:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                function1.invoke(bool3);
                return f88.a;
            case ep1.b /* 9 */:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                function1.invoke(bool4);
                return f88.a;
            case ep1.c /* 10 */:
                vv6 vv6Var3 = (vv6) obj;
                vv6Var3.getClass();
                ew6 ew6Var3 = vv6Var3.c;
                if (ew6Var3 != null) {
                    ga7.a(ew6Var3);
                }
                function1.invoke(vv6Var3.a);
                return f88.a;
            case 11:
                vv6 vv6Var4 = (vv6) obj;
                vv6Var4.getClass();
                ew6 ew6Var4 = vv6Var4.c;
                if (ew6Var4 != null) {
                    ga7.a(ew6Var4);
                }
                function1.invoke(vv6Var4.a);
                return f88.a;
            case ep1.d /* 12 */:
                vv6 vv6Var5 = (vv6) obj;
                vv6Var5.getClass();
                ew6 ew6Var5 = vv6Var5.c;
                if (ew6Var5 != null) {
                    ga7.a(ew6Var5);
                }
                function1.invoke(vv6Var5.a);
                return f88.a;
            case 13:
                j74 j74Var = (j74) obj;
                j74Var.getClass();
                function1.invoke(j74Var);
                return f88.a;
            case 14:
                j74 j74Var2 = (j74) obj;
                j74Var2.getClass();
                function1.invoke(j74Var2);
                return f88.a;
            case 15:
                n47 n47Var = (n47) function1.invoke((t47) obj);
                synchronized (v47.c) {
                    v47.d = v47.d.f(n47Var.g());
                }
                return n47Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return function1.invoke(l);
        }
    }
}
