package o;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xn5 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2538o;
    public final /* synthetic */ Object p;

    public /* synthetic */ xn5(wk0 wk0Var, od1 od1Var, k76 k76Var) {
        this.m = (byte) 6;
        this.n = wk0Var;
        this.p = od1Var;
        this.f2538o = k76Var;
    }

    /* JADX WARN: Code duplicated, block: B:295:0x06cd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v175, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [o.hc1] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
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
        j64 j64Var;
        wo woVar;
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        vs7 vs7Var;
        vs7 vs7Var2;
        ws7 ws7Var;
        ws7 ws7Var2;
        vs7 vs7Var3;
        vs7 vs7Var4;
        ws7 ws7Var3;
        ws7 ws7Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        lh7 lh7Var;
        zr7 zr7Var;
        byte b = this.m;
        byte b2 = 4;
        final byte b3 = 2;
        byte b4 = 25;
        ?? r5 = 0;
        zr7 zr7Var2 = null;
        r5 = 0;
        f88 f88Var = f88.a;
        final byte b5 = 0;
        Object obj2 = this.p;
        Object obj3 = this.f2538o;
        Object obj4 = this.n;
        final byte b6 = 1;
        switch (b) {
            case 0:
                List list = (List) obj4;
                UUID uuid = (UUID) obj3;
                Function1 function1 = (Function1) obj2;
                h44 h44Var = (h44) obj;
                h44Var.getClass();
                h44.a(h44Var, "no-policy", new yy0(-370009517, true, new sd(uuid, function1, (byte) 8)), 2);
                zn5 zn5Var = zn5.m;
                h44Var.b(list.size(), new ha1(list), new ha1(list, (byte) 5), new yy0(802480018, true, new ao5(list, uuid, function1)));
                return f88Var;
            case 1:
                Function0 function0 = (Function0) obj3;
                tx5 tx5Var = (tx5) obj2;
                ((z7) obj).getClass();
                if (hm3.h((Context) obj4, "android.permission.CAMERA") != 0) {
                    function0.a();
                } else {
                    tx5Var.q.setValue(Boolean.FALSE);
                }
                return f88Var;
            case 2:
                lh6 lh6Var = (lh6) obj4;
                qh6 qh6Var = (qh6) obj2;
                jx4 jx4Var = lh6Var.n;
                if (jx4Var.b(obj3)) {
                    an4.q(obj3, " was used multiple times ", "Key ");
                    return null;
                }
                lh6Var.m.remove(obj3);
                jx4Var.m(obj3, qh6Var);
                return new en(lh6Var, obj3, qh6Var, b3);
            case 3:
                io.sentry.android.core.n1 n1Var = (io.sentry.android.core.n1) obj4;
                jo6 jo6Var = (jo6) obj3;
                g76 g76Var = (g76) obj2;
                in5 in5Var = (in5) obj;
                long j = in5Var.c;
                pr7 pr7Var = (pr7) n1Var.p;
                if (pr7Var.i() && pr7Var.l().a.n.length() != 0 && (j64Var = pr7Var.d) != null && j64Var.d() != null) {
                    n1Var.p(pr7Var.l(), j, false, jo6Var);
                    b5 = 1;
                }
                if (b5 != 0) {
                    in5Var.a();
                    g76Var.m = true;
                }
                return f88Var;
            case 4:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) obj4;
                ((r22) obj).getClass();
                dy0 dy0Var = new dy0((c67) obj3, (a06) obj2, b2);
                lifecycleOwner.getR().a(dy0Var);
                return new l9(lifecycleOwner, dy0Var, (byte) 17);
            case 5:
                g76 g76Var2 = (g76) obj4;
                wo woVar2 = (wo) obj3;
                c77 c77Var = (c77) obj2;
                wo woVar3 = (wo) obj;
                if (g76Var2.m) {
                    Object obj5 = woVar3.a;
                    int i = woVar3.c;
                    int i2 = woVar3.b;
                    if ((obj5 instanceof c77) && i2 == woVar2.b && i == woVar2.c) {
                        if (c77Var == null) {
                            c77Var = new c77(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                        }
                        woVar = new wo(i2, i, c77Var);
                    } else {
                        woVar = woVar3;
                    }
                } else {
                    woVar = woVar3;
                }
                g76Var2.m = woVar2.equals(woVar3);
                return woVar;
            case 6:
                Function1 function2 = (Function1) obj2;
                ns7 ns7Var = (ns7) ((k76) obj3).m;
                zr7 zr7VarJ = ((wk0) obj4).j((List) obj);
                if (ns7Var != null) {
                    ns7Var.a(null, zr7VarJ);
                }
                function2.invoke(zr7VarJ);
                return f88Var;
            case 7:
                sq7 sq7Var = (sq7) obj3;
                g76 g76Var3 = (g76) obj2;
                br7 br7Var = (br7) obj;
                byte b7 = 7;
                switch (((yw3) obj4).ordinal()) {
                    case 0:
                        br7Var.e.a = null;
                        if (br7Var.g.n.length() > 0) {
                            if (!gt7.c(br7Var.f)) {
                                boolean zF = br7Var.f();
                                long j2 = br7Var.f;
                                if (!zF) {
                                    int iE = gt7.e(j2);
                                    br7Var.q(iE, iE);
                                } else {
                                    int iF = gt7.f(j2);
                                    br7Var.q(iF, iF);
                                }
                            } else {
                                br7Var.i();
                            }
                        }
                        break;
                    case 1:
                        br7Var.e.a = null;
                        if (br7Var.g.n.length() > 0) {
                            if (!gt7.c(br7Var.f)) {
                                boolean zF2 = br7Var.f();
                                long j3 = br7Var.f;
                                if (!zF2) {
                                    int iF2 = gt7.f(j3);
                                    br7Var.q(iF2, iF2);
                                } else {
                                    int iE2 = gt7.e(j3);
                                    br7Var.q(iE2, iE2);
                                }
                            } else {
                                br7Var.m();
                            }
                        }
                        break;
                    case 2:
                        ft7 ft7Var = br7Var.e;
                        ft7Var.a = null;
                        xo xoVar = br7Var.g;
                        String str = xoVar.n;
                        String str2 = xoVar.n;
                        if (str.length() > 0) {
                            if (!br7Var.f()) {
                                ft7Var.a = null;
                                if (str2.length() > 0 && (numE = br7Var.e()) != null) {
                                    int iIntValue = numE.intValue();
                                    br7Var.q(iIntValue, iIntValue);
                                }
                            } else {
                                ft7Var.a = null;
                                if (str2.length() > 0 && (numD = br7Var.d()) != null) {
                                    int iIntValue2 = numD.intValue();
                                    br7Var.q(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case 3:
                        ft7 ft7Var2 = br7Var.e;
                        ft7Var2.a = null;
                        xo xoVar2 = br7Var.g;
                        String str3 = xoVar2.n;
                        String str4 = xoVar2.n;
                        if (str3.length() > 0) {
                            if (!br7Var.f()) {
                                ft7Var2.a = null;
                                if (str4.length() > 0 && (numD2 = br7Var.d()) != null) {
                                    int iIntValue3 = numD2.intValue();
                                    br7Var.q(iIntValue3, iIntValue3);
                                }
                            } else {
                                ft7Var2.a = null;
                                if (str4.length() > 0 && (numE2 = br7Var.e()) != null) {
                                    int iIntValue4 = numE2.intValue();
                                    br7Var.q(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 4:
                        br7Var.j();
                        break;
                    case 5:
                        br7Var.l();
                        break;
                    case 6:
                        br7Var.o();
                        break;
                    case 7:
                        br7Var.n();
                        break;
                    case 8:
                        br7Var.e.a = null;
                        if (br7Var.g.n.length() > 0) {
                            if (!br7Var.f()) {
                                br7Var.n();
                            } else {
                                br7Var.o();
                            }
                        }
                        break;
                    case ep1.b /* 9 */:
                        br7Var.e.a = null;
                        if (br7Var.g.n.length() > 0) {
                            if (!br7Var.f()) {
                                br7Var.o();
                            } else {
                                br7Var.n();
                            }
                        }
                        break;
                    case ep1.c /* 10 */:
                        if (br7Var.g.n.length() > 0 && (vs7Var = br7Var.c) != null) {
                            int iG = br7Var.g(vs7Var, -1);
                            br7Var.q(iG, iG);
                        }
                        break;
                    case 11:
                        if (br7Var.g.n.length() > 0 && (vs7Var2 = br7Var.c) != null) {
                            int iG2 = br7Var.g(vs7Var2, 1);
                            br7Var.q(iG2, iG2);
                        }
                        break;
                    case ep1.d /* 12 */:
                    case 48:
                        break;
                    case 13:
                        if (br7Var.g.n.length() > 0 && (ws7Var = br7Var.i) != null) {
                            int iH = br7Var.h(ws7Var, -1);
                            br7Var.q(iH, iH);
                        }
                        break;
                    case 14:
                        if (br7Var.g.n.length() > 0 && (ws7Var2 = br7Var.i) != null) {
                            int iH2 = br7Var.h(ws7Var2, 1);
                            br7Var.q(iH2, iH2);
                        }
                        break;
                    case 15:
                        br7Var.e.a = null;
                        if (br7Var.g.n.length() > 0) {
                            br7Var.q(0, 0);
                        }
                        break;
                    case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                        br7Var.e.a = null;
                        xo xoVar3 = br7Var.g;
                        if (xoVar3.n.length() > 0) {
                            int length = xoVar3.n.length();
                            br7Var.q(length, length);
                        }
                        break;
                    case 17:
                        sq7Var.b.a(false);
                        break;
                    case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                        sq7Var.b.o();
                        break;
                    case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        sq7Var.b.c();
                        break;
                    case 20:
                        List listA = br7Var.a(new vs6((byte) 22));
                        if (listA != null) {
                            sq7Var.a(listA);
                        }
                        break;
                    case 21:
                        List listA2 = br7Var.a(new vs6((byte) 23));
                        if (listA2 != null) {
                            sq7Var.a(listA2);
                        }
                        break;
                    case 22:
                        List listA3 = br7Var.a(new vs6((byte) 24));
                        if (listA3 != null) {
                            sq7Var.a(listA3);
                        }
                        break;
                    case 23:
                        List listA4 = br7Var.a(new vs6(b4));
                        if (listA4 != null) {
                            sq7Var.a(listA4);
                        }
                        break;
                    case 24:
                        List listA5 = br7Var.a(new vs6((byte) 26));
                        if (listA5 != null) {
                            sq7Var.a(listA5);
                        }
                        break;
                    case 25:
                        List listA6 = br7Var.a(new vs6((byte) 27));
                        if (listA6 != null) {
                            sq7Var.a(listA6);
                        }
                        break;
                    case 26:
                        br7Var.e.a = null;
                        xo xoVar4 = br7Var.g;
                        if (xoVar4.n.length() > 0) {
                            br7Var.q(0, xoVar4.n.length());
                        }
                        break;
                    case 27:
                        br7Var.i();
                        br7Var.p();
                        break;
                    case 28:
                        br7Var.m();
                        br7Var.p();
                        break;
                    case 29:
                        if (br7Var.g.n.length() > 0 && (vs7Var3 = br7Var.c) != null) {
                            int iG3 = br7Var.g(vs7Var3, -1);
                            br7Var.q(iG3, iG3);
                        }
                        br7Var.p();
                        break;
                    case 30:
                        if (br7Var.g.n.length() > 0 && (vs7Var4 = br7Var.c) != null) {
                            int iG4 = br7Var.g(vs7Var4, 1);
                            br7Var.q(iG4, iG4);
                        }
                        br7Var.p();
                        break;
                    case 31:
                        if (br7Var.g.n.length() > 0 && (ws7Var3 = br7Var.i) != null) {
                            int iH3 = br7Var.h(ws7Var3, -1);
                            br7Var.q(iH3, iH3);
                        }
                        br7Var.p();
                        break;
                    case 32:
                        if (br7Var.g.n.length() > 0 && (ws7Var4 = br7Var.i) != null) {
                            int iH4 = br7Var.h(ws7Var4, 1);
                            br7Var.q(iH4, iH4);
                        }
                        br7Var.p();
                        break;
                    case 33:
                        br7Var.e.a = null;
                        if (br7Var.g.n.length() > 0) {
                            br7Var.q(0, 0);
                        }
                        br7Var.p();
                        break;
                    case 34:
                        br7Var.e.a = null;
                        xo xoVar5 = br7Var.g;
                        if (xoVar5.n.length() > 0) {
                            int length2 = xoVar5.n.length();
                            br7Var.q(length2, length2);
                        }
                        br7Var.p();
                        break;
                    case 35:
                        ft7 ft7Var3 = br7Var.e;
                        ft7Var3.a = null;
                        xo xoVar6 = br7Var.g;
                        String str5 = xoVar6.n;
                        String str6 = xoVar6.n;
                        if (str5.length() > 0) {
                            if (br7Var.f()) {
                                ft7Var3.a = null;
                                if (str6.length() > 0 && (numE3 = br7Var.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    br7Var.q(iIntValue5, iIntValue5);
                                }
                            } else {
                                ft7Var3.a = null;
                                if (str6.length() > 0 && (numD3 = br7Var.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    br7Var.q(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        br7Var.p();
                        break;
                    case 36:
                        ft7 ft7Var4 = br7Var.e;
                        ft7Var4.a = null;
                        xo xoVar7 = br7Var.g;
                        String str7 = xoVar7.n;
                        String str8 = xoVar7.n;
                        if (str7.length() > 0) {
                            if (br7Var.f()) {
                                ft7Var4.a = null;
                                if (str8.length() > 0 && (numD4 = br7Var.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    br7Var.q(iIntValue7, iIntValue7);
                                }
                            } else {
                                ft7Var4.a = null;
                                if (str8.length() > 0 && (numE4 = br7Var.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    br7Var.q(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        br7Var.p();
                        break;
                    case 37:
                        br7Var.j();
                        br7Var.p();
                        break;
                    case 38:
                        br7Var.l();
                        br7Var.p();
                        break;
                    case 39:
                        br7Var.o();
                        br7Var.p();
                        break;
                    case 40:
                        br7Var.n();
                        br7Var.p();
                        break;
                    case 41:
                        br7Var.e.a = null;
                        if (br7Var.g.n.length() > 0) {
                            if (br7Var.f()) {
                                br7Var.o();
                            } else {
                                br7Var.n();
                            }
                        }
                        br7Var.p();
                        break;
                    case 42:
                        br7Var.e.a = null;
                        if (br7Var.g.n.length() > 0) {
                            if (br7Var.f()) {
                                br7Var.n();
                            } else {
                                br7Var.o();
                            }
                        }
                        br7Var.p();
                        break;
                    case 43:
                        br7Var.e.a = null;
                        if (br7Var.g.n.length() > 0) {
                            long j4 = br7Var.f;
                            int i3 = gt7.c;
                            int i4 = (int) (j4 & 4294967295L);
                            br7Var.q(i4, i4);
                        }
                        break;
                    case 44:
                        if (!sq7Var.e) {
                            sq7Var.a(qf0.K(new cx0("\n", 1)));
                        } else {
                            g76Var3.m = sq7Var.a.x.n.r.b(sq7Var.k);
                        }
                        break;
                    case 45:
                        if (!sq7Var.e) {
                            sq7Var.a(qf0.K(new cx0("\t", 1)));
                        } else {
                            g76Var3.m = false;
                        }
                        break;
                    case 46:
                        sq7Var.h.a(zr7.a(br7Var.h, br7Var.g, br7Var.f, 4));
                        u78 u78Var = sq7Var.h;
                        lh7 lh7Var2 = u78Var.a;
                        if (lh7Var2 != null && (lh7Var = (lh7) lh7Var2.n) != null) {
                            u78Var.a = lh7Var;
                            u78Var.c -= ((zr7) lh7Var2.f1364o).a.n.length();
                            u78Var.b = new lh7(u78Var.b, (zr7) lh7Var2.f1364o, b7);
                            zr7Var = (zr7) lh7Var.f1364o;
                        }
                        if (r5 != 0) {
                            r5 = zr7Var;
                            sq7Var.j.invoke(r5);
                        }
                        break;
                    case 47:
                        u78 u78Var2 = sq7Var.h;
                        lh7 lh7Var3 = u78Var2.b;
                        if (lh7Var3 != null) {
                            u78Var2.b = (lh7) lh7Var3.n;
                            zr7 zr7Var3 = (zr7) lh7Var3.f1364o;
                            u78Var2.a = new lh7(u78Var2.a, zr7Var3, b7);
                            u78Var2.c = zr7Var3.a.n.length() + u78Var2.c;
                            zr7Var2 = (zr7) lh7Var3.f1364o;
                        }
                        if (zr7Var2 != null) {
                            sq7Var.j.invoke(zr7Var2);
                        }
                        break;
                    default:
                        gk0.s();
                        return null;
                }
                r5 = zr7Var;
                return f88Var;
            default:
                final pr7 pr7Var2 = (pr7) obj4;
                me1 me1Var = (me1) obj3;
                Context context = (Context) obj2;
                cp7 cp7Var = (cp7) obj;
                zw4 zw4Var = cp7Var.a;
                zw4 zw4Var2 = cp7Var.a;
                qp7 qp7Var = qp7.b;
                zw4Var.a(qp7Var);
                np7 np7Var = np7.p;
                boolean z = (gt7.c(pr7Var2.l().b) || !pr7Var2.h() || (pr7Var2.f instanceof vg5) || pr7Var2.h == null) ? false : true;
                a26 a26Var = new a26(me1Var, new kr7(pr7Var2, r5, b6), b4);
                Resources resources = context.getResources();
                a04 a04Var = new a04(a26Var, null, (byte) 1);
                if (z) {
                    zw4Var2.a(new mp7(ga0.n0, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, a04Var));
                }
                np7 np7Var2 = np7.p;
                boolean z2 = (gt7.c(pr7Var2.l().b) || (pr7Var2.f instanceof vg5) || pr7Var2.h == null) ? false : true;
                a26 a26Var2 = new a26(me1Var, new kr7(pr7Var2, r5, b3), b4);
                Resources resources2 = context.getResources();
                a04 a04Var2 = new a04(a26Var2, null, (byte) 1);
                if (z2) {
                    zw4Var2.a(new mp7(ga0.o0, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, a04Var2));
                }
                np7 np7Var3 = np7.p;
                boolean z3 = pr7Var2.h() && ((Boolean) pr7Var2.x.getValue()).booleanValue() && pr7Var2.h != null;
                a26 a26Var3 = new a26(me1Var, new kr7(pr7Var2, r5, (byte) 3), b4);
                Resources resources3 = context.getResources();
                a04 a04Var3 = new a04(a26Var3, null, (byte) 1);
                if (z3) {
                    zw4Var2.a(new mp7(ga0.p0, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, a04Var3));
                }
                np7 np7Var4 = np7.p;
                boolean z4 = gt7.d(pr7Var2.l().b) != pr7Var2.l().a.n.length();
                Function0 function3 = new Function0() { // from class: o.ur7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b8 = b5;
                        f88 f88Var2 = f88.a;
                        pr7 pr7Var3 = pr7Var2;
                        switch (b8) {
                            case 0:
                                return Boolean.valueOf(!pr7Var3.B);
                            case 1:
                                zr7 zr7VarB = pr7.b(pr7Var3.l().a, h57.a(0, pr7Var3.l().a.n.length()));
                                pr7Var3.c.invoke(zr7VarB);
                                long j5 = zr7VarB.b;
                                pr7Var3.w = new gt7(j5);
                                pr7Var3.u = zr7.a(pr7Var3.u, null, j5, 5);
                                pr7Var3.e(true);
                                return f88Var2;
                            default:
                                Function0 function4 = pr7Var3.g;
                                if (function4 != null) {
                                    function4.a();
                                }
                                return f88Var2;
                        }
                    }
                };
                Function0 function4 = new Function0() { // from class: o.ur7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b8 = b6;
                        f88 f88Var2 = f88.a;
                        pr7 pr7Var3 = pr7Var2;
                        switch (b8) {
                            case 0:
                                return Boolean.valueOf(!pr7Var3.B);
                            case 1:
                                zr7 zr7VarB = pr7.b(pr7Var3.l().a, h57.a(0, pr7Var3.l().a.n.length()));
                                pr7Var3.c.invoke(zr7VarB);
                                long j5 = zr7VarB.b;
                                pr7Var3.w = new gt7(j5);
                                pr7Var3.u = zr7.a(pr7Var3.u, null, j5, 5);
                                pr7Var3.e(true);
                                return f88Var2;
                            default:
                                Function0 function5 = pr7Var3.g;
                                if (function5 != null) {
                                    function5.a();
                                }
                                return f88Var2;
                        }
                    }
                };
                Resources resources4 = context.getResources();
                a04 a04Var4 = new a04(function4, function3, (byte) 1);
                if (z4) {
                    zw4Var2.a(new mp7(ga0.q0, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, a04Var4));
                }
                np7 np7Var5 = np7.p;
                if (pr7Var2.h() && gt7.c(pr7Var2.l().b)) {
                    b5 = 1;
                }
                Function0 function5 = new Function0() { // from class: o.ur7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b8 = b3;
                        f88 f88Var2 = f88.a;
                        pr7 pr7Var3 = pr7Var2;
                        switch (b8) {
                            case 0:
                                return Boolean.valueOf(!pr7Var3.B);
                            case 1:
                                zr7 zr7VarB = pr7.b(pr7Var3.l().a, h57.a(0, pr7Var3.l().a.n.length()));
                                pr7Var3.c.invoke(zr7VarB);
                                long j5 = zr7VarB.b;
                                pr7Var3.w = new gt7(j5);
                                pr7Var3.u = zr7.a(pr7Var3.u, null, j5, 5);
                                pr7Var3.e(true);
                                return f88Var2;
                            default:
                                Function0 function6 = pr7Var3.g;
                                if (function6 != null) {
                                    function6.a();
                                }
                                return f88Var2;
                        }
                    }
                };
                Resources resources5 = context.getResources();
                a04 a04Var5 = new a04(function5, null, (byte) 1);
                if (b5 != 0) {
                    zw4Var2.a(new mp7(np7Var5.m, resources5.getString(np7Var5.n), np7Var5.f1590o, a04Var5));
                }
                zw4Var2.a(qp7Var);
                return f88Var;
        }
    }

    public /* synthetic */ xn5(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.n = obj;
        this.f2538o = obj2;
        this.p = obj3;
    }
}
