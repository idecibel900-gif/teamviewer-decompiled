package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ko2 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1285o;
    public Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko2(px4 px4Var, boolean z, dw6 dw6Var, Function1 function1, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 25;
        this.f1285o = px4Var;
        this.n = z;
        this.p = dw6Var;
        this.q = function1;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                ko2 ko2Var = new ko2((po2) this.p, (ho2) obj2, hc1Var, (byte) 0);
                ko2Var.f1285o = obj;
                return ko2Var;
            case 1:
                return new ko2(this.f1285o, this.p, obj2, hc1Var, (byte) 1);
            case 2:
                return new ko2((kf0) obj2, hc1Var, (byte) 2);
            case 3:
                return new ko2(this.f1285o, this.p, obj2, hc1Var, (byte) 3);
            case 4:
                return new ko2(this.f1285o, this.p, obj2, hc1Var, (byte) 4);
            case 5:
                return new ko2(this.n, (k33) this.f1285o, (px4) this.p, (px4) obj2, hc1Var, (byte) 5);
            case 6:
                return new ko2(this.f1285o, this.p, obj2, hc1Var, (byte) 6);
            case 7:
                return new ko2(this.n, (px4) this.f1285o, (px4) this.p, (px4) obj2, hc1Var, (byte) 7);
            case 8:
                return new ko2(this.f1285o, this.p, obj2, hc1Var, (byte) 8);
            case ep1.b /* 9 */:
                ko2 ko2Var2 = new ko2((hw2) this.p, (gj0) obj2, hc1Var, (byte) 9);
                ko2Var2.f1285o = obj;
                return ko2Var2;
            case ep1.c /* 10 */:
                ko2 ko2Var3 = new ko2((q61) this.p, (b35) obj2, hc1Var, (byte) 10);
                ko2Var3.f1285o = obj;
                return ko2Var3;
            case 11:
                return new ko2(this.f1285o, this.p, obj2, hc1Var, (byte) 11);
            case ep1.d /* 12 */:
                return new ko2(this.f1285o, this.p, obj2, hc1Var, (byte) 12);
            case 13:
                ko2 ko2Var4 = new ko2((i46) this.p, (ke3) obj2, hc1Var, (byte) 13);
                ko2Var4.f1285o = obj;
                return ko2Var4;
            case 14:
                ko2 ko2Var5 = new ko2((o56) this.p, (ml) obj2, hc1Var, (byte) 14);
                ko2Var5.f1285o = obj;
                return ko2Var5;
            case 15:
                ko2 ko2Var6 = new ko2((qx0) this.p, (hw2) obj2, hc1Var, (byte) 15);
                ko2Var6.f1285o = obj;
                return ko2Var6;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new ko2(this.n, (iq2) this.f1285o, (sq2) this.p, (q57) obj2, hc1Var, (byte) 16);
            case 17:
                ko2 ko2Var7 = new ko2((bj) this.p, (yk6) obj2, hc1Var, (byte) 17);
                ko2Var7.f1285o = obj;
                return ko2Var7;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ko2 ko2Var8 = new ko2((yk6) this.p, (hw2) obj2, hc1Var, (byte) 18);
                ko2Var8.f1285o = obj;
                return ko2Var8;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ko2 ko2Var9 = new ko2((i97) this.p, (km) obj2, hc1Var, (byte) 19);
                ko2Var9.f1285o = obj;
                return ko2Var9;
            case 20:
                return new ko2(this.f1285o, this.p, obj2, hc1Var, (byte) 20);
            case 21:
                return new ko2(this.n, (SupportSession) this.f1285o, (px4) this.p, (px4) obj2, hc1Var, (byte) 21);
            case 22:
                return new ko2(this.f1285o, this.p, obj2, hc1Var, (byte) 22);
            case 23:
                return new ko2((px4) this.p, (px4) obj2, hc1Var, (byte) 23);
            case 24:
                return new ko2(this.f1285o, this.p, obj2, hc1Var, (byte) 24);
            case 25:
                return new ko2((px4) this.f1285o, this.n, (dw6) this.p, (Function1) obj2, hc1Var);
            case 26:
                return new ko2(this.f1285o, this.p, obj2, hc1Var, (byte) 26);
            case 27:
                return new ko2(this.f1285o, this.p, obj2, hc1Var, (byte) 27);
            case 28:
                return new ko2(this.f1285o, this.p, obj2, hc1Var, (byte) 28);
            default:
                return new ko2((g2) obj2, hc1Var, (byte) 29);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 4:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 5:
                ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 6:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 7:
                ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 8:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.b /* 9 */:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.c /* 10 */:
                return ((ko2) create((gt5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 11:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.d /* 12 */:
                ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 13:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 14:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 15:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 17:
                return ((ko2) create((wk6) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return ((ko2) create((dk6) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 20:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 21:
                ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 22:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 23:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 24:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 25:
                ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 26:
                ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 27:
                ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 28:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((ko2) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x08e2 */
    /* JADX WARN: Code duplicated, block: B:433:0x0904  */
    /* JADX WARN: Code duplicated, block: B:436:0x090e A[Catch: all -> 0x08e2, TryCatch #0 {, blocks: (B:424:0x08dc, B:434:0x0906, B:436:0x090e, B:437:0x091b, B:444:0x092b, B:431:0x08f8, B:446:0x092e, B:448:0x0933, B:449:0x0934, B:430:0x08f3, B:438:0x091c, B:440:0x0922), top: B:484:0x08d0, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:440:0x0922 A[Catch: all -> 0x0932, TRY_LEAVE, TryCatch #5 {all -> 0x0932, blocks: (B:438:0x091c, B:440:0x0922), top: B:489:0x091c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:446:0x092e A[Catch: all -> 0x08e2, TryCatch #0 {, blocks: (B:424:0x08dc, B:434:0x0906, B:436:0x090e, B:437:0x091b, B:444:0x092b, B:431:0x08f8, B:446:0x092e, B:448:0x0933, B:449:0x0934, B:430:0x08f3, B:438:0x091c, B:440:0x0922), top: B:484:0x08d0, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:489:0x091c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:440:0x0922, B:443:0x092a], limit reached: 544 */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, o.hc1] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Throwable, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r1v145 */
    /* JADX WARN: Type inference failed for: r1v146, types: [o.ky4] */
    /* JADX WARN: Type inference failed for: r1v149 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10, types: [o.wm0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [o.wm0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [o.kf0] */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:432:0x0902 -> B:434:0x0906). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at java.base/java.util.HashMap.putVal(HashMap.java:627)
        	at java.base/java.util.HashMap.put(HashMap.java:608)
        	at java.base/java.util.HashSet.add(HashSet.java:220)
        	at jadx.core.dex.visitors.regions.maker.SynchronizedRegionMaker.traverseMonitorExits(SynchronizedRegionMaker.java:97)
        	at jadx.core.dex.visitors.regions.maker.SynchronizedRegionMaker.traverseMonitorExits(SynchronizedRegionMaker.java:109)
        */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 2550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ko2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko2(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
        this.q = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko2(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.q = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko2(Object obj, Object obj2, Object obj3, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1285o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko2(boolean z, Object obj, Object obj2, Object obj3, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = z;
        this.f1285o = obj;
        this.p = obj2;
        this.q = obj3;
    }
}
