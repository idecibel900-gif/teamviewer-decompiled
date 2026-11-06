package o;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.oneapinetworklib.swig.OneAPIRequestHandlerAndroid;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bj extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f429o;
    public Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(xy6 xy6Var, Function0 function0, Function1 function1, String str, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 2;
        this.f429o = xy6Var;
        this.q = function0;
        this.p = function1;
        this.r = str;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.r;
        Object obj3 = this.q;
        switch (b) {
            case 0:
                bj bjVar = new bj(this.p, obj3, obj2, hc1Var, (byte) 0);
                bjVar.f429o = obj;
                return bjVar;
            case 1:
                return new bj(this.f429o, (km) this.p, (px4) obj3, (px4) obj2, hc1Var, (byte) 1);
            case 2:
                return new bj((xy6) this.f429o, (Function0) obj3, (Function1) this.p, (String) obj2, hc1Var);
            case 3:
                return new bj((tz0) this.f429o, (ScrollCaptureSession) this.p, (Rect) obj3, (Consumer) obj2, hc1Var, (byte) 3);
            case 4:
                return new bj((y31) this.f429o, (Function1) this.p, (Function0) obj3, (ComposeView) obj2, hc1Var, (byte) 4);
            case 5:
                return new bj((String) this.f429o, (sq2) this.p, (sq2) obj3, (px4) obj2, hc1Var, (byte) 5);
            case 6:
                return new bj((vx6) this.f429o, (px4) this.p, (n81) obj3, (en3) obj2, hc1Var, (byte) 6);
            case 7:
                return new bj((vx6) this.f429o, (px4) this.p, (ru1) obj3, (en3) obj2, hc1Var, (byte) 7);
            case 8:
                bj bjVar2 = new bj(obj3, obj2, hc1Var, (byte) 8);
                bjVar2.f429o = obj;
                return bjVar2;
            case ep1.b /* 9 */:
                bj bjVar3 = new bj(obj3, obj2, hc1Var, (byte) 9);
                bjVar3.f429o = obj;
                return bjVar3;
            case ep1.c /* 10 */:
                bj bjVar4 = new bj(obj3, obj2, hc1Var, (byte) 10);
                bjVar4.f429o = ((jn0) obj).a;
                return bjVar4;
            case 11:
                bj bjVar5 = new bj(this.p, obj3, this.r, hc1Var, (byte) 11);
                bjVar5.f429o = obj;
                return bjVar5;
            case ep1.d /* 12 */:
                return new bj((f33) this.f429o, (m13) this.p, (k33) obj3, (List) obj2, hc1Var, (byte) 12);
            case 13:
                bj bjVar6 = new bj(this.p, obj3, obj2, hc1Var, (byte) 13);
                bjVar6.f429o = obj;
                return bjVar6;
            case 14:
                return new bj((l85) this.f429o, (Resources) this.p, (px4) obj3, (px4) obj2, hc1Var, (byte) 14);
            case 15:
                return new bj((OneAPIRequestHandlerAndroid) this.f429o, (String) this.p, (o85) obj3, (qx0) obj2, hc1Var, (byte) 15);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                bj bjVar7 = new bj(obj3, obj2, hc1Var, (byte) 16);
                bjVar7.f429o = obj;
                return bjVar7;
            case 17:
                return new bj((yr1) this.f429o, (ul7) this.p, (ul7) obj3, (px4) obj2, hc1Var, (byte) 17);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                bj bjVar8 = new bj(this.p, obj3, obj2, hc1Var, (byte) 18);
                bjVar8.f429o = obj;
                return bjVar8;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new bj((Integer) this.f429o, (OffsetDateTime) this.p, (Clock) obj3, (px4) obj2, hc1Var, (byte) 19);
            case 20:
                return new bj((jf3) this.f429o, (Function1) this.p, (String) obj3, (Function0) obj2, hc1Var, (byte) 20);
            case 21:
                bj bjVar9 = new bj((nn5) obj3, (iw2) obj2, (Function1) this.p, hc1Var);
                bjVar9.f429o = obj;
                return bjVar9;
            case 22:
                return new bj((th8) this.f429o, (Function1) this.p, (ComposeView) obj3, (Function0) obj2, hc1Var, (byte) 22);
            default:
                return new bj((k76) this.f429o, (p56) this.p, (LifecycleOwner) obj3, (lu2) obj2, hc1Var, (byte) 23);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((bj) create((xj) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 1:
                return ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                return ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                return ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 5:
                return ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 6:
                return ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 7:
                return ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 8:
                return ((bj) create((Function1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.b /* 9 */:
                return ((bj) create((ft5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.c /* 10 */:
                Object obj3 = ((jn0) obj).a;
                bj bjVar = new bj(this.q, this.r, (hc1) obj2, (byte) 10);
                bjVar.f429o = obj3;
                return bjVar.invokeSuspend(f88Var);
            case 11:
                return ((bj) create((ny6) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.d /* 12 */:
                return ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 13:
                return ((bj) create((tb6) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 14:
                ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 15:
                return ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 17:
                ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 20:
                ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 21:
                return ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 22:
                ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            default:
                return ((bj) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0312  */
    /* JADX WARN: Code duplicated, block: B:157:0x0315  */
    /* JADX WARN: Code duplicated, block: B:159:0x0318  */
    /* JADX WARN: Code duplicated, block: B:160:0x031b  */
    /* JADX WARN: Code duplicated, block: B:252:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61, types: [o.tx5] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:265:0x04f7 -> B:266:0x04f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:267:0x04fc -> B:268:0x04ff). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v35 java.lang.Object, still in use, count: 2, list:
          (r2v35 java.lang.Object) from 0x030e: PHI (r2 I:??) = (r2v27 java.lang.Object), (r2v35 java.lang.Object) binds: [B:153:0x030d, B:380:0x030e] A[DONT_GENERATE, DONT_INLINE]
          (r2v35 java.lang.Object) from 0x0306: CHECK_CAST (o.my5) (r2v35 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj(Object obj, Object obj2, Object obj3, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.q = obj;
        this.r = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(nn5 nn5Var, iw2 iw2Var, Function1 function1, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 21;
        this.q = nn5Var;
        this.r = iw2Var;
        this.p = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj(Object obj, Object obj2, Object obj3, Object obj4, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f429o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
    }
}
