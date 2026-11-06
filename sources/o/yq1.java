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
import androidx.appcompat.widget.AppCompatImageView;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapper;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapperSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.remotecontrolviewlib.view.partnerlist.DeviceOptionsActionButton;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/yq1;", "Lo/zb0;", "Lo/bi3;", "Lo/hq4;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yq1 extends zb0 implements bi3, hq4 {
    public static final /* synthetic */ int G0 = 0;
    public final wq1 A0;
    public final wq1 B0;
    public qa3 s0;
    public long t0;
    public l07 v0;
    public TextView w0;
    public AppCompatImageView x0;
    public cu2 y0;
    public final wq1 z0;
    public String u0 = "";
    public final xq1 C0 = new xq1(this, 1);
    public final xq1 D0 = new xq1(this, 2);
    public final xq1 E0 = new xq1(this, 0);
    public final xq1 F0 = new xq1(this, 3);

    /* JADX WARN: Type inference failed for: r0v1, types: [o.wq1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.wq1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.wq1] */
    public yq1() {
        final byte b = 0;
        this.z0 = new View.OnClickListener(this) { // from class: o.wq1
            public final /* synthetic */ yq1 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                yq1 yq1Var = this.n;
                switch (b2) {
                    case 0:
                        qa3 qa3Var = yq1Var.s0;
                        if (qa3Var != null) {
                            xq1 xq1Var = yq1Var.C0;
                            xq1Var.getClass();
                            ((ar1) qa3Var).n.X0(xq1Var);
                        }
                        break;
                    case 1:
                        qa3 qa3Var2 = yq1Var.s0;
                        if (qa3Var2 != null) {
                            xq1 xq1Var2 = yq1Var.D0;
                            xq1Var2.getClass();
                            ((ar1) qa3Var2).n.Y0(xq1Var2);
                        }
                        break;
                    default:
                        qa3 qa3Var3 = yq1Var.s0;
                        if (qa3Var3 != null) {
                            xq1 xq1Var3 = yq1Var.E0;
                            xq1Var3.getClass();
                            ((ar1) qa3Var3).n.W0(xq1Var3);
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.A0 = new View.OnClickListener(this) { // from class: o.wq1
            public final /* synthetic */ yq1 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                yq1 yq1Var = this.n;
                switch (b3) {
                    case 0:
                        qa3 qa3Var = yq1Var.s0;
                        if (qa3Var != null) {
                            xq1 xq1Var = yq1Var.C0;
                            xq1Var.getClass();
                            ((ar1) qa3Var).n.X0(xq1Var);
                        }
                        break;
                    case 1:
                        qa3 qa3Var2 = yq1Var.s0;
                        if (qa3Var2 != null) {
                            xq1 xq1Var2 = yq1Var.D0;
                            xq1Var2.getClass();
                            ((ar1) qa3Var2).n.Y0(xq1Var2);
                        }
                        break;
                    default:
                        qa3 qa3Var3 = yq1Var.s0;
                        if (qa3Var3 != null) {
                            xq1 xq1Var3 = yq1Var.E0;
                            xq1Var3.getClass();
                            ((ar1) qa3Var3).n.W0(xq1Var3);
                        }
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.B0 = new View.OnClickListener(this) { // from class: o.wq1
            public final /* synthetic */ yq1 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b3;
                yq1 yq1Var = this.n;
                switch (b4) {
                    case 0:
                        qa3 qa3Var = yq1Var.s0;
                        if (qa3Var != null) {
                            xq1 xq1Var = yq1Var.C0;
                            xq1Var.getClass();
                            ((ar1) qa3Var).n.X0(xq1Var);
                        }
                        break;
                    case 1:
                        qa3 qa3Var2 = yq1Var.s0;
                        if (qa3Var2 != null) {
                            xq1 xq1Var2 = yq1Var.D0;
                            xq1Var2.getClass();
                            ((ar1) qa3Var2).n.Y0(xq1Var2);
                        }
                        break;
                    default:
                        qa3 qa3Var3 = yq1Var.s0;
                        if (qa3Var3 != null) {
                            xq1 xq1Var3 = yq1Var.E0;
                            xq1Var3.getClass();
                            ((ar1) qa3Var3).n.W0(xq1Var3);
                        }
                        break;
                }
            }
        };
    }

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    public final void H0() {
        cu2 cu2Var = this.y0;
        View view = cu2Var != null ? cu2Var.b : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        yk3 yk3Var = new yk3(0, viewGroup != null ? viewGroup.getChildCount() : 0, 1);
        ArrayList arrayList = new ArrayList(mv0.Z(yk3Var, 10));
        Iterator it = yk3Var.iterator();
        while (true) {
            xk3 xk3Var = (xk3) it;
            if (!xk3Var.f2526o) {
                break;
            } else {
                arrayList.add(viewGroup != null ? viewGroup.getChildAt(xk3Var.nextInt()) : null);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof DeviceOptionsActionButton) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((DeviceOptionsActionButton) obj2).getVisibility() == 0) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(mv0.Z(arrayList3, 10));
        int i = 0;
        for (Object obj3 : arrayList3) {
            int i2 = i + 1;
            if (i < 0) {
                qf0.U();
                throw null;
            }
            ((DeviceOptionsActionButton) obj3).setPrimary(i == 0);
            arrayList4.add(f88.a);
            i = i2;
        }
    }

    @Override // o.fv2, o.ut2
    public final void X(Bundle bundle) {
        long jLongValue;
        super.X(bundle);
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("memberId")) : null;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            Bundle bundle2 = this.r;
            Long lValueOf2 = bundle2 != null ? Long.valueOf(bundle2.getLong("memberId")) : null;
            jLongValue = lValueOf2 != null ? lValueOf2.longValue() : 0L;
        }
        this.t0 = jLongValue;
        String string = bundle != null ? bundle.getString("selectedAlertId") : null;
        if (string == null) {
            Bundle bundle3 = this.r;
            String string2 = bundle3 != null ? bundle3.getString("selectedAlertId") : null;
            string = string2 == null ? "" : string2;
        }
        this.u0 = string;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x02bc A[PHI: r1
      0x02bc: PHI (r1v2 int) = (r1v1 int), (r1v5 int), (r1v6 int), (r1v7 int), (r1v8 int), (r1v9 int) binds: [B:3:0x0018, B:5:0x0023, B:7:0x002e, B:9:0x0039, B:11:0x0044, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        nw4 nw4Var;
        nw4 nw4Var2;
        nw4 nw4Var3;
        nw4 nw4Var4;
        nw4 nw4Var5;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_alarm_details, viewGroup, false);
        int i = R.id.actions_wrapper;
        View viewS = r47.s(viewInflate, R.id.actions_wrapper);
        if (viewS != null) {
            i = R.id.alarm_details_device_name;
            TextView textView = (TextView) r47.s(viewInflate, R.id.alarm_details_device_name);
            if (textView != null) {
                i = R.id.alertSubtitle;
                TextView textView2 = (TextView) r47.s(viewInflate, R.id.alertSubtitle);
                if (textView2 != null) {
                    i = R.id.alertTitle;
                    TextView textView3 = (TextView) r47.s(viewInflate, R.id.alertTitle);
                    if (textView3 != null) {
                        i = R.id.alertsLogAcknowledgedStatusIcon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) r47.s(viewInflate, R.id.alertsLogAcknowledgedStatusIcon);
                        if (appCompatImageView != null) {
                            i = R.id.avatar_image_container;
                            if (((FrameLayout) r47.s(viewInflate, R.id.avatar_image_container)) != null) {
                                int i2 = R.id.chat_button;
                                DeviceOptionsActionButton deviceOptionsActionButton = (DeviceOptionsActionButton) r47.s(viewInflate, R.id.chat_button);
                                if (deviceOptionsActionButton != null) {
                                    i2 = R.id.connect_with_password_button;
                                    DeviceOptionsActionButton deviceOptionsActionButton2 = (DeviceOptionsActionButton) r47.s(viewInflate, R.id.connect_with_password_button);
                                    if (deviceOptionsActionButton2 != null) {
                                        i2 = R.id.connect_with_password_tooltip;
                                        TextView textView4 = (TextView) r47.s(viewInflate, R.id.connect_with_password_tooltip);
                                        if (textView4 != null) {
                                            i2 = R.id.connect_with_prompt_button;
                                            DeviceOptionsActionButton deviceOptionsActionButton3 = (DeviceOptionsActionButton) r47.s(viewInflate, R.id.connect_with_prompt_button);
                                            if (deviceOptionsActionButton3 != null) {
                                                i2 = R.id.connect_with_prompt_tooltip;
                                                TextView textView5 = (TextView) r47.s(viewInflate, R.id.connect_with_prompt_tooltip);
                                                if (textView5 != null) {
                                                    i2 = R.id.device_alarm_details_subtitle;
                                                    if (((TextView) r47.s(viewInflate, R.id.device_alarm_details_subtitle)) != null) {
                                                        i2 = R.id.frameLayout;
                                                        if (((FrameLayout) r47.s(viewInflate, R.id.frameLayout)) != null) {
                                                            View viewS2 = r47.s(viewInflate, R.id.horizontalLineDivider);
                                                            View viewS3 = r47.s(viewInflate, R.id.lineDivider);
                                                            this.y0 = new cu2(viewInflate, viewS, textView, textView2, textView3, appCompatImageView, deviceOptionsActionButton, deviceOptionsActionButton2, textView4, deviceOptionsActionButton3, textView5, viewS2, viewS3, r47.s(viewInflate, R.id.verticalLineDivider));
                                                            if (zu1.c == null) {
                                                                hk0.g("Required value was null.");
                                                                return null;
                                                            }
                                                            final byte b = 2;
                                                            dl5 dl5Var = new dl5(new gl(this.t0, this), (byte) 2);
                                                            ve8 g0 = getG0();
                                                            bf1 bf1VarK = h57.k(this);
                                                            pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
                                                            wt3 wt3VarB = w86.a.b(ar1.class);
                                                            String strC = wt3VarB.c();
                                                            if (strC == null) {
                                                                hk0.g("Local and anonymous classes can not be ViewModels");
                                                                return null;
                                                            }
                                                            qa3 qa3Var = (qa3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
                                                            this.s0 = qa3Var;
                                                            String str = this.u0;
                                                            ar1 ar1Var = (ar1) qa3Var;
                                                            str.getClass();
                                                            ar1Var.v = str;
                                                            IAlertViewModelWrapper iAlertViewModelWrapper = ar1Var.w;
                                                            if (iAlertViewModelWrapper != null) {
                                                                iAlertViewModelWrapper.a();
                                                            }
                                                            IAlertViewModelWrapper iAlertViewModelWrapperV0 = ar1Var.V0(str);
                                                            ar1Var.w = iAlertViewModelWrapperV0;
                                                            ar1Var.z = iAlertViewModelWrapperV0 != null ? IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_GetDescription(iAlertViewModelWrapperV0.a, iAlertViewModelWrapperV0) : null;
                                                            IAlertViewModelWrapper iAlertViewModelWrapper2 = ar1Var.w;
                                                            ar1Var.A = iAlertViewModelWrapper2 != null ? IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_GetDate(iAlertViewModelWrapper2.a, iAlertViewModelWrapper2) : null;
                                                            ar1Var.W0();
                                                            ep3 ep3Var = it1.c;
                                                            if (ep3Var == null) {
                                                                im3.e0("viewFactory");
                                                                throw null;
                                                            }
                                                            this.v0 = ep3Var.p();
                                                            final byte b2 = 1;
                                                            if (bundle == null) {
                                                                ut2 ut2VarE = D().E(R.id.avatar_image_container);
                                                                if (it1.c == null) {
                                                                    im3.e0("viewFactory");
                                                                    throw null;
                                                                }
                                                                p33 p33VarO = ep3.o(this.t0, t33.n);
                                                                if (ut2VarE == null) {
                                                                    su2 su2VarD = D();
                                                                    su2VarD.getClass();
                                                                    w10 w10Var = new w10(su2VarD);
                                                                    w10Var.h(R.id.avatar_image_container, p33VarO, null, 1);
                                                                    w10Var.f();
                                                                }
                                                            }
                                                            p0().v(this, L());
                                                            bb5 bb5Var = this.r0;
                                                            if (bb5Var != null) {
                                                                bb5Var.q(gk6.n, false);
                                                            }
                                                            cu2 cu2Var = this.y0;
                                                            this.w0 = cu2Var != null ? cu2Var.e : null;
                                                            this.x0 = cu2Var != null ? cu2Var.f : null;
                                                            xt2 xt2VarC = C();
                                                            if (xt2VarC != null) {
                                                                xt2VarC.setTitle(R.string.tv_alarm_details_title);
                                                            }
                                                            cu2 cu2Var2 = this.y0;
                                                            if (cu2Var2 != null) {
                                                                TextView textView6 = cu2Var2.e;
                                                                qa3 qa3Var2 = this.s0;
                                                                textView6.setText(qa3Var2 != null ? ((ar1) qa3Var2).z : null);
                                                            }
                                                            cu2 cu2Var3 = this.y0;
                                                            if (cu2Var3 != null) {
                                                                TextView textView7 = cu2Var3.d;
                                                                qa3 qa3Var3 = this.s0;
                                                                textView7.setText(qa3Var3 != null ? ((ar1) qa3Var3).A : null);
                                                            }
                                                            cu2 cu2Var4 = this.y0;
                                                            if (cu2Var4 != null) {
                                                                cu2Var4.h.setOnClickListener(this.z0);
                                                            }
                                                            cu2 cu2Var5 = this.y0;
                                                            if (cu2Var5 != null) {
                                                                cu2Var5.j.setOnClickListener(this.A0);
                                                            }
                                                            cu2 cu2Var6 = this.y0;
                                                            if (cu2Var6 != null) {
                                                                cu2Var6.g.setOnClickListener(this.B0);
                                                            }
                                                            qa3 qa3Var4 = this.s0;
                                                            if (qa3Var4 != null && (nw4Var5 = ((ar1) qa3Var4).p) != null) {
                                                                final byte b3 = 0;
                                                                nw4Var5.observe(L(), new b7(new Function1(this) { // from class: o.uq1
                                                                    public final /* synthetic */ yq1 n;

                                                                    {
                                                                        this.n = this;
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj) {
                                                                        byte b4 = b3;
                                                                        f88 f88Var = f88.a;
                                                                        yq1 yq1Var = this.n;
                                                                        switch (b4) {
                                                                            case 0:
                                                                                String str2 = (String) obj;
                                                                                cu2 cu2Var7 = yq1Var.y0;
                                                                                if (cu2Var7 != null) {
                                                                                    cu2Var7.c.setText(str2);
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                Boolean bool = (Boolean) obj;
                                                                                cu2 cu2Var8 = yq1Var.y0;
                                                                                if (cu2Var8 != null) {
                                                                                    cu2Var8.h.setVisibility(bool.booleanValue() ? 0 : 8);
                                                                                }
                                                                                cu2 cu2Var9 = yq1Var.y0;
                                                                                if (cu2Var9 != null) {
                                                                                    cu2Var9.i.setVisibility(bool.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            case 2:
                                                                                Boolean bool2 = (Boolean) obj;
                                                                                cu2 cu2Var10 = yq1Var.y0;
                                                                                if (cu2Var10 != null) {
                                                                                    cu2Var10.j.setVisibility(bool2.booleanValue() ? 0 : 8);
                                                                                }
                                                                                cu2 cu2Var11 = yq1Var.y0;
                                                                                if (cu2Var11 != null) {
                                                                                    cu2Var11.k.setVisibility(bool2.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            case 3:
                                                                                Boolean bool3 = (Boolean) obj;
                                                                                cu2 cu2Var12 = yq1Var.y0;
                                                                                if (cu2Var12 != null) {
                                                                                    cu2Var12.g.setVisibility(bool3.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            default:
                                                                                Boolean bool4 = (Boolean) obj;
                                                                                int i3 = yq1.G0;
                                                                                bool4.getClass();
                                                                                boolean zBooleanValue = bool4.booleanValue();
                                                                                int i4 = zBooleanValue ? R.color.monitoring_alert_text_low_emphasis : R.color.monitoring_alert_text_high_emphasis;
                                                                                int i5 = zBooleanValue ? R.drawable.acknownledged_alert_icon : R.drawable.unacknownledged_alert_icon;
                                                                                TextView textView8 = yq1Var.w0;
                                                                                if (textView8 != null) {
                                                                                    textView8.setTextColor(yq1Var.r0().getColor(i4));
                                                                                }
                                                                                AppCompatImageView appCompatImageView2 = yq1Var.x0;
                                                                                if (appCompatImageView2 != null) {
                                                                                    appCompatImageView2.setImageResource(i5);
                                                                                }
                                                                                break;
                                                                        }
                                                                        return f88Var;
                                                                    }
                                                                }, (byte) 9));
                                                            }
                                                            qa3 qa3Var5 = this.s0;
                                                            if (qa3Var5 != null && (nw4Var4 = ((ar1) qa3Var5).q) != null) {
                                                                nw4Var4.observe(L(), new b7(new Function1(this) { // from class: o.uq1
                                                                    public final /* synthetic */ yq1 n;

                                                                    {
                                                                        this.n = this;
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj) {
                                                                        byte b4 = b2;
                                                                        f88 f88Var = f88.a;
                                                                        yq1 yq1Var = this.n;
                                                                        switch (b4) {
                                                                            case 0:
                                                                                String str2 = (String) obj;
                                                                                cu2 cu2Var7 = yq1Var.y0;
                                                                                if (cu2Var7 != null) {
                                                                                    cu2Var7.c.setText(str2);
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                Boolean bool = (Boolean) obj;
                                                                                cu2 cu2Var8 = yq1Var.y0;
                                                                                if (cu2Var8 != null) {
                                                                                    cu2Var8.h.setVisibility(bool.booleanValue() ? 0 : 8);
                                                                                }
                                                                                cu2 cu2Var9 = yq1Var.y0;
                                                                                if (cu2Var9 != null) {
                                                                                    cu2Var9.i.setVisibility(bool.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            case 2:
                                                                                Boolean bool2 = (Boolean) obj;
                                                                                cu2 cu2Var10 = yq1Var.y0;
                                                                                if (cu2Var10 != null) {
                                                                                    cu2Var10.j.setVisibility(bool2.booleanValue() ? 0 : 8);
                                                                                }
                                                                                cu2 cu2Var11 = yq1Var.y0;
                                                                                if (cu2Var11 != null) {
                                                                                    cu2Var11.k.setVisibility(bool2.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            case 3:
                                                                                Boolean bool3 = (Boolean) obj;
                                                                                cu2 cu2Var12 = yq1Var.y0;
                                                                                if (cu2Var12 != null) {
                                                                                    cu2Var12.g.setVisibility(bool3.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            default:
                                                                                Boolean bool4 = (Boolean) obj;
                                                                                int i3 = yq1.G0;
                                                                                bool4.getClass();
                                                                                boolean zBooleanValue = bool4.booleanValue();
                                                                                int i4 = zBooleanValue ? R.color.monitoring_alert_text_low_emphasis : R.color.monitoring_alert_text_high_emphasis;
                                                                                int i5 = zBooleanValue ? R.drawable.acknownledged_alert_icon : R.drawable.unacknownledged_alert_icon;
                                                                                TextView textView8 = yq1Var.w0;
                                                                                if (textView8 != null) {
                                                                                    textView8.setTextColor(yq1Var.r0().getColor(i4));
                                                                                }
                                                                                AppCompatImageView appCompatImageView2 = yq1Var.x0;
                                                                                if (appCompatImageView2 != null) {
                                                                                    appCompatImageView2.setImageResource(i5);
                                                                                }
                                                                                break;
                                                                        }
                                                                        return f88Var;
                                                                    }
                                                                }, (byte) 9));
                                                            }
                                                            qa3 qa3Var6 = this.s0;
                                                            if (qa3Var6 != null && (nw4Var3 = ((ar1) qa3Var6).r) != null) {
                                                                nw4Var3.observe(L(), new b7(new Function1(this) { // from class: o.uq1
                                                                    public final /* synthetic */ yq1 n;

                                                                    {
                                                                        this.n = this;
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj) {
                                                                        byte b4 = b;
                                                                        f88 f88Var = f88.a;
                                                                        yq1 yq1Var = this.n;
                                                                        switch (b4) {
                                                                            case 0:
                                                                                String str2 = (String) obj;
                                                                                cu2 cu2Var7 = yq1Var.y0;
                                                                                if (cu2Var7 != null) {
                                                                                    cu2Var7.c.setText(str2);
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                Boolean bool = (Boolean) obj;
                                                                                cu2 cu2Var8 = yq1Var.y0;
                                                                                if (cu2Var8 != null) {
                                                                                    cu2Var8.h.setVisibility(bool.booleanValue() ? 0 : 8);
                                                                                }
                                                                                cu2 cu2Var9 = yq1Var.y0;
                                                                                if (cu2Var9 != null) {
                                                                                    cu2Var9.i.setVisibility(bool.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            case 2:
                                                                                Boolean bool2 = (Boolean) obj;
                                                                                cu2 cu2Var10 = yq1Var.y0;
                                                                                if (cu2Var10 != null) {
                                                                                    cu2Var10.j.setVisibility(bool2.booleanValue() ? 0 : 8);
                                                                                }
                                                                                cu2 cu2Var11 = yq1Var.y0;
                                                                                if (cu2Var11 != null) {
                                                                                    cu2Var11.k.setVisibility(bool2.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            case 3:
                                                                                Boolean bool3 = (Boolean) obj;
                                                                                cu2 cu2Var12 = yq1Var.y0;
                                                                                if (cu2Var12 != null) {
                                                                                    cu2Var12.g.setVisibility(bool3.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            default:
                                                                                Boolean bool4 = (Boolean) obj;
                                                                                int i3 = yq1.G0;
                                                                                bool4.getClass();
                                                                                boolean zBooleanValue = bool4.booleanValue();
                                                                                int i4 = zBooleanValue ? R.color.monitoring_alert_text_low_emphasis : R.color.monitoring_alert_text_high_emphasis;
                                                                                int i5 = zBooleanValue ? R.drawable.acknownledged_alert_icon : R.drawable.unacknownledged_alert_icon;
                                                                                TextView textView8 = yq1Var.w0;
                                                                                if (textView8 != null) {
                                                                                    textView8.setTextColor(yq1Var.r0().getColor(i4));
                                                                                }
                                                                                AppCompatImageView appCompatImageView2 = yq1Var.x0;
                                                                                if (appCompatImageView2 != null) {
                                                                                    appCompatImageView2.setImageResource(i5);
                                                                                }
                                                                                break;
                                                                        }
                                                                        return f88Var;
                                                                    }
                                                                }, (byte) 9));
                                                            }
                                                            qa3 qa3Var7 = this.s0;
                                                            if (qa3Var7 != null && (nw4Var2 = ((ar1) qa3Var7).s) != null) {
                                                                final byte b4 = 3;
                                                                nw4Var2.observe(L(), new b7(new Function1(this) { // from class: o.uq1
                                                                    public final /* synthetic */ yq1 n;

                                                                    {
                                                                        this.n = this;
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj) {
                                                                        byte b5 = b4;
                                                                        f88 f88Var = f88.a;
                                                                        yq1 yq1Var = this.n;
                                                                        switch (b5) {
                                                                            case 0:
                                                                                String str2 = (String) obj;
                                                                                cu2 cu2Var7 = yq1Var.y0;
                                                                                if (cu2Var7 != null) {
                                                                                    cu2Var7.c.setText(str2);
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                Boolean bool = (Boolean) obj;
                                                                                cu2 cu2Var8 = yq1Var.y0;
                                                                                if (cu2Var8 != null) {
                                                                                    cu2Var8.h.setVisibility(bool.booleanValue() ? 0 : 8);
                                                                                }
                                                                                cu2 cu2Var9 = yq1Var.y0;
                                                                                if (cu2Var9 != null) {
                                                                                    cu2Var9.i.setVisibility(bool.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            case 2:
                                                                                Boolean bool2 = (Boolean) obj;
                                                                                cu2 cu2Var10 = yq1Var.y0;
                                                                                if (cu2Var10 != null) {
                                                                                    cu2Var10.j.setVisibility(bool2.booleanValue() ? 0 : 8);
                                                                                }
                                                                                cu2 cu2Var11 = yq1Var.y0;
                                                                                if (cu2Var11 != null) {
                                                                                    cu2Var11.k.setVisibility(bool2.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            case 3:
                                                                                Boolean bool3 = (Boolean) obj;
                                                                                cu2 cu2Var12 = yq1Var.y0;
                                                                                if (cu2Var12 != null) {
                                                                                    cu2Var12.g.setVisibility(bool3.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            default:
                                                                                Boolean bool4 = (Boolean) obj;
                                                                                int i3 = yq1.G0;
                                                                                bool4.getClass();
                                                                                boolean zBooleanValue = bool4.booleanValue();
                                                                                int i4 = zBooleanValue ? R.color.monitoring_alert_text_low_emphasis : R.color.monitoring_alert_text_high_emphasis;
                                                                                int i5 = zBooleanValue ? R.drawable.acknownledged_alert_icon : R.drawable.unacknownledged_alert_icon;
                                                                                TextView textView8 = yq1Var.w0;
                                                                                if (textView8 != null) {
                                                                                    textView8.setTextColor(yq1Var.r0().getColor(i4));
                                                                                }
                                                                                AppCompatImageView appCompatImageView2 = yq1Var.x0;
                                                                                if (appCompatImageView2 != null) {
                                                                                    appCompatImageView2.setImageResource(i5);
                                                                                }
                                                                                break;
                                                                        }
                                                                        return f88Var;
                                                                    }
                                                                }, (byte) 9));
                                                            }
                                                            qa3 qa3Var8 = this.s0;
                                                            if (qa3Var8 != null && (nw4Var = ((ar1) qa3Var8).t) != null) {
                                                                final byte b5 = 4;
                                                                nw4Var.observe(L(), new b7(new Function1(this) { // from class: o.uq1
                                                                    public final /* synthetic */ yq1 n;

                                                                    {
                                                                        this.n = this;
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj) {
                                                                        byte b6 = b5;
                                                                        f88 f88Var = f88.a;
                                                                        yq1 yq1Var = this.n;
                                                                        switch (b6) {
                                                                            case 0:
                                                                                String str2 = (String) obj;
                                                                                cu2 cu2Var7 = yq1Var.y0;
                                                                                if (cu2Var7 != null) {
                                                                                    cu2Var7.c.setText(str2);
                                                                                }
                                                                                break;
                                                                            case 1:
                                                                                Boolean bool = (Boolean) obj;
                                                                                cu2 cu2Var8 = yq1Var.y0;
                                                                                if (cu2Var8 != null) {
                                                                                    cu2Var8.h.setVisibility(bool.booleanValue() ? 0 : 8);
                                                                                }
                                                                                cu2 cu2Var9 = yq1Var.y0;
                                                                                if (cu2Var9 != null) {
                                                                                    cu2Var9.i.setVisibility(bool.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            case 2:
                                                                                Boolean bool2 = (Boolean) obj;
                                                                                cu2 cu2Var10 = yq1Var.y0;
                                                                                if (cu2Var10 != null) {
                                                                                    cu2Var10.j.setVisibility(bool2.booleanValue() ? 0 : 8);
                                                                                }
                                                                                cu2 cu2Var11 = yq1Var.y0;
                                                                                if (cu2Var11 != null) {
                                                                                    cu2Var11.k.setVisibility(bool2.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            case 3:
                                                                                Boolean bool3 = (Boolean) obj;
                                                                                cu2 cu2Var12 = yq1Var.y0;
                                                                                if (cu2Var12 != null) {
                                                                                    cu2Var12.g.setVisibility(bool3.booleanValue() ? 0 : 8);
                                                                                }
                                                                                yq1Var.H0();
                                                                                break;
                                                                            default:
                                                                                Boolean bool4 = (Boolean) obj;
                                                                                int i3 = yq1.G0;
                                                                                bool4.getClass();
                                                                                boolean zBooleanValue = bool4.booleanValue();
                                                                                int i4 = zBooleanValue ? R.color.monitoring_alert_text_low_emphasis : R.color.monitoring_alert_text_high_emphasis;
                                                                                int i5 = zBooleanValue ? R.drawable.acknownledged_alert_icon : R.drawable.unacknownledged_alert_icon;
                                                                                TextView textView8 = yq1Var.w0;
                                                                                if (textView8 != null) {
                                                                                    textView8.setTextColor(yq1Var.r0().getColor(i4));
                                                                                }
                                                                                AppCompatImageView appCompatImageView2 = yq1Var.x0;
                                                                                if (appCompatImageView2 != null) {
                                                                                    appCompatImageView2.setImageResource(i5);
                                                                                }
                                                                                break;
                                                                        }
                                                                        return f88Var;
                                                                    }
                                                                }, (byte) 9));
                                                            }
                                                            qa3 qa3Var9 = this.s0;
                                                            if (qa3Var9 != null) {
                                                                ((ar1) qa3Var9).x.a(new vq1(this, (byte) 0));
                                                            }
                                                            qa3 qa3Var10 = this.s0;
                                                            if (qa3Var10 != null) {
                                                                ((ar1) qa3Var10).B = new vq1(this, (byte) 1);
                                                            }
                                                            cu2 cu2Var7 = this.y0;
                                                            cu2Var7.getClass();
                                                            View view2 = cu2Var7.a;
                                                            view2.getClass();
                                                            return view2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                view = null;
                                i = i2;
                            } else {
                                view = null;
                            }
                        } else {
                            view = null;
                        }
                    } else {
                        view = null;
                    }
                } else {
                    view = null;
                }
            } else {
                view = null;
            }
        } else {
            view = null;
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return view;
    }

    @Override // o.fv2, o.ut2
    public final void b0() {
        super.b0();
        this.y0 = null;
    }

    @Override // o.fv2, o.ut2
    public final void f0() {
        super.f0();
        qa3 qa3Var = this.s0;
        if (qa3Var != null) {
            ar1 ar1Var = (ar1) qa3Var;
            ar1Var.y.Disconnect();
            ar1Var.D.Disconnect();
            ar1Var.E.Disconnect();
            ar1Var.C.Disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    @Override // o.fv2, o.ut2
    public final void g0() {
        bb5 bb5Var;
        super.g0();
        au2 au2Var = vt1.c;
        if ((au2Var != null ? au2Var.h(this, new GroupMemberId(s33.Computer, this.t0)) : null) == null) {
            bb5Var = this.r0;
            if (bb5Var != null) {
                bb5Var.G0();
            }
        } else {
            qa3 qa3Var = this.s0;
            if (qa3Var != null) {
                String str = this.u0;
                str.getClass();
                if (((ar1) qa3Var).V0(str) == null) {
                    bb5Var = this.r0;
                    if (bb5Var != null) {
                        bb5Var.G0();
                    }
                }
            }
        }
        qa3 qa3Var2 = this.s0;
        if (qa3Var2 != null) {
            ar1 ar1Var = (ar1) qa3Var2;
            ComputerDetailsViewModel computerDetailsViewModel = ar1Var.f350o;
            VoidSignalCallback voidSignalCallback = ar1Var.y;
            ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForDeviceDelete(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
            VoidSignalCallback voidSignalCallback2 = ar1Var.D;
            ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForAlertsListChanged(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback2), voidSignalCallback2);
            VoidSignalCallback voidSignalCallback3 = ar1Var.E;
            ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_RegisterForChanges(computerDetailsViewModel.a, computerDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback3), voidSignalCallback3);
            g1 g1Var = ar1Var.n;
            VoidSignalCallback voidSignalCallback4 = ar1Var.C;
            GroupMemberListElementViewModel groupMemberListElementViewModel = g1Var.n;
            GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_RegisterForChanges(groupMemberListElementViewModel.a, groupMemberListElementViewModel, VoidSignalCallback.getCPtr(voidSignalCallback4), voidSignalCallback4);
        }
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        bundle.putLong("memberId", this.t0);
        bundle.putString("selectedAlertId", this.u0);
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        qa3 qa3Var = this.s0;
        if (qa3Var != null) {
            ((ar1) qa3Var).W0();
        }
    }

    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.device_alarm_details_settings_button) {
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
        menuInflater.inflate(R.menu.device_alarms_details_menu, menu);
    }
}
