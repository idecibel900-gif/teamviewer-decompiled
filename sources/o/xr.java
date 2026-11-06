package o;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class xr extends xt2 implements bs {
    public qs M;

    public xr() {
        ((a65) this.p.f302o).Q0("androidx:appcompat", new vr(this));
        x(new wr(this));
    }

    public final hs G() {
        qs qsVar = this.M;
        if (qsVar != null) {
            return qsVar;
        }
        gs gsVar = hs.m;
        qs qsVar2 = new qs(this, null, this, this);
        this.M = qsVar2;
        return qsVar2;
    }

    public final ck3 H() {
        qs qsVar = (qs) G();
        qsVar.A();
        return qsVar.z;
    }

    public final void I(Toolbar toolbar) {
        qs qsVar = (qs) G();
        Object obj = qsVar.v;
        if (obj instanceof Activity) {
            qsVar.A();
            ck3 ck3Var = qsVar.z;
            if (ck3Var instanceof jj8) {
                hk0.l("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            qsVar.A = null;
            if (ck3Var != null) {
                ck3Var.c0();
            }
            qsVar.z = null;
            if (toolbar != null) {
                lz7 lz7Var = new lz7(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : qsVar.B, qsVar.y);
                qsVar.z = lz7Var;
                qsVar.y.n = lz7Var.Q;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                qsVar.y.n = null;
            }
            qsVar.c();
        }
    }

    @Override // o.my0, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        qs qsVar = (qs) G();
        qsVar.w();
        ((ViewGroup) qsVar.L.findViewById(R.id.content)).addView(view, layoutParams);
        qsVar.y.a(qsVar.x.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0194  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:117:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:128:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:139:0x021d A[Catch: all -> 0x0211, TRY_LEAVE, TryCatch #0 {, blocks: (B:130:0x01ff, B:132:0x0203, B:138:0x021b, B:139:0x021d, B:141:0x0221, B:147:0x0231, B:146:0x0228, B:137:0x0214), top: B:157:0x01ff, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x01ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:72:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:78:0x012d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0135  */
    /* JADX WARN: Code duplicated, block: B:84:0x013d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149  */
    /* JADX WARN: Code duplicated, block: B:90:0x0158  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:96:0x0176  */
    /* JADX WARN: Code duplicated, block: B:99:0x0185  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        gc1 gc1Var;
        Resources.Theme theme;
        Method method;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        LocaleList locales;
        LocaleList locales2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
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
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        qs qsVar = (qs) G();
        qsVar.Y = true;
        int i41 = qsVar.c0;
        if (i41 == -100) {
            i41 = hs.n;
        }
        int iC = qsVar.C(context, i41);
        byte b = 0;
        if (hs.d(context) && hs.d(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (hs.u) {
                    try {
                        ld4 ld4Var = hs.f1003o;
                        if (ld4Var == null) {
                            ld4 ld4VarA = hs.p;
                            if (ld4VarA == null) {
                                ld4VarA = ld4.a(db8.w0(context));
                                hs.p = ld4VarA;
                            }
                            if (!ld4VarA.a.a.isEmpty()) {
                                hs.f1003o = hs.p;
                            }
                        } else if (!ld4Var.equals(hs.p)) {
                            ld4 ld4Var2 = hs.f1003o;
                            hs.p = ld4Var2;
                            db8.t0(context, ld4Var2.a.a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!hs.r) {
                hs.m.execute(new fs(context, b));
            }
        }
        ld4 ld4VarP = qs.p(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(qs.t(context, iC, ld4VarP, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof gc1) {
                    try {
                        ((gc1) context).a(qs.t(context, iC, ld4VarP, null, false));
                    } catch (IllegalStateException unused2) {
                        if (qs.t0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (configuration.equals(configuration2)) {
                                configuration3 = null;
                            } else {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    locales = configuration.getLocales();
                                    locales2 = configuration2.getLocales();
                                    if (!locales.equals(locales2)) {
                                        configuration3.setLocales(locales2);
                                        configuration3.locale = configuration2.locale;
                                    }
                                    i5 = configuration.touchscreen;
                                    i6 = configuration2.touchscreen;
                                    if (i5 != i6) {
                                        configuration3.touchscreen = i6;
                                    }
                                    i7 = configuration.keyboard;
                                    i8 = configuration2.keyboard;
                                    if (i7 != i8) {
                                        configuration3.keyboard = i8;
                                    }
                                    i9 = configuration.keyboardHidden;
                                    i10 = configuration2.keyboardHidden;
                                    if (i9 != i10) {
                                        configuration3.keyboardHidden = i10;
                                    }
                                    i11 = configuration.navigation;
                                    i12 = configuration2.navigation;
                                    if (i11 != i12) {
                                        configuration3.navigation = i12;
                                    }
                                    i13 = configuration.navigationHidden;
                                    i14 = configuration2.navigationHidden;
                                    if (i13 != i14) {
                                        configuration3.navigationHidden = i14;
                                    }
                                    i15 = configuration.orientation;
                                    i16 = configuration2.orientation;
                                    if (i15 != i16) {
                                        configuration3.orientation = i16;
                                    }
                                    i17 = configuration.screenLayout & 15;
                                    i18 = configuration2.screenLayout & 15;
                                    if (i17 != i18) {
                                        configuration3.screenLayout |= i18;
                                    }
                                    i19 = configuration.screenLayout & 192;
                                    i20 = configuration2.screenLayout & 192;
                                    if (i19 != i20) {
                                        configuration3.screenLayout |= i20;
                                    }
                                    i21 = configuration.screenLayout & 48;
                                    i22 = configuration2.screenLayout & 48;
                                    if (i21 != i22) {
                                        configuration3.screenLayout |= i22;
                                    }
                                    i23 = configuration.screenLayout & 768;
                                    i24 = configuration2.screenLayout & 768;
                                    if (i23 != i24) {
                                        configuration3.screenLayout |= i24;
                                    }
                                    i25 = configuration.colorMode & 3;
                                    i26 = configuration2.colorMode & 3;
                                    if (i25 != i26) {
                                        configuration3.colorMode |= i26;
                                    }
                                    i27 = configuration.colorMode & 12;
                                    i28 = configuration2.colorMode & 12;
                                    if (i27 != i28) {
                                        configuration3.colorMode |= i28;
                                    }
                                    i29 = configuration.uiMode & 15;
                                    i30 = configuration2.uiMode & 15;
                                    if (i29 != i30) {
                                        configuration3.uiMode |= i30;
                                    }
                                    i31 = configuration.uiMode & 48;
                                    i32 = configuration2.uiMode & 48;
                                    if (i31 != i32) {
                                        configuration3.uiMode |= i32;
                                    }
                                    i33 = configuration.screenWidthDp;
                                    i34 = configuration2.screenWidthDp;
                                    if (i33 != i34) {
                                        configuration3.screenWidthDp = i34;
                                    }
                                    i35 = configuration.screenHeightDp;
                                    i36 = configuration2.screenHeightDp;
                                    if (i35 != i36) {
                                        configuration3.screenHeightDp = i36;
                                    }
                                    i37 = configuration.smallestScreenWidthDp;
                                    i38 = configuration2.smallestScreenWidthDp;
                                    if (i37 != i38) {
                                        configuration3.smallestScreenWidthDp = i38;
                                    }
                                    i39 = configuration.densityDpi;
                                    i40 = configuration2.densityDpi;
                                    if (i39 != i40) {
                                        configuration3.densityDpi = i40;
                                    }
                                }
                            }
                            Configuration configurationT = qs.t(context, iC, ld4VarP, configuration3, true);
                            gc1Var = new gc1(context, com.teamviewer.teamviewer.market.mobile.R.style.Theme_AppCompat_Empty);
                            gc1Var.a(configurationT);
                            try {
                                if (context.getTheme() != null) {
                                    theme = gc1Var.getTheme();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        eq.s(theme);
                                    } else {
                                        synchronized (qf0.n) {
                                            if (qf0.p) {
                                                method = qf0.f1826o;
                                                if (method != null) {
                                                    method.invoke(theme, null);
                                                }
                                            } else {
                                                try {
                                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                                    qf0.f1826o = declaredMethod;
                                                    declaredMethod.setAccessible(true);
                                                } catch (NoSuchMethodException e) {
                                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                                }
                                                qf0.p = true;
                                                method = qf0.f1826o;
                                                if (method != null) {
                                                    try {
                                                        method.invoke(theme, null);
                                                    } catch (IllegalAccessException | InvocationTargetException e2) {
                                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                                        qf0.f1826o = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = gc1Var;
                        }
                    }
                } else if (qs.t0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            locales = configuration.getLocales();
                            locales2 = configuration2.getLocales();
                            if (!locales.equals(locales2)) {
                                configuration3.setLocales(locales2);
                                configuration3.locale = configuration2.locale;
                            }
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout & 15;
                            i18 = configuration2.screenLayout & 15;
                            if (i17 != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout & 192;
                            i20 = configuration2.screenLayout & 192;
                            if (i19 != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout & 48;
                            i22 = configuration2.screenLayout & 48;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 768;
                            i24 = configuration2.screenLayout & 768;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            i25 = configuration.colorMode & 3;
                            i26 = configuration2.colorMode & 3;
                            if (i25 != i26) {
                                configuration3.colorMode |= i26;
                            }
                            i27 = configuration.colorMode & 12;
                            i28 = configuration2.colorMode & 12;
                            if (i27 != i28) {
                                configuration3.colorMode |= i28;
                            }
                            i29 = configuration.uiMode & 15;
                            i30 = configuration2.uiMode & 15;
                            if (i29 != i30) {
                                configuration3.uiMode |= i30;
                            }
                            i31 = configuration.uiMode & 48;
                            i32 = configuration2.uiMode & 48;
                            if (i31 != i32) {
                                configuration3.uiMode |= i32;
                            }
                            i33 = configuration.screenWidthDp;
                            i34 = configuration2.screenWidthDp;
                            if (i33 != i34) {
                                configuration3.screenWidthDp = i34;
                            }
                            i35 = configuration.screenHeightDp;
                            i36 = configuration2.screenHeightDp;
                            if (i35 != i36) {
                                configuration3.screenHeightDp = i36;
                            }
                            i37 = configuration.smallestScreenWidthDp;
                            i38 = configuration2.smallestScreenWidthDp;
                            if (i37 != i38) {
                                configuration3.smallestScreenWidthDp = i38;
                            }
                            i39 = configuration.densityDpi;
                            i40 = configuration2.densityDpi;
                            if (i39 != i40) {
                                configuration3.densityDpi = i40;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationT2 = qs.t(context, iC, ld4VarP, configuration3, true);
                    gc1Var = new gc1(context, com.teamviewer.teamviewer.market.mobile.R.style.Theme_AppCompat_Empty);
                    gc1Var.a(configurationT2);
                    if (context.getTheme() != null) {
                        theme = gc1Var.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            eq.s(theme);
                        } else {
                            synchronized (qf0.n) {
                                if (qf0.p) {
                                    Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    qf0.f1826o = declaredMethod2;
                                    declaredMethod2.setAccessible(true);
                                    qf0.p = true;
                                    method = qf0.f1826o;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                } else {
                                    method = qf0.f1826o;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                }
                            }
                        }
                    }
                    context = gc1Var;
                }
            }
        } else if (context instanceof gc1) {
            ((gc1) context).a(qs.t(context, iC, ld4VarP, null, false));
        } else if (qs.t0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    locales = configuration.getLocales();
                    locales2 = configuration2.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration3.setLocales(locales2);
                        configuration3.locale = configuration2.locale;
                    }
                    i5 = configuration.touchscreen;
                    i6 = configuration2.touchscreen;
                    if (i5 != i6) {
                        configuration3.touchscreen = i6;
                    }
                    i7 = configuration.keyboard;
                    i8 = configuration2.keyboard;
                    if (i7 != i8) {
                        configuration3.keyboard = i8;
                    }
                    i9 = configuration.keyboardHidden;
                    i10 = configuration2.keyboardHidden;
                    if (i9 != i10) {
                        configuration3.keyboardHidden = i10;
                    }
                    i11 = configuration.navigation;
                    i12 = configuration2.navigation;
                    if (i11 != i12) {
                        configuration3.navigation = i12;
                    }
                    i13 = configuration.navigationHidden;
                    i14 = configuration2.navigationHidden;
                    if (i13 != i14) {
                        configuration3.navigationHidden = i14;
                    }
                    i15 = configuration.orientation;
                    i16 = configuration2.orientation;
                    if (i15 != i16) {
                        configuration3.orientation = i16;
                    }
                    i17 = configuration.screenLayout & 15;
                    i18 = configuration2.screenLayout & 15;
                    if (i17 != i18) {
                        configuration3.screenLayout |= i18;
                    }
                    i19 = configuration.screenLayout & 192;
                    i20 = configuration2.screenLayout & 192;
                    if (i19 != i20) {
                        configuration3.screenLayout |= i20;
                    }
                    i21 = configuration.screenLayout & 48;
                    i22 = configuration2.screenLayout & 48;
                    if (i21 != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout & 768;
                    i24 = configuration2.screenLayout & 768;
                    if (i23 != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    i25 = configuration.colorMode & 3;
                    i26 = configuration2.colorMode & 3;
                    if (i25 != i26) {
                        configuration3.colorMode |= i26;
                    }
                    i27 = configuration.colorMode & 12;
                    i28 = configuration2.colorMode & 12;
                    if (i27 != i28) {
                        configuration3.colorMode |= i28;
                    }
                    i29 = configuration.uiMode & 15;
                    i30 = configuration2.uiMode & 15;
                    if (i29 != i30) {
                        configuration3.uiMode |= i30;
                    }
                    i31 = configuration.uiMode & 48;
                    i32 = configuration2.uiMode & 48;
                    if (i31 != i32) {
                        configuration3.uiMode |= i32;
                    }
                    i33 = configuration.screenWidthDp;
                    i34 = configuration2.screenWidthDp;
                    if (i33 != i34) {
                        configuration3.screenWidthDp = i34;
                    }
                    i35 = configuration.screenHeightDp;
                    i36 = configuration2.screenHeightDp;
                    if (i35 != i36) {
                        configuration3.screenHeightDp = i36;
                    }
                    i37 = configuration.smallestScreenWidthDp;
                    i38 = configuration2.smallestScreenWidthDp;
                    if (i37 != i38) {
                        configuration3.smallestScreenWidthDp = i38;
                    }
                    i39 = configuration.densityDpi;
                    i40 = configuration2.densityDpi;
                    if (i39 != i40) {
                        configuration3.densityDpi = i40;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationT3 = qs.t(context, iC, ld4VarP, configuration3, true);
            gc1Var = new gc1(context, com.teamviewer.teamviewer.market.mobile.R.style.Theme_AppCompat_Empty);
            gc1Var.a(configurationT3);
            if (context.getTheme() != null) {
                theme = gc1Var.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    eq.s(theme);
                } else {
                    synchronized (qf0.n) {
                        if (qf0.p) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            qf0.f1826o = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            qf0.p = true;
                            method = qf0.f1826o;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        } else {
                            method = qf0.f1826o;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        }
                    }
                }
            }
            context = gc1Var;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ck3 ck3VarH = H();
        if (getWindow().hasFeature(0)) {
            if (ck3VarH == null || !ck3VarH.s()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // o.ly0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ck3 ck3VarH = H();
        if (keyCode == 82 && ck3VarH != null && ck3VarH.e0(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        qs qsVar = (qs) G();
        qsVar.w();
        return qsVar.x.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        qs qsVar = (qs) G();
        xe7 xe7Var = qsVar.A;
        if (xe7Var == null) {
            qsVar.A();
            ck3 ck3Var = qsVar.z;
            xe7Var = new xe7(ck3Var != null ? ck3Var.S() : qsVar.w);
            qsVar.A = xe7Var;
        }
        return xe7Var;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        G().c();
    }

    @Override // o.my0, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        qs qsVar = (qs) G();
        if (qsVar.P && qsVar.K) {
            qsVar.A();
            ck3 ck3Var = qsVar.z;
            if (ck3Var != null) {
                ck3Var.b0();
            }
        }
        us usVarA = us.a();
        Context context = qsVar.w;
        synchronized (usVarA) {
            bc6 bc6Var = usVarA.a;
            synchronized (bc6Var) {
                mg4 mg4Var = (mg4) bc6Var.b.get(context);
                if (mg4Var != null) {
                    mg4Var.a();
                }
            }
        }
        qsVar.b0 = new Configuration(qsVar.w.getResources().getConfiguration());
        qsVar.n(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // o.xt2, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        G().f();
    }

    @Override // o.xt2, o.my0, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentV;
        if (!super.onMenuItemSelected(i, menuItem)) {
            ck3 ck3VarH = H();
            if (menuItem.getItemId() != 16908332 || ck3VarH == null || (ck3VarH.R() & 4) == 0 || (intentV = vt1.v(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentV)) {
                navigateUpTo(intentV);
                return true;
            }
            jo7 jo7Var = new jo7(this);
            Intent intentV2 = vt1.v(this);
            if (intentV2 == null) {
                intentV2 = vt1.v(this);
            }
            if (intentV2 != null) {
                ComponentName component = intentV2.getComponent();
                if (component == null) {
                    component = intentV2.resolveActivity(jo7Var.n.getPackageManager());
                }
                jo7Var.a(component);
                jo7Var.m.add(intentV2);
            }
            jo7Var.b();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((qs) G()).w();
    }

    @Override // o.xt2, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        qs qsVar = (qs) G();
        qsVar.A();
        ck3 ck3Var = qsVar.z;
        if (ck3Var != null) {
            ck3Var.q0(true);
        }
    }

    @Override // o.xt2, android.app.Activity
    public void onStart() {
        super.onStart();
        ((qs) G()).n(true, false);
    }

    @Override // o.xt2, android.app.Activity
    public void onStop() {
        super.onStop();
        qs qsVar = (qs) G();
        qsVar.A();
        ck3 ck3Var = qsVar.z;
        if (ck3Var != null) {
            ck3Var.q0(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        G().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ck3 ck3VarH = H();
        if (getWindow().hasFeature(0)) {
            if (ck3VarH == null || !ck3VarH.f0()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // o.my0, android.app.Activity
    public final void setContentView(int i) {
        A();
        G().j(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((qs) G()).d0 = i;
    }

    @Override // o.my0, android.app.Activity
    public void setContentView(View view) {
        A();
        G().k(view);
    }

    @Override // o.my0, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        G().l(view, layoutParams);
    }
}
