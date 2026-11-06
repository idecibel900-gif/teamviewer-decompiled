package o;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o21 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ y21 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f1622o;

    public /* synthetic */ o21(y21 y21Var, Context context, byte b) {
        this.m = b;
        this.n = y21Var;
        this.f1622o = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        Context context = this.f1622o;
        y21 y21Var = this.n;
        switch (b) {
            case 0:
                y21Var.getClass();
                y21.C0(context, "https://www.teamviewer.com/contact");
                break;
            case 1:
                y31 y31Var = y21Var.q0;
                if (y31Var != null) {
                    y31Var.Y0();
                }
                y21.C0(context, "https://www.teamviewer.com/contact");
                break;
            case 2:
                y21Var.getClass();
                y21.C0(context, "https://www.teamviewer.com/payment");
                break;
            case 3:
                y21Var.getClass();
                y21.C0(context, "https://www.teamviewer.com/payment");
                break;
            default:
                y21Var.getClass();
                y21.C0(context, "https://www.teamviewer.com/payment");
                break;
        }
        return f88Var;
    }
}
