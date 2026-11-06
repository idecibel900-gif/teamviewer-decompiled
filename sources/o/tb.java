package o;

import android.content.Context;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tb extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f2096o;
    public Object p;
    public /* synthetic */ Object q;
    public Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb(Object obj, Object obj2, Object obj3, Object obj4, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2096o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [int[], java.io.Serializable] */
    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new tb((vb) this.q, hc1Var);
            case 1:
                return new tb((ka1) this.f2096o, (w44) this.p, (px4) this.q, (px4) this.r, hc1Var, (byte) 1);
            case 2:
                tb tbVar = new tb((e52) this.r, hc1Var, (byte) 2);
                tbVar.q = obj;
                return tbVar;
            case 3:
                return new tb((d97) this.f2096o, (go2) this.p, (l97) this.q, this.r, hc1Var, (byte) 3);
            case 4:
                tb tbVar2 = new tb((px4) this.q, (th3) this.r, hc1Var, (byte) 4);
                tbVar2.p = obj;
                return tbVar2;
            case 5:
                return new tb((om5) this.q, (hw2) this.r, hc1Var, (byte) 5);
            case 6:
                return new tb((tx5) this.f2096o, (List) this.p, (List) this.q, (List) this.r, hc1Var, (byte) 6);
            case 7:
                return new tb((my4) this.q, (hw2) this.r, hc1Var, (byte) 7);
            case 8:
                tb tbVar3 = new tb((Function1) this.p, (AtomicReference) this.q, (hw2) this.r, hc1Var, (byte) 8);
                tbVar3.f2096o = obj;
                return tbVar3;
            case ep1.b /* 9 */:
                tb tbVar4 = new tb((u08) this.r, hc1Var, (byte) 9);
                tbVar4.q = obj;
                return tbVar4;
            case ep1.c /* 10 */:
                tb tbVar5 = new tb((e38) this.p, (int[]) this.q, (String[]) this.r, hc1Var, (byte) 10);
                tbVar5.f2096o = obj;
                return tbVar5;
            default:
                return new tb((nc4) this.f2096o, (xm8) this.p, (jm8) this.q, (Context) this.r, hc1Var, (byte) 11);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((tb) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                return ((tb) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                return ((tb) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                return ((tb) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                ((tb) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 5:
                return ((tb) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 6:
                return ((tb) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 7:
                return ((tb) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 8:
                return ((tb) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.b /* 9 */:
                return ((tb) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.c /* 10 */:
                ((tb) create((ho2) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            default:
                return ((tb) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:274:0x05ad A[PHI: r5 r8
      0x05ad: PHI (r5v18 o.k76) = (r5v10 o.k76), (r5v25 o.k76) binds: [B:273:0x05aa, B:297:0x062d] A[DONT_GENERATE, DONT_INLINE]
      0x05ad: PHI (r8v19 o.me1) = (r8v15 o.me1), (r8v21 o.me1) binds: [B:273:0x05aa, B:297:0x062d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x05dc A[PHI: r13
      0x05dc: PHI (r13v18 o.me1) = (r13v12 o.me1), (r13v12 o.me1), (r13v12 o.me1), (r13v16 o.me1), (r13v21 o.me1) binds: [B:306:0x0649, B:308:0x0655, B:302:0x0642, B:313:0x0667, B:279:0x05db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:282:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:284:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:287:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:292:0x060b  */
    /* JADX WARN: Code duplicated, block: B:295:0x061c  */
    /* JADX WARN: Code duplicated, block: B:305:0x0647 A[Catch: CancellationException -> 0x0645, TryCatch #13 {CancellationException -> 0x0645, blocks: (B:299:0x0630, B:301:0x0636, B:305:0x0647, B:307:0x064b), top: B:443:0x0630 }] */
    /* JADX WARN: Code duplicated, block: B:307:0x064b A[Catch: CancellationException -> 0x0645, TRY_LEAVE, TryCatch #13 {CancellationException -> 0x0645, blocks: (B:299:0x0630, B:301:0x0636, B:305:0x0647, B:307:0x064b), top: B:443:0x0630 }] */
    /* JADX WARN: Code duplicated, block: B:330:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:403:0x07fa A[PHI: r1 r2
      0x07fa: PHI (r1v3 o.vb) = (r1v2 o.vb), (r1v2 o.vb), (r1v8 o.vb) binds: [B:399:0x07eb, B:401:0x07f7, B:344:0x06fc] A[DONT_GENERATE, DONT_INLINE]
      0x07fa: PHI (r2v7 com.teamviewer.apidefinitions.account.models.Account) = 
      (r2v6 com.teamviewer.apidefinitions.account.models.Account)
      (r2v6 com.teamviewer.apidefinitions.account.models.Account)
      (r2v18 com.teamviewer.apidefinitions.account.models.Account)
     binds: [B:399:0x07eb, B:401:0x07f7, B:344:0x06fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:405:0x080a  */
    /* JADX WARN: Code duplicated, block: B:406:0x080e  */
    /* JADX WARN: Code duplicated, block: B:409:0x081d  */
    /* JADX WARN: Code duplicated, block: B:412:0x0826  */
    /* JADX WARN: Code duplicated, block: B:492:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66, types: [o.hw2] */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r2v51, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0230 -> B:97:0x01fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:232:0x04bd -> B:236:0x04dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:234:0x04d9 -> B:236:0x04dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:302:0x0642 -> B:280:0x05dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:306:0x0649 -> B:280:0x05dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:308:0x0655 -> B:280:0x05dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:311:0x0663 -> B:279:0x05db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:313:0x0667 -> B:280:0x05dc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb(Object obj, Serializable serializable, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
        this.q = serializable;
        this.r = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.q = obj;
        this.r = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.r = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(vb vbVar, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 0;
        this.q = vbVar;
    }
}
