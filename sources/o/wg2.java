package o;

import android.view.View;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wg2 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bd4 bd4Var = bd4.k;
        if (bd4Var == null) {
            bd4Var = new bd4();
            bd4.k = bd4Var;
        }
        List list = bd4Var.b;
        ye4.a("FTProgressDialogFragment", "FileTransfer cancelled");
        boolean zIsEmpty = list.isEmpty();
        vg2 vg2Var = vg2.SessionId;
        if (zIsEmpty) {
            bd4 bd4Var2 = bd4.k;
            if (bd4Var2 == null) {
                bd4Var2 = new bd4();
                bd4.k = bd4Var2;
            }
            et6 et6Var = (et6) ((zt6) bd4Var2.h).f;
            if (et6Var != null) {
                ct6 ct6Var = et6Var.A;
                if (ct6Var != null) {
                    ct6Var.b(at6.f361o, null, null);
                }
                ug2 ug2Var = ug2.Abort;
                ug2Var.getClass();
                ak7 ak7Var = new ak7(g10.TVCommand, ug2Var.m);
                ak7Var.d(vg2Var, 1001);
                ak7Var.z(KnownStreams.DefaultStream_File);
                ak7Var.b(vg2.SkipAllFiles, (byte) 1);
                et6Var.f(ak7Var, false);
            }
            ca6 ca6Var = ca6.g;
            if (ca6Var == null) {
                ca6Var = new ca6();
                ca6.g = ca6Var;
            }
            ca6Var.b = new ArrayList();
            return;
        }
        ca6 ca6Var2 = ca6.g;
        if (ca6Var2 == null) {
            ca6Var2 = new ca6();
            ca6.g = ca6Var2;
        }
        mo7 mo7Var = ((zt6) ca6Var2.e).f;
        if (mo7Var instanceof et6) {
            et6 et6Var2 = (et6) mo7Var;
            if (et6Var2.D == ah2.Upload) {
                ug2 ug2Var2 = ug2.Abort;
                ug2Var2.getClass();
                ak7 ak7Var2 = new ak7(g10.TVCommand, ug2Var2.m);
                ak7Var2.d(vg2Var, 1001);
                ak7Var2.z(KnownStreams.DefaultStream_File);
                et6Var2.f(ak7Var2, false);
                et6Var2.G.clear();
                et6Var2.u();
            }
        }
        bd4 bd4Var3 = bd4.k;
        if (bd4Var3 == null) {
            bd4Var3 = new bd4();
            bd4.k = bd4Var3;
        }
        bd4Var3.b = new ArrayList();
    }
}
