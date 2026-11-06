package o;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/tu1;", "Lo/zb0;", "Lo/bi3;", "Lo/hq4;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tu1 extends zb0 implements bi3, hq4 {
    public static final /* synthetic */ int u0 = 0;
    public long s0;
    public ta3 t0;

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    @Override // o.fv2, o.ut2
    public final void X(Bundle bundle) {
        long jLongValue;
        super.X(bundle);
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("BuddyId")) : null;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            Bundle bundle2 = this.r;
            Long lValueOf2 = bundle2 != null ? Long.valueOf(bundle2.getLong("BuddyId")) : null;
            jLongValue = lValueOf2 != null ? lValueOf2.longValue() : 0L;
        }
        this.s0 = jLongValue;
        if (bundle == null && D().E(R.id.avatar_image_container) == null) {
            if (it1.c == null) {
                im3.e0("viewFactory");
                throw null;
            }
            p33 p33VarO = ep3.o(this.s0, t33.n);
            su2 su2VarD = D();
            su2VarD.getClass();
            w10 w10Var = new w10(su2VarD);
            w10Var.h(R.id.avatar_image_container, p33VarO, null, 1);
            w10Var.f();
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nw4 nw4Var;
        nw4 nw4Var2;
        nw4 nw4Var3;
        nw4 nw4Var4;
        nw4 nw4Var5;
        nw4 nw4Var6;
        layoutInflater.getClass();
        final byte b = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_information, viewGroup, false);
        int i = R.id.avatar_image_container;
        if (((FrameLayout) r47.s(viewInflate, R.id.avatar_image_container)) != null) {
            i = R.id.device_alarm_details_subtitle;
            if (((TextView) r47.s(viewInflate, R.id.device_alarm_details_subtitle)) != null) {
                i = R.id.device_information_device_name;
                TextView textView = (TextView) r47.s(viewInflate, R.id.device_information_device_name);
                if (textView != null) {
                    i = R.id.device_information_domain;
                    TextView textView2 = (TextView) r47.s(viewInflate, R.id.device_information_domain);
                    if (textView2 != null) {
                        i = R.id.device_information_domain_title;
                        if (((TextView) r47.s(viewInflate, R.id.device_information_domain_title)) != null) {
                            i = R.id.device_information_external_ip;
                            TextView textView3 = (TextView) r47.s(viewInflate, R.id.device_information_external_ip);
                            if (textView3 != null) {
                                i = R.id.device_information_external_ip_title;
                                if (((TextView) r47.s(viewInflate, R.id.device_information_external_ip_title)) != null) {
                                    i = R.id.device_information_hardware;
                                    TextView textView4 = (TextView) r47.s(viewInflate, R.id.device_information_hardware);
                                    if (textView4 != null) {
                                        i = R.id.device_information_hardware_title;
                                        if (((TextView) r47.s(viewInflate, R.id.device_information_hardware_title)) != null) {
                                            i = R.id.device_information_internal_ip;
                                            TextView textView5 = (TextView) r47.s(viewInflate, R.id.device_information_internal_ip);
                                            if (textView5 != null) {
                                                i = R.id.device_information_internal_ip_title;
                                                if (((TextView) r47.s(viewInflate, R.id.device_information_internal_ip_title)) != null) {
                                                    i = R.id.device_information_os;
                                                    TextView textView6 = (TextView) r47.s(viewInflate, R.id.device_information_os);
                                                    if (textView6 != null) {
                                                        i = R.id.device_information_os_title;
                                                        if (((TextView) r47.s(viewInflate, R.id.device_information_os_title)) != null) {
                                                            i = R.id.lineDivider;
                                                            View viewS = r47.s(viewInflate, R.id.lineDivider);
                                                            if (viewS != null) {
                                                                FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                                final io.sentry.android.core.d dVar = new io.sentry.android.core.d();
                                                                dVar.m = textView;
                                                                dVar.n = textView2;
                                                                dVar.f100o = textView3;
                                                                dVar.p = textView4;
                                                                dVar.q = textView5;
                                                                dVar.r = textView6;
                                                                dVar.s = viewS;
                                                                c36 c36Var = zu1.c;
                                                                if (c36Var == null) {
                                                                    hk0.g("Required value was null.");
                                                                    return null;
                                                                }
                                                                final byte b2 = 2;
                                                                dl5 dl5Var = new dl5(new gl(this.s0, c36Var), (byte) 2);
                                                                ve8 g0 = getG0();
                                                                bf1 bf1VarK = h57.k(this);
                                                                pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
                                                                wt3 wt3VarB = w86.a.b(vu1.class);
                                                                String strC = wt3VarB.c();
                                                                if (strC == null) {
                                                                    hk0.g("Local and anonymous classes can not be ViewModels");
                                                                    return null;
                                                                }
                                                                this.t0 = (ta3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
                                                                p0().v(this, L());
                                                                bb5 bb5Var = this.r0;
                                                                if (bb5Var != null) {
                                                                    bb5Var.q(gk6.n, false);
                                                                }
                                                                xt2 xt2VarC = C();
                                                                if (xt2VarC != null) {
                                                                    xt2VarC.setTitle(R.string.tv_device_information_title);
                                                                }
                                                                ta3 ta3Var = this.t0;
                                                                byte b3 = 11;
                                                                if (ta3Var != null && (nw4Var6 = ((vu1) ta3Var).q) != null) {
                                                                    nw4Var6.observe(L(), new b7(new Function1() { // from class: o.su1
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj) {
                                                                            byte b4 = b;
                                                                            f88 f88Var = f88.a;
                                                                            io.sentry.android.core.d dVar2 = dVar;
                                                                            String str = (String) obj;
                                                                            switch (b4) {
                                                                                case 0:
                                                                                    int i2 = tu1.u0;
                                                                                    ((TextView) dVar2.m).setText(str);
                                                                                    break;
                                                                                case 1:
                                                                                    int i3 = tu1.u0;
                                                                                    ((TextView) dVar2.r).setText(str);
                                                                                    break;
                                                                                case 2:
                                                                                    int i4 = tu1.u0;
                                                                                    ((TextView) dVar2.p).setText(str);
                                                                                    break;
                                                                                case 3:
                                                                                    int i5 = tu1.u0;
                                                                                    ((TextView) dVar2.n).setText(str);
                                                                                    break;
                                                                                case 4:
                                                                                    int i6 = tu1.u0;
                                                                                    ((TextView) dVar2.q).setText(str);
                                                                                    break;
                                                                                default:
                                                                                    int i7 = tu1.u0;
                                                                                    ((TextView) dVar2.f100o).setText(str);
                                                                                    break;
                                                                            }
                                                                            return f88Var;
                                                                        }
                                                                    }, b3));
                                                                }
                                                                ta3 ta3Var2 = this.t0;
                                                                if (ta3Var2 != null && (nw4Var5 = ((vu1) ta3Var2).r) != null) {
                                                                    final byte b4 = 1;
                                                                    nw4Var5.observe(L(), new b7(new Function1() { // from class: o.su1
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj) {
                                                                            byte b5 = b4;
                                                                            f88 f88Var = f88.a;
                                                                            io.sentry.android.core.d dVar2 = dVar;
                                                                            String str = (String) obj;
                                                                            switch (b5) {
                                                                                case 0:
                                                                                    int i2 = tu1.u0;
                                                                                    ((TextView) dVar2.m).setText(str);
                                                                                    break;
                                                                                case 1:
                                                                                    int i3 = tu1.u0;
                                                                                    ((TextView) dVar2.r).setText(str);
                                                                                    break;
                                                                                case 2:
                                                                                    int i4 = tu1.u0;
                                                                                    ((TextView) dVar2.p).setText(str);
                                                                                    break;
                                                                                case 3:
                                                                                    int i5 = tu1.u0;
                                                                                    ((TextView) dVar2.n).setText(str);
                                                                                    break;
                                                                                case 4:
                                                                                    int i6 = tu1.u0;
                                                                                    ((TextView) dVar2.q).setText(str);
                                                                                    break;
                                                                                default:
                                                                                    int i7 = tu1.u0;
                                                                                    ((TextView) dVar2.f100o).setText(str);
                                                                                    break;
                                                                            }
                                                                            return f88Var;
                                                                        }
                                                                    }, b3));
                                                                }
                                                                ta3 ta3Var3 = this.t0;
                                                                if (ta3Var3 != null && (nw4Var4 = ((vu1) ta3Var3).s) != null) {
                                                                    nw4Var4.observe(L(), new b7(new Function1() { // from class: o.su1
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj) {
                                                                            byte b5 = b2;
                                                                            f88 f88Var = f88.a;
                                                                            io.sentry.android.core.d dVar2 = dVar;
                                                                            String str = (String) obj;
                                                                            switch (b5) {
                                                                                case 0:
                                                                                    int i2 = tu1.u0;
                                                                                    ((TextView) dVar2.m).setText(str);
                                                                                    break;
                                                                                case 1:
                                                                                    int i3 = tu1.u0;
                                                                                    ((TextView) dVar2.r).setText(str);
                                                                                    break;
                                                                                case 2:
                                                                                    int i4 = tu1.u0;
                                                                                    ((TextView) dVar2.p).setText(str);
                                                                                    break;
                                                                                case 3:
                                                                                    int i5 = tu1.u0;
                                                                                    ((TextView) dVar2.n).setText(str);
                                                                                    break;
                                                                                case 4:
                                                                                    int i6 = tu1.u0;
                                                                                    ((TextView) dVar2.q).setText(str);
                                                                                    break;
                                                                                default:
                                                                                    int i7 = tu1.u0;
                                                                                    ((TextView) dVar2.f100o).setText(str);
                                                                                    break;
                                                                            }
                                                                            return f88Var;
                                                                        }
                                                                    }, b3));
                                                                }
                                                                ta3 ta3Var4 = this.t0;
                                                                if (ta3Var4 != null && (nw4Var3 = ((vu1) ta3Var4).t) != null) {
                                                                    final byte b5 = 3;
                                                                    nw4Var3.observe(L(), new b7(new Function1() { // from class: o.su1
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj) {
                                                                            byte b6 = b5;
                                                                            f88 f88Var = f88.a;
                                                                            io.sentry.android.core.d dVar2 = dVar;
                                                                            String str = (String) obj;
                                                                            switch (b6) {
                                                                                case 0:
                                                                                    int i2 = tu1.u0;
                                                                                    ((TextView) dVar2.m).setText(str);
                                                                                    break;
                                                                                case 1:
                                                                                    int i3 = tu1.u0;
                                                                                    ((TextView) dVar2.r).setText(str);
                                                                                    break;
                                                                                case 2:
                                                                                    int i4 = tu1.u0;
                                                                                    ((TextView) dVar2.p).setText(str);
                                                                                    break;
                                                                                case 3:
                                                                                    int i5 = tu1.u0;
                                                                                    ((TextView) dVar2.n).setText(str);
                                                                                    break;
                                                                                case 4:
                                                                                    int i6 = tu1.u0;
                                                                                    ((TextView) dVar2.q).setText(str);
                                                                                    break;
                                                                                default:
                                                                                    int i7 = tu1.u0;
                                                                                    ((TextView) dVar2.f100o).setText(str);
                                                                                    break;
                                                                            }
                                                                            return f88Var;
                                                                        }
                                                                    }, b3));
                                                                }
                                                                ta3 ta3Var5 = this.t0;
                                                                if (ta3Var5 != null && (nw4Var2 = ((vu1) ta3Var5).u) != null) {
                                                                    final byte b6 = 4;
                                                                    nw4Var2.observe(L(), new b7(new Function1() { // from class: o.su1
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj) {
                                                                            byte b7 = b6;
                                                                            f88 f88Var = f88.a;
                                                                            io.sentry.android.core.d dVar2 = dVar;
                                                                            String str = (String) obj;
                                                                            switch (b7) {
                                                                                case 0:
                                                                                    int i2 = tu1.u0;
                                                                                    ((TextView) dVar2.m).setText(str);
                                                                                    break;
                                                                                case 1:
                                                                                    int i3 = tu1.u0;
                                                                                    ((TextView) dVar2.r).setText(str);
                                                                                    break;
                                                                                case 2:
                                                                                    int i4 = tu1.u0;
                                                                                    ((TextView) dVar2.p).setText(str);
                                                                                    break;
                                                                                case 3:
                                                                                    int i5 = tu1.u0;
                                                                                    ((TextView) dVar2.n).setText(str);
                                                                                    break;
                                                                                case 4:
                                                                                    int i6 = tu1.u0;
                                                                                    ((TextView) dVar2.q).setText(str);
                                                                                    break;
                                                                                default:
                                                                                    int i7 = tu1.u0;
                                                                                    ((TextView) dVar2.f100o).setText(str);
                                                                                    break;
                                                                            }
                                                                            return f88Var;
                                                                        }
                                                                    }, b3));
                                                                }
                                                                ta3 ta3Var6 = this.t0;
                                                                if (ta3Var6 != null && (nw4Var = ((vu1) ta3Var6).v) != null) {
                                                                    final byte b7 = 5;
                                                                    nw4Var.observe(L(), new b7(new Function1() { // from class: o.su1
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj) {
                                                                            byte b8 = b7;
                                                                            f88 f88Var = f88.a;
                                                                            io.sentry.android.core.d dVar2 = dVar;
                                                                            String str = (String) obj;
                                                                            switch (b8) {
                                                                                case 0:
                                                                                    int i2 = tu1.u0;
                                                                                    ((TextView) dVar2.m).setText(str);
                                                                                    break;
                                                                                case 1:
                                                                                    int i3 = tu1.u0;
                                                                                    ((TextView) dVar2.r).setText(str);
                                                                                    break;
                                                                                case 2:
                                                                                    int i4 = tu1.u0;
                                                                                    ((TextView) dVar2.p).setText(str);
                                                                                    break;
                                                                                case 3:
                                                                                    int i5 = tu1.u0;
                                                                                    ((TextView) dVar2.n).setText(str);
                                                                                    break;
                                                                                case 4:
                                                                                    int i6 = tu1.u0;
                                                                                    ((TextView) dVar2.q).setText(str);
                                                                                    break;
                                                                                default:
                                                                                    int i7 = tu1.u0;
                                                                                    ((TextView) dVar2.f100o).setText(str);
                                                                                    break;
                                                                            }
                                                                            return f88Var;
                                                                        }
                                                                    }, b3));
                                                                }
                                                                frameLayout.getClass();
                                                                return frameLayout;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        bundle.putLong("BuddyId", this.s0);
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.device_information_settings_button) {
            return false;
        }
        if (it1.c != null) {
            y0(new Intent(E(), (Class<?>) SettingsActivity.class));
            return true;
        }
        im3.e0("viewFactory");
        throw null;
    }

    @Override // o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.device_information_menu, menu);
    }
}
