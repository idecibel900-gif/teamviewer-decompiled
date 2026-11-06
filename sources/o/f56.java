package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f56 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f771o;
    public final /* synthetic */ fs4 p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ Function0 s;

    public /* synthetic */ f56(List list, boolean z, fs4 fs4Var, Function0 function0, Function1 function1, Function1 function2, int i) {
        this.n = list;
        this.f771o = z;
        this.p = fs4Var;
        this.s = function0;
        this.q = function1;
        this.r = function2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                wo1.n(yo1.Y(1), this.n, this.s, this.q, this.r, (ux2) obj, this.p, this.f771o);
                break;
            default:
                ((Integer) obj2).getClass();
                h67.b(yo1.Y(385), this.n, this.s, this.q, this.r, (ux2) obj, this.p, this.f771o);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ f56(List list, boolean z, fs4 fs4Var, Function1 function1, Function1 function2, Function0 function0, int i) {
        this.n = list;
        this.f771o = z;
        this.p = fs4Var;
        this.q = function1;
        this.r = function2;
        this.s = function0;
    }
}
