package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wg1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f2409o;
    public /* synthetic */ Object p;
    public Object q;
    public Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg1(k76 k76Var, v25 v25Var, k76 k76Var2, z25 z25Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 2;
        this.r = k76Var;
        this.p = v25Var;
        this.s = k76Var2;
        this.t = z25Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.t;
        Object obj3 = this.s;
        switch (b) {
            case 0:
                wg1 wg1Var = new wg1((List) obj3, (ArrayList) obj2, hc1Var, (byte) 0);
                wg1Var.p = obj;
                return wg1Var;
            case 1:
                wg1 wg1Var2 = new wg1((jy4) obj3, (Function1) obj2, hc1Var, (byte) 1);
                wg1Var2.p = obj;
                return wg1Var2;
            default:
                wg1 wg1Var3 = new wg1((k76) this.r, (v25) this.p, (k76) obj3, (z25) obj2, hc1Var);
                wg1Var3.n = obj;
                return wg1Var3;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((wg1) create(obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                return ((wg1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((wg1) create((c35) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x020a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0217  */
    /* JADX WARN: Code duplicated, block: B:108:0x0242  */
    /* JADX WARN: Code duplicated, block: B:109:0x0244  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01f3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o.ky4] */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.hc1] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg1(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.s = obj;
        this.t = obj2;
    }
}
