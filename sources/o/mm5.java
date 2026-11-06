package o;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: loaded from: classes.dex */
public final class mm5 extends og7 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1484o;
    public final /* synthetic */ long p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm5(long j, CharSequence charSequence, hc1 hc1Var, om5 om5Var) {
        super(2, hc1Var);
        this.q = om5Var;
        this.r = charSequence;
        this.p = j;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.r;
        Object obj3 = this.q;
        switch (b) {
            case 0:
                long j = this.p;
                mm5 mm5Var = new mm5(j, (CharSequence) obj2, hc1Var, (om5) obj3);
                mm5Var.f1484o = obj;
                return mm5Var;
            default:
                mm5 mm5Var2 = new mm5((yk6) obj3, this.p, (h76) obj2, hc1Var);
                mm5Var2.f1484o = obj;
                return mm5Var2;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((mm5) create((TextClassifier) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((mm5) create((wk6) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.r;
        ne1 ne1Var = ne1.m;
        Object obj3 = this.q;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    TextClassifier textClassifier = (TextClassifier) this.f1484o;
                    this.n = true;
                    return ((om5) obj3).a((CharSequence) obj2, this.p, textClassifier, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                yk6 yk6Var = (yk6) obj3;
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                wk6 wk6Var = (wk6) this.f1484o;
                float fH = yk6Var.h(this.p);
                f9 f9Var = new f9(obj2, (Object) yk6Var, (Object) wk6Var, (byte) 22);
                this.n = true;
                return i67.c(0.0f, fH, 0.0f, db8.A0(0.0f, 0.0f, null, 7), f9Var, this) == ne1Var ? ne1Var : f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm5(yk6 yk6Var, long j, h76 h76Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.q = yk6Var;
        this.p = j;
        this.r = h76Var;
    }
}
