package o;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xy6 {
    public final Set a;
    public final Function0 b;
    public final Function0 c;
    public final Function1 d;
    public final boolean e;
    public final eo1 f;
    public final nf g;
    public rl2 h;
    public rl2 i;

    public xy6(Set set, Function0 function0, Function0 function1, yy6 yy6Var, Function1 function2, boolean z) {
        this.a = set;
        this.b = function0;
        this.c = function1;
        this.d = function2;
        this.e = z;
        if (!set.contains(yy6.n)) {
            hk0.g("Expanded must be one of the enabled values.");
            throw null;
        }
        if (!set.contains(yy6Var)) {
            hk0.g("The initial value must be one of the enabled values.");
            throw null;
        }
        this.f = d57.b(new wr4(this, (byte) 1));
        float f = uy6.a;
        this.g = new nf(yy6Var, function2);
        this.h = db8.z0();
        this.i = db8.z0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ym2 ym2Var, float f, jc1 jc1Var) {
        vy6 vy6Var;
        h76 h76Var;
        if (jc1Var instanceof vy6) {
            vy6Var = (vy6) jc1Var;
            int i = vy6Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                vy6Var.p = i - Integer.MIN_VALUE;
            } else {
                vy6Var = new vy6(this, jc1Var);
            }
        } else {
            vy6Var = new vy6(this, jc1Var);
        }
        Object obj = vy6Var.n;
        int i2 = vy6Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            h76 h76Var2 = new h76();
            wy6 wy6Var = new wy6(h76Var2, ym2Var, this, f, null);
            vy6Var.m = h76Var2;
            vy6Var.p = 1;
            Object objB = nf.b(this.g, wy6Var, vy6Var);
            ne1 ne1Var = ne1.m;
            if (objB == ne1Var) {
                return ne1Var;
            }
            h76Var = h76Var2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h76Var = vy6Var.m;
            ct1.a0(obj);
        }
        return new Float(h76Var.m);
    }

    public final Object b(yy6 yy6Var, rl2 rl2Var, hc1 hc1Var) {
        nf nfVar = this.g;
        Object objA = nfVar.a(yy6Var, ay4.m, new xe(nfVar, rl2Var, null), hc1Var);
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        if (objA != ne1Var) {
            objA = f88Var;
        }
        return objA == ne1Var ? objA : f88Var;
    }

    public final yy6 c() {
        return (yy6) ((bg5) this.g.e).getValue();
    }

    public final Object d(hc1 hc1Var) {
        Object objB;
        Set set = this.a;
        yy6 yy6Var = yy6.m;
        if (set.contains(yy6Var)) {
            return (((Boolean) this.d.invoke(yy6Var)).booleanValue() && (objB = b(yy6Var, this.i, hc1Var)) == ne1.m) ? objB : f88.a;
        }
        hk0.l("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        return null;
    }

    public final boolean e() {
        return ((bg5) this.g.d).getValue() != yy6.m;
    }

    public final Object f(og7 og7Var) {
        Object objB;
        Set set = this.a;
        yy6 yy6Var = yy6.f2656o;
        if (set.contains(yy6Var)) {
            return (((Boolean) this.d.invoke(yy6Var)).booleanValue() && (objB = b(yy6Var, this.i, og7Var)) == ne1.m) ? objB : f88.a;
        }
        hk0.l("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        return null;
    }

    public final Object g(og7 og7Var) {
        Object objB;
        uj1 uj1VarE = this.g.e();
        yy6 yy6Var = yy6.f2656o;
        if (!uj1VarE.c(yy6Var)) {
            yy6Var = yy6.n;
        }
        return (((Boolean) this.d.invoke(yy6Var)).booleanValue() && (objB = b(yy6Var, this.h, og7Var)) == ne1.m) ? objB : f88.a;
    }
}
