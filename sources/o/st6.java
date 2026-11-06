package o;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class st6 extends mb5 {
    public final DyngateID f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st6(String str, String str2, DyngateID dyngateID) {
        super(str, str2);
        str.getClass();
        this.f = dyngateID;
        String strL = bc7.L(!bc7.N(false, str, "s") ? "s".concat(str) : str, "-", "");
        int length = strL.length();
        if (9 <= length && length < 12) {
            str = strL;
        }
        this.g = str;
    }

    @Override // o.mb5
    public final boolean c() {
        return this.g.length() > 0 && super.c();
    }
}
