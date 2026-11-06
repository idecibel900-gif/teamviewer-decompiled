package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.window.BackEvent;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.io.EOFException;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class lv1 {
    public static Boolean m;
    public static Boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Boolean f1409o;
    public static Boolean p;
    public static int q;
    public static int r;

    public static final void A(int i, String str, ux2 ux2Var, fs4 fs4Var) {
        fs4 fs4Var2;
        str.getClass();
        ux2Var.Y(2105621550);
        int i2 = (ux2Var.f(str) ? 4 : 2) | i | 48;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = ka0.C(cs4Var, 16.0f, 8.0f);
            h72 h72Var = un4.a;
            qs7.b(str, fs4VarC, ((rn4) ux2Var.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var.j(h72Var)).b.i, ux2Var, i2 & 14, 24960, 110584);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gx0(str, fs4Var2, i, (byte) 7);
        }
    }

    public static final void B(final fs4 fs4Var, float f, final long j, ux2 ux2Var, final int i) {
        int i2;
        ux2Var.Y(-1534852205);
        if ((i & 6) == 0) {
            i2 = i | (ux2Var.f(fs4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48 | (ux2Var.e(j) ? 256 : 128);
        byte b = 1;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                f = z22.a;
            } else {
                ux2Var.Q();
            }
            ux2Var.q();
            fs4 fs4VarP = androidx.compose.foundation.layout.b.p(fs4Var.f(androidx.compose.foundation.layout.b.b), f);
            boolean z = (((i3 & 896) ^ 384) > 256 && ux2Var.e(j)) || (i3 & 384) == 256;
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new a32(f, j, b);
                ux2Var.g0(objK);
            }
            vn4.K(0, (Function1) objK, ux2Var, fs4VarP);
        } else {
            ux2Var.Q();
        }
        final float f2 = f;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.c32
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lv1.B(fs4Var, f2, j, (ux2) obj, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }

    public static void C(ArrayList arrayList, String str, int i) {
        Context context;
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str);
        if (externalStoragePublicDirectory.exists()) {
            nk7 nk7Var = new nk7(externalStoragePublicDirectory);
            synchronized (jk0.s) {
                context = jk0.t;
            }
            context.getClass();
            String string = context.getString(i);
            string.getClass();
            nk7Var.m = string;
            nk7Var.n = lk7.m;
            arrayList.add(nk7Var);
        }
    }

    public static go2 D(go2 go2Var, int i) {
        df0 df0Var;
        if (i < 0 && i != -2 && i != -1) {
            gk0.h(fx3.e(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            df0Var = df0.n;
        } else {
            df0Var = df0.m;
        }
        return go2Var instanceof nx2 ? nx2.d((nx2) go2Var, null, i, df0Var, 1) : new bn0(go2Var, ba2.m, i, df0Var);
    }

    public static zu6 E(zu6 zu6Var) {
        im4 im4Var = zu6Var.m;
        im4Var.b();
        return im4Var.u > 0 ? zu6Var : zu6.n;
    }

    public static final int F(rg4 rg4Var, ie ieVar) {
        rg4 rg4VarV0 = rg4Var.v0();
        if (rg4VarV0 == null) {
            ki3.c("Child of " + rg4Var + " cannot be null when calculating alignment line");
        }
        if (rg4Var.F0().c().containsKey(ieVar)) {
            Integer num = (Integer) rg4Var.F0().c().get(ieVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iW = rg4VarV0.W(ieVar);
            if (iW != Integer.MIN_VALUE) {
                boolean z = rg4Var.z;
                boolean z2 = rg4Var.A;
                rg4VarV0.z = true;
                rg4Var.A = true;
                rg4Var.N0();
                rg4VarV0.z = z;
                rg4Var.A = z2;
                return iW + ((int) (ieVar instanceof b63 ? rg4VarV0.J0() & 4294967295L : rg4VarV0.J0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final x87 G(ns4 ns4Var, ns4 ns4Var2) {
        ns4Var.getClass();
        ns4Var2.getClass();
        ns4Var.k0().size();
        ns4Var2.k0().size();
        List listK0 = ns4Var.k0();
        listK0.getClass();
        ArrayList arrayList = new ArrayList(mv0.Z(listK0, 10));
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            arrayList.add(((d58) it.next()).q());
        }
        List listK1 = ns4Var2.k0();
        listK1.getClass();
        ArrayList arrayList2 = new ArrayList(mv0.Z(listK1, 10));
        Iterator it2 = listK1.iterator();
        while (it2.hasNext()) {
            g07 g07VarW = ((d58) it2.next()).W();
            g07VarW.getClass();
            arrayList2.add(new w87(g07VarW));
        }
        return new x87(xm4.U(lv0.V0(arrayList, arrayList2)), (byte) 1);
    }

    public static oe8 H(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (oe8) objNewInstance;
            } catch (IllegalAccessException e) {
                an4.m("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                an4.m("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            an4.m("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static final Activity I(Context context) {
        context.getClass();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        hk0.l("Permissions should be called in the context of an Activity");
        return null;
    }

    public static bp4 J(vt1 vt1Var) {
        if (vt1Var instanceof os3) {
            os3 os3Var = (os3) vt1Var;
            String str = os3Var.e;
            String str2 = os3Var.f;
            str.getClass();
            str2.getClass();
            return new bp4(str.concat(str2));
        }
        if (!(vt1Var instanceof ns3)) {
            gk0.s();
            return null;
        }
        ns3 ns3Var = (ns3) vt1Var;
        String str3 = ns3Var.e;
        String str4 = ns3Var.f;
        str3.getClass();
        str4.getClass();
        return new bp4(str3 + '#' + str4);
    }

    public static final String K(j74 j74Var) {
        j74Var.getClass();
        List list = j74Var.f;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            fb5 fb5Var = j74Var.g;
            return fb5Var != null ? fb5Var.a : "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((sq1) it.next()).a;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return lv0.t0(arrayList, ", ", null, null, null, 62);
    }

    public static final o22 L(ke3 ke3Var, em1 em1Var) {
        vn7 vn7Var = ke3Var.c;
        if (!(vn7Var instanceof yy2)) {
            return new nx3((Object) em1Var, (byte) 29);
        }
        if8 if8VarI = h67.i(((yy2) vn7Var).getView());
        synchronized (if8VarI) {
            io.sentry.android.core.util.a aVar = if8VarI.n;
            if (aVar != null) {
                Bitmap.Config[] configArr = ya8.a;
                if (im3.n(Looper.myLooper(), Looper.getMainLooper()) && if8VarI.q) {
                    if8VarI.q = false;
                    aVar.n = em1Var;
                    return aVar;
                }
            }
            n87 n87Var = if8VarI.f1057o;
            if (n87Var != null) {
                n87Var.j(null);
            }
            if8VarI.f1057o = null;
            io.sentry.android.core.util.a aVar2 = new io.sentry.android.core.util.a(if8VarI.m, em1Var);
            if8VarI.n = aVar2;
            return aVar2;
        }
    }

    public static Set M() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final Bundle N(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        hk0.g(fx3.g("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static final ul7 O(h37 h37Var, Function0 function0, Resources resources) {
        String string;
        vd5 vd5Var;
        h37Var.getClass();
        resources.getClass();
        nv1 nv1Var = h37Var.a;
        if (nv1Var instanceof j37) {
            j37 j37Var = (j37) nv1Var;
            string = resources.getString(j37Var.e, j37Var.f);
            string.getClass();
        } else {
            if (!(nv1Var instanceof i37)) {
                gk0.s();
                return null;
            }
            string = ((i37) nv1Var).e;
        }
        String str = string;
        int iOrdinal = h37Var.b.ordinal();
        g37 g37Var = g37.m;
        if (iOrdinal != 1) {
            vd5Var = iOrdinal != 2 ? new vd5(sl7.n, g37Var) : new vd5(sl7.f2030o, g37.n);
        } else {
            vd5Var = new vd5(sl7.m, g37Var);
        }
        return new ul7((sl7) vd5Var.m, str, (g37) vd5Var.n, resources.getString(R.string.dismiss), null, function0, 136);
    }

    public static final boolean P(bf0 bf0Var) {
        bf0Var.getClass();
        try {
            w36 w36VarPeek = bf0Var.peek();
            for (long j = 0; j < 16 && !w36VarPeek.e(); j++) {
                w36VarPeek.k0(1L);
                bf0 bf0Var2 = w36VarPeek.n;
                byte bF = bf0Var2.F(0L);
                if ((bF & 224) == 192) {
                    w36VarPeek.k0(2L);
                } else if ((bF & 240) == 224) {
                    w36VarPeek.k0(3L);
                } else if ((bF & 248) == 240) {
                    w36VarPeek.k0(4L);
                }
                int iO0 = bf0Var2.O0();
                if (Character.isISOControl(iO0) && !Character.isWhitespace(iO0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean Q(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (m == null) {
            m = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        Boolean boolValueOf = n;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            n = boolValueOf;
        }
        return boolValueOf.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static final ud5 T(int i, ux2 ux2Var, int i2) {
        TypedValue typedValue;
        boolean z;
        Context context = (Context) ux2Var.j(lh.b);
        Resources resources = (Resources) ux2Var.j(lh.c);
        yb6 yb6Var = (yb6) ux2Var.j(lh.e);
        synchronized (yb6Var) {
            typedValue = (TypedValue) yb6Var.a.b(i);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                kw4 kw4Var = yb6Var.a;
                int iD = kw4Var.d(i);
                Object[] objArr = kw4Var.c;
                Object obj = objArr[iD];
                kw4Var.b[iD] = i;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !ub7.U(charSequence, ".xml")) {
            ux2Var.W(-1771643000);
            Object theme = context.getTheme();
            boolean zF = ux2Var.f(charSequence);
            if ((((i2 & 14) ^ 6) <= 4 || !ux2Var.d(i)) && (i2 & 6) != 4) {
                z = false;
            }
            boolean zF2 = zF | z | ux2Var.f(theme);
            Object objK = ux2Var.K();
            if (zF2 || objK == e01.a) {
                try {
                    Drawable drawable = resources.getDrawable(i, null);
                    drawable.getClass();
                    objK = new vi(((BitmapDrawable) drawable).getBitmap());
                    ux2Var.g0(objK);
                } catch (Exception e) {
                    throw new ec6("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            BitmapPainter bitmapPainter = new BitmapPainter((vi) objK);
            ux2Var.p(false);
            return bitmapPainter;
        }
        ux2Var.W(-1771798434);
        Resources.Theme theme2 = context.getTheme();
        int i3 = typedValue.changingConfigurations;
        ze3 ze3Var = (ze3) ux2Var.j(lh.d);
        ye3 ye3Var = new ye3(theme2, i);
        WeakReference weakReference = (WeakReference) ze3Var.a.get(ye3Var);
        xe3 xe3VarK = weakReference != null ? (xe3) weakReference.get() : null;
        if (xe3VarK == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!im3.n(xml.getName(), "vector")) {
                hk0.g("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            xe3VarK = b77.k(theme2, resources, xml, i3);
            ze3Var.a.put(ye3Var, new WeakReference(xe3VarK));
        }
        VectorPainter vectorPainterT = x67.t(xe3VarK.a, ux2Var);
        ux2Var.p(false);
        return vectorPainterT;
    }

    public static final l76 U(Object obj, ux2 ux2Var) {
        Object objK = ux2Var.K();
        Object obj2 = objK;
        if (objK == e01.a) {
            l76 l76Var = new l76();
            l76Var.a = obj;
            ux2Var.g0(l76Var);
            obj2 = l76Var;
        }
        return (l76) obj2;
    }

    public static Set V(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static final m05 W(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new m05(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final Object X(Function1 function1, jc1 jc1Var) {
        if (jc1Var.getContext().l0(z06.y) == null) {
            return qs1.O(jc1Var.getContext()).a(function1, jc1Var);
        }
        io.sentry.h2.f();
        return null;
    }

    public static final void e(boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fs4 fs4Var, ux2 ux2Var, int i) {
        boolean z2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-433141784);
        int i2 = i | (ux2Var2.g(z) ? 4 : 2) | (ux2Var2.h(function0) ? 32 : 16) | (ux2Var2.h(function1) ? 256 : 128) | (ux2Var2.h(function2) ? 2048 : 1024) | (ux2Var2.h(function3) ? 16384 : 8192) | (ux2Var2.f(fs4Var) ? 131072 : 65536);
        if (ux2Var2.N(i2 & 1, (74899 & i2) != 74898)) {
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(fs4Var, "TVTA-groupBottomSheet-addOptions");
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            String strZ = m77.z(R.string.group_bottomSheet_title, ux2Var2);
            ot7 ot7Var = ((rn4) ux2Var2.j(un4.a)).b.g;
            cs4 cs4Var = cs4.b;
            qs7.b(strZ, androidx.compose.ui.platform.a.a(ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), "TVTA-groupBottomSheet-addOptions-title"), 0L, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ot7Var, ux2Var, 48, 0, 130044);
            k(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0.0f, 0L, ux2Var, 6, 6);
            ux2Var2 = ux2Var;
            fs4 fs4VarJ = iq8.j(cs4Var, sf6.a(8.0f));
            sk7 sk7Var = new sk7(y57.g(R.string.group_bottomSheet_remote_device), null, new yk7(R.drawable.ic_desktop_add), null, 10);
            boolean z3 = (i2 & 112) == 32;
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (z3 || objK == awVar) {
                objK = new yv1(function0, (byte) 9);
                ux2Var2.g0(objK);
            }
            x37.e(sk7Var, fs4VarJ, null, (Function0) objK, "TVTA-groupBottomSheet-remoteDevice", ux2Var2, 24576, 36);
            if (z) {
                ux2Var2.W(-519346972);
                fs4 fs4VarJ2 = iq8.j(cs4Var, sf6.a(8.0f));
                sk7 sk7Var2 = new sk7(y57.g(R.string.group_bottomSheet_group), null, new yk7(R.drawable.ic_folder_add), null, 10);
                boolean z4 = ((57344 & i2) == 16384) | ((i2 & 896) == 256);
                Object objK2 = ux2Var2.K();
                if (z4 || objK2 == awVar) {
                    objK2 = new sv1(function1, function3, (byte) 3);
                    ux2Var2.g0(objK2);
                }
                x37.e(sk7Var2, fs4VarJ2, null, (Function0) objK2, "TVTA-groupBottomSheet-group", ux2Var2, 24576, 36);
                z2 = false;
                ux2Var2.p(false);
            } else {
                z2 = false;
                ux2Var2.W(-518741232);
                ux2Var2.p(false);
            }
            fs4 fs4VarJ3 = iq8.j(cs4Var, sf6.a(8.0f));
            sk7 sk7Var3 = new sk7(y57.g(R.string.group_bottomSheet_contact), null, new yk7(R.drawable.ic_add_contact), null, 10);
            if ((i2 & 7168) == 2048) {
                z2 = true;
            }
            Object objK3 = ux2Var2.K();
            if (z2 || objK3 == awVar) {
                objK3 = new yv1(function2, (byte) 8);
                ux2Var2.g0(objK3);
            }
            x37.e(sk7Var3, fs4VarJ3, null, (Function0) objK3, "TVTA-groupBottomSheet-contact", ux2Var2, 24576, 36);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new a5(z, function0, function1, function2, function3, fs4Var, i);
        }
    }

    public static final void f(final kp5 kp5Var, Function0 function0, Function0 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        Function0 function2;
        Function0 function3;
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(773890748);
        int i2 = i | (ux2Var2.h(kp5Var) ? 4 : 2) | (ux2Var2.h(function0) ? 32 : 16) | (ux2Var2.h(function1) ? 256 : 128) | 3072;
        if (ux2Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarF = ka0.F(cs4Var, 16.0f, 0.0f, 16.0f, 16.0f, 2);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarF);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            String strZ = m77.z(kp5Var.m, ux2Var2);
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            h72 h72Var = un4.a;
            qs7.b(strZ, fs4VarC, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.g, ux2Var, 48, 0, 130040);
            b77.a(ux2Var, androidx.compose.foundation.layout.b.d(cs4Var, 16.0f));
            k(null, 0.0f, 0L, ux2Var, 0, 7);
            b77.a(ux2Var, androidx.compose.foundation.layout.b.d(cs4Var, 16.0f));
            qs7.b(m77.z(kp5Var.n, ux2Var), null, ((rn4) ux2Var.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.k, ux2Var, 0, 0, 131066);
            b77.a(ux2Var, androidx.compose.foundation.layout.b.d(cs4Var, 16.0f));
            boolean z = (i2 & 112) == 32;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z || objK == awVar) {
                function2 = function0;
                objK = new yv1(function2, (byte) 17);
                ux2Var.g0(objK);
            } else {
                function2 = function0;
            }
            final byte b = 1;
            m77.g((Function0) objK, androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 46.0f), null, false, null, null, au8.O(751079095, new iw2() { // from class: o.lp5
                @Override // o.iw2
                public final Object d(Object obj, Object obj2, Object obj3) {
                    byte b2 = b;
                    f88 f88Var = f88.a;
                    kp5 kp5Var2 = kp5Var;
                    switch (b2) {
                        case 0:
                            ux2 ux2Var3 = (ux2) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((eg6) obj).getClass();
                            if (!ux2Var3.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                                ux2Var3.Q();
                            } else {
                                qs7.b(m77.z(kp5Var2.p.intValue(), ux2Var3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(un4.a)).b.m, ux2Var3, 0, 0, 131070);
                            }
                            break;
                        default:
                            ux2 ux2Var4 = (ux2) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((eg6) obj).getClass();
                            if (!ux2Var4.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                ux2Var4.Q();
                            } else {
                                qs7.b(m77.z(kp5Var2.f1290o, ux2Var4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var4.j(un4.a)).b.m, ux2Var4, 0, 0, 131070);
                            }
                            break;
                    }
                    return f88Var;
                }
            }, ux2Var), ux2Var, 1572912, 60);
            ux2Var2 = ux2Var;
            if (kp5Var.p != null) {
                ux2Var2.W(1545425971);
                b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var, 10.0f));
                boolean z2 = (i2 & 896) == 256;
                Object objK2 = ux2Var2.K();
                if (z2 || objK2 == awVar) {
                    function3 = function1;
                    objK2 = new yv1(function3, (byte) 18);
                    ux2Var2.g0(objK2);
                } else {
                    function3 = function1;
                }
                final byte b2 = 0;
                v67.d((Function0) objK2, androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 46.0f), null, false, null, au8.O(470274992, new iw2() { // from class: o.lp5
                    @Override // o.iw2
                    public final Object d(Object obj, Object obj2, Object obj3) {
                        byte b3 = b2;
                        f88 f88Var = f88.a;
                        kp5 kp5Var2 = kp5Var;
                        switch (b3) {
                            case 0:
                                ux2 ux2Var3 = (ux2) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((eg6) obj).getClass();
                                if (!ux2Var3.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ux2Var3.Q();
                                } else {
                                    qs7.b(m77.z(kp5Var2.p.intValue(), ux2Var3), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(un4.a)).b.m, ux2Var3, 0, 0, 131070);
                                }
                                break;
                            default:
                                ux2 ux2Var4 = (ux2) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                ((eg6) obj).getClass();
                                if (!ux2Var4.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    ux2Var4.Q();
                                } else {
                                    qs7.b(m77.z(kp5Var2.f1290o, ux2Var4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var4.j(un4.a)).b.m, ux2Var4, 0, 0, 131070);
                                }
                                break;
                        }
                        return f88Var;
                    }
                }, ux2Var2), ux2Var2, 196656, 28);
                ux2Var2.p(false);
            } else {
                function3 = function1;
                ux2Var2.W(1545865148);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            function2 = function0;
            function3 = function1;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) kp5Var, (Object) function2, (Object) function3, (Object) fs4Var2, i, (byte) 13);
        }
    }

    public static final void i(boolean z, l33 l33Var, ArrayList arrayList, List list, Function0 function0, Function0 function1, Function1 function2, fs4 fs4Var, xy6 xy6Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        xy6 xy6Var2;
        fs4 fs4Var3;
        int i2;
        xy6 xy6Var3;
        list.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        ux2Var.Y(1286315064);
        int i3 = i | (ux2Var.g(z) ? 4 : 2) | (ux2Var.h(l33Var) ? 32 : 16) | (ux2Var.f(arrayList) ? 256 : 128) | (ux2Var.f(list) ? 2048 : 1024) | (ux2Var.h(function0) ? 16384 : 8192) | (ux2Var.h(function1) ? 131072 : 65536) | (ux2Var.h(function2) ? 1048576 : 524288) | 46137344;
        if (ux2Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                xy6 xy6VarR = yo1.R(null, ux2Var, 6, 2);
                fs4Var3 = cs4.b;
                i2 = i3 & (-234881025);
                xy6Var3 = xy6VarR;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var;
                i2 = i3 & (-234881025);
                xy6Var3 = xy6Var;
            }
            ux2Var.q();
            Object[] objArr = new Object[0];
            Object objK = ux2Var.K();
            byte b = 14;
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new uf2(b);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) objK, ux2Var, 48);
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = new ji2((byte) 17);
                ux2Var.g0(objK2);
            }
            fs4 fs4Var4 = fs4Var3;
            xy6 xy6Var4 = xy6Var3;
            yo1.k(function1, cp6.a(fs4Var3, false, (Function1) objK2), xy6Var4, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-1420893414, new sw1(arrayList, list, function0, function1, function2, l33Var, fs4Var4, px4Var, z), ux2Var), ux2Var, (i2 >> 15) & 14, 3072, 8184);
            xy6Var2 = xy6Var4;
            fs4Var2 = fs4Var4;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new be7(z, l33Var, arrayList, list, function0, function1, function2, fs4Var2, xy6Var2, i);
        }
    }

    public static final void k(fs4 fs4Var, float f, long j, ux2 ux2Var, final int i, final int i2) {
        fs4 fs4Var2;
        int i3;
        final float f2;
        final fs4 fs4Var3;
        fs4 fs4Var4;
        float f3;
        ux2Var.Y(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            fs4Var2 = fs4Var;
        } else if ((i & 6) == 0) {
            fs4Var2 = fs4Var;
            i3 = i | (ux2Var.f(fs4Var2) ? 4 : 2);
        } else {
            fs4Var2 = fs4Var;
            i3 = i;
        }
        long jC = j;
        int i5 = i3 | 48 | (((i2 & 4) == 0 && ux2Var.e(jC)) ? 256 : 128);
        byte b = 0;
        boolean z = true;
        if (ux2Var.N(i5 & 1, (i5 & 147) != 146)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                fs4Var4 = i4 != 0 ? cs4.b : fs4Var2;
                f3 = z22.a;
                if ((i2 & 4) != 0) {
                    jC = bw0.c(qf0.i, ux2Var);
                    i5 &= -897;
                }
            } else {
                ux2Var.Q();
                if ((i2 & 4) != 0) {
                    i5 &= -897;
                }
                fs4Var4 = fs4Var2;
                f3 = f;
            }
            ux2Var.q();
            fs4 fs4VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(fs4Var4, 1.0f), f3);
            if ((((i5 & 896) ^ 384) <= 256 || !ux2Var.e(jC)) && (i5 & 384) != 256) {
                z = false;
            }
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new a32(f3, jC, b);
                ux2Var.g0(objK);
            }
            vn4.K(0, (Function1) objK, ux2Var, fs4VarD);
            fs4Var3 = fs4Var4;
            f2 = f3;
        } else {
            ux2Var.Q();
            f2 = f;
            fs4Var3 = fs4Var2;
        }
        final long j2 = jC;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.b32
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lv1.k(fs4Var3, f2, j2, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final void l(boolean z, boolean z2, Function0 function0, fs4 fs4Var, hb3 hb3Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        hb3 hb3Var2;
        int i2;
        fs4 fs4Var3;
        hb3 hb3Var3;
        List listK;
        ux2 ux2Var2 = ux2Var;
        function0.getClass();
        ux2Var2.Y(933446323);
        boolean z3 = z;
        Object obj = function0;
        int i3 = i | (ux2Var2.g(z3) ? 4 : 2) | (ux2Var2.g(z2) ? 32 : 16) | (ux2Var2.h(obj) ? 256 : 128) | (ux2Var2.d(R.raw.lottie_animation_onboarding_tv) ? 2048 : 1024) | 90112;
        if (ux2Var2.N(i3 & 1, (599187 & i3) != 599186)) {
            ux2Var2.S();
            byte b = 6;
            if ((i & 1) == 0 || ux2Var2.x()) {
                yt2 yt2Var = nv1.b;
                if (yt2Var == null) {
                    im3.e0("factory");
                    throw null;
                }
                og1 og1Var = new og1((byte) 1);
                fj3 fj3Var = new fj3(yt2Var, b);
                x86 x86Var = w86.a;
                og1Var.a(x86Var.b(z64.class), fj3Var);
                fi3 fi3VarC = og1Var.c();
                we8 we8VarA = id4.a(ux2Var2);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                hb3 hb3Var4 = (hb3) g57.t(x86Var.b(z64.class), we8VarA, null, fi3VarC, h57.k(we8VarA), ux2Var2);
                i2 = i3 & (-458753);
                fs4Var3 = cs4.b;
                hb3Var3 = hb3Var4;
            } else {
                ux2Var2.Q();
                hb3Var3 = hb3Var;
                i2 = i3 & (-458753);
                fs4Var3 = fs4Var;
            }
            ux2Var2.q();
            z64 z64Var = (z64) hb3Var3;
            l97 l97Var = z64Var.p;
            while (true) {
                Object value = l97Var.getValue();
                v64 v64Var = (v64) value;
                boolean zV0 = z64Var.V0();
                x64 x64Var = x64.m;
                if (zV0) {
                    listK = qf0.L(x64Var, x64.f2484o, x64.n, x64.p);
                } else {
                    listK = qf0.K(x64Var);
                }
                if (l97Var.j(value, v64.a(v64Var, false, false, false, false, listK, 15))) {
                    break;
                }
                z3 = z;
                obj = function0;
                b = b;
            }
            t36 t36Var = ((z64) hb3Var3).q;
            boolean z4 = z3;
            hb3 hb3Var5 = hb3Var3;
            yy0 yy0VarO = au8.O(-545444874, new na((Object) hb3Var3, obj, z4, (Object) g57.f(t36Var, t36Var.getValue(), ux2Var2, 0, 0), (byte) 1), ux2Var2);
            aw awVar = e01.a;
            if (z2) {
                ux2Var2.W(-1612781988);
                Object objK = ux2Var2.K();
                if (objK == awVar) {
                    objK = new ek3((byte) 12);
                    ux2Var2.g0(objK);
                }
                u47.b(yy0VarO, z, cp6.a(fs4Var3, false, (Function1) objK), new vk7(14), ux2Var2, (14 & (i2 >> 9)) | 48 | ((i2 << 6) & 896) | 32768);
                ux2Var2 = ux2Var2;
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-1612455651);
                Object objK2 = ux2Var2.K();
                if (objK2 == awVar) {
                    ux2Var2 = ux2Var2;
                    objK2 = new ek3((byte) 13);
                    ux2Var2.g0(objK2);
                }
                ux2Var2 = ux2Var2;
                f57.c(z, yy0VarO, cp6.a(fs4Var3, false, (Function1) objK2), new vk7(14), null, ux2Var2, (i2 & 14) | 384 | ((i2 >> 6) & 112) | 32768);
                ux2Var2.p(false);
            }
            fs4Var2 = fs4Var3;
            hb3Var2 = hb3Var5;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
            hb3Var2 = hb3Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new kb(z, z2, function0, fs4Var2, hb3Var2, i);
        }
    }

    public static final void q(final Function0 function0, a06 a06Var, Function1 function1, Function0 function2, fs4 fs4Var, l85 l85Var, ux2 ux2Var, int i) {
        l85 l85Var2;
        int i2;
        final l85 l85Var3;
        final l85 l85Var4;
        boolean z;
        l85 l85Var5;
        ux2 ux2Var2 = ux2Var;
        function0.getClass();
        a06Var.getClass();
        function1.getClass();
        function2.getClass();
        ux2Var2.Y(-1789101227);
        int i3 = i | (ux2Var2.h(function0) ? 4 : 2) | (ux2Var2.f(a06Var) ? 32 : 16) | (ux2Var2.h(function1) ? 256 : 128) | (ux2Var2.f(fs4Var) ? 16384 : 8192) | 65536;
        byte b = 1;
        final byte b2 = 0;
        if (ux2Var2.N(i3 & 1, (74899 & i3) != 74898)) {
            ux2Var2.S();
            if ((i & 1) == 0 || ux2Var2.x()) {
                dl5 dl5Var = new dl5(new ti4((byte) 22), b);
                we8 we8VarA = id4.a(ux2Var2);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i3 & (-458753);
                    l85Var3 = (l85) g57.t(w86.a.b(l85.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var2);
                }
            } else {
                ux2Var2.Q();
                i2 = i3 & (-458753);
                l85Var3 = l85Var;
            }
            ux2Var2.q();
            Context context = (Context) ux2Var2.j(lh.b);
            Resources resources = (Resources) ux2Var2.j(lh.c);
            px4 px4VarG = g57.g(a06Var.f, ux2Var2);
            t36 t36Var = l85Var3.p;
            px4 px4VarF = g57.f(t36Var, t36Var.getValue(), ux2Var2, 0, 0);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var2);
                ux2Var2.g0(objK);
            }
            final me1 me1Var = (me1) objK;
            px4 px4VarT = h57.t(function1, ux2Var2);
            px4 px4VarT2 = h57.t(function2, ux2Var2);
            int i4 = i2 & 14;
            boolean zH = ux2Var2.h(l85Var3) | (i4 == 4);
            Object objK2 = ux2Var2.K();
            if (zH || objK2 == awVar) {
                objK2 = new Function0() { // from class: o.g85
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b3 = b2;
                        f88 f88Var = f88.a;
                        Function0 function3 = function0;
                        l85 l85Var6 = l85Var3;
                        switch (b3) {
                            case 0:
                                SharedPreferences.Editor editorEdit = l85Var6.n.edit();
                                editorEdit.getClass();
                                editorEdit.putBoolean("LOGIN_ON_STARTUP", false);
                                editorEdit.apply();
                                function3.a();
                                break;
                            default:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(r75.OnSkipLoginClicked);
                                SharedPreferences.Editor editorEdit2 = l85Var6.n.edit();
                                editorEdit2.getClass();
                                editorEdit2.putBoolean("LOGIN_ON_STARTUP", false);
                                editorEdit2.apply();
                                ye4.a("OnBoardingScreen", "Login result: LOGIN_SKIPPED");
                                function3.a();
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK2);
            }
            Function0 function3 = (Function0) objK2;
            boolean zH2 = ux2Var2.h(me1Var) | ux2Var2.h(l85Var3);
            Object objK3 = ux2Var2.K();
            if (zH2 || objK3 == awVar) {
                objK3 = new Function1() { // from class: o.h85
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        f88 f88Var = f88.a;
                        hc1 hc1Var = null;
                        l85 l85Var6 = l85Var3;
                        me1 me1Var2 = me1Var;
                        switch (b3) {
                            case 0:
                                vh3 vh3Var = (vh3) obj;
                                vh3Var.getClass();
                                im3.R(me1Var2, null, null, new i9(l85Var6, vh3Var, hc1Var, (byte) 19), 3);
                                break;
                            default:
                                h37 h37Var = (h37) obj;
                                h37Var.getClass();
                                im3.R(me1Var2, null, null, new vt4(l85Var6, h37Var, hc1Var, (byte) 6), 3);
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK3);
            }
            Function1 function4 = (Function1) objK3;
            boolean zH3 = ux2Var2.h(me1Var) | ux2Var2.h(l85Var3);
            Object objK4 = ux2Var2.K();
            if (zH3 || objK4 == awVar) {
                final byte b3 = 1;
                objK4 = new Function1() { // from class: o.h85
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b3;
                        f88 f88Var = f88.a;
                        hc1 hc1Var = null;
                        l85 l85Var6 = l85Var3;
                        me1 me1Var2 = me1Var;
                        switch (b4) {
                            case 0:
                                vh3 vh3Var = (vh3) obj;
                                vh3Var.getClass();
                                im3.R(me1Var2, null, null, new i9(l85Var6, vh3Var, hc1Var, (byte) 19), 3);
                                break;
                            default:
                                h37 h37Var = (h37) obj;
                                h37Var.getClass();
                                im3.R(me1Var2, null, null, new vt4(l85Var6, h37Var, hc1Var, (byte) 6), 3);
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK4);
            }
            wh8 wh8VarC = r47.C(context, function3, function4, (Function1) objK4, ux2Var, 24576);
            ux2Var2 = ux2Var;
            boolean zH4 = ux2Var2.h(me1Var) | ux2Var2.h(l85Var3) | ux2Var2.f(px4VarT) | ux2Var2.f(px4VarT2) | ux2Var2.h(resources);
            Object objK5 = ux2Var2.K();
            if (zH4 || objK5 == awVar) {
                l85 l85Var6 = l85Var3;
                t5 t5Var = new t5(me1Var, l85Var6, resources, px4VarT, px4VarT2, null, (byte) 3);
                l85Var4 = l85Var6;
                ux2Var2.g0(t5Var);
                objK5 = t5Var;
            } else {
                l85Var4 = l85Var3;
            }
            ck3.i(f88.a, (hw2) objK5, ux2Var2);
            boolean zH5 = ux2Var2.h(wh8VarC);
            Object objK6 = ux2Var2.K();
            if (zH5 || objK6 == awVar) {
                objK6 = new i85(wh8VarC, (byte) 0);
                ux2Var2.g0(objK6);
            }
            Function0 function5 = (Function0) objK6;
            boolean zH6 = ux2Var2.h(wh8VarC);
            Object objK7 = ux2Var2.K();
            if (zH6 || objK7 == awVar) {
                objK7 = new i85(wh8VarC, (byte) 1);
                ux2Var2.g0(objK7);
            }
            Function0 function6 = (Function0) objK7;
            boolean zH7 = (i4 == 4) | ux2Var2.h(l85Var4);
            Object objK8 = ux2Var2.K();
            if (zH7 || objK8 == awVar) {
                final byte b4 = 1;
                objK8 = new Function0() { // from class: o.g85
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b5 = b4;
                        f88 f88Var = f88.a;
                        Function0 function7 = function0;
                        l85 l85Var7 = l85Var4;
                        switch (b5) {
                            case 0:
                                SharedPreferences.Editor editorEdit = l85Var7.n.edit();
                                editorEdit.getClass();
                                editorEdit.putBoolean("LOGIN_ON_STARTUP", false);
                                editorEdit.apply();
                                function7.a();
                                break;
                            default:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(r75.OnSkipLoginClicked);
                                SharedPreferences.Editor editorEdit2 = l85Var7.n.edit();
                                editorEdit2.getClass();
                                editorEdit2.putBoolean("LOGIN_ON_STARTUP", false);
                                editorEdit2.apply();
                                ye4.a("OnBoardingScreen", "Login result: LOGIN_SKIPPED");
                                function7.a();
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK8);
            }
            Function0 function7 = (Function0) objK8;
            if (a06Var.c) {
                ux2Var2.W(1431903589);
                vt1.f(((Boolean) px4VarG.getValue()).booleanValue(), function5, function6, function7, fs4Var, ux2Var2, i2 & 57344);
                z = false;
                ux2Var2.p(false);
            } else {
                z = false;
                ux2Var2.W(1432155278);
                it1.d(((Boolean) px4VarG.getValue()).booleanValue(), function5, function6, function7, fs4Var, ux2Var2, i2 & 57344);
                ux2Var2.p(false);
            }
            vh3 vh3Var = (vh3) px4VarF.getValue();
            if (vh3Var == null) {
                ux2Var2.W(1432400177);
                ux2Var2.p(z);
                l85Var5 = l85Var4;
            } else {
                ux2Var2.W(1432400178);
                boolean zH8 = ux2Var2.h(vh3Var);
                Object objK9 = ux2Var2.K();
                if (zH8 || objK9 == awVar) {
                    objK9 = new j85(vh3Var, (byte) 0);
                    ux2Var2.g0(objK9);
                }
                Function0 function8 = (Function0) objK9;
                boolean zH9 = ux2Var2.h(l85Var4);
                Object objK10 = ux2Var2.K();
                if (zH9 || objK10 == awVar) {
                    l85Var5 = l85Var4;
                    ax1 ax1Var = new ax1(0, l85Var5, l85.class, "dismissDialog", "dismissDialog()V", 0, (byte) 19);
                    ux2Var2.g0(ax1Var);
                    objK10 = ax1Var;
                } else {
                    l85Var5 = l85Var4;
                }
                io1.j(vh3Var, function8, (Function0) ((pu3) objK10), null, null, ux2Var2, 0, 24);
                ux2Var2.p(false);
            }
            l85Var2 = l85Var5;
        } else {
            ux2Var2.Q();
            l85Var2 = l85Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new q41((Object) function0, (Object) a06Var, (pw2) function1, (pw2) function2, fs4Var, (oe8) l85Var2, i, (byte) 2);
        }
    }

    public static final void s(ex4 ex4Var, l84 l84Var, ux2 ux2Var, int i) {
        ex4Var.getClass();
        ux2Var.Y(-1770945943);
        byte b = 2;
        int i2 = (ux2Var.f(ex4Var) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && ux2Var.z()) {
            ux2Var.Q();
        } else {
            l84Var = l84.ON_RESUME;
            ux2Var.W(-2101357749);
            byte b2 = 0;
            boolean z = (i2 & 14) == 4;
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (z || objK == obj) {
                objK = new dy0(l84Var, ex4Var, b);
                ux2Var.g0(objK);
            }
            s84 s84Var = (s84) objK;
            ux2Var.p(false);
            x84 x84VarZ = ((LifecycleOwner) ux2Var.j(dd4.a)).getR();
            ux2Var.W(-2101338711);
            boolean zH = ux2Var.h(x84VarZ) | ux2Var.h(s84Var);
            Object objK2 = ux2Var.K();
            if (zH || objK2 == obj) {
                objK2 = new tj5(x84VarZ, s84Var, b2);
                ux2Var.g0(objK2);
            }
            ux2Var.p(false);
            ck3.d(x84VarZ, s84Var, (Function1) objK2, ux2Var);
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new l64((byte) 9, i, ex4Var, l84Var);
        }
    }

    public static final void u(List list, l84 l84Var, ux2 ux2Var, int i) {
        ux2Var.Y(1533427666);
        if ((((ux2Var.h(list) ? 4 : 2) | i | 48) & 19) == 18 && ux2Var.z()) {
            ux2Var.Q();
        } else {
            l84Var = l84.ON_RESUME;
            ux2Var.W(-67706430);
            boolean zF = ux2Var.f(list);
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (zF || objK == obj) {
                objK = new dy0(l84Var, list, (byte) 3);
                ux2Var.g0(objK);
            }
            s84 s84Var = (s84) objK;
            ux2Var.p(false);
            x84 x84VarZ = ((LifecycleOwner) ux2Var.j(dd4.a)).getR();
            ux2Var.W(-67685064);
            boolean zH = ux2Var.h(x84VarZ) | ux2Var.h(s84Var);
            Object objK2 = ux2Var.K();
            if (zH || objK2 == obj) {
                objK2 = new tj5(x84VarZ, s84Var, (byte) 1);
                ux2Var.g0(objK2);
            }
            ux2Var.p(false);
            ck3.d(x84VarZ, s84Var, (Function1) objK2, ux2Var);
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new l64((byte) 10, i, list, l84Var);
        }
    }

    public static final void v(final kp5 kp5Var, final Function0 function0, fs4 fs4Var, xy6 xy6Var, Function0 function1, Function0 function2, ux2 ux2Var, final int i, final int i2) {
        int i3;
        Function0 function3;
        int i4;
        final fs4 fs4Var2;
        final xy6 xy6Var2;
        final Function0 function4;
        final Function0 function5;
        int i5;
        fs4 fs4Var3;
        xy6 xy6Var3;
        Function0 function6;
        function0.getClass();
        ux2Var.Y(863548978);
        if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? ux2Var.f(kp5Var) : ux2Var.h(kp5Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        byte b = 16;
        int i6 = i3 | (ux2Var.h(function0) ? 32 : 16);
        int i7 = i6 | 1408;
        int i8 = i2 & 16;
        if (i8 != 0) {
            i4 = i6 | 25984;
            function3 = function1;
        } else {
            function3 = function1;
            i4 = i7 | (ux2Var.h(function3) ? 16384 : 8192);
        }
        int i9 = i4 | 196608;
        if (ux2Var.N(i9 & 1, (74899 & i9) != 74898)) {
            ux2Var.S();
            int i10 = i & 1;
            hc1 hc1Var = null;
            aw awVar = e01.a;
            if (i10 == 0 || ux2Var.x()) {
                xy6 xy6VarR = yo1.R(null, ux2Var, 6, 2);
                i5 = i9 & (-7169);
                if (i8 != 0) {
                    Object objK = ux2Var.K();
                    if (objK == awVar) {
                        objK = new x85((byte) 17);
                        ux2Var.g0(objK);
                    }
                    function3 = (Function0) objK;
                }
                Object objK2 = ux2Var.K();
                if (objK2 == awVar) {
                    objK2 = new x85((byte) 18);
                    ux2Var.g0(objK2);
                }
                Function0 function7 = (Function0) objK2;
                fs4Var3 = cs4.b;
                xy6Var3 = xy6VarR;
                function6 = function7;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var;
                xy6Var3 = xy6Var;
                i5 = i9 & (-7169);
                function6 = function2;
            }
            ux2Var.q();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ux2Var.j(dd4.a);
            boolean zH = ux2Var.h(lifecycleOwner) | ((i5 & 14) == 4 || ((i5 & 8) != 0 && ux2Var.h(kp5Var)));
            Object objK3 = ux2Var.K();
            if (zH || objK3 == awVar) {
                objK3 = new vt4(lifecycleOwner, kp5Var, hc1Var, (byte) 9);
                ux2Var.g0(objK3);
            }
            ck3.i(lifecycleOwner, (hw2) objK3, ux2Var);
            boolean z = (i5 & 112) == 32;
            Object objK4 = ux2Var.K();
            if (z || objK4 == awVar) {
                objK4 = new yv1(function0, b);
                ux2Var.g0(objK4);
            }
            Function0 function8 = (Function0) objK4;
            Function0 function9 = function3;
            Function0 function10 = function6;
            yy0 yy0VarO = au8.O(1988151444, new q34(kp5Var, function9, function0, function10, (byte) 5), ux2Var);
            xy6 xy6Var4 = xy6Var3;
            fs4 fs4Var4 = fs4Var3;
            yo1.k(function8, fs4Var4, xy6Var4, 0.0f, false, null, 0L, 0L, 0L, null, null, null, yy0VarO, ux2Var, 48, 3072, 8184);
            fs4Var2 = fs4Var4;
            xy6Var2 = xy6Var4;
            function5 = function9;
            function4 = function10;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
            function4 = function2;
            function5 = function3;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.mp5
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lv1.v(kp5Var, function0, fs4Var2, xy6Var2, function5, function4, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final void x(final long j, final ot7 ot7Var, final hw2 hw2Var, ux2 ux2Var, final int i) {
        int i2;
        ux2Var.Y(-684938728);
        if ((i & 6) == 0) {
            i2 = (ux2Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(ot7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(hw2Var) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            h72 h72Var = qs7.a;
            j51.m(new dx5[]{wa1.a.a(new rv0(j)), h72Var.a(((ot7) ux2Var.j(h72Var)).e(ot7Var))}, hw2Var, ux2Var, ((i2 >> 3) & 112) | 8);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.bx5
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    lv1.x(j, ot7Var, hw2Var, (ux2) obj, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }

    public abstract View R(int i);

    public abstract boolean S();
}
