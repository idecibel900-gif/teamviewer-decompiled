package o;

import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/zf3;", "Lo/bb5;", "Lo/w05;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zf3 extends bb5<w05> {
    public boolean w0;
    public final kh7 x0 = new kh7(new zz0(this, 25));

    @Override // o.bb5
    public final oq0 C0() {
        return new bg3();
    }

    @Override // o.bu2
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public final w05 a() {
        w05 w05Var;
        Bundle bundle = this.r;
        return (bundle == null || (w05Var = (w05) pm8.w(bundle, "current_navigation_category", w05.class)) == null) ? w05.Partnerlist : w05Var;
    }

    public final th8 L0() {
        th8 th8Var = new th8();
        Bundle bundle = new Bundle();
        bundle.putBoolean("fromInAppPurchase", true);
        bundle.putBoolean("BUNDLE_KEY_SHOW_BACK_NAVIGATION", true);
        bundle.putBoolean("BUNDLE_KEY_HIDE_OPTIONS_MENU", true);
        Bundle bundle2 = this.r;
        bundle.putParcelable("BUNDLE_KEY_LOGIN_URI", bundle2 != null ? (Uri) pm8.u(bundle2, "BUNDLE_KEY_LOGIN_URI", Uri.class) : null);
        bundle.putSerializable("LOGIN_SOURCE_KEY", sf4.f2017o);
        bundle.putSerializable("navigation_category", a());
        th8Var.u0(bundle);
        return th8Var;
    }

    @Override // o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.w0 = bundle != null ? bundle.getBoolean("request_login") : false;
    }

    @Override // o.ut2
    public final void h0(Bundle bundle) {
        bundle.putBoolean("request_login", this.w0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.bb5, o.ut2
    public final void k0(View view, Bundle bundle) {
        view.getClass();
        super.k0(view, bundle);
        if (bundle == null) {
            ((tf3) this.x0.getValue()).V0();
        }
        im3.R(us1.B(L()), null, null, new y0(this, 0 == true ? 1 : 0, (byte) 16), 3);
        final byte b = 0;
        D().f0("request_login", L(), new xu2(this) { // from class: o.xf3
            public final /* synthetic */ zf3 n;

            {
                this.n = this;
            }

            @Override // o.xu2
            public final void b(String str, Bundle bundle2) {
                byte b2 = b;
                zf3 zf3Var = this.n;
                switch (b2) {
                    case 0:
                        bundle2.getClass();
                        if (bundle2.getBoolean("request_login")) {
                            zf3Var.w0 = true;
                            tf3 tf3Var = (tf3) zf3Var.x0.getValue();
                            tf3Var.getClass();
                            im3.R(e8.n(tf3Var), null, null, new sf3(tf3Var, null, (byte) 1), 3);
                        }
                        break;
                    case 1:
                        bundle2.getClass();
                        tf3 tf3Var2 = (tf3) zf3Var.x0.getValue();
                        tf3Var2.getClass();
                        im3.R(e8.n(tf3Var2), null, null, new sf3(tf3Var2, null, (byte) 0), 3);
                        break;
                    default:
                        bundle2.getClass();
                        tf3 tf3Var3 = (tf3) zf3Var.x0.getValue();
                        tf3Var3.getClass();
                        im3.R(e8.n(tf3Var3), null, null, new sf3(tf3Var3, null, (byte) 2), 3);
                        break;
                }
            }
        });
        final byte b2 = 1;
        D().f0("purchase_successful", L(), new xu2(this) { // from class: o.xf3
            public final /* synthetic */ zf3 n;

            {
                this.n = this;
            }

            @Override // o.xu2
            public final void b(String str, Bundle bundle2) {
                byte b3 = b2;
                zf3 zf3Var = this.n;
                switch (b3) {
                    case 0:
                        bundle2.getClass();
                        if (bundle2.getBoolean("request_login")) {
                            zf3Var.w0 = true;
                            tf3 tf3Var = (tf3) zf3Var.x0.getValue();
                            tf3Var.getClass();
                            im3.R(e8.n(tf3Var), null, null, new sf3(tf3Var, null, (byte) 1), 3);
                        }
                        break;
                    case 1:
                        bundle2.getClass();
                        tf3 tf3Var2 = (tf3) zf3Var.x0.getValue();
                        tf3Var2.getClass();
                        im3.R(e8.n(tf3Var2), null, null, new sf3(tf3Var2, null, (byte) 0), 3);
                        break;
                    default:
                        bundle2.getClass();
                        tf3 tf3Var3 = (tf3) zf3Var.x0.getValue();
                        tf3Var3.getClass();
                        im3.R(e8.n(tf3Var3), null, null, new sf3(tf3Var3, null, (byte) 2), 3);
                        break;
                }
            }
        });
        final byte b3 = 2;
        D().f0("show_free_pan", L(), new xu2(this) { // from class: o.xf3
            public final /* synthetic */ zf3 n;

            {
                this.n = this;
            }

            @Override // o.xu2
            public final void b(String str, Bundle bundle2) {
                byte b4 = b3;
                zf3 zf3Var = this.n;
                switch (b4) {
                    case 0:
                        bundle2.getClass();
                        if (bundle2.getBoolean("request_login")) {
                            zf3Var.w0 = true;
                            tf3 tf3Var = (tf3) zf3Var.x0.getValue();
                            tf3Var.getClass();
                            im3.R(e8.n(tf3Var), null, null, new sf3(tf3Var, null, (byte) 1), 3);
                        }
                        break;
                    case 1:
                        bundle2.getClass();
                        tf3 tf3Var2 = (tf3) zf3Var.x0.getValue();
                        tf3Var2.getClass();
                        im3.R(e8.n(tf3Var2), null, null, new sf3(tf3Var2, null, (byte) 0), 3);
                        break;
                    default:
                        bundle2.getClass();
                        tf3 tf3Var3 = (tf3) zf3Var.x0.getValue();
                        tf3Var3.getClass();
                        im3.R(e8.n(tf3Var3), null, null, new sf3(tf3Var3, null, (byte) 2), 3);
                        break;
                }
            }
        });
        if (bundle == null) {
            Bundle bundle2 = this.r;
            if ((bundle2 != null ? (Uri) pm8.u(bundle2, "BUNDLE_KEY_LOGIN_URI", Uri.class) : null) != null) {
                this.w0 = true;
                I0(L0(), false);
            }
        }
    }

    @Override // o.bb5, o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
    }
}
