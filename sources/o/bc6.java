package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bc6 {
    public static bc6 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public d11 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final ac6 h = new ac6(6);

    public static synchronized bc6 c() {
        bc6 bc6Var;
        bc6Var = g;
        if (bc6Var == null) {
            bc6Var = new bc6();
            g = bc6Var;
        }
        return bc6Var;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        ac6 ac6Var = h;
        ac6Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) ac6Var.a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static void i(Drawable drawable, y41 y41Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = y41Var.b;
        if (!z && !y41Var.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterF = null;
        ColorStateList colorStateList = z ? (ColorStateList) y41Var.c : null;
        PorterDuff.Mode mode = y41Var.a ? (PorterDuff.Mode) y41Var.d : f;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterF = f(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.a = weakHashMap;
        }
        n77 n77Var = (n77) weakHashMap.get(context);
        if (n77Var == null) {
            n77Var = new n77(0);
            this.a.put(context, n77Var);
        }
        int i2 = n77Var.f1550o;
        if (i2 != 0 && i <= n77Var.m[i2 - 1]) {
            n77Var.c(i, colorStateList);
            return;
        }
        if (i2 >= n77Var.m.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            n77Var.m = Arrays.copyOf(n77Var.m, i6);
            n77Var.n = Arrays.copyOf(n77Var.n, i6);
        }
        n77Var.m[i2] = i;
        n77Var.n[i2] = colorStateList;
        n77Var.f1550o = i2 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    public final Drawable b(Context context, int i) {
        Object obj;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        LayerDrawable layerDrawableA;
        TypedValue typedValue = this.c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.c = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            mg4 mg4Var = (mg4) this.b.get(context);
            obj = null;
            if (mg4Var != null && (weakReference = (WeakReference) mg4Var.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    mg4Var.g(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e == null) {
            layerDrawableA = null;
        } else if (i == R.drawable.abc_cab_background_top_material) {
            layerDrawableA = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, 2131230764)});
        } else if (i == R.drawable.abc_ratingbar_material) {
            layerDrawableA = d11.A(this, context, R.dimen.abc_star_big);
        } else if (i == R.drawable.abc_ratingbar_indicator_material) {
            layerDrawableA = d11.A(this, context, R.dimen.abc_star_medium);
        } else if (i == R.drawable.abc_ratingbar_small_material) {
            layerDrawableA = d11.A(this, context, R.dimen.abc_star_small);
        } else {
            layerDrawableA = null;
        }
        if (layerDrawableA == null) {
            return layerDrawableA;
        }
        layerDrawableA.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableA.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableA;
                }
                mg4 mg4Var2 = (mg4) this.b.get(context);
                if (mg4Var2 == null) {
                    mg4Var2 = new mg4(obj);
                    this.b.put(context, mg4Var2);
                }
                mg4Var2.e(j, new WeakReference(constantState2));
                return layerDrawableA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable drawableB;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, R.drawable.abc_vector_test);
                if (drawableD == null || !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName())) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                drawableB = h(context, i, z, drawableB);
            }
            if (drawableB != null) {
                h62.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        n77 n77Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListB = null;
        colorStateList = (weakHashMap == null || (n77Var = (n77) weakHashMap.get(context)) == null) ? null : (ColorStateList) ck3.u(n77Var, i);
        if (colorStateList == null) {
            d11 d11Var = this.e;
            if (d11Var != null) {
                colorStateListB = d11Var.B(context, i);
            }
            if (colorStateListB != null) {
                a(context, i, colorStateListB);
            }
            colorStateList = colorStateListB;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4 A[RETURN] */
    public final Drawable h(Context context, int i, boolean z, Drawable drawable) {
        int iRound;
        ColorStateList colorStateListG = g(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListG != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListG);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        d11 d11Var = this.e;
        int i2 = R.attr.colorControlNormal;
        if (d11Var != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = wt7.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = us.b;
                d11.R(drawableFindDrawableByLayerId, iC, mode2);
                d11.R(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), wt7.c(context, R.attr.colorControlNormal), mode2);
                d11.R(layerDrawable.findDrawableByLayerId(android.R.id.progress), wt7.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = wt7.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = us.b;
                d11.R(drawableFindDrawableByLayerId2, iB, mode3);
                d11.R(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), wt7.c(context, R.attr.colorControlActivated), mode3);
                d11.R(layerDrawable2.findDrawableByLayerId(android.R.id.progress), wt7.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        if (d11Var != null) {
            PorterDuff.Mode mode4 = us.b;
            boolean z2 = true;
            if (d11.j((int[]) d11Var.m, i)) {
                iRound = -1;
            } else {
                if (d11.j((int[]) d11Var.f578o, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zJ = d11.j((int[]) d11Var.p, i);
                    i2 = android.R.attr.colorBackground;
                    if (zJ) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131230784) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        i2 = 0;
                        z2 = false;
                    }
                }
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                drawableMutate2.setColorFilter(us.c(wt7.c(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                    return drawable;
                }
            } else if (z) {
                return null;
            }
        } else if (z) {
            return null;
        }
        return drawable;
    }
}
