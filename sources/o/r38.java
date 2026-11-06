package o;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDeviceRequestViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDeviceRequestViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/r38;", "Lo/ut2;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r38 extends ut2 {
    public au2 p0;
    public t38 q0;
    public j38 r0 = j38.Device;
    public boolean s0;
    public int t0;
    public boolean u0;
    public final q38 v0;
    public final o38 w0;
    public final o38 x0;

    /* JADX WARN: Type inference failed for: r0v2, types: [o.o38] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.o38] */
    public r38() {
        final byte b = 0;
        this.v0 = new q38(this, b);
        this.w0 = new hk7(this) { // from class: o.o38
            public final /* synthetic */ r38 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b2 = b;
                r38 r38Var = this.b;
                switch (b2) {
                    case 0:
                        t38 t38Var = r38Var.q0;
                        if (t38Var == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative = t38Var.n;
                        ITrustedDeviceRequestViewModelSWIGJNI.ITrustedDeviceRequestViewModelNative_OnResetPasswordOpened(iTrustedDeviceRequestViewModelNative.a, iTrustedDeviceRequestViewModelNative);
                        xt2 xt2VarP0 = r38Var.p0();
                        String strI = r38Var.I(R.string.tv_trusted_device_reset_password_url);
                        strI.getClass();
                        Uri uri = Uri.parse(strI);
                        uri.getClass();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(uri);
                        intent.addFlags(268435456);
                        try {
                            xt2VarP0.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                        }
                        r38Var.p0().finish();
                        return;
                    default:
                        gk7Var.A0();
                        r38Var.p0().finish();
                        return;
                }
            }
        };
        final byte b2 = 1;
        this.x0 = new hk7(this) { // from class: o.o38
            public final /* synthetic */ r38 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b3 = b2;
                r38 r38Var = this.b;
                switch (b3) {
                    case 0:
                        t38 t38Var = r38Var.q0;
                        if (t38Var == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative = t38Var.n;
                        ITrustedDeviceRequestViewModelSWIGJNI.ITrustedDeviceRequestViewModelNative_OnResetPasswordOpened(iTrustedDeviceRequestViewModelNative.a, iTrustedDeviceRequestViewModelNative);
                        xt2 xt2VarP0 = r38Var.p0();
                        String strI = r38Var.I(R.string.tv_trusted_device_reset_password_url);
                        strI.getClass();
                        Uri uri = Uri.parse(strI);
                        uri.getClass();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(uri);
                        intent.addFlags(268435456);
                        try {
                            xt2VarP0.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                        }
                        r38Var.p0().finish();
                        return;
                    default:
                        gk7Var.A0();
                        r38Var.p0().finish();
                        return;
                }
            }
        };
    }

    public static Date A0(String str) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = simpleDateFormat.parse(str);
        return date == null ? new Date() : date;
    }

    public final void B0() {
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.a1 = true;
        gk7Var.F0 = R.string.tv_trusted_device_reset_password_title_text;
        gk7Var.H0 = R.string.tv_trusted_device_reset_password_heading_text;
        gk7Var.K0 = R.string.tv_trusted_device_reset_password_reset_now_text;
        gk7Var.O0 = R.string.tv_trusted_device_reset_password_not_now_text;
        if (ct1.a != null) {
            xk1.M(this.w0, new r02(gk7Var, p02.Positive));
            xk1.M(this.x0, new r02(gk7Var, p02.Negative));
        }
        gk7.O0(gk7Var, p0());
    }

    @Override // o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (this.r != null) {
            c36 c36Var = zu1.c;
            if (c36Var != null) {
                this.q0 = c36Var.m();
            } else {
                hk0.g("Required value was null.");
            }
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        layoutInflater.getClass();
        Bundle bundle2 = this.r;
        String str = "";
        if (bundle2 == null || (string = bundle2.getString("ARG_DYNGATE_ID_KEY")) == null) {
            string = "";
        }
        Bundle bundle3 = this.r;
        if (bundle3 == null || (string2 = bundle3.getString("ARG_LOCATION_KEY")) == null) {
            string2 = "";
        }
        Bundle bundle4 = this.r;
        String string5 = bundle4 != null ? bundle4.getString("ARG_IP_ADDRESS_KEY") : null;
        Bundle bundle5 = this.r;
        if (bundle5 == null || (string3 = bundle5.getString("ARG_TOKEN_KEY")) == null) {
            string3 = "";
        }
        Bundle bundle6 = this.r;
        if (bundle6 != null && (string4 = bundle6.getString("ARG_TIMESTAMP_KEY")) != null) {
            str = string4;
        }
        Bundle bundle7 = this.r;
        this.t0 = bundle7 != null ? bundle7.getInt("ARG_NOTIFICATION_ID_KEY") : 0;
        Bundle bundle8 = this.r;
        this.u0 = bundle8 != null ? bundle8.getBoolean("ARG_DECLINED_FROM_NOTIFICATION") : false;
        View viewInflate = LayoutInflater.from(E()).inflate(R.layout.fragment_trusted_device_request, (ViewGroup) null, false);
        int i = R.id.trusted_device_only_once_radiobutton;
        RadioButton radioButton = (RadioButton) r47.s(viewInflate, R.id.trusted_device_only_once_radiobutton);
        if (radioButton != null) {
            i = R.id.trusted_device_RadioGroup;
            RadioGroup radioGroup = (RadioGroup) r47.s(viewInflate, R.id.trusted_device_RadioGroup);
            if (radioGroup != null) {
                i = R.id.trusted_device_request_date_textview;
                TextView textView = (TextView) r47.s(viewInflate, R.id.trusted_device_request_date_textview);
                if (textView != null) {
                    i = R.id.trusted_device_request_decline_button;
                    Button button = (Button) r47.s(viewInflate, R.id.trusted_device_request_decline_button);
                    if (button != null) {
                        i = R.id.trusted_device_request_device_from_imageview;
                        if (((ImageView) r47.s(viewInflate, R.id.trusted_device_request_device_from_imageview)) != null) {
                            i = R.id.trusted_device_request_from_teamviewer_id_textview;
                            TextView textView2 = (TextView) r47.s(viewInflate, R.id.trusted_device_request_from_teamviewer_id_textview);
                            if (textView2 != null) {
                                i = R.id.trusted_device_request_ip_address_textview;
                                TextView textView3 = (TextView) r47.s(viewInflate, R.id.trusted_device_request_ip_address_textview);
                                if (textView3 != null) {
                                    i = R.id.trusted_device_request_location_imageview;
                                    if (((ImageView) r47.s(viewInflate, R.id.trusted_device_request_location_imageview)) != null) {
                                        i = R.id.trusted_device_request_location_textview;
                                        TextView textView4 = (TextView) r47.s(viewInflate, R.id.trusted_device_request_location_textview);
                                        if (textView4 != null) {
                                            i = R.id.trusted_device_request_time_imageview;
                                            if (((ImageView) r47.s(viewInflate, R.id.trusted_device_request_time_imageview)) != null) {
                                                i = R.id.trusted_device_request_time_textview;
                                                TextView textView5 = (TextView) r47.s(viewInflate, R.id.trusted_device_request_time_textview);
                                                if (textView5 != null) {
                                                    i = R.id.trusted_device_request_title_textview;
                                                    if (((TextView) r47.s(viewInflate, R.id.trusted_device_request_title_textview)) != null) {
                                                        i = R.id.trusted_device_request_trust_button;
                                                        Button button2 = (Button) r47.s(viewInflate, R.id.trusted_device_request_trust_button);
                                                        if (button2 != null) {
                                                            i = R.id.trusted_device_this_device_radiobutton;
                                                            RadioButton radioButton2 = (RadioButton) r47.s(viewInflate, R.id.trusted_device_this_device_radiobutton);
                                                            if (radioButton2 != null) {
                                                                i = R.id.trusted_device_this_ip_address_radiobutton;
                                                                RadioButton radioButton3 = (RadioButton) r47.s(viewInflate, R.id.trusted_device_this_ip_address_radiobutton);
                                                                if (radioButton3 != null) {
                                                                    this.p0 = new au2((ScrollView) viewInflate, radioButton, radioGroup, textView, button, textView2, textView3, textView4, textView5, button2, radioButton2, radioButton3);
                                                                    textView2.setText(string);
                                                                    au2 au2Var = this.p0;
                                                                    if (au2Var != null) {
                                                                        ((TextView) au2Var.g).setText(string2);
                                                                    }
                                                                    au2 au2Var2 = this.p0;
                                                                    if (au2Var2 != null) {
                                                                        ((TextView) au2Var2.f).setText(J(R.string.tv_trusted_device_request_ip_address_text, string5));
                                                                    }
                                                                    au2 au2Var3 = this.p0;
                                                                    if (au2Var3 != null) {
                                                                        TextView textView6 = (TextView) au2Var3.h;
                                                                        String str2 = DateFormat.getTimeInstance().format(A0(str));
                                                                        str2.getClass();
                                                                        textView6.setText(str2);
                                                                    }
                                                                    au2 au2Var4 = this.p0;
                                                                    if (au2Var4 != null) {
                                                                        TextView textView7 = (TextView) au2Var4.a;
                                                                        String str3 = DateFormat.getDateInstance(1).format(A0(str));
                                                                        str3.getClass();
                                                                        textView7.setText(str3);
                                                                    }
                                                                    au2 au2Var5 = this.p0;
                                                                    if (au2Var5 != null) {
                                                                        ((Button) au2Var5.e).setOnClickListener(new io.sentry.android.core.p2(this, (byte) 20));
                                                                    }
                                                                    au2 au2Var6 = this.p0;
                                                                    if (au2Var6 != null) {
                                                                        ((Button) au2Var6.i).setOnClickListener(new y6(this, string3, (byte) 7));
                                                                    }
                                                                    au2 au2Var7 = this.p0;
                                                                    if (au2Var7 != null) {
                                                                        ((RadioGroup) au2Var7.d).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.p38
                                                                            @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                                            public final void onCheckedChanged(RadioGroup radioGroup2, int i2) {
                                                                                radioGroup2.getClass();
                                                                                r38 r38Var = this.a;
                                                                                au2 au2Var8 = r38Var.p0;
                                                                                if (au2Var8 != null && i2 == ((RadioButton) au2Var8.j).getId()) {
                                                                                    r38Var.r0 = j38.Device;
                                                                                    r38Var.s0 = false;
                                                                                    return;
                                                                                }
                                                                                au2 au2Var9 = r38Var.p0;
                                                                                if (au2Var9 != null && i2 == ((RadioButton) au2Var9.k).getId()) {
                                                                                    r38Var.r0 = j38.IpAddress;
                                                                                    r38Var.s0 = false;
                                                                                    return;
                                                                                }
                                                                                au2 au2Var10 = r38Var.p0;
                                                                                if (au2Var10 == null || i2 != ((RadioButton) au2Var10.c).getId()) {
                                                                                    return;
                                                                                }
                                                                                r38Var.r0 = j38.Device;
                                                                                r38Var.s0 = true;
                                                                            }
                                                                        });
                                                                    }
                                                                    t38 t38Var = this.q0;
                                                                    if (t38Var == null) {
                                                                        im3.e0("viewModel");
                                                                        throw null;
                                                                    }
                                                                    ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative = t38Var.n;
                                                                    ITrustedDeviceRequestViewModelSWIGJNI.ITrustedDeviceRequestViewModelNative_OnSignInRequestScreenShown(iTrustedDeviceRequestViewModelNative.a, iTrustedDeviceRequestViewModelNative);
                                                                    au2 au2Var8 = this.p0;
                                                                    if (au2Var8 != null) {
                                                                        return (ScrollView) au2Var8.b;
                                                                    }
                                                                    return null;
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
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // o.ut2
    public final void k0(View view, Bundle bundle) {
        view.getClass();
        if (this.u0) {
            t38 t38Var = this.q0;
            if (t38Var == null) {
                im3.e0("viewModel");
                throw null;
            }
            ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative = t38Var.n;
            ITrustedDeviceRequestViewModelSWIGJNI.ITrustedDeviceRequestViewModelNative_OnSignInDeclinedFromNotification(iTrustedDeviceRequestViewModelNative.a, iTrustedDeviceRequestViewModelNative);
            B0();
            new r55(r0()).a(this.t0, "TeamViewerRcTrustedDeviceNotification");
        }
    }
}
