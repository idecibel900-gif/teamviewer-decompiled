package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class v45 extends rc6 implements hw2 {
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2277o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Function0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v45(Function0 function0, hc1 hc1Var) {
        super(2, hc1Var);
        this.q = function0;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        v45 v45Var = new v45(this.q, hc1Var);
        v45Var.p = obj;
        return v45Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((v45) create((aq6) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0034 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0034
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r4.f2277o
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            java.lang.Object r0 = r4.n
            java.lang.Object r3 = r4.p
            o.aq6 r3 = (o.aq6) r3
            o.ct1.a0(r5)
            goto L35
        L12:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r4)
            return r1
        L18:
            o.ct1.a0(r5)
            java.lang.Object r5 = r4.p
            o.aq6 r5 = (o.aq6) r5
            r3 = r5
        L20:
            kotlin.jvm.functions.Function0 r5 = r4.q
            java.lang.Object r5 = r5.a()
            if (r5 == 0) goto L34
            r4.p = r3
            r4.n = r5
            r4.f2277o = r2
            r3.b(r5, r4)
            o.ne1 r4 = o.ne1.m
            return r4
        L34:
            r0 = r1
        L35:
            if (r0 != 0) goto L20
            o.f88 r4 = o.f88.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.v45.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
