package o;

import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s66 {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public r66 g;
    public final /* synthetic */ RecyclerView h;

    public s66(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(c76 c76Var, boolean z) {
        RecyclerView.k(c76Var);
        View view = c76Var.m;
        RecyclerView recyclerView = this.h;
        e76 e76Var = recyclerView.z0;
        if (e76Var != null) {
            p3 p3VarJ = e76Var.j();
            be8.m(view, p3VarJ instanceof d76 ? (p3) ((d76) p3VarJ).q.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.A;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                io.sentry.h2.f();
                return;
            }
            d66 d66Var = recyclerView.y;
            if (d66Var != null) {
                d66Var.g(c76Var);
            }
            if (recyclerView.s0 != null) {
                recyclerView.s.z(c76Var);
            }
            if (RecyclerView.O0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + c76Var);
            }
        }
        c76Var.E = null;
        c76Var.D = null;
        r66 r66VarC = c();
        r66VarC.getClass();
        int i = c76Var.r;
        ArrayList arrayList2 = r66VarC.b(i).a;
        ((q66) r66VarC.a.get(i)).getClass();
        if (5 <= arrayList2.size()) {
            vt1.n(view);
        } else if (RecyclerView.N0 && arrayList2.contains(c76Var)) {
            hk0.g("this scrap item already exists");
        } else {
            c76Var.n();
            arrayList2.add(c76Var);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        y66 y66Var = recyclerView.s0;
        if (i >= 0 && i < y66Var.b()) {
            return !y66Var.g ? i : recyclerView.q.s(i, 0);
        }
        StringBuilder sbK = fx3.k(i, "invalid position ", ". State item count is ");
        sbK.append(y66Var.b());
        sbK.append(recyclerView.B());
        throw new IndexOutOfBoundsException(sbK.toString());
    }

    public final r66 c() {
        if (this.g == null) {
            r66 r66Var = new r66();
            r66Var.a = new SparseArray();
            r66Var.b = 0;
            r66Var.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = r66Var;
            d();
        }
        return this.g;
    }

    public final void d() {
        RecyclerView recyclerView;
        d66 d66Var;
        r66 r66Var = this.g;
        if (r66Var == null || (d66Var = (recyclerView = this.h).y) == null || !recyclerView.E) {
            return;
        }
        r66Var.c.add(d66Var);
    }

    public final void e(d66 d66Var, boolean z) {
        r66 r66Var = this.g;
        if (r66Var != null) {
            SparseArray sparseArray = r66Var.a;
            Set set = r66Var.c;
            set.remove(d66Var);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((q66) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    vt1.n(((c76) arrayList.get(i2)).m);
                }
            }
        }
    }

    public final void f() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.S0) {
            rr0 rr0Var = this.h.r0;
            int[] iArr = (int[]) rr0Var.e;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            rr0Var.d = 0;
        }
    }

    public final void g(int i) {
        if (RecyclerView.O0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.c;
        c76 c76Var = (c76) arrayList.get(i);
        if (RecyclerView.O0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + c76Var);
        }
        a(c76Var, true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        c76 c76VarM = RecyclerView.M(view);
        boolean zK = c76VarM.k();
        RecyclerView recyclerView = this.h;
        if (zK) {
            recyclerView.removeDetachedView(view, false);
        }
        if (c76VarM.j()) {
            c76VarM.z.l(c76VarM);
        } else if (c76VarM.q()) {
            c76VarM.v &= -33;
        }
        i(c76VarM);
        if (recyclerView.b0 == null || c76VarM.h()) {
            return;
        }
        recyclerView.b0.d(c76VarM);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7 A[LOOP:2: B:51:0x00aa->B:55:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ba A[EDGE_INSN: B:84:0x00ba->B:56:0x00ba BREAK  A[LOOP:1: B:47:0x0095->B:54:0x00b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ba A[EDGE_INSN: B:85:0x00ba->B:56:0x00ba BREAK  A[LOOP:1: B:47:0x0095->B:54:0x00b4, LOOP_LABEL: LOOP:1: B:47:0x0095->B:54:0x00b4], SYNTHETIC] */
    public final void i(c76 c76Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.h;
        rr0 rr0Var = recyclerView.r0;
        boolean zJ = c76Var.j();
        View view = c76Var.m;
        boolean z3 = false;
        boolean z4 = true;
        if (zJ || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(c76Var.j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.B());
            throw new IllegalArgumentException(sb.toString());
        }
        if (c76Var.k()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(c76Var);
            gk0.p(sb2, recyclerView.B());
            return;
        }
        if (c76Var.p()) {
            hk0.g("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.B()));
            return;
        }
        if ((c76Var.v & 16) == 0) {
            WeakHashMap weakHashMap = be8.a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        boolean z5 = RecyclerView.N0;
        ArrayList arrayList = this.c;
        if (z5 && arrayList.contains(c76Var)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(c76Var);
            gk0.p(sb3, recyclerView.B());
            return;
        }
        if (c76Var.h()) {
            if (this.f <= 0 || (c76Var.v & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f && size > 0) {
                    g(0);
                    size--;
                }
                if (RecyclerView.S0 && size > 0) {
                    int i5 = c76Var.f498o;
                    if (((int[]) rr0Var.e) != null) {
                        int i6 = rr0Var.d * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((c76) arrayList.get(i)).f498o;
                                    if (((int[]) rr0Var.e) != null) {
                                        break;
                                    }
                                    i3 = rr0Var.d * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (((int[]) rr0Var.e)[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (((int[]) rr0Var.e)[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((c76) arrayList.get(i)).f498o;
                            if (((int[]) rr0Var.e) != null) {
                                break;
                                break;
                            }
                            i3 = rr0Var.d * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) rr0Var.e)[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, c76Var);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                a(c76Var, true);
            }
            z3 = z2;
        } else {
            if (RecyclerView.O0) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.B()));
            }
            z4 = false;
        }
        recyclerView.s.z(c76Var);
        if (z3 || z4 || !z) {
            return;
        }
        vt1.n(view);
        c76Var.E = null;
        c76Var.D = null;
    }

    public final void j(View view) {
        i66 i66Var;
        c76 c76VarM = RecyclerView.M(view);
        int i = c76VarM.v & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && c76VarM.l() && (i66Var = recyclerView.b0) != null) {
            nk1 nk1Var = (nk1) i66Var;
            if (c76VarM.d().isEmpty() && nk1Var.g && !c76VarM.g()) {
                ArrayList arrayList = this.b;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.b = arrayList;
                }
                c76VarM.z = this;
                c76VarM.A = true;
                arrayList.add(c76VarM);
                return;
            }
        }
        if (c76VarM.g() && !c76VarM.i() && !recyclerView.y.b) {
            hk0.g("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.B()));
            return;
        }
        c76VarM.z = this;
        c76VarM.A = false;
        this.a.add(c76VarM);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01db  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:127:0x020f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0219  */
    /* JADX WARN: Code duplicated, block: B:130:0x0224  */
    /* JADX WARN: Code duplicated, block: B:132:0x022a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0235  */
    /* JADX WARN: Code duplicated, block: B:137:0x0253  */
    /* JADX WARN: Code duplicated, block: B:140:0x025e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0266  */
    /* JADX WARN: Code duplicated, block: B:144:0x0270  */
    /* JADX WARN: Code duplicated, block: B:146:0x027e  */
    /* JADX WARN: Code duplicated, block: B:148:0x028a  */
    /* JADX WARN: Code duplicated, block: B:161:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:176:0x0313  */
    /* JADX WARN: Code duplicated, block: B:178:0x0319  */
    /* JADX WARN: Code duplicated, block: B:180:0x031d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0341  */
    /* JADX WARN: Code duplicated, block: B:185:0x0349  */
    /* JADX WARN: Code duplicated, block: B:187:0x0351  */
    /* JADX WARN: Code duplicated, block: B:190:0x0364 A[LOOP:4: B:186:0x034f->B:190:0x0364, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:191:0x0367 A[EDGE_INSN: B:191:0x0367->B:192:0x0368 BREAK  A[LOOP:4: B:186:0x034f->B:190:0x0364]] */
    /* JADX WARN: Code duplicated, block: B:193:0x036a  */
    /* JADX WARN: Code duplicated, block: B:196:0x0372  */
    /* JADX WARN: Code duplicated, block: B:198:0x037a  */
    /* JADX WARN: Code duplicated, block: B:208:0x039a A[Catch: all -> 0x03fc, TryCatch #0 {all -> 0x03fc, blocks: (B:206:0x0394, B:208:0x039a, B:209:0x03ab, B:211:0x03b7, B:224:0x03f4, B:225:0x03fb), top: B:361:0x0394 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x03b7 A[Catch: all -> 0x03fc, TRY_LEAVE, TryCatch #0 {all -> 0x03fc, blocks: (B:206:0x0394, B:208:0x039a, B:209:0x03ab, B:211:0x03b7, B:224:0x03f4, B:225:0x03fb), top: B:361:0x0394 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:223:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:224:0x03f4 A[Catch: all -> 0x03fc, TRY_ENTER, TryCatch #0 {all -> 0x03fc, blocks: (B:206:0x0394, B:208:0x039a, B:209:0x03ab, B:211:0x03b7, B:224:0x03f4, B:225:0x03fb), top: B:361:0x0394 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0423  */
    /* JADX WARN: Code duplicated, block: B:238:0x0435  */
    /* JADX WARN: Code duplicated, block: B:240:0x043d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0461  */
    /* JADX WARN: Code duplicated, block: B:248:0x0467  */
    /* JADX WARN: Code duplicated, block: B:257:0x0480  */
    /* JADX WARN: Code duplicated, block: B:264:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:266:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:270:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:272:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:273:0x04db  */
    /* JADX WARN: Code duplicated, block: B:276:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:277:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:279:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:281:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:284:0x0505  */
    /* JADX WARN: Code duplicated, block: B:287:0x051e  */
    /* JADX WARN: Code duplicated, block: B:289:0x0524  */
    /* JADX WARN: Code duplicated, block: B:296:0x0561  */
    /* JADX WARN: Code duplicated, block: B:303:0x057a  */
    /* JADX WARN: Code duplicated, block: B:305:0x057e  */
    /* JADX WARN: Code duplicated, block: B:308:0x058f  */
    /* JADX WARN: Code duplicated, block: B:311:0x059a  */
    /* JADX WARN: Code duplicated, block: B:315:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:318:0x05be  */
    /* JADX WARN: Code duplicated, block: B:339:0x0603  */
    /* JADX WARN: Code duplicated, block: B:342:0x0608  */
    /* JADX WARN: Code duplicated, block: B:347:0x0613  */
    /* JADX WARN: Code duplicated, block: B:348:0x061d  */
    /* JADX WARN: Code duplicated, block: B:350:0x0623  */
    /* JADX WARN: Code duplicated, block: B:351:0x062d  */
    /* JADX WARN: Code duplicated, block: B:354:0x0633 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:356:0x0637  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c A[EDGE_INSN: B:35:0x007c->B:36:0x007d BREAK  A[LOOP:0: B:14:0x0024->B:20:0x003e]] */
    /* JADX WARN: Code duplicated, block: B:368:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:72:0x010f  */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0138 A[EDGE_INSN: B:80:0x0138->B:101:0x01b9 BREAK  A[LOOP:1: B:43:0x0090->B:55:0x00bc]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0148  */
    /* JADX WARN: Code duplicated, block: B:83:0x015a  */
    /* JADX WARN: Code duplicated, block: B:85:0x016e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0174  */
    /* JADX WARN: Code duplicated, block: B:89:0x017b  */
    /* JADX WARN: Instruction removed from duplicated block: B:180:0x031d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x015a, please report this as an issue */
    public final c76 k(int i, long j) {
        c76 c76VarF;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        long j2;
        long j3;
        View view;
        boolean z3;
        int iS;
        int i2;
        long nanoTime;
        boolean z4;
        d66 d66Var;
        boolean z5;
        long nanoTime2;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z6;
        boolean z7;
        p3 p3Var;
        ArrayList arrayList3;
        ViewGroup.LayoutParams layoutParams;
        boolean z8;
        long j5;
        ViewGroup.LayoutParams layoutParams2;
        m66 m66Var;
        boolean z9;
        int i3;
        int iS2;
        int iC;
        d66 d66Var2;
        long nanoTime3;
        long nanoTime4;
        long j6;
        RecyclerView recyclerViewG;
        long j7;
        q66 q66Var;
        c76 c76Var;
        ArrayList arrayList4;
        int size;
        long jB;
        int size2;
        int size3;
        c76 c76Var2;
        ArrayList arrayList5;
        long j8;
        ArrayList arrayList6;
        int size4;
        int i4;
        ArrayList arrayList7;
        int size5;
        int i5;
        View view2;
        int size6;
        int i6;
        c76 c76Var3;
        c76 c76VarM;
        rq0 rq0Var;
        je0 je0Var;
        int iIndexOfChild;
        je0 je0Var2;
        int iIndexOfChild2;
        int iB;
        c76 c76VarM2;
        int i7;
        boolean z10;
        c76 c76Var4;
        int size7;
        int iS3;
        RecyclerView recyclerView = this.h;
        y66 y66Var = recyclerView.s0;
        if (i < 0 || i >= y66Var.b()) {
            StringBuilder sbJ = fx3.j(i, i, "Invalid item position ", "(", "). Item count:");
            sbJ.append(y66Var.b());
            sbJ.append(recyclerView.B());
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        if (y66Var.g) {
            ArrayList arrayList8 = this.b;
            if (arrayList8 != null && (size7 = arrayList8.size()) != 0) {
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        if (recyclerView.y.b && (iS3 = recyclerView.q.s(i, 0)) > 0 && iS3 < recyclerView.y.a()) {
                            long jB2 = recyclerView.y.b(iS3);
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size7) {
                                    c76VarF = null;
                                    break;
                                }
                                c76 c76Var5 = (c76) this.b.get(i9);
                                if (!c76Var5.q() && c76Var5.q == jB2) {
                                    c76Var5.a(32);
                                    c76VarF = c76Var5;
                                    break;
                                }
                                i9++;
                            }
                        } else {
                            c76VarF = null;
                            break;
                        }
                    } else {
                        c76VarF = (c76) this.b.get(i8);
                        if (!c76VarF.q() && c76VarF.c() == i) {
                            c76VarF.a(32);
                            break;
                        }
                        i8++;
                    }
                }
            } else {
                c76VarF = null;
                break;
            }
            if (c76VarF != null) {
                z = true;
            }
            arrayList = this.a;
            arrayList2 = this.c;
            if (c76VarF == null) {
                size4 = arrayList.size();
                i4 = 0;
                while (true) {
                    if (i4 < size4) {
                        arrayList7 = (ArrayList) recyclerView.r.e;
                        size5 = arrayList7.size();
                        i5 = 0;
                        while (true) {
                            if (i5 < size5) {
                                z2 = true;
                                view2 = null;
                                break;
                            }
                            view2 = (View) arrayList7.get(i5);
                            c76VarM2 = RecyclerView.M(view2);
                            z2 = true;
                            if (c76VarM2.c() != i && !c76VarM2.g() && !c76VarM2.i()) {
                                break;
                            }
                            i5++;
                        }
                        if (view2 != null) {
                            size6 = arrayList2.size();
                            i6 = 0;
                            while (true) {
                                if (i6 < size6) {
                                    c76VarF = null;
                                    break;
                                }
                                c76Var3 = (c76) arrayList2.get(i6);
                                if (c76Var3.g() && c76Var3.c() == i && !c76Var3.e()) {
                                    arrayList2.remove(i6);
                                    if (RecyclerView.O0) {
                                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + c76Var3);
                                    }
                                    c76VarF = c76Var3;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            c76VarM = RecyclerView.M(view2);
                            rq0Var = recyclerView.r;
                            je0Var = (je0) rq0Var.d;
                            iIndexOfChild = ((c66) rq0Var.c).m.indexOfChild(view2);
                            if (iIndexOfChild >= 0) {
                                an4.i(view2, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (je0Var.d(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                            }
                            je0Var.a(iIndexOfChild);
                            rq0Var.n(view2);
                            rq0 rq0Var2 = recyclerView.r;
                            je0Var2 = (je0) rq0Var2.d;
                            iIndexOfChild2 = ((c66) rq0Var2.c).m.indexOfChild(view2);
                            if (iIndexOfChild2 == -1 && !je0Var2.d(iIndexOfChild2)) {
                                iB = iIndexOfChild2 - je0Var2.b(iIndexOfChild2);
                            } else {
                                iB = -1;
                            }
                            if (iB != -1) {
                                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb.append(c76VarM);
                                io.sentry.h2.l(sb, recyclerView.B());
                                return null;
                            }
                            recyclerView.r.f(iB);
                            j(view2);
                            c76VarM.a(8224);
                            c76VarF = c76VarM;
                            break;
                        }
                    } else {
                        c76Var4 = (c76) arrayList.get(i4);
                        if (c76Var4.q() && c76Var4.c() == i && !c76Var4.g() && (y66Var.g || !c76Var4.i())) {
                            c76Var4.a(32);
                            c76VarF = c76Var4;
                            z2 = true;
                            break;
                        }
                        i4++;
                    }
                }
                if (c76VarF != null) {
                    if (c76VarF.i()) {
                        i7 = c76VarF.f498o;
                        if (i7 >= 0 || i7 >= recyclerView.y.a()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c76VarF + recyclerView.B());
                        }
                        if (y66Var.g || recyclerView.y.c(c76VarF.f498o) == c76VarF.r) {
                            d66 d66Var3 = recyclerView.y;
                            if (!d66Var3.b || c76VarF.q == d66Var3.b(c76VarF.f498o)) {
                                z10 = z2;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                    } else {
                        if (!RecyclerView.N0 && !y66Var.g) {
                            hk0.l("should not receive a removed view unless it is pre layout".concat(recyclerView.B()));
                            return null;
                        }
                        z10 = y66Var.g;
                    }
                    if (z10) {
                        z = z2;
                    } else {
                        c76VarF.a(4);
                        if (c76VarF.j()) {
                            recyclerView.removeDetachedView(c76VarF.m, false);
                            c76VarF.z.l(c76VarF);
                        } else if (c76VarF.q()) {
                            c76VarF.v &= -33;
                        }
                        i(c76VarF);
                        c76VarF = null;
                    }
                }
            } else {
                z2 = true;
            }
            if (c76VarF == null) {
                iS2 = recyclerView.q.s(i, 0);
                if (iS2 >= 0) {
                    j2 = 3;
                    if (iS2 < recyclerView.y.a()) {
                        iC = recyclerView.y.c(iS2);
                        d66Var2 = recyclerView.y;
                        j3 = 4;
                        if (d66Var2.b) {
                            jB = d66Var2.b(iS2);
                            size2 = arrayList.size() - 1;
                            while (true) {
                                if (size2 >= 0) {
                                    size3 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size3 >= 0) {
                                            c76Var2 = (c76) arrayList2.get(size3);
                                            if (c76Var2.q == jB || c76Var2.e()) {
                                                size3--;
                                            } else if (iC == c76Var2.r) {
                                                arrayList2.remove(size3);
                                            } else {
                                                g(size3);
                                            }
                                        }
                                        c76VarF = null;
                                        break;
                                    }
                                }
                                c76Var2 = (c76) arrayList.get(size2);
                                arrayList5 = arrayList;
                                j8 = c76Var2.q;
                                View view3 = c76Var2.m;
                                if (j8 == jB || c76Var2.q()) {
                                    arrayList6 = arrayList5;
                                } else if (iC == c76Var2.r) {
                                    c76Var2.a(32);
                                    if (c76Var2.i() && !y66Var.g) {
                                        c76Var2.v = (c76Var2.v & (-15)) | 2;
                                    }
                                } else {
                                    arrayList6 = arrayList5;
                                    arrayList6.remove(size2);
                                    recyclerView.removeDetachedView(view3, false);
                                    c76 c76VarM3 = RecyclerView.M(view3);
                                    c76VarM3.z = null;
                                    c76VarM3.A = false;
                                    c76VarM3.v &= -33;
                                    i(c76VarM3);
                                }
                                size2--;
                                arrayList = arrayList6;
                                c76VarF = c76Var2;
                                break;
                            }
                            if (c76VarF != null) {
                                c76VarF.f498o = iS2;
                                z = z2;
                            }
                        }
                        if (c76VarF == null) {
                            if (RecyclerView.O0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                            }
                            q66Var = (q66) c().a.get(iC);
                            if (q66Var != null) {
                                c76Var = null;
                                break;
                            }
                            arrayList4 = q66Var.a;
                            if (arrayList4.isEmpty()) {
                                size = arrayList4.size() - 1;
                                while (true) {
                                    if (size >= 0) {
                                        c76Var = null;
                                        break;
                                    }
                                    if (!((c76) arrayList4.get(size)).e()) {
                                        c76Var = (c76) arrayList4.remove(size);
                                        break;
                                    }
                                    size--;
                                }
                            } else {
                                c76Var = null;
                                break;
                            }
                            if (c76Var != null) {
                                c76Var.n();
                                boolean z11 = RecyclerView.N0;
                            }
                            c76VarF = c76Var;
                        }
                        if (c76VarF == null) {
                            nanoTime3 = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                j7 = this.g.b(iC).b;
                                if (j7 != 0 && j7 + nanoTime3 >= j) {
                                    return null;
                                }
                            }
                            d66 d66Var4 = recyclerView.y;
                            d66Var4.getClass();
                            try {
                                if (r08.a()) {
                                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iC)));
                                }
                                c76VarF = d66Var4.f(recyclerView, iC);
                                if (c76VarF.m.getParent() == null) {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                                c76VarF.r = iC;
                                Trace.endSection();
                                if (RecyclerView.S0 && (recyclerViewG = RecyclerView.G(c76VarF.m)) != null) {
                                    c76VarF.n = new WeakReference(recyclerViewG);
                                }
                                nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                                q66 q66VarB = this.g.b(iC);
                                j6 = q66VarB.b;
                                if (j6 != 0) {
                                    nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
                                }
                                q66VarB.b = nanoTime4;
                                if (RecyclerView.O0) {
                                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                }
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        }
                    }
                }
                StringBuilder sbJ2 = fx3.j(i, iS2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                sbJ2.append(y66Var.b());
                sbJ2.append(recyclerView.B());
                throw new IndexOutOfBoundsException(sbJ2.toString());
            }
            j2 = 3;
            j3 = 4;
            view = c76VarF.m;
            if (z && !y66Var.g) {
                i3 = c76VarF.v;
                if ((i3 & 8192) != 0) {
                    c76VarF.v = i3 & (-8193);
                    if (y66Var.j) {
                        i66.b(c76VarF);
                        i66 i66Var = recyclerView.b0;
                        c76VarF.d();
                        i66Var.getClass();
                        lf1 lf1Var = new lf1((byte) 5);
                        lf1Var.a(c76VarF);
                        recyclerView.a0(c76VarF, lf1Var);
                    }
                }
            }
            if (y66Var.g || !c76VarF.f()) {
                if (c76VarF.f() || (c76VarF.v & 2) != 0 || c76VarF.g()) {
                    if (!RecyclerView.N0 && c76VarF.i()) {
                        StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                        sb2.append(c76VarF);
                        io.sentry.h2.l(sb2, recyclerView.B());
                        return null;
                    }
                    z3 = false;
                    iS = recyclerView.q.s(i, 0);
                    c76VarF.E = null;
                    c76VarF.D = recyclerView;
                    i2 = c76VarF.r;
                    nanoTime = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j5 = this.g.b(i2).c;
                        if (j5 != 0 || j5 + nanoTime < j) {
                            if (c76VarF.k()) {
                                recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                                z4 = z2;
                            } else {
                                z4 = false;
                            }
                            d66Var = recyclerView.y;
                            d66Var.getClass();
                            if (c76VarF.E == null) {
                                z5 = z2;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                c76VarF.f498o = iS;
                                if (d66Var.b) {
                                    c76VarF.q = d66Var.b(iS);
                                }
                                c76VarF.v = (c76VarF.v & (-520)) | 1;
                                if (r08.a()) {
                                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(c76VarF.r)));
                                }
                            }
                            c76VarF.E = d66Var;
                            if (RecyclerView.N0) {
                                if (view.getParent() != null && view.isAttachedToWindow() != c76VarF.k()) {
                                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + c76VarF.k() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + c76VarF);
                                }
                                if (view.getParent() == null && view.isAttachedToWindow()) {
                                    yq4.t(c76VarF, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                    return null;
                                }
                            }
                            c76VarF.d();
                            d66Var.e(c76VarF, iS);
                            if (z5) {
                                arrayList3 = c76VarF.w;
                                if (arrayList3 != null) {
                                    arrayList3.clear();
                                }
                                c76VarF.v &= -1025;
                                layoutParams = view.getLayoutParams();
                                if (layoutParams instanceof m66) {
                                    ((m66) layoutParams).f1441o = z2;
                                }
                                Trace.endSection();
                            }
                            if (z4) {
                                recyclerView.detachViewFromParent(view);
                            }
                            nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            q66 q66VarB2 = this.g.b(c76VarF.r);
                            j4 = q66VarB2.c;
                            if (j4 != 0) {
                                nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                            }
                            q66VarB2.c = nanoTime2;
                            accessibilityManager = recyclerView.N;
                            if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                                z6 = true;
                                if (view.getImportantForAccessibility() == 0) {
                                    view.setImportantForAccessibility(1);
                                }
                                e76 e76Var = recyclerView.z0;
                                if (e76Var != null) {
                                    p3 p3VarJ = e76Var.j();
                                    if (p3VarJ instanceof d76) {
                                        d76 d76Var = (d76) p3VarJ;
                                        View.AccessibilityDelegate accessibilityDelegateE = be8.e(view);
                                        if (accessibilityDelegateE == null) {
                                            p3Var = null;
                                        } else {
                                            p3Var = accessibilityDelegateE instanceof o3 ? ((o3) accessibilityDelegateE).a : new p3(accessibilityDelegateE);
                                        }
                                        if (p3Var != null && p3Var != d76Var) {
                                            d76Var.q.put(view, p3Var);
                                        }
                                    }
                                    be8.m(view, p3VarJ);
                                }
                            } else {
                                z6 = true;
                            }
                            if (y66Var.g) {
                                c76VarF.s = i;
                            }
                            z7 = z6;
                        } else {
                            z7 = false;
                            z6 = z2;
                        }
                    } else {
                        if (c76VarF.k()) {
                            recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                            z4 = z2;
                        } else {
                            z4 = false;
                        }
                        d66Var = recyclerView.y;
                        d66Var.getClass();
                        if (c76VarF.E == null) {
                            z5 = z2;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            c76VarF.f498o = iS;
                            if (d66Var.b) {
                                c76VarF.q = d66Var.b(iS);
                            }
                            c76VarF.v = (c76VarF.v & (-520)) | 1;
                            if (r08.a()) {
                                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(c76VarF.r)));
                            }
                        }
                        c76VarF.E = d66Var;
                        if (RecyclerView.N0) {
                            if (view.getParent() != null) {
                            }
                            if (view.getParent() == null) {
                                yq4.t(c76VarF, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                return null;
                            }
                        }
                        c76VarF.d();
                        d66Var.e(c76VarF, iS);
                        if (z5) {
                            arrayList3 = c76VarF.w;
                            if (arrayList3 != null) {
                                arrayList3.clear();
                            }
                            c76VarF.v &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof m66) {
                                ((m66) layoutParams).f1441o = z2;
                            }
                            Trace.endSection();
                        }
                        if (z4) {
                            recyclerView.detachViewFromParent(view);
                        }
                        nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        q66 q66VarB3 = this.g.b(c76VarF.r);
                        j4 = q66VarB3.c;
                        if (j4 != 0) {
                            nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                        }
                        q66VarB3.c = nanoTime2;
                        accessibilityManager = recyclerView.N;
                        if (accessibilityManager == null) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (y66Var.g) {
                            c76VarF.s = i;
                        }
                        z7 = z6;
                    }
                    z8 = z7;
                }
                layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    m66Var = (m66) recyclerView.generateDefaultLayoutParams();
                    view.setLayoutParams(m66Var);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    m66Var = (m66) layoutParams2;
                } else {
                    m66Var = (m66) recyclerView.generateLayoutParams(layoutParams2);
                    view.setLayoutParams(m66Var);
                }
                m66Var.m = c76VarF;
                if (z || !z8) {
                    z9 = z3;
                } else {
                    z9 = z6;
                }
                m66Var.p = z9;
                return c76VarF;
            }
            c76VarF.s = i;
            z6 = z2;
            z3 = false;
            z8 = false;
            layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                m66Var = (m66) recyclerView.generateDefaultLayoutParams();
                view.setLayoutParams(m66Var);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                m66Var = (m66) recyclerView.generateLayoutParams(layoutParams2);
                view.setLayoutParams(m66Var);
            } else {
                m66Var = (m66) layoutParams2;
            }
            m66Var.m = c76VarF;
            if (z) {
                z9 = z3;
            } else {
                z9 = z3;
            }
            m66Var.p = z9;
            return c76VarF;
        }
        c76VarF = null;
        z = false;
        arrayList = this.a;
        arrayList2 = this.c;
        if (c76VarF == null) {
            size4 = arrayList.size();
            i4 = 0;
            while (true) {
                if (i4 < size4) {
                    arrayList7 = (ArrayList) recyclerView.r.e;
                    size5 = arrayList7.size();
                    i5 = 0;
                    while (true) {
                        if (i5 < size5) {
                            z2 = true;
                            view2 = null;
                            break;
                        }
                        view2 = (View) arrayList7.get(i5);
                        c76VarM2 = RecyclerView.M(view2);
                        z2 = true;
                        if (c76VarM2.c() != i) {
                        }
                        i5++;
                    }
                    if (view2 != null) {
                        size6 = arrayList2.size();
                        i6 = 0;
                        while (true) {
                            if (i6 < size6) {
                                c76VarF = null;
                                break;
                            }
                            c76Var3 = (c76) arrayList2.get(i6);
                            if (c76Var3.g()) {
                            }
                            i6++;
                        }
                    } else {
                        c76VarM = RecyclerView.M(view2);
                        rq0Var = recyclerView.r;
                        je0Var = (je0) rq0Var.d;
                        iIndexOfChild = ((c66) rq0Var.c).m.indexOfChild(view2);
                        if (iIndexOfChild >= 0) {
                            an4.i(view2, "view is not a child, cannot hide ");
                            return null;
                        }
                        if (je0Var.d(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                        }
                        je0Var.a(iIndexOfChild);
                        rq0Var.n(view2);
                        rq0 rq0Var3 = recyclerView.r;
                        je0Var2 = (je0) rq0Var3.d;
                        iIndexOfChild2 = ((c66) rq0Var3.c).m.indexOfChild(view2);
                        if (iIndexOfChild2 == -1) {
                            iB = -1;
                        } else {
                            iB = iIndexOfChild2 - je0Var2.b(iIndexOfChild2);
                        }
                        if (iB != -1) {
                            StringBuilder sb3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb3.append(c76VarM);
                            io.sentry.h2.l(sb3, recyclerView.B());
                            return null;
                        }
                        recyclerView.r.f(iB);
                        j(view2);
                        c76VarM.a(8224);
                        c76VarF = c76VarM;
                        break;
                    }
                } else {
                    c76Var4 = (c76) arrayList.get(i4);
                    if (c76Var4.q()) {
                    }
                    i4++;
                }
            }
            if (c76VarF != null) {
                if (c76VarF.i()) {
                    i7 = c76VarF.f498o;
                    if (i7 >= 0) {
                    }
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c76VarF + recyclerView.B());
                }
                if (!RecyclerView.N0) {
                }
                z10 = y66Var.g;
                if (z10) {
                    c76VarF.a(4);
                    if (c76VarF.j()) {
                        recyclerView.removeDetachedView(c76VarF.m, false);
                        c76VarF.z.l(c76VarF);
                    } else if (c76VarF.q()) {
                        c76VarF.v &= -33;
                    }
                    i(c76VarF);
                    c76VarF = null;
                } else {
                    z = z2;
                }
            }
        } else {
            z2 = true;
        }
        if (c76VarF == null) {
            iS2 = recyclerView.q.s(i, 0);
            if (iS2 >= 0) {
                j2 = 3;
                if (iS2 < recyclerView.y.a()) {
                    iC = recyclerView.y.c(iS2);
                    d66Var2 = recyclerView.y;
                    j3 = 4;
                    if (d66Var2.b) {
                        jB = d66Var2.b(iS2);
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                size3 = arrayList2.size() - 1;
                                while (true) {
                                    if (size3 >= 0) {
                                        c76Var2 = (c76) arrayList2.get(size3);
                                        if (c76Var2.q == jB) {
                                        }
                                        size3--;
                                    }
                                    c76VarF = null;
                                    break;
                                }
                            }
                            c76Var2 = (c76) arrayList.get(size2);
                            arrayList5 = arrayList;
                            j8 = c76Var2.q;
                            View view4 = c76Var2.m;
                            if (j8 == jB) {
                                arrayList6 = arrayList5;
                            } else {
                                arrayList6 = arrayList5;
                            }
                            size2--;
                            arrayList = arrayList6;
                            c76VarF = c76Var2;
                            break;
                        }
                        if (c76VarF != null) {
                            c76VarF.f498o = iS2;
                            z = z2;
                        }
                    }
                    if (c76VarF == null) {
                        if (RecyclerView.O0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                        }
                        q66Var = (q66) c().a.get(iC);
                        if (q66Var != null) {
                            c76Var = null;
                            break;
                        }
                        arrayList4 = q66Var.a;
                        if (arrayList4.isEmpty()) {
                            c76Var = null;
                            break;
                        }
                        size = arrayList4.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                c76Var = null;
                                break;
                            }
                            if (!((c76) arrayList4.get(size)).e()) {
                                c76Var = (c76) arrayList4.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (c76Var != null) {
                            c76Var.n();
                            boolean z12 = RecyclerView.N0;
                        }
                        c76VarF = c76Var;
                    }
                    if (c76VarF == null) {
                        nanoTime3 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j7 = this.g.b(iC).b;
                            if (j7 != 0) {
                                return null;
                            }
                        }
                        d66 d66Var5 = recyclerView.y;
                        d66Var5.getClass();
                        if (r08.a()) {
                            Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iC)));
                        }
                        c76VarF = d66Var5.f(recyclerView, iC);
                        if (c76VarF.m.getParent() == null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        c76VarF.r = iC;
                        Trace.endSection();
                        if (RecyclerView.S0) {
                            c76VarF.n = new WeakReference(recyclerViewG);
                        }
                        nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        q66 q66VarB4 = this.g.b(iC);
                        j6 = q66VarB4.b;
                        if (j6 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
                        }
                        q66VarB4.b = nanoTime4;
                        if (RecyclerView.O0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    }
                }
            }
            StringBuilder sbJ3 = fx3.j(i, iS2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
            sbJ3.append(y66Var.b());
            sbJ3.append(recyclerView.B());
            throw new IndexOutOfBoundsException(sbJ3.toString());
        }
        j2 = 3;
        j3 = 4;
        view = c76VarF.m;
        if (z) {
            i3 = c76VarF.v;
            if ((i3 & 8192) != 0) {
                c76VarF.v = i3 & (-8193);
                if (y66Var.j) {
                    i66.b(c76VarF);
                    i66 i66Var2 = recyclerView.b0;
                    c76VarF.d();
                    i66Var2.getClass();
                    lf1 lf1Var2 = new lf1((byte) 5);
                    lf1Var2.a(c76VarF);
                    recyclerView.a0(c76VarF, lf1Var2);
                }
            }
        }
        if (y66Var.g) {
            if (c76VarF.f()) {
            }
            if (!RecyclerView.N0) {
            }
            z3 = false;
            iS = recyclerView.q.s(i, 0);
            c76VarF.E = null;
            c76VarF.D = recyclerView;
            i2 = c76VarF.r;
            nanoTime = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j5 = this.g.b(i2).c;
                if (j5 != 0) {
                    if (c76VarF.k()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    d66Var = recyclerView.y;
                    d66Var.getClass();
                    if (c76VarF.E == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        c76VarF.f498o = iS;
                        if (d66Var.b) {
                            c76VarF.q = d66Var.b(iS);
                        }
                        c76VarF.v = (c76VarF.v & (-520)) | 1;
                        if (r08.a()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(c76VarF.r)));
                        }
                    }
                    c76VarF.E = d66Var;
                    if (RecyclerView.N0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            yq4.t(c76VarF, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    c76VarF.d();
                    d66Var.e(c76VarF, iS);
                    if (z5) {
                        arrayList3 = c76VarF.w;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        c76VarF.v &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof m66) {
                            ((m66) layoutParams).f1441o = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    q66 q66VarB5 = this.g.b(c76VarF.r);
                    j4 = q66VarB5.c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    q66VarB5.c = nanoTime2;
                    accessibilityManager = recyclerView.N;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (y66Var.g) {
                        c76VarF.s = i;
                    }
                    z7 = z6;
                } else {
                    if (c76VarF.k()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    d66Var = recyclerView.y;
                    d66Var.getClass();
                    if (c76VarF.E == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        c76VarF.f498o = iS;
                        if (d66Var.b) {
                            c76VarF.q = d66Var.b(iS);
                        }
                        c76VarF.v = (c76VarF.v & (-520)) | 1;
                        if (r08.a()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(c76VarF.r)));
                        }
                    }
                    c76VarF.E = d66Var;
                    if (RecyclerView.N0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            yq4.t(c76VarF, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    c76VarF.d();
                    d66Var.e(c76VarF, iS);
                    if (z5) {
                        arrayList3 = c76VarF.w;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        c76VarF.v &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof m66) {
                            ((m66) layoutParams).f1441o = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    q66 q66VarB6 = this.g.b(c76VarF.r);
                    j4 = q66VarB6.c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    q66VarB6.c = nanoTime2;
                    accessibilityManager = recyclerView.N;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (y66Var.g) {
                        c76VarF.s = i;
                    }
                    z7 = z6;
                }
            } else {
                if (c76VarF.k()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    z4 = z2;
                } else {
                    z4 = false;
                }
                d66Var = recyclerView.y;
                d66Var.getClass();
                if (c76VarF.E == null) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                if (z5) {
                    c76VarF.f498o = iS;
                    if (d66Var.b) {
                        c76VarF.q = d66Var.b(iS);
                    }
                    c76VarF.v = (c76VarF.v & (-520)) | 1;
                    if (r08.a()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(c76VarF.r)));
                    }
                }
                c76VarF.E = d66Var;
                if (RecyclerView.N0) {
                    if (view.getParent() != null) {
                    }
                    if (view.getParent() == null) {
                        yq4.t(c76VarF, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                        return null;
                    }
                }
                c76VarF.d();
                d66Var.e(c76VarF, iS);
                if (z5) {
                    arrayList3 = c76VarF.w;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    c76VarF.v &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof m66) {
                        ((m66) layoutParams).f1441o = z2;
                    }
                    Trace.endSection();
                }
                if (z4) {
                    recyclerView.detachViewFromParent(view);
                }
                nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                q66 q66VarB7 = this.g.b(c76VarF.r);
                j4 = q66VarB7.c;
                if (j4 != 0) {
                    nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                }
                q66VarB7.c = nanoTime2;
                accessibilityManager = recyclerView.N;
                if (accessibilityManager == null) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (y66Var.g) {
                    c76VarF.s = i;
                }
                z7 = z6;
            }
            z8 = z7;
        } else {
            if (c76VarF.f()) {
            }
            if (!RecyclerView.N0) {
            }
            z3 = false;
            iS = recyclerView.q.s(i, 0);
            c76VarF.E = null;
            c76VarF.D = recyclerView;
            i2 = c76VarF.r;
            nanoTime = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j5 = this.g.b(i2).c;
                if (j5 != 0) {
                    if (c76VarF.k()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    d66Var = recyclerView.y;
                    d66Var.getClass();
                    if (c76VarF.E == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        c76VarF.f498o = iS;
                        if (d66Var.b) {
                            c76VarF.q = d66Var.b(iS);
                        }
                        c76VarF.v = (c76VarF.v & (-520)) | 1;
                        if (r08.a()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(c76VarF.r)));
                        }
                    }
                    c76VarF.E = d66Var;
                    if (RecyclerView.N0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            yq4.t(c76VarF, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    c76VarF.d();
                    d66Var.e(c76VarF, iS);
                    if (z5) {
                        arrayList3 = c76VarF.w;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        c76VarF.v &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof m66) {
                            ((m66) layoutParams).f1441o = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    q66 q66VarB8 = this.g.b(c76VarF.r);
                    j4 = q66VarB8.c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    q66VarB8.c = nanoTime2;
                    accessibilityManager = recyclerView.N;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (y66Var.g) {
                        c76VarF.s = i;
                    }
                    z7 = z6;
                } else {
                    if (c76VarF.k()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    d66Var = recyclerView.y;
                    d66Var.getClass();
                    if (c76VarF.E == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        c76VarF.f498o = iS;
                        if (d66Var.b) {
                            c76VarF.q = d66Var.b(iS);
                        }
                        c76VarF.v = (c76VarF.v & (-520)) | 1;
                        if (r08.a()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(c76VarF.r)));
                        }
                    }
                    c76VarF.E = d66Var;
                    if (RecyclerView.N0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            yq4.t(c76VarF, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    c76VarF.d();
                    d66Var.e(c76VarF, iS);
                    if (z5) {
                        arrayList3 = c76VarF.w;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        c76VarF.v &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof m66) {
                            ((m66) layoutParams).f1441o = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    q66 q66VarB9 = this.g.b(c76VarF.r);
                    j4 = q66VarB9.c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    q66VarB9.c = nanoTime2;
                    accessibilityManager = recyclerView.N;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (y66Var.g) {
                        c76VarF.s = i;
                    }
                    z7 = z6;
                }
            } else {
                if (c76VarF.k()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    z4 = z2;
                } else {
                    z4 = false;
                }
                d66Var = recyclerView.y;
                d66Var.getClass();
                if (c76VarF.E == null) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                if (z5) {
                    c76VarF.f498o = iS;
                    if (d66Var.b) {
                        c76VarF.q = d66Var.b(iS);
                    }
                    c76VarF.v = (c76VarF.v & (-520)) | 1;
                    if (r08.a()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(c76VarF.r)));
                    }
                }
                c76VarF.E = d66Var;
                if (RecyclerView.N0) {
                    if (view.getParent() != null) {
                    }
                    if (view.getParent() == null) {
                        yq4.t(c76VarF, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                        return null;
                    }
                }
                c76VarF.d();
                d66Var.e(c76VarF, iS);
                if (z5) {
                    arrayList3 = c76VarF.w;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    c76VarF.v &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof m66) {
                        ((m66) layoutParams).f1441o = z2;
                    }
                    Trace.endSection();
                }
                if (z4) {
                    recyclerView.detachViewFromParent(view);
                }
                nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                q66 q66VarB10 = this.g.b(c76VarF.r);
                j4 = q66VarB10.c;
                if (j4 != 0) {
                    nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                }
                q66VarB10.c = nanoTime2;
                accessibilityManager = recyclerView.N;
                if (accessibilityManager == null) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (y66Var.g) {
                    c76VarF.s = i;
                }
                z7 = z6;
            }
            z8 = z7;
        }
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            m66Var = (m66) recyclerView.generateDefaultLayoutParams();
            view.setLayoutParams(m66Var);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            m66Var = (m66) recyclerView.generateLayoutParams(layoutParams2);
            view.setLayoutParams(m66Var);
        } else {
            m66Var = (m66) layoutParams2;
        }
        m66Var.m = c76VarF;
        if (z) {
            z9 = z3;
        } else {
            z9 = z3;
        }
        m66Var.p = z9;
        return c76VarF;
    }

    public final void l(c76 c76Var) {
        if (c76Var.A) {
            this.b.remove(c76Var);
        } else {
            this.a.remove(c76Var);
        }
        c76Var.z = null;
        c76Var.A = false;
        c76Var.v &= -33;
    }

    public final void m() {
        androidx.recyclerview.widget.a aVar = this.h.z;
        this.f = this.e + (aVar != null ? aVar.v : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            g(size);
        }
    }
}
