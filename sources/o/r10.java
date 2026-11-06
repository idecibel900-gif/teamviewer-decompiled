package o;

import android.util.Log;
import com.teamviewer.remotecontrolviewlib.activity.BiometricProtectionPromotionActivity;
import com.teamviewer.remotecontrolviewlib.activity.FileTransferActivity;
import com.teamviewer.remotecontrolviewlib.activity.LegalAgreementActivity;
import com.teamviewer.remotecontrolviewlib.activity.LockScreenActivity;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.OnBoardingActivity;
import com.teamviewer.remotecontrolviewlib.activity.PilotSessionActivity;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.SessionInfoActivity;
import com.teamviewer.remotecontrolviewlib.activity.SessionSettingsActivity;
import com.teamviewer.remotecontrolviewlib.view.session.RcSessionExtraToolbarView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r10 extends j75 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r10(byte b, Object obj, boolean z) {
        super(true);
        this.d = b;
        this.e = obj;
    }

    @Override // o.j75
    public void a() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((io.sentry.l6) obj).o();
                break;
            case 4:
                su2 su2Var = (su2) obj;
                if (su2.M(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + su2Var);
                }
                su2Var.d();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.j75
    public final void b() {
        RcSessionExtraToolbarView rcSessionExtraToolbarView;
        lo4 lo4VarI;
        byte b = this.d;
        ye4 ye4Var = ye4.a;
        boolean z = true;
        bb5 bb5Var = null;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((io.sentry.l6) obj).p();
                return;
            case 1:
                j20 j20Var = (j20) obj;
                ut2 ut2VarE = j20Var.D().E(R.id.main);
                if (ut2VarE != null && (ut2VarE instanceof bb5)) {
                    bb5Var = (bb5) ut2VarE;
                }
                if (bb5Var != null && bb5Var.v()) {
                    ye4Var.b("BackstackV3Activity", "back event handled by fragment (IInterceptBack)");
                    return;
                } else if (bb5Var == null || !bb5Var.G0()) {
                    j20Var.finish();
                    return;
                } else {
                    ye4Var.b("BackstackV3Activity", "back event handled by FragmentContainer");
                    return;
                }
            case 2:
                ((BiometricProtectionPromotionActivity) obj).finish();
                return;
            case 3:
                FileTransferActivity fileTransferActivity = (FileTransferActivity) obj;
                ut2 ut2VarF = fileTransferActivity.D().F("file_transfer_fragment_tag");
                if (ut2VarF instanceof ik2) {
                    if (((ik2) ut2VarF).v()) {
                        ye4Var.b("FileTransferActivity", "back event handled by fragment (IInterceptBack)");
                        return;
                    } else {
                        fileTransferActivity.finish();
                        return;
                    }
                }
                return;
            case 4:
                su2 su2Var = (su2) obj;
                if (su2.M(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + su2Var);
                }
                r10 r10Var = su2Var.j;
                ArrayList arrayList = su2Var.f2054o;
                su2Var.i = true;
                su2Var.B(true);
                su2Var.i = false;
                if (su2Var.h == null) {
                    if (r10Var.b) {
                        if (su2.M(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        su2Var.V();
                        return;
                    } else {
                        if (su2.M(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        su2Var.g.d();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(su2.H(su2Var.h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            io.sentry.h2.f();
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = su2Var.h.a.iterator();
                while (it3.hasNext()) {
                    ut2 ut2Var = ((ev2) it3.next()).b;
                    if (ut2Var != null) {
                        ut2Var.y = false;
                    }
                }
                for (ll1 ll1Var : su2Var.g(new ArrayList(Collections.singletonList(su2Var.h)), 0, 1)) {
                    ArrayList arrayList2 = ll1Var.c;
                    if (su2.M(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    ll1Var.k(arrayList2);
                    ll1Var.c(arrayList2);
                }
                Iterator it4 = su2Var.h.a.iterator();
                while (it4.hasNext()) {
                    ut2 ut2Var2 = ((ev2) it4.next()).b;
                    if (ut2Var2 != null && ut2Var2.T == null) {
                        su2Var.h(ut2Var2).k();
                    }
                }
                su2Var.h = null;
                su2Var.m0();
                if (su2.M(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + r10Var.b + " for  FragmentManager " + su2Var);
                    return;
                }
                return;
            case 5:
                LegalAgreementActivity legalAgreementActivity = (LegalAgreementActivity) obj;
                legalAgreementActivity.setResult(0, null);
                legalAgreementActivity.finishAffinity();
                return;
            case 6:
                ((LockScreenActivity) obj).finishAffinity();
                return;
            case 7:
                M2MClientActivity m2MClientActivity = (M2MClientActivity) obj;
                if (m2MClientActivity.X) {
                    m2MClientActivity.J();
                }
                ut2 ut2VarE2 = m2MClientActivity.D().E(R.id.startup_help);
                if ((ut2VarE2 instanceof db3) && ut2VarE2.R() && ((db3) ut2VarE2).v()) {
                    return;
                }
                m2MClientActivity.N();
                f(false);
                return;
            case 8:
                ((bi) obj).invoke(this);
                return;
            case ep1.b /* 9 */:
                OnBoardingActivity onBoardingActivity = (OnBoardingActivity) obj;
                onBoardingActivity.setResult(0);
                onBoardingActivity.finishAffinity();
                return;
            case ep1.c /* 10 */:
                PilotSessionActivity pilotSessionActivity = (PilotSessionActivity) obj;
                ut2 ut2VarE3 = pilotSessionActivity.D().E(R.id.pilot_session_fragment_container);
                if (ut2VarE3 instanceof yk5) {
                    yk5 yk5Var = (yk5) ut2VarE3;
                    b6 b6Var = new b6(yk5Var, (byte) 8);
                    x02 x02VarA = ik7.a();
                    gk7 gk7Var = new gk7();
                    fx3.o(1, "dialogId", x02VarA, gk7Var);
                    gk7Var.Z0 = x02VarA;
                    gk7Var.a1 = true;
                    gk7Var.F0 = R.string.leave_session_dialog_title;
                    gk7Var.H0 = R.string.leave_session_dialog_message;
                    gk7Var.K0 = R.string.leave_session_dialog_confirm;
                    gk7Var.O0 = R.string.tv_cancel;
                    if (ct1.a != null) {
                        ik7.b(b6Var, new r02(gk7Var, p02.Positive));
                    }
                    gk7.O0(gk7Var, yk5Var.C());
                } else {
                    z = false;
                }
                f(z);
                if (this.b) {
                    return;
                }
                pilotSessionActivity.c().d();
                return;
            case 11:
                RCClientActivity rCClientActivity = (RCClientActivity) obj;
                lc3 lc3Var = rCClientActivity.P;
                if (((lc3Var == null || (lo4VarI = lc3Var.I()) == null) ? false : im3.n(lo4VarI.getValue(), Boolean.TRUE)) || ((rcSessionExtraToolbarView = rCClientActivity.R) != null && rcSessionExtraToolbarView.getVisibility() == 0)) {
                    rCClientActivity.S();
                    return;
                }
                ut2 ut2VarE4 = rCClientActivity.D().E(R.id.startup_help);
                if ((ut2VarE4 instanceof db3) && ut2VarE4.R() && ((db3) ut2VarE4).v()) {
                    return;
                }
                rCClientActivity.V(null);
                f(false);
                return;
            case ep1.d /* 12 */:
                ((SessionInfoActivity) obj).finish();
                return;
            default:
                ((SessionSettingsActivity) obj).finish();
                return;
        }
    }

    @Override // o.j75
    public void c(p10 p10Var) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((io.sentry.l6) obj).q(p10Var);
                break;
            case 4:
                su2 su2Var = (su2) obj;
                if (su2.M(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + su2Var);
                }
                if (su2Var.h != null) {
                    for (ll1 ll1Var : su2Var.g(new ArrayList(Collections.singletonList(su2Var.h)), 0, 1)) {
                        ll1Var.getClass();
                        if (su2.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + p10Var.c);
                        }
                        ArrayList arrayList = ll1Var.c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            qv0.c0(arrayList2, ((q77) it.next()).k);
                        }
                        List listP0 = lv0.P0(lv0.T0(arrayList2));
                        int size = listP0.size();
                        for (int i = 0; i < size; i++) {
                            ((p77) listP0.get(i)).c(p10Var, ll1Var.a);
                        }
                    }
                    Iterator it2 = su2Var.f2054o.iterator();
                    if (it2.hasNext()) {
                        it2.next().getClass();
                        io.sentry.h2.f();
                        break;
                    }
                }
                break;
        }
    }

    @Override // o.j75
    public void d(p10 p10Var) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((io.sentry.l6) obj).r();
                break;
            case 4:
                su2 su2Var = (su2) obj;
                if (su2.M(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + su2Var);
                }
                su2Var.y();
                su2Var.z(new ru2(su2Var), false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r10(Object obj, byte b) {
        super(false);
        this.d = b;
        this.e = obj;
    }
}
