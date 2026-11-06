package com.teamviewer.remotecontrolviewlib.guielement;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import kotlin.Metadata;
import o.bb5;
import o.gk6;
import o.s66;
import o.y66;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/teamviewer/remotecontrolviewlib/guielement/TVLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TVLinearLayoutManager extends LinearLayoutManager {
    public final bb5 Q;
    public int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TVLinearLayoutManager(Context context, bb5 bb5Var) {
        super(0);
        bb5Var.getClass();
        this.Q = bb5Var;
        this.R = Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void m0(s66 s66Var, y66 y66Var) {
        s66Var.getClass();
        y66Var.getClass();
        super.m0(s66Var, y66Var);
        View viewW0 = W0(G() - 1, -1, true, false);
        int iO = viewW0 == null ? -1 : a.O(viewW0);
        if (y66Var.f || iO <= this.R) {
            this.R = iO;
            View viewW1 = W0(G() - 1, -1, true, false);
            if (viewW1 != null) {
                a.O(viewW1);
            }
            View viewW2 = W0(0, G(), true, false);
            if (viewW2 != null) {
                a.O(viewW2);
            }
            N();
            this.Q.q(gk6.n, false);
        }
    }
}
