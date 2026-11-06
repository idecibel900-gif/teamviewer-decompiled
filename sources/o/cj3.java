package o;

import android.R;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import coil3.compose.AsyncImagePainter;
import com.teamviewer.apidefinitions.account.models.Account;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionUpdateParams;
import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapper;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapperSWIGJNI;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.lang.reflect.Array;
import java.nio.channels.FileChannel;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.im3;
import o.ud5;

/* JADX INFO: loaded from: classes.dex */
public class cj3 implements vn7, eh7, bu0, ap, kp, qg6 {
    public static final int[] p = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final cj3 q = new cj3((Object) new ek3(23), (Object) new ek3(24), (byte) 2);
    public static final xy4 r = new xy4("", null);
    public static final int[] s = {1, 1, 2};
    public final /* synthetic */ byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f531o;

    public cj3(Class cls, Enum r6) {
        this.m = (byte) 27;
        this.n = r6;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        SparseArray sparseArray = new SparseArray(enumArr != null ? enumArr.length : 0);
        Object[] objArr = (Enum[]) cls.getEnumConstants();
        if (objArr != null) {
            for (Object obj : objArr) {
                sparseArray.put(((ph0) obj).a(), obj);
            }
        }
        this.f531o = sparseArray;
    }

    public static x84 B(ke3 ke3Var) {
        vn7 vn7Var = ke3Var.c;
        Object context = vn7Var instanceof yy2 ? ((yy2) vn7Var).getView().getContext() : ke3Var.a;
        while (!(context instanceof LifecycleOwner)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((LifecycleOwner) context).getR();
    }

    public static boolean I(ke3 ke3Var, Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            if (!((Boolean) nv1.w(ke3Var, ne3.g)).booleanValue()) {
                return false;
            }
            vn7 vn7Var = ke3Var.c;
            if (vn7Var instanceof yy2) {
                View view = ((yy2) vn7Var).getView();
                if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void N(xd3 xd3Var) {
    }

    private final void O(xd3 xd3Var) {
    }

    private final void Q(xd3 xd3Var) {
    }

    private final void R(xd3 xd3Var) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object A(int i, int i2, String str, String str2, String str3, int i3, jc1 jc1Var) {
        cs6 cs6Var;
        if (jc1Var instanceof cs6) {
            cs6Var = (cs6) jc1Var;
            int i4 = cs6Var.f554o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cs6Var.f554o = i4 - Integer.MIN_VALUE;
            } else {
                cs6Var = new cs6(this, jc1Var);
            }
        } else {
            cs6Var = new cs6(this, jc1Var);
        }
        Object obj = cs6Var.m;
        int i5 = cs6Var.f554o;
        if (i5 != 0) {
            if (i5 == 1) {
                ct1.a0(obj);
                return ((tc6) obj).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(obj);
        l07 l07Var = (l07) this.f531o;
        SupportSessionUpdateParams supportSessionUpdateParams = new SupportSessionUpdateParams(str, str2, new Integer(i3), str3, new Integer(i));
        cs6Var.f554o = 1;
        Object objJ = l07Var.J(i2, supportSessionUpdateParams, cs6Var);
        ne1 ne1Var = ne1.m;
        return objJ == ne1Var ? ne1Var : objJ;
    }

    public Enum C(byte b) {
        Object obj = ((SparseArray) this.f531o).get(b, (Enum) this.n);
        obj.getClass();
        return (Enum) obj;
    }

    public k70 D() {
        int[] iArr;
        k70 k70Var = (k70) this.f531o;
        if (k70Var != null) {
            return k70Var;
        }
        j93 j93Var = (j93) this.n;
        k70 k70Var2 = (k70) j93Var.q;
        if (k70Var2 == null) {
            hm2 hm2Var = (hm2) j93Var.n;
            int i = hm2Var.b;
            int i2 = hm2Var.c;
            boolean z = true;
            int i3 = 0;
            if (i < 40 || i2 < 40) {
                k70 k70Var3 = new k70(i, i2);
                if (((byte[]) j93Var.f1141o).length < i) {
                    j93Var.f1141o = new byte[i];
                }
                int i4 = 0;
                while (true) {
                    iArr = (int[]) j93Var.p;
                    if (i4 >= 32) {
                        break;
                    }
                    iArr[i4] = 0;
                    i4++;
                }
                for (int i5 = 1; i5 < 5; i5++) {
                    byte[] bArrF = hm2Var.f((byte[]) j93Var.f1141o, (i2 * i5) / 5);
                    int i6 = (i * 4) / 5;
                    for (int i7 = i / 5; i7 < i6; i7++) {
                        int i8 = (bArrF[i7] & 255) >> 3;
                        iArr[i8] = iArr[i8] + 1;
                    }
                }
                int I = j93.I(iArr);
                byte[] bArrE = hm2Var.e();
                for (int i9 = 0; i9 < i2; i9++) {
                    int i10 = i9 * i;
                    for (int i11 = 0; i11 < i; i11++) {
                        if ((bArrE[i10 + i11] & 255) < I) {
                            k70Var3.i(i11, i9);
                        }
                    }
                }
                j93Var.q = k70Var3;
                k70Var2 = k70Var3;
            } else {
                byte[] bArrE2 = hm2Var.e();
                int i12 = i >> 3;
                if ((i & 7) != 0) {
                    i12++;
                }
                int i13 = i2 >> 3;
                if ((i2 & 7) != 0) {
                    i13++;
                }
                int i14 = i2 - 8;
                int i15 = i - 8;
                int i16 = 2;
                int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i13, i12);
                int i17 = 0;
                while (true) {
                    int i18 = 8;
                    if (i17 >= i13) {
                        break;
                    }
                    boolean z2 = z;
                    int i19 = i17 << 3;
                    if (i19 > i14) {
                        i19 = i14;
                    }
                    int i20 = i3;
                    while (i3 < i12) {
                        int i21 = i16;
                        int i22 = i3 << 3;
                        if (i22 > i15) {
                            i22 = i15;
                        }
                        int i23 = (i19 * i) + i22;
                        int i24 = i20;
                        int i25 = i24;
                        int i26 = i25;
                        int i27 = 255;
                        while (i24 < i18) {
                            byte[] bArr = bArrE2;
                            int i28 = i19;
                            int i29 = i20;
                            int i30 = i26;
                            int i31 = i27;
                            while (i29 < i18) {
                                int i32 = i29;
                                int i33 = bArr[i23 + i29] & 255;
                                i25 += i33;
                                if (i33 < i31) {
                                    i31 = i33;
                                }
                                if (i33 > i30) {
                                    i30 = i33;
                                }
                                i29 = i32 + 1;
                                i18 = 8;
                            }
                            if (i30 - i31 > 24) {
                                while (true) {
                                    i24++;
                                    i23 += i;
                                    if (i24 < 8) {
                                        int i34 = i20;
                                        for (int i35 = 8; i34 < i35; i35 = 8) {
                                            i25 += bArr[i23 + i34] & 255;
                                            i34++;
                                            i31 = i31;
                                        }
                                    }
                                }
                            }
                            i24++;
                            i23 += i;
                            i27 = i31;
                            bArrE2 = bArr;
                            i19 = i28;
                            i18 = 8;
                            i26 = i30;
                        }
                        byte[] bArr2 = bArrE2;
                        int i36 = i19;
                        int i37 = i25 >> 6;
                        int i38 = i27;
                        if (i26 - i38 <= 24) {
                            i37 = i38 / 2;
                            if (i17 > 0 && i3 > 0) {
                                int[] iArr3 = iArr2[i17 - 1];
                                int i39 = i3 - 1;
                                int i40 = (((iArr2[i17][i39] * 2) + iArr3[i3]) + iArr3[i39]) / 4;
                                if (i38 < i40) {
                                    i37 = i40;
                                }
                            }
                        }
                        iArr2[i17][i3] = i37;
                        i3++;
                        i16 = i21;
                        bArrE2 = bArr2;
                        i19 = i36;
                        i18 = 8;
                    }
                    i17++;
                    z = z2;
                    i3 = i20;
                }
                byte[] bArr3 = bArrE2;
                int i41 = i3;
                int i42 = i16;
                k70Var2 = new k70(i, i2);
                int i43 = i41;
                while (i43 < i13) {
                    int i44 = i43 << 3;
                    if (i44 > i14) {
                        i44 = i14;
                    }
                    int iMin = i43 < i42 ? 2 : Math.min(i43, i13 - 3);
                    int i45 = i41;
                    while (i45 < i12) {
                        int i46 = i45 << 3;
                        if (i46 > i15) {
                            i46 = i15;
                        }
                        int iMin2 = i45 < 2 ? 2 : Math.min(i45, i12 - 3);
                        int i47 = i43;
                        int i48 = -2;
                        int i49 = i41;
                        for (int i50 = 2; i48 <= i50; i50 = 2) {
                            int[] iArr4 = iArr2[iMin + i48];
                            i49 = iArr4[iMin2 - 2] + iArr4[iMin2 - 1] + iArr4[iMin2] + iArr4[iMin2 + 1] + iArr4[iMin2 + 2] + i49;
                            i48++;
                        }
                        int i51 = i49 / 25;
                        int i52 = (i44 * i) + i46;
                        int i53 = i44;
                        int i54 = i41;
                        while (true) {
                            if (i54 < 8) {
                                int i55 = i45;
                                int i56 = i41;
                                for (int i57 = 8; i56 < i57; i57 = 8) {
                                    int i58 = i56;
                                    if ((bArr3[i52 + i56] & 255) <= i51) {
                                        k70Var2.i(i46 + i58, i53 + i54);
                                    }
                                    i56 = i58 + 1;
                                }
                                i54++;
                                i52 += i;
                                i45 = i55;
                            }
                        }
                        i45++;
                        i44 = i53;
                        i43 = i47;
                    }
                    i42 = 2;
                    i43++;
                }
                j93Var.q = k70Var2;
            }
        }
        this.f531o = k70Var2;
        return k70Var2;
    }

    public i70 E(i70 i70Var, int i) {
        j93 j93Var = (j93) this.n;
        int[] iArr = (int[]) j93Var.p;
        hm2 hm2Var = (hm2) j93Var.n;
        int i2 = hm2Var.b;
        if (i70Var.n < i2) {
            i70Var = new i70(i2);
        } else {
            int length = i70Var.m.length;
            for (int i3 = 0; i3 < length; i3++) {
                i70Var.m[i3] = 0;
            }
        }
        if (((byte[]) j93Var.f1141o).length < i2) {
            j93Var.f1141o = new byte[i2];
        }
        for (int i4 = 0; i4 < 32; i4++) {
            iArr[i4] = 0;
        }
        byte[] bArrF = hm2Var.f((byte[]) j93Var.f1141o, i);
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = (bArrF[i5] & 255) >> 3;
            iArr[i6] = iArr[i6] + 1;
        }
        int I = j93.I(iArr);
        if (i2 < 3) {
            for (int i7 = 0; i7 < i2; i7++) {
                if ((bArrF[i7] & 255) < I) {
                    i70Var.g(i7);
                }
            }
        } else {
            int i8 = bArrF[0] & 255;
            int i9 = bArrF[1] & 255;
            int i10 = 1;
            while (i10 < i2 - 1) {
                int i11 = i10 + 1;
                int i12 = bArrF[i11] & 255;
                if ((((i9 * 4) - i8) - i12) / 2 < I) {
                    i70Var.g(i10);
                }
                i8 = i9;
                i10 = i11;
                i9 = i12;
            }
        }
        return i70Var;
    }

    public ClipboardManager F() {
        ClipboardManager clipboardManager = (ClipboardManager) this.f531o;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = ((Context) this.n).getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.f531o = clipboardManager2;
        return clipboardManager2;
    }

    public InputMethodManager G() {
        return (InputMethodManager) ((u14) this.f531o).getValue();
    }

    public KeyListener H(KeyListener keyListener) {
        if ((keyListener instanceof NumberKeyListener) || (keyListener instanceof k92)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new k92(keyListener);
    }

    public ip J(qu5 qu5Var, ty4 ty4Var) {
        qu5Var.getClass();
        ty4Var.getClass();
        return ((cj3) this.f531o).y(qu5Var, ty4Var);
    }

    public void K(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.m) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.n;
                ep3 ep3VarX = ep3.x(absSeekBar.getContext(), attributeSet, p, i);
                Drawable drawableM = ep3VarX.m(0);
                if (drawableM != null) {
                    if (drawableM instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableX = X(animationDrawable.getFrame(i2), true);
                            drawableX.setLevel(10000);
                            animationDrawable2.addFrame(drawableX, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM);
                }
                Drawable drawableM2 = ep3VarX.m(1);
                if (drawableM2 != null) {
                    absSeekBar.setProgressDrawable(X(drawableM2, false));
                }
                ep3VarX.B();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.n).getContext().obtainStyledAttributes(attributeSet, zz5.i, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    W(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public h92 L(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        xk1 xk1Var = (xk1) this.f531o;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            wk0 wk0Var = (wk0) xk1Var.n;
            if (!(inputConnection instanceof h92)) {
                inputConnection = new h92(editorInfo, inputConnection, (EditText) wk0Var.n);
            }
            inputConnection2 = inputConnection;
        }
        return (h92) inputConnection2;
    }

    public void M(p7 p7Var) {
        pn5 pn5Var = (pn5) this.n;
        ((ActionMode.Callback) pn5Var.m).onDestroyActionMode(pn5Var.g(p7Var));
        qs qsVar = (qs) this.f531o;
        if (qsVar.H != null) {
            qsVar.x.getDecorView().removeCallbacks(qsVar.I);
        }
        if (qsVar.G != null) {
            bf8 bf8Var = qsVar.J;
            if (bf8Var != null) {
                bf8Var.b();
            }
            bf8 bf8VarA = be8.a(qsVar.G);
            bf8VarA.a(0.0f);
            qsVar.J = bf8VarA;
            bf8VarA.d(new ks(this, (byte) 2));
        }
        qsVar.F = null;
        ViewGroup viewGroup = qsVar.L;
        WeakHashMap weakHashMap = be8.a;
        viewGroup.requestApplyInsets();
        qsVar.I();
    }

    public boolean P(p7 p7Var, Menu menu) {
        ViewGroup viewGroup = ((qs) this.f531o).L;
        WeakHashMap weakHashMap = be8.a;
        viewGroup.requestApplyInsets();
        pn5 pn5Var = (pn5) this.n;
        ActionMode.Callback callback = (ActionMode.Callback) pn5Var.m;
        te7 te7VarG = pn5Var.g(p7Var);
        a07 a07Var = (a07) pn5Var.p;
        Menu kq4Var = (Menu) a07Var.get(menu);
        if (kq4Var == null) {
            kq4Var = new kq4((Context) pn5Var.n, (jp4) menu);
            a07Var.put(menu, kq4Var);
        }
        return callback.onPrepareActionMode(te7VarG, kq4Var);
    }

    public void S(bs2 bs2Var) {
        fj fjVar = (fj) this.f531o;
        l07 l07Var = (l07) this.n;
        int i = bs2Var.b;
        if (i == 0) {
            fjVar.execute(new it8((Object) l07Var, (Object) bs2Var.a, (byte) 8));
        } else {
            fjVar.execute(new lj0((byte) 0, i, l07Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:8:0x004b  */
    public za5 T(ke3 ke3Var, w07 w07Var) {
        boolean z;
        w07 w07Var2;
        boolean z2;
        boolean z3;
        LinkedHashMap linkedHashMap;
        Context context = ke3Var.a;
        oi6 oi6Var = ke3Var.q;
        pp5 pp5Var = ke3Var.r;
        sj2 sj2Var = ke3Var.f;
        ii0 ii0Var = ke3Var.j;
        ii0 ii0Var2 = ke3Var.k;
        ii0 ii0Var3 = ke3Var.l;
        f4 f4Var = ne3.b;
        Bitmap.Config config = (Bitmap.Config) nv1.w(ke3Var, f4Var);
        f4 f4Var2 = ne3.h;
        boolean zBooleanValue = ((Boolean) nv1.w(ke3Var, f4Var2)).booleanValue();
        f4 f4Var3 = me3.a;
        if (((List) nv1.w(ke3Var, f4Var3)).isEmpty()) {
            z = true;
        } else {
            if (cx.B0((Bitmap.Config) nv1.w(ke3Var, f4Var), ya8.a)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (((Bitmap.Config) nv1.w(ke3Var, f4Var)) == Bitmap.Config.HARDWARE) {
            if (I(ke3Var, (Bitmap.Config) nv1.w(ke3Var, f4Var))) {
                w07Var2 = w07Var;
                if (((x43) this.f531o).b(w07Var2)) {
                }
                if (z || !z2) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (zBooleanValue || !((List) nv1.w(ke3Var, f4Var3)).isEmpty() || config == Bitmap.Config.ALPHA_8) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                linkedHashMap = new LinkedHashMap(xm4.S(ke3Var.u.n.a, ke3Var.s.a));
                if (config != ((Bitmap.Config) nv1.w(ke3Var, f4Var))) {
                    if (config != null) {
                        linkedHashMap.put(f4Var, config);
                    } else {
                        linkedHashMap.remove(f4Var);
                    }
                }
                if (z3 != ((Boolean) nv1.w(ke3Var, f4Var2)).booleanValue()) {
                    linkedHashMap.put(f4Var2, Boolean.valueOf(z3));
                }
                return new za5(context, w07Var2, oi6Var, pp5Var, null, sj2Var, ii0Var, ii0Var2, ii0Var3, new tg2(uf0.z(linkedHashMap)));
            }
            w07Var2 = w07Var;
            z2 = false;
            if (z) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            if (zBooleanValue) {
                z3 = false;
            } else {
                z3 = false;
            }
            linkedHashMap = new LinkedHashMap(xm4.S(ke3Var.u.n.a, ke3Var.s.a));
            if (config != ((Bitmap.Config) nv1.w(ke3Var, f4Var))) {
                if (config != null) {
                    linkedHashMap.put(f4Var, config);
                } else {
                    linkedHashMap.remove(f4Var);
                }
            }
            if (z3 != ((Boolean) nv1.w(ke3Var, f4Var2)).booleanValue()) {
                linkedHashMap.put(f4Var2, Boolean.valueOf(z3));
            }
            return new za5(context, w07Var2, oi6Var, pp5Var, null, sj2Var, ii0Var, ii0Var2, ii0Var3, new tg2(uf0.z(linkedHashMap)));
        }
        w07Var2 = w07Var;
        z2 = true;
        if (z) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (zBooleanValue) {
            z3 = false;
        } else {
            z3 = false;
        }
        linkedHashMap = new LinkedHashMap(xm4.S(ke3Var.u.n.a, ke3Var.s.a));
        if (config != ((Bitmap.Config) nv1.w(ke3Var, f4Var))) {
            if (config != null) {
                linkedHashMap.put(f4Var, config);
            } else {
                linkedHashMap.remove(f4Var);
            }
        }
        if (z3 != ((Boolean) nv1.w(ke3Var, f4Var2)).booleanValue()) {
            linkedHashMap.put(f4Var2, Boolean.valueOf(z3));
        }
        return new za5(context, w07Var2, oi6Var, pp5Var, null, sj2Var, ii0Var, ii0Var2, ii0Var3, new tg2(uf0.z(linkedHashMap)));
    }

    public void U(String str, String str2) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f531o;
        HashMap map = (HashMap) this.n;
        String str3 = (String) map.get(str);
        if (str2.equals(str3)) {
            return;
        }
        map.put(str, str2);
        if (arrayDeque.isEmpty()) {
            return;
        }
        arrayDeque.push(new xy4(str, str3));
    }

    public u51 V(oz3 oz3Var, nu5 nu5Var, ty4 ty4Var) {
        nu5Var.getClass();
        ty4Var.getClass();
        boolean zBooleanValue = im2.N.i(nu5Var.y).booleanValue();
        mu5 mu5Var = nu5Var.f1602o;
        switch (mu5Var == null ? -1 : jp.a[mu5Var.ordinal()]) {
            case 1:
                byte b = (byte) nu5Var.p;
                return zBooleanValue ? new r68(b) : new bi0(b);
            case 2:
                return new rn0(Character.valueOf((char) nu5Var.p));
            case 3:
                short s2 = (short) nu5Var.p;
                return zBooleanValue ? new r68(s2) : new gz6(s2);
            case 4:
                int i = (int) nu5Var.p;
                return zBooleanValue ? new r68(i) : new el3(i);
            case 5:
                long j = nu5Var.p;
                return zBooleanValue ? new r68(j) : new ng4(j);
            case 6:
                return new r80(nu5Var.q);
            case 7:
                return new r80(nu5Var.r);
            case 8:
                return new r80(Boolean.valueOf(nu5Var.p != 0));
            case ep1.b /* 9 */:
                return new qb7(ty4Var.getString(nu5Var.s));
            case ep1.c /* 10 */:
                return new iu3(et1.y(ty4Var, nu5Var.t), nu5Var.x);
            case 11:
                return new oc2(et1.y(ty4Var, nu5Var.t), sy4.d(ty4Var.getString(nu5Var.u)));
            case ep1.d /* 12 */:
                qu5 qu5Var = nu5Var.v;
                qu5Var.getClass();
                return new sp((Object) y(qu5Var, ty4Var));
            case 13:
                List<nu5> list = nu5Var.w;
                list.getClass();
                ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
                for (nu5 nu5Var2 : list) {
                    g07 g07VarE = ((ps4) this.n).h().e();
                    nu5Var2.getClass();
                    arrayList.add(V(g07VarE, nu5Var2, ty4Var));
                }
                return new s58(arrayList, oz3Var);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + nu5Var.f1602o + " (expected " + oz3Var + ')').toString());
        }
    }

    public void W(boolean z) {
        s92 s92Var = (s92) ((wk0) ((xk1) this.f531o).n).f2420o;
        if (s92Var.f1995o != z) {
            if (s92Var.n != null) {
                a92 a92VarA = a92.a();
                r92 r92Var = s92Var.n;
                a92VarA.getClass();
                io1.A(r92Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a92VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a92VarA.b.remove(r92Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            s92Var.f1995o = z;
            if (z) {
                s92.a(s92Var.m, a92.a().c());
            }
        }
    }

    public Drawable X(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f531o) == null) {
                this.f531o = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = X(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object Y(int i, jc1 jc1Var) {
        ds6 ds6Var;
        if (jc1Var instanceof ds6) {
            ds6Var = (ds6) jc1Var;
            int i2 = ds6Var.f650o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ds6Var.f650o = i2 - Integer.MIN_VALUE;
            } else {
                ds6Var = new ds6(this, jc1Var);
            }
        } else {
            ds6Var = new ds6(this, jc1Var);
        }
        Object obj = ds6Var.m;
        int i3 = ds6Var.f650o;
        if (i3 != 0) {
            if (i3 == 1) {
                ct1.a0(obj);
                return ((tc6) obj).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(obj);
        l07 l07Var = (l07) this.f531o;
        ds6Var.f650o = 1;
        Object objI = l07Var.I(i, ds6Var);
        ne1 ne1Var = ne1.m;
        return objI == ne1Var ? ne1Var : objI;
    }

    public za5 Z(za5 za5Var) {
        tg2 tg2Var;
        boolean z;
        tg2 tg2Var2 = za5Var.j;
        f4 f4Var = ne3.b;
        if (((Bitmap.Config) nv1.x(za5Var, f4Var)) != Bitmap.Config.HARDWARE || ((x43) this.f531o).k()) {
            tg2Var = tg2Var2;
            z = false;
        } else {
            tg2Var2.getClass();
            Map map = tg2Var2.a;
            map.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMap.put(f4Var, config);
            } else {
                linkedHashMap.remove(f4Var);
            }
            tg2 tg2Var3 = new tg2(uf0.z(linkedHashMap));
            z = true;
            tg2Var = tg2Var3;
        }
        return z ? new za5(za5Var.a, za5Var.b, za5Var.c, za5Var.d, za5Var.e, za5Var.f, za5Var.g, za5Var.h, za5Var.i, tg2Var) : za5Var;
    }

    @Override // o.kp
    public ArrayList a(aw5 aw5Var, ty4 ty4Var) {
        aw5Var.getClass();
        ty4Var.getClass();
        Iterable iterable = (List) aw5Var.k(((yf0) this.n).k);
        if (iterable == null) {
            iterable = ea2.m;
        }
        ArrayList arrayList = new ArrayList(mv0.Z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(J((qu5) it.next(), ty4Var));
        }
        return arrayList;
    }

    @Override // o.kp
    public List b(sx3 sx3Var, qv5 qv5Var) {
        return new ArrayList(mv0.Z(ea2.m, 10));
    }

    @Override // o.kp
    public List c(sx3 sx3Var, t1 t1Var, int i, int i2, iw5 iw5Var) {
        if (i == 0) {
            throw null;
        }
        Iterable iterable = (List) iw5Var.k(((yf0) this.n).j);
        if (iterable == null) {
            iterable = ea2.m;
        }
        ArrayList arrayList = new ArrayList(mv0.Z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(J((qu5) it.next(), (ty4) sx3Var.b));
        }
        return arrayList;
    }

    @Override // o.eh7
    public void d(VoidSignalCallback voidSignalCallback) {
        voidSignalCallback.getClass();
        IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) this.f531o;
        IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_RegisterForAlertChanged(iAlertViewModelWrapper.a, iAlertViewModelWrapper, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.kp
    public List e(sx3 sx3Var, t1 t1Var, int i) {
        List list;
        yf0 yf0Var = (yf0) this.n;
        if (i == 0) {
            throw null;
        }
        if (t1Var instanceof vu5) {
            list = (List) ((vu5) t1Var).k(yf0Var.b);
        } else if (t1Var instanceof iv5) {
            list = (List) ((iv5) t1Var).k(yf0Var.d);
        } else {
            if (!(t1Var instanceof qv5)) {
                hk0.f(t1Var, "Unknown message: ");
                return null;
            }
            int iB = ua5.B(i);
            if (iB == 1) {
                list = (List) ((qv5) t1Var).k(yf0Var.e);
            } else if (iB == 2) {
                list = (List) ((qv5) t1Var).k(yf0Var.f);
            } else {
                if (iB != 3) {
                    hk0.l("Unsupported callable kind with property proto");
                    return null;
                }
                list = (List) ((qv5) t1Var).k(yf0Var.g);
            }
        }
        if (list == null) {
            list = ea2.m;
        }
        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(J((qu5) it.next(), (ty4) sx3Var.b));
        }
        return arrayList;
    }

    @Override // o.kp
    public ArrayList f(fw5 fw5Var, ty4 ty4Var) {
        fw5Var.getClass();
        ty4Var.getClass();
        Iterable iterable = (List) fw5Var.k(((yf0) this.n).l);
        if (iterable == null) {
            iterable = ea2.m;
        }
        ArrayList arrayList = new ArrayList(mv0.Z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(J((qu5) it.next(), ty4Var));
        }
        return arrayList;
    }

    @Override // o.ap
    public Object g(sx3 sx3Var, qv5 qv5Var, oz3 oz3Var) {
        nu5 nu5Var = (nu5) it1.C(qv5Var, ((yf0) this.n).i);
        if (nu5Var == null) {
            return null;
        }
        return ((cj3) this.f531o).V(oz3Var, nu5Var, (ty4) sx3Var.b);
    }

    @Override // o.eh7
    public String getTitle() {
        IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) this.f531o;
        String strIAlertViewModelWrapper_GetDescription = IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_GetDescription(iAlertViewModelWrapper.a, iAlertViewModelWrapper);
        strIAlertViewModelWrapper_GetDescription.getClass();
        return strIAlertViewModelWrapper_GetDescription;
    }

    @Override // o.kp
    public ArrayList h(pw5 pw5Var) {
        pw5Var.getClass();
        Iterable iterable = (List) pw5Var.e.k(((yf0) this.n).c);
        if (iterable == null) {
            iterable = ea2.m;
        }
        ArrayList arrayList = new ArrayList(mv0.Z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(J((qu5) it.next(), (ty4) pw5Var.b));
        }
        return arrayList;
    }

    @Override // o.kp
    public List i(sx3 sx3Var, t1 t1Var, int i) {
        String str;
        if (i == 0) {
            throw null;
        }
        if (!(t1Var instanceof iv5)) {
            if (!(t1Var instanceof qv5)) {
                hk0.f(t1Var, "Unknown message: ");
                return null;
            }
            int iB = ua5.B(i);
            if (iB != 1 && iB != 2 && iB != 3) {
                if (i == 1) {
                    str = "FUNCTION";
                } else if (i == 2) {
                    str = "PROPERTY";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "PROPERTY_SETTER";
                } else {
                    str = "PROPERTY_GETTER";
                }
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(str).toString());
            }
        }
        return new ArrayList(mv0.Z(ea2.m, 10));
    }

    @Override // o.eh7
    public void j(VoidSignalCallback voidSignalCallback) {
        voidSignalCallback.getClass();
    }

    @Override // o.qg6
    public pg6 k(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        ve6 ve6Var = (ve6) this.f531o;
        if (!str.equals(":memory:")) {
            str = ((zh1) ve6Var.c).a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        re2 re2Var = new re2(str, (ve6Var.a || ve6Var.b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = re2Var.a;
        reentrantLock.lock();
        wk0 wk0Var = re2Var.b;
        if (wk0Var != null) {
            try {
                wk0Var.x();
            } catch (Throwable th) {
                th = th;
                z = false;
            }
        }
        try {
            try {
                if (ve6Var.b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                pg6 pg6VarK = ((qg6) this.n).k(str);
                if (ve6Var.a) {
                    if (((zh1) ve6Var.c).g == ye6.n) {
                        us1.y(pg6VarK, "PRAGMA synchronous = NORMAL");
                    } else {
                        us1.y(pg6VarK, "PRAGMA synchronous = FULL");
                    }
                    ve6.a(pg6VarK);
                    ((vy1) ve6Var.d).t(pg6VarK);
                } else {
                    try {
                        ve6Var.b = true;
                        ve6Var.b(pg6VarK);
                        ve6Var.b = false;
                    } catch (Throwable th2) {
                        ve6Var.b = false;
                        throw th2;
                    }
                }
                if (wk0Var != null && (fileChannel2 = (FileChannel) wk0Var.f2420o) != null) {
                    try {
                        fileChannel2.close();
                        wk0Var.f2420o = null;
                    } catch (Throwable th3) {
                        wk0Var.f2420o = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return pg6VarK;
            } catch (Throwable th4) {
                if (wk0Var != null && (fileChannel = (FileChannel) wk0Var.f2420o) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        wk0Var.f2420o = null;
                    }
                }
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th = th5;
        try {
            if (z) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    @Override // o.eh7
    public int l() {
        ComputerDetailsViewModel computerDetailsViewModel = ((kc0) this.n).n;
        boolean z = ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_IsOnline(computerDetailsViewModel.a, computerDetailsViewModel) || ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_IsMobileWakeActive(computerDetailsViewModel.a, computerDetailsViewModel);
        IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) this.f531o;
        boolean zIAlertViewModelWrapper_IsAcknowledged = IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_IsAcknowledged(iAlertViewModelWrapper.a, iAlertViewModelWrapper);
        if (z && !zIAlertViewModelWrapper_IsAcknowledged) {
            return 12;
        }
        if (z) {
            return 4;
        }
        return !zIAlertViewModelWrapper_IsAcknowledged ? 8 : 0;
    }

    @Override // o.kp
    public List m(sx3 sx3Var, dv5 dv5Var) {
        sx3Var.getClass();
        Iterable iterable = (List) dv5Var.k(((yf0) this.n).h);
        if (iterable == null) {
            iterable = ea2.m;
        }
        ArrayList arrayList = new ArrayList(mv0.Z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(J((qu5) it.next(), (ty4) sx3Var.b));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(int i, jc1 jc1Var) {
        as6 as6Var;
        Object objH;
        if (jc1Var instanceof as6) {
            as6Var = (as6) jc1Var;
            int i2 = as6Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                as6Var.p = i2 - Integer.MIN_VALUE;
            } else {
                as6Var = new as6(this, jc1Var);
            }
        } else {
            as6Var = new as6(this, jc1Var);
        }
        Object obj = as6Var.n;
        int i3 = as6Var.p;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(obj);
            jk0 jk0Var = (jk0) this.n;
            as6Var.m = i;
            as6Var.p = 1;
            objH = jk0Var.h(as6Var);
            if (objH != ne1Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(obj);
                return ((tc6) obj).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = as6Var.m;
        ct1.a0(obj);
        objH = ((tc6) obj).m;
        Account account = (Account) (objH instanceof sc6 ? null : objH);
        if (account == null) {
            return new sc6(new zr6("Could not retrieve current account id"));
        }
        int accountId = account.getAccountId();
        l07 l07Var = (l07) this.f531o;
        as6Var.m = i;
        as6Var.p = 2;
        Object objY = l07Var.y(i, accountId, as6Var);
        return objY == ne1Var ? ne1Var : objY;
    }

    @Override // o.eh7
    public boolean o() {
        IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) this.f531o;
        return IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_IsAcknowledged(iAlertViewModelWrapper.a, iAlertViewModelWrapper);
    }

    @Override // o.vn7
    public void onError(xd3 xd3Var) {
        byte b = this.m;
    }

    @Override // o.vn7
    public void onStart(xd3 xd3Var) {
        ud5 ud5VarK;
        switch (this.m) {
            case 8:
                break;
            default:
                ke3 ke3Var = (ke3) this.n;
                AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.f531o;
                final ud5 ud5VarP = xd3Var != null ? us1.p(xd3Var, ke3Var.a, asyncImagePainter.A ? 1 : 0) : null;
                if (ud5VarP == null && ((Boolean) nv1.w(ke3Var, mo8.m)).booleanValue() && (ud5VarK = asyncImagePainter.k()) != null) {
                    ud5VarP = ud5VarK;
                }
                asyncImagePainter.o(new sx(ud5VarP) { // from class: coil3.compose.AsyncImagePainter$State$Loading
                    private final ud5 painter;

                    {
                        this.painter = ud5VarP;
                    }

                    @Override // o.sx
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final ud5 getPainter() {
                        return this.painter;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof AsyncImagePainter$State$Loading) && im3.n(this.painter, ((AsyncImagePainter$State$Loading) obj).painter);
                    }

                    public final int hashCode() {
                        ud5 ud5Var = this.painter;
                        if (ud5Var == null) {
                            return 0;
                        }
                        return ud5Var.hashCode();
                    }

                    public final String toString() {
                        return "Loading(painter=" + this.painter + ")";
                    }
                });
                break;
        }
    }

    @Override // o.vn7
    public void onSuccess(xd3 xd3Var) {
        switch (this.m) {
            case 8:
                Bitmap bitmapT = bt1.T(xd3Var);
                of6 of6Var = new of6(((Context) this.n).getResources(), bitmapT);
                of6Var.a(true);
                int width = bitmapT.getWidth();
                int height = bitmapT.getHeight();
                if (width < height) {
                    width = height;
                }
                of6Var.b(width / 2.0f);
                ((ImageView) this.f531o).setImageDrawable(of6Var);
                break;
        }
    }

    @Override // o.eh7
    public void p(fd fdVar) {
        IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) this.f531o;
        IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_CheckNow(iAlertViewModelWrapper.a, iAlertViewModelWrapper, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) fdVar), fdVar);
    }

    @Override // o.eh7
    public void q(fd fdVar) {
        IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) this.f531o;
        IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_Acknowledge(iAlertViewModelWrapper.a, iAlertViewModelWrapper, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) fdVar), fdVar);
    }

    @Override // o.eh7
    public int r() {
        return 0;
    }

    @Override // o.kp
    public List s(sx3 sx3Var, qv5 qv5Var) {
        return new ArrayList(mv0.Z(ea2.m, 10));
    }

    @Override // o.eh7
    public String t() {
        return "";
    }

    public String toString() {
        switch (this.m) {
            case 25:
                try {
                    return D().toString();
                } catch (d55 unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    @Override // o.ap
    public Object u(sx3 sx3Var, qv5 qv5Var, oz3 oz3Var) {
        return null;
    }

    public uc6 v(int i, int i2, i70 i70Var) throws d55 {
        EnumMap enumMap;
        int[] iArrL = f78.l(i70Var, i2, false, s, new int[3]);
        try {
            return ((e78) this.f531o).a(i, i70Var, iArrL);
        } catch (p36 unused) {
            e78 e78Var = (e78) this.n;
            StringBuilder sb = e78Var.b;
            sb.setLength(0);
            int[] iArr = e78Var.a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i3 = i70Var.n;
            int iC = iArrL[1];
            int i4 = 0;
            for (int i5 = 0; i5 < 2 && iC < i3; i5++) {
                int iH = f78.h(i70Var, iArr, iC, f78.g);
                sb.append((char) ((iH % 10) + 48));
                for (int i6 : iArr) {
                    iC += i6;
                }
                if (iH >= 10) {
                    i4 |= 1 << (1 - i5);
                }
                if (i5 != 1) {
                    iC = i70Var.c(i70Var.b(iC));
                }
            }
            if (sb.length() != 2) {
                throw d55.a();
            }
            if (Integer.parseInt(sb.toString()) % 4 != i4) {
                throw d55.a();
            }
            String string = sb.toString();
            if (string.length() != 2) {
                enumMap = null;
            } else {
                enumMap = new EnumMap(vc6.class);
                enumMap.put(vc6.r, Integer.valueOf(string));
            }
            float f = i;
            uc6 uc6Var = new uc6(string, null, new wc6[]{new wc6((iArrL[0] + iArrL[1]) / 2.0f, f), new wc6(iC, f)}, v20.C);
            if (enumMap != null) {
                uc6Var.a(enumMap);
            }
            return uc6Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(int i, jc1 jc1Var) {
        bs6 bs6Var;
        if (jc1Var instanceof bs6) {
            bs6Var = (bs6) jc1Var;
            int i2 = bs6Var.f452o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bs6Var.f452o = i2 - Integer.MIN_VALUE;
            } else {
                bs6Var = new bs6(this, jc1Var);
            }
        } else {
            bs6Var = new bs6(this, jc1Var);
        }
        Object obj = bs6Var.m;
        int i3 = bs6Var.f452o;
        if (i3 != 0) {
            if (i3 == 1) {
                ct1.a0(obj);
                return ((tc6) obj).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(obj);
        l07 l07Var = (l07) this.f531o;
        bs6Var.f452o = 1;
        Object objB = l07Var.B(i, bs6Var);
        ne1 ne1Var = ne1.m;
        return objB == ne1Var ? ne1Var : objB;
    }

    @Override // o.eh7
    public String x() {
        IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) this.f531o;
        String strIAlertViewModelWrapper_GetAge = IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_GetAge(iAlertViewModelWrapper.a, iAlertViewModelWrapper);
        strIAlertViewModelWrapper_GetAge.getClass();
        return strIAlertViewModelWrapper_GetAge;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f7  */
    public ip y(qu5 qu5Var, ty4 ty4Var) {
        Map mapU;
        qu5Var.getClass();
        ty4Var.getClass();
        ns4 ns4VarT = vs1.t((ps4) this.n, et1.y(ty4Var, qu5Var.f1867o), (j93) this.f531o);
        if (qu5Var.p.size() == 0 || hd2.f(ns4VarT)) {
            mapU = fa2.m;
        } else {
            int i = zo1.a;
            if (zo1.n(ns4VarT, ms0.q)) {
                Collection collectionZ = ns4VarT.z();
                collectionZ.getClass();
                wr0 wr0Var = (wr0) lv0.G0(collectionZ);
                if (wr0Var != null) {
                    List listJ = wr0Var.J();
                    listJ.getClass();
                    int iQ = xm4.Q(mv0.Z(listJ, 10));
                    if (iQ < 16) {
                        iQ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
                    for (Object obj : listJ) {
                        linkedHashMap.put(((qb8) obj).getName(), obj);
                    }
                    List<ou5> list = qu5Var.p;
                    list.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (ou5 ou5Var : list) {
                        ou5Var.getClass();
                        qb8 qb8Var = (qb8) linkedHashMap.get(sy4.d(ty4Var.getString(ou5Var.f1678o)));
                        Object vd5Var = null;
                        if (qb8Var != null) {
                            sy4 sy4VarD = sy4.d(ty4Var.getString(ou5Var.f1678o));
                            oz3 type = qb8Var.getType();
                            type.getClass();
                            nu5 nu5Var = ou5Var.p;
                            nu5Var.getClass();
                            u51 u51VarV = V(type, nu5Var, ty4Var);
                            vd5Var = z(u51VarV, type, nu5Var) ? u51VarV : null;
                            if (vd5Var == null) {
                                vd5Var = new id2("Unexpected argument value: actual type " + nu5Var.f1602o + " != expected type " + type);
                            }
                            vd5Var = new vd5(sy4VarD, vd5Var);
                        }
                        if (vd5Var != null) {
                            arrayList.add(vd5Var);
                        }
                    }
                    mapU = xm4.U(arrayList);
                } else {
                    mapU = fa2.m;
                }
            } else {
                mapU = fa2.m;
            }
        }
        return new ip(ns4VarT.W(), mapU, s67.h);
    }

    public boolean z(u51 u51Var, oz3 oz3Var, nu5 nu5Var) {
        u51 u51Var2;
        nu5 nu5Var2;
        ps4 ps4Var = (ps4) this.n;
        mu5 mu5Var = nu5Var.f1602o;
        int i = mu5Var == null ? -1 : jp.a[mu5Var.ordinal()];
        if (i == 10) {
            ys0 ys0VarA = oz3Var.o0().a();
            ns4 ns4Var = ys0VarA instanceof ns4 ? (ns4) ys0VarA : null;
            if (ns4Var != null) {
                sy4 sy4Var = wy3.e;
                if (!wy3.b(ns4Var, s87.Q)) {
                    return false;
                }
            }
            return true;
        }
        if (i != 13) {
            return im3.n(u51Var.a(ps4Var), oz3Var);
        }
        if (u51Var instanceof bx) {
            Object obj = ((bx) u51Var).a;
            if (((List) obj).size() == nu5Var.w.size()) {
                oz3 oz3VarF = ps4Var.h().f(oz3Var);
                Collection collection = (Collection) obj;
                collection.getClass();
                Iterable yk3Var = new yk3(0, collection.size() - 1, 1);
                if (!(yk3Var instanceof Collection) || !((Collection) yk3Var).isEmpty()) {
                    Iterator it = yk3Var.iterator();
                    do {
                        xk3 xk3Var = (xk3) it;
                        if (xk3Var.f2526o) {
                            int iNextInt = xk3Var.nextInt();
                            u51Var2 = (u51) ((List) obj).get(iNextInt);
                            nu5Var2 = (nu5) nu5Var.w.get(iNextInt);
                            nu5Var2.getClass();
                        }
                    } while (z(u51Var2, oz3VarF, nu5Var2));
                    return false;
                }
                return true;
            }
        }
        yq4.k(u51Var, "Deserialized ArrayValue should have the same number of elements as the original array value: ");
        return false;
    }

    public /* synthetic */ cj3(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    public /* synthetic */ cj3(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f531o = obj2;
    }

    public cj3(String str, ga0 ga0Var, z06 z06Var) {
        this.m = (byte) 16;
        this.f531o = str;
        this.n = ga0Var;
    }

    public cj3(ps4 ps4Var, j93 j93Var, yf0 yf0Var) {
        this.m = (byte) 14;
        ps4Var.getClass();
        yf0Var.getClass();
        this.n = yf0Var;
        this.f531o = new cj3(ps4Var, j93Var);
    }

    public /* synthetic */ cj3(byte b, boolean z) {
        this.m = b;
    }

    public cj3(byte b) {
        this.m = b;
        switch (b) {
            case 5:
                this.n = new e78((byte) 1);
                this.f531o = new e78((byte) 0);
                break;
            default:
                this.n = new HashMap();
                this.f531o = new ArrayDeque();
                break;
        }
    }

    public cj3(ConstraintLayout constraintLayout, ComposeView composeView, ConstraintLayout constraintLayout2) {
        this.m = (byte) 7;
        this.n = composeView;
        this.f531o = constraintLayout2;
    }

    public cj3(ps4 ps4Var, j93 j93Var) {
        this.m = (byte) 15;
        ps4Var.getClass();
        j93Var.getClass();
        this.n = ps4Var;
        this.f531o = j93Var;
    }

    public cj3(i46 i46Var) {
        Object awVar;
        this.m = (byte) 11;
        this.n = i46Var;
        if (y43.a) {
            awVar = new s7(false);
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i != 26 && i != 27) {
                awVar = new s7(true);
            } else {
                awVar = new aw((byte) 21);
            }
        }
        this.f531o = awVar;
    }

    public cj3(EditText editText) {
        this.m = (byte) 19;
        this.n = editText;
        this.f531o = new xk1(editText);
    }

    public cj3(View view) {
        this.m = (byte) 0;
        this.n = view;
        this.f531o = ds1.X(l54.n, new zz0(this, (byte) 28));
    }

    public cj3(ve6 ve6Var, qg6 qg6Var) {
        this.m = (byte) 23;
        qg6Var.getClass();
        this.f531o = ve6Var;
        this.n = qg6Var;
    }

    public cj3(b70 b70Var) {
        this.m = (byte) 22;
        this.f531o = b70Var;
    }

    public cj3(d11 d11Var, HashMap map, HashMap map2) {
        this.m = (byte) 6;
        this.n = d11Var;
        this.f531o = map;
    }

    public cj3(ie0 ie0Var) {
        this.m = (byte) 26;
        this.f531o = ie0Var;
        ep3 ep3Var = it1.c;
        if (ep3Var != null) {
            this.n = ep3Var.p();
        } else {
            im3.e0("viewFactory");
            throw null;
        }
    }

    public cj3(qs qsVar, pn5 pn5Var) {
        this.m = (byte) 18;
        this.f531o = qsVar;
        this.n = pn5Var;
    }
}
