package o;

import android.content.res.Resources;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class k85 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Resources n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f1237o;
    public final /* synthetic */ px4 p;

    public /* synthetic */ k85(Resources resources, px4 px4Var, px4 px4Var2, byte b) {
        this.m = b;
        this.n = resources;
        this.f1237o = px4Var;
        this.p = px4Var2;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Resources resources = this.n;
        px4 px4Var = this.p;
        px4 px4Var2 = this.f1237o;
        switch (b) {
            case 0:
                h37 h37Var = (h37) obj;
                ((Function1) px4Var2.getValue()).invoke(lv1.O(h37Var, (Function0) px4Var.getValue(), resources));
                a47 a47Var = h37Var.c;
                if (a47Var != null) {
                    h57.x(a47Var, "onboarding");
                }
                break;
            case 1:
                String string = resources.getString(R.string.contact_no_incoming_connections, (String) obj);
                string.getClass();
                Function0 function0 = (Function0) px4Var2.getValue();
                ((Function1) px4Var.getValue()).invoke(new ul7(sl7.f2030o, string, g37.m, resources.getString(R.string.dismiss), null, function0, 168));
                break;
            default:
                h37 h37Var2 = (h37) obj;
                ((Function1) px4Var2.getValue()).invoke(lv1.O(h37Var2, (Function0) px4Var.getValue(), resources));
                a47 a47Var2 = h37Var2.c;
                if (a47Var2 != null) {
                    h57.x(a47Var2, "global-search-screen");
                }
                break;
        }
        return f88Var;
    }
}
