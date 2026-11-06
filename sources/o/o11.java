package o;

import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthenticationNotificationViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.IConditionalAccessAuthNotificationViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.IntSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/o11;", "Lo/ut2;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class o11 extends ut2 {
    public fp1 p0;
    public v11 q0;

    public final boolean A0() {
        if (this.q0 == null) {
            im3.e0("viewModel");
            throw null;
        }
        if (l25.b()) {
            return false;
        }
        fp1 fp1Var = this.p0;
        if (fp1Var != null) {
            f37.f((ScrollView) fp1Var.a, R.string.tv_device_authentication_internet_not_available, 0).i();
            return true;
        }
        im3.e0("binding");
        throw null;
    }

    @Override // o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (this.r != null) {
            c36 c36Var = zu1.c;
            if (c36Var != null) {
                this.q0 = c36Var.d(this);
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
        String string5;
        String string6;
        layoutInflater.getClass();
        final byte b = 0;
        View viewInflate = LayoutInflater.from(E()).inflate(R.layout.fragment_conditional_access_authentication_connection_request, (ViewGroup) null, false);
        int i = R.id.allow_button;
        Button button = (Button) r47.s(viewInflate, R.id.allow_button);
        if (button != null) {
            i = R.id.deny_button;
            Button button2 = (Button) r47.s(viewInflate, R.id.deny_button);
            if (button2 != null) {
                i = R.id.device_from_image;
                if (((ImageView) r47.s(viewInflate, R.id.device_from_image)) != null) {
                    i = R.id.device_to_image;
                    if (((ImageView) r47.s(viewInflate, R.id.device_to_image)) != null) {
                        i = R.id.from_account_data;
                        TextView textView = (TextView) r47.s(viewInflate, R.id.from_account_data);
                        if (textView != null) {
                            i = R.id.from_company_data;
                            TextView textView2 = (TextView) r47.s(viewInflate, R.id.from_company_data);
                            if (textView2 != null) {
                                i = R.id.from_device_data;
                                TextView textView3 = (TextView) r47.s(viewInflate, R.id.from_device_data);
                                if (textView3 != null) {
                                    i = R.id.from_text;
                                    if (((TextView) r47.s(viewInflate, R.id.from_text)) != null) {
                                        i = R.id.grid_layout_one;
                                        if (((GridLayout) r47.s(viewInflate, R.id.grid_layout_one)) != null) {
                                            i = R.id.grid_layout_to;
                                            if (((GridLayout) r47.s(viewInflate, R.id.grid_layout_to)) != null) {
                                                i = R.id.time_image;
                                                if (((ImageView) r47.s(viewInflate, R.id.time_image)) != null) {
                                                    i = R.id.time_text;
                                                    TextView textView4 = (TextView) r47.s(viewInflate, R.id.time_text);
                                                    if (textView4 != null) {
                                                        i = R.id.title_text;
                                                        if (((TextView) r47.s(viewInflate, R.id.title_text)) != null) {
                                                            i = R.id.to_account_data;
                                                            TextView textView5 = (TextView) r47.s(viewInflate, R.id.to_account_data);
                                                            if (textView5 != null) {
                                                                i = R.id.to_company_data;
                                                                TextView textView6 = (TextView) r47.s(viewInflate, R.id.to_company_data);
                                                                if (textView6 != null) {
                                                                    i = R.id.to_device_data;
                                                                    TextView textView7 = (TextView) r47.s(viewInflate, R.id.to_device_data);
                                                                    if (textView7 != null) {
                                                                        i = R.id.to_text;
                                                                        if (((TextView) r47.s(viewInflate, R.id.to_text)) != null) {
                                                                            this.p0 = new fp1((ScrollView) viewInflate, button, button2, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                                            Bundle bundle2 = this.r;
                                                                            String str = "";
                                                                            if (bundle2 == null || (string = bundle2.getString("SOURCE_ACCOUNT_NAME")) == null) {
                                                                                string = "";
                                                                            }
                                                                            textView.setText(string);
                                                                            fp1 fp1Var = this.p0;
                                                                            if (fp1Var == null) {
                                                                                im3.e0("binding");
                                                                                throw null;
                                                                            }
                                                                            TextView textView8 = (TextView) fp1Var.e;
                                                                            Bundle bundle3 = this.r;
                                                                            if (bundle3 == null || (string2 = bundle3.getString("SOURCE_DEVICE_NAME")) == null) {
                                                                                string2 = "";
                                                                            }
                                                                            textView8.setText(string2);
                                                                            fp1 fp1Var2 = this.p0;
                                                                            if (fp1Var2 == null) {
                                                                                im3.e0("binding");
                                                                                throw null;
                                                                            }
                                                                            TextView textView9 = (TextView) fp1Var2.d;
                                                                            Bundle bundle4 = this.r;
                                                                            if (bundle4 == null || (string3 = bundle4.getString("SOURCE_COMPANY_NAME")) == null) {
                                                                                string3 = "";
                                                                            }
                                                                            textView9.setText(string3);
                                                                            fp1 fp1Var3 = this.p0;
                                                                            if (fp1Var3 == null) {
                                                                                im3.e0("binding");
                                                                                throw null;
                                                                            }
                                                                            TextView textView10 = (TextView) fp1Var3.g;
                                                                            Bundle bundle5 = this.r;
                                                                            if (bundle5 == null || (string4 = bundle5.getString("TARGET_ACCOUNT_NAME")) == null) {
                                                                                string4 = "";
                                                                            }
                                                                            textView10.setText(string4);
                                                                            fp1 fp1Var4 = this.p0;
                                                                            if (fp1Var4 == null) {
                                                                                im3.e0("binding");
                                                                                throw null;
                                                                            }
                                                                            TextView textView11 = (TextView) fp1Var4.i;
                                                                            Bundle bundle6 = this.r;
                                                                            if (bundle6 == null || (string5 = bundle6.getString("TARGET_DEVICE_NAME")) == null) {
                                                                                string5 = "";
                                                                            }
                                                                            textView11.setText(string5);
                                                                            fp1 fp1Var5 = this.p0;
                                                                            if (fp1Var5 == null) {
                                                                                im3.e0("binding");
                                                                                throw null;
                                                                            }
                                                                            TextView textView12 = (TextView) fp1Var5.h;
                                                                            Bundle bundle7 = this.r;
                                                                            if (bundle7 != null && (string6 = bundle7.getString("TARGET_COMPANY_NAME")) != null) {
                                                                                str = string6;
                                                                            }
                                                                            textView12.setText(str);
                                                                            Bundle bundle8 = this.r;
                                                                            long j = bundle8 != null ? bundle8.getLong("TIMESTAMP") : 0L;
                                                                            if (j > 0) {
                                                                                fp1 fp1Var6 = this.p0;
                                                                                if (fp1Var6 == null) {
                                                                                    im3.e0("binding");
                                                                                    throw null;
                                                                                }
                                                                                ((TextView) fp1Var6.f).setText(DateUtils.getRelativeDateTimeString(r0(), j, 1000L, 3600000L, 0));
                                                                            }
                                                                            Bundle bundle9 = this.r;
                                                                            final long j2 = bundle9 != null ? bundle9.getLong("SESSION_ID") : 0L;
                                                                            fp1 fp1Var7 = this.p0;
                                                                            if (fp1Var7 == null) {
                                                                                im3.e0("binding");
                                                                                throw null;
                                                                            }
                                                                            ((Button) fp1Var7.c).setOnClickListener(new View.OnClickListener(this) { // from class: o.m11
                                                                                public final /* synthetic */ o11 n;

                                                                                {
                                                                                    this.n = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    byte b2 = b;
                                                                                    o11 o11Var = this.n;
                                                                                    switch (b2) {
                                                                                        case 0:
                                                                                            if (o11Var.A0()) {
                                                                                                return;
                                                                                            }
                                                                                            v11 v11Var = o11Var.q0;
                                                                                            if (v11Var == null) {
                                                                                                im3.e0("viewModel");
                                                                                                throw null;
                                                                                            }
                                                                                            n11 n11Var = new n11(o11Var, (byte) 0);
                                                                                            ConditionalAccessAuthenticationNotificationViewModelNative conditionalAccessAuthenticationNotificationViewModelNative = v11Var.n;
                                                                                            IConditionalAccessAuthNotificationViewModelSWIGJNI.ConditionalAccessAuthenticationNotificationViewModelNative_OnConnectionRequestDenied(conditionalAccessAuthenticationNotificationViewModelNative.a, conditionalAccessAuthenticationNotificationViewModelNative, j2, IntSignalCallback.getCPtr((IntSignalCallback) n11Var), n11Var);
                                                                                            return;
                                                                                        default:
                                                                                            if (o11Var.A0()) {
                                                                                                return;
                                                                                            }
                                                                                            v11 v11Var2 = o11Var.q0;
                                                                                            if (v11Var2 == null) {
                                                                                                im3.e0("viewModel");
                                                                                                throw null;
                                                                                            }
                                                                                            n11 n11Var2 = new n11(o11Var, (byte) 1);
                                                                                            ConditionalAccessAuthenticationNotificationViewModelNative conditionalAccessAuthenticationNotificationViewModelNative2 = v11Var2.n;
                                                                                            IConditionalAccessAuthNotificationViewModelSWIGJNI.ConditionalAccessAuthenticationNotificationViewModelNative_OnConnectionRequestAllowed(conditionalAccessAuthenticationNotificationViewModelNative2.a, conditionalAccessAuthenticationNotificationViewModelNative2, j2, IntSignalCallback.getCPtr((IntSignalCallback) n11Var2), n11Var2);
                                                                                            return;
                                                                                    }
                                                                                }
                                                                            });
                                                                            fp1 fp1Var8 = this.p0;
                                                                            if (fp1Var8 == null) {
                                                                                im3.e0("binding");
                                                                                throw null;
                                                                            }
                                                                            final byte b2 = 1;
                                                                            ((Button) fp1Var8.b).setOnClickListener(new View.OnClickListener(this) { // from class: o.m11
                                                                                public final /* synthetic */ o11 n;

                                                                                {
                                                                                    this.n = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    byte b3 = b2;
                                                                                    o11 o11Var = this.n;
                                                                                    switch (b3) {
                                                                                        case 0:
                                                                                            if (o11Var.A0()) {
                                                                                                return;
                                                                                            }
                                                                                            v11 v11Var = o11Var.q0;
                                                                                            if (v11Var == null) {
                                                                                                im3.e0("viewModel");
                                                                                                throw null;
                                                                                            }
                                                                                            n11 n11Var = new n11(o11Var, (byte) 0);
                                                                                            ConditionalAccessAuthenticationNotificationViewModelNative conditionalAccessAuthenticationNotificationViewModelNative = v11Var.n;
                                                                                            IConditionalAccessAuthNotificationViewModelSWIGJNI.ConditionalAccessAuthenticationNotificationViewModelNative_OnConnectionRequestDenied(conditionalAccessAuthenticationNotificationViewModelNative.a, conditionalAccessAuthenticationNotificationViewModelNative, j2, IntSignalCallback.getCPtr((IntSignalCallback) n11Var), n11Var);
                                                                                            return;
                                                                                        default:
                                                                                            if (o11Var.A0()) {
                                                                                                return;
                                                                                            }
                                                                                            v11 v11Var2 = o11Var.q0;
                                                                                            if (v11Var2 == null) {
                                                                                                im3.e0("viewModel");
                                                                                                throw null;
                                                                                            }
                                                                                            n11 n11Var2 = new n11(o11Var, (byte) 1);
                                                                                            ConditionalAccessAuthenticationNotificationViewModelNative conditionalAccessAuthenticationNotificationViewModelNative2 = v11Var2.n;
                                                                                            IConditionalAccessAuthNotificationViewModelSWIGJNI.ConditionalAccessAuthenticationNotificationViewModelNative_OnConnectionRequestAllowed(conditionalAccessAuthenticationNotificationViewModelNative2.a, conditionalAccessAuthenticationNotificationViewModelNative2, j2, IntSignalCallback.getCPtr((IntSignalCallback) n11Var2), n11Var2);
                                                                                            return;
                                                                                    }
                                                                                }
                                                                            });
                                                                            fp1 fp1Var9 = this.p0;
                                                                            if (fp1Var9 == null) {
                                                                                im3.e0("binding");
                                                                                throw null;
                                                                            }
                                                                            ScrollView scrollView = (ScrollView) fp1Var9.a;
                                                                            scrollView.getClass();
                                                                            return scrollView;
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
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
