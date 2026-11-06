package o;

import androidx.lifecycle.LifecycleOwner;
import coil3.compose.AsyncImagePainter;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class tx extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f2150o;
    public Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tx(Object obj, Object obj2, Object obj3, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2150o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                return new tx((AsyncImagePainter) this.p, (qx) obj2, hc1Var, (byte) 0);
            case 1:
                return new tx((sx4) this.p, (k08) obj2, hc1Var, (byte) 1);
            case 2:
                tx txVar = new tx((Function0) this.p, (km) obj2, hc1Var, (byte) 2);
                txVar.f2150o = obj;
                return txVar;
            case 3:
                return new tx((y31) obj2, hc1Var, (byte) 3);
            case 4:
                tx txVar2 = new tx((vh1) obj2, hc1Var, (byte) 4);
                txVar2.p = obj;
                return txVar2;
            case 5:
                return new tx((ru1) this.f2150o, (ns1) this.p, (du1) obj2, hc1Var, (byte) 5);
            case 6:
                return new tx((de1) this.f2150o, (go2) this.p, (ft5) obj2, hc1Var, (byte) 6);
            case 7:
                return new tx((su6) this.p, (SupportSession) obj2, hc1Var, (byte) 7);
            case 8:
                tx txVar3 = new tx((de1) this.p, (go2) obj2, hc1Var, (byte) 8);
                txVar3.f2150o = obj;
                return txVar3;
            case ep1.b /* 9 */:
                return new tx((LifecycleOwner) this.f2150o, (jf3) this.p, (ce7) obj2, hc1Var, (byte) 9);
            case ep1.c /* 10 */:
                tx txVar4 = new tx((bp3) this.p, (hw2) obj2, hc1Var, (byte) 10);
                txVar4.f2150o = obj;
                return txVar4;
            case 11:
                return new tx((up7) this.p, (op7) obj2, hc1Var, (byte) 11);
            default:
                return new tx((nn8) this.f2150o, (nc4) this.p, (jm8) obj2, hc1Var, (byte) 12);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((tx) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                return ((tx) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                return ((tx) create((go2) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                return ((tx) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                return ((tx) create((ho2) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 5:
                return ((tx) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 6:
                return ((tx) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 7:
                return ((tx) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 8:
                return ((tx) create((ft5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.b /* 9 */:
                return ((tx) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.c /* 10 */:
                return ((tx) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 11:
                return ((tx) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((tx) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0241  */
    /* JADX WARN: Code duplicated, block: B:190:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:193:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:196:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:295:0x059a  */
    /* JADX WARN: Code duplicated, block: B:297:0x05af  */
    /* JADX WARN: Code duplicated, block: B:299:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:301:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:304:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e4  */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0237, code lost:
    
        if (r2.c(r7, r28) == r8) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0465, code lost:
    
        if (o.ds1.B(r2, r28) == r8) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0576, code lost:
    
        if (r1 == r8) goto L291;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o.ba2] */
    /* JADX WARN: Type inference failed for: r1v24, types: [o.ky4] */
    /* JADX WARN: Type inference failed for: r1v28, types: [o.ky4] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tx(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
        this.q = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tx(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.q = obj;
    }
}
