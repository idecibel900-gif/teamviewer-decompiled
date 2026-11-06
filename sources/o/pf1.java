package o;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class pf1 extends DataSetObserver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pf1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pe7 pe7Var = (pe7) obj;
                pe7Var.m = true;
                pe7Var.notifyDataSetChanged();
                break;
            default:
                ac4 ac4Var = (ac4) obj;
                if (ac4Var.K.isShowing()) {
                    ac4Var.g();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pe7 pe7Var = (pe7) obj;
                pe7Var.m = false;
                pe7Var.notifyDataSetInvalidated();
                break;
            default:
                ((ac4) obj).dismiss();
                break;
        }
    }
}
