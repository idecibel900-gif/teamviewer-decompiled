package o;

import android.view.MotionEvent;
import android.view.View;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewmodellib.swig.IMarkingClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IMarkingClientViewModelSWIGJNI;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cp0 implements View.OnTouchListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ cp0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                dp0 dp0Var = (dp0) obj;
                if (motionEvent.getAction() == 1 && dp0Var.M) {
                    dp0Var.M = false;
                    return true;
                }
                if (motionEvent.getAction() == 0) {
                    dp0Var.M = false;
                }
                return view.onTouchEvent(motionEvent);
            case 1:
                gp0 gp0Var = (gp0) obj;
                if (motionEvent.getAction() == 1 && gp0Var.L) {
                    gp0Var.L = false;
                    return true;
                }
                if (motionEvent.getAction() == 0) {
                    gp0Var.L = false;
                }
                return view.onTouchEvent(motionEvent);
            case 2:
                int i = M2MClientActivity.h0;
                ((M2MClientActivity) obj).I(true);
                return false;
            default:
                zf8 zf8Var = (zf8) obj;
                if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 1) {
                    IMarkingClientViewModel iMarkingClientViewModel = zf8Var.r0;
                    if (iMarkingClientViewModel == null) {
                        im3.e0("markingClientViewModel");
                        throw null;
                    }
                    IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_OnUp(iMarkingClientViewModel.n, iMarkingClientViewModel, true);
                }
                return false;
        }
    }
}
