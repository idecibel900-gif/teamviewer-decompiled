package io.sentry.android.core;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.remotecontrolviewmodellib.swig.IAudioPermissionClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IAudioPermissionClientViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IAudioVoipClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IAudioVoipClientViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import io.sentry.a6;
import io.sentry.f6;
import io.sentry.g7;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import o.a8;
import o.ag8;
import o.ct1;
import o.dc3;
import o.f37;
import o.fx3;
import o.ga7;
import o.gk7;
import o.gp5;
import o.hm3;
import o.ia;
import o.ik7;
import o.im3;
import o.p02;
import o.px4;
import o.px5;
import o.q15;
import o.r02;
import o.uf8;
import o.wt2;
import o.x02;
import o.ye0;
import o.ye4;
import o.z7;
import o.zf8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2 implements a8 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ h2(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0239  */
    /* JADX WARN: Code duplicated, block: B:114:0x0261  */
    @Override // o.a8
    public final void a(Object obj) {
        long j;
        int columnIndex;
        byte b = this.m;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                e eVar = (e) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    r2 r2Var = (r2) eVar.m;
                    g7 g7Var = (g7) eVar.n;
                    Button button = (Button) eVar.f103o;
                    a6 a6Var = r2Var.p;
                    try {
                        Cursor cursorQuery = r2Var.getContext().getContentResolver().query(uri, null, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_size")) != -1 && !cursorQuery.isNull(columnIndex)) {
                                    j = cursorQuery.getLong(columnIndex);
                                    cursorQuery.close();
                                }
                                if (j > g7Var.getMaxAttachmentSize()) {
                                    r2Var.t = uri;
                                    a6Var.getClass();
                                    button.setText("Remove screenshot");
                                    return;
                                } else {
                                    g7Var.getLogger().g(f6.WARNING, "Selected screenshot is larger than the maxAttachmentSize of %d bytes, dropping it.", Long.valueOf(g7Var.getMaxAttachmentSize()));
                                    Context context = r2Var.getContext();
                                    a6Var.getClass();
                                    Toast.makeText(context, "Screenshot is too large", 0).show();
                                    return;
                                }
                            } catch (Throwable th) {
                                try {
                                    cursorQuery.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Throwable th3) {
                        io.sentry.util.b.w(th3);
                        g7Var.getLogger().d(f6.WARNING, "Unable to determine the size of the selected screenshot, the attachment size limit is applied when the feedback is captured.", th3);
                    }
                    j = -1;
                    if (j > g7Var.getMaxAttachmentSize()) {
                        r2Var.t = uri;
                        a6Var.getClass();
                        button.setText("Remove screenshot");
                        return;
                    } else {
                        g7Var.getLogger().g(f6.WARNING, "Selected screenshot is larger than the maxAttachmentSize of %d bytes, dropping it.", Long.valueOf(g7Var.getMaxAttachmentSize()));
                        Context context2 = r2Var.getContext();
                        a6Var.getClass();
                        Toast.makeText(context2, "Screenshot is too large", 0).show();
                        return;
                    }
                }
                return;
            case 1:
                ((Function1) ((px4) obj2).getValue()).invoke(obj);
                return;
            case 2:
                ia iaVar = (ia) obj2;
                Map map = (Map) obj;
                map.getClass();
                Set setEntrySet = map.entrySet();
                if (!(setEntrySet instanceof Collection) || !setEntrySet.isEmpty()) {
                    Iterator it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                            return;
                        }
                    }
                }
                dc3 dc3Var = iaVar.h1;
                if (dc3Var != null) {
                    ((q15) dc3Var).W0();
                    return;
                }
                return;
            case 3:
                z7 z7Var = (z7) obj;
                int i = M2MClientActivity.h0;
                z7Var.getClass();
                ((gp5) ((M2MClientActivity) obj2).f0.getValue()).a(z7Var);
                return;
            case 4:
                z7 z7Var2 = (z7) obj;
                int i2 = MainActivity.w0;
                z7Var2.getClass();
                ((gp5) ((MainActivity) obj2).f0.getValue()).a(z7Var2);
                return;
            case 5:
                ye0 ye0Var = (ye0) obj2;
                z7 z7Var3 = (z7) obj;
                z7Var3.getClass();
                if (z7Var3.m == -1) {
                    View viewS0 = ye0Var.s0();
                    Intent intent = z7Var3.n;
                    String stringExtra = intent != null ? intent.getStringExtra("ASSIGNMENT_RESULT_KEY") : null;
                    if (im3.n(stringExtra, "QR_CODE_ASSIGNMENT_FAILED")) {
                        IStatisticsHandler iStatisticsHandler = ga7.a;
                        ga7.a(px5.A);
                        f37.g(viewS0, ye0Var.I(R.string.scan_qr_pin_maximum_attempts), 0).i();
                        return;
                    } else {
                        if (im3.n(stringExtra, "QR_CODE_ASSIGNMENT_SUCCESS")) {
                            IStatisticsHandler iStatisticsHandler2 = ga7.a;
                            ga7.a(px5.B);
                            f37.g(viewS0, ye0Var.I(R.string.scan_qr_pin_verified), 0).i();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 6:
                z7 z7Var4 = (z7) obj;
                int i3 = RCClientActivity.c0;
                z7Var4.getClass();
                ((gp5) ((RCClientActivity) obj2).W.getValue()).a(z7Var4);
                return;
            case 7:
                z7 z7Var5 = (z7) obj;
                int i4 = SettingsActivity.Q;
                z7Var5.getClass();
                ((gp5) ((SettingsActivity) obj2).O.getValue()).a(z7Var5);
                return;
            default:
                zf8 zf8Var = (zf8) obj2;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (bool.booleanValue()) {
                    ag8 ag8Var = zf8Var.w0;
                    if (ag8Var == null) {
                        im3.e0("viewerViewModel");
                        throw null;
                    }
                    ag8Var.f321o = false;
                    IAudioPermissionClientViewModel iAudioPermissionClientViewModel = zf8Var.t0;
                    if (iAudioPermissionClientViewModel == null) {
                        im3.e0("audioPermissionViewModel");
                        throw null;
                    }
                    IAudioPermissionClientViewModelSWIGJNI.IAudioPermissionClientViewModel_onPermissionGranted(iAudioPermissionClientViewModel.n, iAudioPermissionClientViewModel);
                    IAudioVoipClientViewModel iAudioVoipClientViewModel = zf8Var.s0;
                    if (iAudioVoipClientViewModel == null) {
                        im3.e0("audioVoIpViewModel");
                        throw null;
                    }
                    IAudioVoipClientViewModelSWIGJNI.IAudioVoipClientViewModel_SetMicMuted(iAudioVoipClientViewModel.n, iAudioVoipClientViewModel, false);
                    zf8Var.G().e0("PERMISSION_ACCEPTED", Bundle.EMPTY);
                    return;
                }
                ye4.a("ViewerFragment", "no audio permission granted");
                wt2 wt2Var = zf8Var.G;
                if (wt2Var != null ? hm3.C(wt2Var.w, "android.permission.RECORD_AUDIO") : false) {
                    ag8 ag8Var2 = zf8Var.w0;
                    if (ag8Var2 == null) {
                        im3.e0("viewerViewModel");
                        throw null;
                    }
                    if (!ag8Var2.n) {
                        uf8 uf8Var = zf8Var.L0;
                        uf8 uf8Var2 = zf8Var.O0;
                        x02 x02VarA = ik7.a();
                        gk7 gk7Var = new gk7();
                        fx3.o(1, "dialogId", x02VarA, gk7Var);
                        gk7Var.Z0 = x02VarA;
                        gk7Var.a1 = true;
                        gk7Var.F0 = R.string.audio_permission;
                        gk7Var.H0 = R.string.audio_permission_session_denied_once;
                        gk7Var.K0 = R.string.tv_qs_allow;
                        gk7Var.O0 = R.string.tv_cancel;
                        if (uf8Var != null && ct1.a != null) {
                            ik7.b(uf8Var, new r02(gk7Var, p02.Positive));
                        }
                        if (uf8Var2 != null && ct1.a != null) {
                            ik7.b(uf8Var2, new r02(gk7Var, p02.Negative));
                        }
                        gk7.O0(gk7Var, zf8Var.C());
                        ag8 ag8Var3 = zf8Var.w0;
                        if (ag8Var3 != null) {
                            ag8Var3.n = true;
                            return;
                        } else {
                            im3.e0("viewerViewModel");
                            throw null;
                        }
                    }
                }
                zf8Var.C0();
                zf8Var.A0();
                return;
        }
    }
}
