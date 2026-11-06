package o;

import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jl6 implements kl6 {
    public final List a;

    public jl6(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // o.kl6
    public final int a() {
        return R.string.search_result_title_recent;
    }

    @Override // o.kl6
    public final boolean b() {
        return true;
    }

    @Override // o.kl6
    public final List c() {
        return this.a;
    }

    @Override // o.kl6
    public final String d() {
        return "TVTA-searchScreen-results-recent";
    }

    @Override // o.kl6
    public final List e() {
        return lv0.K0(this.a, 20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jl6) && im3.n(this.a, ((jl6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fx3.i("RecentConnections(entries=", this.a, ")");
    }
}
