package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ek implements Function1 {
    public final /* synthetic */ byte m;
    public static final ek n = new ek(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ek f721o = new ek(1);
    public static final ek p = new ek(2);
    public static final ek q = new ek(3);
    public static final ek r = new ek(4);
    public static final ek s = new ek(5);
    public static final ek t = new ek(6);
    public static final ek u = new ek(7);
    public static final ek v = new ek(8);
    public static final ek w = new ek(9);
    public static final ek x = new ek(10);
    public static final ek y = new ek(11);
    public static final ek z = new ek(12);
    public static final ek A = new ek(13);
    public static final ek B = new ek(14);
    public static final ek C = new ek(15);
    public static final ek D = new ek(16);
    public static final ek E = new ek(17);
    public static final ek F = new ek(18);
    public static final ek G = new ek(19);
    public static final ek H = new ek(20);
    public static final ek I = new ek(21);
    public static final ek J = new ek(22);
    public static final ek K = new ek(23);
    public static final ek L = new ek(24);
    public static final ek M = new ek(25);
    public static final ek N = new ek(26);
    public static final ek O = new ek(27);
    public static final ek P = new ek(28);
    public static final ek Q = new ek(29);

    public /* synthetic */ ek(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        oz3 type;
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return f88Var;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                    string.getClass();
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                    string.getClass();
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                    string.getClass();
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                    string.getClass();
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                    string.getClass();
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                    string.getClass();
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                    string.getClass();
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                    string.getClass();
                } else if (value instanceof Object[]) {
                    string = Arrays.toString((Object[]) value);
                    string.getClass();
                } else {
                    string = value.toString();
                }
                return str + '=' + string;
            case 2:
                zi0 zi0Var = (zi0) obj;
                int i = ig0.l;
                zi0Var.getClass();
                return Boolean.valueOf(lv0.h0(y77.f, io1.F(zi0Var)));
            case 3:
                zi0 zi0Var2 = (zi0) obj;
                int i2 = ig0.l;
                zi0Var2.getClass();
                return Boolean.valueOf((zi0Var2 instanceof xw2) && lv0.h0(y77.f, io1.F(zi0Var2)));
            case 4:
                Class cls = (Class) obj;
                wk0 wk0Var = ni0.a;
                cls.getClass();
                return new eu3(cls);
            case 5:
                Class cls2 = (Class) obj;
                wk0 wk0Var2 = ni0.a;
                cls2.getClass();
                return new lv3(cls2);
            case 6:
                m98 m98Var = (m98) obj;
                m98Var.getClass();
                return Boolean.valueOf(m98Var.o0() instanceof xl0);
            case 7:
                ((xw2) obj).getClass();
                return null;
            case 8:
                ((xw2) obj).getClass();
                return null;
            case ep1.b /* 9 */:
                ((xw2) obj).getClass();
                return null;
            case ep1.c /* 10 */:
                zi0 zi0Var3 = (zi0) obj;
                zi0Var3.getClass();
                return Boolean.valueOf(e8.o(zi0Var3));
            case 11:
                up upVar = (up) obj;
                upVar.getClass();
                return new fx(upVar, 1 == true ? 1 : 0);
            case ep1.d /* 12 */:
                float[] fArr = ((wn4) obj).a;
                return f88Var;
            case 13:
                float[] fArr2 = ((wn4) obj).a;
                return f88Var;
            case 14:
                oz3 oz3Var = (oz3) obj;
                qo1 qo1Var = qo1.c;
                oz3Var.getClass();
                return oz3Var;
            case 15:
                qo1 qo1Var2 = qo1.c;
                return "";
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                oz3 oz3Var2 = (oz3) obj;
                fw3[] fw3VarArr = uo1.Y;
                oz3Var2.getClass();
                return oz3Var2;
            case 17:
                fw3[] fw3VarArr2 = uo1.Y;
                ((qb8) obj).getClass();
                return "...";
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                fi1 fi1Var = (fi1) obj;
                int i3 = bp1.a;
                fi1Var.getClass();
                return fi1Var.i();
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return ((qb8) obj).getType();
            case 20:
                ((js0) obj).getClass();
                return 0;
            case 21:
                return Boolean.TRUE;
            case 22:
                oz3 oz3Var3 = (oz3) obj;
                oz3Var3.getClass();
                return oz3Var3.toString();
            case 23:
                oz3 oz3Var4 = (oz3) obj;
                oz3Var4.getClass();
                return oz3Var4.toString();
            case 24:
                ps4 ps4Var = (ps4) obj;
                Map map = sn3.a;
                ps4Var.getClass();
                qb8 qb8VarE = wo1.E(qn3.b, ps4Var.h().i(s87.t));
                return (qb8VarE == null || (type = qb8VarE.getType()) == null) ? hd2.c(gd2.O, new String[0]) : type;
            case 25:
                ps4 ps4Var2 = (ps4) obj;
                cr crVar = vr3.d;
                ps4Var2.getClass();
                List list = (List) i67.s(ps4Var2.y(vr3.f).q, b54.t[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof eg0) {
                        arrayList.add(obj2);
                    }
                }
                return (eg0) lv0.m0(arrayList);
            case 26:
                Class<?> returnType = ((Method) obj).getReturnType();
                returnType.getClass();
                return p76.b(returnType);
            case 27:
                Class cls3 = (Class) obj;
                cls3.getClass();
                return p76.b(cls3);
            case 28:
                bu5 bu5Var = (bu5) obj;
                e96 e96Var = ou3.m;
                bu5Var.getClass();
                return qo1.e.v(bu5Var) + " | " + og6.b(bu5Var).m();
            default:
                xw2 xw2Var = (xw2) obj;
                e96 e96Var2 = ou3.m;
                xw2Var.getClass();
                return qo1.e.v(xw2Var) + " | " + og6.c(xw2Var).l();
        }
    }
}
