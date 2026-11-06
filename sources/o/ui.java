package o;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class ui implements k03 {
    public static boolean g = true;
    public final AndroidComposeView a;
    public final Object b = new Object();
    public ne8 c;
    public boolean d;
    public cj3 e;
    public final ti f;

    public ui(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
        ti tiVar = new ti(this, (byte) 0);
        this.f = tiVar;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(tiVar);
                this.d = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new a0(this, (byte) 1));
    }

    @Override // o.k03
    public final void a(l03 l03Var) {
        synchronized (this.b) {
            if (!l03Var.s) {
                l03Var.s = true;
                l03Var.b();
            }
        }
    }

    @Override // o.k03
    public final cj3 b() {
        cj3 cj3Var = this.e;
        if (cj3Var != null) {
            return cj3Var;
        }
        cj3 cj3Var2 = new cj3((byte) 12, false);
        this.e = cj3Var2;
        return cj3Var2;
    }

    @Override // o.k03
    public final l03 c() {
        n03 u03Var;
        n03 s03Var;
        l03 l03Var;
        synchronized (this.b) {
            try {
                AndroidComposeView androidComposeView = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    androidComposeView.getUniqueDrawingId();
                }
                if (i >= 29) {
                    s03Var = new s03();
                } else {
                    if (g) {
                        try {
                            u03Var = new q03(this.a, new ol0(), new nl0());
                        } catch (Throwable unused) {
                            g = false;
                            u03Var = new u03(e(this.a));
                        }
                    } else {
                        u03Var = new u03(e(this.a));
                    }
                    s03Var = u03Var;
                }
                l03Var = new l03(s03Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return l03Var;
    }

    public final void d() {
        cj3 cj3Var = this.e;
        if (cj3Var != null) {
            synchronized (cj3Var) {
                try {
                    jx4 jx4Var = (jx4) cj3Var.n;
                    if (jx4Var != null) {
                        jx4Var.a();
                    }
                    cj3Var.f531o = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.e = null;
    }

    public final r52 e(AndroidComposeView androidComposeView) {
        ne8 ne8Var = this.c;
        if (ne8Var != null) {
            return ne8Var;
        }
        ne8 ne8Var2 = new ne8(androidComposeView.getContext());
        ne8Var2.setClipChildren(false);
        ne8Var2.setClipToPadding(false);
        ne8Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        androidComposeView.addView(ne8Var2, -1);
        this.c = ne8Var2;
        return ne8Var2;
    }
}
