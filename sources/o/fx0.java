package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fx0 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f836o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ fs4 q;
    public final /* synthetic */ xy6 r;

    public /* synthetic */ fx0(String str, Function1 function1, Function0 function0, fs4 fs4Var, xy6 xy6Var, int i) {
        this.n = str;
        this.f836o = function1;
        this.p = function0;
        this.q = fs4Var;
        this.r = xy6Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                vn4.D(yo1.Y(24577), this.n, this.p, this.f836o, (ux2) obj, this.q, this.r);
                break;
            default:
                ((Integer) obj2).getClass();
                nv1.e(yo1.Y(1), this.n, this.p, this.f836o, (ux2) obj, this.q, this.r);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ fx0(String str, Function1 function1, Function0 function0, xy6 xy6Var, fs4 fs4Var, int i) {
        this.n = str;
        this.f836o = function1;
        this.p = function0;
        this.r = xy6Var;
        this.q = fs4Var;
    }
}
