package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lv6 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ iv6 n;

    public /* synthetic */ lv6(iv6 iv6Var, byte b) {
        this.m = b;
        this.n = iv6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        iv6 iv6Var = this.n;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                iv6Var.e.invoke(bool);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                iv6Var.l.invoke(str);
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                iv6Var.f.invoke(bool2);
                break;
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                iv6Var.g.invoke(bool3);
                break;
            case 4:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                iv6Var.a.invoke(bool4);
                break;
            case 5:
                Boolean bool5 = (Boolean) obj;
                bool5.getClass();
                iv6Var.b.invoke(bool5);
                break;
            case 6:
                Boolean bool6 = (Boolean) obj;
                bool6.getClass();
                iv6Var.c.invoke(bool6);
                break;
            case 7:
                Boolean bool7 = (Boolean) obj;
                bool7.getClass();
                iv6Var.d.invoke(bool7);
                break;
            case 8:
                Boolean bool8 = (Boolean) obj;
                bool8.getClass();
                iv6Var.a.invoke(bool8);
                break;
            case ep1.b /* 9 */:
                Boolean bool9 = (Boolean) obj;
                bool9.getClass();
                iv6Var.b.invoke(bool9);
                break;
            case ep1.c /* 10 */:
                Boolean bool10 = (Boolean) obj;
                bool10.getClass();
                iv6Var.f.invoke(bool10);
                break;
            case 11:
                Boolean bool11 = (Boolean) obj;
                bool11.getClass();
                iv6Var.c.invoke(bool11);
                break;
            default:
                Boolean bool12 = (Boolean) obj;
                bool12.getClass();
                iv6Var.d.invoke(bool12);
                break;
        }
        return f88Var;
    }
}
