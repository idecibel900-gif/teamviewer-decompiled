package o;

import androidx.lifecycle.LiveData;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kv6 extends oe8 {
    public final nw4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final lo4 f1308o;

    public kv6() {
        nw4 nw4Var = new nw4();
        this.n = nw4Var;
        LiveData[] liveDataArr = {new nw4(Integer.valueOf(R.string.tv_settings))};
        nm nmVar = new nm(2);
        nmVar.g(nw4Var);
        nmVar.i(liveDataArr);
        ArrayList arrayList = nmVar.a;
        LiveData[] liveDataArr2 = (LiveData[]) arrayList.toArray(new LiveData[arrayList.size()]);
        lo4 lo4Var = new lo4();
        c7 c7Var = new c7(lo4Var, liveDataArr2, (byte) 8);
        c7Var.a();
        for (LiveData liveData : liveDataArr2) {
            lo4Var.b(liveData, new a7(new h16(c7Var, (byte) 9), (byte) 10));
        }
        this.f1308o = lo4Var;
    }
}
