package o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.remotecontrolviewlib.view.session.RcSessionBottomToolbarView;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class b26 extends uz7 {
    public final j93 s;
    public RCClientActivity t;
    public final nw4 u;
    public final p v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b26(j93 j93Var, boolean z, boolean z2, Resources resources) {
        super(false);
        final byte b = 0;
        this.s = j93Var;
        nw4 nw4Var = new nw4();
        this.u = nw4Var;
        p pVar = new p((Object) this, (byte) 15);
        this.v = pVar;
        ThreadLocal threadLocal = ic6.a;
        Drawable drawable = resources.getDrawable(R.drawable.extra_toolbar_collapse, null);
        if (drawable != null) {
            V0(new x16(0, new nw4(drawable), new nw4(Integer.valueOf(R.string.extratoolbar_close_action)), null, null, new Function0(this) { // from class: o.z16
                public final /* synthetic */ b26 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    Boolean boolValueOf;
                    byte b2 = b;
                    f88 f88Var = f88.a;
                    b26 b26Var = this.n;
                    switch (b2) {
                        case 0:
                            RCClientActivity rCClientActivity = b26Var.t;
                            if (rCClientActivity != null) {
                                rCClientActivity.S();
                            }
                            break;
                        default:
                            nw4 nw4Var2 = b26Var.u;
                            RCClientActivity rCClientActivity2 = b26Var.t;
                            if (rCClientActivity2 != null) {
                                lc3 lc3Var = rCClientActivity2.P;
                                if (lc3Var == null || !lc3Var.t()) {
                                    lc3 lc3Var2 = rCClientActivity2.P;
                                    if (lc3Var2 != null) {
                                        lc3Var2.D0();
                                    }
                                } else {
                                    lc3 lc3Var3 = rCClientActivity2.P;
                                    if (lc3Var3 != null) {
                                        lc3Var3.J0();
                                    }
                                }
                                RcSessionBottomToolbarView rcSessionBottomToolbarView = rCClientActivity2.Q;
                                if (rcSessionBottomToolbarView != null) {
                                    rcSessionBottomToolbarView.c();
                                }
                                lc3 lc3Var4 = rCClientActivity2.P;
                                boolValueOf = Boolean.valueOf(lc3Var4 != null ? lc3Var4.t() : false);
                            } else {
                                boolValueOf = null;
                            }
                            nw4Var2.setValue(boolValueOf);
                            break;
                    }
                    return f88Var;
                }
            }, 376));
        }
        Drawable drawable2 = resources.getDrawable(z ? R.drawable.extra_toolbar_mac_shift : R.drawable.extra_toolbar_shift, null);
        final byte b2 = 1;
        if (drawable2 != null) {
            V0(Y0(this, fb3.m, 1, new nw4(drawable2), new nw4(Integer.valueOf(R.string.extratoolbar_shift_key))));
        }
        Drawable drawable3 = resources.getDrawable(z ? R.drawable.extra_toolbar_mac_control : R.drawable.extra_toolbar_ctrl, null);
        if (drawable3 != null) {
            V0(Y0(this, fb3.n, 2, new nw4(drawable3), new nw4(Integer.valueOf(R.string.extratoolbar_ctrl_key))));
        }
        Drawable drawable4 = resources.getDrawable(z ? R.drawable.extra_toolbar_option : R.drawable.extra_toolbar_alt, null);
        if (drawable4 != null) {
            V0(Y0(this, fb3.f784o, 3, new nw4(drawable4), new nw4(Integer.valueOf(z ? R.string.extratoolbar_option_key : R.string.extratoolbar_alt_key))));
        }
        Drawable drawable5 = resources.getDrawable(z ? R.drawable.extra_toolbar_command : z2 ? R.drawable.extra_toolbar_linux : R.drawable.extra_toolbar_win, null);
        if (drawable5 != null) {
            V0(Y0(this, fb3.p, 4, new nw4(drawable5), new nw4(Integer.valueOf(z ? R.string.extratoolbar_command_key : z2 ? R.string.extratoolbar_linux_key : R.string.extratoolbar_win_key))));
        }
        Drawable drawable6 = resources.getDrawable(R.drawable.extra_toolbar_toggle, null);
        if (drawable6 != null) {
            V0(new x16(5, new nw4(drawable6), new nw4(Integer.valueOf(R.string.extratoolbar_more_action)), nw4Var, new vd5(-16777216, -16777216), new Function0(this) { // from class: o.z16
                public final /* synthetic */ b26 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    Boolean boolValueOf;
                    byte b3 = b2;
                    f88 f88Var = f88.a;
                    b26 b26Var = this.n;
                    switch (b3) {
                        case 0:
                            RCClientActivity rCClientActivity = b26Var.t;
                            if (rCClientActivity != null) {
                                rCClientActivity.S();
                            }
                            break;
                        default:
                            nw4 nw4Var2 = b26Var.u;
                            RCClientActivity rCClientActivity2 = b26Var.t;
                            if (rCClientActivity2 != null) {
                                lc3 lc3Var = rCClientActivity2.P;
                                if (lc3Var == null || !lc3Var.t()) {
                                    lc3 lc3Var2 = rCClientActivity2.P;
                                    if (lc3Var2 != null) {
                                        lc3Var2.D0();
                                    }
                                } else {
                                    lc3 lc3Var3 = rCClientActivity2.P;
                                    if (lc3Var3 != null) {
                                        lc3Var3.J0();
                                    }
                                }
                                RcSessionBottomToolbarView rcSessionBottomToolbarView = rCClientActivity2.Q;
                                if (rcSessionBottomToolbarView != null) {
                                    rcSessionBottomToolbarView.c();
                                }
                                lc3 lc3Var4 = rCClientActivity2.P;
                                boolValueOf = Boolean.valueOf(lc3Var4 != null ? lc3Var4.t() : false);
                            } else {
                                boolValueOf = null;
                            }
                            nw4Var2.setValue(boolValueOf);
                            break;
                    }
                    return f88Var;
                }
            }, 24));
        }
        this.f2259o.observeForever(pVar);
    }

    public static x16 Y0(b26 b26Var, fb3 fb3Var, int i, nw4 nw4Var, nw4 nw4Var2) {
        j93 j93Var = b26Var.s;
        j93Var.getClass();
        return new x16(i, nw4Var, nw4Var2, j93Var.S(fb3Var), null, new a26((Object) b26Var, (Object) fb3Var, (byte) 0), 472);
    }

    @Override // o.oe8
    public final void U0() {
        this.f2259o.removeObserver(this.v);
    }
}
