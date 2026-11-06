package o;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.journeyapps.barcodescanner.BarcodeView;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenInformationViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenKeyboardViewModel;
import com.teamviewer.remotecontrollib.swig.RemoteScreenViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthQrScannerActivityViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationQrScannerActivityViewModel;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class xo1 {
    public static aw a = null;
    public static boolean b = false;
    public static Method c = null;
    public static boolean d = false;
    public static Field e;

    public static final void A(Function0 function0, fs4 fs4Var, boolean z, pw6 pw6Var, pd3 pd3Var, yy0 yy0Var, ux2 ux2Var, int i) {
        Function0 function1;
        int i2;
        ux2Var.Y(-171935091);
        if ((i & 6) == 0) {
            function1 = function0;
            i2 = (ux2Var.h(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(pw6Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.f(pd3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ux2Var.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 8388608 : 4194304;
        }
        byte b2 = 1;
        if (ux2Var.N(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new ji2((byte) 21);
                ux2Var.g0(objK);
            }
            fs4 fs4VarA = cp6.a(fs4Var, false, (Function1) objK);
            long j = z ? pd3Var.a : pd3Var.c;
            long j2 = z ? pd3Var.b : pd3Var.d;
            yy0 yy0VarO = au8.O(669231714, new np2(yy0Var, b2), ux2Var);
            int i3 = i2 & 8078;
            int i4 = i2 << 9;
            ig7.b(function1, fs4VarA, z, pw6Var, j, j2, 0.0f, 0.0f, null, null, yy0VarO, ux2Var, (i4 & 1879048192) | i3 | (i4 & 234881024), 192);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new qd3(function0, fs4Var, z, pw6Var, pd3Var, yy0Var, i, (byte) 0);
        }
    }

    public static final void B(Function0 function0, ux2 ux2Var, int i) {
        int i2;
        Function0 function1;
        ux2 ux2Var2;
        ux2Var.Y(-1799412536);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            ux2Var2 = ux2Var;
            jj.b(uf0.u, function1, null, uf0.v, false, null, ka0.i(2, 12.0f), ux2Var2, ((i2 << 3) & 112) | 12585990, 372);
        } else {
            function1 = function0;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new xn4(function1, i, (byte) 7);
        }
    }

    public static final void C(jx4 jx4Var, Object obj, Object obj2) {
        int iF = jx4Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : jx4Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof kx4) {
                ((kx4) obj3).a(obj2);
            } else if (obj3 != obj2) {
                kx4 kx4Var = new kx4();
                kx4Var.a(obj3);
                kx4Var.a(obj2);
                obj2 = kx4Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            jx4Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        jx4Var.b[i] = obj;
        jx4Var.c[i] = obj2;
    }

    public static void D(k17 k17Var, List list, s01 s01Var) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = k17Var.c((px2) list.get(i));
            int iM = k17Var.M(k17Var.b, k17Var.q(iC));
            Object obj = iM < k17Var.f(k17Var.b, k17Var.q(iC + 1)) ? k17Var.c[k17Var.g(iM)] : e01.a;
            j56 j56Var = obj instanceof j56 ? (j56) obj : null;
            if (j56Var != null) {
                j56Var.a = s01Var;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object F(o.ug7 r6, o.i30 r7) {
        /*
            boolean r0 = r7 instanceof o.lo6
            if (r0 == 0) goto L13
            r0 = r7
            o.lo6 r0 = (o.lo6) r0
            int r1 = r0.f1388o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1388o = r1
            goto L18
        L13:
            o.lo6 r0 = new o.lo6
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.n
            int r1 = r0.f1388o
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            o.ug7 r6 = r0.m
            o.ct1.a0(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r6)
            r6 = 0
            return r6
        L2e:
            o.ct1.a0(r7)
        L31:
            r0.m = r6
            r0.f1388o = r2
            o.cn5 r7 = o.cn5.n
            java.lang.Object r7 = r6.a(r7, r0)
            o.ne1 r1 = o.ne1.m
            if (r7 != r1) goto L40
            return r1
        L40:
            o.bn5 r7 = (o.bn5) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            o.in5 r5 = (o.in5) r5
            boolean r5 = o.qs1.C(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xo1.F(o.ug7, o.i30):java.lang.Object");
    }

    public static jx4 G() {
        long[] jArr = ti6.a;
        return new jx4();
    }

    public static final ul7 H(sl7 sl7Var, int i, Function0 function0, ux2 ux2Var, int i2) {
        return new ul7(sl7Var, m77.z(i, ux2Var), g37.n, m77.z(i, ux2Var), null, function0, 168);
    }

    public static boolean I(ViewGroup viewGroup) {
        if (viewGroup == null) {
            ye4.c("GUIHelperFuncs", "destroySoftKeyboard(): can't destroy - viewgroup is null!");
            return false;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && !(childAt instanceof EditText) && (childAt instanceof ViewGroup) && I((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(ex3 ex3Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (ex3Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return ex3Var.s(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!b) {
                            try {
                                c = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            b = true;
                        }
                        Method method = c;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (be8.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!d) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        e = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    d = true;
                }
                Field field = e;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (be8.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && be8.c(view, keyEvent)) || ex3Var.s(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final long K(long j, boolean z, int i, float f) {
        int i2 = ((z || i == 2 || i == 4 || i == 5) && r61.e(j)) ? r61.i(j) : Integer.MAX_VALUE;
        if (r61.k(j) != i2) {
            i2 = ct1.v(v67.f(f), r61.k(j), i2);
        }
        return kh.t(0, i2, 0, r61.h(j));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object L(go2 go2Var, hw2 hw2Var, jc1 jc1Var) {
        fp2 fp2Var;
        k76 k76Var;
        j e2;
        q5 q5Var;
        hr2 hr2Var = g68.s;
        if (jc1Var instanceof fp2) {
            fp2Var = (fp2) jc1Var;
            int i = fp2Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                fp2Var.p = i - Integer.MIN_VALUE;
            } else {
                fp2Var = new fp2(jc1Var);
            }
        } else {
            fp2Var = new fp2(jc1Var);
        }
        Object obj = fp2Var.f820o;
        int i2 = fp2Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            k76 k76Var2 = new k76();
            k76Var2.m = hr2Var;
            q5 q5Var2 = new q5(hw2Var, k76Var2, (byte) 2);
            try {
                fp2Var.m = k76Var2;
                fp2Var.n = q5Var2;
                fp2Var.p = 1;
                Object objB = go2Var.b(q5Var2, fp2Var);
                Object obj2 = ne1.m;
                if (objB == obj2) {
                    return obj2;
                }
                k76Var = k76Var2;
            } catch (j e3) {
                k76Var = k76Var2;
                e2 = e3;
                q5Var = q5Var2;
                if (e2.m == q5Var) {
                    throw e2;
                }
                ds1.H(fp2Var.getContext());
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q5Var = fp2Var.n;
            k76Var = fp2Var.m;
            try {
                ct1.a0(obj);
            } catch (j e4) {
                e2 = e4;
                if (e2.m == q5Var) {
                    throw e2;
                }
                ds1.H(fp2Var.getContext());
            }
        }
        Object obj3 = k76Var.m;
        if (obj3 != hr2Var) {
            return obj3;
        }
        an4.j("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object M(go2 go2Var, jc1 jc1Var) {
        gp2 gp2Var;
        k76 k76Var;
        j e2;
        yi yiVar;
        if (jc1Var instanceof gp2) {
            gp2Var = (gp2) jc1Var;
            int i = gp2Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                gp2Var.p = i - Integer.MIN_VALUE;
            } else {
                gp2Var = new gp2(jc1Var);
            }
        } else {
            gp2Var = new gp2(jc1Var);
        }
        Object obj = gp2Var.f911o;
        int i2 = gp2Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            k76Var = new k76();
            yi yiVar2 = new yi(k76Var, (byte) 7);
            try {
                gp2Var.m = k76Var;
                gp2Var.n = yiVar2;
                gp2Var.p = 1;
                Object objB = go2Var.b(yiVar2, gp2Var);
                Object obj2 = ne1.m;
                if (objB == obj2) {
                    return obj2;
                }
            } catch (j e3) {
                e2 = e3;
                yiVar = yiVar2;
                if (e2.m == yiVar) {
                    throw e2;
                }
                ds1.H(gp2Var.getContext());
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yiVar = gp2Var.n;
            k76Var = gp2Var.m;
            try {
                ct1.a0(obj);
            } catch (j e4) {
                e2 = e4;
                if (e2.m == yiVar) {
                    throw e2;
                }
                ds1.H(gp2Var.getContext());
            }
        }
        return k76Var.m;
    }

    public static hr4 N(hr4 hr4Var, j04 j04Var, ot7 ot7Var, in1 in1Var, mr2 mr2Var) {
        if (hr4Var != null && j04Var == hr4Var.a && y57.C(ot7Var, j04Var).equals(hr4Var.b) && in1Var.getDensity() == hr4Var.c.m && mr2Var == hr4Var.d) {
            return hr4Var;
        }
        hr4 hr4Var2 = hr4.h;
        if (hr4Var2 != null && j04Var == hr4Var2.a && y57.C(ot7Var, j04Var).equals(hr4Var2.b) && in1Var.getDensity() == hr4Var2.c.m && mr2Var == hr4Var2.d) {
            return hr4Var2;
        }
        hr4 hr4Var3 = new hr4(j04Var, y57.C(ot7Var, j04Var), new ln1(in1Var.getDensity(), in1Var.Z()), mr2Var);
        hr4.h = hr4Var3;
        return hr4Var3;
    }

    public static ColorStateList O(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM = hm3.m(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM;
    }

    public static ColorStateList P(Context context, ep3 ep3Var, int i) {
        int resourceId;
        ColorStateList colorStateListM;
        TypedArray typedArray = (TypedArray) ep3Var.f733o;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM = hm3.m(context, resourceId)) == null) ? ep3Var.i(i) : colorStateListM;
    }

    public static Drawable Q(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableP;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableP = uf0.p(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableP;
    }

    public static boolean R(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final boolean S(bu5 bu5Var) {
        bu5Var.getClass();
        return bu5Var.getGetter() == null;
    }

    public static final boolean T(lf6 lf6Var) {
        long j = lf6Var.e;
        return (j >>> 32) == (4294967295L & j) && j == lf6Var.f && j == lf6Var.g && j == lf6Var.h;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0165, code lost:
    
        if (r3 == r13) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U(o.ug7 r17, io.sentry.android.core.n1 r18, o.ae r19, o.bn5 r20, o.i30 r21) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xo1.U(o.ug7, io.sentry.android.core.n1, o.ae, o.bn5, o.i30):java.lang.Object");
    }

    public static final boolean V(jx4 jx4Var, Object obj, Object obj2) {
        Object objG = jx4Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof kx4)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            jx4Var.k(obj);
            return true;
        }
        kx4 kx4Var = (kx4) objG;
        boolean zL = kx4Var.l(obj2);
        if (zL && kx4Var.g()) {
            jx4Var.k(obj);
        }
        return zL;
    }

    public static final void W(jx4 jx4Var, Object obj) {
        boolean zG;
        long[] jArr = jx4Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = jx4Var.b[i4];
                        Object obj3 = jx4Var.c[i4];
                        if (obj3 instanceof kx4) {
                            kx4 kx4Var = (kx4) obj3;
                            kx4Var.l(obj);
                            zG = kx4Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            jx4Var.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final boolean X(oz3 oz3Var) {
        ys0 ys0VarA = oz3Var.o0().a();
        if (ys0VarA != null && ((pi3.b(ys0VarA) && pi3.e(ys0VarA) && !bp1.g((ns4) ys0VarA).equals(t87.h)) || pi3.f(oz3Var))) {
            return true;
        }
        ys0 ys0VarA2 = oz3Var.o0().a();
        d58 d58Var = ys0VarA2 instanceof d58 ? (d58) ys0VarA2 : null;
        return d58Var != null && X(n37.n(d58Var));
    }

    public static m58 Y(List list, k58 k58Var, fi1 fi1Var, ArrayList arrayList) throws l58 {
        if (k58Var == null) {
            a(1);
            throw null;
        }
        if (fi1Var == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        m58 m58VarZ = Z(list, k58Var, fi1Var, arrayList, null);
        if (m58VarZ != null) {
            return m58VarZ;
        }
        throw new AssertionError("Substitution failed");
    }

    public static m58 Z(List list, k58 k58Var, fi1 fi1Var, List list2, boolean[] zArr) throws l58 {
        if (k58Var == null) {
            a(6);
            throw null;
        }
        if (fi1Var == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            d58 d58Var = (d58) it.next();
            int i2 = i + 1;
            e58 e58VarF0 = e58.F0(i, d58Var.getAnnotations(), fi1Var, d58Var.P(), d58Var.getName(), d58Var.B(), d58Var.w());
            map.put(d58Var.q(), new w87(e58VarF0.W()));
            map2.put(d58Var, e58VarF0);
            list2.add(e58VarF0);
            i = i2;
        }
        byte b2 = 1;
        x87 x87Var = new x87(map, b2);
        m58 m58VarE = m58.e(k58Var, x87Var);
        m58 m58VarE2 = m58.e(new zl0(k58Var, b2), x87Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            d58 d58Var2 = (d58) it2.next();
            e58 e58Var = (e58) map2.get(d58Var2);
            for (oz3 oz3Var : d58Var2.getUpperBounds()) {
                ys0 ys0VarA = oz3Var.o0().a();
                oz3 oz3VarH = (((ys0VarA instanceof d58) && n37.p((d58) ys0VarA, null, null)) ? m58VarE : m58VarE2).h(oz3Var, ub8.q);
                if (oz3VarH == null) {
                    return null;
                }
                if (oz3VarH != oz3Var && zArr != null) {
                    zArr[0] = true;
                }
                if (e58Var.x) {
                    hk0.l("Type parameter descriptor is already initialized: ".concat(e58Var.H0()));
                    return null;
                }
                if (!ct1.K(oz3VarH)) {
                    e58Var.w.add(oz3VarH);
                }
            }
            if (e58Var.x) {
                hk0.l("Type parameter descriptor is already initialized: ".concat(e58Var.H0()));
                return null;
            }
            e58Var.x = true;
        }
        return m58VarE;
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a0(o.ug7 r12, o.zp7 r13, o.bn5 r14, o.i30 r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xo1.a0(o.ug7, o.zp7, o.bn5, o.i30):java.lang.Object");
    }

    public static final void b(int i, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        ux2Var.Y(-897460801);
        byte b2 = 2;
        int i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4.b, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new yv1(function0, (byte) 15);
                ux2Var.g0(objK);
            }
            g57.b((Function0) objK, fs4VarC, null, false, "TVTA-qrCodeAssignmentScreen-PinVerificationBottomSheet-cancel", null, im3.h, ux2Var, 1597488, 44);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new x71(function0, fs4Var, i, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(o.ug7 r11, o.zp7 r12, o.bn5 r13, int r14, o.i30 r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xo1.b0(o.ug7, o.zp7, o.bn5, int, o.i30):java.lang.Object");
    }

    public static final void c(Function0 function0, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-1107778482);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            jj.b(uf0.s, function0, null, uf0.t, false, null, ka0.i(2, 12.0f), ux2Var, ((i2 << 3) & 112) | 12585990, 372);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new xn4(function0, i, b2);
        }
    }

    public static final void d(ov1 ov1Var, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        Integer numValueOf;
        ov1Var.getClass();
        function0.getClass();
        ux2Var.Y(879533320);
        byte b2 = 2;
        int i2 = i | (ux2Var.d(ov1Var.ordinal()) ? 4 : 2) | (ux2Var.h(function0) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            int iOrdinal = ov1Var.ordinal();
            if (iOrdinal != 0) {
                numValueOf = iOrdinal != 1 ? null : Integer.valueOf(R.drawable.ic_person_add);
            } else {
                numValueOf = Integer.valueOf(R.drawable.ic_add);
            }
            cs4 cs4Var = cs4.b;
            if (numValueOf == null) {
                ux2Var.W(-1418006842);
                ux2Var.p(false);
            } else {
                ux2Var.W(-1418006841);
                int iIntValue = numValueOf.intValue();
                fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devices-fab");
                h72 h72Var = un4.a;
                ct1.b(function0, fs4VarA, null, ((rn4) ux2Var.j(h72Var)).a.G, ((rn4) ux2Var.j(h72Var)).a.a, null, au8.O(-2595884, new w81(iIntValue, b2), ux2Var), ux2Var, ((i2 >> 3) & 14) | 12582912, 100);
                ux2Var.p(false);
            }
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new f9((Object) ov1Var, (Object) function0, (Object) fs4Var2, i, (byte) 10);
        }
    }

    public static final void e(Function0 function0, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(1837612416);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            jj.b(uf0.w, function0, androidx.compose.ui.platform.a.a(cs4.b, "TVTA-devicesScreen-serviceQueue-editSessionAction"), uf0.x, false, null, ka0.i(2, 12.0f), ux2Var, ((i2 << 3) & 112) | 12586374, 368);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new xn4(function0, i, (byte) 8);
        }
    }

    public static final void f(boolean z, boolean z2, Function1 function1, int i, Function0 function0, fs4 fs4Var, String str, ux2 ux2Var, int i2) {
        String str2;
        function1.getClass();
        function0.getClass();
        ux2Var.Y(-2070993068);
        int i3 = i2 | (ux2Var.g(z) ? 4 : 2) | (ux2Var.g(z2) ? 32 : 16) | (ux2Var.h(function1) ? 256 : 128) | (ux2Var.d(i) ? 2048 : 1024) | (ux2Var.h(function0) ? 16384 : 8192) | (ux2Var.f(fs4Var) ? 131072 : 65536) | 1572864;
        if (ux2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            if (z) {
                ux2Var.W(250991116);
                z(i, ((i3 >> 6) & 7168) | ((i3 >> 9) & 126) | 384, function0, ux2Var, fs4Var);
                ux2Var.p(false);
            } else {
                ux2Var.W(251158299);
                q(z2, function1, fs4Var, ux2Var, ((i3 >> 6) & 7168) | ((i3 >> 3) & 126) | 384);
                ux2Var.p(false);
            }
            str2 = "TVTA-settings-udp";
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ic(z, z2, function1, i, function0, fs4Var, str2, i2, (byte) 1);
        }
    }

    public static final void g(Function0 function0, fs4 fs4Var, boolean z, pw6 pw6Var, pd3 pd3Var, yy0 yy0Var, ux2 ux2Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        ux2Var.Y(947208840);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= ux2Var.f(pw6Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var.f(pd3Var) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
            i4 |= ux2Var.h(yy0Var) ? 1048576 : 524288;
        }
        if (ux2Var.N(i4 & 1, (599187 & i4) != 599186)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                z3 = true;
            } else {
                ux2Var.Q();
                z3 = z;
            }
            ux2Var.q();
            int i5 = (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4);
            int i6 = i4 << 3;
            A(function0, fs4Var, z3, pw6Var, pd3Var, yy0Var, ux2Var, i5 | (3670016 & i6) | (i6 & 29360128));
            z2 = z3;
        } else {
            ux2Var.Q();
            z2 = z;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new qd3(function0, fs4Var, z2, pw6Var, pd3Var, yy0Var, i, (byte) 1);
        }
    }

    public static IRemoteScreenInformationViewModel h(int i) {
        long jRemoteScreenViewModelsFactory_GetRemoteScreenInformationViewModel = RemoteScreenViewModelFactorySWIGJNI.RemoteScreenViewModelsFactory_GetRemoteScreenInformationViewModel(i);
        if (jRemoteScreenViewModelsFactory_GetRemoteScreenInformationViewModel == 0) {
            return null;
        }
        IRemoteScreenInformationViewModel iRemoteScreenInformationViewModel = new IRemoteScreenInformationViewModel();
        iRemoteScreenInformationViewModel.b = true;
        iRemoteScreenInformationViewModel.a = jRemoteScreenViewModelsFactory_GetRemoteScreenInformationViewModel;
        return iRemoteScreenInformationViewModel;
    }

    public static IRemoteScreenKeyboardViewModel i(int i) {
        long jRemoteScreenViewModelsFactory_GetRemoteScreenKeyboardViewModel = RemoteScreenViewModelFactorySWIGJNI.RemoteScreenViewModelsFactory_GetRemoteScreenKeyboardViewModel(i);
        if (jRemoteScreenViewModelsFactory_GetRemoteScreenKeyboardViewModel == 0) {
            return null;
        }
        IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModel = new IRemoteScreenKeyboardViewModel();
        iRemoteScreenKeyboardViewModel.b = true;
        iRemoteScreenKeyboardViewModel.a = jRemoteScreenViewModelsFactory_GetRemoteScreenKeyboardViewModel;
        return iRemoteScreenKeyboardViewModel;
    }

    public static final void j(boolean z, Function1 function1, Function1 function2, ux2 ux2Var, int i) {
        function1.getClass();
        ux2Var.Y(-1012986508);
        int i2 = (ux2Var.g(z) ? 4 : 2) | i | (ux2Var.h(function1) ? 32 : 16) | (ux2Var.h(function2) ? 256 : 128);
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            px4 px4VarT = h57.t(function1, ux2Var);
            px4 px4VarT2 = h57.t(function2, ux2Var);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = h57.p(Boolean.FALSE);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) objK;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zF = ux2Var.f(px4VarT) | ((i2 & 14) == 4) | ux2Var.f(px4VarT2);
            Object objK2 = ux2Var.K();
            if (zF || objK2 == awVar) {
                ko2 ko2Var = new ko2(z, px4Var, px4VarT, px4VarT2, null, (byte) 7);
                ux2Var.g0(ko2Var);
                objK2 = ko2Var;
            }
            ck3.i(boolValueOf, (hw2) objK2, ux2Var);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new rv6(z, function1, function2, i);
        }
    }

    public static final void k(Function0 function0, fs4 fs4Var, boolean z, pd3 pd3Var, pw6 pw6Var, hw2 hw2Var, ux2 ux2Var, int i, int i2) {
        int i3;
        pw6 pw6Var2;
        hw2 hw2Var2;
        fs4 fs4Var2;
        boolean z2;
        pd3 pd3VarO;
        int i4;
        pw6 pw6VarB;
        boolean z3;
        ux2Var.Y(1413012038);
        if ((i & 6) == 0) {
            i3 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= ux2Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && ux2Var.f(pd3Var)) ? 2048 : 1024;
        }
        int i7 = i3 | 24576;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                pw6Var2 = pw6Var;
                int i8 = ux2Var.f(pw6Var2) ? 131072 : 65536;
                i7 |= i8;
            } else {
                pw6Var2 = pw6Var;
            }
            i7 |= i8;
        } else {
            pw6Var2 = pw6Var;
        }
        if ((1572864 & i) == 0) {
            hw2Var2 = hw2Var;
            i7 |= ux2Var.h(hw2Var2) ? 1048576 : 524288;
        } else {
            hw2Var2 = hw2Var;
        }
        if (ux2Var.N(i7 & 1, (599187 & i7) != 599186)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                if (i5 != 0) {
                    fs4Var = cs4.b;
                }
                boolean z4 = i6 == 0 ? z : true;
                if ((i2 & 8) != 0) {
                    pd3VarO = d82.o(ux2Var);
                    i7 &= -7169;
                } else {
                    pd3VarO = pd3Var;
                }
                if ((i2 & 32) != 0) {
                    i4 = i7 & (-458753);
                    pw6VarB = ux6.b(ka0.v, ux2Var);
                } else {
                    i4 = i7;
                    pw6VarB = pw6Var2;
                }
                z3 = z4;
            } else {
                ux2Var.Q();
                if ((i2 & 8) != 0) {
                    i7 &= -7169;
                }
                if ((i2 & 32) != 0) {
                    i7 &= -458753;
                }
                int i9 = i7;
                fs4Var = fs4Var;
                i4 = i9;
                z3 = z;
                pd3VarO = pd3Var;
                pw6VarB = pw6Var2;
            }
            ux2Var.q();
            int i10 = i4 << 3;
            l(fs4Var, function0, z3, pw6VarB, pd3VarO, hw2Var2, ux2Var, (i4 & 3670016) | ((i4 >> 3) & 14) | (i10 & 112) | (i4 & 896) | ((i4 >> 6) & 7168) | (57344 & i10) | (i10 & 458752));
            pw6Var2 = pw6VarB;
            z2 = z3;
            fs4Var2 = fs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            z2 = z;
            pd3VarO = pd3Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new w4(function0, fs4Var2, z2, pd3VarO, pw6Var2, hw2Var, i, i2);
        }
    }

    public static final void l(fs4 fs4Var, Function0 function0, boolean z, pw6 pw6Var, pd3 pd3Var, hw2 hw2Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-1134296466);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(pw6Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.f(pd3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ux2Var.h(hw2Var) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (ux2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            ux2Var.W(976976045);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = ua5.s(ux2Var);
            }
            mw4 mw4Var = (mw4) objK;
            ux2Var.p(false);
            b63 b63Var = ml3.a;
            fs4 fs4VarF = fs4Var.f(jr4.b);
            long jY = d82.y();
            FillElement fillElement = androidx.compose.foundation.layout.b.a;
            fs4 fs4VarQ = ck3.q(androidx.compose.foundation.b.a(au8.s(iq8.j(androidx.compose.foundation.layout.b.m(fs4VarF, a42.b(jY), a42.a(jY)), pw6Var), z ? pd3Var.a : pd3Var.c, pw6Var), mw4Var, zd6.a(false, 0.0f, 0L, pw6Var, 247), z, new pe6(0), function0, 8));
            do4 do4VarC = ua0.c(xz2.s, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarQ);
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
            j51.l(wa1.a.a(new rv0(z ? pd3Var.b : pd3Var.d)), hw2Var, ux2Var, ((i3 >> 15) & 112) | 8);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new fb(fs4Var, function0, z, pw6Var, pd3Var, hw2Var, i);
        }
    }

    public static final void m(final j74 j74Var, final f74 f74Var, fs4 fs4Var, final k74 k74Var, nd5 nd5Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        nd5 nd5Var2;
        nd5 nd5Var3;
        int i2;
        fs4 fs4Var3;
        j74Var.getClass();
        xl1 xl1Var = f74Var.a;
        k74Var.getClass();
        ux2Var.Y(253390812);
        int i3 = i | (ux2Var.f(j74Var) ? 4 : 2) | (ux2Var.d(0) ? 32 : 16) | (ux2Var.f(f74Var) ? 256 : 128) | 3072 | (ux2Var.f(k74Var) ? 16384 : 8192) | 65536 | (ux2Var.h(null) ? 1048576 : 524288);
        if (ux2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                nd5Var3 = f74Var.b.c;
                i2 = i3 & (-458753);
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                i2 = i3 & (-458753);
                fs4Var3 = fs4Var;
                nd5Var3 = nd5Var;
            }
            ux2Var.q();
            boolean z = (i2 & 14) == 4;
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                String strT0 = lv0.t0(j74Var.i, "\n\n\n\n", null, null, new h31((byte) 28), 30);
                Object obj = ub7.b0(strT0) ? null : strT0;
                ux2Var.g0(obj);
                objK = obj;
            }
            final String str = (String) objK;
            final long jI = et1.I(xl1Var.c, rv0.b);
            final long jI2 = et1.I(xl1Var.d, rv0.b(0.6f, jI));
            final long jI3 = et1.I(xl1Var.k, rv0.b(0.08f, jI));
            final nd5 nd5Var4 = nd5Var3;
            j51.g(androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f), null, false, au8.O(17155142, new iw2() { // from class: o.q74
                @Override // o.iw2
                public final Object d(Object obj2, Object obj3, Object obj4) {
                    fs4 fs4VarZ;
                    long j;
                    ot7 ot7Var;
                    boolean z2;
                    ab0 ab0Var = (ab0) obj2;
                    ux2 ux2Var2 = (ux2) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ab0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ux2Var2.f(ab0Var) ? 4 : 2;
                    }
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                        boolean zD = r61.d(ab0Var.b);
                        cs4 cs4Var = cs4.b;
                        if (zD) {
                            ux2Var2.W(-693775317);
                            fs4VarZ = im3.Z(cs4Var, im3.W(ux2Var2), true);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(-693773970);
                            ux2Var2.p(false);
                            fs4VarZ = cs4Var;
                        }
                        fs4 fs4VarF = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f).f(fs4VarZ);
                        WeakHashMap weakHashMap = wk8.w;
                        fs4 fs4VarA = ka0.A(pm8.L(fs4VarF, new h94(new c88(b77.g(ux2Var2).g, b77.g(ux2Var2).b), 32)), nd5Var4);
                        kw0 kw0VarA = iw0.a(new ew(12.0f, new hk0((byte) 2)), xz2.A, ux2Var2, 6);
                        int iHashCode = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL = ux2Var2.l();
                        fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA);
                        yz0.c.getClass();
                        ux2Var2.a0();
                        boolean z3 = ux2Var2.S;
                        tg3 tg3Var = LayoutNode.e0;
                        if (z3) {
                            ux2Var2.k(tg3Var);
                        } else {
                            ux2Var2.j0();
                        }
                        iz0 iz0Var = d82.v;
                        o67.n(kw0VarA, iz0Var, ux2Var2);
                        iz0 iz0Var2 = d82.u;
                        o67.n(yj5VarL, iz0Var2, ux2Var2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        iz0 iz0Var3 = d82.w;
                        o67.n(numValueOf, iz0Var3, ux2Var2);
                        o67.l(ux2Var2);
                        iz0 iz0Var4 = d82.t;
                        o67.n(fs4VarS, iz0Var4, ux2Var2);
                        j74 j74Var2 = j74Var;
                        String str2 = j74Var2.c;
                        f74 f74Var2 = f74Var;
                        bm1 bm1Var = f74Var2.d;
                        ot7 ot7Var2 = bm1Var.e;
                        ot7 ot7Var3 = bm1Var.g;
                        long j2 = jI;
                        j51.e(str2, null, ot7.a(ot7Var2, j2, 0L, null, null, 0L, 0L, null, 16777214), null, 0, false, 0, 0, ux2Var2, 0, 1018);
                        String strK = lv1.K(j74Var2);
                        String str3 = j74Var2.b;
                        boolean zB0 = ub7.b0(strK);
                        long j3 = jI2;
                        if (zB0 && (str3 == null || ub7.b0(str3))) {
                            ux2Var2.W(375955666);
                            ux2Var2.p(false);
                            j = j3;
                        } else {
                            ux2Var2.W(375676015);
                            boolean zF = ux2Var2.f(strK) | ux2Var2.f(str3);
                            Object objK2 = ux2Var2.K();
                            if (zF || objK2 == e01.a) {
                                if (ub7.b0(strK)) {
                                    strK = null;
                                }
                                objK2 = lv0.t0(cx.Q0(new String[]{strK, str3}), " · ", null, null, null, 62);
                                ux2Var2.g0(objK2);
                            }
                            j = j3;
                            j51.e((String) objK2, null, ot7.a(bm1Var.f, j, 0L, null, null, 0L, 0L, null, 16777214), null, 0, false, 0, 0, ux2Var2, 0, 1018);
                            ux2Var2.p(false);
                        }
                        String str4 = j74Var2.d;
                        if (str4 == null || ub7.b0(str4)) {
                            ot7Var = ot7Var3;
                            ux2Var2.W(376176882);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(376056757);
                            ot7Var = ot7Var3;
                            j51.e(str4, null, ot7.a(ot7Var, j2, 0L, null, null, 0L, 0L, null, 16777214), null, 0, false, 0, 0, ux2Var2, 0, 1018);
                            ux2Var2.p(false);
                        }
                        wo1.i(j74Var2, f74Var2, null, k74Var, null, ux2Var2, 0, 72);
                        String str5 = str;
                        if (str5 != null) {
                            ux2Var2.W(376471878);
                            fs4 fs4VarB = ka0.B(au8.s(iq8.j(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), f74Var2.e.d), jI3, kh.V), 14.0f);
                            do4 do4VarC = ua0.c(xz2.f2564o, false);
                            int iHashCode2 = Long.hashCode(ux2Var2.T);
                            yj5 yj5VarL2 = ux2Var2.l();
                            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarB);
                            ux2Var2.a0();
                            if (ux2Var2.S) {
                                ux2Var2.k(tg3Var);
                            } else {
                                ux2Var2.j0();
                            }
                            o67.n(do4VarC, iz0Var, ux2Var2);
                            o67.n(yj5VarL2, iz0Var2, ux2Var2);
                            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
                            o67.n(fs4VarS2, iz0Var4, ux2Var2);
                            j51.e(str5, null, ot7.a(ot7Var, j, 0L, null, null, 0L, 0L, null, 16777214), null, 0, false, 0, 0, ux2Var2, 0, 1018);
                            z2 = true;
                            ux2Var2.p(true);
                            ux2Var2.p(false);
                        } else {
                            z2 = true;
                            ux2Var2.W(376883186);
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(z2);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, 3072, 6);
            nd5Var2 = nd5Var4;
            fs4Var2 = fs4Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            nd5Var2 = nd5Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new o31((Object) j74Var, (Object) f74Var, fs4Var2, (Object) k74Var, (Object) nd5Var2, i, (byte) 6);
        }
    }

    public static final void n(fs4 fs4Var, ux2 ux2Var, int i) {
        ux2Var.Y(1749915695);
        if (ux2Var.N(i & 1, (i & 3) != 2)) {
            do4 do4VarC = ua0.c(xz2.s, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
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
            st5.a(androidx.compose.foundation.layout.b.l(cs4.b, 36.0f), ((rn4) ux2Var.j(un4.a)).a.a, 4.0f, 0L, 0, 0.0f, ux2Var, 390, 56);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var, i, (byte) 6);
        }
    }

    public static final void o(int i, String str, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        String str2;
        function0.getClass();
        ux2Var.Y(2014702776);
        int i2 = (ux2Var.h(function0) ? 4 : 2) | i | (ux2Var.f(fs4Var) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            str2 = "TVTA-settings-showLogFile";
            x37.e(new sk7(y57.g(R.string.settings_menuShowLogFile), null, new yk7(R.drawable.task_list_square), null, 26), fs4Var, null, function0, "TVTA-settings-showLogFile", ux2Var, ((i2 << 9) & 7168) | (i2 & 112) | 24576, 36);
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gd1(function0, fs4Var, str2, i, (byte) 3);
        }
    }

    public static final void p(int i, String str, String str2, ux2 ux2Var, fs4 fs4Var) {
        int i2;
        ux2 ux2Var2;
        str.getClass();
        str2.getClass();
        ux2Var.Y(749196277);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        byte b2 = 0;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            ux2Var2 = ux2Var;
            j51.g(fs4Var.f(androidx.compose.foundation.layout.b.c), null, false, au8.O(-1417602357, new u35(str, str2, b2), ux2Var), ux2Var2, 3072, 6);
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new v35(str, str2, fs4Var, i);
        }
    }

    public static final void q(boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        Function1 function2;
        fs4 fs4Var2;
        ux2Var.Y(-46149692);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function2 = function1;
            i2 |= ux2Var.h(function2) ? 32 : 16;
        } else {
            function2 = function1;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f("TVTA-settings-udp") ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            fs4Var2 = fs4Var;
            i2 |= ux2Var.f(fs4Var2) ? 2048 : 1024;
        } else {
            fs4Var2 = fs4Var;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            l47.d(new sk7(y57.g(R.string.tv_options_EnableUDP), y57.g(R.string.tv_options_EnableUDPDesc), new yk7(R.drawable.globe_information), null, 24), z, function2, fs4Var2, "TVTA-settings-udp", m77.z(R.string.tv_options_EnableUDP, ux2Var), ux2Var, ((i2 << 3) & 1008) | (i2 & 7168) | ((i2 << 6) & 57344), 32);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new kc(z, function1, fs4Var, i, (byte) 1);
        }
    }

    public static final void r(final boolean z, final boolean z2, final boolean z3, final int i, final String str, final Function1 function1, final Function0 function0, final Function0 function2, fs4 fs4Var, xy6 xy6Var, ux2 ux2Var, final int i2) {
        int i3;
        int i4;
        Function1 function3;
        Function0 function4;
        final fs4 fs4Var2;
        final xy6 xy6Var2;
        int i5;
        fs4 fs4Var3;
        byte b2;
        String str2;
        str.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        ux2Var.Y(-1318995533);
        int i6 = 2;
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.g(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 = i;
            i3 |= ux2Var.d(i4) ? 2048 : 1024;
        } else {
            i4 = i;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ux2Var.f(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function3 = function1;
            i3 |= ux2Var.h(function3) ? 131072 : 65536;
        } else {
            function3 = function1;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ux2Var.h(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            function4 = function2;
            i3 |= ux2Var.h(function4) ? 8388608 : 4194304;
        } else {
            function4 = function2;
        }
        int i7 = i3 | 369098752;
        if (ux2Var.N(i7 & 1, (306783379 & i7) != 306783378)) {
            ux2Var.S();
            int i8 = i2 & 1;
            Object obj = e01.a;
            if (i8 == 0 || ux2Var.x()) {
                Object objK = ux2Var.K();
                if (objK == obj) {
                    objK = new le5((byte) 5);
                    ux2Var.g0(objK);
                }
                xy6 xy6VarR = yo1.R((Function1) objK, ux2Var, 54, 0);
                i5 = i7 & (-1879048193);
                fs4Var3 = cs4.b;
                xy6Var2 = xy6VarR;
            } else {
                ux2Var.Q();
                i5 = i7 & (-1879048193);
                fs4Var3 = fs4Var;
                xy6Var2 = xy6Var;
            }
            ux2Var.q();
            Object objK2 = ux2Var.K();
            if (objK2 == obj) {
                objK2 = ck3.w(ux2Var);
                ux2Var.g0(objK2);
            }
            final me1 me1Var = (me1) objK2;
            px4 px4VarT = h57.t(function0, ux2Var);
            Object objK3 = ux2Var.K();
            byte b3 = 13;
            if (objK3 == obj) {
                objK3 = new l5(i6, null, b3);
                ux2Var.g0(objK3);
            }
            ck3.i(f88.a, (hw2) objK3, ux2Var);
            boolean zF = ((57344 & i5) == 16384) | ((i5 & 14) == 4) | ((i5 & 112) == 32) | ux2Var.f(px4VarT);
            Object objK4 = ux2Var.K();
            if (zF || objK4 == obj) {
                b2 = 13;
                Object gg1Var = new gg1(str, z, z2, px4VarT, null);
                str2 = str;
                ux2Var.g0(gg1Var);
                objK4 = gg1Var;
            } else {
                b2 = 13;
                str2 = str;
            }
            ck3.i(str2, (hw2) objK4, ux2Var);
            Object objK5 = ux2Var.K();
            if (objK5 == obj) {
                objK5 = new x85(b2);
                ux2Var.g0(objK5);
            }
            final String str3 = str2;
            final int i9 = i4;
            final Function1 function5 = function3;
            final Function0 function6 = function4;
            fs4Var2 = fs4Var3;
            yo1.k((Function0) objK5, fs4Var2, xy6Var2, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-639567723, new iw2() { // from class: o.fl5
                @Override // o.iw2
                public final Object d(Object obj2, Object obj3, Object obj4) {
                    ux2 ux2Var2;
                    ux2 ux2Var3 = (ux2) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((lw0) obj2).getClass();
                    if (ux2Var3.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        w50 w50Var = xz2.B;
                        cs4 cs4Var = cs4.b;
                        fs4 fs4VarD = ka0.D(o77.t(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), im3.W(ux2Var3), me1Var), 16.0f, 0.0f, 2);
                        kw0 kw0VarA = iw0.a(iq8.c, w50Var, ux2Var3, 48);
                        int iHashCode = Long.hashCode(ux2Var3.T);
                        yj5 yj5VarL = ux2Var3.l();
                        fs4 fs4VarS = uf0.s(ux2Var3, fs4VarD);
                        yz0.c.getClass();
                        ux2Var3.a0();
                        if (ux2Var3.S) {
                            ux2Var3.k(LayoutNode.e0);
                        } else {
                            ux2Var3.j0();
                        }
                        o67.n(kw0VarA, d82.v, ux2Var3);
                        o67.n(yj5VarL, d82.u, ux2Var3);
                        o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var3);
                        o67.l(ux2Var3);
                        o67.n(fs4VarS, d82.t, ux2Var3);
                        String strZ = m77.z(R.string.scan_qr_enter_verification_pin, ux2Var3);
                        h72 h72Var = un4.a;
                        qs7.b(strZ, null, ((rn4) ux2Var3.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(h72Var)).b.g, ux2Var3, 0, 0, 131066);
                        lv1.k(ka0.F(cs4Var, 0.0f, 16.0f, 0.0f, 24.0f, 5), 0.0f, 0L, ux2Var3, 6, 6);
                        if (z3) {
                            ux2Var2 = ux2Var3;
                            ux2Var2.W(-461422803);
                            xo1.n(ka0.F(androidx.compose.foundation.layout.b.d(cs4Var, 200.0f), 0.0f, 0.0f, 0.0f, 24.0f, 7), ux2Var2, 6);
                            ux2Var2.p(false);
                        } else {
                            ux2Var3.W(-462188348);
                            qs7.b(m77.z(R.string.scan_qr_enter_verification_pin_description, ux2Var3), ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 32.0f, 7), ((rn4) ux2Var3.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(h72Var)).b.k, ux2Var3, 48, 0, 131064);
                            wo1.m(str3, i9, ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 32.0f, 7), function5, ux2Var3, 3456);
                            ux2Var2 = ux2Var3;
                            xo1.b(48, function6, ux2Var2, ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7));
                            ux2Var2.p(false);
                        }
                        ux2Var2.p(true);
                    } else {
                        ux2Var3.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, 54, 3072, 8184);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.gl5
                @Override // o.hw2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    xo1.r(z, z2, z3, i, str, function1, function0, function2, fs4Var2, xy6Var2, (ux2) obj2, yo1.Y(i2 | 1));
                    return f88.a;
                }
            };
        }
    }

    public static final void s(boolean z, hw2 hw2Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-642000585);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(hw2Var) ? 32 : 16;
        }
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objA = (n05) ux2Var.j(ed4.a);
            if (objA == null) {
                ux2Var.W(1512740606);
                objA = fd4.a(ux2Var);
            } else {
                ux2Var.W(1512737723);
            }
            ux2Var.p(false);
            if (objA == null) {
                hk0.l("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = ux2Var.f(objA);
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (zF || objK == obj) {
                n05 n05Var = objA instanceof n05 ? (n05) objA : null;
                j93 j93VarE = n05Var != null ? n05Var.e() : null;
                p75 p75Var = objA instanceof p75 ? (p75) objA : null;
                objK = new s10(j93VarE, p75Var != null ? p75Var.c() : null);
                ux2Var.g0(objK);
            }
            Object obj2 = (s10) objK;
            Object objK2 = ux2Var.K();
            if (objK2 == obj) {
                objK2 = ck3.w(ux2Var);
                ux2Var.g0(objK2);
            }
            me1 me1Var = (me1) objK2;
            long j = ux2Var.T;
            boolean zF2 = ux2Var.f(obj2) | ux2Var.e(j);
            Object objK3 = ux2Var.K();
            if (zF2 || objK3 == obj) {
                objK3 = new qz0(me1Var, new dq5(j, objA));
                ux2Var.g0(objK3);
            }
            qz0 qz0Var = (qz0) objK3;
            ux2Var.W(-348514256);
            boolean zH = ux2Var.h(qz0Var) | ux2Var.h(hw2Var);
            Object objK4 = ux2Var.K();
            if (zH || objK4 == obj) {
                objK4 = new ql1(qz0Var, hw2Var, (byte) 24);
                ux2Var.g0(objK4);
            }
            ck3.k((Function0) objK4, ux2Var);
            int i3 = i2;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean zH2 = ux2Var.h(qz0Var) | (i4 == 4);
            Object objK5 = ux2Var.K();
            if (zH2 || objK5 == obj) {
                objK5 = new x9((io.sentry.l6) qz0Var, z, (byte) 3);
                ux2Var.g0(objK5);
            }
            ds1.s(boolValueOf, qz0Var, null, (Function1) objK5, ux2Var, i4);
            boolean zH3 = ux2Var.h(obj2) | ux2Var.h(qz0Var);
            Object objK6 = ux2Var.K();
            if (zH3 || objK6 == obj) {
                objK6 = new o43(obj2, qz0Var, (byte) 25);
                ux2Var.g0(objK6);
            }
            ck3.d(obj2, qz0Var, (Function1) objK6, ux2Var);
            ux2Var.p(false);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hq1(z, hw2Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x033b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0349  */
    /* JADX WARN: Code duplicated, block: B:118:0x034b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0356  */
    /* JADX WARN: Code duplicated, block: B:126:0x0377  */
    /* JADX WARN: Code duplicated, block: B:128:0x038c  */
    public static final void t(boolean z, final Function1 function1, Function0 function0, final Function0 function2, fs4 fs4Var, yr1 yr1Var, ux2 ux2Var, int i) {
        int i2;
        Function0 function3;
        fs4 fs4Var2;
        yr1 yr1Var2;
        ux2 ux2Var2;
        int i3;
        int i4;
        final yr1 yr1Var3;
        fs4 fs4Var3;
        px4 px4Var;
        Context context;
        int i5;
        byte b2;
        byte b3;
        aw awVar;
        qk4 qk4VarX0;
        px4 px4Var2;
        boolean z2;
        boolean z3;
        Object objK;
        boolean zF;
        Object objK2;
        ux2 ux2Var3 = ux2Var;
        function1.getClass();
        function0.getClass();
        function2.getClass();
        ux2Var3.Y(162909298);
        if ((i & 6) == 0) {
            i2 = (ux2Var3.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var3.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var3.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var3.h(function2) ? 2048 : 1024;
        }
        int i6 = i2 | 24576;
        if ((196608 & i) == 0) {
            i6 = 90112 | i2;
        }
        int i7 = i6;
        byte b4 = 0;
        if (ux2Var3.N(i7 & 1, (74899 & i7) != 74898)) {
            ux2Var3.S();
            if ((i & 1) == 0 || ux2Var3.x()) {
                dl5 dl5Var = new dl5(new vr1(b4), (byte) 1);
                we8 we8VarA = id4.a(ux2Var3);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                i3 = 0;
                i4 = i7 & (-458753);
                yr1Var3 = (yr1) g57.t(w86.a.b(yr1.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var3);
                fs4Var3 = cs4.b;
            } else {
                ux2Var3.Q();
                fs4Var3 = fs4Var;
                i4 = i7 & (-458753);
                i3 = 0;
                yr1Var3 = yr1Var;
            }
            ux2Var3.q();
            Context context2 = (Context) ux2Var3.j(lh.b);
            Activity activity = (Activity) ux2Var3.j(tc4.a);
            Object[] objArr = new Object[i3];
            Object objK3 = ux2Var3.K();
            fs4 fs4Var4 = fs4Var3;
            aw awVar2 = e01.a;
            if (objK3 == awVar2) {
                objK3 = new x85((byte) 23);
                ux2Var3.g0(objK3);
            }
            px4 px4Var3 = (px4) zu1.L(objArr, (Function0) objK3, ux2Var3, 48);
            Object[] objArr2 = new Object[i3];
            Object objK4 = ux2Var3.K();
            if (objK4 == awVar2) {
                objK4 = new x85((byte) 24);
                ux2Var3.g0(objK4);
            }
            px4 px4Var4 = (px4) zu1.L(objArr2, (Function0) objK4, ux2Var3, 48);
            px4 px4VarT = h57.t(function1, ux2Var3);
            Object objK5 = ux2Var3.K();
            if (objK5 == awVar2) {
                objK5 = new q50(activity);
                ux2Var3.g0(objK5);
            }
            final q50 q50Var = (q50) objK5;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ux2Var3.j(dd4.a);
            int i8 = (i4 & 896) | 6;
            ul7 ul7VarH = H(sl7.m, R.string.settings_twoFactorAuthentication_scanned_successfully, function0, ux2Var3, i8);
            ul7 ul7VarH2 = H(sl7.f2030o, R.string.settings_twoFactorAuthentication_scanned_invalid, function0, ux2Var3, i8);
            final ul7 ul7VarH3 = H(sl7.p, R.string.settings_twoFactorAuthentication_scanned_no_internet, function0, ux2Var3, i8);
            e8 e8Var = new e8((byte) 2);
            boolean zH = ux2Var3.h(yr1Var3) | ux2Var3.f(px4Var3);
            Object objK6 = ux2Var3.K();
            if (zH || objK6 == awVar2) {
                objK6 = new o43(yr1Var3, px4Var3, (byte) 29);
                ux2Var3.g0(objK6);
            }
            qk4 qk4VarX1 = db8.x0(e8Var, (Function1) objK6, ux2Var3);
            boolean zH2 = ux2Var3.h(context2) | ux2Var3.f(px4Var4) | ux2Var3.f(px4Var3) | ux2Var3.h(qk4VarX1) | ux2Var3.h(yr1Var3);
            Object objK7 = ux2Var3.K();
            if (zH2 || objK7 == awVar2) {
                px4Var = px4Var3;
                objK7 = new t5(context2, qk4VarX1, yr1Var3, px4Var4, px4Var, (hc1) null);
                context = context2;
                ux2Var3.g0(objK7);
            } else {
                context = context2;
                px4Var = px4Var3;
            }
            f88 f88Var = f88.a;
            ck3.i(f88Var, (hw2) objK7, ux2Var3);
            Object objK8 = ux2Var3.K();
            Object obj = objK8;
            if (objK8 == awVar2) {
                BarcodeView barcodeView = new BarcodeView(context);
                barcodeView.setDecoderFactory(new gy8(qf0.K(v20.x)));
                ux2Var3.g0(barcodeView);
                obj = barcodeView;
            }
            final BarcodeView barcodeView2 = (BarcodeView) obj;
            int i9 = i4 & 7168;
            boolean zH3 = ux2Var3.h(yr1Var3) | ((i4 & 112) == 32) | ux2Var3.f(ul7VarH3) | ux2Var3.h(barcodeView2) | (i9 == 2048) | ux2Var3.h(q50Var);
            Object objK9 = ux2Var3.K();
            if (zH3 || objK9 == awVar2) {
                i5 = i4;
                u20 u20Var = new u20() { // from class: o.ky5
                    @Override // o.u20
                    public final void b(x20 x20Var) {
                        yr1 yr1Var4 = yr1Var3;
                        Function1 function4 = function1;
                        ul7 ul7Var = ul7VarH3;
                        BarcodeView barcodeView3 = barcodeView2;
                        Function0 function5 = function2;
                        q50 q50Var2 = q50Var;
                        yr1Var4.getClass();
                        if (!l25.b()) {
                            Boolean bool = yr1Var4.u;
                            Boolean bool2 = Boolean.TRUE;
                            boolean zN = im3.n(bool, bool2);
                            yr1Var4.u = bool2;
                            if (!zN) {
                                function4.invoke(ul7Var);
                                barcodeView3.c();
                                function5.a();
                                return;
                            }
                        }
                        synchronized (q50Var2) {
                            if (q50Var2.b) {
                                q50Var2.a();
                            }
                        }
                        String str = x20Var.a.a;
                        str.getClass();
                        yr1Var4.u = Boolean.FALSE;
                        byte b5 = 0;
                        List listM0 = ub7.m0(str, new char[]{'&'});
                        ArrayList arrayList = new ArrayList(mv0.Z(listM0, 10));
                        Iterator it = listM0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ub7.x0((String) it.next()).toString());
                        }
                        Iterator it2 = arrayList.iterator();
                        int i10 = 0;
                        while (true) {
                            hc1 hc1Var = null;
                            if (!it2.hasNext()) {
                                IDeviceAuthenticationQrScannerActivityViewModel iDeviceAuthenticationQrScannerActivityViewModel = yr1Var4.f2633o;
                                IDeviceAuthQrScannerActivityViewModelSWIGJNI.IDeviceAuthenticationQrScannerActivityViewModel_ReportQrCodeIsValid(iDeviceAuthenticationQrScannerActivityViewModel.a, iDeviceAuthenticationQrScannerActivityViewModel);
                                im3.R(e8.n(yr1Var4), null, null, new xr1(yr1Var4, hc1Var, b5), 3);
                                break;
                            }
                            int i11 = i10 + 1;
                            String str2 = (String) it2.next();
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    if (bc7.O(str2) == null) {
                                        yr1Var4.V0();
                                        im3.R(e8.n(yr1Var4), null, null, new y0(yr1Var4, hc1Var, (byte) 12), 3);
                                        break;
                                    }
                                    i10 = i11;
                                } else if (i10 != 2) {
                                    if (i10 == 3) {
                                        DyngateID dyngateIDFromLong = DyngateID.FromLong(Long.parseLong(str2));
                                        dyngateIDFromLong.getClass();
                                        yr1Var4.t = dyngateIDFromLong;
                                        if (!dyngateIDFromLong.IsValid()) {
                                            yr1Var4.V0();
                                            im3.R(e8.n(yr1Var4), null, null, new y0(yr1Var4, hc1Var, (byte) 12), 3);
                                            break;
                                        }
                                        i10 = i11;
                                    } else if (i10 == 4) {
                                        Long lP = bc7.P(str2);
                                        if (lP == null) {
                                            yr1Var4.V0();
                                            im3.R(e8.n(yr1Var4), null, null, new y0(yr1Var4, hc1Var, (byte) 12), 3);
                                            break;
                                        } else {
                                            yr1Var4.s = lP.longValue();
                                            i10 = i11;
                                        }
                                    } else {
                                        if (i10 != 5) {
                                            ye4.c("DeviceAuthenticationViewModel", "Unsupported MFA value");
                                        } else if (ub7.b0(str2)) {
                                            yr1Var4.V0();
                                        } else {
                                            yr1Var4.q = str2;
                                            i10 = i11;
                                        }
                                        im3.R(e8.n(yr1Var4), null, null, new y0(yr1Var4, hc1Var, (byte) 12), 3);
                                        break;
                                    }
                                } else if (ub7.b0(str2)) {
                                    yr1Var4.V0();
                                    im3.R(e8.n(yr1Var4), null, null, new y0(yr1Var4, hc1Var, (byte) 12), 3);
                                    break;
                                } else {
                                    yr1Var4.r = str2;
                                    i10 = i11;
                                }
                            } else {
                                if (!im3.n(str2, "MFA")) {
                                    yr1Var4.V0();
                                    im3.R(e8.n(yr1Var4), null, null, new y0(yr1Var4, hc1Var, (byte) 12), 3);
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        barcodeView3.c();
                        function5.a();
                    }
                };
                ux2Var3.g0(u20Var);
                objK9 = u20Var;
            } else {
                i5 = i4;
            }
            barcodeView2.N = 3;
            barcodeView2.O = (u20) objK9;
            barcodeView2.i();
            boolean zH4 = ux2Var3.h(yr1Var3) | ux2Var3.f(px4VarT) | ux2Var3.f(ul7VarH) | ux2Var3.f(r24);
            Object objK10 = ux2Var3.K();
            if (zH4 || objK10 == awVar2) {
                b2 = 3;
                bj bjVar = new bj(yr1Var3, ul7VarH, ul7VarH2, px4VarT, null, (byte) 17);
                ux2Var3.g0(bjVar);
                objK10 = bjVar;
            } else {
                b2 = 3;
            }
            ck3.i(f88Var, (hw2) objK10, ux2Var3);
            boolean zH5 = ux2Var3.h(barcodeView2) | ux2Var3.h(lifecycleOwner);
            Object objK11 = ux2Var3.K();
            if (zH5 || objK11 == awVar2) {
                objK11 = new wx5(lifecycleOwner, barcodeView2, (byte) 1);
                ux2Var3.g0(objK11);
            }
            ck3.e(lifecycleOwner, (Function1) objK11, ux2Var3);
            boolean zH6 = ux2Var3.h(barcodeView2);
            Object objK12 = ux2Var3.K();
            if (zH6 || objK12 == awVar2) {
                b3 = 1;
                objK12 = new xx5(barcodeView2, b3);
                ux2Var3.g0(objK12);
            } else {
                b3 = 1;
            }
            ck3.e(barcodeView2, (Function1) objK12, ux2Var3);
            nv1.g(fs4Var4, au8.O(618278958, new v4(function2, (byte) 28), ux2Var3), null, null, null, 0, 0L, 0L, null, au8.O(1833697987, new ay5(barcodeView2, z, b3), ux2Var3), ux2Var, ((i5 >> 12) & 14) | 805306416, 508);
            ux2 ux2Var4 = ux2Var;
            e8 e8Var2 = new e8(b2);
            boolean zH7 = ux2Var4.h(context) | (i9 == 2048);
            Object objK13 = ux2Var4.K();
            if (zH7) {
                awVar = awVar2;
            } else {
                awVar = awVar2;
                if (objK13 != awVar) {
                    function3 = function2;
                }
                qk4VarX0 = db8.x0(e8Var2, (Function1) objK13, ux2Var4);
                if (((Boolean) px4Var.getValue()).booleanValue()) {
                    ux2Var4.W(-77167951);
                    px4Var2 = px4Var;
                    boolean zF2 = ux2Var4.f(px4Var2);
                    if (i9 == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zF2 | z2;
                    objK = ux2Var4.K();
                    if (z3 || objK == awVar) {
                        objK = new ot1(function3, px4Var2, (byte) 1);
                        ux2Var4.g0(objK);
                    }
                    Function0 function4 = (Function0) objK;
                    zF = ux2Var4.f(px4Var2) | ux2Var4.h(context) | ux2Var4.h(qk4VarX0);
                    objK2 = ux2Var4.K();
                    if (zF || objK2 == awVar) {
                        objK2 = new n5(context, qk4VarX0, px4Var2, (byte) 25);
                        ux2Var4.g0(objK2);
                    }
                    ck3.b(0, function4, (Function0) objK2, ux2Var4, null);
                    ux2Var4.p(false);
                } else {
                    ux2Var4.W(-76676880);
                    ux2Var4.p(false);
                }
                fs4Var2 = fs4Var4;
                yr1Var2 = yr1Var3;
                ux2Var2 = ux2Var4;
            }
            function3 = function2;
            objK13 = new o43(context, function3, (byte) 28);
            ux2Var4.g0(objK13);
            qk4VarX0 = db8.x0(e8Var2, (Function1) objK13, ux2Var4);
            if (((Boolean) px4Var.getValue()).booleanValue()) {
                ux2Var4.W(-77167951);
                px4Var2 = px4Var;
                boolean zF3 = ux2Var4.f(px4Var2);
                if (i9 == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zF3 | z2;
                objK = ux2Var4.K();
                if (z3) {
                    objK = new ot1(function3, px4Var2, (byte) 1);
                    ux2Var4.g0(objK);
                } else {
                    objK = new ot1(function3, px4Var2, (byte) 1);
                    ux2Var4.g0(objK);
                }
                Function0 function5 = (Function0) objK;
                zF = ux2Var4.f(px4Var2) | ux2Var4.h(context) | ux2Var4.h(qk4VarX0);
                objK2 = ux2Var4.K();
                if (zF) {
                    objK2 = new n5(context, qk4VarX0, px4Var2, (byte) 25);
                    ux2Var4.g0(objK2);
                } else {
                    objK2 = new n5(context, qk4VarX0, px4Var2, (byte) 25);
                    ux2Var4.g0(objK2);
                }
                ck3.b(0, function5, (Function0) objK2, ux2Var4, null);
                ux2Var4.p(false);
            } else {
                ux2Var4.W(-76676880);
                ux2Var4.p(false);
            }
            fs4Var2 = fs4Var4;
            yr1Var2 = yr1Var3;
            ux2Var2 = ux2Var4;
        } else {
            function3 = function2;
            ux2Var3.Q();
            fs4Var2 = fs4Var;
            yr1Var2 = yr1Var;
            ux2Var2 = ux2Var3;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new fb(z, function1, function0, function3, fs4Var2, yr1Var2, i);
        }
    }

    public static final void u(Function0 function0, ux2 ux2Var, int i) {
        int i2;
        Function0 function1;
        ux2 ux2Var2;
        ux2Var.Y(-1128713350);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            ux2Var2 = ux2Var;
            jj.b(uf0.A, function1, null, uf0.B, false, null, ka0.i(2, 12.0f), ux2Var2, ((i2 << 3) & 112) | 12585990, 372);
        } else {
            function1 = function0;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new xn4(function1, i, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0134  */
    /* JADX WARN: Code duplicated, block: B:103:0x0143  */
    /* JADX WARN: Code duplicated, block: B:105:0x0147  */
    /* JADX WARN: Code duplicated, block: B:107:0x014d  */
    /* JADX WARN: Code duplicated, block: B:109:0x015a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0160  */
    /* JADX WARN: Code duplicated, block: B:114:0x0166  */
    /* JADX WARN: Code duplicated, block: B:116:0x0171  */
    /* JADX WARN: Code duplicated, block: B:118:0x0175  */
    /* JADX WARN: Code duplicated, block: B:120:0x017b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0189  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:135:0x0208  */
    /* JADX WARN: Code duplicated, block: B:140:0x023c  */
    /* JADX WARN: Code duplicated, block: B:143:0x027c  */
    /* JADX WARN: Code duplicated, block: B:146:0x028f  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x0105  */
    /* JADX WARN: Code duplicated, block: B:86:0x0107  */
    /* JADX WARN: Code duplicated, block: B:89:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX WARN: Code duplicated, block: B:98:0x012e  */
    public static final void v(final boolean z, final boolean z2, final boolean z3, fs4 fs4Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, ux2 ux2Var, final int i, final int i2) {
        int i3;
        fs4 fs4Var2;
        int i4;
        Function0 function6;
        int i5;
        int i6;
        int i7;
        Function0 function7;
        int i8;
        int i9;
        int i10;
        Function0 function8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z4;
        final Function0 function9;
        final fs4 fs4Var3;
        final Function0 function10;
        final Function0 function11;
        final Function0 function12;
        final Function0 function13;
        final Function0 function14;
        j56 j56VarR;
        aw awVar;
        Function0 function15;
        byte b2;
        Function0 function16;
        Function0 function17;
        int i22;
        boolean z5;
        Object objK;
        Object objK2;
        Object objK3;
        Object objK4;
        Object objK5;
        ux2Var.Y(1004418959);
        if ((i & 6) == 0) {
            i3 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.g(z3) ? 256 : 128;
        }
        int i23 = i2 & 8;
        if (i23 == 0) {
            if ((i & 3072) == 0) {
                fs4Var2 = fs4Var;
                i3 |= ux2Var.f(fs4Var2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                i6 = i3 | 24576;
                function6 = function0;
            } else {
                function6 = function0;
                if (ux2Var.h(function6)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i6 = i3 | i5;
            }
            i7 = i2 & 32;
            if (i7 != 0) {
                i9 = i6 | 196608;
                function7 = function1;
            } else {
                function7 = function1;
                if (ux2Var.h(function7)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i9 = i6 | i8;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i12 = i9 | 1572864;
                function8 = function2;
            } else {
                function8 = function2;
                if (ux2Var.h(function8)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i12 = i9 | i11;
            }
            i13 = i2 & 128;
            if (i13 != 0) {
                i15 = i12 | 12582912;
            } else {
                if (ux2Var.h(function3)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i15 = i12 | i14;
            }
            i16 = i2 & 256;
            if (i16 != 0) {
                i18 = i15 | 100663296;
            } else {
                if (ux2Var.h(function4)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i18 = i15 | i17;
            }
            i19 = i2 & 512;
            if (i19 != 0) {
                i21 = i18 | 805306368;
            } else {
                if (ux2Var.h(function5)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i21 = i18 | i20;
            }
            if ((i21 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ux2Var.N(i21 & 1, z4)) {
                if (i23 != 0) {
                    fs4Var2 = cs4.b;
                }
                awVar = e01.a;
                if (i4 != 0) {
                    objK5 = ux2Var.K();
                    if (objK5 == awVar) {
                        objK5 = new oq6((byte) 11);
                        ux2Var.g0(objK5);
                    }
                    function6 = (Function0) objK5;
                }
                if (i7 != 0) {
                    objK4 = ux2Var.K();
                    if (objK4 == awVar) {
                        objK4 = new oq6((byte) 12);
                        ux2Var.g0(objK4);
                    }
                    function7 = (Function0) objK4;
                }
                if (i10 != 0) {
                    function8 = null;
                }
                if (i13 != 0) {
                    objK3 = ux2Var.K();
                    if (objK3 == awVar) {
                        objK3 = new oq6((byte) 13);
                        ux2Var.g0(objK3);
                    }
                    function15 = (Function0) objK3;
                } else {
                    function15 = function3;
                }
                b2 = 14;
                if (i16 != 0) {
                    objK2 = ux2Var.K();
                    if (objK2 == awVar) {
                        objK2 = new oq6(b2);
                        ux2Var.g0(objK2);
                    }
                    function16 = (Function0) objK2;
                } else {
                    function16 = function4;
                }
                if (i19 != 0) {
                    objK = ux2Var.K();
                    if (objK == awVar) {
                        objK = new oq6((byte) 15);
                        ux2Var.g0(objK);
                    }
                    function17 = (Function0) objK;
                } else {
                    function17 = function5;
                }
                kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                i22 = i21;
                int iHashCode = Long.hashCode(ux2Var.T);
                yj5 yj5VarL = ux2Var.l();
                fs4 fs4VarS = uf0.s(ux2Var, fs4Var2);
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(kw0VarA, d82.v, ux2Var);
                o67.n(yj5VarL, d82.u, ux2Var);
                o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS, d82.t, ux2Var);
                if (z3 && z2) {
                    ux2Var.W(-462560503);
                    z5 = false;
                    ux2Var.p(false);
                } else {
                    z5 = false;
                    ux2Var.W(-462666213);
                    c(function7, ux2Var, (i22 >> 15) & 14);
                    ux2Var.p(false);
                }
                if (z2) {
                    ux2Var.W(-462532417);
                    B(function6, ux2Var, (i22 >> 12) & 14);
                    ux2Var.p(z5);
                } else {
                    ux2Var.W(-462430551);
                    ux2Var.p(z5);
                }
                lv1.k(null, 0.0f, 0L, ux2Var, 0, 7);
                if (!z || function8 == null) {
                    ux2Var.W(-462233143);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-462340775);
                    y(function8, ux2Var, (i22 >> 18) & 14);
                    ux2Var.p(false);
                }
                x(function16, ux2Var, (i22 >> 24) & 14);
                e(function15, ux2Var, (i22 >> 21) & 14);
                lv1.k(null, 0.0f, 0L, ux2Var, 0, 7);
                u(function17, ux2Var, (i22 >> 27) & 14);
                ux2Var.p(true);
                fs4Var3 = fs4Var2;
                function9 = function16;
                function10 = function6;
                function11 = function7;
                function13 = function17;
                function12 = function15;
            } else {
                ux2Var.Q();
                function9 = function4;
                fs4Var3 = fs4Var2;
                function10 = function6;
                function11 = function7;
                function12 = function3;
                function13 = function5;
            }
            function14 = function8;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.hr6
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xo1.v(z, z2, z3, fs4Var3, function10, function11, function14, function12, function9, function13, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 3072;
        fs4Var2 = fs4Var;
        i4 = i2 & 16;
        if (i4 != 0) {
            i6 = i3 | 24576;
            function6 = function0;
        } else {
            function6 = function0;
            if (ux2Var.h(function6)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i6 = i3 | i5;
        }
        i7 = i2 & 32;
        if (i7 != 0) {
            i9 = i6 | 196608;
            function7 = function1;
        } else {
            function7 = function1;
            if (ux2Var.h(function7)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i9 = i6 | i8;
        }
        i10 = i2 & 64;
        if (i10 != 0) {
            i12 = i9 | 1572864;
            function8 = function2;
        } else {
            function8 = function2;
            if (ux2Var.h(function8)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i12 = i9 | i11;
        }
        i13 = i2 & 128;
        if (i13 != 0) {
            i15 = i12 | 12582912;
        } else {
            if (ux2Var.h(function3)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i15 = i12 | i14;
        }
        i16 = i2 & 256;
        if (i16 != 0) {
            i18 = i15 | 100663296;
        } else {
            if (ux2Var.h(function4)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i18 = i15 | i17;
        }
        i19 = i2 & 512;
        if (i19 != 0) {
            i21 = i18 | 805306368;
        } else {
            if (ux2Var.h(function5)) {
                i20 = 536870912;
            } else {
                i20 = 268435456;
            }
            i21 = i18 | i20;
        }
        if ((i21 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ux2Var.N(i21 & 1, z4)) {
            if (i23 != 0) {
                fs4Var2 = cs4.b;
            }
            awVar = e01.a;
            if (i4 != 0) {
                objK5 = ux2Var.K();
                if (objK5 == awVar) {
                    objK5 = new oq6((byte) 11);
                    ux2Var.g0(objK5);
                }
                function6 = (Function0) objK5;
            }
            if (i7 != 0) {
                objK4 = ux2Var.K();
                if (objK4 == awVar) {
                    objK4 = new oq6((byte) 12);
                    ux2Var.g0(objK4);
                }
                function7 = (Function0) objK4;
            }
            if (i10 != 0) {
                function8 = null;
            }
            if (i13 != 0) {
                objK3 = ux2Var.K();
                if (objK3 == awVar) {
                    objK3 = new oq6((byte) 13);
                    ux2Var.g0(objK3);
                }
                function15 = (Function0) objK3;
            } else {
                function15 = function3;
            }
            b2 = 14;
            if (i16 != 0) {
                objK2 = ux2Var.K();
                if (objK2 == awVar) {
                    objK2 = new oq6(b2);
                    ux2Var.g0(objK2);
                }
                function16 = (Function0) objK2;
            } else {
                function16 = function4;
            }
            if (i19 != 0) {
                objK = ux2Var.K();
                if (objK == awVar) {
                    objK = new oq6((byte) 15);
                    ux2Var.g0(objK);
                }
                function17 = (Function0) objK;
            } else {
                function17 = function5;
            }
            kw0 kw0VarA2 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            i22 = i21;
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4Var2);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA2, d82.v, ux2Var);
            o67.n(yj5VarL2, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS2, d82.t, ux2Var);
            if (z3) {
                z5 = false;
                ux2Var.W(-462666213);
                c(function7, ux2Var, (i22 >> 15) & 14);
                ux2Var.p(false);
            } else {
                z5 = false;
                ux2Var.W(-462666213);
                c(function7, ux2Var, (i22 >> 15) & 14);
                ux2Var.p(false);
            }
            if (z2) {
                ux2Var.W(-462532417);
                B(function6, ux2Var, (i22 >> 12) & 14);
                ux2Var.p(z5);
            } else {
                ux2Var.W(-462430551);
                ux2Var.p(z5);
            }
            lv1.k(null, 0.0f, 0L, ux2Var, 0, 7);
            if (z) {
                ux2Var.W(-462233143);
                ux2Var.p(false);
            } else {
                ux2Var.W(-462233143);
                ux2Var.p(false);
            }
            x(function16, ux2Var, (i22 >> 24) & 14);
            e(function15, ux2Var, (i22 >> 21) & 14);
            lv1.k(null, 0.0f, 0L, ux2Var, 0, 7);
            u(function17, ux2Var, (i22 >> 27) & 14);
            ux2Var.p(true);
            fs4Var3 = fs4Var2;
            function9 = function16;
            function10 = function6;
            function11 = function7;
            function13 = function17;
            function12 = function15;
        } else {
            ux2Var.Q();
            function9 = function4;
            fs4Var3 = fs4Var2;
            function10 = function6;
            function11 = function7;
            function12 = function3;
            function13 = function5;
        }
        function14 = function8;
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.hr6
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xo1.v(z, z2, z3, fs4Var3, function10, function11, function14, function12, function9, function13, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final void w(Function1 function1, a06 a06Var, fs4 fs4Var, hw6 hw6Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        hw6 hw6Var2;
        hw6 hw6Var3;
        int i2;
        fs4 fs4Var3;
        ux2 ux2Var2 = ux2Var;
        function1.getClass();
        a06Var.getClass();
        ux2Var2.Y(741686527);
        byte b2 = 4;
        int i3 = i | (ux2Var2.h(function1) ? 4 : 2) | (ux2Var2.f(a06Var) ? 32 : 16) | 1408;
        if (ux2Var2.N(i3 & 1, (i3 & 1171) != 1170)) {
            ux2Var2.S();
            if ((i & 1) == 0 || ux2Var2.x()) {
                c36 c36Var = zu1.c;
                if (c36Var == null) {
                    hk0.g("Required value was null.");
                    return;
                }
                if (id4.a(ux2Var2) == null) {
                    hk0.l("Required value was null.");
                    return;
                }
                og1 og1Var = new og1((byte) 1);
                fj3 fj3Var = new fj3((Object) c36Var, (byte) 29);
                x86 x86Var = w86.a;
                og1Var.a(x86Var.b(hw6.class), fj3Var);
                fi3 fi3VarC = og1Var.c();
                we8 we8VarA = id4.a(ux2Var2);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    hw6Var3 = (hw6) g57.t(x86Var.b(hw6.class), we8VarA, null, fi3VarC, h57.k(we8VarA), ux2Var2);
                    i2 = i3 & (-7169);
                    fs4Var3 = cs4.b;
                }
            } else {
                ux2Var2.Q();
                i2 = i3 & (-7169);
                fs4Var3 = fs4Var;
                hw6Var3 = hw6Var;
            }
            ux2Var2.q();
            px4 px4VarG = g57.g(hw6Var3.z, ux2Var2);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ux2Var2.j(dd4.a);
            px4 px4VarG2 = g57.g(hw6Var3.w, ux2Var2);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new q37();
                ux2Var2.g0(objK);
            }
            q37 q37Var = (q37) objK;
            boolean z = (i2 & 112) == 32;
            Object objK2 = ux2Var2.K();
            if (z || objK2 == awVar) {
                objK2 = new s21(q37Var, a06Var, b2);
                ux2Var2.g0(objK2);
            }
            Function1 function2 = (Function1) objK2;
            Object objK3 = ux2Var2.K();
            if (objK3 == awVar) {
                objK3 = new t21(q37Var, b2);
                ux2Var2.g0(objK3);
            }
            Function0 function0 = (Function0) objK3;
            boolean zH = ux2Var2.h(hw6Var3);
            Object objK4 = ux2Var2.K();
            if (zH || objK4 == awVar) {
                nu6 nu6Var = new nu6(1, hw6Var3, hw6.class, "updateLockTime", "updateLockTime(Ljava/lang/String;)V", 0, (byte) 2);
                ux2Var2.g0(nu6Var);
                objK4 = nu6Var;
            }
            pu3 pu3Var = (pu3) objK4;
            boolean zH2 = ux2Var2.h(hw6Var3);
            Object objK5 = ux2Var2.K();
            if (zH2 || objK5 == awVar) {
                mr6 mr6Var = new mr6(0, hw6Var3, hw6.class, "incrementAttractionGuidClickCount", "incrementAttractionGuidClickCount()V", 0, (byte) 14);
                ux2Var2.g0(mr6Var);
                objK5 = mr6Var;
            }
            pu3 pu3Var2 = (pu3) objK5;
            boolean zH3 = ux2Var2.h(hw6Var3);
            Object objK6 = ux2Var2.K();
            if (zH3 || objK6 == awVar) {
                nu6 nu6Var2 = new nu6(1, hw6Var3, hw6.class, "openAttractionGuid", "openAttractionGuid(Z)V", 0, (byte) 3);
                ux2Var2.g0(nu6Var2);
                objK6 = nu6Var2;
            }
            pu3 pu3Var3 = (pu3) objK6;
            boolean zH4 = ux2Var2.h(hw6Var3);
            Object objK7 = ux2Var2.K();
            if (zH4 || objK7 == awVar) {
                mr6 mr6Var2 = new mr6(0, hw6Var3, hw6.class, "updateAccountDetailsVisibility", "updateAccountDetailsVisibility()V", 0, (byte) 15);
                ux2Var2.g0(mr6Var2);
                objK7 = mr6Var2;
            }
            pu3 pu3Var4 = (pu3) objK7;
            boolean zH5 = ux2Var2.h(hw6Var3);
            Object objK8 = ux2Var2.K();
            if (zH5 || objK8 == awVar) {
                nu6 nu6Var3 = new nu6(1, hw6Var3, hw6.class, "setNativeSessionRCSwitchState", "setNativeSessionRCSwitchState(Z)V", 0, (byte) 4);
                ux2Var2.g0(nu6Var3);
                objK8 = nu6Var3;
            }
            pu3 pu3Var5 = (pu3) objK8;
            boolean zH6 = ux2Var2.h(hw6Var3);
            Object objK9 = ux2Var2.K();
            if (zH6 || objK9 == awVar) {
                nu6 nu6Var4 = new nu6(1, hw6Var3, hw6.class, "setNativeSessionFTSwitchState", "setNativeSessionFTSwitchState(Z)V", 0, (byte) 5);
                ux2Var2.g0(nu6Var4);
                objK9 = nu6Var4;
            }
            pu3 pu3Var6 = (pu3) objK9;
            boolean zH7 = ux2Var2.h(hw6Var3);
            Object objK10 = ux2Var2.K();
            if (zH7 || objK10 == awVar) {
                nu6 nu6Var5 = new nu6(1, hw6Var3, hw6.class, "setDevicesRedesignSwitchState", "setDevicesRedesignSwitchState(Z)V", 0, (byte) 6);
                ux2Var2.g0(nu6Var5);
                objK10 = nu6Var5;
            }
            pu3 pu3Var7 = (pu3) objK10;
            boolean zH8 = ux2Var2.h(hw6Var3);
            Object objK11 = ux2Var2.K();
            if (zH8 || objK11 == awVar) {
                objK11 = new zv6(hw6Var3, (byte) 1);
                ux2Var2.g0(objK11);
            }
            Function1 function3 = (Function1) objK11;
            boolean zH9 = ux2Var2.h(hw6Var3);
            Object objK12 = ux2Var2.K();
            if (zH9 || objK12 == awVar) {
                objK12 = new zv6(hw6Var3, (byte) 2);
                ux2Var2.g0(objK12);
            }
            Function1 function4 = (Function1) objK12;
            boolean zH10 = ux2Var2.h(hw6Var3);
            Object objK13 = ux2Var2.K();
            if (zH10 || objK13 == awVar) {
                objK13 = new zv6(hw6Var3, (byte) 3);
                ux2Var2.g0(objK13);
            }
            Function1 function5 = (Function1) objK13;
            boolean zH11 = ux2Var2.h(hw6Var3);
            Object objK14 = ux2Var2.K();
            if (zH11 || objK14 == awVar) {
                objK14 = new zv6(hw6Var3, (byte) 4);
                ux2Var2.g0(objK14);
            }
            Function1 function6 = (Function1) objK14;
            boolean zH12 = ux2Var2.h(hw6Var3);
            Object objK15 = ux2Var2.K();
            if (zH12 || objK15 == awVar) {
                objK15 = new zv6(hw6Var3, (byte) 5);
                ux2Var2.g0(objK15);
            }
            Function1 function7 = (Function1) objK15;
            boolean zH13 = ux2Var2.h(hw6Var3);
            Object objK16 = ux2Var2.K();
            if (zH13 || objK16 == awVar) {
                objK16 = new zv6(hw6Var3, (byte) 6);
                ux2Var2.g0(objK16);
            }
            Function1 function8 = (Function1) objK16;
            boolean zH14 = ux2Var2.h(hw6Var3);
            Object objK17 = ux2Var2.K();
            if (zH14 || objK17 == awVar) {
                objK17 = new zv6(hw6Var3, (byte) 0);
                ux2Var2.g0(objK17);
            }
            iv6 iv6Var = new iv6(function3, function4, function5, function6, function7, function8, (Function1) objK17, (Function0) pu3Var2, (Function1) pu3Var3, function2, function0, (Function1) pu3Var, (Function0) pu3Var4, (Function1) pu3Var5, (Function1) pu3Var6, (Function1) pu3Var7);
            boolean zH15 = ux2Var2.h(hw6Var3) | ux2Var2.h(lifecycleOwner);
            Object objK18 = ux2Var2.K();
            if (zH15 || objK18 == awVar) {
                objK18 = new py5((Object) lifecycleOwner, (Object) hw6Var3, (byte) 14);
                ux2Var2.g0(objK18);
            }
            ck3.e(lifecycleOwner, (Function1) objK18, ux2Var2);
            fs4 fs4Var4 = fs4Var3;
            ut7.a(au8.O(512304543, new ue5(fs4Var4, q37Var, hw6Var3, a06Var, function1, iv6Var, px4VarG, px4VarG2), ux2Var2), ux2Var2, 48);
            hw6Var2 = hw6Var3;
            fs4Var2 = fs4Var4;
        } else {
            ux2Var2 = ux2Var2;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
            hw6Var2 = hw6Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) function1, (Object) a06Var, fs4Var2, (Object) hw6Var2, i, (byte) 17);
        }
    }

    public static final void x(Function0 function0, ux2 ux2Var, int i) {
        int i2;
        Function0 function1;
        ux2 ux2Var2;
        ux2Var.Y(-1465094343);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            ux2Var2 = ux2Var;
            jj.b(uf0.y, function1, null, uf0.z, false, null, ka0.i(2, 12.0f), ux2Var2, ((i2 << 3) & 112) | 12585990, 372);
        } else {
            function1 = function0;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new xn4(function1, i, (byte) 6);
        }
    }

    public static final void y(Function0 function0, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-1940051257);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 3;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            jj.b(uf0.C, function0, null, uf0.D, false, null, ka0.i(2, 12.0f), ux2Var, ((i2 << 3) & 112) | 12585990, 372);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new xn4(function0, i, b2);
        }
    }

    public static final void z(int i, int i2, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i3;
        Function0 function1;
        ux2Var.Y(1477150983);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            function1 = function0;
            i3 |= ux2Var.h(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.f("TVTA-settings-udp") ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = (i3 >> 6) & 112;
            int i5 = i3 << 6;
            x37.e(new sk7(y57.g(R.string.tv_options_EnableUDP), y57.g(i), new yk7(R.drawable.globe_information), null, 24), fs4Var, null, function1, "TVTA-settings-udp", ux2Var, (i5 & 57344) | i4 | (i5 & 7168), 36);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new jc(i, function0, fs4Var, i2, (byte) 1);
        }
    }

    public void E(fb6 fb6Var, Object obj) {
        aw4 aw4Var = (aw4) obj;
        if (aw4Var != null) {
            ((ArrayList) fb6Var.i.p).add(aw4Var);
        }
    }
}
