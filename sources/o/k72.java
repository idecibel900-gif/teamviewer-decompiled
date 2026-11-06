package o;

import android.util.SparseArray;
import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.settings.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class k72 extends oe8 {
    public final Settings n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nw4 f1234o;
    public final zb p;

    public k72(Settings settings) {
        settings.getClass();
        this.n = settings;
        nw4 nw4Var = new nw4();
        this.f1234o = nw4Var;
        zb zbVar = new zb(this, (byte) 1);
        this.p = zbVar;
        settings.g(zbVar);
        nw4Var.setValue(Settings.e().toFormattedId());
    }

    @Override // o.oe8
    public final void U0() {
        Settings settings = this.n;
        zb zbVar = this.p;
        nx3 nx3Var = settings.e;
        zbVar.getClass();
        if (NativeLibTvExt.c()) {
            int iY = nx3Var.y(zbVar);
            synchronized (nx3Var) {
                ((SparseArray) nx3Var.n).remove(iY);
            }
            Settings.Companion companion = Settings.i;
            Settings.Companion.m(iY);
        }
    }
}
