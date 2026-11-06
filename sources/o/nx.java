package o;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nx implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1609o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ nx(List list, Set set, Function1 function1, Function0 function0, fs4 fs4Var, String str, int i) {
        this.r = list;
        this.s = set;
        this.n = function1;
        this.t = function0;
        this.f1609o = fs4Var;
        this.p = str;
        this.q = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        Object obj3 = this.p;
        Object obj4 = this.t;
        f88 f88Var = f88.a;
        int i = this.q;
        Object obj5 = this.s;
        Object obj6 = this.n;
        Object obj7 = this.f1609o;
        Object obj8 = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                e8.a((wx) obj8, (String) obj3, (fs4) obj7, (Function1) obj6, (he) obj5, (sb1) obj4, (ux2) obj, yo1.Y(1), yo1.Y(i));
                break;
            case 1:
                ((Integer) obj2).getClass();
                jx0.c((List) obj8, (Set) obj5, (Function1) obj6, (Function0) obj4, (fs4) obj7, (String) obj3, (ux2) obj, yo1.Y(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i) | 1;
                ((yy0) obj8).e(this.p, (Integer) obj7, (j74) obj6, (Boolean) obj5, this.t, (ux2) obj, iY);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ne5.a((xu7) obj8, (fs4) obj7, (bc2) obj3, (hf2) obj6, (rl2) obj5, (yy0) obj4, (ux2) obj, yo1.Y(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                qs1.p((j74) obj8, (f74) obj7, (qk1) obj6, (String) obj3, (jw2) obj5, (Function0) obj4, (ux2) obj, yo1.Y(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                l47.b((wx) obj8, (fs4) obj7, (Function1) obj6, (he) obj5, (sb1) obj4, (yy0) obj3, (ux2) obj, yo1.Y(49), yo1.Y(i));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ nx(wx wxVar, String str, fs4 fs4Var, Function1 function1, he heVar, sb1 sb1Var, int i, int i2) {
        this.r = wxVar;
        this.p = str;
        this.f1609o = fs4Var;
        this.n = function1;
        this.s = heVar;
        this.t = sb1Var;
        this.q = i2;
    }

    public /* synthetic */ nx(wx wxVar, fs4 fs4Var, Function1 function1, he heVar, sb1 sb1Var, yy0 yy0Var, int i, int i2) {
        this.r = wxVar;
        this.f1609o = fs4Var;
        this.n = function1;
        this.s = heVar;
        this.t = sb1Var;
        this.p = yy0Var;
        this.q = i2;
    }

    public /* synthetic */ nx(yy0 yy0Var, Object obj, Integer num, j74 j74Var, Boolean bool, Object obj2, int i) {
        this.r = yy0Var;
        this.p = obj;
        this.f1609o = num;
        this.n = j74Var;
        this.s = bool;
        this.t = obj2;
        this.q = i;
    }

    public /* synthetic */ nx(j74 j74Var, f74 f74Var, qk1 qk1Var, String str, jw2 jw2Var, Function0 function0, int i) {
        this.r = j74Var;
        this.f1609o = f74Var;
        this.n = qk1Var;
        this.p = str;
        this.s = jw2Var;
        this.t = function0;
        this.q = i;
    }

    public /* synthetic */ nx(xu7 xu7Var, fs4 fs4Var, bc2 bc2Var, hf2 hf2Var, rl2 rl2Var, yy0 yy0Var, int i) {
        this.r = xu7Var;
        this.f1609o = fs4Var;
        this.p = bc2Var;
        this.n = hf2Var;
        this.s = rl2Var;
        this.t = yy0Var;
        this.q = i;
    }
}
