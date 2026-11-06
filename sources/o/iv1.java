package o;

import androidx.lifecycle.LiveData;
import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;
import com.teamviewer.remotecontrollib.swig.IDeviceOptionsViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class iv1 extends oe8 implements va3 {
    public final LiveData A;
    public final LiveData B;
    public final LiveData C;
    public final LiveData D;
    public final LiveData E;
    public final nw4 F;
    public final String G;
    public final long H;
    public final VoidSignalCallback I;
    public final io.sentry.android.core.u0 J;
    public final IDeviceOptionsViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g1 f1105o;
    public final v93 p;
    public final GroupMemberId q;
    public final t33 r;
    public final LicenseViewModel s;
    public final LiveData t;
    public final LiveData u;
    public final LiveData v;
    public final LiveData w;
    public final LiveData x;
    public final LiveData y;
    public final LiveData z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [o.gv1] */
    public iv1(IDeviceOptionsViewModel iDeviceOptionsViewModel, g1 g1Var, v93 v93Var, GroupMemberId groupMemberId, t33 t33Var, LicenseViewModel licenseViewModel) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        GroupMemberListElementViewModel groupMemberListElementViewModel = g1Var.n;
        Object objValueOf = Double.valueOf(0.0d);
        final byte b = 0;
        t33Var.getClass();
        this.n = iDeviceOptionsViewModel;
        this.f1105o = g1Var;
        this.p = v93Var;
        this.q = groupMemberId;
        this.r = t33Var;
        this.s = licenseViewModel;
        nw4 nw4VarE = v93Var != 0 ? v93Var.e() : null;
        x86 x86Var = w86.a;
        wt3 wt3VarB = x86Var.b(String.class);
        if (wt3VarB.o("")) {
            str = "";
        } else {
            Object obj = Boolean.FALSE;
            if (wt3VarB.o(obj)) {
                str = (String) obj;
            } else if (wt3VarB.o(0)) {
                str = (String) 0;
            } else if (wt3VarB.o(objValueOf)) {
                str = (String) objValueOf;
            } else {
                if (!wt3VarB.o(0L)) {
                    yq4.f();
                    throw null;
                }
                str = (String) 0L;
            }
        }
        this.t = nw4VarE == null ? new nw4(str) : nw4VarE;
        nw4 nw4VarG = v93Var != 0 ? v93Var.g() : null;
        wt3 wt3VarB2 = x86Var.b(String.class);
        if (wt3VarB2.o("")) {
            str2 = "";
        } else {
            Object obj2 = Boolean.FALSE;
            if (wt3VarB2.o(obj2)) {
                str2 = (String) obj2;
            } else if (wt3VarB2.o(0)) {
                str2 = (String) 0;
            } else if (wt3VarB2.o(objValueOf)) {
                str2 = (String) objValueOf;
            } else {
                if (!wt3VarB2.o(0L)) {
                    yq4.f();
                    throw null;
                }
                str2 = (String) 0L;
            }
        }
        this.u = nw4VarG == null ? new nw4(str2) : nw4VarG;
        nw4 nw4VarO = v93Var != 0 ? v93Var.o() : null;
        wt3 wt3VarB3 = x86Var.b(String.class);
        if (wt3VarB3.o("")) {
            str3 = "";
        } else {
            Object obj3 = Boolean.FALSE;
            if (wt3VarB3.o(obj3)) {
                str3 = (String) obj3;
            } else if (wt3VarB3.o(0)) {
                str3 = (String) 0;
            } else if (wt3VarB3.o(objValueOf)) {
                str3 = (String) objValueOf;
            } else {
                if (!wt3VarB3.o(0L)) {
                    yq4.f();
                    throw null;
                }
                str3 = (String) 0L;
            }
        }
        this.v = nw4VarO == null ? new nw4(str3) : nw4VarO;
        nw4 nw4VarF = v93Var != 0 ? v93Var.f() : null;
        wt3 wt3VarB4 = x86Var.b(String.class);
        if (wt3VarB4.o("")) {
            str4 = "";
        } else {
            Object obj4 = Boolean.FALSE;
            if (wt3VarB4.o(obj4)) {
                str4 = (String) obj4;
            } else if (wt3VarB4.o(0)) {
                str4 = (String) 0;
            } else if (wt3VarB4.o(objValueOf)) {
                str4 = (String) objValueOf;
            } else {
                if (!wt3VarB4.o(0L)) {
                    yq4.f();
                    throw null;
                }
                str4 = (String) 0L;
            }
        }
        this.w = nw4VarF == null ? new nw4(str4) : nw4VarF;
        nw4 nw4VarH = v93Var != 0 ? v93Var.h() : null;
        wt3 wt3VarB5 = x86Var.b(String.class);
        if (wt3VarB5.o("")) {
            str5 = "";
        } else {
            Object obj5 = Boolean.FALSE;
            if (wt3VarB5.o(obj5)) {
                str5 = (String) obj5;
            } else if (wt3VarB5.o(0)) {
                str5 = (String) 0;
            } else if (wt3VarB5.o(objValueOf)) {
                str5 = (String) objValueOf;
            } else {
                if (!wt3VarB5.o(0L)) {
                    yq4.f();
                    throw null;
                }
                str5 = (String) 0L;
            }
        }
        this.x = nw4VarH == null ? new nw4(str5) : nw4VarH;
        nw4 nw4VarL = v93Var != 0 ? v93Var.l() : null;
        wt3 wt3VarB6 = x86Var.b(Boolean.class);
        if (wt3VarB6.o("")) {
            bool = (Boolean) "";
        } else {
            Boolean bool8 = Boolean.FALSE;
            if (wt3VarB6.o(bool8)) {
                bool = bool8;
            } else if (wt3VarB6.o(0)) {
                bool = (Boolean) 0;
            } else if (wt3VarB6.o(objValueOf)) {
                bool = (Boolean) objValueOf;
            } else {
                if (!wt3VarB6.o(0L)) {
                    yq4.f();
                    throw null;
                }
                bool = (Boolean) 0L;
            }
        }
        this.y = nw4VarL == null ? new nw4(bool) : nw4VarL;
        nw4 nw4VarI = v93Var != 0 ? v93Var.i() : null;
        wt3 wt3VarB7 = x86Var.b(Boolean.class);
        if (wt3VarB7.o("")) {
            bool2 = (Boolean) "";
        } else {
            Boolean bool9 = Boolean.FALSE;
            if (wt3VarB7.o(bool9)) {
                bool2 = bool9;
            } else if (wt3VarB7.o(0)) {
                bool2 = (Boolean) 0;
            } else if (wt3VarB7.o(objValueOf)) {
                bool2 = (Boolean) objValueOf;
            } else {
                if (!wt3VarB7.o(0L)) {
                    yq4.f();
                    throw null;
                }
                bool2 = (Boolean) 0L;
            }
        }
        this.z = nw4VarI == null ? new nw4(bool2) : nw4VarI;
        nw4 nw4VarN = v93Var != 0 ? v93Var.n() : null;
        wt3 wt3VarB8 = x86Var.b(Boolean.class);
        if (wt3VarB8.o("")) {
            bool3 = (Boolean) "";
        } else {
            Boolean bool10 = Boolean.FALSE;
            if (wt3VarB8.o(bool10)) {
                bool3 = bool10;
            } else if (wt3VarB8.o(0)) {
                bool3 = (Boolean) 0;
            } else if (wt3VarB8.o(objValueOf)) {
                bool3 = (Boolean) objValueOf;
            } else {
                if (!wt3VarB8.o(0L)) {
                    yq4.f();
                    throw null;
                }
                bool3 = (Boolean) 0L;
            }
        }
        this.A = nw4VarN == null ? new nw4(bool3) : nw4VarN;
        nw4 nw4VarA = v93Var != 0 ? v93Var.a() : null;
        wt3 wt3VarB9 = x86Var.b(Boolean.class);
        if (wt3VarB9.o("")) {
            bool4 = (Boolean) "";
        } else {
            Boolean bool11 = Boolean.FALSE;
            if (wt3VarB9.o(bool11)) {
                bool4 = bool11;
            } else if (wt3VarB9.o(0)) {
                bool4 = (Boolean) 0;
            } else if (wt3VarB9.o(objValueOf)) {
                bool4 = (Boolean) objValueOf;
            } else {
                if (!wt3VarB9.o(0L)) {
                    yq4.f();
                    throw null;
                }
                bool4 = (Boolean) 0L;
            }
        }
        this.B = nw4VarA == null ? new nw4(bool4) : nw4VarA;
        nw4 nw4VarJ = v93Var != 0 ? v93Var.j() : null;
        wt3 wt3VarB10 = x86Var.b(Boolean.class);
        if (wt3VarB10.o("")) {
            bool5 = (Boolean) "";
        } else {
            Boolean bool12 = Boolean.FALSE;
            if (wt3VarB10.o(bool12)) {
                bool5 = bool12;
            } else if (wt3VarB10.o(0)) {
                bool5 = (Boolean) 0;
            } else if (wt3VarB10.o(objValueOf)) {
                bool5 = (Boolean) objValueOf;
            } else {
                if (!wt3VarB10.o(0L)) {
                    yq4.f();
                    throw null;
                }
                bool5 = (Boolean) 0L;
            }
        }
        this.C = nw4VarJ == null ? new nw4(bool5) : nw4VarJ;
        nw4 nw4VarB = v93Var != 0 ? v93Var.b() : null;
        wt3 wt3VarB11 = x86Var.b(Boolean.class);
        if (wt3VarB11.o("")) {
            bool6 = (Boolean) "";
        } else {
            Boolean bool13 = Boolean.FALSE;
            if (wt3VarB11.o(bool13)) {
                bool6 = bool13;
            } else if (wt3VarB11.o(0)) {
                bool6 = (Boolean) 0;
            } else if (wt3VarB11.o(objValueOf)) {
                bool6 = (Boolean) objValueOf;
            } else {
                if (!wt3VarB11.o(0L)) {
                    yq4.f();
                    throw null;
                }
                bool6 = (Boolean) 0L;
            }
        }
        this.D = nw4VarB == null ? new nw4(bool6) : nw4VarB;
        nw4 nw4VarD = v93Var != 0 ? v93Var.d() : null;
        wt3 wt3VarB12 = x86Var.b(Boolean.class);
        if (wt3VarB12.o("")) {
            bool7 = (Boolean) "";
        } else {
            bool7 = Boolean.FALSE;
            if (!wt3VarB12.o(bool7)) {
                if (wt3VarB12.o(0)) {
                    bool7 = (Boolean) 0;
                } else if (wt3VarB12.o(objValueOf)) {
                    bool7 = (Boolean) objValueOf;
                } else {
                    if (!wt3VarB12.o(0L)) {
                        yq4.f();
                        throw null;
                    }
                    bool7 = (Boolean) 0L;
                }
            }
        }
        this.E = nw4VarD == null ? new nw4(bool7) : nw4VarD;
        this.F = new nw4();
        String strGroupMemberListElementViewModel_GetName = GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetName(groupMemberListElementViewModel.a, groupMemberListElementViewModel);
        strGroupMemberListElementViewModel_GetName.getClass();
        this.G = strGroupMemberListElementViewModel_GetName;
        this.H = g1Var.a1();
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new Function0(this) { // from class: o.gv1
            public final /* synthetic */ iv1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                f88 f88Var = f88.a;
                iv1 iv1Var = this.n;
                switch (b2) {
                    case 0:
                        iv1Var.V0();
                        break;
                    default:
                        iv1Var.J.d();
                        break;
                }
                return f88Var;
            }
        });
        this.I = voidSignalCallback;
        this.J = new io.sentry.android.core.u0((byte) 5);
        V0();
        GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_RegisterForChanges(groupMemberListElementViewModel.a, groupMemberListElementViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        if (v93Var != 0) {
            final byte b2 = 1;
            v93Var.k(new Function0(this) { // from class: o.gv1
                public final /* synthetic */ iv1 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    byte b3 = b2;
                    f88 f88Var = f88.a;
                    iv1 iv1Var = this.n;
                    switch (b3) {
                        case 0:
                            iv1Var.V0();
                            break;
                        default:
                            iv1Var.J.d();
                            break;
                    }
                    return f88Var;
                }
            });
        }
    }

    @Override // o.oe8
    public final void U0() {
        this.I.Disconnect();
        this.n.a();
        this.s.a();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    public final void V0() {
        ua3 ua3Var = ua3.m;
        ua3 ua3Var2 = ua3.n;
        ua3 ua3Var3 = ua3.p;
        t33 t33Var = this.r;
        t33 t33Var2 = t33.m;
        g1 g1Var = this.f1105o;
        if (t33Var == t33Var2) {
            GroupMemberListElementViewModel groupMemberListElementViewModel = g1Var.n;
            ViewModelOnlineState viewModelOnlineStateSwigToEnum = ViewModelOnlineState.swigToEnum(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetOnlineState(groupMemberListElementViewModel.a, groupMemberListElementViewModel));
            viewModelOnlineStateSwigToEnum.getClass();
            int i = hv1.a[viewModelOnlineStateSwigToEnum.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ua3Var = ua3Var2;
                } else if (i != 3) {
                    ua3Var = ua3Var3;
                } else {
                    ua3Var = ua3.f2192o;
                }
            }
        } else {
            GroupMemberListElementViewModel groupMemberListElementViewModel2 = g1Var.n;
            if (!GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsOnline(groupMemberListElementViewModel2.a, groupMemberListElementViewModel2)) {
                GroupMemberListElementViewModel groupMemberListElementViewModel3 = g1Var.n;
                if (GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsMobileWakeActive(groupMemberListElementViewModel3.a, groupMemberListElementViewModel3)) {
                    ua3Var = ua3Var2;
                } else {
                    ua3Var = ua3Var3;
                }
            }
        }
        this.F.setValue(ua3Var);
    }
}
