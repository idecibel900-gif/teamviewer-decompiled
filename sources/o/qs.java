package o;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qs extends hs implements hp4, LayoutInflater.Factory2 {
    public static final a07 r0 = new a07(0);
    public static final int[] s0 = {R.attr.windowBackground};
    public static final boolean t0 = !"robolectric".equals(Build.FINGERPRINT);
    public xe7 A;
    public CharSequence B;
    public ActionBarOverlayLayout C;
    public js D;
    public js E;
    public p7 F;
    public ActionBarContextView G;
    public PopupWindow H;
    public is I;
    public boolean K;
    public ViewGroup L;
    public TextView M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public ps[] V;
    public ps W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public Configuration b0;
    public final int c0;
    public int d0;
    public int e0;
    public boolean f0;
    public ms g0;
    public ms h0;
    public boolean i0;
    public int j0;
    public boolean l0;
    public Rect m0;
    public Rect n0;
    public eu o0;
    public OnBackInvokedDispatcher p0;
    public iq q0;
    public final Object v;
    public final Context w;
    public Window x;
    public ls y;
    public ck3 z;
    public bf8 J = null;
    public final is k0 = new is(this, 0);

    public qs(Context context, Window window, bs bsVar, Object obj) {
        xr xrVar = null;
        this.c0 = -100;
        this.w = context;
        this.v = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof xr)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    xrVar = (xr) context;
                    break;
                }
            }
            if (xrVar != null) {
                this.c0 = ((qs) xrVar.G()).c0;
            }
        }
        if (this.c0 == -100) {
            String name = this.v.getClass().getName();
            a07 a07Var = r0;
            Integer num = (Integer) a07Var.get(name);
            if (num != null) {
                this.c0 = num.intValue();
                a07Var.remove(this.v.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        us.d();
    }

    public static ld4 p(Context context) {
        ld4 ld4Var;
        ld4 ld4Var2;
        if (Build.VERSION.SDK_INT >= 33 || (ld4Var = hs.f1003o) == null) {
            return null;
        }
        md4 md4Var = ld4Var.a;
        ld4 ld4VarA = ld4.a(context.getApplicationContext().getResources().getConfiguration().getLocales().toLanguageTags());
        if (md4Var.a.isEmpty()) {
            ld4Var2 = ld4.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < ld4VarA.a.a.size() + md4Var.a.size()) {
                Locale localeB = i < md4Var.a.size() ? ld4Var.b(i) : ld4VarA.b(i - md4Var.a.size());
                if (localeB != null) {
                    linkedHashSet.add(localeB);
                }
                i++;
            }
            ld4Var2 = new ld4(new md4(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return ld4Var2.a.a.isEmpty() ? ld4VarA : ld4Var2;
    }

    public static Configuration t(Context context, int i, ld4 ld4Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (ld4Var != null) {
            configuration2.setLocales(LocaleList.forLanguageTags(ld4Var.a.a.toLanguageTags()));
        }
        return configuration2;
    }

    public final void A() {
        ck3 jj8Var;
        w();
        if (this.P && (jj8Var = this.z) == null) {
            Object obj = this.v;
            if (obj instanceof Activity) {
                jj8Var = new jj8((Activity) obj, this.Q);
                this.z = jj8Var;
            } else if (obj instanceof Dialog) {
                jj8Var = new jj8((Dialog) obj);
                this.z = jj8Var;
            }
            if (jj8Var != null) {
                jj8Var.m0(this.l0);
            }
        }
    }

    public final void B(int i) {
        this.j0 = (1 << i) | this.j0;
        if (this.i0) {
            return;
        }
        View decorView = this.x.getDecorView();
        WeakHashMap weakHashMap = be8.a;
        decorView.postOnAnimation(this.k0);
        this.i0 = true;
    }

    public final int C(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            hk0.l("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        ms msVar = this.h0;
                        if (msVar == null) {
                            msVar = new ms(this, context);
                            this.h0 = msVar;
                        }
                        return msVar.h();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return y(context).h();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean D() {
        boolean z = this.X;
        this.X = false;
        ps psVarZ = z(0);
        if (!psVarZ.m) {
            p7 p7Var = this.F;
            if (p7Var != null) {
                p7Var.c();
                return true;
            }
            A();
            ck3 ck3Var = this.z;
            if (ck3Var == null || !ck3Var.t()) {
                return false;
            }
        } else if (!z) {
            s(psVarZ, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
    
        if (r6.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(o.ps r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.qs.E(o.ps, android.view.KeyEvent):void");
    }

    public final boolean F(ps psVar, int i, KeyEvent keyEvent) {
        jp4 jp4Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((psVar.k || G(psVar, keyEvent)) && (jp4Var = psVar.h) != null) {
            return jp4Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d6 A[PHI: r6
      0x00d6: PHI (r6v2 o.jp4) = (r6v1 o.jp4), (r6v8 o.jp4) binds: [B:34:0x0054, B:60:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0112  */
    public final boolean G(ps psVar, KeyEvent keyEvent) {
        jp4 jp4Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        js jsVar;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.a0) {
            boolean z = psVar.k;
            int i = psVar.a;
            if (z) {
                return true;
            }
            ps psVar2 = this.W;
            if (psVar2 != null && psVar2 != psVar) {
                s(psVar2, false);
            }
            Window.Callback callback = this.x.getCallback();
            if (callback != null) {
                psVar.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.C) != null) {
                actionBarOverlayLayout4.j();
                ((a08) actionBarOverlayLayout4.q).l = true;
            }
            if (psVar.g == null && (!z2 || !(this.z instanceof lz7))) {
                jp4 jp4Var2 = psVar.h;
                if (jp4Var2 == null || psVar.f1769o) {
                    if (jp4Var2 == null) {
                        Context context = this.w;
                        if ((i == 0 || i == 108) && this.C != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.teamviewer.teamviewer.market.mobile.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.teamviewer.teamviewer.market.mobile.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.teamviewer.teamviewer.market.mobile.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                gc1 gc1Var = new gc1(context, 0);
                                gc1Var.getTheme().setTo(themeNewTheme);
                                context = gc1Var;
                            }
                        }
                        jp4 jp4Var3 = new jp4(context);
                        jp4Var3.e = this;
                        jp4 jp4Var4 = psVar.h;
                        if (jp4Var3 != jp4Var4) {
                            if (jp4Var4 != null) {
                                jp4Var4.t(psVar.i);
                            }
                            psVar.h = jp4Var3;
                            xb4 xb4Var = psVar.i;
                            if (xb4Var != null) {
                                jp4Var3.b(xb4Var, jp4Var3.a);
                            }
                        }
                        jp4Var2 = psVar.h;
                        if (jp4Var2 != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.C) != null) {
                                jsVar = this.D;
                                if (jsVar == null) {
                                    jsVar = new js(this, (byte) 2);
                                    this.D = jsVar;
                                }
                                actionBarOverlayLayout2.l(jp4Var2, jsVar);
                            }
                            psVar.h.y();
                            if (callback.onCreatePanelMenu(i, psVar.h)) {
                                psVar.f1769o = false;
                            } else {
                                jp4Var = psVar.h;
                                if (jp4Var != null) {
                                    if (jp4Var != null) {
                                        jp4Var.t(psVar.i);
                                    }
                                    psVar.h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.C) != null) {
                                    actionBarOverlayLayout.l(null, this.D);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            jsVar = this.D;
                            if (jsVar == null) {
                                jsVar = new js(this, (byte) 2);
                                this.D = jsVar;
                            }
                            actionBarOverlayLayout2.l(jp4Var2, jsVar);
                        }
                        psVar.h.y();
                        if (callback.onCreatePanelMenu(i, psVar.h)) {
                            jp4Var = psVar.h;
                            if (jp4Var != null) {
                                if (jp4Var != null) {
                                    jp4Var.t(psVar.i);
                                }
                                psVar.h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.l(null, this.D);
                            }
                        } else {
                            psVar.f1769o = false;
                        }
                    }
                }
                psVar.h.y();
                Bundle bundle = psVar.p;
                if (bundle != null) {
                    psVar.h.u(bundle);
                    psVar.p = null;
                }
                if (!callback.onPreparePanel(0, psVar.g, psVar.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.C) != null) {
                        actionBarOverlayLayout3.l(null, this.D);
                    }
                    psVar.h.x();
                    return false;
                }
                psVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                psVar.h.x();
            }
            psVar.k = true;
            psVar.l = false;
            this.W = psVar;
            return true;
        }
        return false;
    }

    public final void H() {
        if (this.K) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        iq iqVar;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.p0 != null && (z(0).m || this.F != null)) {
                z = true;
            }
            if (z && this.q0 == null) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.p0;
                iq iqVar2 = new iq(this, (byte) 1);
                y3.k(onBackInvokedDispatcher).registerOnBackInvokedCallback(1000000, iqVar2);
                this.q0 = iqVar2;
                return;
            }
            if (z || (iqVar = this.q0) == null) {
                return;
            }
            y3.k(this.p0).unregisterOnBackInvokedCallback(y3.i(iqVar));
            this.q0 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // o.hp4
    public final boolean a(jp4 jp4Var, MenuItem menuItem) {
        ps psVar;
        Window.Callback callback = this.x.getCallback();
        if (callback != null && !this.a0) {
            jp4 jp4VarM = jp4Var.m();
            ps[] psVarArr = this.V;
            int length = psVarArr != null ? psVarArr.length : 0;
            for (int i = 0; i < length; i++) {
                psVar = psVarArr[i];
                if (psVar != null && psVar.h == jp4VarM) {
                    if (psVar != null) {
                        return callback.onMenuItemSelected(psVar.a, menuItem);
                    }
                }
            }
            psVar = null;
            if (psVar != null) {
                return callback.onMenuItemSelected(psVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // o.hs
    public final void b() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.w);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof qs) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // o.hs
    public final void c() {
        if (this.z != null) {
            A();
            if (this.z.U()) {
                return;
            }
            B(0);
        }
    }

    @Override // o.hs
    public final void e() {
        String strX;
        this.Y = true;
        n(false, true);
        x();
        Object obj = this.v;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strX = vt1.x(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strX = null;
            }
            if (strX != null) {
                ck3 ck3Var = this.z;
                if (ck3Var == null) {
                    this.l0 = true;
                } else {
                    ck3Var.m0(true);
                }
            }
            synchronized (hs.t) {
                hs.g(this);
                hs.s.add(new WeakReference(this));
            }
        }
        this.b0 = new Configuration(this.w.getResources().getConfiguration());
        this.Z = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // o.hs
    public final void f() {
        if (this.v instanceof Activity) {
            synchronized (hs.t) {
                hs.g(this);
            }
        }
        if (this.i0) {
            this.x.getDecorView().removeCallbacks(this.k0);
        }
        this.a0 = true;
        if (this.c0 != -100) {
            Object obj = this.v;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                r0.put(this.v.getClass().getName(), Integer.valueOf(this.c0));
            } else {
                r0.remove(this.v.getClass().getName());
            }
        } else {
            r0.remove(this.v.getClass().getName());
        }
        ck3 ck3Var = this.z;
        if (ck3Var != null) {
            ck3Var.c0();
        }
        ms msVar = this.g0;
        if (msVar != null) {
            msVar.e();
        }
        ms msVar2 = this.h0;
        if (msVar2 != null) {
            msVar2.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // o.hp4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(o.jp4 r6) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.qs.h(o.jp4):void");
    }

    @Override // o.hs
    public final boolean i(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.T && i == 108) {
            return false;
        }
        if (this.P && i == 1) {
            this.P = false;
        }
        if (i == 1) {
            H();
            this.T = true;
            return true;
        }
        if (i == 2) {
            H();
            this.N = true;
            return true;
        }
        if (i == 5) {
            H();
            this.O = true;
            return true;
        }
        if (i == 10) {
            H();
            this.R = true;
            return true;
        }
        if (i == 108) {
            H();
            this.P = true;
            return true;
        }
        if (i != 109) {
            return this.x.requestFeature(i);
        }
        H();
        this.Q = true;
        return true;
    }

    @Override // o.hs
    public final void j(int i) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.L.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.w).inflate(i, viewGroup);
        this.y.a(this.x.getCallback());
    }

    @Override // o.hs
    public final void k(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.L.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.y.a(this.x.getCallback());
    }

    @Override // o.hs
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.L.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.y.a(this.x.getCallback());
    }

    @Override // o.hs
    public final void m(CharSequence charSequence) {
        this.B = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.C;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        ck3 ck3Var = this.z;
        if (ck3Var != null) {
            ck3Var.s0(charSequence);
            return;
        }
        TextView textView = this.M;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.a0) {
            return false;
        }
        int i2 = this.c0;
        if (i2 == -100) {
            i2 = hs.n;
        }
        Context context = this.w;
        int iC = C(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        ld4 ld4VarP = i3 < 33 ? p(context) : null;
        if (!z2 && ld4VarP != null) {
            ld4VarP = ld4.a(context.getResources().getConfiguration().getLocales().toLanguageTags());
        }
        Configuration configurationT = t(context, iC, ld4VarP, null, false);
        boolean z4 = this.f0;
        boolean z5 = true;
        Object obj = this.v;
        if (z4 || !(obj instanceof Activity)) {
            this.f0 = true;
            i = this.e0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.e0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.e0 = 0;
                }
                this.f0 = true;
                i = this.e0;
            }
        }
        Configuration configuration = this.b0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationT.uiMode & 48;
        ld4 ld4VarA = ld4.a(configuration.getLocales().toLanguageTags());
        ld4 ld4VarA2 = ld4VarP == null ? null : ld4.a(configurationT.getLocales().toLanguageTags());
        int i6 = i4 != i5 ? 512 : 0;
        if (ld4VarA2 != null && !ld4VarA.equals(ld4VarA2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.Y && ((t0 || this.Z) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationT.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new io.sentry.b5((Object) activity, (byte) 21));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (ld4VarA2 != null) {
                configuration2.setLocales(LocaleList.forLanguageTags(ld4VarA2.a.a.toLanguageTags()));
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = this.d0;
            if (i8 != 0) {
                context.setTheme(i8);
                context.getTheme().applyStyle(this.d0, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof LifecycleOwner) {
                    if (((LifecycleOwner) activity2).getR().i.compareTo(m84.f1446o) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                        this.x.getDecorView().dispatchConfigurationChanged(configuration2);
                    }
                } else if (this.Z && !this.a0) {
                    activity2.onConfigurationChanged(configuration2);
                    this.x.getDecorView().dispatchConfigurationChanged(configuration2);
                }
            }
        }
        if (ld4VarA2 != null) {
            LocaleList.setDefault(LocaleList.forLanguageTags(ld4.a(context.getResources().getConfiguration().getLocales().toLanguageTags()).a.a.toLanguageTags()));
        }
        if (i2 == 0) {
            y(context).x();
        } else {
            ms msVar = this.g0;
            if (msVar != null) {
                msVar.e();
            }
        }
        ms msVar2 = this.h0;
        if (i2 == 3) {
            if (msVar2 == null) {
                msVar2 = new ms(this, context);
                this.h0 = msVar2;
            }
            msVar2.x();
        } else if (msVar2 != null) {
            msVar2.e();
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    public final void o(Window window) {
        Drawable drawableE;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        iq iqVar;
        int resourceId;
        if (this.x != null) {
            hk0.l("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof ls) {
            hk0.l("AppCompat has already installed itself into the Window");
            return;
        }
        ls lsVar = new ls(this, callback);
        this.y = lsVar;
        window.setCallback(lsVar);
        Context context = this.w;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, s0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableE = null;
        } else {
            us usVarA = us.a();
            synchronized (usVarA) {
                drawableE = usVarA.a.e(context, resourceId, true);
            }
        }
        if (drawableE != null) {
            window.setBackgroundDrawable(drawableE);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.x = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.p0) != null) {
            return;
        }
        Object obj = this.v;
        if (onBackInvokedDispatcher != null && (iqVar = this.q0) != null) {
            y3.k(onBackInvokedDispatcher).unregisterOnBackInvokedCallback(y3.i(iqVar));
            this.q0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.p0 = activity.getOnBackInvokedDispatcher();
            } else {
                this.p0 = null;
            }
        } else {
            this.p0 = null;
        }
        I();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View btVar;
        eu euVar = this.o0;
        View view2 = null;
        if (euVar == null) {
            int[] iArr = zz5.j;
            Context context2 = this.w;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                euVar = new eu();
                this.o0 = euVar;
            } else {
                try {
                    euVar = (eu) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.o0 = euVar;
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    euVar = new eu();
                    this.o0 = euVar;
                }
            }
        }
        euVar.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, zz5.z, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context gc1Var = (resourceId == 0 || ((context instanceof gc1) && ((gc1) context).a == resourceId)) ? context : new gc1(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                btVar = new bt(gc1Var, attributeSet);
                break;
            case 1:
                btVar = new ds(gc1Var, attributeSet);
                break;
            case 2:
                btVar = new ys(gc1Var, attributeSet);
                break;
            case 3:
                btVar = euVar.e(gc1Var, attributeSet);
                break;
            case 4:
                btVar = new AppCompatImageButton(gc1Var, attributeSet);
                break;
            case 5:
                btVar = new ct(gc1Var, attributeSet);
                break;
            case 6:
                btVar = new ot(gc1Var, attributeSet);
                break;
            case 7:
                btVar = euVar.d(gc1Var, attributeSet);
                break;
            case 8:
                btVar = new cu(gc1Var, attributeSet);
                break;
            case ep1.b /* 9 */:
                btVar = new AppCompatImageView(gc1Var, attributeSet);
                break;
            case ep1.c /* 10 */:
                btVar = euVar.a(gc1Var, attributeSet);
                break;
            case 11:
                btVar = euVar.c(gc1Var, attributeSet);
                break;
            case ep1.d /* 12 */:
                btVar = new ws(gc1Var, attributeSet, 0);
                break;
            case 13:
                btVar = euVar.b(gc1Var, attributeSet);
                break;
            default:
                btVar = null;
                break;
        }
        if (btVar == null && context != gc1Var) {
            Object[] objArr = euVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = gc1Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i = 0;
                    while (true) {
                        String[] strArr = eu.g;
                        if (i < 3) {
                            View viewF = euVar.f(gc1Var, str, strArr[i]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = euVar.f(gc1Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            btVar = view2;
        }
        if (btVar != null) {
            Context context3 = btVar.getContext();
            if ((context3 instanceof ContextWrapper) && btVar.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, eu.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    btVar.setOnClickListener(new du(btVar, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = gc1Var.obtainStyledAttributes(attributeSet, eu.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = be8.a;
                    new od8(com.teamviewer.teamviewer.market.mobile.R.id.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 3).a(btVar, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = gc1Var.obtainStyledAttributes(attributeSet, eu.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    be8.n(btVar, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = gc1Var.obtainStyledAttributes(attributeSet, eu.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = be8.a;
                    new od8(com.teamviewer.teamviewer.market.mobile.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, (byte) 0).a(btVar, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return btVar;
    }

    public final void q(int i, ps psVar, jp4 jp4Var) {
        if (jp4Var == null) {
            if (psVar == null && i >= 0) {
                ps[] psVarArr = this.V;
                if (i < psVarArr.length) {
                    psVar = psVarArr[i];
                }
            }
            if (psVar != null) {
                jp4Var = psVar.h;
            }
        }
        if ((psVar == null || psVar.m) && !this.a0) {
            ls lsVar = this.y;
            Window.Callback callback = this.x.getCallback();
            lsVar.getClass();
            try {
                lsVar.q = true;
                callback.onPanelClosed(i, jp4Var);
            } finally {
                lsVar.q = false;
            }
        }
    }

    public final void r(jp4 jp4Var) {
        l7 l7Var;
        if (this.U) {
            return;
        }
        this.U = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.C;
        actionBarOverlayLayout.j();
        ActionMenuView actionMenuView = ((a08) actionBarOverlayLayout.q).a.m;
        if (actionMenuView != null && (l7Var = actionMenuView.F) != null) {
            l7Var.g();
            h7 h7Var = l7Var.G;
            if (h7Var != null && h7Var.b()) {
                h7Var.i.dismiss();
            }
        }
        Window.Callback callback = this.x.getCallback();
        if (callback != null && !this.a0) {
            callback.onPanelClosed(108, jp4Var);
        }
        this.U = false;
    }

    public final void s(ps psVar, boolean z) {
        os osVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && psVar.a == 0 && (actionBarOverlayLayout = this.C) != null) {
            actionBarOverlayLayout.j();
            if (((a08) actionBarOverlayLayout.q).a.o()) {
                r(psVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.w.getSystemService("window");
        if (windowManager != null && psVar.m && (osVar = psVar.e) != null) {
            windowManager.removeView(osVar);
            if (z) {
                q(psVar.a, psVar, null);
            }
        }
        psVar.k = false;
        psVar.l = false;
        psVar.m = false;
        psVar.f = null;
        psVar.n = true;
        if (this.W == psVar) {
            this.W = null;
        }
        if (psVar.a == 0) {
            I();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x0125  */
    /* JADX WARN: Code duplicated, block: B:91:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134 A[RETURN] */
    public final boolean u(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        ps psVarZ;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean zU;
        boolean zG;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        l7 l7Var;
        ps psVarZ2;
        Object obj = this.v;
        if ((!(obj instanceof ex3) && !(obj instanceof ss)) || (decorView = this.x.getDecorView()) == null || !be8.d(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                ls lsVar = this.y;
                Window.Callback callback = this.x.getCallback();
                lsVar.getClass();
                try {
                    lsVar.p = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    lsVar.p = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.X = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    psVarZ2 = z(0);
                                    if (!psVarZ2.m) {
                                        G(psVarZ2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.F == null) {
                                    psVarZ = z(0);
                                    actionBarOverlayLayout = this.C;
                                    context = this.w;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.j();
                                        toolbar = ((a08) actionBarOverlayLayout.q).a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.m) == null || !actionMenuView.E || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z = psVarZ.m;
                                            if (!z || psVarZ.l) {
                                                s(psVarZ, true);
                                                zU = z;
                                            } else {
                                                if (psVarZ.k) {
                                                    if (psVarZ.f1769o) {
                                                        psVarZ.k = false;
                                                        zG = G(psVarZ, keyEvent);
                                                    } else {
                                                        zG = true;
                                                    }
                                                    if (zG) {
                                                        E(psVarZ, keyEvent);
                                                        zU = true;
                                                    }
                                                }
                                                zU = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.C;
                                            actionBarOverlayLayout2.j();
                                            if (((a08) actionBarOverlayLayout2.q).a.o()) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = this.C;
                                                actionBarOverlayLayout3.j();
                                                ActionMenuView actionMenuView2 = ((a08) actionBarOverlayLayout3.q).a.m;
                                                if (actionMenuView2 != null && (l7Var = actionMenuView2.F) != null && l7Var.g()) {
                                                    zU = true;
                                                }
                                            } else if (!this.a0 && G(psVarZ, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = this.C;
                                                actionBarOverlayLayout4.j();
                                                zU = ((a08) actionBarOverlayLayout4.q).a.u();
                                            }
                                            zU = false;
                                        }
                                    } else {
                                        z = psVarZ.m;
                                        if (z) {
                                        }
                                        s(psVarZ, true);
                                        zU = z;
                                    }
                                    if (zU) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        io.sentry.android.core.v0.j("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (D()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    lsVar.p = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.X = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            psVarZ2 = z(0);
                            if (!psVarZ2.m) {
                                G(psVarZ2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.F == null) {
                            psVarZ = z(0);
                            actionBarOverlayLayout = this.C;
                            context = this.w;
                            if (actionBarOverlayLayout != null) {
                                actionBarOverlayLayout.j();
                                toolbar = ((a08) actionBarOverlayLayout.q).a;
                                if (toolbar.getVisibility() == 0) {
                                    z = psVarZ.m;
                                    if (z) {
                                    }
                                    s(psVarZ, true);
                                    zU = z;
                                } else {
                                    z = psVarZ.m;
                                    if (z) {
                                    }
                                    s(psVarZ, true);
                                    zU = z;
                                }
                            } else {
                                z = psVarZ.m;
                                if (z) {
                                }
                                s(psVarZ, true);
                                zU = z;
                            }
                            if (zU) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                io.sentry.android.core.v0.j("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (D()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void v(int i) {
        ps psVarZ = z(i);
        if (psVarZ.h != null) {
            Bundle bundle = new Bundle();
            psVarZ.h.v(bundle);
            if (bundle.size() > 0) {
                psVarZ.p = bundle;
            }
            psVarZ.h.y();
            psVarZ.h.clear();
        }
        psVarZ.f1769o = true;
        psVarZ.n = true;
        if ((i == 108 || i == 0) && this.C != null) {
            ps psVarZ2 = z(0);
            psVarZ2.k = false;
            G(psVarZ2, null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        if (this.K) {
            return;
        }
        Context context = this.w;
        int[] iArr = zz5.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            hk0.l("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        byte b = 0;
        byte b2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            i(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            i(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            i(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            i(10);
        }
        this.S = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        x();
        this.x.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.T) {
            viewGroup = this.R ? (ViewGroup) layoutInflaterFrom.inflate(com.teamviewer.teamviewer.market.mobile.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.teamviewer.teamviewer.market.mobile.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.S) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.teamviewer.teamviewer.market.mobile.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.Q = false;
            this.P = false;
        } else if (this.P) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.teamviewer.teamviewer.market.mobile.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new gc1(context, typedValue.resourceId) : context).inflate(com.teamviewer.teamviewer.market.mobile.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.teamviewer.teamviewer.market.mobile.R.id.decor_content_parent);
            this.C = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.x.getCallback());
            if (this.Q) {
                this.C.i(109);
            }
            if (this.N) {
                this.C.i(2);
            }
            if (this.O) {
                this.C.i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.P);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.Q);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.S);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.R);
            sb.append(", windowNoTitle: ");
            hk0.g(ua5.n(" }", sb, this.T));
            return;
        }
        js jsVar = new js(this, b);
        WeakHashMap weakHashMap = be8.a;
        sd8.c(viewGroup, jsVar);
        if (this.C == null) {
            this.M = (TextView) viewGroup.findViewById(com.teamviewer.teamviewer.market.mobile.R.id.title);
        }
        boolean z = pf8.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.teamviewer.teamviewer.market.mobile.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.x.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.x.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new js(this, b2));
        this.L = viewGroup;
        Object obj = this.v;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.B;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.C;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                ck3 ck3Var = this.z;
                if (ck3Var != null) {
                    ck3Var.s0(title);
                } else {
                    TextView textView = this.M;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.L.findViewById(R.id.content);
        View decorView = this.x.getDecorView();
        contentFrameLayout2.s.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.K = true;
        ps psVarZ = z(0);
        if (this.a0 || psVarZ.h != null) {
            return;
        }
        B(108);
    }

    public final void x() {
        if (this.x == null) {
            Object obj = this.v;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.x != null) {
            return;
        }
        hk0.l("We have not been given a Window");
    }

    public final io.sentry.l6 y(Context context) {
        ms msVar = this.g0;
        if (msVar == null) {
            ep3 ep3Var = ep3.q;
            if (ep3Var == null) {
                Context applicationContext = context.getApplicationContext();
                ep3Var = new ep3(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                ep3.q = ep3Var;
            }
            msVar = new ms(this, ep3Var);
            this.g0 = msVar;
        }
        return msVar;
    }

    public final ps z(int i) {
        ps[] psVarArr = this.V;
        if (psVarArr == null || psVarArr.length <= i) {
            ps[] psVarArr2 = new ps[i + 1];
            if (psVarArr != null) {
                System.arraycopy(psVarArr, 0, psVarArr2, 0, psVarArr.length);
            }
            this.V = psVarArr2;
            psVarArr = psVarArr2;
        }
        ps psVar = psVarArr[i];
        if (psVar != null) {
            return psVar;
        }
        ps psVar2 = new ps();
        psVar2.a = i;
        psVar2.n = false;
        psVarArr[i] = psVar2;
        return psVar2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
