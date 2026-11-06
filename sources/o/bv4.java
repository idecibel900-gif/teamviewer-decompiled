package o;

import android.content.DialogInterface;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class bv4 implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ cv4 a;

    public bv4(cv4 cv4Var) {
        this.a = cv4Var;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        cv4 cv4Var = this.a;
        HashSet hashSet = cv4Var.N0;
        boolean z2 = cv4Var.O0;
        if (z) {
            cv4Var.O0 = hashSet.add(cv4Var.Q0[i].toString()) | z2;
        } else {
            cv4Var.O0 = hashSet.remove(cv4Var.Q0[i].toString()) | z2;
        }
    }
}
