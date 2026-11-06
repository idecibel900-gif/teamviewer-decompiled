package o;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.apidefinitions.contacts.models.ContactOnlineStatus;
import com.teamviewer.apidefinitions.contacts.models.PersonalContact;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitation;
import com.teamviewer.remotecontrollib.swig.AccountViewModelBase;
import com.teamviewer.remotecontrollib.swig.AccountViewModelLocatorSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrollib.swig.LogoutViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class di1 {
    public static final yy0 h;
    public static final yy0 i;
    public static final yy0 m;
    public static final yy0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yy0 f624o;
    public static final byte[] p;
    public static final String[] q;
    public static jd6 r;
    public static final Object s;
    public static final StackTraceElement[] t;
    public static final a65 u;
    public static final fu7 v;
    public static final t2 a = new t2(27);
    public static final float[][] b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] d = {95.047f, 100.0f, 108.883f};
    public static final float[][] e = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final yy0 f = new yy0(-1435500519, false, new p20(25));
    public static final yy0 g = new yy0(1072084453, false, new p20(26));
    public static final yy0 j = new yy0(224256279, false, new gz0(0));
    public static final yy0 k = new yy0(-840823376, false, new fz0(22));
    public static final yy0 l = new yy0(-586433969, false, new fz0(23));

    /* JADX WARN: Multi-variable type inference failed */
    static {
        byte b2 = 21;
        h = new yy0(-1336625581, false, new bz0(b2));
        byte b3 = 29;
        i = new yy0(-284522535, false, new az0(b3));
        new yy0(1024394416, false, new fz0((byte) 24));
        m = new yy0(451205380, false, new gz0((byte) 16));
        n = new yy0(1971646413, false, new hz0(b3));
        f624o = new yy0(-130807090, false, new iz0(0 == true ? 1 : 0));
        p = new byte[0];
        q = new String[]{"standard", "accelerate", "decelerate", "linear"};
        s = new Object();
        t = new StackTraceElement[0];
        u = new a65((byte) 20, (Object) new qo2((byte) 19), (Object) new le5(b2), (boolean) (0 == true ? 1 : 0));
        v = new fu7(0, new long[0], new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a9  */
    public static void A(ny2 ny2Var, StringBuilder sb, int i2) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : ny2Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            boolean zBooleanValue = true;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String str2 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    y(sb, i2, n(str2), ny2.h(method2, ny2Var, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String str3 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    y(sb, i2, n(str3), ny2.h(method3, ny2Var, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strSubstring))) != null && (!strSubstring.endsWith("Bytes") || !map.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                String str4 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1);
                Method method4 = (Method) map.get("get".concat(strSubstring));
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objH = ny2.h(method4, ny2Var, new Object[0]);
                    if (method5 == null) {
                        if (objH instanceof Boolean) {
                            zEquals = !((Boolean) objH).booleanValue();
                        } else if (objH instanceof Integer) {
                            if (((Integer) objH).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objH instanceof Float) {
                            if (((Float) objH).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objH instanceof Double) {
                            if (((Double) objH).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objH instanceof String) {
                            zEquals = objH.equals("");
                        } else if (objH instanceof yh0) {
                            zEquals = objH.equals(yh0.n);
                        } else if (!(objH instanceof s1) ? !((objH instanceof Enum) && ((Enum) objH).ordinal() == 0) : objH != ((ny2) ((ny2) ((s1) objH)).f(6))) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) ny2.h(method5, ny2Var, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        y(sb, i2, n(str4), objH);
                    }
                }
            }
        }
        k88 k88Var = ny2Var.unknownFields;
        if (k88Var != null) {
            for (int i3 = 0; i3 < k88Var.a; i3++) {
                y(sb, i2, String.valueOf(k88Var.b[i3] >>> 3), k88Var.c[i3]);
            }
        }
    }

    public static final ge8 B(LayoutNode layoutNode) {
        ge8 ge8Var = layoutNode.B;
        if (ge8Var != null) {
            return ge8Var;
        }
        throw ua5.r("Required value was null.");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public static final int C(wn6 wn6Var, int i2) {
        int i3;
        int[] iArr = wn6Var.r;
        int i4 = i2 + 1;
        int length = wn6Var.q.length - 1;
        int i5 = 0;
        while (i5 <= length) {
            i3 = (i5 + length) >>> 1;
            int i6 = iArr[i3];
            if (i6 < i4) {
                i5 = i3 + 1;
            } else {
                if (i6 <= i4) {
                    if (i3 >= 0) {
                        return i3;
                    }
                    return ~i3;
                }
                length = i3 - 1;
            }
        }
        i3 = (-i5) - 1;
        if (i3 >= 0) {
            return i3;
        }
        return ~i3;
    }

    public static final void D(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final h71 E(PersonalContact personalContact) {
        personalContact.getClass();
        return new h71(personalContact.getPersonalContactId(), Integer.valueOf(personalContact.getAccountId()), ub7.x0(personalContact.getName()).toString(), personalContact.getEmail(), personalContact.getDescription(), personalContact.getPictureUrl(), personalContact.getStatus(), b91.m);
    }

    public static final h71 F(PersonalContactInvitation personalContactInvitation) {
        personalContactInvitation.getClass();
        return new h71(personalContactInvitation.getPersonalContactInvitationId(), (Integer) null, ub7.x0(personalContactInvitation.getEmail()).toString(), personalContactInvitation.getEmail(), (String) null, (ContactOnlineStatus) null, b91.f407o, 114);
    }

    public static final String G(hc1 hc1Var) {
        Object sc6Var;
        if (hc1Var instanceof a22) {
            return ((a22) hc1Var).toString();
        }
        try {
            sc6Var = hc1Var + '@' + r(hc1Var);
        } catch (Throwable th) {
            sc6Var = new sc6(th);
        }
        if (tc6.a(sc6Var) != null) {
            sc6Var = hc1Var.getClass().getName() + '@' + r(hc1Var);
        }
        return (String) sc6Var;
    }

    public static String H(long j2) {
        if (q(j2, 12884901888L)) {
            return "Rgb";
        }
        if (q(j2, 12884901889L)) {
            return "Xyz";
        }
        if (q(j2, 12884901890L)) {
            return "Lab";
        }
        return q(j2, 17179869187L) ? "Cmyk" : "Unknown";
    }

    public static final fs4 I(boolean z, mw4 mw4Var, boolean z2, pe6 pe6Var, Function1 function1) {
        return jr4.b.f(new uv7(z, mw4Var, false, z2, pe6Var, function1));
    }

    public static fs4 J(fs4 fs4Var, boolean z, pe6 pe6Var, Function1 function1) {
        return fs4Var.f(new uv7(z, null, true, true, pe6Var, function1));
    }

    public static final yj5 K(dx5[] dx5VarArr, yj5 yj5Var, yj5 yj5Var2) {
        yj5 yj5Var3 = yj5.p;
        xj5 xj5Var = new xj5(yj5Var3);
        xj5Var.s = yj5Var3;
        for (dx5 dx5Var : dx5VarArr) {
            zw5 zw5Var = dx5Var.a;
            if (dx5Var.g || !yj5Var.containsKey(zw5Var)) {
                xj5Var.put(zw5Var, zw5Var.d(dx5Var, (lb8) yj5Var2.get(zw5Var)));
            }
        }
        return xj5Var.e();
    }

    public static float L() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void a(final Function1 function1, fs4 fs4Var, Function1 function2, ux2 ux2Var, int i2) {
        int i3;
        Object obj;
        ux2Var.Y(-180024211);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.h(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        int i5 = i2 & 3072;
        Object obj2 = a;
        if (i5 == 0) {
            i4 |= ux2Var.h(obj2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ux2Var.h(function2) ? 16384 : 8192;
        }
        if (ux2Var.N(i4 & 1, (i4 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(ux2Var.T);
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var.f(aq2.b).f(ar2.b).f(cr2.b).f(yq2.b));
            in1 in1Var = (in1) ux2Var.j(b11.h);
            j04 j04Var = (j04) ux2Var.j(b11.n);
            yj5 yj5VarL = ux2Var.l();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ux2Var.j(dd4.a);
            ai6 ai6Var = (ai6) ux2Var.j(hd4.a);
            ux2Var.W(1314774735);
            int i6 = i4 & 14;
            final int iHashCode2 = Long.hashCode(ux2Var.T);
            final Context context = (Context) ux2Var.j(lh.b);
            final sx2 sx2VarY = kh.y(ux2Var);
            final nh6 nh6Var = (nh6) ux2Var.j(ph6.a);
            final View view = (View) ux2Var.j(lh.f);
            byte b2 = 6;
            boolean zH = ux2Var.h(context) | ((((i6 & 14) ^ 6) > 4 && ux2Var.f(function1)) || (i6 & 6) == 4) | ux2Var.h(sx2VarY) | ux2Var.h(nh6Var) | ux2Var.d(iHashCode2) | ux2Var.h(view);
            Object objK = ux2Var.K();
            if (zH || objK == e01.a) {
                obj = new Function0() { // from class: o.bm
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        KeyEvent.Callback callback = view;
                        callback.getClass();
                        return new ge8(context, function1, sx2VarY, nh6Var, iHashCode2, (Owner) callback).getLayoutNode();
                    }
                };
                ux2Var.g0(obj);
            } else {
                obj = objK;
            }
            Function0 function0 = (Function0) obj;
            ux2Var.R(125, 1, null, null);
            ux2Var.r = true;
            if (ux2Var.S) {
                ux2Var.k(function0);
            } else {
                ux2Var.j0();
            }
            yz0.c.getClass();
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(fs4VarS, new g9((byte) 5), ux2Var);
            o67.n(in1Var, new g9(b2), ux2Var);
            o67.n(lifecycleOwner, new g9((byte) 7), ux2Var);
            o67.n(ai6Var, new g9((byte) 8), ux2Var);
            o67.n(j04Var, new g9((byte) 2), ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.n(function2, new g9((byte) 3), ux2Var);
            o67.n(obj2, new g9((byte) 4), ux2Var);
            ux2Var.p(true);
            ux2Var.p(false);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) function1, (Object) fs4Var, (Object) function2, i2, (byte) 2);
        }
    }

    public static final void b(Function1 function1, fs4 fs4Var, Function1 function2, ux2 ux2Var, int i2, int i3) {
        int i4;
        ux2Var.Y(-1783766393);
        if ((i2 & 6) == 0) {
            i4 = (ux2Var.h(function1) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= ux2Var.h(function2) ? 256 : 128;
        }
        if (ux2Var.N(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                function2 = a;
            }
            a(function1, fs4Var, function2, ux2Var, ((i4 << 6) & 57344) | (i4 & 14) | 3072 | (i4 & 112));
        } else {
            ux2Var.Q();
        }
        Function1 function3 = function2;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new am((Object) function1, fs4Var, (Object) function3, i2, i3, (byte) 0);
        }
    }

    public static final void c(final String str, final String str2, final String str3, fs4 fs4Var, me1 me1Var, final Function0 function0, final Function1 function1, final Function1 function2, final Function0 function3, ux2 ux2Var, final int i2) {
        Function0 function4;
        final fs4 fs4Var2;
        final me1 me1Var2;
        me1 me1Var3;
        int i3;
        fs4 fs4Var3;
        Object xuVar;
        px4 px4Var;
        ak3 ak3Var;
        fs4 fs4Var4;
        av avVar;
        boolean z;
        Object next;
        str.getClass();
        str2.getClass();
        ux2Var.Y(-1780866712);
        int i4 = i2 | (ux2Var.f(str) ? 4 : 2) | (ux2Var.f(str2) ? 256 : 128) | (ux2Var.f(str3) ? 2048 : 1024) | 745472 | (ux2Var.h(function1) ? 67108864 : 33554432) | (ux2Var.h(function2) ? 536870912 : 268435456);
        if (ux2Var.N(i4 & 1, (306783379 & i4) != 306783378)) {
            ux2Var.S();
            int i5 = i2 & 1;
            aw awVar = e01.a;
            if (i5 == 0 || ux2Var.x()) {
                Object objK = ux2Var.K();
                if (objK == awVar) {
                    objK = ck3.w(ux2Var);
                    ux2Var.g0(objK);
                }
                me1Var3 = (me1) objK;
                i3 = i4 & (-3670017);
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                me1Var3 = me1Var;
                i3 = i4 & (-3670017);
                fs4Var3 = fs4Var;
            }
            ux2Var.q();
            Context context = (Context) ux2Var.j(lh.b);
            Object obj = (Activity) ux2Var.j(tc4.a);
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = h57.p(Boolean.FALSE);
                ux2Var.g0(objK2);
            }
            final px4 px4Var2 = (px4) objK2;
            Object objK3 = ux2Var.K();
            if (objK3 == awVar) {
                objK3 = h57.p(Boolean.FALSE);
                ux2Var.g0(objK3);
            }
            px4 px4Var3 = (px4) objK3;
            Object[] objArr = new Object[0];
            Object objK4 = ux2Var.K();
            if (objK4 == awVar) {
                objK4 = new zq((byte) 6);
                ux2Var.g0(objK4);
            }
            px4 px4Var4 = (px4) zu1.L(objArr, (Function0) objK4, ux2Var, 48);
            Object objK5 = ux2Var.K();
            if (objK5 == awVar) {
                context.getClass();
                PackageManager packageManager = context.getPackageManager();
                packageManager.getClass();
                String packageName = context.getPackageName();
                packageName.getClass();
                String installingPackageName = Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInstallingPackageName() : packageManager.getInstallerPackageName(packageName);
                ak3.n.getClass();
                Iterator it = ak3.r.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!im3.n(((ak3) next).m, installingPackageName));
                Object obj2 = (ak3) next;
                Object obj3 = ak3.Website;
                if (obj2 == null) {
                    obj2 = obj3;
                }
                objK5 = (obj2 != obj3 || context.getPackageManager().getLaunchIntentForPackage("com.android.vending") == null) ? obj2 : ak3.PlayStore;
                ux2Var.g0(objK5);
            }
            ak3 ak3Var2 = (ak3) objK5;
            Object objK6 = ux2Var.K();
            if (objK6 == awVar) {
                context.getClass();
                try {
                    z = !context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled;
                } catch (PackageManager.NameNotFoundException unused) {
                    z = true;
                }
                objK6 = Boolean.valueOf(z);
                ux2Var.g0(objK6);
            }
            final boolean zBooleanValue = ((Boolean) objK6).booleanValue();
            Object[] objArr2 = new Object[0];
            Object objK7 = ux2Var.K();
            if (objK7 == awVar) {
                objK7 = new zq((byte) 7);
                ux2Var.g0(objK7);
            }
            px4 px4Var5 = (px4) zu1.L(objArr2, (Function0) objK7, ux2Var, 48);
            boolean zF = ux2Var.f((hv) px4Var4.getValue());
            Object objK8 = ux2Var.K();
            if (zF || objK8 == awVar) {
                objK8 = new bv(context, (hv) px4Var4.getValue(), ak3Var2);
                ux2Var.g0(objK8);
            }
            Object obj4 = (bv) objK8;
            String strZ = m77.z(R.string.app_update_complete_message, ux2Var);
            String strZ2 = m77.z(R.string.app_update_error_message, ux2Var);
            Object objK9 = ux2Var.K();
            if (objK9 == awVar) {
                Context applicationContext = context.getApplicationContext();
                SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(applicationContext.getPackageName() + "_preferences", 0);
                sharedPreferences.getClass();
                objK9 = new av(sharedPreferences, me1Var3);
                ux2Var.g0(objK9);
            }
            final av avVar2 = (av) objK9;
            Object objK10 = ux2Var.K();
            if (objK10 == awVar) {
                Object l8Var = new l8(ak3Var2, function1, strZ2, px4Var2, px4Var5);
                ux2Var.g0(l8Var);
                objK10 = l8Var;
            }
            Function1 function5 = (Function1) objK10;
            boolean zH = ((i3 & 896) == 256) | ux2Var.h(avVar2) | ((i3 & 7168) == 2048) | ux2Var.f(px4Var4) | ux2Var.h(context) | ((1879048192 & i3) == 536870912) | ux2Var.f(strZ);
            Object objK11 = ux2Var.K();
            if (zH || objK11 == awVar) {
                px4Var = px4Var3;
                ak3Var = ak3Var2;
                xuVar = new xu(avVar2, str2, str3, ak3Var, function3, zBooleanValue, px4Var, px4Var4, px4Var2, context, function2, strZ, null);
                context = context;
                ux2Var.g0(xuVar);
            } else {
                px4Var = px4Var3;
                xuVar = objK11;
                ak3Var = ak3Var2;
            }
            ck3.i(f88.a, (hw2) xuVar, ux2Var);
            if (((Boolean) px4Var2.getValue()).booleanValue()) {
                ux2Var.W(1934007323);
                boolean zBooleanValue2 = ((Boolean) px4Var.getValue()).booleanValue();
                boolean zBooleanValue3 = ((Boolean) px4Var5.getValue()).booleanValue();
                boolean zH2 = ux2Var.h(obj4);
                Object objK12 = ux2Var.K();
                if (zH2 || objK12 == awVar) {
                    objK12 = new n5(obj4, (Object) function5, (Object) ak3Var, (byte) 2);
                    ux2Var.g0(objK12);
                }
                Function0 function6 = (Function0) objK12;
                boolean zH3 = ux2Var.h(avVar2) | ux2Var.h(context);
                Object objK13 = ux2Var.K();
                if (zH3 || objK13 == awVar) {
                    final Context context2 = context;
                    final ak3 ak3Var3 = ak3Var;
                    objK13 = new Function0() { // from class: o.wu
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            px4Var2.setValue(Boolean.FALSE);
                            function0.a();
                            SharedPreferences.Editor editorEdit = avVar2.a.edit();
                            editorEdit.putBoolean("UPDATE_CANCELLED_BY_USER", true);
                            editorEdit.apply();
                            context2.getClass();
                            kh7 kh7Var = ev.a;
                            ak3 ak3Var4 = ak3Var3;
                            ak3Var4.getClass();
                            ev.a(new dv(cv.p, ak3Var4, null, zBooleanValue, 4));
                            return f88.a;
                        }
                    };
                    avVar = avVar2;
                    ux2Var.g0(objK13);
                } else {
                    avVar = avVar2;
                }
                Function0 function7 = (Function0) objK13;
                boolean zH4 = ux2Var.h(avVar);
                Object objK14 = ux2Var.K();
                if (zH4 || objK14 == awVar) {
                    function4 = function0;
                    objK14 = new eb(function4, avVar, ak3Var, px4Var2);
                    ux2Var.g0(objK14);
                } else {
                    function4 = function0;
                }
                Function0 function8 = (Function0) objK14;
                boolean zH5 = ux2Var.h(obj);
                Object objK15 = ux2Var.K();
                if (zH5 || objK15 == awVar) {
                    objK15 = new x8(ak3Var, obj, (byte) 5);
                    ux2Var.g0(objK15);
                }
                fs4Var4 = fs4Var3;
                j51.a(str, zBooleanValue2, zBooleanValue3, zBooleanValue, function6, function7, function8, (Function0) objK15, fs4Var4, ux2Var, (i3 & 14) | 100666368);
                ux2Var.p(false);
            } else {
                fs4Var4 = fs4Var3;
                function4 = function0;
                ux2Var.W(1935426906);
                ux2Var.p(false);
            }
            fs4Var2 = fs4Var4;
            me1Var2 = me1Var3;
        } else {
            function4 = function0;
            ux2Var.Q();
            fs4Var2 = fs4Var;
            me1Var2 = me1Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            final Function0 function9 = function4;
            j56VarR.d = new hw2(str, str2, str3, fs4Var2, me1Var2, function9, function1, function2, function3, i2) { // from class: o.vu
                public final /* synthetic */ String m;
                public final /* synthetic */ String n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ String f2346o;
                public final /* synthetic */ fs4 p;
                public final /* synthetic */ me1 q;
                public final /* synthetic */ Function0 r;
                public final /* synthetic */ Function1 s;
                public final /* synthetic */ Function1 t;
                public final /* synthetic */ Function0 u;

                @Override // o.hw2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iY = yo1.Y(12582961);
                    di1.c(this.m, this.n, this.f2346o, this.p, this.q, this.r, this.s, this.t, this.u, (ux2) obj5, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void d(bp5 bp5Var, yy0 yy0Var, k08 k08Var, fs4 fs4Var, yy0 yy0Var2, ux2 ux2Var, int i2) {
        bp5 bp5Var2;
        int i3;
        px4 px4Var;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1221877520);
        if ((i2 & 6) == 0) {
            bp5Var2 = bp5Var;
            i3 = (ux2Var2.f(bp5Var2) ? 4 : 2) | i2;
        } else {
            bp5Var2 = bp5Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var2.h(yy0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? ux2Var2.f(k08Var) : ux2Var2.h(k08Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var2.f(fs4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ux2Var2.h(null) ? 16384 : 8192;
        }
        boolean z = false;
        if ((i2 & 196608) == 0) {
            i3 |= ux2Var2.g(false) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ux2Var2.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= ux2Var2.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= ux2Var2.h(yy0Var2) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (ux2Var2.N(i4 & 1, (38347923 & i4) != 38347922)) {
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var2);
                ux2Var2.g0(objK);
            }
            me1 me1Var = (me1) objK;
            Object objK2 = ux2Var2.K();
            if (objK2 == awVar) {
                objK2 = h57.p(Boolean.FALSE);
                ux2Var2.g0(objK2);
            }
            px4 px4Var2 = (px4) objK2;
            ux2Var2.W(-1104742522);
            ux2Var2.p(false);
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, cs4.b);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            if (k08Var.b()) {
                ux2Var2.W(-1891243071);
                j(bp5Var2, k08Var, me1Var, false, px4Var2, yy0Var, ux2Var2, ((i4 << 15) & 3670016) | (i4 & 14) | 196608 | ((i4 >> 3) & 112) | ((i4 >> 6) & 896));
                px4Var = px4Var2;
                ux2Var2 = ux2Var2;
                ux2Var2.p(false);
            } else {
                px4Var = px4Var2;
                ux2Var2.W(-1890863476);
                ux2Var2.p(false);
            }
            l(k08Var, px4Var, fs4Var, yy0Var2, ux2Var2, ((i4 >> 18) & 14) | 384 | ((i4 >> 3) & 112) | ((i4 >> 12) & 7168) | (57344 & (i4 << 3)) | ((i4 >> 9) & 458752));
            ux2Var2.p(true);
            if ((i4 & 896) == 256 || ((i4 & 512) != 0 && ux2Var2.h(k08Var))) {
                z = true;
            }
            Object objK3 = ux2Var2.K();
            if (z || objK3 == awVar) {
                objK3 = new q0(k08Var, (byte) 15);
                ux2Var2.g0(objK3);
            }
            ck3.e(k08Var, (Function1) objK3, ux2Var2);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new a50(bp5Var, yy0Var, k08Var, fs4Var, yy0Var2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x0121  */
    /* JADX WARN: Code duplicated, block: B:73:0x012f  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void e(final boolean z, final Function1 function1, fs4 fs4Var, boolean z2, eq0 eq0Var, ux2 ux2Var, final int i2, final int i3) {
        int i4;
        fs4 fs4Var2;
        int i5;
        int i6;
        byte b2;
        boolean z3;
        final boolean z4;
        final eq0 eq0Var2;
        final fs4 fs4Var3;
        j56 j56VarR;
        fs4 fs4Var4;
        int i7;
        eq0 eq0VarV;
        boolean z5;
        xv7 xv7Var;
        Function0 function0;
        boolean z6;
        boolean z7;
        Object objK;
        ux2Var.Y(-1406741137);
        if ((i2 & 6) == 0) {
            i4 = (ux2Var.g(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.h(function1) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & 384) == 0) {
                fs4Var2 = fs4Var;
                i4 |= ux2Var.f(fs4Var2) ? 256 : 128;
            }
            i5 = i4 | 3072;
            if ((i2 & 24576) == 0) {
                i5 = i4 | 11264;
            }
            i6 = 196608 | i5;
            b2 = 0;
            if ((74899 & i6) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var.N(i6 & 1, z3)) {
                ux2Var.S();
                if ((i2 & 1) != 0 || ux2Var.x()) {
                    if (i8 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    i7 = i6 & (-57345);
                    eq0VarV = j51.v(ux2Var);
                    z5 = true;
                    fs4Var2 = fs4Var4;
                } else {
                    ux2Var.Q();
                    i7 = i6 & (-57345);
                    z5 = z2;
                    eq0VarV = eq0Var;
                }
                ux2Var.q();
                float fFloor = (float) Math.floor(((in1) ux2Var.j(b11.h)).d0(2.0f));
                if (z) {
                    xv7Var = xv7.m;
                } else {
                    xv7Var = xv7.n;
                }
                if (function1 != null) {
                    ux2Var.W(2066141046);
                    if ((i7 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z6 | ((i7 & 14) == 4);
                    objK = ux2Var.K();
                    if (z7 || objK == e01.a) {
                        objK = new fq0(function1, z, b2);
                        ux2Var.g0(objK);
                    }
                    function0 = (Function0) objK;
                    ux2Var.p(false);
                } else {
                    ux2Var.W(2066206735);
                    ux2Var.p(false);
                    function0 = null;
                }
                int i9 = i7 << 6;
                k(xv7Var, function0, new cc7(fFloor, 0.0f, 2, 0, 26), new cc7(fFloor, 0.0f, 0, 0, 30), fs4Var2, z5, eq0VarV, ux2Var, (57344 & i9) | 4608 | (458752 & i9) | (i9 & 29360128));
                z4 = z5;
                eq0Var2 = eq0VarV;
            } else {
                ux2Var.Q();
                z4 = z2;
                eq0Var2 = eq0Var;
            }
            fs4Var3 = fs4Var2;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.gq0
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        di1.e(z, function1, fs4Var3, z4, eq0Var2, (ux2) obj, yo1.Y(i2 | 1), i3);
                        return f88.a;
                    }
                };
            }
        }
        i4 |= 384;
        fs4Var2 = fs4Var;
        i5 = i4 | 3072;
        if ((i2 & 24576) == 0) {
            i5 = i4 | 11264;
        }
        i6 = 196608 | i5;
        b2 = 0;
        if ((74899 & i6) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ux2Var.N(i6 & 1, z3)) {
            ux2Var.S();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                i7 = i6 & (-57345);
                eq0VarV = j51.v(ux2Var);
                z5 = true;
                fs4Var2 = fs4Var4;
            } else {
                if (i8 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                i7 = i6 & (-57345);
                eq0VarV = j51.v(ux2Var);
                z5 = true;
                fs4Var2 = fs4Var4;
            }
            ux2Var.q();
            float fFloor2 = (float) Math.floor(((in1) ux2Var.j(b11.h)).d0(2.0f));
            if (z) {
                xv7Var = xv7.m;
            } else {
                xv7Var = xv7.n;
            }
            if (function1 != null) {
                ux2Var.W(2066141046);
                if ((i7 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z6 | ((i7 & 14) == 4);
                objK = ux2Var.K();
                if (z7) {
                    objK = new fq0(function1, z, b2);
                    ux2Var.g0(objK);
                } else {
                    objK = new fq0(function1, z, b2);
                    ux2Var.g0(objK);
                }
                function0 = (Function0) objK;
                ux2Var.p(false);
            } else {
                ux2Var.W(2066206735);
                ux2Var.p(false);
                function0 = null;
            }
            int i10 = i7 << 6;
            k(xv7Var, function0, new cc7(fFloor2, 0.0f, 2, 0, 26), new cc7(fFloor2, 0.0f, 0, 0, 30), fs4Var2, z5, eq0VarV, ux2Var, (57344 & i10) | 4608 | (458752 & i10) | (i10 & 29360128));
            z4 = z5;
            eq0Var2 = eq0VarV;
        } else {
            ux2Var.Q();
            z4 = z2;
            eq0Var2 = eq0Var;
        }
        fs4Var3 = fs4Var2;
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.gq0
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    di1.e(z, function1, fs4Var3, z4, eq0Var2, (ux2) obj, yo1.Y(i2 | 1), i3);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:177:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:181:0x0302  */
    /* JADX WARN: Code duplicated, block: B:184:0x031c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0322  */
    /* JADX WARN: Code duplicated, block: B:188:0x0325  */
    /* JADX WARN: Code duplicated, block: B:191:0x0329  */
    /* JADX WARN: Code duplicated, block: B:193:0x032d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0330  */
    /* JADX WARN: Code duplicated, block: B:195:0x0333  */
    /* JADX WARN: Code duplicated, block: B:197:0x0339  */
    /* JADX WARN: Code duplicated, block: B:199:0x033c  */
    /* JADX WARN: Code duplicated, block: B:201:0x033f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0342  */
    /* JADX WARN: Code duplicated, block: B:204:0x0346  */
    /* JADX WARN: Code duplicated, block: B:205:0x0349  */
    /* JADX WARN: Code duplicated, block: B:207:0x034d  */
    /* JADX WARN: Code duplicated, block: B:208:0x036c  */
    /* JADX WARN: Code duplicated, block: B:210:0x0382  */
    /* JADX WARN: Code duplicated, block: B:212:0x0388  */
    /* JADX WARN: Code duplicated, block: B:214:0x038b  */
    /* JADX WARN: Code duplicated, block: B:217:0x038f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0393  */
    /* JADX WARN: Code duplicated, block: B:221:0x0397  */
    /* JADX WARN: Code duplicated, block: B:222:0x039a  */
    /* JADX WARN: Code duplicated, block: B:224:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:226:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:228:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:229:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:231:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:232:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:234:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:235:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:244:0x0419  */
    /* JADX WARN: Code duplicated, block: B:253:0x0440  */
    /* JADX WARN: Code duplicated, block: B:259:0x0450  */
    public static final void f(boolean z, xv7 xv7Var, fs4 fs4Var, eq0 eq0Var, cc7 cc7Var, cc7 cc7Var2, ux2 ux2Var, int i2) {
        int i3;
        fs4 fs4Var2;
        ux2 ux2Var2;
        Object objP0;
        float f2;
        float f3;
        Object objB;
        Object objP1;
        float f4;
        byte b2;
        Object objB2;
        rl2 m47Var;
        q18 q18VarZ;
        Object objK;
        bq0 bq0Var;
        long j2;
        i97 i97VarA;
        ux2 ux2Var3;
        int iOrdinal;
        long j3;
        i97 i97VarT;
        int iOrdinal2;
        long j4;
        i97 i97VarT2;
        i97 i97Var;
        boolean z2;
        boolean z3;
        boolean z4;
        Object hq0Var;
        int i4;
        int iOrdinal3;
        int iOrdinal4;
        ux2Var.Y(-891330208);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.d(xv7Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            fs4Var2 = fs4Var;
            i3 |= ux2Var.f(fs4Var2) ? 256 : 128;
        } else {
            fs4Var2 = fs4Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.f(eq0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (i2 & 32768) == 0 ? ux2Var.f(cc7Var) : ux2Var.h(cc7Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= (i2 & 262144) == 0 ? ux2Var.f(cc7Var2) : ux2Var.h(cc7Var2) ? 131072 : 65536;
        }
        if (ux2Var.N(i3 & 1, (74899 & i3) != 74898)) {
            u18 u18VarY0 = ck3.y0(xv7Var, null, ux2Var, (i3 >> 3) & 14, 2);
            g2 g2Var = u18VarY0.a;
            rl2 rl2VarC0 = xs1.c0(du4.m, ux2Var);
            yn1 yn1Var = vn4.j0;
            boolean zG = u18VarY0.g();
            aw awVar = e01.a;
            if (zG) {
                ux2Var.W(1666827533);
                ux2Var.p(false);
                objP0 = g2Var.p0();
            } else {
                ux2Var.W(1666573488);
                boolean zF = ux2Var.f(u18VarY0);
                objP0 = ux2Var.K();
                if (zF || objP0 == awVar) {
                    n47 n47VarC = el5.c();
                    Function1 function1E = n47VarC != null ? n47VarC.e() : null;
                    n47 n47VarF = el5.f(n47VarC);
                    try {
                        Object objP2 = g2Var.p0();
                        el5.h(n47VarC, n47VarF, function1E);
                        ux2Var.g0(objP2);
                        objP0 = objP2;
                    } catch (Throwable th) {
                        el5.h(n47VarC, n47VarF, function1E);
                        throw th;
                    }
                }
                ux2Var.p(false);
            }
            ux2Var.W(-768316570);
            int iOrdinal5 = ((xv7) objP0).ordinal();
            float f5 = 0.0f;
            if (iOrdinal5 == 0) {
                f2 = 1.0f;
            } else if (iOrdinal5 != 1) {
                if (iOrdinal5 != 2) {
                    gk0.s();
                    return;
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            byte b3 = 0;
            ux2Var.p(false);
            Float fValueOf = Float.valueOf(f2);
            boolean zF2 = ux2Var.f(u18VarY0);
            Object objK2 = ux2Var.K();
            if (zF2 || objK2 == awVar) {
                objK2 = d57.b(new iq0(u18VarY0, b3));
                ux2Var.g0(objK2);
            }
            xv7 xv7Var2 = (xv7) ((i97) objK2).getValue();
            ux2Var.W(-768316570);
            int iOrdinal6 = xv7Var2.ordinal();
            if (iOrdinal6 == 0) {
                f3 = 1.0f;
            } else if (iOrdinal6 != 1) {
                if (iOrdinal6 != 2) {
                    gk0.s();
                    return;
                }
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            ux2Var.p(false);
            Float fValueOf2 = Float.valueOf(f3);
            boolean zF3 = ux2Var.f(u18VarY0);
            Object objK3 = ux2Var.K();
            if (zF3 || objK3 == awVar) {
                objB = d57.b(new iq0(u18VarY0, (byte) 1));
                ux2Var.g0(objB);
            } else {
                objB = objK3;
            }
            o18 o18Var = (o18) ((i97) objB).getValue();
            ux2Var.W(1780794470);
            Object objB3 = o18Var.b();
            xv7 xv7Var3 = xv7.n;
            rl2 m47Var2 = (objB3 != xv7Var3 && o18Var.d() == xv7Var3) ? new m47(100) : rl2VarC0;
            ux2Var.p(false);
            q18 q18VarZ2 = ck3.z(u18VarY0, fValueOf, fValueOf2, m47Var2, yn1Var, ux2Var, 0);
            if (u18VarY0.g()) {
                ux2Var.W(1666827533);
                ux2Var.p(false);
                objP1 = g2Var.p0();
            } else {
                ux2Var.W(1666573488);
                boolean zF4 = ux2Var.f(u18VarY0);
                Object objK4 = ux2Var.K();
                if (zF4 || objK4 == awVar) {
                    n47 n47VarC2 = el5.c();
                    Function1 function1E2 = n47VarC2 != null ? n47VarC2.e() : null;
                    n47 n47VarF2 = el5.f(n47VarC2);
                    try {
                        objP1 = g2Var.p0();
                        el5.h(n47VarC2, n47VarF2, function1E2);
                        ux2Var.g0(objP1);
                    } catch (Throwable th2) {
                        el5.h(n47VarC2, n47VarF2, function1E2);
                        throw th2;
                    }
                } else {
                    objP1 = objK4;
                }
                ux2Var.p(false);
            }
            ux2Var.W(1840054703);
            int iOrdinal7 = ((xv7) objP1).ordinal();
            if (iOrdinal7 == 0 || iOrdinal7 == 1) {
                f4 = 0.0f;
            } else {
                if (iOrdinal7 != 2) {
                    gk0.s();
                    return;
                }
                f4 = 1.0f;
            }
            ux2Var.p(false);
            Float fValueOf3 = Float.valueOf(f4);
            boolean zF5 = ux2Var.f(u18VarY0);
            Object objK5 = ux2Var.K();
            if (zF5 || objK5 == awVar) {
                b2 = 2;
                objB2 = d57.b(new iq0(u18VarY0, b2));
                ux2Var.g0(objB2);
            } else {
                objB2 = objK5;
                b2 = 2;
            }
            xv7 xv7Var4 = (xv7) ((i97) objB2).getValue();
            ux2Var.W(1840054703);
            int iOrdinal8 = xv7Var4.ordinal();
            if (iOrdinal8 != 0 && iOrdinal8 != 1) {
                if (iOrdinal8 != b2) {
                    gk0.s();
                    return;
                }
                f5 = 1.0f;
            }
            ux2Var.p(false);
            Float fValueOf4 = Float.valueOf(f5);
            boolean zF6 = ux2Var.f(u18VarY0);
            Object objK6 = ux2Var.K();
            if (zF6 || objK6 == awVar) {
                objK6 = d57.b(new iq0(u18VarY0, (byte) 3));
                ux2Var.g0(objK6);
            }
            o18 o18Var2 = (o18) ((i97) objK6).getValue();
            ux2Var.W(630790831);
            if (o18Var2.b() == xv7Var3) {
                rl2VarC0 = db8.z0();
            } else {
                if (o18Var2.d() == xv7Var3) {
                    m47Var = new m47(100);
                }
                ux2Var.p(false);
                q18VarZ = ck3.z(u18VarY0, fValueOf3, fValueOf4, m47Var, yn1Var, ux2Var, 0);
                objK = ux2Var.K();
                if (objK == awVar) {
                    objK = new bq0();
                    ux2Var.g0(objK);
                }
                bq0Var = (bq0) objK;
                ux2Var.W(-2128520210);
                eq0Var.getClass();
                if (xv7Var == xv7Var3) {
                    j2 = eq0Var.b;
                } else {
                    j2 = eq0Var.a;
                }
                i97VarA = r07.a(j2, eq0.a(xv7Var, ux2Var), ux2Var, 0, 12);
                ux2Var3 = ux2Var;
                ux2Var3.p(false);
                if (z) {
                    iOrdinal4 = xv7Var.ordinal();
                    if (iOrdinal4 == 0) {
                        j3 = eq0Var.c;
                    } else if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            gk0.s();
                            return;
                        }
                        j3 = eq0Var.c;
                    } else {
                        j3 = eq0Var.d;
                    }
                } else {
                    iOrdinal = xv7Var.ordinal();
                    if (iOrdinal != 0) {
                        j3 = eq0Var.e;
                    } else if (iOrdinal != 1) {
                        j3 = eq0Var.f;
                    } else {
                        if (iOrdinal == 2) {
                            gk0.s();
                            return;
                        }
                        j3 = eq0Var.g;
                    }
                }
                if (z) {
                    ux2Var3.W(496026915);
                    i97VarT = r07.a(j3, eq0.a(xv7Var, ux2Var3), ux2Var, 0, 12);
                    ux2Var3 = ux2Var;
                    ux2Var3.p(false);
                } else {
                    ux2Var3.W(496117125);
                    i97VarT = h57.t(new rv0(j3), ux2Var3);
                    ux2Var3.p(false);
                }
                if (z) {
                    iOrdinal3 = xv7Var.ordinal();
                    if (iOrdinal3 == 0) {
                        j4 = eq0Var.h;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            gk0.s();
                            return;
                        }
                        j4 = eq0Var.h;
                    } else {
                        j4 = eq0Var.i;
                    }
                } else {
                    iOrdinal2 = xv7Var.ordinal();
                    if (iOrdinal2 != 0) {
                        j4 = eq0Var.j;
                    } else if (iOrdinal2 != 1) {
                        j4 = eq0Var.k;
                    } else {
                        if (iOrdinal2 == 2) {
                            gk0.s();
                            return;
                        }
                        j4 = eq0Var.l;
                    }
                }
                if (z) {
                    ux2Var3.W(633206758);
                    i97VarT2 = r07.a(j4, eq0.a(xv7Var, ux2Var3), ux2Var, 0, 12);
                    ux2Var2 = ux2Var;
                    ux2Var2.p(false);
                } else {
                    long j5 = j4;
                    ux2Var2 = ux2Var3;
                    ux2Var2.W(633296968);
                    i97VarT2 = h57.t(new rv0(j5), ux2Var2);
                    ux2Var2.p(false);
                }
                fs4 fs4VarH = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.s(fs4Var2), 20.0f);
                boolean zF7 = ux2Var2.f(i97VarT) | ux2Var2.f(i97VarT2);
                i97Var = i97VarT2;
                if ((i3 & 458752) != 131072 || ((i3 & 262144) != 0 && ux2Var2.h(cc7Var2))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zF8 = z2 | zF7 | ux2Var2.f(i97VarA) | ux2Var2.f(q18VarZ2) | ux2Var2.f(q18VarZ);
                if ((57344 & i3) != 16384 || ((i3 & 32768) != 0 && ux2Var2.h(cc7Var))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zF8 | z3;
                Object objK7 = ux2Var2.K();
                if (!z4 || objK7 == awVar) {
                    i4 = 0;
                    hq0Var = new hq0(i97VarT, i97Var, cc7Var2, i97VarA, q18VarZ2, q18VarZ, cc7Var, bq0Var);
                    ux2Var2.g0(hq0Var);
                } else {
                    hq0Var = objK7;
                    i4 = 0;
                }
                vn4.K(i4, (Function1) hq0Var, ux2Var2, fs4VarH);
            }
            m47Var = rl2VarC0;
            ux2Var.p(false);
            q18VarZ = ck3.z(u18VarY0, fValueOf3, fValueOf4, m47Var, yn1Var, ux2Var, 0);
            objK = ux2Var.K();
            if (objK == awVar) {
                objK = new bq0();
                ux2Var.g0(objK);
            }
            bq0Var = (bq0) objK;
            ux2Var.W(-2128520210);
            eq0Var.getClass();
            if (xv7Var == xv7Var3) {
                j2 = eq0Var.b;
            } else {
                j2 = eq0Var.a;
            }
            i97VarA = r07.a(j2, eq0.a(xv7Var, ux2Var), ux2Var, 0, 12);
            ux2Var3 = ux2Var;
            ux2Var3.p(false);
            if (z) {
                iOrdinal4 = xv7Var.ordinal();
                if (iOrdinal4 == 0) {
                    j3 = eq0Var.c;
                } else if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        gk0.s();
                        return;
                    }
                    j3 = eq0Var.c;
                } else {
                    j3 = eq0Var.d;
                }
            } else {
                iOrdinal = xv7Var.ordinal();
                if (iOrdinal != 0) {
                    j3 = eq0Var.e;
                } else if (iOrdinal != 1) {
                    j3 = eq0Var.f;
                } else {
                    if (iOrdinal == 2) {
                        gk0.s();
                        return;
                    }
                    j3 = eq0Var.g;
                }
            }
            if (z) {
                ux2Var3.W(496026915);
                i97VarT = r07.a(j3, eq0.a(xv7Var, ux2Var3), ux2Var, 0, 12);
                ux2Var3 = ux2Var;
                ux2Var3.p(false);
            } else {
                ux2Var3.W(496117125);
                i97VarT = h57.t(new rv0(j3), ux2Var3);
                ux2Var3.p(false);
            }
            if (z) {
                iOrdinal3 = xv7Var.ordinal();
                if (iOrdinal3 == 0) {
                    j4 = eq0Var.h;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        gk0.s();
                        return;
                    }
                    j4 = eq0Var.h;
                } else {
                    j4 = eq0Var.i;
                }
            } else {
                iOrdinal2 = xv7Var.ordinal();
                if (iOrdinal2 != 0) {
                    j4 = eq0Var.j;
                } else if (iOrdinal2 != 1) {
                    j4 = eq0Var.k;
                } else {
                    if (iOrdinal2 == 2) {
                        gk0.s();
                        return;
                    }
                    j4 = eq0Var.l;
                }
            }
            if (z) {
                ux2Var3.W(633206758);
                i97VarT2 = r07.a(j4, eq0.a(xv7Var, ux2Var3), ux2Var, 0, 12);
                ux2Var2 = ux2Var;
                ux2Var2.p(false);
            } else {
                long j6 = j4;
                ux2Var2 = ux2Var3;
                ux2Var2.W(633296968);
                i97VarT2 = h57.t(new rv0(j6), ux2Var2);
                ux2Var2.p(false);
            }
            fs4 fs4VarH2 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.s(fs4Var2), 20.0f);
            boolean zF9 = ux2Var2.f(i97VarT) | ux2Var2.f(i97VarT2);
            i97Var = i97VarT2;
            if ((i3 & 458752) != 131072) {
                z2 = true;
            } else {
                z2 = true;
            }
            boolean zF10 = z2 | zF9 | ux2Var2.f(i97VarA) | ux2Var2.f(q18VarZ2) | ux2Var2.f(q18VarZ);
            if ((57344 & i3) != 16384) {
                z3 = true;
            } else {
                z3 = true;
            }
            z4 = zF10 | z3;
            Object objK8 = ux2Var2.K();
            if (z4) {
                i4 = 0;
                hq0Var = new hq0(i97VarT, i97Var, cc7Var2, i97VarA, q18VarZ2, q18VarZ, cc7Var, bq0Var);
                ux2Var2.g0(hq0Var);
            } else {
                i4 = 0;
                hq0Var = new hq0(i97VarT, i97Var, cc7Var2, i97VarA, q18VarZ2, q18VarZ, cc7Var, bq0Var);
                ux2Var2.g0(hq0Var);
            }
            vn4.K(i4, (Function1) hq0Var, ux2Var2, fs4VarH2);
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new fb(z, xv7Var, fs4Var, eq0Var, cc7Var, cc7Var2, i2);
        }
    }

    public static AccountViewModelBase g() {
        long jAccountViewModelLocator_GetAccountViewModelBase = AccountViewModelLocatorSWIGJNI.AccountViewModelLocator_GetAccountViewModelBase();
        if (jAccountViewModelLocator_GetAccountViewModelBase == 0) {
            return null;
        }
        return new AccountViewModelBase(jAccountViewModelLocator_GetAccountViewModelBase);
    }

    public static LicenseViewModel h() {
        long jAccountViewModelLocator_GetLicenseViewModel = AccountViewModelLocatorSWIGJNI.AccountViewModelLocator_GetLicenseViewModel();
        if (jAccountViewModelLocator_GetLicenseViewModel == 0) {
            return null;
        }
        LicenseViewModel licenseViewModel = new LicenseViewModel();
        licenseViewModel.b = true;
        licenseViewModel.a = jAccountViewModelLocator_GetLicenseViewModel;
        return licenseViewModel;
    }

    public static LogoutViewModel i() {
        long jAccountViewModelLocator_GetLogoutViewModel = AccountViewModelLocatorSWIGJNI.AccountViewModelLocator_GetLogoutViewModel();
        if (jAccountViewModelLocator_GetLogoutViewModel == 0) {
            return null;
        }
        LogoutViewModel logoutViewModel = new LogoutViewModel(LogoutViewModelSWIGJNI.LogoutViewModel_SWIGSmartPtrUpcast(jAccountViewModelLocator_GetLogoutViewModel));
        logoutViewModel.d = true;
        logoutViewModel.c = jAccountViewModelLocator_GetLogoutViewModel;
        return logoutViewModel;
    }

    public static final void j(bp5 bp5Var, k08 k08Var, me1 me1Var, boolean z, px4 px4Var, yy0 yy0Var, ux2 ux2Var, int i2) {
        bp5 bp5Var2;
        int i3;
        ux2Var.Y(-1413720282);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            bp5Var2 = bp5Var;
            i3 = (ux2Var.f(bp5Var2) ? 4 : 2) | i2;
        } else {
            bp5Var2 = bp5Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? ux2Var.f(k08Var) : ux2Var.h(k08Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.h(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.h(me1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ux2Var.g(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ux2Var.f(px4Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 1048576 : 524288;
        }
        if (ux2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            String strZ = m77.z(R.string.tooltip_description, ux2Var);
            boolean zH = ((i3 & 112) == 32 || ((i3 & 64) != 0 && ux2Var.h(k08Var))) | ((i3 & 896) == 256) | ux2Var.h(me1Var) | ((458752 & i3) == 131072);
            Object objK = ux2Var.K();
            if (zH || objK == e01.a) {
                objK = new n5((Object) k08Var, (Object) me1Var, (Object) px4Var, (byte) 5);
                ux2Var.g0(objK);
            }
            gk.a(bp5Var2, (Function0) objK, new cp5(22, z), au8.O(-1287705660, new c9(strZ, yy0Var, b2), ux2Var), ux2Var, (i3 & 14) | 3072, 0);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new fb(bp5Var, k08Var, me1Var, z, px4Var, yy0Var, i2, (byte) 1);
        }
    }

    public static final void k(xv7 xv7Var, Function0 function0, cc7 cc7Var, cc7 cc7Var2, fs4 fs4Var, boolean z, eq0 eq0Var, ux2 ux2Var, int i2) {
        int i3;
        fs4 p28Var;
        fs4 fs4Var2;
        ux2Var.Y(-406243761);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.d(xv7Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? ux2Var.f(cc7Var) : ux2Var.h(cc7Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? ux2Var.f(cc7Var2) : ux2Var.h(cc7Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ux2Var.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ux2Var.f(eq0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= ux2Var.f(null) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (ux2Var.N(i4 & 1, (4793491 & i4) != 4793490)) {
            ux2Var.S();
            if ((i2 & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            float f2 = jq0.f / 2.0f;
            long j2 = rv0.h;
            qf6 qf6Var = sf6.a;
            ri5 ri5Var = new ri5(25.0f);
            androidx.compose.material3.c cVarA = zd6.a(false, f2, j2, new qf6(ri5Var, ri5Var, ri5Var, ri5Var), 240);
            cs4 cs4Var = cs4.b;
            if (function0 != null) {
                pe6 pe6Var = new pe6(1);
                if (cVarA != null) {
                    p28Var = new p28(xv7Var, null, cVarA, z, pe6Var, function0);
                } else {
                    p28Var = cVarA == null ? new p28(xv7Var, null, null, z, pe6Var, function0) : uf0.k(cs4Var, new vv7(cVarA, xv7Var, z, pe6Var, function0));
                }
            } else {
                p28Var = cs4Var;
            }
            if (function0 != null) {
                b63 b63Var = ml3.a;
                fs4Var2 = jr4.b;
            } else {
                fs4Var2 = cs4Var;
            }
            int i5 = i4 << 6;
            f(z, xv7Var, fs4Var.f(fs4Var2).f(p28Var).f(ka0.B(cs4Var, 2.0f)), eq0Var, cc7Var, cc7Var2, ux2Var, ((i4 >> 15) & 14) | ((i4 << 3) & 112) | ((i4 >> 9) & 7168) | 32768 | (57344 & i5) | 262144 | (i5 & 458752));
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new i5(xv7Var, function0, cc7Var, cc7Var2, fs4Var, z, eq0Var, i2);
        }
    }

    public static final void l(k08 k08Var, px4 px4Var, fs4 fs4Var, yy0 yy0Var, ux2 ux2Var, int i2) {
        int i3;
        ux2Var.Y(1873232064);
        byte b2 = 4;
        byte b3 = 1;
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.g(true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? ux2Var.f(k08Var) : ux2Var.h(k08Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.f(px4Var) ? 256 : 128;
        }
        byte b4 = 0;
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 131072 : 65536;
        }
        if (ux2Var.N(i3 & 1, (74899 & i3) != 74898)) {
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var);
                ux2Var.g0(objK);
            }
            me1 me1Var = (me1) objK;
            String strZ = m77.z(R.string.tooltip_label, ux2Var);
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = h57.p(Boolean.FALSE);
                ux2Var.g0(objK2);
            }
            px4 px4Var2 = (px4) objK2;
            fs4 fs4VarU = uf0.u(ka0.z(qg7.a(qg7.a(fs4Var, k08Var, new f50(k08Var, b4)), k08Var, new f50(k08Var, b3)).f(new gg5(new m5((Object) strZ, (Object) me1Var, (Object) k08Var, (byte) 5))), new m5(me1Var, px4Var2, k08Var, b2)), new h50(k08Var, px4Var, px4Var2, b4));
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarU);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            yy0Var.invoke(ux2Var, Integer.valueOf((i3 >> 15) & 14));
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new p5((Object) k08Var, (Object) px4Var, (Object) fs4Var, (Object) yy0Var, i2, (byte) 5);
        }
    }

    public static final Object m(um1 um1Var, Function0 function0, jc1 jc1Var) {
        Object obj;
        e45 e45VarO0;
        Object objO;
        nf nfVar;
        if (um1Var.f0().z) {
            if (!um1Var.f0().z) {
                ki3.c("visitAncestors called on an unattached node");
            }
            es4 es4Var = um1Var.f0().q;
            LayoutNode layoutNodeP0 = vn4.p0(um1Var);
            loop0: while (true) {
                obj = null;
                if (layoutNodeP0 == null) {
                    break;
                }
                if ((((es4) layoutNodeP0.S.g).p & 524288) != 0) {
                    while (es4Var != null) {
                        if ((es4Var.f737o & 524288) != 0) {
                            es4 es4VarL0 = es4Var;
                            xx4 xx4Var = null;
                            while (es4VarL0 != null) {
                                if (es4VarL0 instanceof cb0) {
                                    obj = es4VarL0;
                                    break loop0;
                                }
                                if ((es4VarL0.f737o & 524288) != 0 && (es4VarL0 instanceof vm1)) {
                                    int i2 = 0;
                                    for (es4 es4Var2 = ((vm1) es4VarL0).B; es4Var2 != null; es4Var2 = es4Var2.r) {
                                        if ((es4Var2.f737o & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                es4VarL0 = es4Var2;
                                            } else {
                                                if (xx4Var == null) {
                                                    xx4Var = new xx4(new es4[16]);
                                                }
                                                if (es4VarL0 != null) {
                                                    xx4Var.b(es4VarL0);
                                                    es4VarL0 = null;
                                                }
                                                xx4Var.b(es4Var2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                es4VarL0 = vn4.l0(xx4Var);
                            }
                        }
                        es4Var = es4Var.q;
                    }
                }
                layoutNodeP0 = layoutNodeP0.F();
                es4Var = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
            }
            cb0 cb0Var = (cb0) obj;
            if (cb0Var != null && (objO = cb0Var.o((e45VarO0 = vn4.o0(um1Var)), new x8(function0, e45VarO0), jc1Var)) == ne1.m) {
                return objO;
            }
        }
        return f88.a;
    }

    public static final String n(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static void o(mj0 mj0Var, Object[] objArr) {
        objArr.getClass();
        mj0Var.getClass();
        if (mj0Var.a().size() == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(mj0Var.a().size());
        sb.append(" arguments, but ");
        hk0.g(to7.l(sb, objArr.length, " were provided."));
    }

    public static yr2 p(Context context) {
        ProviderInfo providerInfo;
        wr2 wr2Var;
        ApplicationInfo applicationInfo;
        byte b2 = 10;
        aw vj1Var = Build.VERSION.SDK_INT >= 28 ? new vj1(b2) : new aw(b2);
        PackageManager packageManager = context.getPackageManager();
        io1.A(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            wr2Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrU = vj1Var.u(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrU) {
                    arrayList.add(signature.toByteArray());
                }
                wr2Var = new wr2(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                io.sentry.android.core.v0.a("emoji2.text.DefaultEmojiConfig", io.sentry.f6.ERROR, null, e2);
                io.sentry.android.core.v0.b(io.sentry.j6.FATAL, null, e2);
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                wr2Var = null;
            }
        }
        if (wr2Var == null) {
            return null;
        }
        return new yr2(new xr2(context, wr2Var));
    }

    public static final boolean q(long j2, long j3) {
        return j2 == j3;
    }

    public static final String r(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final ClipboardManager s(au0 au0Var) {
        if (au0Var instanceof gg) {
            return ((gg) au0Var).a.F();
        }
        gk0.h(ua5.m("Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received ", w86.a.b(au0Var.getClass()).c()));
        return null;
    }

    public static final fs4 t(fs4 fs4Var, Function1 function1) {
        return fs4Var.f(new u70(function1));
    }

    public static fs4 u(fs4 fs4Var, float f2, float f3, float f4, float f5, float f6, pw6 pw6Var, boolean z, int i2) {
        float f7 = (i2 & 1) != 0 ? 1.0f : f2;
        float f8 = (i2 & 2) != 0 ? 1.0f : f3;
        float f9 = (i2 & 4) != 0 ? 1.0f : f4;
        float f10 = (i2 & 32) != 0 ? 0.0f : f5;
        float f11 = (i2 & 256) != 0 ? 0.0f : f6;
        long j2 = d18.b;
        pw6 pw6Var2 = (i2 & 2048) != 0 ? kh.V : pw6Var;
        boolean z2 = (i2 & 4096) != 0 ? false : z;
        long j3 = p03.a;
        return fs4Var.f(new m03(f7, f8, f9, f10, f11, j2, pw6Var2, z2, j3, j3, d04.a));
    }

    public static final void v(Throwable th, de1 de1Var) {
        Throwable runtimeException;
        Iterator it = he1.a.iterator();
        while (it.hasNext()) {
            try {
                ((ge1) it.next()).q(th, de1Var);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    ct1.q(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            ct1.q(th, new j02(de1Var));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused2) {
        }
    }

    public static int w(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = d;
        return hw0.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static float x(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final void y(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                y(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                y(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            vh0 vh0Var = yh0.n;
            sb.append(u47.i(new vh0(((String) obj).getBytes(sl3.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof yh0) {
            sb.append(": \"");
            sb.append(u47.i((yh0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ny2) {
            sb.append(" {");
            A((ny2) obj, sb, i2 + 2);
            sb.append("\n");
            while (i3 < i2) {
                sb.append(' ');
                i3++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i2 + 2;
        y(sb, i5, "key", entry.getKey());
        y(sb, i5, "value", entry.getValue());
        sb.append("\n");
        while (i3 < i2) {
            sb.append(' ');
            i3++;
        }
        sb.append("}");
    }

    public static final Object z(yj5 yj5Var, zw5 zw5Var) {
        zw5Var.getClass();
        Object objB = yj5Var.get(zw5Var);
        if (objB == null) {
            objB = zw5Var.b();
        }
        return ((lb8) objB).a(yj5Var);
    }
}
