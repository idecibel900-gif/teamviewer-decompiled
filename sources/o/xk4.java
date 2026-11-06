package o;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;
import com.teamviewer.remotecontrollib.gui.view.picture.AccountPictureView;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDevicesV2MemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDevicesV2MemberSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xk4 extends q1 implements View.OnClickListener {
    public final View G;
    public final ge0 H;
    public final ze0 I;
    public final TextView J;
    public final ImageView K;
    public final ImageButton L;
    public final AccountPictureView M;
    public final View N;
    public final View O;
    public qb3 P;
    public ManagedDevicesV2MemberId Q;
    public String R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk4(View view, ge0 ge0Var, ze0 ze0Var) {
        super(view);
        ge0Var.getClass();
        ze0Var.getClass();
        this.G = view;
        this.H = ge0Var;
        this.I = ze0Var;
        View viewFindViewById = view.findViewById(R.id.buddy_name);
        viewFindViewById.getClass();
        this.J = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.buddy_icon);
        viewFindViewById2.getClass();
        this.K = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.connect_button_partner);
        viewFindViewById3.getClass();
        this.L = (ImageButton) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.buddy_account_picture_view);
        viewFindViewById4.getClass();
        this.M = (AccountPictureView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.buddy_connect_button_container);
        viewFindViewById5.getClass();
        this.N = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.buddy_wake_up_button_container);
        viewFindViewById6.getClass();
        this.O = viewFindViewById6;
        view.findViewById(R.id.tableRow).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yl4 yl4VarA;
        ManagedDevicesV2MemberId managedDevicesV2MemberId;
        ManagedDevicesV2MemberId managedDevicesV2MemberId2 = this.Q;
        if (managedDevicesV2MemberId2 == null || (yl4VarA = yl4.a(ManagedDevicesV2MemberSWIGJNI.ManagedDevicesV2MemberId_getType(managedDevicesV2MemberId2.a, managedDevicesV2MemberId2))) == null || (managedDevicesV2MemberId = this.Q) == null) {
            return;
        }
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        String strManagedDevicesV2MemberId_getUuidString = ManagedDevicesV2MemberSWIGJNI.ManagedDevicesV2MemberId_getUuidString(managedDevicesV2MemberId.a, managedDevicesV2MemberId);
        strManagedDevicesV2MemberId_getUuidString.getClass();
        String str = this.R;
        if (str == null) {
            im3.e0("groupUId");
            throw null;
        }
        dl4 dl4Var = new dl4();
        Bundle bundle = new Bundle();
        bundle.putSerializable("memberType", yl4VarA);
        bundle.putString("ManagedDeviceV2Id", strManagedDevicesV2MemberId_getUuidString);
        bundle.putString("GroupID", str);
        dl4Var.u0(bundle);
        this.I.x(dl4Var);
    }

    @Override // o.fl6
    public final void r(g1 g1Var, GroupMemberId groupMemberId, long j) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.fl6
    public final void s(qb3 qb3Var, ManagedDevicesV2MemberId managedDevicesV2MemberId, long j, String str) {
        str.getClass();
        this.P = qb3Var;
        this.Q = managedDevicesV2MemberId;
        this.R = str;
        Object[] objArr = 0;
        View view = this.m;
        final byte b = 1;
        if (qb3Var != null) {
            p1 p1Var = (p1) qb3Var;
            nw4 nw4Var = p1Var.s;
            ViewModelOnlineState viewModelOnlineState = (ViewModelOnlineState) nw4Var.getValue();
            int i = viewModelOnlineState == null ? -1 : wk4.a[viewModelOnlineState.ordinal()];
            int i2 = R.color.colorPartnerNameOnline;
            if (i != 1 && i != 2) {
                i2 = R.color.colorPartnerNameOffline;
            }
            this.J.setTextColor(view.getContext().getColor(i2));
            ViewModelOnlineState viewModelOnlineState2 = (ViewModelOnlineState) nw4Var.getValue();
            int i3 = viewModelOnlineState2 != null ? wk4.a[viewModelOnlineState2.ordinal()] : -1;
            int i4 = R.color.connectIconOnlineColor;
            if (i3 != 1 && i3 != 2) {
                i4 = R.color.connectIconOfflineColor;
            }
            this.L.setColorFilter(view.getContext().getColor(i4), PorterDuff.Mode.SRC_IN);
            t(qb3Var);
            nw4 nw4Var2 = p1Var.u;
            View view2 = this.G;
            Context context = view2.getContext();
            context.getClass();
            byte b2 = 17;
            nw4Var2.observe((LifecycleOwner) context, new b7(new tk4(qb3Var, this), b2));
            nw4 nw4Var3 = p1Var.z;
            Context context2 = view2.getContext();
            context2.getClass();
            nw4Var3.observe((LifecycleOwner) context2, new b7(new tk4(this, qb3Var), b2));
            Context context3 = view2.getContext();
            context3.getClass();
            final Object[] objArr2 = objArr == true ? 1 : 0;
            nw4Var.observe((LifecycleOwner) context3, new b7(new Function1(this) { // from class: o.uk4
                public final /* synthetic */ xk4 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object obj2;
                    String string;
                    Context context4;
                    bu7 bu7Var;
                    nw4 nw4Var4;
                    nw4 nw4Var5;
                    nw4 nw4Var6;
                    byte b3 = objArr2;
                    f88 f88Var = f88.a;
                    xk4 xk4Var = this.n;
                    switch (b3) {
                        case 0:
                            ViewModelOnlineState viewModelOnlineState3 = (ViewModelOnlineState) obj;
                            int i5 = viewModelOnlineState3 == null ? -1 : wk4.a[viewModelOnlineState3.ordinal()];
                            int i6 = R.color.connectIconOnlineColor;
                            if (i5 != 1 && i5 != 2) {
                                i6 = R.color.connectIconOfflineColor;
                            }
                            xk4Var.L.setColorFilter(xk4Var.m.getContext().getColor(i6), PorterDuff.Mode.SRC_IN);
                            xk4Var.t(xk4Var.P);
                            break;
                        default:
                            ud2 ud2Var = (ud2) obj;
                            if (ud2Var != null) {
                                String str2 = null;
                                if (ud2Var.b) {
                                    obj2 = null;
                                } else {
                                    ud2Var.b = true;
                                    obj2 = ud2Var.a;
                                }
                                qr4 qr4Var = (qr4) obj2;
                                if (qr4Var != null) {
                                    View view3 = xk4Var.G;
                                    int iOrdinal = qr4Var.ordinal();
                                    if (iOrdinal == 1) {
                                        Context context5 = view3.getContext();
                                        qb3 qb3Var2 = xk4Var.P;
                                        if (qb3Var2 != null && (nw4Var4 = ((p1) qb3Var2).f1692o) != null) {
                                            str2 = (String) nw4Var4.getValue();
                                        }
                                        string = context5.getString(R.string.tv_startingHostApp, str2);
                                        string.getClass();
                                        context4 = d82.M;
                                        if (context4 == null) {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        } else {
                                            bu7Var = bu7.MAIN;
                                            fx3.r(string, 1, context4, bu7Var);
                                        }
                                    } else if (iOrdinal == 2) {
                                        Context context6 = view3.getContext();
                                        qb3 qb3Var3 = xk4Var.P;
                                        if (qb3Var3 != null && (nw4Var5 = ((p1) qb3Var3).f1692o) != null) {
                                            str2 = (String) nw4Var5.getValue();
                                        }
                                        string = context6.getString(R.string.tv_hostAppStarted, str2);
                                        string.getClass();
                                        context4 = d82.M;
                                        if (context4 == null) {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        } else {
                                            bu7Var = bu7.MAIN;
                                            fx3.r(string, 1, context4, bu7Var);
                                        }
                                    } else if (iOrdinal == 3) {
                                        Context context7 = view3.getContext();
                                        qb3 qb3Var4 = xk4Var.P;
                                        if (qb3Var4 != null && (nw4Var6 = ((p1) qb3Var4).f1692o) != null) {
                                            str2 = (String) nw4Var6.getValue();
                                        }
                                        string = context7.getString(R.string.tv_startingHostAppTimeout, str2);
                                        string.getClass();
                                        context4 = d82.M;
                                        if (context4 == null) {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        } else {
                                            bu7Var = bu7.MAIN;
                                            fx3.r(string, 1, context4, bu7Var);
                                        }
                                    }
                                }
                            }
                            break;
                    }
                    return f88Var;
                }
            }, b2));
            nw4 nw4Var4 = ((xd0) qb3Var).E;
            Context context4 = view2.getContext();
            context4.getClass();
            nw4Var4.observe((LifecycleOwner) context4, new b7(new Function1(this) { // from class: o.uk4
                public final /* synthetic */ xk4 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object obj2;
                    String string;
                    Context context5;
                    bu7 bu7Var;
                    nw4 nw4Var5;
                    nw4 nw4Var6;
                    nw4 nw4Var7;
                    byte b3 = b;
                    f88 f88Var = f88.a;
                    xk4 xk4Var = this.n;
                    switch (b3) {
                        case 0:
                            ViewModelOnlineState viewModelOnlineState3 = (ViewModelOnlineState) obj;
                            int i5 = viewModelOnlineState3 == null ? -1 : wk4.a[viewModelOnlineState3.ordinal()];
                            int i6 = R.color.connectIconOnlineColor;
                            if (i5 != 1 && i5 != 2) {
                                i6 = R.color.connectIconOfflineColor;
                            }
                            xk4Var.L.setColorFilter(xk4Var.m.getContext().getColor(i6), PorterDuff.Mode.SRC_IN);
                            xk4Var.t(xk4Var.P);
                            break;
                        default:
                            ud2 ud2Var = (ud2) obj;
                            if (ud2Var != null) {
                                String str2 = null;
                                if (ud2Var.b) {
                                    obj2 = null;
                                } else {
                                    ud2Var.b = true;
                                    obj2 = ud2Var.a;
                                }
                                qr4 qr4Var = (qr4) obj2;
                                if (qr4Var != null) {
                                    View view3 = xk4Var.G;
                                    int iOrdinal = qr4Var.ordinal();
                                    if (iOrdinal == 1) {
                                        Context context6 = view3.getContext();
                                        qb3 qb3Var2 = xk4Var.P;
                                        if (qb3Var2 != null && (nw4Var5 = ((p1) qb3Var2).f1692o) != null) {
                                            str2 = (String) nw4Var5.getValue();
                                        }
                                        string = context6.getString(R.string.tv_startingHostApp, str2);
                                        string.getClass();
                                        context5 = d82.M;
                                        if (context5 == null) {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        } else {
                                            bu7Var = bu7.MAIN;
                                            fx3.r(string, 1, context5, bu7Var);
                                        }
                                    } else if (iOrdinal == 2) {
                                        Context context7 = view3.getContext();
                                        qb3 qb3Var3 = xk4Var.P;
                                        if (qb3Var3 != null && (nw4Var6 = ((p1) qb3Var3).f1692o) != null) {
                                            str2 = (String) nw4Var6.getValue();
                                        }
                                        string = context7.getString(R.string.tv_hostAppStarted, str2);
                                        string.getClass();
                                        context5 = d82.M;
                                        if (context5 == null) {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        } else {
                                            bu7Var = bu7.MAIN;
                                            fx3.r(string, 1, context5, bu7Var);
                                        }
                                    } else if (iOrdinal == 3) {
                                        Context context8 = view3.getContext();
                                        qb3 qb3Var4 = xk4Var.P;
                                        if (qb3Var4 != null && (nw4Var7 = ((p1) qb3Var4).f1692o) != null) {
                                            str2 = (String) nw4Var7.getValue();
                                        }
                                        string = context8.getString(R.string.tv_startingHostAppTimeout, str2);
                                        string.getClass();
                                        context5 = d82.M;
                                        if (context5 == null) {
                                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                        } else {
                                            bu7Var = bu7.MAIN;
                                            fx3.r(string, 1, context5, bu7Var);
                                        }
                                    }
                                }
                            }
                            break;
                    }
                    return f88Var;
                }
            }, b2));
        }
        view.setActivated(0 == j);
    }

    public final void t(qb3 qb3Var) {
        int i;
        if (qb3Var == null) {
            return;
        }
        p1 p1Var = (p1) qb3Var;
        if (p1Var.p.getValue() == el4.m) {
            this.M.setVisibility(8);
            ViewModelOnlineState viewModelOnlineState = (ViewModelOnlineState) p1Var.s.getValue();
            int i2 = viewModelOnlineState == null ? -1 : wk4.a[viewModelOnlineState.ordinal()];
            if (i2 != 1) {
                i = i2 != 2 ? R.drawable.device_with_offline_state : R.drawable.device_with_away_state;
            } else {
                i = R.drawable.device_with_online_state;
            }
            ImageView imageView = this.K;
            imageView.setImageResource(i);
            imageView.setVisibility(0);
        } else {
            ye4.a.b("ManagedDeviceV2ItemViewHolder", "Unsupported view model type.");
        }
        this.J.setText((CharSequence) p1Var.f1692o.getValue());
    }
}
