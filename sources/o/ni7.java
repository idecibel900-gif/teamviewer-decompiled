package o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ni7 extends oe8 implements bd3 {
    public final xt6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EventHub f1569o;
    public final Resources p;
    public final nw4 q;
    public List r;
    public final mu s;

    public ni7(xt6 xt6Var, EventHub eventHub, Resources resources) {
        eventHub.getClass();
        this.n = xt6Var;
        this.f1569o = eventHub;
        this.p = resources;
        this.q = new nw4();
        this.r = ea2.m;
        mu muVar = new mu(this, (byte) 13);
        this.s = muVar;
        if (!eventHub.c(EventType.EVENT_RESOLUTION_CHANGE, muVar)) {
            ye4.c("TVChangeResolutionPreferenceViewModel", " register ResolutionChangeListener failed");
        }
        W0();
    }

    public static void V0(ArrayList arrayList, j22 j22Var, String str) {
        arrayList.remove(j22Var);
        j22Var.getClass();
        mi7 mi7Var = new mi7(j22Var.m, j22Var.n, j22Var.f1122o, j22Var.p);
        mi7Var.q = str;
        arrayList.add(0, mi7Var);
    }

    @Override // o.oe8
    public final void U0() {
        if (this.f1569o.f(this.s)) {
            return;
        }
        ye4.c("TVChangeResolutionPreferenceViewModel", " unregister ResolutionChangeListener failed");
    }

    public final void W0() {
        ArrayList arrayList;
        Resources resources = this.p;
        mo7 mo7Var = ((zt6) this.n).f;
        ec3 ec3Var = mo7Var instanceof ec3 ? (ec3) mo7Var : null;
        if (ec3Var == null) {
            return;
        }
        ha6 ha6Var = ((a2) ec3Var).f283o;
        this.q.setValue(ha6Var.e.a());
        synchronized (ha6Var.d) {
            arrayList = new ArrayList(ha6Var.d);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        pv0.a0(arrayList2);
        j22[] j22VarArr = ha6Var.g;
        j22 j22Var = j22VarArr != null ? j22VarArr[ha6Var.k] : null;
        j22 j22Var2 = ha6Var.h;
        if (j22Var == null) {
            V0(arrayList2, j22Var2, o77.l(j22Var2, resources, R.string.tv_options_PreferredResolutionBestFit));
        } else if (j22Var.equals(j22Var2)) {
            V0(arrayList2, j22Var2, String.format("%s & %s", Arrays.copyOf(new Object[]{resources.getString(R.string.tv_options_PreferredResolutionDontChange), o77.l(j22Var2, resources, R.string.tv_options_PreferredResolutionBestFit)}, 2)));
        } else {
            V0(arrayList2, j22Var2, o77.l(j22Var2, resources, R.string.tv_options_PreferredResolutionBestFit));
            V0(arrayList2, j22Var, o77.l(j22Var, resources, R.string.tv_options_PreferredResolutionDontChange));
        }
        this.r = arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    @Override // o.bd3
    public final void c0(Object obj) {
        ha6 ha6Var;
        j22[] j22VarArr;
        j22 j22Var;
        if (obj instanceof j22) {
            mo7 mo7Var = ((zt6) this.n).f;
            ec3 ec3Var = mo7Var instanceof ec3 ? (ec3) mo7Var : null;
            if (ec3Var == null || (ha6Var = ((a2) ec3Var).f283o) == null) {
                return;
            }
            j22 j22Var2 = (j22) obj;
            boolean zEquals = j22Var2.equals(ha6Var.h);
            o72 o72Var = o72.f1638o;
            if (zEquals) {
                j22[] j22VarArr2 = ha6Var.g;
                if (!j22Var2.equals(j22VarArr2 != null ? j22VarArr2[ha6Var.k] : null)) {
                    j22VarArr = ha6Var.g;
                    if (j22VarArr != null) {
                        j22Var = j22VarArr[ha6Var.k];
                    } else {
                        j22Var = null;
                    }
                    if (j22Var2.equals(j22Var)) {
                        o72Var = o72.n;
                    } else if (!j22Var2.equals(ha6Var.h)) {
                        o72Var = o72.p;
                    }
                }
            } else {
                j22VarArr = ha6Var.g;
                if (j22VarArr != null) {
                    j22Var = j22VarArr[ha6Var.k];
                } else {
                    j22Var = null;
                }
                if (j22Var2.equals(j22Var)) {
                    o72Var = o72.n;
                } else if (!j22Var2.equals(ha6Var.h)) {
                    o72Var = o72.p;
                }
            }
            ua5.v("New preferred resolution: ", o72Var.name(), "RemoteSettings");
            ha6Var.t = o72Var;
            if (ha6Var.s == n72.Touch) {
                SharedPreferences sharedPreferences = h57.a;
                if (sharedPreferences == null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.getClass();
                editorEdit.putString("PREFERRED_RESOLUTION", o72Var.name());
                editorEdit.commit();
                he2 he2Var = new he2();
                he2Var.c(EventParam.EP_SETTINGS_KEY, "PREFERRED_RESOLUTION");
                EventHub.e.f().d(EventType.EVENT_SETTINGS_CHANGED, he2Var);
            }
            if (obj.equals(ha6Var.f)) {
                return;
            }
            ha6Var.j(j22Var2);
        }
    }

    @Override // o.bd3
    public final fc4 k0() {
        mo7 mo7Var = ((zt6) this.n).f;
        ec3 ec3Var = mo7Var instanceof ec3 ? (ec3) mo7Var : null;
        if (ec3Var == null) {
            return null;
        }
        ha6 ha6Var = ((a2) ec3Var).f283o;
        if (nv1.d != null) {
            return yi5.d(ha6Var.e, this.r);
        }
        im3.e0("dialogFactory");
        throw null;
    }

    @Override // o.bd3
    public final nw4 n() {
        return this.q;
    }
}
