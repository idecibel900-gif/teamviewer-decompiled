package o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public final class gt implements nt, DialogInterface.OnClickListener {
    public od m;
    public ht n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f919o;
    public final /* synthetic */ ot p;

    public gt(ot otVar) {
        this.p = otVar;
    }

    @Override // o.nt
    public final boolean a() {
        od odVar = this.m;
        if (odVar != null) {
            return odVar.isShowing();
        }
        return false;
    }

    @Override // o.nt
    public final int b() {
        return 0;
    }

    @Override // o.nt
    public final void c(int i) {
        io.sentry.android.core.v0.c("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // o.nt
    public final void dismiss() {
        od odVar = this.m;
        if (odVar != null) {
            odVar.dismiss();
            this.m = null;
        }
    }

    @Override // o.nt
    public final CharSequence e() {
        return this.f919o;
    }

    @Override // o.nt
    public final Drawable f() {
        return null;
    }

    @Override // o.nt
    public final void h(CharSequence charSequence) {
        this.f919o = charSequence;
    }

    @Override // o.nt
    public final void j(Drawable drawable) {
        io.sentry.android.core.v0.c("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // o.nt
    public final void k(int i) {
        io.sentry.android.core.v0.c("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // o.nt
    public final void l(int i) {
        io.sentry.android.core.v0.c("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // o.nt
    public final void m(int i, int i2) {
        if (this.n == null) {
            return;
        }
        ot otVar = this.p;
        nd ndVar = new nd(otVar.getPopupContext());
        jd jdVar = (jd) ndVar.f1562o;
        CharSequence charSequence = this.f919o;
        if (charSequence != null) {
            jdVar.d = charSequence;
        }
        ht htVar = this.n;
        int selectedItemPosition = otVar.getSelectedItemPosition();
        jdVar.p = htVar;
        jdVar.q = this;
        jdVar.v = selectedItemPosition;
        jdVar.u = true;
        od odVarE = ndVar.e();
        this.m = odVarE;
        AlertController$RecycleListView alertController$RecycleListView = odVarE.s.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.m.show();
    }

    @Override // o.nt
    public final int n() {
        return 0;
    }

    @Override // o.nt
    public final void o(ListAdapter listAdapter) {
        this.n = (ht) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ot otVar = this.p;
        otVar.setSelection(i);
        if (otVar.getOnItemClickListener() != null) {
            otVar.performItemClick(null, i, this.n.getItemId(i));
        }
        dismiss();
    }
}
