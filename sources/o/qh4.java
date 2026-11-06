package o;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qh4 {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public n77 h;
    public mg4 i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1831o;
    public final yi5 a = new yi5();
    public final HashSet b = new HashSet();
    public int p = 0;

    public final void a(String str) {
        xe4.a(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float fC = ta8.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap map = this.d;
                String str = (String) entry.getKey();
                gi4 gi4Var = (gi4) entry.getValue();
                float f = this.e / fC;
                int i = (int) (gi4Var.a * f);
                int i2 = (int) (gi4Var.b * f);
                gi4 gi4Var2 = new gi4(i, i2, gi4Var.c, gi4Var.d, gi4Var.e);
                Bitmap bitmap = gi4Var.f;
                if (bitmap != null) {
                    gi4Var2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, gi4Var2);
            }
        }
        this.e = fC;
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((c04) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
