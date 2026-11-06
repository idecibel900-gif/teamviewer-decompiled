package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class an extends yz3 implements hw2 {
    public final /* synthetic */ byte n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f340o;
    public final /* synthetic */ fs4 p;
    public final /* synthetic */ yy0 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(Object obj, fs4 fs4Var, Function1 function1, he heVar, String str, Function1 function2, yy0 yy0Var, int i) {
        super(2);
        this.s = obj;
        this.p = fs4Var;
        this.f340o = function1;
        this.u = heVar;
        this.v = str;
        this.t = function2;
        this.q = yy0Var;
        this.r = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.n;
        f88 f88Var = f88.a;
        int i = this.r;
        Object obj3 = this.v;
        Object obj4 = this.u;
        Object obj5 = this.t;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iY = yo1.Y(i | 1);
                Object obj6 = this.s;
                fs4 fs4Var = this.p;
                Function1 function1 = this.f340o;
                im3.a(obj6, fs4Var, function1, (he) obj4, (String) obj3, (Function1) obj5, this.q, (ux2) obj, iY);
                break;
            default:
                ((Number) obj2).intValue();
                int iY2 = yo1.Y(i | 1);
                Function1 function2 = this.f340o;
                fs4 fs4Var2 = this.p;
                vn4.E((u18) this.s, function2, fs4Var2, (bc2) obj5, (hf2) obj4, (hw2) obj3, this.q, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(u18 u18Var, Function1 function1, fs4 fs4Var, bc2 bc2Var, hf2 hf2Var, hw2 hw2Var, yy0 yy0Var, int i) {
        super(2);
        this.s = u18Var;
        this.f340o = function1;
        this.p = fs4Var;
        this.t = bc2Var;
        this.u = hf2Var;
        this.v = hw2Var;
        this.q = yy0Var;
        this.r = i;
    }
}
