package o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ml7 extends oe8 implements hd3 {
    public final ec3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Resources f1482o;
    public final yi5 p;
    public final SharedPreferences q;
    public final nw4 r;

    public ml7(ec3 ec3Var, Resources resources, yi5 yi5Var, SharedPreferences sharedPreferences) {
        yi5Var.getClass();
        sharedPreferences.getClass();
        this.n = ec3Var;
        this.f1482o = resources;
        this.p = yi5Var;
        this.q = sharedPreferences;
        nw4 nw4Var = new nw4();
        this.r = nw4Var;
        int i = sharedPreferences.getInt("QUALITY_SETTINGS_INT", 0);
        nw4Var.setValue(Integer.valueOf(i != 0 ? i != 1 ? R.string.tv_options_OptimizeSpeed : R.string.tv_options_OptimizeQuality : R.string.tv_options_Automatic));
    }

    @Override // o.hd3
    public final void X(xt2 xt2Var, ll7 ll7Var) {
        String string;
        ry5 ry5Var;
        xt2Var.getClass();
        ha6 ha6Var = ((a2) this.n).f283o;
        qy5 qy5Var = (ha6Var == null || (ry5Var = ha6Var.j) == null) ? qy5.Auto : ry5Var.a;
        Resources resources = this.f1482o;
        String[] stringArray = resources.getStringArray(R.array.tv_options_QualitySettings);
        stringArray.getClass();
        List listG1 = cx.g1(stringArray);
        int iOrdinal = qy5Var.ordinal();
        if (iOrdinal == 0) {
            string = resources.getString(R.string.tv_options_Automatic);
            string.getClass();
        } else if (iOrdinal == 1) {
            string = resources.getString(R.string.tv_options_OptimizeQuality);
            string.getClass();
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                gk0.s();
                return;
            }
            string = resources.getString(R.string.tv_options_Automatic);
            string.getClass();
        } else {
            string = resources.getString(R.string.tv_options_OptimizeSpeed);
            string.getClass();
        }
        this.p.getClass();
        fc4 fc4VarD = yi5.d(string, listG1);
        fc4VarD.K0 = R.string.tv_ok;
        fc4VarD.O0 = R.string.tv_cancel;
        ll7Var.invoke(fc4VarD);
        gk7.O0(fc4VarD, xt2Var);
    }

    @Override // o.hd3
    public final void b0(String str) {
        ry5 ry5Var;
        ha6 ha6Var = ((a2) this.n).f283o;
        if (ha6Var == null || (ry5Var = ha6Var.j) == null) {
            return;
        }
        Resources resources = this.f1482o;
        int i = R.string.tv_options_Automatic;
        boolean zEquals = str.equals(resources.getString(R.string.tv_options_Automatic));
        qy5 qy5Var = qy5.Auto;
        if (!zEquals) {
            if (str.equals(resources.getString(R.string.tv_options_OptimizeQuality))) {
                qy5Var = qy5.Quality;
            } else if (str.equals(resources.getString(R.string.tv_options_OptimizeSpeed))) {
                qy5Var = qy5.Speed;
            }
        }
        byte b = qy5Var.m;
        SharedPreferences.Editor editorEdit = this.q.edit();
        editorEdit.getClass();
        editorEdit.putInt("QUALITY_SETTINGS_INT", b);
        editorEdit.commit();
        if (ry5Var.a != qy5Var) {
            ye4.a("TVSessionQualityPreference", "change quality: " + qy5Var);
            ry5 ry5Var2 = new ry5(qy5Var, ry5Var.d);
            ha6Var.getClass();
            ha6Var.j = ry5Var2;
            ha6Var.a.b();
            if (b != 0) {
                i = b != 1 ? R.string.tv_options_OptimizeSpeed : R.string.tv_options_OptimizeQuality;
            }
            this.r.setValue(Integer.valueOf(i));
        }
    }

    @Override // o.hd3
    public final nw4 n() {
        return this.r;
    }
}
