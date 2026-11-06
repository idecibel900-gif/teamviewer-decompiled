package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;

/* JADX INFO: loaded from: classes.dex */
public final class t7 implements vd2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // o.vd2
    public final void a(EventType eventType, he2 he2Var) {
        byte b = this.a;
        Object obj = this.b;
        eventType.getClass();
        he2Var.getClass();
        switch (b) {
            case 0:
                xt2 xt2Var = ((u7) obj).d;
                if (xt2Var != null && !xt2Var.isFinishing()) {
                    xt2Var.finish();
                }
                break;
            case 1:
                if (eventType == EventType.EVENT_COMMENT_SESSION) {
                    bu7.CACHEDTHREADPOOL.a(new io.sentry.android.core.internal.util.j((Object) he2Var.h(EventParam.EP_COMMENT_SESSION_GUID), (Object) he2Var.h(EventParam.EPARAM_BUDDY_ID), obj, (byte) 14));
                } else {
                    ye4.c("MainActivityViewModel", "onCommentSession: invalid event type " + eventType);
                }
                break;
            default:
                wk7 wk7Var = (wk7) obj;
                if (!((a2) wk7Var.a).f283o.d()) {
                    Bitmap bitmapDecodeResource = wk7Var.p;
                    if (bitmapDecodeResource == null) {
                        bitmapDecodeResource = BitmapFactory.decodeResource(wk7Var.c, R.drawable.tv_mouse_off);
                        wk7Var.p = bitmapDecodeResource;
                    }
                    wk7Var.g = bitmapDecodeResource;
                } else {
                    wk7Var.g = wk7Var.h;
                }
                break;
        }
    }
}
