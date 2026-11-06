package o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.LiveData;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class v16 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ lo4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LiveData[] f2265o;
    public final /* synthetic */ w16 p;

    public /* synthetic */ v16(lo4 lo4Var, LiveData[] liveDataArr, w16 w16Var, byte b) {
        this.m = b;
        this.n = lo4Var;
        this.f2265o = liveDataArr;
        this.p = w16Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        Drawable drawable;
        Drawable drawable2;
        byte b = this.m;
        f88 f88Var = f88.a;
        w16 w16Var = this.p;
        LiveData[] liveDataArr = this.f2265o;
        lo4 lo4Var = this.n;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList(liveDataArr.length);
                for (LiveData liveData : liveDataArr) {
                    Object value = liveData.getValue();
                    if (value == null) {
                        yq4.l("null cannot be cast to non-null type com.teamviewer.teamviewerlib.definitions.EInputMethod");
                        return null;
                    }
                    arrayList.add((n72) value);
                }
                int i = u16.a[((n72[]) arrayList.toArray(new n72[0]))[0].ordinal()];
                Resources resources = w16Var.v;
                if (i == 2) {
                    ThreadLocal threadLocal = ic6.a;
                    drawable = resources.getDrawable(R.drawable.stoolbar_im_touch, null);
                    drawable.getClass();
                } else {
                    ThreadLocal threadLocal2 = ic6.a;
                    drawable = resources.getDrawable(R.drawable.stoolbar_im_mouse, null);
                    drawable.getClass();
                }
                lo4Var.setValue(drawable);
                return f88Var;
            default:
                ArrayList arrayList2 = new ArrayList(liveDataArr.length);
                for (LiveData liveData2 : liveDataArr) {
                    Object value2 = liveData2.getValue();
                    if (value2 == null) {
                        yq4.l("null cannot be cast to non-null type kotlin.Boolean");
                        return null;
                    }
                    arrayList2.add((Boolean) value2);
                }
                boolean zBooleanValue = ((Boolean[]) arrayList2.toArray(new Boolean[0]))[0].booleanValue();
                Resources resources2 = w16Var.v;
                if (zBooleanValue) {
                    ThreadLocal threadLocal3 = ic6.a;
                    drawable2 = resources2.getDrawable(R.drawable.stoolbar_close_lock, null);
                } else {
                    ThreadLocal threadLocal4 = ic6.a;
                    drawable2 = resources2.getDrawable(R.drawable.stoolbar_close, null);
                }
                lo4Var.setValue(drawable2);
                return f88Var;
        }
    }
}
