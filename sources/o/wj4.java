package o;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IPLSynchronizationStateViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IPLSynchronizationStateViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wj4 implements View.OnClickListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ MainActivity n;

    public /* synthetic */ wj4(MainActivity mainActivity, byte b) {
        this.m = b;
        this.n = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel;
        byte b = this.m;
        MainActivity mainActivity = this.n;
        switch (b) {
            case 0:
                int i = MainActivity.w0;
                mainActivity.c().d();
                break;
            case 1:
                pb3 pb3Var = mainActivity.Y;
                if (pb3Var != null && (iPLSynchronizationStateViewModel = ((nk4) pb3Var).x) != null) {
                    IPLSynchronizationStateViewModelSWIGJNI.IPLSynchronizationStateViewModel_RetrySynchronization(iPLSynchronizationStateViewModel.a, iPLSynchronizationStateViewModel);
                    break;
                }
                break;
            case 2:
                int i2 = MainActivity.w0;
                Uri uri = Uri.parse("package:" + mainActivity.getPackageName());
                uri.getClass();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", uri);
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setFlags(268435456);
                mainActivity.startActivity(intent);
                break;
            default:
                int i3 = MainActivity.w0;
                Uri uri2 = Uri.parse("package:" + mainActivity.getPackageName());
                uri2.getClass();
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", uri2);
                intent2.addCategory("android.intent.category.DEFAULT");
                intent2.setFlags(268435456);
                mainActivity.startActivity(intent2);
                break;
        }
    }
}
