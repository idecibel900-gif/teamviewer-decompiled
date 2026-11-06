package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class zp4 extends o62 {
    public op4 A;
    public pp4 B;
    public final byte y;
    public final byte z;

    public zp4(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.y = (byte) 21;
            this.z = (byte) 22;
        } else {
            this.y = (byte) 22;
            this.z = (byte) 21;
        }
    }

    @Override // o.o62, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        gp4 gp4Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.A != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                gp4Var = (gp4) headerViewListAdapter.getWrappedAdapter();
            } else {
                gp4Var = (gp4) adapter;
                headersCount = 0;
            }
            pp4 pp4VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= gp4Var.getCount()) ? null : gp4Var.getItem(i);
            pp4 pp4Var = this.B;
            if (pp4Var != pp4VarB) {
                jp4 jp4Var = gp4Var.m;
                if (pp4Var != null) {
                    this.A.d(jp4Var, pp4Var);
                }
                this.B = pp4VarB;
                if (pp4VarB != null) {
                    this.A.s(jp4Var, pp4VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.y) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.z) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (gp4) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (gp4) adapter).m.c(false);
        return true;
    }

    public void setHoverListener(op4 op4Var) {
        this.A = op4Var;
    }

    @Override // o.o62, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
