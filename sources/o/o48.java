package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class o48 implements Function1 {
    public static final o48 n = new o48(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o48 f1629o = new o48(1);
    public static final o48 p = new o48(2);
    public static final o48 q = new o48(3);
    public static final o48 r = new o48(4);
    public static final o48 s = new o48(5);
    public static final o48 t = new o48(6);
    public static final o48 u = new o48(7);
    public static final o48 v = new o48(8);
    public static final o48 w = new o48(9);
    public static final o48 x = new o48(10);
    public static final o48 y = new o48(11);
    public static final o48 z = new o48(12);
    public final /* synthetic */ byte m;

    public /* synthetic */ o48(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        boolean z2 = false;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                aw5 aw5Var = (aw5) obj;
                aw5Var.getClass();
                return Integer.valueOf(aw5Var.p.size());
            case 1:
                c07 c07Var = (c07) obj;
                c07Var.getClass();
                return c07Var;
            case 2:
                bu5 bu5Var = (bu5) obj;
                bu5Var.getClass();
                return bu5Var;
            case 3:
                xi0 xi0Var = (xi0) obj;
                xi0Var.getClass();
                return xi0Var;
            case 4:
                fi1 fi1Var = (fi1) obj;
                fi1Var.getClass();
                return Boolean.valueOf(!(fi1Var instanceof z61));
            case 5:
                fi1 fi1Var2 = (fi1) obj;
                fi1Var2.getClass();
                List typeParameters = ((xi0) fi1Var2).getTypeParameters();
                typeParameters.getClass();
                return new fx(typeParameters, (byte) 1);
            case 6:
                m98 m98Var = (m98) obj;
                m98Var.getClass();
                ys0 ys0VarA = m98Var.o0().a();
                if (ys0VarA != null && (ys0VarA instanceof d58) && (((d58) ys0VarA).i() instanceof eq1)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 7:
                m98 m98Var2 = (m98) obj;
                m98Var2.getClass();
                ys0 ys0VarA2 = m98Var2.o0().a();
                if (ys0VarA2 != null && ((ys0VarA2 instanceof eq1) || (ys0VarA2 instanceof d58))) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 8:
                return null;
            case ep1.b /* 9 */:
                return Boolean.valueOf(obj instanceof p82);
            case ep1.c /* 10 */:
                return Boolean.valueOf(obj instanceof p82);
            case 11:
                return Boolean.valueOf(obj instanceof p82);
            case ep1.d /* 12 */:
                return Boolean.valueOf(obj instanceof p82);
            case 13:
                ((uz3) obj).getClass();
                return null;
            case 14:
                zi0 zi0Var = (zi0) obj;
                zi0Var.getClass();
                return bp1.j(zi0Var);
            case 15:
                ((js0) obj).getClass();
                return s67.h;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return Boolean.TRUE;
            case 17:
                return sy4.d((String) obj);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                zi0 zi0Var2 = (zi0) obj;
                if (zi0Var2.k() == 1) {
                    fi1 fi1VarI = zi0Var2.i();
                    fi1VarI.getClass();
                    String str = mo3.a;
                    if (mo3.j.containsKey(zo1.g((ns4) fi1VarI))) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return ((td4) obj).b.a();
            case 20:
                return (zi0) obj;
            case 21:
                return (zi0) obj;
            case 22:
                yz6 yz6Var = (yz6) obj;
                yz6Var.getClass();
                uo3 uo3Var = yp5.b;
                yz6Var.a("java/util/function/Consumer", uo3Var, uo3Var);
                return f88Var;
            case 23:
                yz6 yz6Var2 = (yz6) obj;
                yz6Var2.getClass();
                yz6Var2.a("java/lang/Object", yp5.b);
                return f88Var;
            case 24:
                yz6 yz6Var3 = (yz6) obj;
                yz6Var3.getClass();
                yz6Var3.a("java/lang/Object", yp5.b);
                return f88Var;
            case 25:
                yz6 yz6Var4 = (yz6) obj;
                yz6Var4.getClass();
                yz6Var4.b("java/lang/Object", yp5.b);
                return f88Var;
            case 26:
                yz6 yz6Var5 = (yz6) obj;
                yz6Var5.getClass();
                yz6Var5.b("java/lang/Object", yp5.b);
                return f88Var;
            case 27:
                yz6 yz6Var6 = (yz6) obj;
                yz6Var6.getClass();
                uo3 uo3Var2 = yp5.b;
                yz6Var6.a("java/util/function/BiConsumer", uo3Var2, uo3Var2, uo3Var2);
                return f88Var;
            case 28:
                yz6 yz6Var7 = (yz6) obj;
                yz6Var7.getClass();
                uo3 uo3Var3 = yp5.b;
                yz6Var7.a("java/lang/Object", uo3Var3);
                yz6Var7.a("java/lang/Object", uo3Var3);
                yz6Var7.b("java/lang/Object", yp5.a);
                return f88Var;
            default:
                yz6 yz6Var8 = (yz6) obj;
                yz6Var8.getClass();
                uo3 uo3Var4 = yp5.b;
                yz6Var8.a("java/lang/Object", uo3Var4);
                yz6Var8.a("java/lang/Object", uo3Var4);
                yz6Var8.b("java/lang/Object", yp5.a);
                return f88Var;
        }
    }

    public /* synthetic */ o48(Object obj, byte b) {
        this.m = b;
    }
}
