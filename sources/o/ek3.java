package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapperVector;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ek3 implements Function1 {
    public final /* synthetic */ byte m;

    public /* synthetic */ ek3(int i, o44 o44Var) {
        this.m = (byte) 8;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e63 e63Var;
        byte b = this.m;
        Context context = null;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 1:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 2:
                char cCharValue = ((Character) obj).charValue();
                if ('0' <= cCharValue && cCharValue < ':') {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 3:
                rs0 rs0Var = (rs0) obj;
                rs0Var.getClass();
                rs0.a(rs0Var, "JsonPrimitive", new pq3(new tg3((byte) 7)));
                rs0.a(rs0Var, "JsonNull", new pq3(new tg3((byte) 8)));
                rs0.a(rs0Var, "JsonLiteral", new pq3(new tg3((byte) 9)));
                rs0.a(rs0Var, "JsonObject", new pq3(new tg3((byte) 10)));
                rs0.a(rs0Var, "JsonArray", new pq3(new tg3((byte) 11)));
                return f88Var;
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                lq3 lq3Var = (lq3) entry.getValue();
                StringBuilder sb = new StringBuilder();
                fb7.a(sb, str);
                sb.append(':');
                sb.append(lq3Var);
                return sb.toString();
            case 5:
                ((Integer) obj).getClass();
                return null;
            case 6:
                return f88Var;
            case 7:
                List list = (List) obj;
                return new w44(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 8:
                return f88Var;
            case ep1.b /* 9 */:
                return f88Var;
            case ep1.c /* 10 */:
                return f88Var;
            case 11:
                return f88Var;
            case ep1.d /* 12 */:
                op6 op6Var = (op6) obj;
                op6Var.getClass();
                mp6.a(op6Var);
                return f88Var;
            case 13:
                op6 op6Var2 = (op6) obj;
                op6Var2.getClass();
                mp6.a(op6Var2);
                return f88Var;
            case 14:
                oa4 oa4Var = (oa4) obj;
                oa4Var.getClass();
                u47 u47Var = oa4Var.d;
                if (u47Var instanceof oa4) {
                    return (oa4) u47Var;
                }
                return null;
            case 15:
                oa4 oa4Var2 = (oa4) obj;
                oa4Var2.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(oa4Var2.b);
                sb2.append('=');
                sb2.append(oa4Var2.c);
                return sb2.toString();
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return f88Var;
            case 17:
                for (Context baseContext = (Context) ((u01) obj).T(lh.b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof Activity) {
                        context = baseContext;
                        return (Activity) context;
                    }
                }
                return (Activity) context;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                op6 op6Var3 = (op6) obj;
                op6Var3.getClass();
                mp6.a(op6Var3);
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ll5 ll5Var = (ll5) obj;
                if (ll5Var.s()) {
                    rg4 rg4Var = ll5Var.n;
                    if (!rg4Var.A) {
                        Function1 function1G = ll5Var.m.g();
                        if (ll5Var.m.f() != null) {
                            rg4Var.O0();
                        } else if (function1G == null) {
                            rg4Var.t = null;
                            rg4Var.u = null;
                            rg4Var.s = null;
                            rg4Var.O0();
                        } else {
                            rg4Var.t = null;
                            rg4Var.u = null;
                            rg4Var.r0(ll5Var, 9223372034707292159L, 0L);
                            rg4Var.s = function1G;
                        }
                    }
                }
                return f88Var;
            case 20:
                ll5 ll5Var2 = (ll5) obj;
                if (ll5Var2.s() && (e63Var = ll5Var2.f1377o) != null) {
                    rg4 rg4Var2 = ll5Var2.n;
                    jx4 jx4Var = rg4Var2.D;
                    kx4 kx4Var = jx4Var != null ? (kx4) jx4Var.g(e63Var) : null;
                    if (kx4Var != null) {
                        r8 r8Var = rg4Var2.C;
                        if (r8Var != null) {
                            r8Var.I(e63Var);
                        }
                        rg4Var2.M0(kx4Var);
                        kx4Var.b();
                    }
                }
                return f88Var;
            case 21:
                ((LayoutNode) obj).t = true;
                return f88Var;
            case 22:
                ((Long) obj).getClass();
                return f88Var;
            case 23:
                eq4 eq4Var = (eq4) obj;
                List listL = qf0.L(dq4.a, dq4.b, ((int) (eq4Var.a.b() >> 32)) < ((int) (eq4Var.b >> 32)) / 2 ? dq4.c : dq4.d);
                zk3 zk3Var = eq4Var.a;
                long j = eq4Var.b;
                int i = (int) (eq4Var.c >> 32);
                j04 j04Var = eq4Var.d;
                jw4 jw4Var = new jw4(listL.size());
                int size = listL.size();
                for (int i2 = 0; i2 < size; i2++) {
                    jw4Var.a(((bq4) listL.get(i2)).a(zk3Var, j, i, j04Var));
                }
                return jw4Var;
            case 24:
                eq4 eq4Var2 = (eq4) obj;
                int iB = (int) (eq4Var2.a.b() & 4294967295L);
                long j2 = eq4Var2.b;
                List listL2 = qf0.L(dq4.e, dq4.f, dq4.g, iB < ((int) (j2 & 4294967295L)) / 2 ? dq4.h : dq4.i);
                zk3 zk3Var2 = eq4Var2.a;
                int i3 = (int) (eq4Var2.c & 4294967295L);
                jw4 jw4Var2 = new jw4(listL2.size());
                int size2 = listL2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    jw4Var2.a(((cq4) listL2.get(i4)).a(zk3Var2, j2, i3));
                }
                return jw4Var2;
            case 25:
                return Boolean.TRUE;
            case 26:
                lp6.l((op6) obj);
                return f88Var;
            case 27:
                fw3[] fw3VarArr = lp6.a;
                ((op6) obj).d(kp6.y, f88Var);
                return f88Var;
            case 28:
                ((ComputerDetailsViewModel) obj).getClass();
                return Boolean.TRUE;
            default:
                ComputerDetailsViewModel computerDetailsViewModel = (ComputerDetailsViewModel) obj;
                computerDetailsViewModel.getClass();
                if (!ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_AreAllAlertsAcknowledged(computerDetailsViewModel.a, computerDetailsViewModel)) {
                    IAlertViewModelWrapperVector iAlertViewModelWrapperVectorA = computerDetailsViewModel.a();
                    if (!ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_isEmpty(iAlertViewModelWrapperVectorA.m, iAlertViewModelWrapperVectorA)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ ek3(byte b) {
        this.m = b;
    }
}
