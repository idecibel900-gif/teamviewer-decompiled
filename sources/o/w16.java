package o;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.LiveData;
import com.teamviewer.remotecontrollib.swig.ISessionToolbarViewModel;
import com.teamviewer.remotecontrollib.swig.ISessionToolbarViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class w16 extends uz7 implements nc3 {
    public final g95 s;
    public final g95 t;
    public final ISessionToolbarViewModel u;
    public final Resources v;
    public RCClientActivity w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w16(g95 g95Var, g95 g95Var2, ep3 ep3Var, ISessionToolbarViewModel iSessionToolbarViewModel, Resources resources) {
        byte b;
        final byte b2;
        byte b3;
        super(true);
        fp1 fp1Var = (fp1) ep3Var.n;
        final byte b4 = 1;
        this.s = g95Var;
        this.t = g95Var2;
        this.u = iSessionToolbarViewModel;
        this.v = resources;
        nw4 nw4Var = ((a2) ((wc3) g95Var2.m)).f283o.u;
        final byte b5 = 0;
        final byte b6 = 2;
        nm nmVar = new nm(2);
        nmVar.g(nw4Var);
        nmVar.i(new LiveData[0]);
        ArrayList arrayList = nmVar.a;
        LiveData[] liveDataArr = (LiveData[]) arrayList.toArray(new LiveData[arrayList.size()]);
        lo4 lo4Var = new lo4();
        v16 v16Var = new v16(lo4Var, liveDataArr, this, b4);
        v16Var.a();
        int length = liveDataArr.length;
        int i = 0;
        while (true) {
            b = 27;
            b2 = 3;
            if (i >= length) {
                break;
            }
            lo4Var.b(liveDataArr[i], new b7(new h16(v16Var, b2), b));
            i++;
        }
        Drawable drawable = (Drawable) lo4Var.getValue();
        if (drawable != null) {
            V0(new o16(0, new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_close)), new nw4(drawable), null, null, new Function0(this) { // from class: o.s16
                public final /* synthetic */ w16 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    Point point;
                    byte b7 = b5;
                    f88 f88Var = f88.a;
                    w16 w16Var = this.n;
                    switch (b7) {
                        case 0:
                            RCClientActivity rCClientActivity = w16Var.w;
                            if (rCClientActivity != null) {
                                rCClientActivity.V(new t16(w16Var));
                            }
                            break;
                        case 1:
                            g95 g95Var3 = w16Var.t;
                            g95Var3.getClass();
                            ye4.a("RemoteActionsUiModel", "Change monitor selected");
                            ec3 ec3Var = (wc3) g95Var3.m;
                            ha6 ha6Var = ((a2) ec3Var).f283o;
                            wk7 wk7VarI = ((eu6) ec3Var).i();
                            if (wk7VarI != null) {
                                Point point2 = wk7VarI.d;
                                int i2 = point2.x;
                                int i3 = point2.y;
                                ArrayList arrayList2 = ha6Var.r;
                                if (arrayList2 != null) {
                                }
                                int i4 = ha6Var.k + 1;
                                ha6Var.k = i4;
                                if (i4 >= ha6Var.l) {
                                    ha6Var.k = 0;
                                    i4 = 0;
                                }
                                ArrayList arrayList3 = ha6Var.r;
                                if (arrayList3 == null || (point = (Point) arrayList3.get(i4)) == null) {
                                    point = new Point(0, 0);
                                }
                                point2.x = point.x;
                                point2.y = point.y;
                                wk7VarI.e(0.0f, 0.0f);
                            }
                            ye4.a("RemoteSettings", "send change monitor :" + ha6Var.k);
                            bk7 bk7Var = bk7.TVCmdSelectMonitor;
                            a2 a2Var = ha6Var.a;
                            ParticipantIdentifier participantIdentifierA = a2Var.r.a();
                            ak7 ak7Var = new ak7(bk7Var);
                            ak7Var.z(KnownStreams.PrivateStream);
                            ak7Var.B(participantIdentifierA);
                            ak7Var.d(pj7.m, ha6Var.k);
                            a2Var.f(ak7Var, false);
                            ISessionToolbarViewModel iSessionToolbarViewModel2 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                            break;
                        case 2:
                            RCClientActivity rCClientActivity2 = w16Var.w;
                            if (rCClientActivity2 != null) {
                                rCClientActivity2.Q();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel3 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                            break;
                        case 3:
                            RCClientActivity rCClientActivity3 = w16Var.w;
                            if (rCClientActivity3 != null) {
                                rCClientActivity3.W(new t16(w16Var));
                            }
                            break;
                        case 4:
                            RCClientActivity rCClientActivity4 = w16Var.w;
                            if (rCClientActivity4 != null) {
                                new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                                lc3 lc3Var = rCClientActivity4.P;
                                if (lc3Var != null) {
                                    lc3Var.H();
                                }
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel4 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 7);
                            break;
                        case 5:
                            RCClientActivity rCClientActivity5 = w16Var.w;
                            if (rCClientActivity5 != null) {
                                new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                                lc3 lc3Var2 = rCClientActivity5.P;
                                if (lc3Var2 != null) {
                                    lc3Var2.H();
                                }
                                lc3 lc3Var3 = rCClientActivity5.P;
                                if (lc3Var3 != null) {
                                    lc3Var3.z();
                                }
                            }
                            break;
                        case 6:
                            RCClientActivity rCClientActivity6 = w16Var.w;
                            if (rCClientActivity6 != null) {
                                rCClientActivity6.X();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel5 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 8);
                            break;
                        default:
                            RCClientActivity rCClientActivity7 = w16Var.w;
                            if (rCClientActivity7 != null) {
                                rCClientActivity7.K();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel6 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 9);
                            break;
                    }
                    return f88Var;
                }
            }, 56));
        }
        Resources resources2 = this.v;
        ThreadLocal threadLocal = ic6.a;
        Drawable drawable2 = resources2.getDrawable(R.drawable.stoolbar_next_monitor, null);
        if (drawable2 != null) {
            V0(new o16(1, new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_next_monitor)), new nw4(drawable2), ((a2) ((wc3) this.t.m)).f283o.m, null, new Function0(this) { // from class: o.s16
                public final /* synthetic */ w16 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    Point point;
                    byte b7 = b4;
                    f88 f88Var = f88.a;
                    w16 w16Var = this.n;
                    switch (b7) {
                        case 0:
                            RCClientActivity rCClientActivity = w16Var.w;
                            if (rCClientActivity != null) {
                                rCClientActivity.V(new t16(w16Var));
                            }
                            break;
                        case 1:
                            g95 g95Var3 = w16Var.t;
                            g95Var3.getClass();
                            ye4.a("RemoteActionsUiModel", "Change monitor selected");
                            ec3 ec3Var = (wc3) g95Var3.m;
                            ha6 ha6Var = ((a2) ec3Var).f283o;
                            wk7 wk7VarI = ((eu6) ec3Var).i();
                            if (wk7VarI != null) {
                                Point point2 = wk7VarI.d;
                                int i2 = point2.x;
                                int i3 = point2.y;
                                ArrayList arrayList2 = ha6Var.r;
                                if (arrayList2 != null) {
                                }
                                int i4 = ha6Var.k + 1;
                                ha6Var.k = i4;
                                if (i4 >= ha6Var.l) {
                                    ha6Var.k = 0;
                                    i4 = 0;
                                }
                                ArrayList arrayList3 = ha6Var.r;
                                if (arrayList3 == null || (point = (Point) arrayList3.get(i4)) == null) {
                                    point = new Point(0, 0);
                                }
                                point2.x = point.x;
                                point2.y = point.y;
                                wk7VarI.e(0.0f, 0.0f);
                            }
                            ye4.a("RemoteSettings", "send change monitor :" + ha6Var.k);
                            bk7 bk7Var = bk7.TVCmdSelectMonitor;
                            a2 a2Var = ha6Var.a;
                            ParticipantIdentifier participantIdentifierA = a2Var.r.a();
                            ak7 ak7Var = new ak7(bk7Var);
                            ak7Var.z(KnownStreams.PrivateStream);
                            ak7Var.B(participantIdentifierA);
                            ak7Var.d(pj7.m, ha6Var.k);
                            a2Var.f(ak7Var, false);
                            ISessionToolbarViewModel iSessionToolbarViewModel2 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                            break;
                        case 2:
                            RCClientActivity rCClientActivity2 = w16Var.w;
                            if (rCClientActivity2 != null) {
                                rCClientActivity2.Q();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel3 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                            break;
                        case 3:
                            RCClientActivity rCClientActivity3 = w16Var.w;
                            if (rCClientActivity3 != null) {
                                rCClientActivity3.W(new t16(w16Var));
                            }
                            break;
                        case 4:
                            RCClientActivity rCClientActivity4 = w16Var.w;
                            if (rCClientActivity4 != null) {
                                new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                                lc3 lc3Var = rCClientActivity4.P;
                                if (lc3Var != null) {
                                    lc3Var.H();
                                }
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel4 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 7);
                            break;
                        case 5:
                            RCClientActivity rCClientActivity5 = w16Var.w;
                            if (rCClientActivity5 != null) {
                                new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                                lc3 lc3Var2 = rCClientActivity5.P;
                                if (lc3Var2 != null) {
                                    lc3Var2.H();
                                }
                                lc3 lc3Var3 = rCClientActivity5.P;
                                if (lc3Var3 != null) {
                                    lc3Var3.z();
                                }
                            }
                            break;
                        case 6:
                            RCClientActivity rCClientActivity6 = w16Var.w;
                            if (rCClientActivity6 != null) {
                                rCClientActivity6.X();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel5 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 8);
                            break;
                        default:
                            RCClientActivity rCClientActivity7 = w16Var.w;
                            if (rCClientActivity7 != null) {
                                rCClientActivity7.K();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel6 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 9);
                            break;
                    }
                    return f88Var;
                }
            }, 112));
        }
        Drawable drawable3 = this.v.getDrawable(R.drawable.stoolbar_keyboard, null);
        if (drawable3 != null) {
            V0(new o16(2, new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_keyboard)), new nw4(drawable3), null, new nw4(Boolean.valueOf(im3.n(this.s.U().getValue(), Boolean.TRUE))), new Function0(this) { // from class: o.s16
                public final /* synthetic */ w16 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    Point point;
                    byte b7 = b6;
                    f88 f88Var = f88.a;
                    w16 w16Var = this.n;
                    switch (b7) {
                        case 0:
                            RCClientActivity rCClientActivity = w16Var.w;
                            if (rCClientActivity != null) {
                                rCClientActivity.V(new t16(w16Var));
                            }
                            break;
                        case 1:
                            g95 g95Var3 = w16Var.t;
                            g95Var3.getClass();
                            ye4.a("RemoteActionsUiModel", "Change monitor selected");
                            ec3 ec3Var = (wc3) g95Var3.m;
                            ha6 ha6Var = ((a2) ec3Var).f283o;
                            wk7 wk7VarI = ((eu6) ec3Var).i();
                            if (wk7VarI != null) {
                                Point point2 = wk7VarI.d;
                                int i2 = point2.x;
                                int i3 = point2.y;
                                ArrayList arrayList2 = ha6Var.r;
                                if (arrayList2 != null) {
                                }
                                int i4 = ha6Var.k + 1;
                                ha6Var.k = i4;
                                if (i4 >= ha6Var.l) {
                                    ha6Var.k = 0;
                                    i4 = 0;
                                }
                                ArrayList arrayList3 = ha6Var.r;
                                if (arrayList3 == null || (point = (Point) arrayList3.get(i4)) == null) {
                                    point = new Point(0, 0);
                                }
                                point2.x = point.x;
                                point2.y = point.y;
                                wk7VarI.e(0.0f, 0.0f);
                            }
                            ye4.a("RemoteSettings", "send change monitor :" + ha6Var.k);
                            bk7 bk7Var = bk7.TVCmdSelectMonitor;
                            a2 a2Var = ha6Var.a;
                            ParticipantIdentifier participantIdentifierA = a2Var.r.a();
                            ak7 ak7Var = new ak7(bk7Var);
                            ak7Var.z(KnownStreams.PrivateStream);
                            ak7Var.B(participantIdentifierA);
                            ak7Var.d(pj7.m, ha6Var.k);
                            a2Var.f(ak7Var, false);
                            ISessionToolbarViewModel iSessionToolbarViewModel2 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                            break;
                        case 2:
                            RCClientActivity rCClientActivity2 = w16Var.w;
                            if (rCClientActivity2 != null) {
                                rCClientActivity2.Q();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel3 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                            break;
                        case 3:
                            RCClientActivity rCClientActivity3 = w16Var.w;
                            if (rCClientActivity3 != null) {
                                rCClientActivity3.W(new t16(w16Var));
                            }
                            break;
                        case 4:
                            RCClientActivity rCClientActivity4 = w16Var.w;
                            if (rCClientActivity4 != null) {
                                new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                                lc3 lc3Var = rCClientActivity4.P;
                                if (lc3Var != null) {
                                    lc3Var.H();
                                }
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel4 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 7);
                            break;
                        case 5:
                            RCClientActivity rCClientActivity5 = w16Var.w;
                            if (rCClientActivity5 != null) {
                                new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                                lc3 lc3Var2 = rCClientActivity5.P;
                                if (lc3Var2 != null) {
                                    lc3Var2.H();
                                }
                                lc3 lc3Var3 = rCClientActivity5.P;
                                if (lc3Var3 != null) {
                                    lc3Var3.z();
                                }
                            }
                            break;
                        case 6:
                            RCClientActivity rCClientActivity6 = w16Var.w;
                            if (rCClientActivity6 != null) {
                                rCClientActivity6.X();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel5 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 8);
                            break;
                        default:
                            RCClientActivity rCClientActivity7 = w16Var.w;
                            if (rCClientActivity7 != null) {
                                rCClientActivity7.K();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel6 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 9);
                            break;
                    }
                    return f88Var;
                }
            }, 104));
        }
        nw4 nw4Var2 = new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_input_method));
        yd2 yd2Var = (yd2) fp1Var.g;
        nm nmVar2 = new nm(2);
        nmVar2.g(yd2Var);
        nmVar2.i(new LiveData[0]);
        ArrayList arrayList2 = nmVar2.a;
        LiveData[] liveDataArr2 = (LiveData[]) arrayList2.toArray(new LiveData[arrayList2.size()]);
        lo4 lo4Var2 = new lo4();
        v16 v16Var2 = new v16(lo4Var2, liveDataArr2, this, b5);
        v16Var2.a();
        int length2 = liveDataArr2.length;
        int i2 = 0;
        while (i2 < length2) {
            lo4Var2.b(liveDataArr2[i2], new b7(new h16(v16Var2, b6), b));
            i2++;
            b6 = 2;
        }
        V0(new o16(3, nw4Var2, lo4Var2, new nw4(Boolean.TRUE), null, new Function0(this) { // from class: o.s16
            public final /* synthetic */ w16 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                Point point;
                byte b7 = b2;
                f88 f88Var = f88.a;
                w16 w16Var = this.n;
                switch (b7) {
                    case 0:
                        RCClientActivity rCClientActivity = w16Var.w;
                        if (rCClientActivity != null) {
                            rCClientActivity.V(new t16(w16Var));
                        }
                        break;
                    case 1:
                        g95 g95Var3 = w16Var.t;
                        g95Var3.getClass();
                        ye4.a("RemoteActionsUiModel", "Change monitor selected");
                        ec3 ec3Var = (wc3) g95Var3.m;
                        ha6 ha6Var = ((a2) ec3Var).f283o;
                        wk7 wk7VarI = ((eu6) ec3Var).i();
                        if (wk7VarI != null) {
                            Point point2 = wk7VarI.d;
                            int i3 = point2.x;
                            int i4 = point2.y;
                            ArrayList arrayList3 = ha6Var.r;
                            if (arrayList3 != null) {
                            }
                            int i5 = ha6Var.k + 1;
                            ha6Var.k = i5;
                            if (i5 >= ha6Var.l) {
                                ha6Var.k = 0;
                                i5 = 0;
                            }
                            ArrayList arrayList4 = ha6Var.r;
                            if (arrayList4 == null || (point = (Point) arrayList4.get(i5)) == null) {
                                point = new Point(0, 0);
                            }
                            point2.x = point.x;
                            point2.y = point.y;
                            wk7VarI.e(0.0f, 0.0f);
                        }
                        ye4.a("RemoteSettings", "send change monitor :" + ha6Var.k);
                        bk7 bk7Var = bk7.TVCmdSelectMonitor;
                        a2 a2Var = ha6Var.a;
                        ParticipantIdentifier participantIdentifierA = a2Var.r.a();
                        ak7 ak7Var = new ak7(bk7Var);
                        ak7Var.z(KnownStreams.PrivateStream);
                        ak7Var.B(participantIdentifierA);
                        ak7Var.d(pj7.m, ha6Var.k);
                        a2Var.f(ak7Var, false);
                        ISessionToolbarViewModel iSessionToolbarViewModel2 = w16Var.u;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                        break;
                    case 2:
                        RCClientActivity rCClientActivity2 = w16Var.w;
                        if (rCClientActivity2 != null) {
                            rCClientActivity2.Q();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel3 = w16Var.u;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                        break;
                    case 3:
                        RCClientActivity rCClientActivity3 = w16Var.w;
                        if (rCClientActivity3 != null) {
                            rCClientActivity3.W(new t16(w16Var));
                        }
                        break;
                    case 4:
                        RCClientActivity rCClientActivity4 = w16Var.w;
                        if (rCClientActivity4 != null) {
                            new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                            lc3 lc3Var = rCClientActivity4.P;
                            if (lc3Var != null) {
                                lc3Var.H();
                            }
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel4 = w16Var.u;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 7);
                        break;
                    case 5:
                        RCClientActivity rCClientActivity5 = w16Var.w;
                        if (rCClientActivity5 != null) {
                            new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                            lc3 lc3Var2 = rCClientActivity5.P;
                            if (lc3Var2 != null) {
                                lc3Var2.H();
                            }
                            lc3 lc3Var3 = rCClientActivity5.P;
                            if (lc3Var3 != null) {
                                lc3Var3.z();
                            }
                        }
                        break;
                    case 6:
                        RCClientActivity rCClientActivity6 = w16Var.w;
                        if (rCClientActivity6 != null) {
                            rCClientActivity6.X();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel5 = w16Var.u;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 8);
                        break;
                    default:
                        RCClientActivity rCClientActivity7 = w16Var.w;
                        if (rCClientActivity7 != null) {
                            rCClientActivity7.K();
                        }
                        ISessionToolbarViewModel iSessionToolbarViewModel6 = w16Var.u;
                        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 9);
                        break;
                }
                return f88Var;
            }
        }, 112));
        Drawable drawable4 = this.v.getDrawable(R.drawable.stoolbar_request_control, null);
        final byte b7 = 4;
        if (drawable4 != null) {
            nw4 nw4Var3 = new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_requestControl));
            nw4 nw4Var4 = new nw4(drawable4);
            k3 k3VarW = iq8.w(((a2) ((wc3) fp1Var.a)).q, vi8.RemoteControlAccess);
            nm nmVar3 = new nm(2);
            nmVar3.g(k3VarW);
            nmVar3.i(new LiveData[0]);
            ArrayList arrayList3 = nmVar3.a;
            LiveData[] liveDataArr3 = (LiveData[]) arrayList3.toArray(new LiveData[arrayList3.size()]);
            lo4 lo4Var3 = new lo4();
            c7 c7Var = new c7(lo4Var3, liveDataArr3, b7);
            c7Var.a();
            int length3 = liveDataArr3.length;
            int i3 = 0;
            while (i3 < length3) {
                lo4Var3.b(liveDataArr3[i3], new b7(new h16(c7Var, (byte) 1), (byte) 24));
                i3++;
                b2 = b2;
            }
            b3 = b2;
            V0(new o16(4, nw4Var3, nw4Var4, lo4Var3, null, new ql1(ep3Var, this, (byte) 29), 112));
        } else {
            b3 = 3;
        }
        Drawable drawable5 = this.v.getDrawable(R.drawable.stoolbar_tools, null);
        if (drawable5 != null) {
            nw4 nw4Var5 = new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_settings));
            nw4 nw4Var6 = new nw4(drawable5);
            lo4 lo4VarU = this.s.U();
            g95 g95Var3 = this.t;
            ec3 ec3Var = (wc3) g95Var3.m;
            nw4 nw4Var7 = ((a2) ec3Var).p.e;
            nw4 nw4Var8 = ((a2) ec3Var).p.f;
            nw4 nw4Var9 = ((a2) ec3Var).p.h;
            nw4 nw4VarP = g95Var3.P();
            LiveData[] liveDataArr4 = new LiveData[4];
            liveDataArr4[0] = nw4Var7;
            liveDataArr4[1] = nw4Var8;
            liveDataArr4[2] = nw4Var9;
            liveDataArr4[b3] = nw4VarP;
            V0(new o16(5, nw4Var5, nw4Var6, qf0.o(lo4VarU, qf0.I(liveDataArr4)), null, new Function0(this) { // from class: o.s16
                public final /* synthetic */ w16 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    Point point;
                    byte b8 = b7;
                    f88 f88Var = f88.a;
                    w16 w16Var = this.n;
                    switch (b8) {
                        case 0:
                            RCClientActivity rCClientActivity = w16Var.w;
                            if (rCClientActivity != null) {
                                rCClientActivity.V(new t16(w16Var));
                            }
                            break;
                        case 1:
                            g95 g95Var4 = w16Var.t;
                            g95Var4.getClass();
                            ye4.a("RemoteActionsUiModel", "Change monitor selected");
                            ec3 ec3Var2 = (wc3) g95Var4.m;
                            ha6 ha6Var = ((a2) ec3Var2).f283o;
                            wk7 wk7VarI = ((eu6) ec3Var2).i();
                            if (wk7VarI != null) {
                                Point point2 = wk7VarI.d;
                                int i4 = point2.x;
                                int i5 = point2.y;
                                ArrayList arrayList4 = ha6Var.r;
                                if (arrayList4 != null) {
                                }
                                int i6 = ha6Var.k + 1;
                                ha6Var.k = i6;
                                if (i6 >= ha6Var.l) {
                                    ha6Var.k = 0;
                                    i6 = 0;
                                }
                                ArrayList arrayList5 = ha6Var.r;
                                if (arrayList5 == null || (point = (Point) arrayList5.get(i6)) == null) {
                                    point = new Point(0, 0);
                                }
                                point2.x = point.x;
                                point2.y = point.y;
                                wk7VarI.e(0.0f, 0.0f);
                            }
                            ye4.a("RemoteSettings", "send change monitor :" + ha6Var.k);
                            bk7 bk7Var = bk7.TVCmdSelectMonitor;
                            a2 a2Var = ha6Var.a;
                            ParticipantIdentifier participantIdentifierA = a2Var.r.a();
                            ak7 ak7Var = new ak7(bk7Var);
                            ak7Var.z(KnownStreams.PrivateStream);
                            ak7Var.B(participantIdentifierA);
                            ak7Var.d(pj7.m, ha6Var.k);
                            a2Var.f(ak7Var, false);
                            ISessionToolbarViewModel iSessionToolbarViewModel2 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                            break;
                        case 2:
                            RCClientActivity rCClientActivity2 = w16Var.w;
                            if (rCClientActivity2 != null) {
                                rCClientActivity2.Q();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel3 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                            break;
                        case 3:
                            RCClientActivity rCClientActivity3 = w16Var.w;
                            if (rCClientActivity3 != null) {
                                rCClientActivity3.W(new t16(w16Var));
                            }
                            break;
                        case 4:
                            RCClientActivity rCClientActivity4 = w16Var.w;
                            if (rCClientActivity4 != null) {
                                new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                                lc3 lc3Var = rCClientActivity4.P;
                                if (lc3Var != null) {
                                    lc3Var.H();
                                }
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel4 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 7);
                            break;
                        case 5:
                            RCClientActivity rCClientActivity5 = w16Var.w;
                            if (rCClientActivity5 != null) {
                                new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                                lc3 lc3Var2 = rCClientActivity5.P;
                                if (lc3Var2 != null) {
                                    lc3Var2.H();
                                }
                                lc3 lc3Var3 = rCClientActivity5.P;
                                if (lc3Var3 != null) {
                                    lc3Var3.z();
                                }
                            }
                            break;
                        case 6:
                            RCClientActivity rCClientActivity6 = w16Var.w;
                            if (rCClientActivity6 != null) {
                                rCClientActivity6.X();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel5 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 8);
                            break;
                        default:
                            RCClientActivity rCClientActivity7 = w16Var.w;
                            if (rCClientActivity7 != null) {
                                rCClientActivity7.K();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel6 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 9);
                            break;
                    }
                    return f88Var;
                }
            }, 112));
        }
        Drawable drawable6 = this.v.getDrawable(R.drawable.predefined_shortcuts_toolbar_icon, null);
        if (drawable6 != null) {
            nw4 nw4Var10 = new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_long_press_title_shortcuts));
            nw4 nw4Var11 = new nw4(drawable6);
            final byte b8 = 5;
            V0(new o16(8, nw4Var10, nw4Var11, null, null, new Function0(this) { // from class: o.s16
                public final /* synthetic */ w16 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    Point point;
                    byte b9 = b8;
                    f88 f88Var = f88.a;
                    w16 w16Var = this.n;
                    switch (b9) {
                        case 0:
                            RCClientActivity rCClientActivity = w16Var.w;
                            if (rCClientActivity != null) {
                                rCClientActivity.V(new t16(w16Var));
                            }
                            break;
                        case 1:
                            g95 g95Var4 = w16Var.t;
                            g95Var4.getClass();
                            ye4.a("RemoteActionsUiModel", "Change monitor selected");
                            ec3 ec3Var2 = (wc3) g95Var4.m;
                            ha6 ha6Var = ((a2) ec3Var2).f283o;
                            wk7 wk7VarI = ((eu6) ec3Var2).i();
                            if (wk7VarI != null) {
                                Point point2 = wk7VarI.d;
                                int i4 = point2.x;
                                int i5 = point2.y;
                                ArrayList arrayList4 = ha6Var.r;
                                if (arrayList4 != null) {
                                }
                                int i6 = ha6Var.k + 1;
                                ha6Var.k = i6;
                                if (i6 >= ha6Var.l) {
                                    ha6Var.k = 0;
                                    i6 = 0;
                                }
                                ArrayList arrayList5 = ha6Var.r;
                                if (arrayList5 == null || (point = (Point) arrayList5.get(i6)) == null) {
                                    point = new Point(0, 0);
                                }
                                point2.x = point.x;
                                point2.y = point.y;
                                wk7VarI.e(0.0f, 0.0f);
                            }
                            ye4.a("RemoteSettings", "send change monitor :" + ha6Var.k);
                            bk7 bk7Var = bk7.TVCmdSelectMonitor;
                            a2 a2Var = ha6Var.a;
                            ParticipantIdentifier participantIdentifierA = a2Var.r.a();
                            ak7 ak7Var = new ak7(bk7Var);
                            ak7Var.z(KnownStreams.PrivateStream);
                            ak7Var.B(participantIdentifierA);
                            ak7Var.d(pj7.m, ha6Var.k);
                            a2Var.f(ak7Var, false);
                            ISessionToolbarViewModel iSessionToolbarViewModel2 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                            break;
                        case 2:
                            RCClientActivity rCClientActivity2 = w16Var.w;
                            if (rCClientActivity2 != null) {
                                rCClientActivity2.Q();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel3 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                            break;
                        case 3:
                            RCClientActivity rCClientActivity3 = w16Var.w;
                            if (rCClientActivity3 != null) {
                                rCClientActivity3.W(new t16(w16Var));
                            }
                            break;
                        case 4:
                            RCClientActivity rCClientActivity4 = w16Var.w;
                            if (rCClientActivity4 != null) {
                                new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                                lc3 lc3Var = rCClientActivity4.P;
                                if (lc3Var != null) {
                                    lc3Var.H();
                                }
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel4 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 7);
                            break;
                        case 5:
                            RCClientActivity rCClientActivity5 = w16Var.w;
                            if (rCClientActivity5 != null) {
                                new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                                lc3 lc3Var2 = rCClientActivity5.P;
                                if (lc3Var2 != null) {
                                    lc3Var2.H();
                                }
                                lc3 lc3Var3 = rCClientActivity5.P;
                                if (lc3Var3 != null) {
                                    lc3Var3.z();
                                }
                            }
                            break;
                        case 6:
                            RCClientActivity rCClientActivity6 = w16Var.w;
                            if (rCClientActivity6 != null) {
                                rCClientActivity6.X();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel5 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 8);
                            break;
                        default:
                            RCClientActivity rCClientActivity7 = w16Var.w;
                            if (rCClientActivity7 != null) {
                                rCClientActivity7.K();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel6 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 9);
                            break;
                    }
                    return f88Var;
                }
            }, 120));
        }
        Drawable drawable7 = this.v.getDrawable(R.drawable.stoolbar_settings, null);
        if (drawable7 != null) {
            nw4 nw4Var12 = new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_options));
            nw4 nw4Var13 = new nw4(drawable7);
            final byte b9 = 6;
            V0(new o16(6, nw4Var12, nw4Var13, null, null, new Function0(this) { // from class: o.s16
                public final /* synthetic */ w16 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    Point point;
                    byte b10 = b9;
                    f88 f88Var = f88.a;
                    w16 w16Var = this.n;
                    switch (b10) {
                        case 0:
                            RCClientActivity rCClientActivity = w16Var.w;
                            if (rCClientActivity != null) {
                                rCClientActivity.V(new t16(w16Var));
                            }
                            break;
                        case 1:
                            g95 g95Var4 = w16Var.t;
                            g95Var4.getClass();
                            ye4.a("RemoteActionsUiModel", "Change monitor selected");
                            ec3 ec3Var2 = (wc3) g95Var4.m;
                            ha6 ha6Var = ((a2) ec3Var2).f283o;
                            wk7 wk7VarI = ((eu6) ec3Var2).i();
                            if (wk7VarI != null) {
                                Point point2 = wk7VarI.d;
                                int i4 = point2.x;
                                int i5 = point2.y;
                                ArrayList arrayList4 = ha6Var.r;
                                if (arrayList4 != null) {
                                }
                                int i6 = ha6Var.k + 1;
                                ha6Var.k = i6;
                                if (i6 >= ha6Var.l) {
                                    ha6Var.k = 0;
                                    i6 = 0;
                                }
                                ArrayList arrayList5 = ha6Var.r;
                                if (arrayList5 == null || (point = (Point) arrayList5.get(i6)) == null) {
                                    point = new Point(0, 0);
                                }
                                point2.x = point.x;
                                point2.y = point.y;
                                wk7VarI.e(0.0f, 0.0f);
                            }
                            ye4.a("RemoteSettings", "send change monitor :" + ha6Var.k);
                            bk7 bk7Var = bk7.TVCmdSelectMonitor;
                            a2 a2Var = ha6Var.a;
                            ParticipantIdentifier participantIdentifierA = a2Var.r.a();
                            ak7 ak7Var = new ak7(bk7Var);
                            ak7Var.z(KnownStreams.PrivateStream);
                            ak7Var.B(participantIdentifierA);
                            ak7Var.d(pj7.m, ha6Var.k);
                            a2Var.f(ak7Var, false);
                            ISessionToolbarViewModel iSessionToolbarViewModel2 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                            break;
                        case 2:
                            RCClientActivity rCClientActivity2 = w16Var.w;
                            if (rCClientActivity2 != null) {
                                rCClientActivity2.Q();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel3 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                            break;
                        case 3:
                            RCClientActivity rCClientActivity3 = w16Var.w;
                            if (rCClientActivity3 != null) {
                                rCClientActivity3.W(new t16(w16Var));
                            }
                            break;
                        case 4:
                            RCClientActivity rCClientActivity4 = w16Var.w;
                            if (rCClientActivity4 != null) {
                                new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                                lc3 lc3Var = rCClientActivity4.P;
                                if (lc3Var != null) {
                                    lc3Var.H();
                                }
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel4 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 7);
                            break;
                        case 5:
                            RCClientActivity rCClientActivity5 = w16Var.w;
                            if (rCClientActivity5 != null) {
                                new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                                lc3 lc3Var2 = rCClientActivity5.P;
                                if (lc3Var2 != null) {
                                    lc3Var2.H();
                                }
                                lc3 lc3Var3 = rCClientActivity5.P;
                                if (lc3Var3 != null) {
                                    lc3Var3.z();
                                }
                            }
                            break;
                        case 6:
                            RCClientActivity rCClientActivity6 = w16Var.w;
                            if (rCClientActivity6 != null) {
                                rCClientActivity6.X();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel5 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 8);
                            break;
                        default:
                            RCClientActivity rCClientActivity7 = w16Var.w;
                            if (rCClientActivity7 != null) {
                                rCClientActivity7.K();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel6 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 9);
                            break;
                    }
                    return f88Var;
                }
            }, 120));
        }
        Drawable drawable8 = this.v.getDrawable(R.drawable.stoolbar_hidetoolbar, null);
        if (drawable8 != null) {
            nw4 nw4Var14 = new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_hidetoolbar));
            nw4 nw4Var15 = new nw4(drawable8);
            final byte b10 = 7;
            V0(new o16(7, nw4Var14, nw4Var15, null, null, new Function0(this) { // from class: o.s16
                public final /* synthetic */ w16 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    Point point;
                    byte b11 = b10;
                    f88 f88Var = f88.a;
                    w16 w16Var = this.n;
                    switch (b11) {
                        case 0:
                            RCClientActivity rCClientActivity = w16Var.w;
                            if (rCClientActivity != null) {
                                rCClientActivity.V(new t16(w16Var));
                            }
                            break;
                        case 1:
                            g95 g95Var4 = w16Var.t;
                            g95Var4.getClass();
                            ye4.a("RemoteActionsUiModel", "Change monitor selected");
                            ec3 ec3Var2 = (wc3) g95Var4.m;
                            ha6 ha6Var = ((a2) ec3Var2).f283o;
                            wk7 wk7VarI = ((eu6) ec3Var2).i();
                            if (wk7VarI != null) {
                                Point point2 = wk7VarI.d;
                                int i4 = point2.x;
                                int i5 = point2.y;
                                ArrayList arrayList4 = ha6Var.r;
                                if (arrayList4 != null) {
                                }
                                int i6 = ha6Var.k + 1;
                                ha6Var.k = i6;
                                if (i6 >= ha6Var.l) {
                                    ha6Var.k = 0;
                                    i6 = 0;
                                }
                                ArrayList arrayList5 = ha6Var.r;
                                if (arrayList5 == null || (point = (Point) arrayList5.get(i6)) == null) {
                                    point = new Point(0, 0);
                                }
                                point2.x = point.x;
                                point2.y = point.y;
                                wk7VarI.e(0.0f, 0.0f);
                            }
                            ye4.a("RemoteSettings", "send change monitor :" + ha6Var.k);
                            bk7 bk7Var = bk7.TVCmdSelectMonitor;
                            a2 a2Var = ha6Var.a;
                            ParticipantIdentifier participantIdentifierA = a2Var.r.a();
                            ak7 ak7Var = new ak7(bk7Var);
                            ak7Var.z(KnownStreams.PrivateStream);
                            ak7Var.B(participantIdentifierA);
                            ak7Var.d(pj7.m, ha6Var.k);
                            a2Var.f(ak7Var, false);
                            ISessionToolbarViewModel iSessionToolbarViewModel2 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel2.a, iSessionToolbarViewModel2, 2);
                            break;
                        case 2:
                            RCClientActivity rCClientActivity2 = w16Var.w;
                            if (rCClientActivity2 != null) {
                                rCClientActivity2.Q();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel3 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel3.a, iSessionToolbarViewModel3, 3);
                            break;
                        case 3:
                            RCClientActivity rCClientActivity3 = w16Var.w;
                            if (rCClientActivity3 != null) {
                                rCClientActivity3.W(new t16(w16Var));
                            }
                            break;
                        case 4:
                            RCClientActivity rCClientActivity4 = w16Var.w;
                            if (rCClientActivity4 != null) {
                                new az5().E0(rCClientActivity4.D(), "QuickActionBottomSheetDialogFragment");
                                lc3 lc3Var = rCClientActivity4.P;
                                if (lc3Var != null) {
                                    lc3Var.H();
                                }
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel4 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel4.a, iSessionToolbarViewModel4, 7);
                            break;
                        case 5:
                            RCClientActivity rCClientActivity5 = w16Var.w;
                            if (rCClientActivity5 != null) {
                                new cq5().E0(rCClientActivity5.D(), "PredefinedShortcutBottomSheetDialogFragment");
                                lc3 lc3Var2 = rCClientActivity5.P;
                                if (lc3Var2 != null) {
                                    lc3Var2.H();
                                }
                                lc3 lc3Var3 = rCClientActivity5.P;
                                if (lc3Var3 != null) {
                                    lc3Var3.z();
                                }
                            }
                            break;
                        case 6:
                            RCClientActivity rCClientActivity6 = w16Var.w;
                            if (rCClientActivity6 != null) {
                                rCClientActivity6.X();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel5 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel5.a, iSessionToolbarViewModel5, 8);
                            break;
                        default:
                            RCClientActivity rCClientActivity7 = w16Var.w;
                            if (rCClientActivity7 != null) {
                                rCClientActivity7.K();
                            }
                            ISessionToolbarViewModel iSessionToolbarViewModel6 = w16Var.u;
                            ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel6.a, iSessionToolbarViewModel6, 9);
                            break;
                    }
                    return f88Var;
                }
            }, 88));
        }
    }

    @Override // o.nc3
    public final void E() {
        ISessionToolbarViewModel iSessionToolbarViewModel = this.u;
        ISessionToolbarViewModelSWIGJNI.ISessionToolbarViewModel_ReportEvent(iSessionToolbarViewModel.a, iSessionToolbarViewModel, 10);
    }

    @Override // o.nc3
    public final void w(RCClientActivity rCClientActivity) {
        this.w = rCClientActivity;
    }
}
