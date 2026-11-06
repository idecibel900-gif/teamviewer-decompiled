package o;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.teamviewer.remotecontrolviewlib.activity.FileTransferActivity;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.PilotSessionActivity;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.Arrays;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jq implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1190o;

    public /* synthetic */ jq(int i, Object[] objArr) {
        this.m = (byte) 3;
        this.n = i;
        this.f1190o = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Resources resources;
        switch (this.m) {
            case 0:
                ((IntConsumer) this.f1190o).accept(this.n);
                return;
            case 1:
                fz4 fz4Var = (fz4) this.f1190o;
                int i = this.n;
                ss6 ss6Var = fz4Var.d;
                RemoteControlApplication remoteControlApplication = fz4Var.a;
                if (ss6Var == null) {
                    return;
                }
                ss6Var.f2050o.d(ss6Var);
                du6 du6Var = ss6Var.q;
                fz4Var.b.c(du6Var.j, "", e51.RemoteControl, du6Var.b.a, false);
                int iOrdinal = ss6Var.m.ordinal();
                if (iOrdinal == 1) {
                    if (it1.c == null) {
                        im3.e0("viewFactory");
                        throw null;
                    }
                    Intent intent = new Intent(remoteControlApplication, (Class<?>) FileTransferActivity.class);
                    intent.setFlags(872415232);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("checkable", true);
                    intent.putExtra("activity_navigation_bundle", bundle);
                    remoteControlApplication.startActivity(intent);
                    return;
                }
                if (iOrdinal == 9) {
                    if (it1.c == null) {
                        im3.e0("viewFactory");
                        throw null;
                    }
                    Intent intent2 = new Intent(remoteControlApplication, (Class<?>) PilotSessionActivity.class);
                    intent2.putExtra("sessionId", i);
                    intent2.addFlags(268435456);
                    remoteControlApplication.startActivity(intent2);
                    return;
                }
                if (iOrdinal == 3) {
                    if (it1.c == null) {
                        im3.e0("viewFactory");
                        throw null;
                    }
                    Intent intent3 = new Intent(remoteControlApplication, (Class<?>) RCClientActivity.class);
                    intent3.setFlags(872415232);
                    remoteControlApplication.startActivity(intent3);
                    return;
                }
                if (iOrdinal != 4) {
                    return;
                }
                if (it1.c == null) {
                    im3.e0("viewFactory");
                    throw null;
                }
                Intent intent4 = new Intent(remoteControlApplication, (Class<?>) M2MClientActivity.class);
                intent4.setFlags(872415232);
                remoteControlApplication.startActivity(intent4);
                return;
            case 2:
                RCClientActivity rCClientActivity = (RCClientActivity) this.f1190o;
                View viewInflate = rCClientActivity.getLayoutInflater().inflate(this.n, (ViewGroup) null);
                viewInflate.getClass();
                Toast toast = new Toast(rCClientActivity);
                toast.setDuration(0);
                if (Build.VERSION.SDK_INT < 30) {
                    toast.setView(viewInflate);
                }
                toast.show();
                return;
            default:
                int i2 = this.n;
                Object[] objArr = (Object[]) this.f1190o;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                el7 el7Var = y57.a;
                if (el7Var != null) {
                    boolean z = el7Var.G0;
                    el7Var.G0 = true;
                    DialogInterface.OnCancelListener onCancelListener = y57.b;
                    if (onCancelListener != null) {
                        el7Var.F0(onCancelListener);
                    } else {
                        el7Var.F0(new cl7());
                    }
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
                    s7 s7Var = u7.g;
                    my0 my0Var = vn4.g0().b;
                    if (my0Var != null && (resources = my0Var.getResources()) != null) {
                        String strH = o67.h(resources, i2, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
                        el7Var.F0 = strH;
                        View view = el7Var.U;
                        if (view != null) {
                            ((TextView) view.findViewById(R.id.dialog_progress_text)).setText(strH);
                        } else {
                            ye4.a("TVProgressDialogView", "setMessage: view is null");
                        }
                    }
                    if (z) {
                        return;
                    }
                    synchronized (el7Var) {
                        try {
                            my0 my0Var2 = vn4.g0().b;
                            if (my0Var2 instanceof xt2) {
                                xt2 xt2Var = (xt2) my0Var2;
                                xt2Var.runOnUiThread(new be3(xt2Var, el7Var, (byte) 14));
                            } else {
                                ye4.c("TVProgressDialogView", "show:can't show dialog. current activity is no FragmentActivity");
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ jq(byte b, int i, Object obj) {
        this.m = b;
        this.f1190o = obj;
        this.n = i;
    }
}
