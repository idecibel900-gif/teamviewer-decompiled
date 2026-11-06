package o;

import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class g16 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ lo4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LiveData[] f845o;
    public final /* synthetic */ Object[] p;

    public /* synthetic */ g16(lo4 lo4Var, LiveData[] liveDataArr, Object[] objArr, byte b) {
        this.m = b;
        this.n = lo4Var;
        this.f845o = liveDataArr;
        this.p = objArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object[] objArr = this.p;
        LiveData[] liveDataArr = this.f845o;
        lo4 lo4Var = this.n;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList(liveDataArr.length);
                for (LiveData liveData : liveDataArr) {
                    Object value = liveData.getValue();
                    if (value == null) {
                        yq4.l("null cannot be cast to non-null type com.teamviewer.teamviewerlib.definitions.DisableRemoteInputState");
                        return null;
                    }
                    arrayList.add((t12) value);
                }
                lo4Var.setValue(Boolean.valueOf(im3.n(arrayList.toArray(new t12[0])[0], objArr[0])));
                return f88Var;
            default:
                ArrayList arrayList2 = new ArrayList(liveDataArr.length);
                for (LiveData liveData2 : liveDataArr) {
                    Object value2 = liveData2.getValue();
                    if (value2 == null) {
                        yq4.l("null cannot be cast to non-null type com.teamviewer.teamviewerlib.definitions.DisableRemoteInputState");
                        return null;
                    }
                    arrayList2.add((t12) value2);
                }
                lo4Var.setValue(Boolean.valueOf(!im3.n(arrayList2.toArray(new t12[0])[0], objArr[0])));
                return f88Var;
        }
    }
}
