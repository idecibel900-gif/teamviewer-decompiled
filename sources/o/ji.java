package o;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ji extends rc6 implements hw2 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f1168o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.n = b;
        this.q = obj;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.n;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                ji jiVar = new ji((li) obj2, hc1Var, (byte) 0);
                jiVar.p = obj;
                return jiVar;
            case 1:
                ji jiVar2 = new ji((Function1) obj2, hc1Var, (byte) 1);
                jiVar2.p = obj;
                return jiVar2;
            default:
                ji jiVar3 = new ji((View) obj2, hc1Var, (byte) 2);
                jiVar3.p = obj;
                return jiVar3;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.n;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((ji) create((ug7) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                return ((ji) create((ug7) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((ji) create((aq6) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0140 A[LOOP:1: B:60:0x012c->B:64:0x0140, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ff -> B:53:0x0102). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ji.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
