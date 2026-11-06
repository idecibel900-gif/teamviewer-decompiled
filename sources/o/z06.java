package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class z06 implements Configurator, pa0, vc1, ce1, sf0, je3, od7, rl5, ja0, f58, gl8, in2 {
    public final /* synthetic */ byte m;
    public static final z06 n = new z06(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z06 f2659o = new z06(2);
    public static final z06 p = new z06(3);
    public static final z06 q = new z06(4);
    public static final /* synthetic */ z06 r = new z06(6);
    public static final z06 s = new z06(7);
    public static final z06 t = new z06(8);
    public static final j04 u = j04.m;
    public static final ln1 v = new ln1(1.0f, 1.0f);
    public static final z06 w = new z06(9);
    public static final v56 x = new v56(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final /* synthetic */ z06 y = new z06(11);
    public static final /* synthetic */ z06 z = new z06(12);
    public static final /* synthetic */ z06 A = new z06(14);
    public static final z06 B = new z06(15);
    public static final je5 C = new je5();
    public static final z06 D = new z06(17);
    public static final z06 E = new z06(18);
    public static final z06 F = new z06(19);
    public static final z06 G = new z06(20);
    public static final z06 H = new z06(21);
    public static final z06 I = new z06(22);
    public static final z06 J = new z06(23);
    public static final z06 K = new z06(24);
    public static final z06 L = new z06(25);

    public /* synthetic */ z06(byte b) {
        this.m = b;
    }

    public static bx o(List list, ps4 ps4Var, ps5 ps5Var) {
        List listP0 = lv0.P0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listP0.iterator();
        while (it.hasNext()) {
            u51 u51VarP = p(it.next(), null);
            if (u51VarP != null) {
                arrayList.add(u51VarP);
            }
        }
        return ps4Var != null ? new s58(arrayList, ps4Var.h().q(ps5Var)) : new bx(arrayList, new t(ps5Var, (byte) 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [o.ea2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static u51 p(Object obj, qs4 qs4Var) {
        if (obj instanceof Byte) {
            return new bi0(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new gz6(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new el3(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new ng4(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new rn0((Character) obj);
        }
        if (obj instanceof Float) {
            return new r80(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new r80(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new r80((Boolean) obj);
        }
        if (obj instanceof String) {
            return new qb7((String) obj);
        }
        if (obj instanceof byte[]) {
            return o(cx.e1((byte[]) obj), qs4Var, ps5.BYTE);
        }
        boolean z2 = obj instanceof short[];
        ?? K2 = ea2.m;
        int i = 0;
        if (z2) {
            short[] sArr = (short[]) obj;
            int length = sArr.length;
            if (length != 0) {
                if (length != 1) {
                    K2 = new ArrayList(sArr.length);
                    int length2 = sArr.length;
                    while (i < length2) {
                        K2.add(Short.valueOf(sArr[i]));
                        i++;
                    }
                } else {
                    K2 = qf0.K(Short.valueOf(sArr[0]));
                }
            }
            return o(K2, qs4Var, ps5.SHORT);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    K2 = new ArrayList(iArr.length);
                    int length4 = iArr.length;
                    while (i < length4) {
                        K2.add(Integer.valueOf(iArr[i]));
                        i++;
                    }
                } else {
                    K2 = qf0.K(Integer.valueOf(iArr[0]));
                }
            }
            return o(K2, qs4Var, ps5.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length5 = jArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    K2 = new ArrayList(jArr.length);
                    int length6 = jArr.length;
                    while (i < length6) {
                        K2.add(Long.valueOf(jArr[i]));
                        i++;
                    }
                } else {
                    K2 = qf0.K(Long.valueOf(jArr[0]));
                }
            }
            return o(K2, qs4Var, ps5.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length7 = cArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    K2 = new ArrayList(cArr.length);
                    int length8 = cArr.length;
                    while (i < length8) {
                        K2.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                } else {
                    K2 = qf0.K(Character.valueOf(cArr[0]));
                }
            }
            return o(K2, qs4Var, ps5.CHAR);
        }
        if (obj instanceof float[]) {
            return o(cx.f1((float[]) obj), qs4Var, ps5.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length9 = dArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    K2 = new ArrayList(dArr.length);
                    int length10 = dArr.length;
                    while (i < length10) {
                        K2.add(Double.valueOf(dArr[i]));
                        i++;
                    }
                } else {
                    K2 = qf0.K(Double.valueOf(dArr[0]));
                }
            }
            return o(K2, qs4Var, ps5.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new x55(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        int length11 = zArr.length;
        if (length11 != 0) {
            if (length11 != 1) {
                K2 = new ArrayList(zArr.length);
                int length12 = zArr.length;
                while (i < length12) {
                    K2.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
            } else {
                K2 = qf0.K(Boolean.valueOf(zArr[0]));
            }
        }
        return o(K2, qs4Var, ps5.BOOLEAN);
    }

    public static pt3 t(String str) {
        ts3 ts3Var;
        char cCharAt = str.charAt(0);
        ts3[] ts3VarArrValues = ts3.values();
        int length = ts3VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ts3Var = null;
                break;
            }
            ts3Var = ts3VarArrValues[i];
            if (ts3Var.f2139o.charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (ts3Var != null) {
            return new ot3(ts3Var);
        }
        if (cCharAt == 'V') {
            return new ot3(null);
        }
        if (cCharAt == '[') {
            return new mt3(t(str.substring(1)));
        }
        if (cCharAt == 'L') {
            ub7.T(str, ';');
        }
        return new nt3(str.substring(1, str.length() - 1));
    }

    public static s67 u(xi0 xi0Var) {
        while (xi0Var instanceof zi0) {
            zi0 zi0Var = (zi0) xi0Var;
            if (zi0Var.k() != 2) {
                break;
            }
            Collection collectionJ = zi0Var.j();
            collectionJ.getClass();
            xi0Var = (zi0) lv0.G0(collectionJ);
            if (xi0Var == null) {
                return null;
            }
        }
        return xi0Var.c();
    }

    public static String v(pt3 pt3Var) {
        pt3Var.getClass();
        if (pt3Var instanceof mt3) {
            return "[".concat(v(((mt3) pt3Var).i));
        }
        if (pt3Var instanceof ot3) {
            ts3 ts3Var = ((ot3) pt3Var).i;
            return ts3Var != null ? ts3Var.f2139o : "V";
        }
        if (!(pt3Var instanceof nt3)) {
            gk0.s();
            return null;
        }
        return "L" + ((nt3) pt3Var).i + ';';
    }

    @Override // o.je3
    public void a() {
    }

    @Override // o.f58
    public d58 b(o86 o86Var) {
        o86Var.getClass();
        return null;
    }

    @Override // o.gl8
    public cl8 c(Context context, jn1 jn1Var) {
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            return h((Activity) baseContext, jn1Var);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            hk0.g("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new cl8(new Rect(0, 0, point.x, point.y), jn1Var.W(context));
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig) {
        encoderConfig.registerEncoder(rw5.class, yz.a);
        encoderConfig.registerEncoder(ot0.class, uz.a);
        encoderConfig.registerEncoder(mv7.class, a00.a);
        encoderConfig.registerEncoder(oe4.class, xz.a);
        encoderConfig.registerEncoder(le4.class, wz.a);
        encoderConfig.registerEncoder(fz2.class, vz.a);
        encoderConfig.registerEncoder(oa7.class, zz.a);
    }

    @Override // o.sf0
    public long d() {
        return 9205357640488583168L;
    }

    @Override // o.in2
    public float e() {
        return 0.0f;
    }

    @Override // o.in2
    public float f(float f, long j) {
        return 0.0f;
    }

    @Override // o.od7
    public boolean g(Object obj, Object obj2) {
        return false;
    }

    @Override // o.sf0
    public in1 getDensity() {
        return v;
    }

    @Override // o.sf0
    public j04 getLayoutDirection() {
        return u;
    }

    @Override // o.gl8
    public cl8 h(Activity activity, jn1 jn1Var) {
        pa0.a.getClass();
        return new cl8(new ma0(oa0.a().q(activity)), jn1Var.W(activity));
    }

    @Override // o.in2
    public float i(float f, float f2, long j) {
        return 0.0f;
    }

    @Override // o.ja0
    public long j(int i, rr0 rr0Var) {
        String str = ((vs7) rr0Var.e).a.a.n;
        return h57.a(v67.h(i, str), v67.g(i, str));
    }

    @Override // o.od7
    public void k(nd7 nd7Var) {
        nd7Var.clear();
    }

    public void l(Drawable drawable, ux2 ux2Var, int i) {
        ux2Var.Y(257732500);
        int i2 = (ux2Var.h(drawable) ? 4 : 2) | i;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            fs4 fs4VarL = androidx.compose.foundation.layout.b.l(cs4.b, bc1.e);
            boolean zH = ux2Var.h(drawable);
            Object objK = ux2Var.K();
            if (zH || objK == e01.a) {
                objK = new y46((Object) drawable, (byte) 27);
                ux2Var.g0(objK);
            }
            ua0.a(j51.B(fs4VarL, (Function1) objK), ux2Var, 0);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new l64((byte) 28, i, this, drawable);
        }
    }

    public boolean m(fi1 fi1Var, fi1 fi1Var2, boolean z2) {
        if ((fi1Var instanceof ns4) && (fi1Var2 instanceof ns4)) {
            return im3.n(((ns4) fi1Var).q(), ((ns4) fi1Var2).q());
        }
        if ((fi1Var instanceof d58) && (fi1Var2 instanceof d58)) {
            return n((d58) fi1Var, (d58) fi1Var2, z2, u.p);
        }
        if (!(fi1Var instanceof xi0) || !(fi1Var2 instanceof xi0)) {
            return ((fi1Var instanceof ad5) && (fi1Var2 instanceof ad5)) ? im3.n(((bd5) ((ad5) fi1Var)).q, ((bd5) ((ad5) fi1Var2)).q) : im3.n(fi1Var, fi1Var2);
        }
        xi0 xi0Var = (xi0) fi1Var;
        xi0 xi0Var2 = (xi0) fi1Var2;
        if (!xi0Var.equals(xi0Var2)) {
            if (im3.n(xi0Var.getName(), xi0Var2.getName()) && ((!(xi0Var instanceof qo4) || !(xi0Var2 instanceof qo4) || ((qo4) xi0Var).A() == ((qo4) xi0Var2).A()) && ((!im3.n(xi0Var.i(), xi0Var2.i()) || (z2 && im3.n(u(xi0Var), u(xi0Var2)))) && !zo1.o(xi0Var) && !zo1.o(xi0Var2)))) {
                fi1 fi1VarI = xi0Var.i();
                fi1 fi1VarI2 = xi0Var2.i();
                if (((fi1VarI instanceof zi0) || (fi1VarI2 instanceof zi0)) ? false : m(fi1VarI, fi1VarI2, z2)) {
                    hc5 hc5Var = new hc5(new io.sentry.android.core.n1((byte) 2, xi0Var, xi0Var2, z2));
                    if (hc5Var.m(xi0Var, xi0Var2, null, true).b() != 1 || hc5Var.m(xi0Var2, xi0Var, null, true).b() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean n(d58 d58Var, d58 d58Var2, boolean z2, hw2 hw2Var) {
        if (d58Var.equals(d58Var2)) {
            return true;
        }
        if (im3.n(d58Var.i(), d58Var2.i())) {
            return false;
        }
        fi1 fi1VarI = d58Var.i();
        fi1 fi1VarI2 = d58Var2.i();
        return (((fi1VarI instanceof zi0) || (fi1VarI2 instanceof zi0)) ? ((Boolean) hw2Var.invoke(fi1VarI, fi1VarI2)).booleanValue() : m(fi1VarI, fi1VarI2, z2)) && d58Var.getIndex() == d58Var2.getIndex();
    }

    @Override // o.je3
    public void onSuccess() {
    }

    @Override // o.pa0
    public Rect q(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            objInvoke.getClass();
            return new Rect((Rect) objInvoke);
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            pa0.a.getClass();
            io.sentry.android.core.v0.k(oa0.b, e);
            return xz2.E.q(activity);
        }
    }

    @Override // o.in2
    public long r(float f) {
        return 0L;
    }

    @Override // o.in2
    public float s(float f, float f2) {
        return 0.0f;
    }

    @Override // o.rl5
    public boolean t0(ns4 ns4Var, dq1 dq1Var) {
        ns4Var.getClass();
        return !dq1Var.getAnnotations().o0(sl5.a);
    }

    public String toString() {
        switch (this.m) {
            case 27:
                return "AdaptStrategy[Hide]";
            default:
                return super.toString();
        }
    }

    @Override // o.vc1
    public Object w(Object obj) {
        switch (this.m) {
            case 4:
                ((nc6) obj).close();
                return null;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return Byte.valueOf(((nc6) obj).u());
            default:
                return Long.valueOf(((nc6) obj).u());
        }
    }
}
