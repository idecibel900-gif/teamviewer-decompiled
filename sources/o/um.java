package o;

import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class um extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f2225o;
    public Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um(v23 v23Var, w44 w44Var, u23 u23Var, px4 px4Var, px4 px4Var2, px4 px4Var3, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 3;
        this.f2225o = v23Var;
        this.p = w44Var;
        this.q = u23Var;
        this.s = px4Var;
        this.t = px4Var2;
        this.r = px4Var3;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.t;
        Object obj3 = this.s;
        Object obj4 = this.r;
        Object obj5 = this.q;
        switch (b) {
            case 0:
                um umVar = new um((wm0) obj5, (km) obj4, (px4) obj3, (px4) obj2, hc1Var, (byte) 0);
                umVar.p = obj;
                return umVar;
            case 1:
                return new um((y31) this.f2225o, (y21) this.p, (Function1) obj5, (Function0) obj4, (au0) obj3, (me1) obj2, hc1Var, (byte) 1);
            case 2:
                return new um((y31) this.f2225o, (y21) this.p, (Function1) obj5, (Function0) obj4, (ComposeView) obj3, (Function1) obj2, hc1Var, (byte) 2);
            case 3:
                return new um((v23) this.f2225o, (w44) this.p, (u23) obj5, (px4) obj3, (px4) obj2, (px4) obj4, hc1Var);
            case 4:
                return new um((he5) this.f2225o, (ie5) this.p, (List) obj5, (rl2) obj4, (ym2) obj3, (fe5) obj2, hc1Var, (byte) 4);
            default:
                return new um((x84) obj5, (m84) obj4, (me1) obj3, (hw2) obj2, hc1Var, (byte) 5);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                return ((um) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case 1:
                ((um) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return ne1Var;
            case 2:
                ((um) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return ne1Var;
            case 3:
                return ((um) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case 4:
                return ((um) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            default:
                return ((um) create(me1Var, hc1Var)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0260  */
    /* JADX WARN: Code duplicated, block: B:118:0x026a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0278  */
    /* JADX WARN: Code duplicated, block: B:121:0x027a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x025e -> B:116:0x0262). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.um.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ um(Object obj, Object obj2, Object obj3, Object obj4, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.q = obj;
        this.r = obj2;
        this.s = obj3;
        this.t = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ um(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2225o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
        this.s = obj5;
        this.t = obj6;
    }
}
