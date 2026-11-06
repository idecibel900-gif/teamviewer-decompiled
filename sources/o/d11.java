package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.compress.NativeCompress;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class d11 implements ra7, ap, kp {
    public static final ju s = new ju(7);
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f578o;
    public Object p;
    public Object q;
    public Object r;

    public d11(byte b) {
        switch (b) {
            case 5:
                this.m = new AtomicBoolean(false);
                this.n = new CountDownLatch(1);
                this.r = "PublicSuffixDatabase.list";
                break;
            default:
                this.m = new int[]{2131230823, 2131230821, 2131230747};
                this.n = new int[]{2131230771, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f578o = new int[]{2131230820, 2131230822, 2131230764, R.drawable.abc_text_cursor_material, 2131230817, 2131230818, 2131230819};
                this.p = new int[]{2131230796, R.drawable.abc_cab_background_internal_bg, 2131230795};
                this.q = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.r = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    public static LayerDrawable A(bc6 bc6Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableD = bc6Var.d(context, R.drawable.abc_star_black_48dp);
        Drawable drawableD2 = bc6Var.d(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableD;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableD2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static d11 C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.listitem_filetransfer, viewGroup, false);
        int i = R.id.filetransfer_checkbox;
        CheckBox checkBox = (CheckBox) r47.s(viewInflate, R.id.filetransfer_checkbox);
        if (checkBox != null) {
            i = R.id.filetransfer_checkbox_layout;
            LinearLayout linearLayout = (LinearLayout) r47.s(viewInflate, R.id.filetransfer_checkbox_layout);
            if (linearLayout != null) {
                i = R.id.filetransfer_image;
                ImageView imageView = (ImageView) r47.s(viewInflate, R.id.filetransfer_image);
                if (imageView != null) {
                    i = R.id.filetransfer_layout;
                    if (((LinearLayout) r47.s(viewInflate, R.id.filetransfer_layout)) != null) {
                        i = R.id.filetransfer_name;
                        TextView textView = (TextView) r47.s(viewInflate, R.id.filetransfer_name);
                        if (textView != null) {
                            i = R.id.filetransfer_row;
                            LinearLayout linearLayout2 = (LinearLayout) r47.s(viewInflate, R.id.filetransfer_row);
                            if (linearLayout2 != null) {
                                return new d11((LinearLayout) viewInflate, checkBox, linearLayout, imageView, textView, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static void R(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = us.b;
        }
        drawableMutate.setColorFilter(us.c(i, mode));
    }

    public static boolean j(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList t(Context context, int i) {
        int iC = wt7.c(context, R.attr.colorControlHighlight);
        int iB = wt7.b(context, R.attr.colorButtonNormal);
        int[] iArr = wt7.b;
        int[] iArr2 = wt7.d;
        int iB2 = hw0.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, wt7.c, wt7.f}, new int[]{iB, iB2, hw0.b(iC, i), i});
    }

    public static /* synthetic */ List y(d11 d11Var, sx3 sx3Var, bp4 bp4Var, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return d11Var.x(sx3Var, bp4Var, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    public static bp4 z(t1 t1Var, ty4 ty4Var, d22 d22Var, int i, boolean z) {
        ty4Var.getClass();
        if (i == 0) {
            throw null;
        }
        if (t1Var instanceof vu5) {
            dg2 dg2Var = kt3.a;
            os3 os3VarA = kt3.a((vu5) t1Var, ty4Var, d22Var);
            if (os3VarA != null) {
                return lv1.J(os3VarA);
            }
        } else if (t1Var instanceof iv5) {
            dg2 dg2Var2 = kt3.a;
            os3 os3VarC = kt3.c((iv5) t1Var, ty4Var, d22Var);
            if (os3VarC != null) {
                return lv1.J(os3VarC);
            }
        } else if (t1Var instanceof qv5) {
            my2 my2Var = jt3.d;
            my2Var.getClass();
            dt3 dt3Var = (dt3) it1.C((ky2) t1Var, my2Var);
            if (dt3Var != null) {
                int iB = ua5.B(i);
                if (iB == 1) {
                    return im3.J((qv5) t1Var, ty4Var, d22Var, true, true, z);
                }
                if (iB == 2) {
                    if ((dt3Var.n & 4) != 4) {
                        return null;
                    }
                    bt3 bt3Var = dt3Var.q;
                    bt3Var.getClass();
                    return new bp4(ty4Var.getString(bt3Var.f453o).concat(ty4Var.getString(bt3Var.p)));
                }
                if (iB != 3 || (dt3Var.n & 8) != 8) {
                    return null;
                }
                bt3 bt3Var2 = dt3Var.r;
                bt3Var2.getClass();
                return new bp4(ty4Var.getString(bt3Var2.f453o).concat(ty4Var.getString(bt3Var2.p)));
            }
        }
        return null;
    }

    public ColorStateList B(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return hm3.m(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230813) {
            return hm3.m(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return t(context, wt7.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return t(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return t(context, wt7.c(context, R.attr.colorAccent));
            }
            if (i == 2131230808 || i == R.drawable.abc_spinner_textfield_background_material) {
                return hm3.m(context, R.color.abc_tint_spinner);
            }
            if (j((int[]) this.n, i)) {
                return wt7.d(context, R.attr.colorControlNormal);
            }
            if (j((int[]) this.q, i)) {
                return hm3.m(context, R.color.abc_tint_default);
            }
            if (j((int[]) this.r, i)) {
                return hm3.m(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return hm3.m(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = wt7.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = wt7.b;
            iArr2[0] = wt7.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = wt7.e;
            iArr2[1] = wt7.c(context, R.attr.colorControlActivated);
            iArr[2] = wt7.f;
            iArr2[2] = wt7.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = wt7.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = wt7.e;
            iArr2[1] = wt7.c(context, R.attr.colorControlActivated);
            iArr[2] = wt7.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void D() {
        ((EventHub) this.n).f((mu) this.q);
        ye4.a("FirebaseInitManager", "KeepAlive connected, set callback of FirebaseConfigurationAdapter.");
        FirebaseConfigurationAdapter firebaseConfigurationAdapterCreate = FirebaseConfigurationAdapter.Create(18);
        if (firebaseConfigurationAdapterCreate != null) {
            firebaseConfigurationAdapterCreate.RegisterForFirebase();
            firebaseConfigurationAdapterCreate.AddFirebaseConfigReadyCallback((vl2) this.r);
            xs1.a = firebaseConfigurationAdapterCreate;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        if (r0 == r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        if (r0 == r7) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(o.l33 r37, o.jc1 r38) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d11.E(o.l33, o.jc1):java.lang.Object");
    }

    public boolean F(js0 js0Var) {
        r86 r86VarS;
        if (js0Var.e() != null && im3.n(js0Var.f().b(), "Container") && (r86VarS = vs1.s((f71) this.m, js0Var, (ps3) this.r)) != null) {
            LinkedHashSet linkedHashSet = z77.a;
            j1 j1VarV = hm3.v(r86VarS.a.getDeclaredAnnotations());
            boolean z = false;
            while (j1VarV.hasNext()) {
                Annotation annotation = (Annotation) j1VarV.next();
                annotation.getClass();
                if (p76.a(et1.z(et1.x(annotation))).equals(sr3.b)) {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public mj3 G() throws IOException {
        ql5 ql5Var = ql5.a;
        Object obj = ql5.a;
        wb1 wb1Var = obj != null ? (wb1) obj : null;
        Context contextB = wb1Var != null ? wb1Var.b() : null;
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open((String) this.r);
            inputStreamOpen.getClass();
            return et1.N(inputStreamOpen);
        }
        if (Build.FINGERPRINT == null) {
            gk0.l("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        gk0.l("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    public io.sentry.android.core.d H(js0 js0Var, s67 s67Var, List list) {
        ns4 ns4VarT = vs1.t((qs4) this.f578o, js0Var, (j93) this.p);
        io.sentry.android.core.d dVar = new io.sentry.android.core.d();
        dVar.f100o = this;
        dVar.p = ns4VarT;
        dVar.q = js0Var;
        dVar.r = list;
        dVar.s = s67Var;
        dVar.m = this;
        dVar.n = new HashMap();
        return dVar;
    }

    public io.sentry.android.core.d I(js0 js0Var, o76 o76Var, List list) {
        if (z77.a.contains(js0Var)) {
            return null;
        }
        return H(js0Var, o76Var, list);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    public Object J(sx3 sx3Var, qv5 qv5Var, int i, oz3 oz3Var, hw2 hw2Var) {
        Object objInvoke;
        r86 r86VarR = hm3.r(sx3Var, true, true, im2.B.i(qv5Var.p), kt3.d(qv5Var), (f71) this.m, (ps3) this.r);
        if (r86VarR == null) {
            if (sx3Var instanceof pw5) {
                s67 s67Var = (s67) ((pw5) sx3Var).d;
                hz3 hz3Var = s67Var instanceof hz3 ? (hz3) s67Var : null;
                if (hz3Var != null) {
                    r86VarR = hz3Var.m;
                } else {
                    r86VarR = null;
                }
            } else {
                r86VarR = null;
            }
        }
        if (r86VarR != null) {
            ps3 ps3Var = r86VarR.b.b;
            ps3 ps3Var2 = tp1.e;
            ps3Var2.getClass();
            bp4 bp4VarZ = z(qv5Var, (ty4) sx3Var.b, (d22) sx3Var.c, i, ps3Var.a(ps3Var2.b, ps3Var2.c, ps3Var2.d));
            if (bp4VarZ != null && (objInvoke = hw2Var.invoke(((sd4) this.n).invoke(r86VarR), bp4VarZ)) != null) {
                if (h98.a(oz3Var)) {
                    objInvoke = (u51) objInvoke;
                    if (objInvoke instanceof bi0) {
                        return new r68(((Number) ((bi0) objInvoke).a).byteValue());
                    }
                    if (objInvoke instanceof gz6) {
                        return new r68(((Number) ((gz6) objInvoke).a).shortValue());
                    }
                    if (objInvoke instanceof el3) {
                        return new r68(((Number) ((el3) objInvoke).a).intValue());
                    }
                    if (objInvoke instanceof ng4) {
                        return new r68(((Number) ((ng4) objInvoke).a).longValue());
                    }
                }
                return objInvoke;
            }
        }
        return null;
    }

    public List K(sx3 sx3Var, qv5 qv5Var, v vVar) {
        d22 d22Var = (d22) sx3Var.c;
        Boolean boolI = im2.B.i(qv5Var.p);
        boolean zD = kt3.d(qv5Var);
        ty4 ty4Var = (ty4) sx3Var.b;
        if (vVar == v.m) {
            bp4 bp4VarJ = im3.J(qv5Var, ty4Var, d22Var, (40 & 8) == 0, (40 & 16) == 0, true);
            if (bp4VarJ != null) {
                return y(this, sx3Var, bp4VarJ, boolI, zD, 8);
            }
        } else {
            bp4 bp4VarJ2 = im3.J(qv5Var, ty4Var, d22Var, (40 & 8) == 0, (40 & 16) == 0, true);
            if (bp4VarJ2 != null) {
                if (ub7.Q(bp4VarJ2.a, "$delegate", false) == (vVar == v.f2260o)) {
                    return x(sx3Var, bp4VarJ2, true, true, boolI, zD);
                }
            }
        }
        return ea2.m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object L(l33 l33Var, jc1 jc1Var) {
        c13 c13Var;
        l33 l33Var2;
        l97 l97Var = (l97) this.f578o;
        if (jc1Var instanceof c13) {
            c13Var = (c13) jc1Var;
            int i = c13Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13Var.p = i - Integer.MIN_VALUE;
            } else {
                c13Var = new c13(this, jc1Var);
            }
        } else {
            c13Var = new c13(this, jc1Var);
        }
        Object objE = c13Var.n;
        int i2 = c13Var.p;
        if (i2 == 0) {
            ct1.a0(objE);
            l97Var.l(null, new f13(l33Var));
            c13Var.m = l33Var;
            c13Var.p = 1;
            objE = E(l33Var, c13Var);
            Object obj = ne1.m;
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l33Var = c13Var.m;
            ct1.a0(objE);
        }
        boolean zBooleanValue = ((Boolean) objE).booleanValue();
        Object value = l97Var.getValue();
        f13 f13Var = value instanceof f13 ? (f13) value : null;
        if (im3.n((f13Var == null || (l33Var2 = f13Var.a) == null) ? null : l33Var2.a, l33Var.a)) {
            l97Var.l(null, new e13(l33Var, zBooleanValue));
        }
        return f88.a;
    }

    public nx3 M() throws GeneralSecurityException, IOException {
        byte[] bArrN;
        byte b = 5;
        try {
            df6 df6Var = (df6) this.p;
            if (df6Var != null) {
                try {
                    oy3 oy3Var = (oy3) nx3.I((g95) this.m, df6Var).n;
                    ey2 ey2Var = (ey2) oy3Var.f(5);
                    ey2Var.d(oy3Var);
                    return new nx3((ly3) ey2Var, b);
                } catch (GeneralSecurityException | qm3 e) {
                    io.sentry.android.core.v0.l("d82", "cannot decrypt keyset: ", e);
                }
            }
            oy3 oy3VarS = oy3.s(((g95) this.m).S(), cg2.a());
            if (oy3VarS.o() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            ey2 ey2Var2 = (ey2) oy3VarS.f(5);
            ey2Var2.d(oy3VarS);
            return new nx3((ly3) ey2Var2, b);
        } catch (FileNotFoundException e2) {
            io.sentry.android.core.v0.l("d82", "keyset not found, will generate a new one", e2);
            if (((nx3) this.q) == null) {
                hk0.u("cannot read or generate keyset");
                return null;
            }
            ly3 ly3VarR = oy3.r();
            nx3 nx3Var = new nx3(ly3VarR, b);
            nx3 nx3Var2 = (nx3) this.q;
            synchronized (nx3Var) {
                qx3 qx3Var = (qx3) nx3Var2.n;
                synchronized (nx3Var) {
                    ny3 ny3VarF = nx3Var.F(qx3Var);
                    ly3VarR.c();
                    ((oy3) ly3VarR.n).m(ny3VarF);
                    int iM = na8.a((oy3) nx3Var.z().n).n().m();
                    synchronized (nx3Var) {
                        for (int i = 0; i < ((oy3) ((ly3) nx3Var.n).n).o(); i++) {
                            try {
                                ny3 ny3VarN = ((oy3) ((ly3) nx3Var.n).n).n(i);
                                if (ny3VarN.n() == iM) {
                                    if (!ny3VarN.p().equals(ox3.ENABLED)) {
                                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iM);
                                    }
                                    ly3 ly3Var = (ly3) nx3Var.n;
                                    ly3Var.c();
                                    ((oy3) ly3Var.n).t(iM);
                                    if (((df6) this.p) != null) {
                                        nx3 nx3VarZ = nx3Var.z();
                                        g95 g95Var = (g95) this.n;
                                        df6 df6Var2 = (df6) this.p;
                                        oy3 oy3Var2 = (oy3) nx3VarZ.n;
                                        byte[] bArrC = oy3Var2.c();
                                        byte[] bArr = new byte[0];
                                        df6Var2.getClass();
                                        try {
                                            bArrN = df6Var2.n(bArrC, bArr);
                                        } catch (GeneralSecurityException | ProviderException e3) {
                                            io.sentry.android.core.v0.l("df6", "encountered a potentially transient KeyStore error, will wait and retry", e3);
                                            try {
                                                Thread.sleep((int) (Math.random() * 100.0d));
                                            } catch (InterruptedException unused) {
                                            }
                                            bArrN = df6Var2.n(bArrC, bArr);
                                        }
                                        try {
                                            if (!oy3.s(df6Var2.l(bArrN, new byte[0]), cg2.a()).equals(oy3Var2)) {
                                                throw new GeneralSecurityException("cannot encrypt keyset");
                                            }
                                            xa2 xa2VarN = ya2.n();
                                            vh0 vh0VarC = yh0.c(bArrN, 0, bArrN.length);
                                            xa2VarN.c();
                                            ((ya2) xa2VarN.n).p(vh0VarC);
                                            sy3 sy3VarA = na8.a(oy3Var2);
                                            xa2VarN.c();
                                            ((ya2) xa2VarN.n).q(sy3VarA);
                                            if (!((SharedPreferences.Editor) g95Var.m).putString("__androidx_security_crypto_encrypted_file_keyset__", xs1.F(((ya2) xa2VarN.a()).c())).commit()) {
                                                gk0.l("Failed to write to SharedPreferences");
                                                return null;
                                            }
                                        } catch (qm3 unused2) {
                                            hk0.u("invalid keyset, corrupted key material");
                                            return null;
                                        }
                                    } else {
                                        if (!((SharedPreferences.Editor) ((g95) this.n).m).putString("__androidx_security_crypto_encrypted_file_keyset__", xs1.F(((oy3) nx3Var.z().n).c())).commit()) {
                                            gk0.l("Failed to write to SharedPreferences");
                                            return null;
                                        }
                                    }
                                    return nx3Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        throw new GeneralSecurityException("key not found: " + iM);
                    }
                }
            }
        }
    }

    public df6 N() throws KeyStoreException {
        int i = d82.Q;
        df6 df6Var = new df6((byte) 14);
        boolean zU = df6Var.u((String) this.f578o);
        if (!zU) {
            try {
                df6.p((String) this.f578o);
            } catch (GeneralSecurityException | ProviderException e) {
                int i2 = d82.Q;
                io.sentry.android.core.v0.l("d82", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        }
        try {
            return df6Var.q((String) this.f578o);
        } catch (GeneralSecurityException | ProviderException e2) {
            if (zU) {
                throw new KeyStoreException(fx3.g("the master key ", (String) this.f578o, " exists but is unusable"), e2);
            }
            int i3 = d82.Q;
            io.sentry.android.core.v0.l("d82", "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    public void O() {
        try {
            w36 w36Var = new w36(G());
            try {
                ai0 ai0VarU = w36Var.u(w36Var.z());
                ai0 ai0VarU2 = w36Var.u(w36Var.z());
                w36Var.close();
                synchronized (this) {
                    ai0VarU.getClass();
                    this.f578o = ai0VarU;
                    ai0VarU2.getClass();
                    this.p = ai0VarU2;
                }
                ((CountDownLatch) this.n).countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kh.n(w36Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            ((CountDownLatch) this.n).countDown();
            throw th3;
        }
    }

    public vc1 P(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.p;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            vc1 vc1VarA = ((uc1) list.get(i)).a(type, annotationArr, annotationArr2, this);
            if (vc1VarA != null) {
                return vc1VarA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((uc1) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public vc1 Q(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.p;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            vc1 vc1VarB = ((uc1) list.get(i)).b(type, annotationArr, this);
            if (vc1VarB != null) {
                return vc1VarB;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((uc1) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public void S(String str) {
        l97 l97Var = (l97) this.f578o;
        Object value = l97Var.getValue();
        h13 h13Var = value instanceof h13 ? (h13) value : null;
        if (h13Var == null) {
            return;
        }
        l97Var.l(null, new h13(h13Var.a, str));
    }

    public void T(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.p;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((uc1) list.get(i)).getClass();
        }
    }

    @Override // o.kp
    public ArrayList a(aw5 aw5Var, ty4 ty4Var) {
        aw5Var.getClass();
        ty4Var.getClass();
        Object objK = aw5Var.k(jt3.f);
        objK.getClass();
        Iterable<qu5> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(mv0.Z(iterable, 10));
        for (qu5 qu5Var : iterable) {
            qu5Var.getClass();
            arrayList.add(((cj3) this.q).y(qu5Var, ty4Var));
        }
        return arrayList;
    }

    @Override // o.kp
    public List b(sx3 sx3Var, qv5 qv5Var) {
        return K(sx3Var, qv5Var, v.n);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    @Override // o.kp
    public List c(sx3 sx3Var, t1 t1Var, int i, int i2, iw5 iw5Var) {
        if (i == 0) {
            throw null;
        }
        int i3 = 0;
        bp4 bp4VarZ = z(t1Var, (ty4) sx3Var.b, (d22) sx3Var.c, i, false);
        if (bp4VarZ == null) {
            return ea2.m;
        }
        if (t1Var instanceof iv5) {
            int i4 = ((iv5) t1Var).f1108o;
            if ((i4 & 32) == 32 || (i4 & 64) == 64) {
                i3 = 1;
            }
        } else if (t1Var instanceof qv5) {
            int i5 = ((qv5) t1Var).f1871o;
            if ((i5 & 32) == 32 || (i5 & 64) == 64) {
                i3 = 1;
            }
        } else {
            if (!(t1Var instanceof vu5)) {
                throw new UnsupportedOperationException("Unsupported message: " + t1Var.getClass());
            }
            pw5 pw5Var = (pw5) sx3Var;
            if (pw5Var.h == su5.ENUM_CLASS) {
                i3 = 2;
            } else if (pw5Var.i) {
                i3 = 1;
            }
        }
        return y(this, sx3Var, new bp4(bp4VarZ.a + '@' + (i2 + i3)), null, false, 60);
    }

    public void d(String str, String str2) {
        HashMap map = (HashMap) this.r;
        if (map != null) {
            map.put(str, str2);
        } else {
            hk0.l("Property \"autoMetadata\" has not been set");
        }
    }

    @Override // o.kp
    public List e(sx3 sx3Var, t1 t1Var, int i) {
        if (i == 0) {
            throw null;
        }
        if (i == 2) {
            return K(sx3Var, (qv5) t1Var, v.m);
        }
        bp4 bp4VarZ = z(t1Var, (ty4) sx3Var.b, (d22) sx3Var.c, i, false);
        return bp4VarZ == null ? ea2.m : y(this, sx3Var, bp4VarZ, null, false, 60);
    }

    @Override // o.kp
    public ArrayList f(fw5 fw5Var, ty4 ty4Var) {
        fw5Var.getClass();
        ty4Var.getClass();
        Object objK = fw5Var.k(jt3.h);
        objK.getClass();
        Iterable<qu5> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(mv0.Z(iterable, 10));
        for (qu5 qu5Var : iterable) {
            qu5Var.getClass();
            arrayList.add(((cj3) this.q).y(qu5Var, ty4Var));
        }
        return arrayList;
    }

    @Override // o.ap
    public Object g(sx3 sx3Var, qv5 qv5Var, oz3 oz3Var) {
        return J(sx3Var, qv5Var, 2, oz3Var, u.f2156o);
    }

    @Override // o.kp
    public ArrayList h(pw5 pw5Var) throws InvocationTargetException {
        pw5Var.getClass();
        s67 s67Var = (s67) pw5Var.d;
        hz3 hz3Var = s67Var instanceof hz3 ? (hz3) s67Var : null;
        r86 r86Var = hz3Var != null ? hz3Var.m : null;
        if (r86Var == null) {
            yq4.u(pw5Var.g.a(), "Class for loading annotations is not found: ");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        j1 j1VarV = hm3.v(r86Var.a.getDeclaredAnnotations());
        while (j1VarV.hasNext()) {
            Annotation annotation = (Annotation) j1VarV.next();
            annotation.getClass();
            Class clsZ = et1.z(et1.x(annotation));
            io.sentry.android.core.d dVarI = I(p76.a(clsZ), new o76(annotation), arrayList);
            if (dVarI != null) {
                vs1.Q(dVarI, annotation, clsZ);
            }
        }
        return arrayList;
    }

    @Override // o.kp
    public List i(sx3 sx3Var, t1 t1Var, int i) {
        if (i == 0) {
            throw null;
        }
        bp4 bp4VarZ = z(t1Var, (ty4) sx3Var.b, (d22) sx3Var.c, i, false);
        return bp4VarZ != null ? y(this, sx3Var, new bp4(bp4VarZ.a.concat("@0")), null, false, 60) : ea2.m;
    }

    public k00 k() {
        String strConcat = ((String) this.m) == null ? " transportName" : "";
        if (((sa2) this.f578o) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.p) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.q) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.r) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new k00((String) this.m, (Integer) this.n, (sa2) this.f578o, ((Long) this.p).longValue(), ((Long) this.q).longValue(), (HashMap) this.r);
        }
        hk0.l("Missing required properties:".concat(strConcat));
        return null;
    }

    public si0 l(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.q;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            si0 si0VarA = ((ri0) list.get(i)).a(type, annotationArr);
            if (si0VarA != null) {
                return si0VarA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((ri0) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // o.kp
    public List m(sx3 sx3Var, dv5 dv5Var) {
        sx3Var.getClass();
        return y(this, sx3Var, new bp4(((ty4) sx3Var.b).getString(dv5Var.p) + '#' + os0.b(((pw5) sx3Var).g.b())), null, false, 60);
    }

    @Override // o.ra7
    public synchronized void n(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() != ((mc) this.r).e()) {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
        if (byteBuffer.get() != ((mc) this.r).e()) {
            throw new GeneralSecurityException("Invalid ciphertext");
        }
        this.q = new byte[7];
        byte[] bArr2 = new byte[((mc) this.r).a];
        byteBuffer.get(bArr2);
        byteBuffer.get((byte[]) this.q);
        mc mcVar = (mc) this.r;
        byte[] bArrX = ct1.x(mcVar.f, mcVar.g, bArr2, bArr, mcVar.a + 32);
        this.m = new SecretKeySpec(bArrX, 0, ((mc) this.r).a, "AES");
        mc mcVar2 = (mc) this.r;
        this.n = new SecretKeySpec(bArrX, mcVar2.a, 32, mcVar2.b);
        this.f578o = (Cipher) ab2.e.a("AES/CTR/NoPadding");
        this.p = (Mac) ab2.f.a(((mc) this.r).b);
    }

    public synchronized void o() {
        ((HandlerThread) this.n).quit();
        try {
            ((HandlerThread) this.n).join();
        } catch (InterruptedException unused) {
            ye4.c("Compress", "Interrupted while waiting for handler to finish");
        }
        ye4.a("Compress", "Closed screen update handler");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        if ((r11 instanceof o.h33) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(o.jc1 r11) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d11.p(o.jc1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
    
        if ((r1 instanceof o.h33) != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(o.jc1 r23) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d11.q(o.jc1):java.lang.Object");
    }

    public Object r(Class cls) {
        if (!cls.isInterface()) {
            hk0.g("API declarations must be interfaces.");
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new cd6(this, cls));
    }

    @Override // o.kp
    public List s(sx3 sx3Var, qv5 qv5Var) {
        return K(sx3Var, qv5Var, v.f2260o);
    }

    @Override // o.ap
    public Object u(sx3 sx3Var, qv5 qv5Var, oz3 oz3Var) {
        return J(sx3Var, qv5Var, 3, oz3Var, u.n);
    }

    @Override // o.ra7
    public synchronized void v(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        int iPosition = byteBuffer.position();
        byte[] bArrI = mc.i((byte[]) this.q, i, z);
        int iRemaining = byteBuffer.remaining();
        int i2 = ((mc) this.r).c;
        if (iRemaining < i2) {
            throw new GeneralSecurityException("Ciphertext too short");
        }
        int i3 = (iRemaining - i2) + iPosition;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(i3);
        ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
        byteBufferDuplicate2.position(i3);
        ((Mac) this.p).init((SecretKeySpec) this.n);
        ((Mac) this.p).update(bArrI);
        ((Mac) this.p).update(byteBufferDuplicate);
        byte[] bArrCopyOf = Arrays.copyOf(((Mac) this.p).doFinal(), ((mc) this.r).c);
        int i4 = ((mc) this.r).c;
        byte[] bArr = new byte[i4];
        byteBufferDuplicate2.get(bArr);
        if (i4 == bArrCopyOf.length) {
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                i5 |= bArr[i6] ^ bArrCopyOf[i6];
            }
            if (i5 == 0) {
                byteBuffer.limit(i3);
                ((Cipher) this.f578o).init(1, (SecretKeySpec) this.m, new IvParameterSpec(bArrI));
                ((Cipher) this.f578o).doFinal(byteBuffer, byteBuffer2);
            }
        }
        throw new GeneralSecurityException("Tag mismatch");
    }

    public void w() {
        ((l97) this.f578o).l(null, g13.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    public List x(sx3 sx3Var, bp4 bp4Var, boolean z, boolean z2, Boolean bool, boolean z3) {
        List list;
        r86 r86VarR = hm3.r(sx3Var, z, z2, bool, z3, (f71) this.m, (ps3) this.r);
        if (r86VarR == null) {
            if (sx3Var instanceof pw5) {
                s67 s67Var = (s67) ((pw5) sx3Var).d;
                hz3 hz3Var = s67Var instanceof hz3 ? (hz3) s67Var : null;
                if (hz3Var != null) {
                    r86VarR = hz3Var.m;
                } else {
                    r86VarR = null;
                }
            } else {
                r86VarR = null;
            }
        }
        return (r86VarR == null || (list = (List) ((vp) ((sd4) this.n).invoke(r86VarR)).a.get(bp4Var)) == null) ? ea2.m : list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d11(Class cls, String str, Function0 function0) {
        vq3 vq3Var = x38.a;
        e96 e96Var = jo4.e;
        jo4 jo4VarT = vt1.t("application/json");
        vq3Var.getClass();
        this(cls, str, function0, new fh2(jo4VarT, new g95(vq3Var)), ea2.m);
    }

    public d11(Class cls, String str, Function0 function0, uc1 uc1Var, List list) {
        this.m = cls;
        this.n = str;
        this.f578o = function0;
        this.p = uc1Var;
        this.q = list;
        this.r = new kh7(new ks7(this, (byte) 4));
    }

    public d11(xl4 xl4Var, nx3 nx3Var) {
        this.m = xl4Var;
        this.n = nx3Var;
        l97 l97VarK = im3.k(g13.a);
        this.f578o = l97VarK;
        this.p = yo1.u(l97VarK);
        yx6 yx6VarL = au8.l(0, 7, null);
        this.q = yx6VarL;
        this.r = new r36(yx6VarL);
    }

    public d11(eu6 eu6Var, ParticipantIdentifier participantIdentifier, long j) {
        this.m = new Rect();
        this.p = eu6Var;
        this.q = participantIdentifier;
        NativeCompress.Init(j);
        HandlerThread handlerThread = new HandlerThread("Compress");
        this.n = handlerThread;
        handlerThread.start();
        this.f578o = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: o.c11
            /* JADX WARN: Code duplicated, block: B:19:0x005e  */
            /* JADX WARN: Code duplicated, block: B:21:0x0070  */
            /* JADX WARN: Code duplicated, block: B:23:0x0075  */
            /* JADX WARN: Code duplicated, block: B:25:0x007d  */
            /* JADX WARN: Code duplicated, block: B:28:0x009d  */
            /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                yt0 yt0Var;
                Rect rect;
                ci7 ci7VarQ;
                ClientViewOpenGL clientViewOpenGL;
                d11 d11Var = this.a;
                xp6 xp6Var = (xp6) d11Var.p;
                ParticipantIdentifier participantIdentifier2 = (ParticipantIdentifier) d11Var.q;
                if (message == null || message.what != 1) {
                    return false;
                }
                Object obj = message.obj;
                obj.getClass();
                ak7 ak7Var = (ak7) obj;
                long j2 = ak7Var.a;
                int iOrdinal = ak7Var.C().ordinal();
                ak7 ak7Var2 = null;
                if (iOrdinal == 2) {
                    yt0Var = (yt0) d11Var.r;
                    rect = (Rect) d11Var.m;
                    ci7VarQ = ak7Var.q(vj7.Number);
                    if (ci7VarQ.a > 0) {
                        NativeCompress.UpdateComplete();
                        if (yt0Var != null) {
                            rect.inset(-4, -4);
                            clientViewOpenGL = yt0Var.f2640o;
                            if (clientViewOpenGL != null) {
                                clientViewOpenGL.requestRender();
                            }
                            rect.setEmpty();
                        }
                        int i = ci7VarQ.b;
                        bk7 bk7Var = bk7.TVCmdUpdateReceived;
                        participantIdentifier2.getClass();
                        ak7Var2 = new ak7(bk7Var);
                        ak7Var2.z(KnownStreams.PrivateStream);
                        ak7Var2.B(participantIdentifier2);
                        ak7Var2.d(wj7.m, i);
                    } else {
                        NativeCompress.ReceivedUpdate(j2);
                        rect.union(new Rect());
                    }
                    if (ak7Var2 != null) {
                        eu6 eu6Var2 = (eu6) xp6Var;
                        eu6Var2.getClass();
                        eu6Var2.f(ak7Var2, false);
                    }
                } else if (iOrdinal == 36) {
                    aj7 aj7Var = aj7.Version;
                    if (ak7Var.q(aj7Var).a > 0) {
                        bk7 bk7Var2 = bk7.TVCmdDataCache;
                        participantIdentifier2.getClass();
                        ak7Var2 = new ak7(bk7Var2);
                        ak7Var2.z(KnownStreams.PrivateStream);
                        ak7Var2.B(participantIdentifier2);
                        ak7Var2.d(aj7Var, 2);
                    }
                    NativeCompress.ReceivedDataCache(j2);
                    if (ak7Var2 != null) {
                        eu6 eu6Var3 = (eu6) xp6Var;
                        eu6Var3.getClass();
                        eu6Var3.f(ak7Var2, false);
                    }
                } else if (iOrdinal == 74) {
                    yt0Var = (yt0) d11Var.r;
                    rect = (Rect) d11Var.m;
                    ci7VarQ = ak7Var.q(vj7.Number);
                    if (ci7VarQ.a > 0) {
                        NativeCompress.UpdateComplete();
                        if (yt0Var != null) {
                            rect.inset(-4, -4);
                            clientViewOpenGL = yt0Var.f2640o;
                            if (clientViewOpenGL != null) {
                                clientViewOpenGL.requestRender();
                            }
                            rect.setEmpty();
                        }
                        int i2 = ci7VarQ.b;
                        bk7 bk7Var3 = bk7.TVCmdUpdateReceived;
                        participantIdentifier2.getClass();
                        ak7Var2 = new ak7(bk7Var3);
                        ak7Var2.z(KnownStreams.PrivateStream);
                        ak7Var2.B(participantIdentifier2);
                        ak7Var2.d(wj7.m, i2);
                    } else {
                        NativeCompress.ReceivedUpdate(j2);
                        rect.union(new Rect());
                    }
                    if (ak7Var2 != null) {
                        eu6 eu6Var4 = (eu6) xp6Var;
                        eu6Var4.getClass();
                        eu6Var4.f(ak7Var2, false);
                    }
                }
                ak7Var.k();
                return true;
            }
        });
    }

    public /* synthetic */ d11(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.m = obj;
        this.n = obj2;
        this.f578o = obj3;
        this.p = obj4;
        this.q = obj5;
        this.r = obj6;
    }
}
