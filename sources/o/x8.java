package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.KeyEvent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.work.impl.WorkDatabase;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x8 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2489o;

    public /* synthetic */ x8(Function0 function0, e45 e45Var) {
        this.m = (byte) 14;
        this.f2489o = function0;
        this.n = e45Var;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x022b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0248  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        fp6 fp6Var;
        LayoutNode layoutNode;
        v56 v56Var;
        List listA0;
        g17 g17VarC;
        Object value;
        Object value2;
        ka1 ka1Var;
        Object value3;
        ka1 ka1Var2;
        byte b = 4;
        Object[] objArr = 0;
        byte b2 = 3;
        j65 j65Var = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.m) {
            case 0:
                n9 n9Var = (n9) this.n;
                Function0 function0 = (Function0) this.f2489o;
                n9Var.f.a();
                function0.a();
                return f88.a;
            case 1:
                return Boolean.valueOf(AndroidComposeView.g((AndroidComposeView) this.n, (KeyEvent) this.f2489o));
            case 2:
                ck6 ck6Var = (ck6) this.n;
                bh bhVar = (bh) this.f2489o;
                rj6 rj6Var = ck6Var.q;
                rj6 rj6Var2 = ck6Var.r;
                Float f = ck6Var.f536o;
                Float f2 = ck6Var.p;
                float fFloatValue = (rj6Var == null || f == null) ? 0.0f : ((Number) rj6Var.a.a()).floatValue() - f.floatValue();
                float fFloatValue2 = (rj6Var2 == null || f2 == null) ? 0.0f : ((Number) rj6Var2.a.a()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iA = bhVar.A(ck6Var.m);
                    hp6 hp6Var = (hp6) bhVar.s().b(bhVar.w);
                    if (hp6Var != null) {
                        try {
                            g4 g4Var = bhVar.y;
                            if (g4Var != null) {
                                g4Var.a.setBoundsInScreen(bhVar.k(hp6Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    hp6 hp6Var2 = (hp6) bhVar.s().b(bhVar.x);
                    if (hp6Var2 != null) {
                        try {
                            g4 g4Var2 = bhVar.z;
                            if (g4Var2 != null) {
                                g4Var2.a.setBoundsInScreen(bhVar.k(hp6Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    bhVar.p.invalidate();
                    hp6 hp6Var3 = (hp6) bhVar.s().b(iA);
                    if (hp6Var3 != null && (fp6Var = hp6Var3.a) != null && (layoutNode = fp6Var.c) != null) {
                        if (rj6Var != null) {
                            bhVar.B.i(iA, rj6Var);
                        }
                        if (rj6Var2 != null) {
                            bhVar.C.i(iA, rj6Var2);
                        }
                        bhVar.w(layoutNode);
                    }
                }
                if (rj6Var != null) {
                    ck6Var.f536o = (Float) rj6Var.a.a();
                }
                if (rj6Var2 != null) {
                    ck6Var.p = (Float) rj6Var2.a.a();
                }
                return f88.a;
            case 3:
                ((k76) this.n).m = ((Function0) this.f2489o).a();
                return f88.a;
            case 4:
                ((wm0) this.n).b(this.f2489o);
                return f88.a;
            case 5:
                ak3 ak3Var = (ak3) this.n;
                Activity activity = (Activity) this.f2489o;
                kh7 kh7Var = ev.a;
                ak3Var.getClass();
                ev.a(new dv(cv.u, ak3Var, null, true, 4));
                if (activity != null) {
                    activity.finishAffinity();
                }
                return f88.a;
            case 6:
                ((jz0) this.n).c = (Function0) this.f2489o;
                return f88.a;
            case 7:
                f20 f20Var = (f20) this.n;
                d14 d14Var = (d14) this.f2489o;
                f20Var.I = f20Var.D.a(d14Var.m.d(), d14Var.getLayoutDirection(), d14Var);
                return f88.a;
            case 8:
                h30 h30Var = (h30) this.n;
                g30 g30Var = (g30) this.f2489o;
                l61 l61Var = h30Var.a;
                synchronized (l61Var.c) {
                    if (l61Var.d.remove(g30Var) && l61Var.d.isEmpty()) {
                        l61Var.d();
                    }
                    break;
                }
                return f88.a;
            case ep1.b /* 9 */:
                zr7 zr7Var = (zr7) this.n;
                px4 px4Var = (px4) this.f2489o;
                if (!gt7.b(zr7Var.b, ((zr7) px4Var.getValue()).b) || !im3.n(zr7Var.c, ((zr7) px4Var.getValue()).c)) {
                    px4Var.setValue(zr7Var);
                }
                return f88.a;
            case ep1.c /* 10 */:
                at7 at7Var = (at7) this.n;
                xo xoVar = (xo) this.f2489o;
                if (at7Var == null) {
                    return xoVar;
                }
                j57 j57Var = at7Var.c;
                boolean zIsEmpty = j57Var.isEmpty();
                xo xoVar2 = at7Var.b;
                if (!zIsEmpty) {
                    xo7 xo7Var = new xo7(xoVar2);
                    int size = j57Var.size();
                    for (int i = 0; i < size; i++) {
                        ((Function1) j57Var.get(i)).invoke(xo7Var);
                    }
                    xoVar2 = xo7Var.b;
                }
                at7Var.b = xoVar2;
                return xoVar2 == null ? xoVar : xoVar2;
            case 11:
                im3.R((me1) this.n, null, null, new b50((k08) this.f2489o, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0), 3);
                return Boolean.TRUE;
            case ep1.d /* 12 */:
                Context context = (Context) this.n;
                g80 g80Var = (g80) this.f2489o;
                if (wj5.n == null) {
                    hk0.l("instance not initialized please call init() before");
                    return null;
                }
                context.getClass();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getApplicationContext().getPackageName()));
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setFlags(268435456);
                context.startActivity(intent);
                g80Var.q.setValue(Boolean.FALSE);
                g80Var.t = true;
                return f88.a;
            case 13:
                xy6 xy6Var = (xy6) this.n;
                me1 me1Var = (me1) this.f2489o;
                if (((Boolean) xy6Var.d.invoke(yy6.f2656o)).booleanValue()) {
                    im3.R(me1Var, null, null, new gy(xy6Var, objArr3 == true ? 1 : 0, (byte) 8), 3);
                }
                return Boolean.TRUE;
            case 14:
                Function0 function1 = (Function0) this.f2489o;
                e45 e45Var = (e45) this.n;
                if (function1 != null && (v56Var = (v56) function1.a()) != null) {
                    return v56Var;
                }
                if (!e45Var.a1().z) {
                    e45Var = null;
                }
                if (e45Var != null) {
                    return qs1.v(0L, xs1.a0(e45Var.f1179o));
                }
                return null;
            case 15:
                ((gi0) this.n).C.invoke((hi0) this.f2489o);
                return f88.a;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                nm8 nm8Var = (nm8) this.n;
                UUID uuid = (UUID) this.f2489o;
                WorkDatabase workDatabase = nm8Var.c;
                workDatabase.getClass();
                workDatabase.o(new io.sentry.u4((Object) nm8Var, (Object) uuid, (byte) 18));
                aj6.b(nm8Var.b, nm8Var.c, nm8Var.e);
                return f88.a;
            case 17:
                Function1 function2 = (Function1) this.n;
                vv6 vv6Var = (vv6) this.f2489o;
                if (function2 != null) {
                    function2.invoke(vv6Var);
                }
                return f88.a;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return qf0.K(new vd5((ui2) this.n, (wt3) this.f2489o));
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                q01 q01Var = (q01) this.n;
                Object obj = this.f2489o;
                ux2 ux2Var = q01Var.m;
                h17 h17Var = ux2Var.c;
                g17 g17VarC2 = h17Var.c();
                int i2 = 0;
                while (true) {
                    try {
                        if (i2 < h17Var.n) {
                            if (g17VarC2.l(i2)) {
                                Object objN = g17VarC2.n(i2);
                                if (objN != obj) {
                                    yx2 yx2Var = objN instanceof yx2 ? (yx2) objN : null;
                                    if ((yx2Var != null ? yx2Var.a : null) == obj) {
                                    }
                                }
                                j65 j65Var2 = new j65(i2, null);
                                g17VarC2.c();
                                j65Var = j65Var2;
                                if (j65Var != null) {
                                    int i3 = j65Var.a;
                                    Integer num = j65Var.b;
                                    g17VarC = h17Var.c();
                                    try {
                                        ArrayList arrayListX = ga0.x(g17VarC, i3, num);
                                        g17VarC.c();
                                        listA0 = lv0.A0(arrayListX, ux2Var.D());
                                    } catch (Throwable th) {
                                        g17VarC.c();
                                        throw th;
                                    }
                                } else {
                                    listA0 = ea2.m;
                                }
                                return new vz0(listA0, ux2Var.C);
                            }
                            int[] iArr = g17VarC2.b;
                            int i4 = i2 + 1;
                            int iD = (i4 < g17VarC2.c ? iArr[(i4 * 5) + 4] : g17VarC2.e) - j17.d(iArr, i2);
                            int i5 = 0;
                            while (true) {
                                if (i5 >= iD) {
                                    i2 = i4;
                                } else {
                                    Object objH = g17VarC2.h(i2, i5);
                                    if (objH != obj) {
                                        yx2 yx2Var2 = objH instanceof yx2 ? (yx2) objH : null;
                                        if ((yx2Var2 != null ? yx2Var2.a : null) != obj) {
                                            i5++;
                                        }
                                    }
                                    j65Var = new j65(i2, Integer.valueOf(i5));
                                }
                            }
                        }
                        g17VarC2.c();
                        if (j65Var != null) {
                            int i6 = j65Var.a;
                            Integer num2 = j65Var.b;
                            g17VarC = h17Var.c();
                            ArrayList arrayListX2 = ga0.x(g17VarC, i6, num2);
                            g17VarC.c();
                            listA0 = lv0.A0(arrayListX2, ux2Var.D());
                        } else {
                            listA0 = ea2.m;
                        }
                        return new vz0(listA0, ux2Var.C);
                    } catch (Throwable th2) {
                        g17VarC2.c();
                        throw th2;
                    }
                }
            case 20:
                y31 y31Var = (y31) this.n;
                i31 i31Var = (i31) this.f2489o;
                y31Var.a1();
                i31Var.j.a();
                return f88.a;
            case 21:
                Function1 function3 = (Function1) this.n;
                y21 y21Var = (y21) this.f2489o;
                if (function3 != null) {
                    y31 y31Var2 = y21Var.q0;
                    if (y31Var2 != null) {
                        y31Var2.Y0();
                    }
                    if (y21Var.s0) {
                        String strI = y21Var.I(R.string.trial_ended_dialog_title);
                        String strI2 = y21Var.I(R.string.trial_ended_dialog_description);
                        String strI3 = y21Var.I(R.string.in_app_purchase_upgrade_button_label);
                        strI3.getClass();
                        function3.invoke(new q20(strI, strI2, strI3, new q21(y21Var, (byte) 2), y21Var.I(R.string.dialog_option_cancel), new q21(y21Var, b2)));
                    } else {
                        String strI4 = y21Var.I(R.string.trial_ended_dialog_title);
                        String strI5 = y21Var.I(R.string.trial_ended_dialog_description);
                        String strI6 = y21Var.I(R.string.dialog_option_cancel);
                        strI6.getClass();
                        function3.invoke(new q20(strI4, strI5, strI6, new q21(y21Var, b), null, new q21(y21Var, (byte) 5)));
                    }
                }
                return f88.a;
            case 22:
                ((l51) this.n).a.unregisterNetworkCallback((k51) this.f2489o);
                return f88.a;
            case 23:
                n81 n81Var = (n81) this.n;
                px4 px4Var2 = (px4) this.f2489o;
                n81Var.c1();
                ((Function0) px4Var2.getValue()).a();
                return f88.a;
            case 24:
                n81 n81Var2 = (n81) this.n;
                Function0 function4 = (Function0) this.f2489o;
                l97 l97Var = n81Var2.r;
                do {
                    value = l97Var.getValue();
                } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, false, 1535)));
                function4.a();
                return f88.a;
            case 25:
                Function1 function5 = (Function1) this.n;
                k71 k71Var = (k71) this.f2489o;
                function5.invoke(k71Var.c);
                ra1 ra1Var = k71Var.d;
                if (ra1Var != null) {
                    ga7.a(ra1Var);
                }
                return f88.a;
            case 26:
                qa1 qa1Var = (qa1) this.n;
                a91 a91Var = (a91) this.f2489o;
                l97 l97Var2 = qa1Var.r;
                do {
                    value2 = l97Var2.getValue();
                    ka1Var = (ka1) value2;
                } while (!l97Var2.j(value2, ka1.a(ka1Var, null, qa1.a1(ka1Var.b, a91Var), false, false, false, false, false, false, a91Var, null, 0, 0, false, null, false, null, false, false, 261853)));
                return f88.a;
            case 27:
                qa1 qa1Var2 = (qa1) this.n;
                l71 l71Var = (l71) this.f2489o;
                l97 l97Var3 = qa1Var2.r;
                do {
                    value3 = l97Var3.getValue();
                    ka1Var2 = (ka1) value3;
                } while (!l97Var3.j(value3, ka1.a(ka1Var2, null, qa1.a1(qa1.X0(ka1Var2.a, l71Var), ka1Var2.i), false, false, false, false, false, false, null, l71Var, 0, 0, false, null, false, null, false, false, 261565)));
                return f88.a;
            case 28:
                Function1 function6 = (Function1) this.n;
                z81 z81Var = (z81) this.f2489o;
                function6.invoke(z81Var.b);
                ra1 ra1Var2 = z81Var.c;
                if (ra1Var2 != null) {
                    ga7.a(ra1Var2);
                }
                return f88.a;
            default:
                return new vk3(us1.O(((fp7) this.n).c0((i04) ((Function0) this.f2489o).a())));
        }
    }

    public /* synthetic */ x8(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f2489o = obj2;
    }
}
