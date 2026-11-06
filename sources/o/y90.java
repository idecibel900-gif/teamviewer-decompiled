package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y90 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ me1 f2589o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ y90(px4 px4Var, boolean z, k33 k33Var, me1 me1Var, w44 w44Var, Function1 function1, e43 e43Var) {
        this.m = (byte) 3;
        this.p = px4Var;
        this.n = z;
        this.q = k33Var;
        this.f2589o = me1Var;
        this.r = w44Var;
        this.s = function1;
        this.t = e43Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.t;
        Object obj3 = this.s;
        Object obj4 = this.r;
        Object obj5 = this.q;
        Object obj6 = this.p;
        byte b2 = 1;
        switch (b) {
            case 0:
                xy6 xy6Var = (xy6) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                Function0 function0 = (Function0) obj2;
                op6 op6Var = (op6) obj;
                if (this.n) {
                    a9 a9Var = new a9(function0, (byte) 8);
                    fw3[] fw3VarArr = lp6.a;
                    op6Var.d(zo6.v, new m3(str, a9Var));
                    yy6 yy6VarC = xy6Var.c();
                    me1 me1Var = this.f2589o;
                    yy6 yy6Var = yy6.f2656o;
                    if (yy6VarC == yy6Var) {
                        op6Var.d(zo6.t, new m3(str2, new n5((Object) xy6Var, (Object) me1Var, (Object) xy6Var, (byte) 6)));
                    } else if (xy6Var.g.e().c(yy6Var)) {
                        op6Var.d(zo6.u, new m3(str3, new x8(xy6Var, me1Var, (byte) 13)));
                    }
                }
                break;
            case 1:
                r81 r81Var = (r81) obj2;
                h44 h44Var = (h44) obj;
                h44Var.getClass();
                List list = ((ka1) obj6).b;
                iz0 iz0Var = new iz0((byte) 23);
                h44Var.b(list.size(), new y2(iz0Var, list, (byte) 5), new ha1(list, (byte) 0), new yy0(2039820996, true, new ia1(list, (h71) obj5, this.n, this.f2589o, (w44) obj4, (Function1) obj3, r81Var)));
                break;
            case 2:
                v23 v23Var = (v23) obj6;
                u23 u23Var = (u23) obj2;
                h44 h44Var2 = (h44) obj;
                h44Var2.getClass();
                List list2 = v23Var.a;
                qo2 qo2Var = new qo2(b2);
                h44Var2.b(list2.size(), new y2(qo2Var, list2, (byte) 9), new ha1(list2, (byte) 1), new yy0(2039820996, true, new s23(list2, (ns1) obj5, v23Var, this.n, this.f2589o, (w44) obj4, (Function1) obj3, u23Var)));
                if (v23Var.b) {
                    h44.a(h44Var2, null, vn4.l, 3);
                }
                break;
            default:
                e43 e43Var = (e43) obj2;
                h44 h44Var3 = (h44) obj;
                h44Var3.getClass();
                List list3 = (List) ((px4) obj6).getValue();
                qo2 qo2Var2 = new qo2((byte) 4);
                h44Var3.b(list3.size(), new y2(qo2Var2, list3, (byte) 10), new ha1(list3, (byte) 2), new yy0(2039820996, true, new ia1(list3, this.n, (k33) obj5, this.f2589o, (w44) obj4, (Function1) obj3, e43Var)));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ y90(Object obj, Object obj2, boolean z, me1 me1Var, w44 w44Var, Function1 function1, Object obj3, byte b) {
        this.m = b;
        this.p = obj;
        this.q = obj2;
        this.n = z;
        this.f2589o = me1Var;
        this.r = w44Var;
        this.s = function1;
        this.t = obj3;
    }

    public /* synthetic */ y90(boolean z, xy6 xy6Var, String str, String str2, String str3, Function0 function0, me1 me1Var) {
        this.m = (byte) 0;
        this.n = z;
        this.p = xy6Var;
        this.q = str;
        this.r = str2;
        this.s = str3;
        this.t = function0;
        this.f2589o = me1Var;
    }
}
