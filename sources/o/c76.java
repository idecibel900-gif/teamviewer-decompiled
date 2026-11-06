package o;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class c76 {
    public static final List F = Collections.EMPTY_LIST;
    public RecyclerView D;
    public d66 E;
    public final View m;
    public WeakReference n;
    public int v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f498o = -1;
    public int p = -1;
    public long q = -1;
    public int r = -1;
    public int s = -1;
    public c76 t = null;
    public c76 u = null;
    public ArrayList w = null;
    public List x = null;
    public int y = 0;
    public s66 z = null;
    public boolean A = false;
    public int B = 0;
    public int C = -1;

    public c76(View view) {
        if (view != null) {
            this.m = view;
        } else {
            hk0.g("itemView may not be null");
            throw null;
        }
    }

    public final void a(int i) {
        this.v = i | this.v;
    }

    public final int b() {
        RecyclerView recyclerView = this.D;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.J(this);
    }

    public final int c() {
        int i = this.s;
        return i == -1 ? this.f498o : i;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.v & 1024) != 0 || (arrayList = this.w) == null || arrayList.size() == 0) ? F : this.x;
    }

    public final boolean e() {
        View view = this.m;
        return (view.getParent() == null || view.getParent() == this.D) ? false : true;
    }

    public final boolean f() {
        return (this.v & 1) != 0;
    }

    public final boolean g() {
        return (this.v & 4) != 0;
    }

    public final boolean h() {
        if ((this.v & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = be8.a;
        return !this.m.hasTransientState();
    }

    public final boolean i() {
        return (this.v & 8) != 0;
    }

    public final boolean j() {
        return this.z != null;
    }

    public final boolean k() {
        return (this.v & 256) != 0;
    }

    public final boolean l() {
        return (this.v & 2) != 0;
    }

    public final void m(int i, boolean z) {
        if (this.p == -1) {
            this.p = this.f498o;
        }
        int i2 = this.s;
        if (i2 == -1) {
            i2 = this.f498o;
            this.s = i2;
        }
        if (z) {
            this.s = i2 + i;
        }
        this.f498o += i;
        View view = this.m;
        if (view.getLayoutParams() != null) {
            ((m66) view.getLayoutParams()).f1441o = true;
        }
    }

    public final void n() {
        if (RecyclerView.N0 && k()) {
            hk0.m(this, ". ViewHolders should be fully detached before resetting.", "Attempting to reset temp-detached ViewHolder: ");
            return;
        }
        this.v = 0;
        this.f498o = -1;
        this.p = -1;
        this.q = -1L;
        this.s = -1;
        this.y = 0;
        this.t = null;
        this.u = null;
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.v &= -1025;
        this.B = 0;
        this.C = -1;
        RecyclerView.k(this);
    }

    public final void o(boolean z) {
        int i = this.y;
        int i2 = z ? i - 1 : i + 1;
        this.y = i2;
        if (i2 < 0) {
            this.y = 0;
            if (RecyclerView.N0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            io.sentry.android.core.v0.c("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i2 == 1) {
            this.v |= 16;
        } else if (z && i2 == 0) {
            this.v &= -17;
        }
        if (RecyclerView.O0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    public final boolean p() {
        return (this.v & 128) != 0;
    }

    public final boolean q() {
        return (this.v & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f498o + " id=" + this.q + ", oldPos=" + this.p + ", pLpos:" + this.s);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.A ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.v & 2) != 0) {
            sb.append(" update");
        }
        if (i()) {
            sb.append(" removed");
        }
        if (p()) {
            sb.append(" ignored");
        }
        if (k()) {
            sb.append(" tmpDetached");
        }
        if (!h()) {
            sb.append(" not recyclable(" + this.y + ")");
        }
        if ((this.v & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.m.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
