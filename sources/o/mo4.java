package o;

import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;

/* JADX INFO: loaded from: classes.dex */
public final class mo4 extends BCommandNativeImpl {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo4(long j, byte b) {
        super(j);
        this.c = b;
    }

    @Override // com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl
    public final String toString() {
        switch (this.c) {
            case 0:
                String string = super.toString();
                vv vvVar = no4.n;
                byte bV = v();
                vvVar.getClass();
                return string + " ct=" + ((no4) no4.f1586o.C(bV));
            case 1:
                String string2 = super.toString();
                wj5 wj5Var = g06.n;
                byte bV2 = v();
                wj5Var.getClass();
                return string2 + " ct=" + ((g06) g06.f842o.C(bV2));
            default:
                String string3 = super.toString();
                el5 el5Var = ks6.n;
                byte bV3 = v();
                el5Var.getClass();
                return string3 + " ct=" + ((ks6) ks6.f1299o.C(bV3));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo4(g10 g10Var, byte b, byte b2) {
        super(g10Var, b);
        this.c = b2;
    }
}
