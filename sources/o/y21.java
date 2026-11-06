package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.remotecontrollib.swig.IBannerViewModel;
import com.teamviewer.remotecontrollib.swig.IBannerViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDevicesV2MemberId;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0011²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lo/y21;", "Lo/ut2;", "Lo/oq0;", "Lo/w05;", "Lo/bi3;", "Lo/ha3;", "Lo/hq4;", "<init>", "()V", "Lo/p31;", "uiState", "", "Lo/l33;", "allGroups", "", "areGroupsLoading", "hasInternet", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y21 extends ut2 implements oq0, bi3, ha3, hq4 {
    public bb5 p0;
    public y31 q0;
    public l07 r0;
    public boolean s0;
    public final xc0 t0 = new xc0(this, (byte) 15);

    public static void C0(Context context, String str) {
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        Intent intentQ = ep3.q(context, str);
        intentQ.setFlags(268435456);
        context.startActivity(intentQ);
    }

    public final void A0(p93 p93Var, Function1 function1, Function0 function0, final Context context, final Function1 function2) {
        int iOrdinal = p93Var.ordinal();
        final byte b = 0;
        final byte b2 = 1;
        g37 g37Var = g37.f854o;
        sl7 sl7Var = sl7.f2030o;
        sl7 sl7Var2 = sl7.q;
        g37 g37Var2 = g37.n;
        switch (iOrdinal) {
            case 1:
                String strI = I(R.string.connections_blocked);
                strI.getClass();
                String strI2 = I(R.string.dismiss);
                String strI3 = I(R.string.tv_device_authentication_learn_more);
                strI3.getClass();
                final byte b3 = 2;
                function1.invoke(new ul7(sl7Var2, strI, g37Var2, strI2, new nl7(strI3, new Function0() { // from class: o.p21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b4 = b3;
                        f88 f88Var = f88.a;
                        Context context2 = context;
                        y21 y21Var = this;
                        Function1 function3 = function2;
                        switch (b4) {
                            case 0:
                                if (function3 != null) {
                                    String strI4 = y21Var.I(R.string.invoice_overdue_dialog_title);
                                    String strI5 = y21Var.I(R.string.invoice_overdue_dialog_description);
                                    String strI6 = y21Var.I(R.string.pay_now);
                                    strI6.getClass();
                                    function3.invoke(new q20(strI4, strI5, strI6, new o21(y21Var, context2, (byte) 4), y21Var.I(R.string.dialog_option_cancel), new q21(y21Var, (byte) 6)));
                                }
                                break;
                            case 1:
                                if (function3 != null) {
                                    String strI7 = y21Var.I(R.string.connections_blocked_soon_dialog_title);
                                    String strI8 = y21Var.I(R.string.connections_blocked_soon_dialog_description);
                                    String strI9 = y21Var.I(R.string.pay_now);
                                    strI9.getClass();
                                    function3.invoke(new q20(strI7, strI8, strI9, new o21(y21Var, context2, (byte) 2), y21Var.I(R.string.dialog_option_cancel), new q21(y21Var, (byte) 0)));
                                }
                                break;
                            default:
                                if (function3 != null) {
                                    String strI10 = y21Var.I(R.string.connections_blocked_dialog_title);
                                    String strI11 = y21Var.I(R.string.connections_blocked_dialog_description);
                                    String strI12 = y21Var.I(R.string.pay_now);
                                    strI12.getClass();
                                    function3.invoke(new q20(strI10, strI11, strI12, new o21(y21Var, context2, (byte) 3), y21Var.I(R.string.dialog_option_cancel), new q21(y21Var, (byte) 1)));
                                }
                                break;
                        }
                        return f88Var;
                    }
                }), function0, 136));
                break;
            case 2:
                String strI4 = I(R.string.invoice_overdue);
                strI4.getClass();
                String strI5 = I(R.string.dismiss);
                String strI6 = I(R.string.tv_device_authentication_learn_more);
                strI6.getClass();
                function1.invoke(new ul7(sl7Var2, strI4, g37Var2, strI5, new nl7(strI6, new Function0() { // from class: o.p21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b4 = b;
                        f88 f88Var = f88.a;
                        Context context2 = context;
                        y21 y21Var = this;
                        Function1 function3 = function2;
                        switch (b4) {
                            case 0:
                                if (function3 != null) {
                                    String strI7 = y21Var.I(R.string.invoice_overdue_dialog_title);
                                    String strI8 = y21Var.I(R.string.invoice_overdue_dialog_description);
                                    String strI9 = y21Var.I(R.string.pay_now);
                                    strI9.getClass();
                                    function3.invoke(new q20(strI7, strI8, strI9, new o21(y21Var, context2, (byte) 4), y21Var.I(R.string.dialog_option_cancel), new q21(y21Var, (byte) 6)));
                                }
                                break;
                            case 1:
                                if (function3 != null) {
                                    String strI10 = y21Var.I(R.string.connections_blocked_soon_dialog_title);
                                    String strI11 = y21Var.I(R.string.connections_blocked_soon_dialog_description);
                                    String strI12 = y21Var.I(R.string.pay_now);
                                    strI12.getClass();
                                    function3.invoke(new q20(strI10, strI11, strI12, new o21(y21Var, context2, (byte) 2), y21Var.I(R.string.dialog_option_cancel), new q21(y21Var, (byte) 0)));
                                }
                                break;
                            default:
                                if (function3 != null) {
                                    String strI13 = y21Var.I(R.string.connections_blocked_dialog_title);
                                    String strI14 = y21Var.I(R.string.connections_blocked_dialog_description);
                                    String strI15 = y21Var.I(R.string.pay_now);
                                    strI15.getClass();
                                    function3.invoke(new q20(strI13, strI14, strI15, new o21(y21Var, context2, (byte) 3), y21Var.I(R.string.dialog_option_cancel), new q21(y21Var, (byte) 1)));
                                }
                                break;
                        }
                        return f88Var;
                    }
                }), function0, 136));
                break;
            case 3:
                String strI7 = I(R.string.connections_blocked_soon);
                strI7.getClass();
                String strI8 = I(R.string.dismiss);
                String strI9 = I(R.string.tv_device_authentication_learn_more);
                strI9.getClass();
                function1.invoke(new ul7(sl7Var2, strI7, g37Var2, strI8, new nl7(strI9, new Function0() { // from class: o.p21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b4 = b2;
                        f88 f88Var = f88.a;
                        Context context2 = context;
                        y21 y21Var = this;
                        Function1 function3 = function2;
                        switch (b4) {
                            case 0:
                                if (function3 != null) {
                                    String strI10 = y21Var.I(R.string.invoice_overdue_dialog_title);
                                    String strI11 = y21Var.I(R.string.invoice_overdue_dialog_description);
                                    String strI12 = y21Var.I(R.string.pay_now);
                                    strI12.getClass();
                                    function3.invoke(new q20(strI10, strI11, strI12, new o21(y21Var, context2, (byte) 4), y21Var.I(R.string.dialog_option_cancel), new q21(y21Var, (byte) 6)));
                                }
                                break;
                            case 1:
                                if (function3 != null) {
                                    String strI13 = y21Var.I(R.string.connections_blocked_soon_dialog_title);
                                    String strI14 = y21Var.I(R.string.connections_blocked_soon_dialog_description);
                                    String strI15 = y21Var.I(R.string.pay_now);
                                    strI15.getClass();
                                    function3.invoke(new q20(strI13, strI14, strI15, new o21(y21Var, context2, (byte) 2), y21Var.I(R.string.dialog_option_cancel), new q21(y21Var, (byte) 0)));
                                }
                                break;
                            default:
                                if (function3 != null) {
                                    String strI16 = y21Var.I(R.string.connections_blocked_dialog_title);
                                    String strI17 = y21Var.I(R.string.connections_blocked_dialog_description);
                                    String strI18 = y21Var.I(R.string.pay_now);
                                    strI18.getClass();
                                    function3.invoke(new q20(strI16, strI17, strI18, new o21(y21Var, context2, (byte) 3), y21Var.I(R.string.dialog_option_cancel), new q21(y21Var, (byte) 1)));
                                }
                                break;
                        }
                        return f88Var;
                    }
                }), function0, 136));
                break;
            case 5:
                String strI10 = I(R.string.trial_ended);
                strI10.getClass();
                String strI11 = I(R.string.tv_device_authentication_learn_more);
                strI11.getClass();
                function1.invoke(new ul7(sl7Var, strI10, g37Var, null, new nl7(strI11, new x8(function2, this, (byte) 21)), null, 216));
                y31 y31Var = this.q0;
                if (y31Var != null) {
                    y31Var.m1();
                }
                break;
            case 6:
                String strI12 = I(R.string.trial_started);
                strI12.getClass();
                function1.invoke(new ul7(sl7.n, strI12, g37Var2, I(R.string.dismiss), null, function0, 168));
                break;
            case 7:
                String strI13 = I(R.string.approaching_limit);
                strI13.getClass();
                String strI14 = I(R.string.dismiss);
                String strI15 = I(R.string.tv_fab_add_contact);
                strI15.getClass();
                function1.invoke(new ul7(sl7Var2, strI13, g37Var2, strI14, new nl7(strI15, new o21(this, context, (byte) 0)), function0, 136));
                break;
            case 8:
                String strI16 = I(R.string.limit_reached);
                strI16.getClass();
                String strI17 = I(R.string.tv_fab_add_contact);
                strI17.getClass();
                function1.invoke(new ul7(sl7Var, strI16, g37Var, null, new nl7(strI17, new o21(this, context, (byte) 1)), null, 216));
                y31 y31Var2 = this.q0;
                if (y31Var2 != null) {
                    y31Var2.m1();
                }
                break;
        }
    }

    public final void B0(String str, Long l) {
        au2 au2Var = vt1.c;
        if (au2Var == null) {
            hk0.g("Required value was null.");
            return;
        }
        qb3 qb3VarI = au2Var.i(this, new ManagedDevicesV2MemberId(yl4.ManagedDeviceV2, str));
        if (qb3VarI != null) {
            ((xd0) qb3VarI).W0();
            return;
        }
        if (l != null) {
            long jLongValue = l.longValue();
            y31 y31Var = this.q0;
            f88 f88Var = null;
            if (y31Var != null) {
                String strValueOf = String.valueOf(jLongValue);
                hs1 hs1Var = str.length() == 0 ? hs1.f1004o : hs1.n;
                strValueOf.getClass();
                gu0 gu0VarN = e8.n(y31Var);
                tk1 tk1Var = g22.a;
                im3.R(gu0VarN, gk1.f901o, null, new j0(y31Var, strValueOf, hs1Var, false, (hc1) null), 2);
                f88Var = f88.a;
            }
            if (f88Var != null) {
                return;
            }
        }
        y31 y31Var2 = this.q0;
        if (y31Var2 != null) {
            y31Var2.n1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        bb5 bb5Var = this.p0;
        if (bb5Var != null) {
            bb5Var.H0(false);
        }
        bb5 bb5Var2 = this.p0;
        if (bb5Var2 != null) {
            bb5Var2.q(gk6.n, false);
        }
        xt2 xt2VarC = C();
        if (xt2VarC != 0 && (xt2VarC instanceof id3)) {
            ((id3) xt2VarC).f(null, false, null, (15 & 8) == 0);
            xt2VarC.setTitle("");
        }
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return null;
        }
        xt2 xt2VarP0 = p0();
        dl5 dl5Var = new dl5(new q26(c36Var, (byte) 10), (byte) 2);
        ve8 g0 = xt2VarP0.getG0();
        bf1 bf1VarK = h57.k(xt2VarP0);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(y31.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        y31 y31Var = (y31) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        this.q0 = y31Var;
        p0().v(this, L());
        y31Var.z.observe(L(), new a7(new q0(this, (byte) 27), (byte) 2));
        p0().c().a(L(), new u21(y31Var, this, (byte) 0));
        Context contextR0 = r0();
        String string = contextR0.getString(R.string.tv_package_id_qs);
        string.getClass();
        String string2 = contextR0.getString(R.string.tv_url_download_mobile_apps_web_page);
        t60 t60Var = new t60(contextR0, false);
        yc4 yc4Var = new yc4();
        yc4Var.n = string;
        yc4Var.f2598o = string2;
        yc4Var.m = contextR0;
        yc4Var.p = t60Var;
        String str = "market://details?id=%s";
        Object[] objArrCopyOf = Arrays.copyOf(new Object[]{string}, 1);
        Locale locale = Locale.getDefault();
        locale.getClass();
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
        try {
            Object[] objArrCopyOf3 = Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length);
            str = String.format(locale, "market://details?id=%s", Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length));
        } catch (IllegalFormatException e) {
            ye4.c("StringHelperFuncs", "formatString() " + e.getMessage() + " with format=market://details?id=%s");
        }
        yc4Var.q = str;
        y31Var.B = yc4Var;
        ComposeView composeView = new ComposeView(r0(), null, 6);
        composeView.setContent(new yy0(172757513, true, new f9(this, y31Var, composeView, (byte) 6)));
        return composeView;
    }

    @Override // o.bu2
    public final w05 a() {
        return w05.Connect;
    }

    @Override // o.oq0
    public final void e(bb5 bb5Var) {
        this.p0 = bb5Var;
    }

    @Override // o.ut2
    public final void g0() {
        Object value;
        this.S = true;
        y31 y31Var = this.q0;
        if (y31Var != null) {
            IBannerViewModel iBannerViewModel = y31Var.f2573o;
            VoidSignalCallback voidSignalCallback = y31Var.G;
            IBannerViewModelSWIGJNI.IBannerViewModel_RegisterForChanges(iBannerViewModel.a, iBannerViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        }
        y31 y31Var2 = this.q0;
        if (y31Var2 != null) {
            y31Var2.j1();
        }
        y31 y31Var3 = this.q0;
        if (y31Var3 != null) {
            r21 r21Var = new r21(y31Var3, (byte) 5);
            l97 l97Var = y31Var3.P;
            do {
                value = l97Var.getValue();
            } while (!l97Var.j(value, (p31) r21Var.invoke((p31) value)));
        }
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        s7 s7Var = u7.g;
        vn4.g0();
        u7.d(this);
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.connect_fragment_settings_button) {
            IStatisticsHandler iStatisticsHandler = ga7.a;
            ga7.a(i15.t);
            if (it1.c != null) {
                y0(new Intent(E(), (Class<?>) SettingsActivity.class));
                return true;
            }
            im3.e0("viewFactory");
            throw null;
        }
        if (itemId != R.id.connect_fragment_subscribe_button) {
            return false;
        }
        IStatisticsHandler iStatisticsHandler2 = ga7.a;
        ga7.a(fg3.p);
        int i = InAppPurchaseActivity.S;
        Intent intentJ = ct1.J(C());
        if (intentJ != null) {
            KeyEvent.Callback callbackC = C();
            bb3 bb3Var = callbackC instanceof bb3 ? (bb3) callbackC : null;
            if (bb3Var != null) {
                bb3Var.i(intentJ);
            }
        }
        return true;
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        s7 s7Var = u7.g;
        vn4.g0();
        u7.e(this);
    }

    @Override // o.ha3
    public final void m(Object obj) {
        if (obj != null) {
            getG0().a();
            if (!(obj instanceof Long)) {
                if (obj instanceof yn4) {
                    yn4 yn4Var = (yn4) obj;
                    B0(yn4Var.a, yn4Var.b);
                    return;
                } else if (obj instanceof String) {
                    B0((String) obj, null);
                    return;
                } else {
                    ye4.a.b("ConnectFragment", "Unknown type of ShortcutConnection");
                    return;
                }
            }
            long jLongValue = ((Number) obj).longValue();
            c36 c36Var = zu1.c;
            if (c36Var == null) {
                hk0.g("Required value was null.");
                return;
            }
            va3 va3VarG = c36Var.g(this, t33.n, jLongValue);
            ep3 ep3Var = it1.c;
            if (ep3Var == null) {
                im3.e0("viewFactory");
                throw null;
            }
            this.r0 = ep3Var.p();
            wk0 wk0Var = new wk0(this, va3VarG, (byte) 6);
            if (va3VarG != null) {
                ((iv1) va3VarG).f1105o.X0(wk0Var);
                return;
            }
            y31 y31Var = this.q0;
            if (y31Var != null) {
                y31Var.n1();
            }
        }
    }

    @Override // o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.connect_fragment_menu, menu);
        menu.findItem(R.id.connect_fragment_subscribe_button).setVisible(this.s0);
    }
}
