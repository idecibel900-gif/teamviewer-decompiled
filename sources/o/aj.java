package o;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class aj extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f328o;
    public Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f328o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
        this.s = obj5;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.s;
        Object obj3 = this.r;
        Object obj4 = this.q;
        switch (b) {
            case 0:
                aj ajVar = new aj((xj) this.p, (Function1) obj4, (cj) obj3, (t54) obj2, hc1Var, (byte) 0);
                ajVar.f328o = obj;
                return ajVar;
            case 1:
                return new aj((LifecycleOwner) this.f328o, (px4) this.p, (g80) obj4, (k76) obj3, (Context) obj2, hc1Var, (byte) 1);
            case 2:
                return new aj((j64) this.f328o, (px4) this.p, (js7) obj4, (pr7) obj3, (bf3) obj2, hc1Var, (byte) 2);
            case 3:
                return new aj((hb0) this.f328o, (zr7) this.p, (j64) obj4, (ws7) obj3, (v65) obj2, hc1Var, (byte) 3);
            case 4:
                return new aj((is1) this.f328o, (sq2) this.p, (sq2) obj4, (sq2) obj3, (px4) obj2, hc1Var, (byte) 4);
            case 5:
                aj ajVar2 = new aj((x84) this.p, (m84) obj4, (de1) obj3, (go2) obj2, hc1Var, (byte) 5);
                ajVar2.f328o = obj;
                return ajVar2;
            case 6:
                return new aj((iw7) this.f328o, (Function0) this.p, (Function1) obj4, (Function1) obj3, (Function1) obj2, hc1Var, (byte) 6);
            case 7:
                return new aj((u23) this.f328o, (k33) this.p, (List) obj4, (w44) obj3, (px4) obj2, hc1Var, (byte) 7);
            case 8:
                return new aj((go2) this.f328o, (Context) this.p, (Resources) obj4, (px4) obj3, (px4) obj2, hc1Var, (byte) 8);
            case ep1.b /* 9 */:
                return new aj((xy6) this.f328o, (Function0) this.p, (hw2) obj4, (String) obj3, (String) obj2, hc1Var, (byte) 9);
            case ep1.c /* 10 */:
                return new aj((tx5) this.f328o, (Function0) this.p, (px4) obj4, (px4) obj3, (yf5) obj2, hc1Var, (byte) 10);
            case 11:
                return new aj((ke3) this.f328o, (i46) this.p, (w07) obj4, (z06) obj3, (xd3) obj2, hc1Var, (byte) 11);
            case ep1.d /* 12 */:
                aj ajVar3 = new aj((p56) obj4, (o56) obj3, (ml) obj2, hc1Var, (byte) 12);
                ajVar3.f328o = obj;
                return ajVar3;
            case 13:
                return new aj((xs6) this.f328o, (sq2) this.p, (sq2) obj4, (sq2) obj3, (px4) obj2, hc1Var, (byte) 13);
            case 14:
                aj ajVar4 = new aj((nn5) this.p, (cr7) obj4, (ts6) obj3, (wr5) obj2, hc1Var, (byte) 14);
                ajVar4.f328o = obj;
                return ajVar4;
            default:
                aj ajVar5 = new aj((u08) obj4, (yk6) obj3, (k76) obj2, hc1Var, (byte) 15);
                ajVar5.f328o = obj;
                return ajVar5;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 1:
                return ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                return ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                return ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                return ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 5:
                return ((aj) create((ft5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 6:
                return ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 7:
                return ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 8:
                return ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.b /* 9 */:
                return ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.c /* 10 */:
                ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 11:
                return ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.d /* 12 */:
                return ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 13:
                return ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 14:
                return ((aj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((aj) create((wk6) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02af A[Catch: all -> 0x01cf, TryCatch #7 {all -> 0x01cf, blocks: (B:59:0x01ca, B:94:0x029c, B:95:0x02a2, B:97:0x02a7, B:98:0x02a8, B:100:0x02af, B:102:0x02bd, B:104:0x02c3, B:107:0x02c9, B:109:0x02cd, B:110:0x02d1, B:111:0x02d4, B:112:0x02d7, B:131:0x0326, B:132:0x0327, B:96:0x02a3), top: B:341:0x01bc, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x02bd A[Catch: all -> 0x01cf, TryCatch #7 {all -> 0x01cf, blocks: (B:59:0x01ca, B:94:0x029c, B:95:0x02a2, B:97:0x02a7, B:98:0x02a8, B:100:0x02af, B:102:0x02bd, B:104:0x02c3, B:107:0x02c9, B:109:0x02cd, B:110:0x02d1, B:111:0x02d4, B:112:0x02d7, B:131:0x0326, B:132:0x0327, B:96:0x02a3), top: B:341:0x01bc, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02c3 A[Catch: all -> 0x01cf, TryCatch #7 {all -> 0x01cf, blocks: (B:59:0x01ca, B:94:0x029c, B:95:0x02a2, B:97:0x02a7, B:98:0x02a8, B:100:0x02af, B:102:0x02bd, B:104:0x02c3, B:107:0x02c9, B:109:0x02cd, B:110:0x02d1, B:111:0x02d4, B:112:0x02d7, B:131:0x0326, B:132:0x0327, B:96:0x02a3), top: B:341:0x01bc, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:12:0x006b  */
    /* JADX WARN: Code duplicated, block: B:14:0x007f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0082  */
    /* JADX WARN: Code duplicated, block: B:18:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:332:0x02a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, o.ar] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0082 -> B:16:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj(Object obj, Object obj2, Object obj3, Object obj4, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
        this.s = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj(Object obj, Object obj2, Object obj3, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.q = obj;
        this.r = obj2;
        this.s = obj3;
    }
}
